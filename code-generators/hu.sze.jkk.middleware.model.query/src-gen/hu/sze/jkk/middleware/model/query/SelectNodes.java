/**
 * Generated from platform:/resource/hu.sze.jkk.middleware.model.query/src/hu/sze/jkk/middleware/model/query/SelectNetworkElements.vql
 */
package hu.sze.jkk.middleware.model.query;

import hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern SelectNodes(n: Node){
 *         	Node.name(n, name);
 *         	check(name.length {@literal >} 0);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class SelectNodes extends BaseGeneratedEMFQuerySpecification<SelectNodes.Matcher> {
  /**
   * Pattern-specific match representation of the hu.sze.jkk.middleware.model.query.SelectNodes pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private Node fN;
    
    private static List<String> parameterNames = makeImmutableList("n");
    
    private Match(final Node pN) {
      this.fN = pN;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("n".equals(parameterName)) return this.fN;
      return null;
    }
    
    public Node getN() {
      return this.fN;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("n".equals(parameterName) ) {
          this.fN = (Node) newValue;
          return true;
      }
      return false;
    }
    
    public void setN(final Node pN) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fN = pN;
    }
    
    @Override
    public String patternName() {
      return "hu.sze.jkk.middleware.model.query.SelectNodes";
    }
    
    @Override
    public List<String> parameterNames() {
      return SelectNodes.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fN};
    }
    
    @Override
    public SelectNodes.Match toImmutable() {
      return isMutable() ? newMatch(fN) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"n\"=" + prettyPrintValue(fN));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fN);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof SelectNodes.Match)) {
          SelectNodes.Match other = (SelectNodes.Match) obj;
          return Objects.equals(fN, other.fN);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public SelectNodes specification() {
      return SelectNodes.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static SelectNodes.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static SelectNodes.Match newMutableMatch(final Node pN) {
      return new Mutable(pN);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static SelectNodes.Match newMatch(final Node pN) {
      return new Immutable(pN);
    }
    
    private static final class Mutable extends SelectNodes.Match {
      Mutable(final Node pN) {
        super(pN);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends SelectNodes.Match {
      Immutable(final Node pN) {
        super(pN);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the hu.sze.jkk.middleware.model.query.SelectNodes pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern SelectNodes(n: Node){
   * 	Node.name(n, name);
   * 	check(name.length {@literal >} 0);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see SelectNodes
   * 
   */
  public static class Matcher extends BaseMatcher<SelectNodes.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static SelectNodes.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static SelectNodes.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_N = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(SelectNodes.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<SelectNodes.Match> getAllMatches(final Node pN) {
      return rawStreamAllMatches(new Object[]{pN}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<SelectNodes.Match> streamAllMatches(final Node pN) {
      return rawStreamAllMatches(new Object[]{pN});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<SelectNodes.Match> getOneArbitraryMatch(final Node pN) {
      return rawGetOneArbitraryMatch(new Object[]{pN});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Node pN) {
      return rawHasMatch(new Object[]{pN});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Node pN) {
      return rawCountMatches(new Object[]{pN});
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Node pN, final Consumer<? super SelectNodes.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pN}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pN the fixed value of pattern parameter n, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public SelectNodes.Match newMatch(final Node pN) {
      return SelectNodes.Match.newMatch(pN);
    }
    
    /**
     * Retrieve the set of values that occur in matches for n.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Node> rawStreamAllValuesOfn(final Object[] parameters) {
      return rawStreamAllValues(POSITION_N, parameters).map(Node.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for n.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Node> getAllValuesOfn() {
      return rawStreamAllValuesOfn(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for n.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Node> streamAllValuesOfn() {
      return rawStreamAllValuesOfn(emptyArray());
    }
    
    @Override
    protected SelectNodes.Match tupleToMatch(final Tuple t) {
      try {
          return SelectNodes.Match.newMatch((Node) t.get(POSITION_N));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SelectNodes.Match arrayToMatch(final Object[] match) {
      try {
          return SelectNodes.Match.newMatch((Node) match[POSITION_N]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected SelectNodes.Match arrayToMatchMutable(final Object[] match) {
      try {
          return SelectNodes.Match.newMutableMatch((Node) match[POSITION_N]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<SelectNodes.Matcher> querySpecification() {
      return SelectNodes.instance();
    }
  }
  
  private SelectNodes() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static SelectNodes instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected SelectNodes.Matcher instantiate(final ViatraQueryEngine engine) {
    return SelectNodes.Matcher.on(engine);
  }
  
  @Override
  public SelectNodes.Matcher instantiate() {
    return SelectNodes.Matcher.create();
  }
  
  @Override
  public SelectNodes.Match newEmptyMatch() {
    return SelectNodes.Match.newEmptyMatch();
  }
  
  @Override
  public SelectNodes.Match newMatch(final Object... parameters) {
    return SelectNodes.Match.newMatch((hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: hu.sze.jkk.middleware.model.query.SelectNodes (visibility: PUBLIC, simpleName: SelectNodes, identifier: hu.sze.jkk.middleware.model.query.SelectNodes, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.sze.jkk.middleware.model.query) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: hu.sze.jkk.middleware.model.query.SelectNodes (visibility: PUBLIC, simpleName: SelectNodes, identifier: hu.sze.jkk.middleware.model.query.SelectNodes, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: hu.sze.jkk.middleware.model.query) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final SelectNodes INSTANCE = new SelectNodes();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final SelectNodes.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_n = new PParameter("n", "hu.sze.jkk.middleware.statepubsub.model.statepubsubmodel.Node", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://jkk.sze.hu/statepubsubmodel", "Node")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_n);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.sze.jkk.middleware.model.query.SelectNodes";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("n");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_n = body.getOrCreateVariableByName("n");
          PVariable var_name = body.getOrCreateVariableByName("name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_n), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://jkk.sze.hu/statepubsubmodel", "Node")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_n, parameter_n)
          ));
          // 	Node.name(n, name)
          new TypeConstraint(body, Tuples.flatTupleOf(var_n), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://jkk.sze.hu/statepubsubmodel", "Node")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_n, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://jkk.sze.hu/statepubsubmodel", "Node", "name")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_0_, var_name);
          // 	check(name.length > 0)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern SelectNodes";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("name");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String name = (String) provider.getValue("name");
                  return evaluateExpression_1_1(name);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final String name) {
    int _length = name.length();
    boolean _greaterThan = (_length > 0);
    return _greaterThan;
  }
}
