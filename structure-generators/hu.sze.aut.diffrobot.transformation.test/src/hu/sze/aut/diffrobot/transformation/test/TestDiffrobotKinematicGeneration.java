package hu.sze.aut.diffrobot.transformation.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

import hu.sze.aut.diffrobot.transformation.GenerateDiffRobotKinematic;
import hu.sze.jkk.diffrobot.model.diffrobot.Robot;

class TestDiffrobotKinematicGeneration {

	@Test
	void testDiffRobotKinematicDescription() {
		
		GenerateDiffRobotKinematic diffrobot_kinematic = new GenerateDiffRobotKinematic();
		Robot robot = GenerateDiffRobotKinematic.loadDiffRobotDescription("C:\\Users\\kyberszittya\\jkk-git\\szenergy_mdse_tools\\structure-generators\\hu.sze.aut.diffrobot.example\\src-gen\\fiekrobot.xmi");
		Document doc;
		try {
			doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			diffrobot_kinematic.generateKinematicDescription(doc, robot);
			TransformerFactory tf = TransformerFactory.newInstance();
		    Transformer transformer;
		    transformer = tf.newTransformer();
		    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
		    StringWriter writer = new StringWriter();
		    transformer.transform(new DOMSource(doc), new StreamResult(System.out));
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
