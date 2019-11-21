package hu.sze.kinematics.description.generator

import robotdescriptionpackage.EulerRotation
import robotdescriptionpackage.Origin
import org.w3c.dom.Document
import robotdescriptionpackage.Joint
import robotdescriptionpackage.Laser
import robotdescriptionpackage.Box
import robotdescriptionpackage.Vec3
import robotdescriptionpackage.Geometry
import robotdescriptionpackage.Link
import robotdescriptionpackage.Robot
import robotdescriptionpackage.Visual
import org.eclipse.emf.ecore.resource.Resource
import robotdescriptionpackage.Sensor
import robotdescriptionpackage.Color
import robotdescriptionpackage.Transmission
import org.w3c.dom.Attr
import robotdescriptionpackage.Collision
import robotdescriptionpackage.Material
import org.w3c.dom.Element
import robotdescriptionpackage.Cylinder
import robotdescriptionpackage.FloatParameter
import robotdescriptionpackage.FloatParameterField
import robotdescriptionpackage.TemplateInstantiation
import robotdescriptionpackage.Scale
import robotdescriptionpackage.SphericalJoint
import robotdescriptionpackage.RobotdescriptionpackageFactory
import org.eclipse.emf.ecore.util.EcoreUtil
import robotdescriptionpackage.JOINT_TYPE
import robotdescriptionpackage.Sphere
import robotdescriptionpackage.Mesh
import robotdescriptionpackage.Inertial
import robotdescriptionpackage.IMU
import java.util.ArrayList
import java.util.Map
import java.util.HashMap
import hu.sze.kinematics.description.generator.control.GenerateControlConfig
import java.util.List
import java.util.LinkedList
import hu.sze.kinematics.description.generator.control.GenerateRosControlGazebo
import hu.sze.kinematics.description.generator.common.InertiaCalculations
import robotdescriptionpackage.Inertia
import robotdescriptionpackage.Plugin
import robotdescriptionpackage.Lidar
import robotdescriptionpackage.GNSS
import robotdescriptionpackage.Camera

class InvalidJointElement extends Exception{
	new(String message){
		super(message);
	}
}

class GenerateUrdf {
	val Element kinematic_tree;
	val Map<Joint, ArrayList<Joint>> jointsetup;
	val List<Transmission> mapped_transmission;
	new(Document doc)
	{
		kinematic_tree = doc.createElement("robot");
		jointsetup = new HashMap();
		mapped_transmission = new LinkedList();
	}
	
	def List<Transmission> getTransmissions(){
		return mapped_transmission;
	}
	
	
	def static Element generateBoxInertia(Document doc, Box box, double mass) {
		var double width;
		var double depth;
		var double height;
		
		if (box.parameter_depth!==null){
			depth = evalFloatParameterField(box.parameter_depth)
		}else{
			depth = box.depth;
		}
		if (box.parameter_width!==null){
			width = evalFloatParameterField(box.parameter_width);
		}else{
			width = box.width;
		}
		if (box.parameter_height!==null){
			height = evalFloatParameterField(box.parameter_height);
		}else{
			height = box.height;
		}
		
		val Inertia inertia = InertiaCalculations.boxInertia(width, depth, height, mass)
		val Element inertialElement = doc.createElement("inertial");
		val Element massElement = doc.createElement("mass");
		massElement.setAttribute("value", Double.toString(mass));
		
		val Element inertiaElement = doc.createElement("inertia");
		inertiaElement.setAttribute("ixx", Double.toString(inertia.ixx));
		inertiaElement.setAttribute("iyy", Double.toString(inertia.iyy));
		inertiaElement.setAttribute("izz", Double.toString(inertia.izz));
		inertiaElement.setAttribute("ixz", Float.toString(0.0f));
		inertiaElement.setAttribute("ixy", Float.toString(0.0f));
		inertiaElement.setAttribute("iyz", Float.toString(0.0f));
		
		inertialElement.appendChild(massElement);
		inertialElement.appendChild(inertiaElement);
		
		return inertialElement;
	}
	
	def Element generateTransmissionElement(Document doc, Transmission tr) {
		return generateTransmissionElement(doc, tr, "")
	}
	
	def Element generateTransmissionElement(Document doc, Transmission tr, String prefix) {
		val Element transmission_element = doc.createElement("transmission");
		//transmission_element.setAttribute("name", prefix+tr.getName());
		transmission_element.setAttribute("name", tr.getName());
		val Element tr_type = doc.createElement("type");
		tr_type.appendChild(doc.createTextNode(tr.getType()));
		transmission_element.appendChild(tr_type);
		val Element joint_element = doc.createElement("joint");
		
		joint_element.setAttribute("name", prefix+tr.getHardwareinterface().getJoint().getName());
		val Element hw_interface_type = doc.createElement("hardwareInterface");
		switch (tr.getHardwareinterface().getHardwareInterface()) {
			case VELOCITY_CONTROLLER:
				hw_interface_type.appendChild(doc.createTextNode("hardware_interface/VelocityJointInterface"))
			case POSITION_CONTROLLER:
				hw_interface_type.appendChild(doc.createTextNode("hardware_interface/EffortJointInterface"))
		}
		joint_element.appendChild(hw_interface_type);
		val Element actuatorElement = doc.createElement("actuator");
		actuatorElement.setAttribute("name", prefix+tr.getActuator().getName());
		val Element mechanicalReductionElement = doc.createElement("mechanicalReduction");
		mechanicalReductionElement.appendChild(doc.createTextNode(Float.toString(tr.getActuator().getMechanicalreduction())));
		actuatorElement.appendChild(mechanicalReductionElement);
		
		transmission_element.appendChild(joint_element);
		transmission_element.appendChild(actuatorElement);
		mapped_transmission.add(tr);
		return transmission_element;
	}
	
	def static double evalFloatParameterField(FloatParameterField field){
		return field.gain*(field.parameter as FloatParameter).value / field.divider+(field.offset);
	}
	
	def static Element generateNullInertia(Document doc) {
		
		val Element inertialElement = doc.createElement("inertial");
		val Element massElement = doc.createElement("mass");
		massElement.setAttribute("value", Double.toString(0.0));
		
		val Element inertiaElement = doc.createElement("inertia");
		inertiaElement.setAttribute("ixx", Double.toString(0.0));
		inertiaElement.setAttribute("iyy", Double.toString(0.0));
		inertiaElement.setAttribute("izz", Double.toString(0.0));
		inertiaElement.setAttribute("ixz", Double.toString(0.0));
		inertiaElement.setAttribute("ixy", Double.toString(0.0));
		inertiaElement.setAttribute("iyz", Double.toString(0.0));
		
		inertialElement.appendChild(massElement);
		inertialElement.appendChild(inertiaElement);
		
		return inertialElement;
	}
	
	def static Element generateCylinderInertia(Document doc, Cylinder cyl, double mass) {
		var double radius;
		var double length;
		
		if (cyl.parameter_radius!==null){
			radius = evalFloatParameterField(cyl.parameter_radius);
		}else{
			radius = cyl.radius;
		}
		if (cyl.parameter_length!==null){
			length = evalFloatParameterField(cyl.parameter_length);
		}else{
			length = cyl.length;
		}
		val Element inertiaElement = doc.createElement("inertia");
		val Element inertialElement = doc.createElement("inertial");
		val Element massElement = doc.createElement("mass");
		massElement.setAttribute("value", Double.toString(mass));
		val inertia = InertiaCalculations.cylinderInertia(radius, length, mass)	
		inertiaElement.setAttribute("ixx", Double.toString(inertia.ixx));
		inertiaElement.setAttribute("iyy", Double.toString(inertia.iyy));
		inertiaElement.setAttribute("izz", Double.toString(inertia.izz));
		inertiaElement.setAttribute("ixz", Double.toString(0.0));
		inertiaElement.setAttribute("ixy", Double.toString(0.0));
		inertiaElement.setAttribute("iyz", Double.toString(0.0));
		
		inertialElement.appendChild(massElement);
		inertialElement.appendChild(inertiaElement);
		
		return inertialElement;
	}
	
	
	def static Element generateSphereInertia(Document doc, Sphere sp, double mass) {
		val double radius = sp.radius
		
		val double i = 0.4f*mass*radius;
		
		
		val Element inertialElement = doc.createElement("inertial");
		val Element massElement = doc.createElement("mass");
		massElement.setAttribute("value", Double.toString(mass));
		
		val Element inertiaElement = doc.createElement("inertia");
		inertiaElement.setAttribute("ixx", Double.toString(i));
		inertiaElement.setAttribute("iyy", Double.toString(i));
		inertiaElement.setAttribute("izz", Double.toString(i));
		inertiaElement.setAttribute("ixz", Double.toString(0.0));
		inertiaElement.setAttribute("ixy", Double.toString(0.0));
		inertiaElement.setAttribute("iyz", Double.toString(0.0));
		
		inertialElement.appendChild(massElement);
		inertialElement.appendChild(inertiaElement);
		
		return inertialElement;
	}
	
	
	def static Element generateCubeElement(Document doc, Box box) {
		val Element geom_element = doc.createElement("geometry");
		val Element box_element = doc.createElement("box");
		val Attr size_attr = doc.createAttribute("size");
		
		var double width;
		var double depth;
		var double height;
		
		if (box.parameter_depth!==null){
			depth = evalFloatParameterField(box.parameter_depth)
		}else{
			depth = box.depth;
		}
		if (box.parameter_width!==null){
			width = evalFloatParameterField(box.parameter_width);
		}else{
			width = box.width;
		}
		if (box.parameter_height!==null){
			height = evalFloatParameterField(box.parameter_height);
		}else{
			height = box.height;
		}
		
		size_attr.setValue(width+" "+depth+" "+height);
		box_element.setAttributeNode(size_attr);
		geom_element.appendChild(box_element);		
		return geom_element;
	}
	
	def static Element generateOriginElement(Document doc, Origin orig) {
		val Element orig_element = doc.createElement("origin");
		val Attr xyz_attr = doc.createAttribute("xyz");
		
		var double x = 0.0f;
		var double y = 0.0f;
		var double z = 0.0f;
		
		if (orig !== null){
			val Vec3 v = orig.getXyz();
			if (v.parameter_x!==null){
				x = evalFloatParameterField(v.parameter_x);
			} else{
				x = v.x;
			}
			if (v.parameter_y!==null){
				y = evalFloatParameterField(v.parameter_y);
			} else{
				y = v.y;
			}		
			if (v.parameter_z!==null){
				z = evalFloatParameterField(v.parameter_z);
			} else{
				z = v.z;
			}
			if (orig.getRpy()!==null) {
				val EulerRotation rpy = orig.getRpy();
				
				var double roll;
				var double pitch;
				var double yaw;
				if (rpy.parameter_roll!==null){
					roll = evalFloatParameterField(rpy.parameter_roll);
				} else{
					roll = rpy.roll;
				}
				if (rpy.parameter_pitch!==null){
					pitch = evalFloatParameterField(rpy.parameter_pitch);
				} else{
					pitch = rpy.pitch;
				}
				
				if (rpy.parameter_yaw!==null){
					yaw = evalFloatParameterField(rpy.parameter_yaw);
				} else{
					yaw = rpy.yaw;
				}
				
				val Attr rpy_attr = doc.createAttribute("rpy");
				yaw = yaw*(Math.PI/180.0)as float;
				pitch = pitch*(Math.PI/180.0) as float;
				roll = roll*(Math.PI/180.0) as float;
				rpy_attr.setValue(roll+" "+pitch+" "+yaw);
				orig_element.setAttributeNode(rpy_attr);
			}
		}
		xyz_attr.setValue(x+" "+y+" "+z);
		orig_element.setAttributeNode(xyz_attr);
		
		return orig_element;
		
	}
	
	private def static Element generateCylinderElement(Document doc, Cylinder g) {
		val Element geom_element = doc.createElement("geometry");
		val Element cylinder_element = doc.createElement("cylinder");
		val Attr length_attr = doc.createAttribute("length");
		
		var double length;
		var double radius;
		if (g.parameter_length!==null){
			length = evalFloatParameterField(g.parameter_length)
		}else{
			length = g.length;
		}
		if (g.parameter_radius!==null){
			radius = evalFloatParameterField(g.parameter_radius)
		}else{
			radius = g.radius;
		}
		length_attr.setValue(Float.toString(length as float));
		val Attr radius_attr = doc.createAttribute("radius");
		radius_attr.setValue(Float.toString(radius as float));
		
		cylinder_element.setAttributeNode(radius_attr);
		cylinder_element.setAttributeNode(length_attr);
		geom_element.appendChild(cylinder_element);
		return geom_element;
	}
	
	private def static Element generateSphereElement(Document doc, Sphere g) {
		val Element geom_element = doc.createElement("geometry");
		val Element sphere_element = doc.createElement("sphere");
		val Attr radius_attr = doc.createAttribute("radius");
		
		var float radius = g.radius;
		
		radius_attr.setValue(Float.toString(radius as float));
		
		sphere_element.setAttributeNode(radius_attr);
		geom_element.appendChild(sphere_element);
		return geom_element;
	}
	
	private def static Element generateMeshElement(Document doc, Mesh m) {
		val Element geom_element = doc.createElement("geometry");
		val Element mesh_element = doc.createElement("mesh");
		val Attr filename_attr = doc.createAttribute("filename");
		val Attr scale_attr = doc.createAttribute("scale");
				
		filename_attr.setValue(m.filename);
		scale_attr.setValue('''«m.sclae» «m.sclae» «m.sclae»''');
		mesh_element.setAttributeNode(filename_attr);
		mesh_element.setAttributeNode(scale_attr);
		geom_element.appendChild(mesh_element);
		
		return geom_element;
	}
	
	
	
	def static Element generateMaterialElement(Document doc, Material m) {
		val Element material_element = doc.createElement("material");
		val Attr name_attr = doc.createAttribute("name");
		name_attr.setValue(m.getName());
		material_element.setAttributeNode(name_attr);
		if (m.getColor()!==null) {
			val Element color_element = doc.createElement("color");
			val Attr rgba_attr = doc.createAttribute("rgba");
			val Color c = m.getColor();
			rgba_attr.setValue(c.getRed()+" "+c.getGreen()+" "+c.getBlue()+" "+c.getAlpha());
			color_element.setAttributeNode(rgba_attr);
			material_element.appendChild(color_element);
		}
		return material_element;
	}
	
	def static Element generateGeometryElement(Document doc, Geometry g) {
		if (g instanceof Box) {
			return generateCubeElement(doc, g as Box);
		}
		if (g instanceof Cylinder) {
			return generateCylinderElement(doc, g as Cylinder);
		}
		if (g instanceof Sphere){
			return generateSphereElement(doc, g as Sphere);
		}
		if (g instanceof Mesh){
			return generateMeshElement(doc, g as Mesh);
		}
		
		return null;
	}
	
	def static Element generateAxisElement(Document doc, Vec3 axis) {
		val Element axis_element = doc.createElement("axis");
		val Attr xyz_attr = doc.createAttribute("xyz");
		
		var double x;
		var double y;
		var double z;
		if (axis.parameter_x!==null){
			x = evalFloatParameterField(axis.parameter_x);
		} else{
			x = axis.x;
		}
		if (axis.parameter_y!==null){
			y = evalFloatParameterField(axis.parameter_y);
		} else{
			y = axis.y;
		}		
		
		if (axis.parameter_z!==null){
			z = evalFloatParameterField(axis.parameter_z);
		} else{
			z = axis.z;
		}
		xyz_attr.setValue(x+" "+y+" "+z);
		axis_element.setAttributeNode(xyz_attr);
		
		return axis_element;
	}

	
	
	def Element generateJointElement(Document doc, Joint j) {
		return generateJointElement(doc, j, "", null);		
	}
	
	def Element generateLimitElement(Document doc, Joint j) {
		val Element limit_element = doc.createElement("limit")
		val Attr limit_max_attr = doc.createAttribute("upper");
		val Attr limit_min_attr = doc.createAttribute("lower");
		
		
		limit_max_attr.value = Double.toString(j.axis.limit.limit_max);
		limit_min_attr.value = Double.toString(j.axis.limit.limit_min);
		val Attr limit_effort_attr = doc.createAttribute("effort");
		limit_effort_attr.value = Float.toString(j.axis.limit.effort);
		val Attr limit_velocity_attr = doc.createAttribute("velocity");
		limit_velocity_attr.value = Float.toString(j.axis.limit.velocity);
						
		limit_element.setAttributeNode(limit_max_attr);
		limit_element.setAttributeNode(limit_min_attr);
		limit_element.setAttributeNode(limit_velocity_attr);
		limit_element.setAttributeNode(limit_effort_attr);
		return limit_element;
	}
	
	def Element generateSphericalJoint(){
		
	}
	
	def Element generateJointElement(Document doc, Joint j, String prefix, Scale sc){
				
		val Element joint_elemnt = doc.createElement("joint");
		
		val Attr name_attr_joint = doc.createAttribute("name");
		name_attr_joint.setValue(prefix+j.getName());
		joint_elemnt.setAttributeNode(name_attr_joint);
		val Attr type_attr_joint = doc.createAttribute("type");
		type_attr_joint.setValue(j.getType().getLiteral().toLowerCase());
		joint_elemnt.setAttributeNode(type_attr_joint);
		
		// Set relations
		val Element parent_link_element = doc.createElement("parent");
		val Attr link_parent_name_attr = doc.createAttribute("link");
		link_parent_name_attr.setValue(prefix + j.getParent().getName());
		parent_link_element.setAttributeNode(link_parent_name_attr);
		val Element child_link_element = doc.createElement("child");
		val Attr link_child_name_attr = doc.createAttribute("link");
		// Template scaling
		var float sx = 1.0f
		var float sy = 1.0f
		var float sz = 1.0f
		if (j.child!==null){
		 
			if (j.getChild() instanceof TemplateInstantiation){
				
				val child_name = j.getChild().getName() + "_" + (j.child as TemplateInstantiation).template.link.get(0).name;
				link_child_name_attr.setValue(prefix + child_name);
				generateTemplate(doc, j, prefix)
			}
			else{			
				link_child_name_attr.setValue(prefix + j.getChild().getName());
			}
			child_link_element.setAttributeNode(link_child_name_attr);
			joint_elemnt.appendChild(parent_link_element);
			joint_elemnt.appendChild(child_link_element);
			
			joint_elemnt.appendChild(generateAxisElement(doc, j.axis));
			if (j.getOrigin()!==null) {
				joint_elemnt.appendChild(generateOriginElement(doc, j.getOrigin()));
			}
			if (!(j instanceof SphericalJoint))		
			{
				if (j.axis.limit!==null){
					joint_elemnt.appendChild(generateLimitElement(doc, j));
				}	
			}
		
		}else{
			throw new InvalidJointElement('''Child element is not set: «j.name»''')
		}
		return joint_elemnt;
	}
	
	def Element generateInertia(Document doc, Inertial inertia, double mass){
		val Element inertialElement = doc.createElement("inertial");
		val Element massElement = doc.createElement("mass");
		massElement.setAttribute("value", Double.toString(mass));
		
		val Element inertiaElement = doc.createElement("inertia");
		inertiaElement.setAttribute("ixx", Double.toString(inertia.inertia.ixx));
		inertiaElement.setAttribute("iyy", Double.toString(inertia.inertia.iyy));
		inertiaElement.setAttribute("izz", Double.toString(inertia.inertia.izz));
		inertiaElement.setAttribute("ixz", Double.toString(inertia.inertia.ixz));
		inertiaElement.setAttribute("ixy", Double.toString(inertia.inertia.ixy));
		inertiaElement.setAttribute("iyz", Double.toString(inertia.inertia.iyz));
		// Generate inertia origin if exists
		if (inertia.origin !== null)
		{
			System.out.println('''Link has origin, generating''')
			val Element inertiaOriginElement = doc.createElement("origin");
			inertiaOriginElement.setAttribute("xyz", '''«inertia.origin.xyz.x» «inertia.origin.xyz.y» «inertia.origin.xyz.z»''')
			inertiaOriginElement.setAttribute("rpy", '''«inertia.origin.rpy.roll» «inertia.origin.rpy.pitch» «inertia.origin.rpy.yaw»''')
			inertialElement.appendChild(inertiaOriginElement)
		}
		inertialElement.appendChild(inertiaElement);
		inertialElement.appendChild(massElement);
		return inertialElement;
	}
	
	def Element generateInertia(Document doc, Visual v, double mass){
		if (v.getGeometry() instanceof Box) {
			return generateBoxInertia(doc, (v.getGeometry()) as Box, mass);
		}
		else if (v.getGeometry() instanceof Cylinder) {
			return generateCylinderInertia(doc, v.getGeometry() as Cylinder, mass);
		}
		else if (v.geometry instanceof Sphere) {
			return generateSphereInertia(doc, v.geometry as Sphere, mass);
		}
	}
	
	def Element generateLink(Document doc, Link l){
		return generateLink(doc, l, "")	
	}
	
	def generateCollisionElement(Document doc, Element link_elemnt, Link l, Collision c){
		if (c!==null) {
			val Element collision_elemnt = doc.createElement("collision");
			if (c.geometry!==null){
				if (c.parent_visual!==null){
					collision_elemnt.appendChild(generateOriginElement(doc, c.parent_visual.origin));					
				}
				collision_elemnt.appendChild(generateGeometryElement(doc, c.getGeometry()));				
				if (c.origin!==null)
				{
					collision_elemnt.appendChild(generateOriginElement(doc, c.origin));
				}
			}
			else if (c.getParent_visual()!==null) {
				collision_elemnt.appendChild(generateOriginElement(doc, c.parent_visual.origin));
				collision_elemnt.appendChild(generateGeometryElement(doc, c.getParent_visual().getGeometry()));
			}
			if (l.getInertial!==null){
				link_elemnt.appendChild(generateInertia(doc, l.inertial, l.mass))
			}
			else if (l.getInertial()===null && c.parent_visual!==null) {
				link_elemnt.appendChild(generateInertia(doc, c.parent_visual, l.mass))
			}
			link_elemnt.appendChild(collision_elemnt);
		}else{
			val Element inertial_element = doc.createElement("inertial");
			val Element massElement = doc.createElement("mass");
			massElement.setAttribute("value", Double.toString(l.mass));
			
			val Element inertiaElement = doc.createElement("inertia");
			inertiaElement.setAttribute("ixx", Double.toString(l.inertial.inertia.ixx));
			inertiaElement.setAttribute("iyy", Double.toString(l.inertial.inertia.iyy));
			inertiaElement.setAttribute("izz", Double.toString(l.inertial.inertia.izz));
			inertiaElement.setAttribute("ixz", Float.toString(0.0f));
			inertiaElement.setAttribute("ixy", Float.toString(0.0f));
			inertiaElement.setAttribute("iyz", Float.toString(0.0f));
			// Set origin if it is explicitly defined
			
			
			inertial_element.appendChild(massElement);
			inertial_element.appendChild(inertiaElement);
				link_elemnt.appendChild(inertial_element)
		}
		
	}
	
	
	def Element generateLink(Document doc, Link l, String prefix){
		val Element link_elemnt = doc.createElement("link");
		val Attr name_attr_link = doc.createAttribute("name");
		name_attr_link.setValue(prefix+l.getName());
		link_elemnt.setAttributeNode(name_attr_link);
		/// Check if link has an explicitly set inertial element
		 
		/// Generate visual description for all elements
		for(Visual v: l.getVisual()){
			if (v!==null) {			
				if (v.getGeometry()!==null) {
					val Element visual_elemnt = doc.createElement("visual");
					visual_elemnt.appendChild(generateOriginElement(doc, v.origin));
					if (l.material!==null)
					{					
						visual_elemnt.appendChild(generateMaterialElement(doc, l.getMaterial()));				
					}
					visual_elemnt.appendChild(generateGeometryElement(doc, v.getGeometry()));
					link_elemnt.appendChild(visual_elemnt);
				}
			}
		}
		for (Collision c: l.getCollision()){		
			generateCollisionElement(doc, link_elemnt, l, c)
			
		}
		if (l.mass==0.0){
			link_elemnt.appendChild(generateNullInertia(doc));
		}
		return link_elemnt;
	}
	
	def generateTemplate(Document doc, Joint tj){
		generateTemplate(doc, tj, "");
	}
	
	def generateTemplate(Document doc, Joint tj, String prefix){
		val TemplateInstantiation temp_inst = (tj.child as TemplateInstantiation);
		for (Link l: temp_inst.template.link)
		{
			kinematic_tree.appendChild(generateLink(doc, l, temp_inst.name + "_"))
			
		}
		for (Joint j: temp_inst.template.joint)
		{
			if (j instanceof SphericalJoint)
			{
				// Ordering of planes: coronal->sagital->axial
				// Coronal plane (width: 0)
				val inertia = RobotdescriptionpackageFactory.eINSTANCE.createInertial
				inertia.mass = 1f
				inertia.inertia = RobotdescriptionpackageFactory.eINSTANCE.createInertia
				inertia.inertia.ixx = 1.0f
				inertia.inertia.iyy = 1.0f
				inertia.inertia.izz = 1.0f
				val Link l_coronal = RobotdescriptionpackageFactory.eINSTANCE.createLink;
				l_coronal.inertial = EcoreUtil.copy(inertia)  
				l_coronal.mass = 1f
				l_coronal.name = j.parent.name+"_coronal"
				// Coronal axis joint
				val Joint j_coronal = RobotdescriptionpackageFactory.eINSTANCE.createJoint;
				j_coronal.name = j.name+"_coronal"
				j_coronal.parent = j.parent
				j_coronal.child = l_coronal
				j_coronal.type = JOINT_TYPE.REVOLUTE
				j_coronal.axis = EcoreUtil.copy(j.axis)
				// Sagital plane (width: 0)
				val Link l_sagital = RobotdescriptionpackageFactory.eINSTANCE.createLink;
				l_sagital.inertial = EcoreUtil.copy(inertia)
				l_sagital.mass = 1f
				l_sagital.name = j.parent.name+"_sagital"
				// Sagital axis joint
				val Joint j_sagital = RobotdescriptionpackageFactory.eINSTANCE.createJoint;
				j_sagital.name = j.name+"_sagital"
				j_sagital.parent = l_coronal
				j_sagital.child = l_sagital
				j_sagital.type = JOINT_TYPE.REVOLUTE
				j_sagital.axis = EcoreUtil.copy(j.axis2)
				// Axial plane (width)
				// Axial axis joint
				val Joint j_axial = RobotdescriptionpackageFactory.eINSTANCE.createJoint;
				j_axial.name = j.name+"_axial"
				j_axial.parent = l_sagital				
				j_axial.child = j.child
				j_axial.origin = j.origin
				j_axial.type = JOINT_TYPE.REVOLUTE
				j_axial.axis = EcoreUtil.copy(j.axis3)
				// Append new links to kinematic tree
				kinematic_tree.appendChild(generateLink(doc, l_coronal, temp_inst.name + "_"))
				kinematic_tree.appendChild(generateLink(doc, l_sagital, temp_inst.name + "_"))
				// Copy joints
				val Joint j_coronal_copy = EcoreUtil.copy(j_coronal)
				j_coronal_copy.name = temp_inst.name + "_" + j_coronal.name
				val Joint j_sagital_copy = EcoreUtil.copy(j_sagital)
				j_sagital_copy.name = temp_inst.name + "_" + j_sagital.name
				val Joint j_axial_copy = EcoreUtil.copy(j_axial)
				j_axial_copy.name = temp_inst.name + "_" + j_axial.name
				// Append joints to kinematic tree
				kinematic_tree.appendChild(generateJointElement(doc, j_coronal, temp_inst.name + "_", temp_inst.scale))
				kinematic_tree.appendChild(generateJointElement(doc, j_sagital, temp_inst.name + "_", temp_inst.scale))
				kinematic_tree.appendChild(generateJointElement(doc, j_axial, temp_inst.name + "_", temp_inst.scale))
				if (jointsetup.containsKey(j)){
					jointsetup.remove(j)
				}
				jointsetup.put(j, new ArrayList);
				
				jointsetup.get(j).add(j_coronal_copy)
				jointsetup.get(j).add(j_sagital_copy)
				jointsetup.get(j).add(j_axial_copy)
			}
			else
			{
				kinematic_tree.appendChild(generateJointElement(doc, j, temp_inst.name + "_", temp_inst.scale))
				
				
			}
		}
		for (Transmission t: temp_inst.template.transmission)
		{
			if (t.hardwareinterface.joint instanceof SphericalJoint){
				val Transmission tr_coronal = EcoreUtil.copy(t)
				tr_coronal.name = temp_inst.name+"_"+tr_coronal.name+"_coronal"
				tr_coronal.hardwareinterface.joint = jointsetup.get(t.hardwareinterface.joint).get(0)
				kinematic_tree.appendChild(generateTransmissionElement(doc, tr_coronal, ""))
				val Transmission tr_sagital = EcoreUtil.copy(t)
				tr_sagital.name = temp_inst.name+"_"+tr_sagital.name+"_sagital"
				tr_sagital.hardwareinterface.joint = jointsetup.get(t.hardwareinterface.joint).get(1)
				kinematic_tree.appendChild(generateTransmissionElement(doc, tr_sagital, ""))
				val Transmission tr_axial = EcoreUtil.copy(t)
				tr_axial.name = temp_inst.name+"_"+tr_axial.name+"_axial"
				tr_axial.hardwareinterface.joint = jointsetup.get(t.hardwareinterface.joint).get(2)
				kinematic_tree.appendChild(generateTransmissionElement(doc, tr_axial, ""))
			}
			else{
				val Transmission tr = EcoreUtil.copy(t)
				tr.name = temp_inst.name+"_"+tr.name
				val Joint j_copy = EcoreUtil.copy(tr.hardwareinterface.joint)
				j_copy.name = temp_inst.name + "_" + j_copy.name
				tr.hardwareinterface.joint = j_copy
				//kinematic_tree.appendChild(generateTransmissionElement(doc, tr, temp_inst.name + "_"))
				kinematic_tree.appendChild(generateTransmissionElement(doc, tr, ""))
			}
			
		}
	}
	
	def void generateURDF(Document doc, Robot r) {
		val Attr name_attr = doc.createAttribute("name");
		name_attr.setValue(r.getName());
		kinematic_tree.setAttributeNode(name_attr);
		
		doc.appendChild(kinematic_tree);
		kinematic_tree.appendChild(doc.createComment("GEN START: Kinematic links"))
		for (Link l: r.getLink()) {
			kinematic_tree.appendChild(doc.createComment('''GEN LINK: «l.name»'''))
			kinematic_tree.appendChild(generateLink(doc, l));
		}
		kinematic_tree.appendChild(doc.createComment("GEN START: Kinematic joints"))
		for (Joint j: r.getJoint()) {
			kinematic_tree.appendChild(generateJointElement(doc, j));
		
		}
		kinematic_tree.appendChild(doc.createComment("GEN START: Transmission definitions"))
		for (Transmission t: r.getTransmission()) {
			if (t.hardwareinterface.joint instanceof SphericalJoint){
				System.out.println("Spherical transmission");
			}
			else{
				kinematic_tree.appendChild(generateTransmissionElement(doc, t));
			}
			
		}
		kinematic_tree.appendChild(doc.createComment("GEN START: Sensor definitions"))
		for (Sensor s: r.getSensor()) {
			if (s instanceof Laser) {
				kinematic_tree.appendChild(GenerateUrdfSensor.generateLaserElement(doc, s as Laser));
			}
			else if (s instanceof IMU){
				kinematic_tree.appendChild(GenerateUrdfSensor.generateIMUElement(doc, s as IMU));
			}
			else if (s instanceof Lidar){
				kinematic_tree.appendChild(GenerateUrdfSensor.generateLidarElement(doc, s as Lidar))
			}
			else if (s instanceof GNSS){
				kinematic_tree.appendChild(GenerateUrdfSensor.generateGnssElement(doc, s as GNSS))
			}
			else if (s instanceof Camera){
				kinematic_tree.appendChild(GenerateUrdfSensor.generateCameraElement(doc, s as Camera))
			}
		}
		/*
		kinematic_tree.appendChild(
			ros_control_config.generateGazeboRosControlPlugin(doc,"/"+r.name)
		);
		*/
		kinematic_tree.appendChild(doc.createComment("GEN START: Control plugins"))
		//kinematic_tree.appendChild(GenerateRosControlGazebo.generateRosControl(doc, r))
		r.plugin.forEach[
			kinematic_tree.appendChild(generateRosCustomControl(doc, it))			
		]
		
		
	}
	
	def static Element generateRosCustomControl(Document doc, Plugin plugin){
		val Element element_ros_control = doc.createElement("gazebo")
		val Element element_ros_plugin = doc.createElement("plugin")
		element_ros_control.appendChild(element_ros_plugin)
		element_ros_plugin.setAttribute("filename", plugin.library+".so")
		element_ros_plugin.setAttribute("name", plugin.name)
		element_ros_control.appendChild(element_ros_plugin)
		return element_ros_control
	}
	
	def generatePlugin(){
		
	}
	
	def generateControlConfig(Robot r){
		return GenerateControlConfig.templateConfig(r, mapped_transmission)
	}
	
	def void generateURDF(Document doc, Resource res) {
		var Robot r = res.getContents().filter[it instanceof Robot].get(0) as Robot;
		
		generateURDF(doc, r)		
	}
	
}
