package hu.sze.jkk.middleware.model.pim.transformation;

import com.google.common.base.Objects;
import hu.sze.jkk.middleware.model.query.SelectNodes;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation;
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class MiddlewareNetworkToPimROS {
  /**
   * Transformation-related extensions
   */
  @Extension
  private BatchTransformation transformation;
  
  @Extension
  private BatchTransformationStatements statements;
  
  /**
   * Transformation rule-related extensions
   */
  @Extension
  private BatchTransformationRuleFactory _batchTransformationRuleFactory = new BatchTransformationRuleFactory();
  
  @Extension
  private IModelManipulations manipulation;
  
  protected ViatraQueryEngine engine;
  
  protected Resource resource;
  
  public MiddlewareNetworkToPimROS(final Resource resource) {
    this.resource = resource;
    final EMFScope scope = new EMFScope(resource);
    this.engine = ViatraQueryEngine.on(scope);
    this.createTransformation();
  }
  
  public Object execute() {
    return null;
  }
  
  private BatchTransformationStatements createTransformation() {
    BatchTransformationStatements _xblockexpression = null;
    {
      SimpleModelManipulations _simpleModelManipulations = new SimpleModelManipulations(this.engine);
      this.manipulation = _simpleModelManipulations;
      this.transformation = BatchTransformation.forEngine(this.engine).build();
      _xblockexpression = this.statements = this.transformation.getTransformationStatements();
    }
    return _xblockexpression;
  }
  
  private Object getExampleRule() {
    Object _exampleRule = this.getExampleRule();
    boolean _equals = Objects.equal(_exampleRule, null);
    if (_equals) {
      final Consumer<SelectNodes.Match> _function = (SelectNodes.Match it) -> {
      };
      this._batchTransformationRuleFactory.<SelectNodes.Match, SelectNodes.Matcher>createRule(SelectNodes.instance()).action(_function);
    }
    return this.getExampleRule();
  }
  
  public void dispose() {
    boolean _notEquals = (!Objects.equal(this.transformation, null));
    if (_notEquals) {
      this.transformation.getRuleEngine().dispose();
    }
    this.transformation = null;
    return;
  }
}
