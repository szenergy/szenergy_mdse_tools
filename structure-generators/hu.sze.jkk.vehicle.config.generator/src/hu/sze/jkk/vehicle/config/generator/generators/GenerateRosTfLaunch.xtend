package hu.sze.jkk.vehicle.config.generator.generators

import org.w3c.dom.Document
import javax.xml.parsers.DocumentBuilderFactory
import hu.sze.jkk.robot.launch.model.launchmodel.Launch
import hu.sze.jkk.robot.launch.model.launchmodel.Node
import hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform
import org.w3c.dom.Element
import java.io.PrintStream
import javax.xml.transform.TransformerFactory
import javax.xml.transform.Transformer
import javax.xml.transform.OutputKeys
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult
import java.io.IOException
import java.io.StringWriter

class GenerateRosTfLaunch {
	val Document document
	val Element root 
	
	new(){
		val documentBuilder = DocumentBuilderFactory.newDefaultInstance.newDocumentBuilder
		document = documentBuilder.newDocument
		root = document.createElement("launch")
		document.appendChild(root)
	}
	
	def void writeDocumentToText(PrintStream pw) {
    	val TransformerFactory transformerFactory = TransformerFactory
		            .newInstance();
	    val Transformer transformer = transformerFactory.newTransformer();
	    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
	    val DOMSource source = new DOMSource(document);
	    transformer.transform(source, new StreamResult(pw));
    }
    
    def writeDocumentToCharSequence(){
    	val TransformerFactory transformerFactory = TransformerFactory
		            .newInstance();
	    val Transformer transformer = transformerFactory.newTransformer();
	    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
	    val DOMSource source = new DOMSource(document);
	    val StringWriter writer = new StringWriter
	    transformer.transform(new DOMSource(document), new StreamResult(writer))
	    return writer    	
    }
	
	def createXMLDocument(Launch launch){
		for (Node n: launch.node){
			val Element node_element = document.createElement("node")
			node_element.setAttribute("name", n.name)
			node_element.setAttribute("type", n.type)
			node_element.setAttribute("pkg", "tf")
			if (n instanceof StaticTransform){
				node_element.setAttribute("args", '''«n.vec3.x» «n.vec3.y» «n.vec3.z» «n.rpy.x» «n.rpy.y» «n.rpy.z» «n.link_from» «n.link_to» 100''')
			}
			root.appendChild(node_element)
		}
	}
	
}