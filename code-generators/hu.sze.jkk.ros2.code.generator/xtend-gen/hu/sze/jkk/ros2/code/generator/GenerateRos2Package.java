package hu.sze.jkk.ros2.code.generator;

import org.eclipse.xtend2.lib.StringConcatenation;

public class GenerateRos2Package {
  public static java.lang.CharSequence generateRos2Node(final /* ROSNode */Object node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <ros2.h>");
    _builder.newLine();
    return _builder;
  }
}
