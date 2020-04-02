package hu.sze.jkk.vehicle.config.generator.generators;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import hu.sze.jkk.vehicle.config.vehicleconfig.VehicleconfigPackage;

public class GenerateConfigProgram {
	private final static Logger LOGGER = Logger.getLogger(GenerateConfigProgram.class.getName());

	public static void main(String[] args) {
		ResourceSet resset = new ResourceSetImpl();
		resset.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		resset.getPackageRegistry().put(VehicleconfigPackage.eNS_URI, 
				VehicleconfigPackage.eINSTANCE);
		GenerateXMLConfiguration gen_xml_config = new GenerateXMLConfiguration();
		gen_xml_config.setResourceSet(resset);
		try {
			gen_xml_config.setupDocument();
			gen_xml_config.generateFromFile(args[0]);
			gen_xml_config.writeToPrintStream(System.out);
			gen_xml_config.writeToPrintStream(new PrintStream(new File(args[1])));
		}catch (ParserConfigurationException pe) {
			LOGGER.setLevel(Level.SEVERE);
			LOGGER.severe(pe.getMessage());
		} catch (TransformerException e) {
			LOGGER.setLevel(Level.SEVERE);
			LOGGER.severe(e.getMessage());
		} catch (FileNotFoundException e) {
			LOGGER.setLevel(Level.SEVERE);
			LOGGER.severe(e.getMessage());
		}
	}

}
