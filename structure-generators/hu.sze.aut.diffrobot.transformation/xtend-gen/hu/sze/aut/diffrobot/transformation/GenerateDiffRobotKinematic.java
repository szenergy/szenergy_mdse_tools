package hu.sze.aut.diffrobot.transformation;

import hu.sze.jkk.diffrobot.model.diffrobot.Robot;
import hu.sze.jkk.diffrobot.model.diffrobot.WheelAxis;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import robotdescriptionpackage.Joint;
import robotdescriptionpackage.Link;
import robotdescriptionpackage.Origin;
import robotdescriptionpackage.RobotdescriptionpackageFactory;
import robotdescriptionpackage.Vec3;

@SuppressWarnings("all")
public class GenerateDiffRobotKinematic {
  public static void translateLink(final Joint joint, final double x, final double y, final double z) {
    joint.setOrigin(RobotdescriptionpackageFactory.eINSTANCE.createOrigin());
    Origin _origin = joint.getOrigin();
    _origin.setXyz(RobotdescriptionpackageFactory.eINSTANCE.createVec3());
    Vec3 _xyz = joint.getOrigin().getXyz();
    _xyz.setX(x);
    Vec3 _xyz_1 = joint.getOrigin().getXyz();
    _xyz_1.setY(y);
    Vec3 _xyz_2 = joint.getOrigin().getXyz();
    _xyz_2.setZ(z);
  }
  
  public static void constructRobotKinematicTree(final Robot robot) {
    final robotdescriptionpackage.Robot robot_kinematics = RobotdescriptionpackageFactory.eINSTANCE.createRobot();
    final Link base_link = RobotdescriptionpackageFactory.eINSTANCE.createLink();
    base_link.setName("base_link");
    base_link.setMass(10.0);
    robot_kinematics.getLink().add(base_link);
    EList<WheelAxis> _wheelaxis = robot.getWheelaxis();
    for (final WheelAxis axis : _wheelaxis) {
      {
        final Joint joint = RobotdescriptionpackageFactory.eINSTANCE.createJoint();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("jnt");
        joint.setName(_builder.toString());
        final Link axis_root = RobotdescriptionpackageFactory.eINSTANCE.createLink();
        joint.setParent(base_link);
        joint.setChild(axis_root);
        int _wheels = axis.getWheels();
        switch (_wheels) {
          case 1:
            final Joint joint_wheel = RobotdescriptionpackageFactory.eINSTANCE.createJoint();
            final Link wheel_link = RobotdescriptionpackageFactory.eINSTANCE.createLink();
            joint_wheel.setParent(axis_root);
            joint.setChild(wheel_link);
            robot_kinematics.getJoint().add(joint_wheel);
            break;
          case 2:
            final Joint joint_wheel_right = RobotdescriptionpackageFactory.eINSTANCE.createJoint();
            final Link wheel_link_right = RobotdescriptionpackageFactory.eINSTANCE.createLink();
            joint_wheel_right.setParent(axis_root);
            joint_wheel_right.setChild(wheel_link_right);
            robot_kinematics.getJoint().add(joint_wheel_right);
            robot_kinematics.getLink().add(wheel_link_right);
            final Joint joint_wheel_left = RobotdescriptionpackageFactory.eINSTANCE.createJoint();
            final Link wheel_link_left = RobotdescriptionpackageFactory.eINSTANCE.createLink();
            joint_wheel_left.setParent(axis_root);
            joint_wheel_left.setChild(wheel_link_left);
            robot_kinematics.getJoint().add(joint_wheel_left);
            robot_kinematics.getLink().add(wheel_link_left);
            break;
        }
        robot_kinematics.getJoint().add(joint);
        robot_kinematics.getLink().add(axis_root);
      }
    }
  }
}
