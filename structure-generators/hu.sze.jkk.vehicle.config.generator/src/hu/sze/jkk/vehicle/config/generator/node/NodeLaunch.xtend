package hu.sze.jkk.vehicle.config.generator.node

import org.eclipse.xtend.lib.annotations.Accessors

class StaticTfPose {
	@Accessors(PUBLIC_GETTER, PROTECTED_SETTER) double x;
	@Accessors(PUBLIC_GETTER, PROTECTED_SETTER) double y;
	@Accessors(PUBLIC_GETTER, PROTECTED_SETTER) double z;
}

class NodeLaunch {
	@Accessors(PUBLIC_GETTER, PROTECTED_SETTER) String name;
}

class StaticTfNode extends NodeLaunch{
	
}

class Launch {
	
}