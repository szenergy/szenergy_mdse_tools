package hu.sze.jkk.vehicle.config.generator.batch.transformation

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements
import org.eclipse.emf.ecore.resource.Resource
import hu.sze.jkk.vehicle.dse.validation.SelectAllValidSensors
import hu.sze.jkk.robot.launch.model.launchmodel.Launch
import hu.sze.jkk.robot.launch.model.launchmodel.LaunchmodelFactory
import hu.sze.jkk.robot.launch.model.launchmodel.StaticTransform
import org.eclipse.xtend.lib.annotations.Accessors
import hu.sze.jkk.vehicle.config.vehicleconfig.Vehicle
import java.util.List
import robotdescriptionpackage.Link
import robotdescriptionpackage.RobotdescriptionpackageFactory
import hu.sze.jkk.vehicle.control.transformation.vehicle.VehicleModelTransformation
import java.io.PrintWriter
import hu.sze.jkk.robot.launch.model.launchmodel.Node
import hu.sze.jkk.vehicle.config.generator.generators.GenerateRosTfLaunch
import java.io.File
import java.io.FileNotFoundException
import static org.junit.jupiter.api.Assertions.fail

class SensorToStaticTransformation {

    /* Transformation-related extensions */
    extension BatchTransformation transformation
    extension BatchTransformationStatements statements
    /* List nodes */
    
    
    /* Transformation rule-related extensions */
    extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory
    extension IModelManipulations manipulation

    protected ViatraQueryEngine engine
    //protected Resource resource
    protected BatchTransformationRule sensorStaticRuleLaunch
    
    
    //protected BatchTransformationRule<?,?> exampleRule
    @Accessors(PUBLIC_GETTER) val Launch launch 

    new(Resource resource) {
        //this.resource = resource
        // Create EMF scope and EMF IncQuery engine based on the resource
        val scope = new EMFScope(resource)
        engine = ViatraQueryEngine.on(scope);
        
        createTransformation
        launch = LaunchmodelFactory.eINSTANCE.createLaunch
    }
    
    new(Vehicle vehicle) {
        //this.resource = resource
        // Create EMF scope and EMF IncQuery engine based on the resource
        val scope = new EMFScope(vehicle)
        engine = ViatraQueryEngine.on(scope);
        
        createTransformation
        launch = LaunchmodelFactory.eINSTANCE.createLaunch
    }

    public def execute() {
    	println('''Executing sensor to static transformation''')
    	sensorRuleLaunch.fireAllCurrent
    }
    
    

    private def createTransformation() {
        //Create VIATRA model manipulations
        this.manipulation = new SimpleModelManipulations(engine)
        //Create VIATRA Batch transformation
        transformation = BatchTransformation.forEngine(engine)
        .build
        //Initialize batch transformation statements
        statements = transformation.transformationStatements
    }
    
//  private def getExampleRule() {
//      if(exampleRule == null){
//          exampleRule = createRule.name("ExampleRule").precondition(ExampleMatcher.querySpecification).action [
//              Do Rule Actions here
//          ].build
//      }
//      return exampleRule
//  }

    private def getSensorRuleLaunch(){
    	if (sensorStaticRuleLaunch === null){
    		sensorStaticRuleLaunch = createRule(SelectAllValidSensors.instance).action[
    			val StaticTransform static_tf_node = LaunchmodelFactory.eINSTANCE.createStaticTransform
    			static_tf_node.name = it.s.name+"_tf_publisher"
    			static_tf_node.type = "static_transform_publisher"
    			static_tf_node.vec3 = LaunchmodelFactory.eINSTANCE.createVec3
    			static_tf_node.rpy = LaunchmodelFactory.eINSTANCE.createVec3
    			// Set position
    			static_tf_node.vec3.x = it.s.displacement.x
    			static_tf_node.vec3.y = it.s.displacement.y
    			static_tf_node.vec3.z = it.s.displacement.z    			
    			// TODO: Set orientation
    			if (it.s.rotation!==null)
    			{
    				// CONVENTION WARNING: rotation is described in degrees in the description file, convert to radians!
    				static_tf_node.rpy.x = it.s.rotation.roll*Math.PI/180.0
    				static_tf_node.rpy.y = it.s.rotation.pitch*Math.PI/180.0
    				static_tf_node.rpy.z = it.s.rotation.yaw*Math.PI/180.0
    			}
    			// Set TF from and to links
    			static_tf_node.link_from = "/base_link"
    			static_tf_node.link_to = "/"+it.s.name
    			// Wrap up
    			launch.node.add(static_tf_node)
    		].build
    	}
    	return sensorStaticRuleLaunch
    } 
    
    
    
    public static def createTfTable(SensorToStaticTransformation sensor_static_transform, Vehicle vehicle, String path){
    	
		sensor_static_transform.execute();
		
		val File file = new File(path);		
		try (val PrintWriter pw = new PrintWriter(file)){
			pw.println("parent;child;x;y;z;roll;pitch;yaw");
			for (Node n: sensor_static_transform.getLaunch().getNode())
			{
				if (n instanceof StaticTransform)
				{
					val StaticTransform sn = n as StaticTransform;
					pw.println(
						'''«sn.getLink_from()»;«sn.getLink_to()»;«sn.getVec3().getX()»;«
								sn.getVec3().getY()»;«sn.getVec3().getZ()»;«
								sn.getRpy().getX()»;«sn.getRpy().getY()»;«sn.getRpy().getZ()»'''
						);					
				}
								
			}
			
		}catch (FileNotFoundException fe) {
			fail("File should be created: "+fe.getMessage());
		}
    }
    
    def dispose() {
        if (transformation !== null) {
            transformation.ruleEngine.dispose
        }
        transformation = null
        return
    }
}
