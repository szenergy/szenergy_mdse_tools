package hu.sze.kinematics.description.generator.control

import robotdescriptionpackage.Robot
import robotdescriptionpackage.Transmission
import robotdescriptionpackage.EnumHardwareInterfaces
import java.util.List

class GenerateControlConfig {
	def static templateConfig(Robot r, List<Transmission> trs)'''
		«r.name»:
		  # Publish all joint states -----------------------------------
		  joint_state_controller:
		    type: joint_state_controller/JointStateController
		    publish_rate: 50  
		
		  «FOR Transmission t: trs»
		  	«IF t.hardwareinterface.hardwareInterface.equals(EnumHardwareInterfaces::POSITION_CONTROLLER)»
		  		«t.name»_position_controller:
		  		  type: effort_controllers/JointPositionController
		  		  joint: «t.hardwareinterface.joint.name»
		  		  pid: {p: «t.pidparameters.p», i: «t.pidparameters.i», d: «t.pidparameters.d»}
		  	«ENDIF»
		  «ENDFOR»
	'''
}
