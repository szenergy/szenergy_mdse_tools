package hu.sze.aut.diffrobot.transformation.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

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
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
		
	}

}
