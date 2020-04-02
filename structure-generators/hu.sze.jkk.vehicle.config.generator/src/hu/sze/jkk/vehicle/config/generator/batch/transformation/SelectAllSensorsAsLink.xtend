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
import robotdescriptionpackage.Link
import org.eclipse.xtend.lib.annotations.Accessors
import robotdescriptionpackage.RobotdescriptionpackageFactory
import hu.sze.jkk.vehicle.config.vehicleconfig.Vehicle
import java.util.Map
import java.util.HashMap
import hu.sze.jkk.vehicle.dse.validation.SelectAllValidSensorPlacements
import hu.sze.jkk.vehicle.config.vehicleconfig.SensorPlacement

class SelectAllSensorsAsLink {

    /* Transformation-related extensions */
    extension BatchTransformation transformation
    extension BatchTransformationStatements statements
    
    /* Transformation rule-related extensions */
    extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory
    extension IModelManipulations manipulation

    protected ViatraQueryEngine engine
    protected Vehicle vehicle
    @Accessors(PUBLIC_GETTER) Map<Link, SensorPlacement> sensormap;
    //protected BatchTransformationRule<?,?> exampleRule
    @Accessors(PUBLIC_GETTER) Link base_link
    protected BatchTransformationRule sensorStaticRuleSelect

    new(Vehicle vehicle) {
        this.vehicle = vehicle
        // Create EMF scope and EMF IncQuery engine based on the resource
        val scope = new EMFScope(vehicle)
        engine = ViatraQueryEngine.on(scope);
        
        createTransformation
        base_link = RobotdescriptionpackageFactory.eINSTANCE.createLink
    }

    public def execute() {
    	sensorStaticSelect.fireAllCurrent
//      Fire the defined rules here
//      exampleRule.fireAllCurrent

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

	private def getSensorStaticSelect(){
    	if (sensorStaticRuleSelect === null){    		
    		sensormap = new HashMap
    		base_link.joint.clear
    		sensorStaticRuleSelect = createRule(SelectAllValidSensorPlacements.instance).action[    			
    			val j = RobotdescriptionpackageFactory.eINSTANCE.createJoint
    			val l = RobotdescriptionpackageFactory.eINSTANCE.createLink
    			sensormap.put(l, it.s)
    			l.name = it.s.name
    			j.child  = l
    			j.parent = base_link
    			j.origin = RobotdescriptionpackageFactory.eINSTANCE.createOrigin
    			j.origin.xyz = RobotdescriptionpackageFactory.eINSTANCE.createVec3
    			j.origin.xyz.x = it.s.displacement.x 
    			j.origin.xyz.y = it.s.displacement.y
    			j.origin.xyz.z = it.s.displacement.z
    			j.origin.rpy = RobotdescriptionpackageFactory.eINSTANCE.createEulerRotation 
    			if (it.s.rotation!==null)
    			{
    				// CONVENTION WARNING: rotation is described in degrees in the description file, convert to radians!
    				j.origin.rpy.roll  = it.s.rotation.roll*Math.PI/180.0
    				j.origin.rpy.pitch = it.s.rotation.pitch*Math.PI/180.0
    				j.origin.rpy.yaw   = it.s.rotation.yaw*Math.PI/180.0
    			}
    			base_link.joint.add(j)
    		].build
    	}
    	return sensorStaticRuleSelect
    }

    def dispose() {
        if (transformation !== null) {
            transformation.ruleEngine.dispose
        }
        transformation = null
        return
    }
}
