/**
 * Generated from platform:/resource/hu.sze.jkk.middleware.model.query/src/hu/sze/jkk/middleware/model/query/SelectNetworkElements.vql
 */
package hu.sze.jkk.middleware.model.query;

import hu.sze.jkk.middleware.model.query.SelectIntermediateTopics;
import hu.sze.jkk.middleware.model.query.SelectNodes;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in SelectNetworkElements.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file SelectNetworkElements.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.sze.jkk.middleware.model.query, the group contains the definition of the following patterns: <ul>
 * <li>SelectNodes</li>
 * <li>SelectIntermediateTopics</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class SelectNetworkElements extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SelectNetworkElements instance() {
    if (INSTANCE == null) {
        INSTANCE = new SelectNetworkElements();
    }
    return INSTANCE;
  }
  
  private static SelectNetworkElements INSTANCE;
  
  private SelectNetworkElements() {
    querySpecifications.add(SelectNodes.instance());
    querySpecifications.add(SelectIntermediateTopics.instance());
  }
  
  public SelectNodes getSelectNodes() {
    return SelectNodes.instance();
  }
  
  public SelectNodes.Matcher getSelectNodes(final ViatraQueryEngine engine) {
    return SelectNodes.Matcher.on(engine);
  }
  
  public SelectIntermediateTopics getSelectIntermediateTopics() {
    return SelectIntermediateTopics.instance();
  }
  
  public SelectIntermediateTopics.Matcher getSelectIntermediateTopics(final ViatraQueryEngine engine) {
    return SelectIntermediateTopics.Matcher.on(engine);
  }
}
