package hu.sze.jkk.vehicle.config.generator.batch.transformation

import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.viatra.query.runtime.emf.EMFScope
import hu.sze.jkk.vehicle.config.vehicleconfig.Vehicle
import hu.sze.jkk.vehicle.dse.validation.CanPorts
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations

class CanPortsBatch {
	extension BatchTransformation transformation
    extension BatchTransformationStatements statements
    
    /* Transformation rule-related extensions */
    extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory
    extension IModelManipulations manipulation
    
    protected ViatraQueryEngine engine
    //protected Resource resource
    protected BatchTransformationRule sensorStaticRule
    
    new(Resource resource) {
        //this.resource = resource
        // Create EMF scope and EMF IncQuery engine based on the resource
        val scope = new EMFScope(resource)
        engine = ViatraQueryEngine.on(scope);
        
        createTransformation
        
    }
    
    new(Vehicle vehicle) {
        //this.resource = resource
        // Create EMF scope and EMF IncQuery engine based on the resource
        val scope = new EMFScope(vehicle)
        engine = ViatraQueryEngine.on(scope);
        
        createTransformation
        
    }
    
    public def execute() {
    	println('''Executing CAN ports selection transformation''')
    	canPortsRule.fireAllCurrent
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
    
    private def getCanPortsRule(){
    	if (sensorStaticRule === null){
    		sensorStaticRule = createRule(CanPorts.instance).action[
    			
    		].build
    	}
    	return sensorStaticRule
    } 
    
    def dispose() {
        if (transformation !== null) {
            transformation.ruleEngine.dispose
        }
        transformation = null
        return
    }
}