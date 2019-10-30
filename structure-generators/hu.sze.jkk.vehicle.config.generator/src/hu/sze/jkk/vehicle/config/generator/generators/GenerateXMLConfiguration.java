package hu.sze.jkk.vehicle.config.generator.generators;

import java.io.File;
import java.io.PrintStream;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import hu.sze.jkk.vehicle.config.vehicleconfig.ComputationNode;
import hu.sze.jkk.vehicle.config.vehicleconfig.ImuTopic;
import hu.sze.jkk.vehicle.config.vehicleconfig.JointStateTopic;
import hu.sze.jkk.vehicle.config.vehicleconfig.KinematicParameters;
import hu.sze.jkk.vehicle.config.vehicleconfig.LaserTopic;
import hu.sze.jkk.vehicle.config.vehicleconfig.OdomTopic;
import hu.sze.jkk.vehicle.config.vehicleconfig.Odometry;
import hu.sze.jkk.vehicle.config.vehicleconfig.RosTopicConfiguration;
import hu.sze.jkk.vehicle.config.vehicleconfig.SteerTopic;
import hu.sze.jkk.vehicle.config.vehicleconfig.ThrottleTopic;
import hu.sze.jkk.vehicle.config.vehicleconfig.Vehicle;
import hu.sze.jkk.vehicle.config.vehicleconfig.VehicleControl;
import hu.sze.jkk.vehicle.config.vehicleconfig.WheelParameters;

public class GenerateXMLConfiguration {
	private ResourceSet resset;
	private Document doc ;
	
	public static Element generateTopicConfiguration(Document doc, RosTopicConfiguration topic) {
		String topic_type = "topic";
		if (topic instanceof ThrottleTopic) {
			topic_type = "throttle_topic";
		}
		else if (topic instanceof SteerTopic) {
			topic_type = "steer_topic";
		}
		else if (topic instanceof OdomTopic)
		{
			topic_type = "odom_topic";
		}
		else if (topic instanceof ImuTopic) {
			topic_type = "imu_topic";
		}
		else if (topic instanceof LaserTopic) {
			topic_type = "laser_topic";
		}
		Element topic_element = doc.createElement(topic_type);
		
		Element topicname_element = doc.createElement("topicname");
		topicname_element.appendChild(doc.createTextNode(topic.getTopicname()));
		topic_element.appendChild(topicname_element);
		Element frequency_element = doc.createElement("frequency");
		frequency_element.appendChild(doc.createTextNode(Double.toString(topic.getFrequency())));
		topic_element.appendChild(frequency_element);
		if (topic instanceof JointStateTopic) {
			JointStateTopic jt = (JointStateTopic)topic;
			for (Integer ji: jt.getJoint_id()) {
				Element joint_id = doc.createElement("jointdefinition");
				joint_id.setTextContent(Integer.toString(ji));
				topic_element.appendChild(joint_id);
			}
			
		}
		return topic_element;
	}
	
	public static Element generateWheelParameters(Document doc, WheelParameters wheel_param) {
		Element wheel_parameters = doc.createElement("wheelparameters");
		Element radius_element = doc.createElement("radius");
		wheel_parameters.appendChild(radius_element);
		radius_element.setTextContent(Double.toString(wheel_param.getWheel_radius()));
		return wheel_parameters;
	}
	
	public static Element generateKinematicConfigurationElement(Document doc, KinematicParameters kin_param) {
		Element kinematic_element = doc.createElement("kinematic");
		Element wheelbase_element = doc.createElement("wheelbase");
		wheelbase_element.appendChild(doc.createTextNode(Double.toString(kin_param.getWheelbase())));
		kinematic_element.appendChild(wheelbase_element);
		Element front_track_element = doc.createElement("front_track");
		front_track_element.appendChild(
				doc.createTextNode(Double.toString(kin_param.getFront_track())));
		kinematic_element.appendChild(front_track_element);
		Element rear_track_element = doc.createElement("rear_track");
		rear_track_element.appendChild(doc.createTextNode(Double.toString(kin_param.getRear_track())));
		kinematic_element.appendChild(rear_track_element);
		kinematic_element.appendChild(generateWheelParameters(doc, kin_param.getWheelparameters()));
		return kinematic_element;
	}
	
	public void setResourceSet(ResourceSet resset) {
		this.resset = resset;
	}
	
	public void setupDocument() throws ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory
				.newInstance();
		factory.setFeature(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, Boolean.FALSE);
		factory.setFeature(XMLInputFactory.SUPPORT_DTD, Boolean.FALSE);
		DocumentBuilder doc_builder = factory.newDocumentBuilder();
				
		doc = doc_builder.newDocument();
		
	}
	
	public void writeToPrintStream(PrintStream pw) throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory
	            .newInstance();
		transformerFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
	    Transformer transformer = transformerFactory.newTransformer();
	    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
	    DOMSource source = new DOMSource(doc);
	    transformer.transform(source, new StreamResult(pw));
	}
	
	public void generateFromVehicleElement(Vehicle vehicle) {
		KinematicParameters kin_param = vehicle.getKinematicparameters();
		
		Element vehicleelement = doc.createElement("vehicle");
		doc.appendChild(vehicleelement);
		Element vehicle_name_element = doc.createElement("name");
		vehicle_name_element.appendChild(doc.createTextNode(vehicle.getName()));
		vehicleelement.appendChild(vehicle_name_element);
		
		vehicleelement.appendChild(
				GenerateXMLConfiguration.generateKinematicConfigurationElement(doc, kin_param)
		);
		GenerateXMLConfiguration.generateComputationNodeConfiguration(
				doc, vehicle, vehicleelement);
	}
	
	public void generateFromFile(String path) {
		File file = new File(path);
		URI uri = URI.createFileURI(file.getAbsolutePath());
		Resource resource = resset.getResource(uri, true);
		Vehicle vehicle = (Vehicle)(resource.getContents().get(0));
		generateFromVehicleElement(vehicle);
		
		
		
	}
	
	public static void generateComputationNodeConfiguration(Document doc, 
			Vehicle vehicle, Element vehicleelement) {
		Element roselement = doc.createElement("ros");
		
		for (ComputationNode cn: vehicle.getNodeconfiguration().getComputationnode()) {
			
			if (cn instanceof VehicleControl) {
				Element vehicle_element = doc.createElement("vehicle");
				vehicle_element.appendChild(
					GenerateXMLConfiguration.generateTopicConfiguration(
						doc,
						((VehicleControl) cn).getSteertopic()
					)
				);
				roselement.appendChild(vehicle_element);
			}
		}
		vehicleelement.appendChild(roselement);
	}
}
