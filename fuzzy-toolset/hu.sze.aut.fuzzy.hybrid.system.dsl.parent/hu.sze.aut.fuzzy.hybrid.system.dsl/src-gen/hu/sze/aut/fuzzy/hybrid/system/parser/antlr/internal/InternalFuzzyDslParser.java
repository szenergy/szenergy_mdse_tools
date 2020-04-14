package hu.sze.aut.fuzzy.hybrid.system.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.sze.aut.fuzzy.hybrid.system.services.FuzzyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFuzzyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'hybridsystem'", "','", "'rate'", "':'", "'locations'", "'end'", "'fuzzysetcollection'", "'endfuzzyset'", "'ruleset'", "'endruleset'", "'actions'", "'endactions'", "'variables'", "'endvariables'", "'transitions'", "'endtransitions'", "'begin'", "'startlocation'", "'errorlocation'", "'endsystem'", "'variable'", "'clock'", "'fuzzysets'", "'alpha'", "'on'", "'('", "')'", "'lambda'", "'trapezoid'", "'discreteeventruleset'", "'discreteevents'", "'endevents'", "'continouseventruleset'", "'rules'", "'endrules'", "'discreteevent'", "'crisprule'", "':='", "'>'", "'<'", "'fuzzyrule'", "'location'", "'do'", "'transition'", "'->'", "'trigger'", "'action'", "'invariant'", "'name'", "'reset'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=4;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalFuzzyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFuzzyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFuzzyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFuzzyDsl.g"; }



     	private FuzzyDslGrammarAccess grammarAccess;

        public InternalFuzzyDslParser(TokenStream input, FuzzyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "HybridSystem";
       	}

       	@Override
       	protected FuzzyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHybridSystem"
    // InternalFuzzyDsl.g:64:1: entryRuleHybridSystem returns [EObject current=null] : iv_ruleHybridSystem= ruleHybridSystem EOF ;
    public final EObject entryRuleHybridSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHybridSystem = null;


        try {
            // InternalFuzzyDsl.g:64:53: (iv_ruleHybridSystem= ruleHybridSystem EOF )
            // InternalFuzzyDsl.g:65:2: iv_ruleHybridSystem= ruleHybridSystem EOF
            {
             newCompositeNode(grammarAccess.getHybridSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHybridSystem=ruleHybridSystem();

            state._fsp--;

             current =iv_ruleHybridSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHybridSystem"


    // $ANTLR start "ruleHybridSystem"
    // InternalFuzzyDsl.g:71:1: ruleHybridSystem returns [EObject current=null] : this_SimpleSystem_0= ruleSimpleSystem ;
    public final EObject ruleHybridSystem() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleSystem_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:77:2: (this_SimpleSystem_0= ruleSimpleSystem )
            // InternalFuzzyDsl.g:78:2: this_SimpleSystem_0= ruleSimpleSystem
            {

            		newCompositeNode(grammarAccess.getHybridSystemAccess().getSimpleSystemParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SimpleSystem_0=ruleSimpleSystem();

            state._fsp--;


            		current = this_SimpleSystem_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHybridSystem"


    // $ANTLR start "entryRuleSimpleSystem"
    // InternalFuzzyDsl.g:89:1: entryRuleSimpleSystem returns [EObject current=null] : iv_ruleSimpleSystem= ruleSimpleSystem EOF ;
    public final EObject entryRuleSimpleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSystem = null;


        try {
            // InternalFuzzyDsl.g:89:53: (iv_ruleSimpleSystem= ruleSimpleSystem EOF )
            // InternalFuzzyDsl.g:90:2: iv_ruleSimpleSystem= ruleSimpleSystem EOF
            {
             newCompositeNode(grammarAccess.getSimpleSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleSystem=ruleSimpleSystem();

            state._fsp--;

             current =iv_ruleSimpleSystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleSystem"


    // $ANTLR start "ruleSimpleSystem"
    // InternalFuzzyDsl.g:96:1: ruleSimpleSystem returns [EObject current=null] : ( () otherlv_1= 'hybridsystem' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ',' otherlv_4= 'rate' otherlv_5= ':' ( (lv_rate_6_0= RULE_DOUBLE ) ) )? otherlv_7= 'locations' otherlv_8= ':' ( (lv_location_9_0= ruleLocation ) ) ( (lv_location_10_0= ruleLocation ) )* otherlv_11= 'end' (otherlv_12= 'fuzzysetcollection' ( (lv_fuzzyset_13_0= ruleFuzzySet ) ) ( (lv_fuzzyset_14_0= ruleFuzzySet ) )* otherlv_15= 'endfuzzyset' )? otherlv_16= 'ruleset' ( (lv_ruleset_17_0= ruleRuleSet ) ) ( (lv_ruleset_18_0= ruleRuleSet ) )* otherlv_19= 'endruleset' otherlv_20= 'actions' ( (lv_actiondefinition_21_0= ruleAction ) ) ( (lv_actiondefinition_22_0= ruleAction ) )* otherlv_23= 'endactions' (otherlv_24= 'variables' ( (lv_variable_25_0= ruleConVariable ) ) ( (lv_variable_26_0= ruleConVariable ) )* otherlv_27= 'endvariables' )? otherlv_28= 'transitions' ( (lv_transition_29_0= ruleTransition ) ) ( (lv_transition_30_0= ruleTransition ) )* otherlv_31= 'endtransitions' otherlv_32= 'begin' otherlv_33= 'startlocation' ( ( ruleEString ) ) otherlv_35= 'errorlocation' ( ( ruleEString ) ) otherlv_37= 'endsystem' ) ;
    public final EObject ruleSimpleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_rate_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_location_9_0 = null;

        EObject lv_location_10_0 = null;

        EObject lv_fuzzyset_13_0 = null;

        EObject lv_fuzzyset_14_0 = null;

        EObject lv_ruleset_17_0 = null;

        EObject lv_ruleset_18_0 = null;

        EObject lv_actiondefinition_21_0 = null;

        EObject lv_actiondefinition_22_0 = null;

        EObject lv_variable_25_0 = null;

        EObject lv_variable_26_0 = null;

        EObject lv_transition_29_0 = null;

        EObject lv_transition_30_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:102:2: ( ( () otherlv_1= 'hybridsystem' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ',' otherlv_4= 'rate' otherlv_5= ':' ( (lv_rate_6_0= RULE_DOUBLE ) ) )? otherlv_7= 'locations' otherlv_8= ':' ( (lv_location_9_0= ruleLocation ) ) ( (lv_location_10_0= ruleLocation ) )* otherlv_11= 'end' (otherlv_12= 'fuzzysetcollection' ( (lv_fuzzyset_13_0= ruleFuzzySet ) ) ( (lv_fuzzyset_14_0= ruleFuzzySet ) )* otherlv_15= 'endfuzzyset' )? otherlv_16= 'ruleset' ( (lv_ruleset_17_0= ruleRuleSet ) ) ( (lv_ruleset_18_0= ruleRuleSet ) )* otherlv_19= 'endruleset' otherlv_20= 'actions' ( (lv_actiondefinition_21_0= ruleAction ) ) ( (lv_actiondefinition_22_0= ruleAction ) )* otherlv_23= 'endactions' (otherlv_24= 'variables' ( (lv_variable_25_0= ruleConVariable ) ) ( (lv_variable_26_0= ruleConVariable ) )* otherlv_27= 'endvariables' )? otherlv_28= 'transitions' ( (lv_transition_29_0= ruleTransition ) ) ( (lv_transition_30_0= ruleTransition ) )* otherlv_31= 'endtransitions' otherlv_32= 'begin' otherlv_33= 'startlocation' ( ( ruleEString ) ) otherlv_35= 'errorlocation' ( ( ruleEString ) ) otherlv_37= 'endsystem' ) )
            // InternalFuzzyDsl.g:103:2: ( () otherlv_1= 'hybridsystem' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ',' otherlv_4= 'rate' otherlv_5= ':' ( (lv_rate_6_0= RULE_DOUBLE ) ) )? otherlv_7= 'locations' otherlv_8= ':' ( (lv_location_9_0= ruleLocation ) ) ( (lv_location_10_0= ruleLocation ) )* otherlv_11= 'end' (otherlv_12= 'fuzzysetcollection' ( (lv_fuzzyset_13_0= ruleFuzzySet ) ) ( (lv_fuzzyset_14_0= ruleFuzzySet ) )* otherlv_15= 'endfuzzyset' )? otherlv_16= 'ruleset' ( (lv_ruleset_17_0= ruleRuleSet ) ) ( (lv_ruleset_18_0= ruleRuleSet ) )* otherlv_19= 'endruleset' otherlv_20= 'actions' ( (lv_actiondefinition_21_0= ruleAction ) ) ( (lv_actiondefinition_22_0= ruleAction ) )* otherlv_23= 'endactions' (otherlv_24= 'variables' ( (lv_variable_25_0= ruleConVariable ) ) ( (lv_variable_26_0= ruleConVariable ) )* otherlv_27= 'endvariables' )? otherlv_28= 'transitions' ( (lv_transition_29_0= ruleTransition ) ) ( (lv_transition_30_0= ruleTransition ) )* otherlv_31= 'endtransitions' otherlv_32= 'begin' otherlv_33= 'startlocation' ( ( ruleEString ) ) otherlv_35= 'errorlocation' ( ( ruleEString ) ) otherlv_37= 'endsystem' )
            {
            // InternalFuzzyDsl.g:103:2: ( () otherlv_1= 'hybridsystem' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ',' otherlv_4= 'rate' otherlv_5= ':' ( (lv_rate_6_0= RULE_DOUBLE ) ) )? otherlv_7= 'locations' otherlv_8= ':' ( (lv_location_9_0= ruleLocation ) ) ( (lv_location_10_0= ruleLocation ) )* otherlv_11= 'end' (otherlv_12= 'fuzzysetcollection' ( (lv_fuzzyset_13_0= ruleFuzzySet ) ) ( (lv_fuzzyset_14_0= ruleFuzzySet ) )* otherlv_15= 'endfuzzyset' )? otherlv_16= 'ruleset' ( (lv_ruleset_17_0= ruleRuleSet ) ) ( (lv_ruleset_18_0= ruleRuleSet ) )* otherlv_19= 'endruleset' otherlv_20= 'actions' ( (lv_actiondefinition_21_0= ruleAction ) ) ( (lv_actiondefinition_22_0= ruleAction ) )* otherlv_23= 'endactions' (otherlv_24= 'variables' ( (lv_variable_25_0= ruleConVariable ) ) ( (lv_variable_26_0= ruleConVariable ) )* otherlv_27= 'endvariables' )? otherlv_28= 'transitions' ( (lv_transition_29_0= ruleTransition ) ) ( (lv_transition_30_0= ruleTransition ) )* otherlv_31= 'endtransitions' otherlv_32= 'begin' otherlv_33= 'startlocation' ( ( ruleEString ) ) otherlv_35= 'errorlocation' ( ( ruleEString ) ) otherlv_37= 'endsystem' )
            // InternalFuzzyDsl.g:104:3: () otherlv_1= 'hybridsystem' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= ',' otherlv_4= 'rate' otherlv_5= ':' ( (lv_rate_6_0= RULE_DOUBLE ) ) )? otherlv_7= 'locations' otherlv_8= ':' ( (lv_location_9_0= ruleLocation ) ) ( (lv_location_10_0= ruleLocation ) )* otherlv_11= 'end' (otherlv_12= 'fuzzysetcollection' ( (lv_fuzzyset_13_0= ruleFuzzySet ) ) ( (lv_fuzzyset_14_0= ruleFuzzySet ) )* otherlv_15= 'endfuzzyset' )? otherlv_16= 'ruleset' ( (lv_ruleset_17_0= ruleRuleSet ) ) ( (lv_ruleset_18_0= ruleRuleSet ) )* otherlv_19= 'endruleset' otherlv_20= 'actions' ( (lv_actiondefinition_21_0= ruleAction ) ) ( (lv_actiondefinition_22_0= ruleAction ) )* otherlv_23= 'endactions' (otherlv_24= 'variables' ( (lv_variable_25_0= ruleConVariable ) ) ( (lv_variable_26_0= ruleConVariable ) )* otherlv_27= 'endvariables' )? otherlv_28= 'transitions' ( (lv_transition_29_0= ruleTransition ) ) ( (lv_transition_30_0= ruleTransition ) )* otherlv_31= 'endtransitions' otherlv_32= 'begin' otherlv_33= 'startlocation' ( ( ruleEString ) ) otherlv_35= 'errorlocation' ( ( ruleEString ) ) otherlv_37= 'endsystem'
            {
            // InternalFuzzyDsl.g:104:3: ()
            // InternalFuzzyDsl.g:105:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleSystemAccess().getSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleSystemAccess().getHybridsystemKeyword_1());
            		
            // InternalFuzzyDsl.g:115:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFuzzyDsl.g:116:4: (lv_name_2_0= ruleEString )
            {
            // InternalFuzzyDsl.g:116:4: (lv_name_2_0= ruleEString )
            // InternalFuzzyDsl.g:117:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleSystemAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyDsl.g:134:3: (otherlv_3= ',' otherlv_4= 'rate' otherlv_5= ':' ( (lv_rate_6_0= RULE_DOUBLE ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalFuzzyDsl.g:135:4: otherlv_3= ',' otherlv_4= 'rate' otherlv_5= ':' ( (lv_rate_6_0= RULE_DOUBLE ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSimpleSystemAccess().getCommaKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimpleSystemAccess().getRateKeyword_3_1());
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getSimpleSystemAccess().getColonKeyword_3_2());
                    			
                    // InternalFuzzyDsl.g:147:4: ( (lv_rate_6_0= RULE_DOUBLE ) )
                    // InternalFuzzyDsl.g:148:5: (lv_rate_6_0= RULE_DOUBLE )
                    {
                    // InternalFuzzyDsl.g:148:5: (lv_rate_6_0= RULE_DOUBLE )
                    // InternalFuzzyDsl.g:149:6: lv_rate_6_0= RULE_DOUBLE
                    {
                    lv_rate_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_8); 

                    						newLeafNode(lv_rate_6_0, grammarAccess.getSimpleSystemAccess().getRateDOUBLETerminalRuleCall_3_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleSystemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"rate",
                    							lv_rate_6_0,
                    							"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.DOUBLE");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getSimpleSystemAccess().getLocationsKeyword_4());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getSimpleSystemAccess().getColonKeyword_5());
            		
            // InternalFuzzyDsl.g:174:3: ( (lv_location_9_0= ruleLocation ) )
            // InternalFuzzyDsl.g:175:4: (lv_location_9_0= ruleLocation )
            {
            // InternalFuzzyDsl.g:175:4: (lv_location_9_0= ruleLocation )
            // InternalFuzzyDsl.g:176:5: lv_location_9_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getSimpleSystemAccess().getLocationLocationParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_location_9_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleSystemRule());
            					}
            					add(
            						current,
            						"location",
            						lv_location_9_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyDsl.g:193:3: ( (lv_location_10_0= ruleLocation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==53) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFuzzyDsl.g:194:4: (lv_location_10_0= ruleLocation )
            	    {
            	    // InternalFuzzyDsl.g:194:4: (lv_location_10_0= ruleLocation )
            	    // InternalFuzzyDsl.g:195:5: lv_location_10_0= ruleLocation
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleSystemAccess().getLocationLocationParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_location_10_0=ruleLocation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"location",
            	    						lv_location_10_0,
            	    						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.Location");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getSimpleSystemAccess().getEndKeyword_8());
            		
            // InternalFuzzyDsl.g:216:3: (otherlv_12= 'fuzzysetcollection' ( (lv_fuzzyset_13_0= ruleFuzzySet ) ) ( (lv_fuzzyset_14_0= ruleFuzzySet ) )* otherlv_15= 'endfuzzyset' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFuzzyDsl.g:217:4: otherlv_12= 'fuzzysetcollection' ( (lv_fuzzyset_13_0= ruleFuzzySet ) ) ( (lv_fuzzyset_14_0= ruleFuzzySet ) )* otherlv_15= 'endfuzzyset'
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getSimpleSystemAccess().getFuzzysetcollectionKeyword_9_0());
                    			
                    // InternalFuzzyDsl.g:221:4: ( (lv_fuzzyset_13_0= ruleFuzzySet ) )
                    // InternalFuzzyDsl.g:222:5: (lv_fuzzyset_13_0= ruleFuzzySet )
                    {
                    // InternalFuzzyDsl.g:222:5: (lv_fuzzyset_13_0= ruleFuzzySet )
                    // InternalFuzzyDsl.g:223:6: lv_fuzzyset_13_0= ruleFuzzySet
                    {

                    						newCompositeNode(grammarAccess.getSimpleSystemAccess().getFuzzysetFuzzySetParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_fuzzyset_13_0=ruleFuzzySet();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleSystemRule());
                    						}
                    						add(
                    							current,
                    							"fuzzyset",
                    							lv_fuzzyset_13_0,
                    							"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.FuzzySet");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFuzzyDsl.g:240:4: ( (lv_fuzzyset_14_0= ruleFuzzySet ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==34) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalFuzzyDsl.g:241:5: (lv_fuzzyset_14_0= ruleFuzzySet )
                    	    {
                    	    // InternalFuzzyDsl.g:241:5: (lv_fuzzyset_14_0= ruleFuzzySet )
                    	    // InternalFuzzyDsl.g:242:6: lv_fuzzyset_14_0= ruleFuzzySet
                    	    {

                    	    						newCompositeNode(grammarAccess.getSimpleSystemAccess().getFuzzysetFuzzySetParserRuleCall_9_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_fuzzyset_14_0=ruleFuzzySet();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSimpleSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fuzzyset",
                    	    							lv_fuzzyset_14_0,
                    	    							"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.FuzzySet");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getSimpleSystemAccess().getEndfuzzysetKeyword_9_3());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_16, grammarAccess.getSimpleSystemAccess().getRulesetKeyword_10());
            		
            // InternalFuzzyDsl.g:268:3: ( (lv_ruleset_17_0= ruleRuleSet ) )
            // InternalFuzzyDsl.g:269:4: (lv_ruleset_17_0= ruleRuleSet )
            {
            // InternalFuzzyDsl.g:269:4: (lv_ruleset_17_0= ruleRuleSet )
            // InternalFuzzyDsl.g:270:5: lv_ruleset_17_0= ruleRuleSet
            {

            					newCompositeNode(grammarAccess.getSimpleSystemAccess().getRulesetRuleSetParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_16);
            lv_ruleset_17_0=ruleRuleSet();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleSystemRule());
            					}
            					add(
            						current,
            						"ruleset",
            						lv_ruleset_17_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.RuleSet");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyDsl.g:287:3: ( (lv_ruleset_18_0= ruleRuleSet ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==41||LA5_0==44) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFuzzyDsl.g:288:4: (lv_ruleset_18_0= ruleRuleSet )
            	    {
            	    // InternalFuzzyDsl.g:288:4: (lv_ruleset_18_0= ruleRuleSet )
            	    // InternalFuzzyDsl.g:289:5: lv_ruleset_18_0= ruleRuleSet
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleSystemAccess().getRulesetRuleSetParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_ruleset_18_0=ruleRuleSet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ruleset",
            	    						lv_ruleset_18_0,
            	    						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.RuleSet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_19=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_19, grammarAccess.getSimpleSystemAccess().getEndrulesetKeyword_13());
            		
            otherlv_20=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_20, grammarAccess.getSimpleSystemAccess().getActionsKeyword_14());
            		
            // InternalFuzzyDsl.g:314:3: ( (lv_actiondefinition_21_0= ruleAction ) )
            // InternalFuzzyDsl.g:315:4: (lv_actiondefinition_21_0= ruleAction )
            {
            // InternalFuzzyDsl.g:315:4: (lv_actiondefinition_21_0= ruleAction )
            // InternalFuzzyDsl.g:316:5: lv_actiondefinition_21_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getSimpleSystemAccess().getActiondefinitionActionParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_19);
            lv_actiondefinition_21_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleSystemRule());
            					}
            					add(
            						current,
            						"actiondefinition",
            						lv_actiondefinition_21_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyDsl.g:333:3: ( (lv_actiondefinition_22_0= ruleAction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==58) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFuzzyDsl.g:334:4: (lv_actiondefinition_22_0= ruleAction )
            	    {
            	    // InternalFuzzyDsl.g:334:4: (lv_actiondefinition_22_0= ruleAction )
            	    // InternalFuzzyDsl.g:335:5: lv_actiondefinition_22_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleSystemAccess().getActiondefinitionActionParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_actiondefinition_22_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actiondefinition",
            	    						lv_actiondefinition_22_0,
            	    						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_23=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_23, grammarAccess.getSimpleSystemAccess().getEndactionsKeyword_17());
            		
            // InternalFuzzyDsl.g:356:3: (otherlv_24= 'variables' ( (lv_variable_25_0= ruleConVariable ) ) ( (lv_variable_26_0= ruleConVariable ) )* otherlv_27= 'endvariables' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFuzzyDsl.g:357:4: otherlv_24= 'variables' ( (lv_variable_25_0= ruleConVariable ) ) ( (lv_variable_26_0= ruleConVariable ) )* otherlv_27= 'endvariables'
                    {
                    otherlv_24=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_24, grammarAccess.getSimpleSystemAccess().getVariablesKeyword_18_0());
                    			
                    // InternalFuzzyDsl.g:361:4: ( (lv_variable_25_0= ruleConVariable ) )
                    // InternalFuzzyDsl.g:362:5: (lv_variable_25_0= ruleConVariable )
                    {
                    // InternalFuzzyDsl.g:362:5: (lv_variable_25_0= ruleConVariable )
                    // InternalFuzzyDsl.g:363:6: lv_variable_25_0= ruleConVariable
                    {

                    						newCompositeNode(grammarAccess.getSimpleSystemAccess().getVariableConVariableParserRuleCall_18_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_variable_25_0=ruleConVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleSystemRule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_25_0,
                    							"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.ConVariable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFuzzyDsl.g:380:4: ( (lv_variable_26_0= ruleConVariable ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=32 && LA7_0<=33)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFuzzyDsl.g:381:5: (lv_variable_26_0= ruleConVariable )
                    	    {
                    	    // InternalFuzzyDsl.g:381:5: (lv_variable_26_0= ruleConVariable )
                    	    // InternalFuzzyDsl.g:382:6: lv_variable_26_0= ruleConVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getSimpleSystemAccess().getVariableConVariableParserRuleCall_18_2_0());
                    	    					
                    	    pushFollow(FOLLOW_22);
                    	    lv_variable_26_0=ruleConVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSimpleSystemRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variable",
                    	    							lv_variable_26_0,
                    	    							"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.ConVariable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,25,FOLLOW_23); 

                    				newLeafNode(otherlv_27, grammarAccess.getSimpleSystemAccess().getEndvariablesKeyword_18_3());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_28, grammarAccess.getSimpleSystemAccess().getTransitionsKeyword_19());
            		
            // InternalFuzzyDsl.g:408:3: ( (lv_transition_29_0= ruleTransition ) )
            // InternalFuzzyDsl.g:409:4: (lv_transition_29_0= ruleTransition )
            {
            // InternalFuzzyDsl.g:409:4: (lv_transition_29_0= ruleTransition )
            // InternalFuzzyDsl.g:410:5: lv_transition_29_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getSimpleSystemAccess().getTransitionTransitionParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_25);
            lv_transition_29_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleSystemRule());
            					}
            					add(
            						current,
            						"transition",
            						lv_transition_29_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyDsl.g:427:3: ( (lv_transition_30_0= ruleTransition ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==55) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFuzzyDsl.g:428:4: (lv_transition_30_0= ruleTransition )
            	    {
            	    // InternalFuzzyDsl.g:428:4: (lv_transition_30_0= ruleTransition )
            	    // InternalFuzzyDsl.g:429:5: lv_transition_30_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getSimpleSystemAccess().getTransitionTransitionParserRuleCall_21_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_transition_30_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimpleSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transition",
            	    						lv_transition_30_0,
            	    						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_31=(Token)match(input,27,FOLLOW_26); 

            			newLeafNode(otherlv_31, grammarAccess.getSimpleSystemAccess().getEndtransitionsKeyword_22());
            		
            otherlv_32=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_32, grammarAccess.getSimpleSystemAccess().getBeginKeyword_23());
            		
            otherlv_33=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_33, grammarAccess.getSimpleSystemAccess().getStartlocationKeyword_24());
            		
            // InternalFuzzyDsl.g:458:3: ( ( ruleEString ) )
            // InternalFuzzyDsl.g:459:4: ( ruleEString )
            {
            // InternalFuzzyDsl.g:459:4: ( ruleEString )
            // InternalFuzzyDsl.g:460:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSimpleSystemAccess().getStartlocationLocationCrossReference_25_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_35=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_35, grammarAccess.getSimpleSystemAccess().getErrorlocationKeyword_26());
            		
            // InternalFuzzyDsl.g:478:3: ( ( ruleEString ) )
            // InternalFuzzyDsl.g:479:4: ( ruleEString )
            {
            // InternalFuzzyDsl.g:479:4: ( ruleEString )
            // InternalFuzzyDsl.g:480:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleSystemRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSimpleSystemAccess().getErrorlocationLocationCrossReference_27_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_37=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_37, grammarAccess.getSimpleSystemAccess().getEndsystemKeyword_28());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleSystem"


    // $ANTLR start "entryRuleConVariable"
    // InternalFuzzyDsl.g:502:1: entryRuleConVariable returns [EObject current=null] : iv_ruleConVariable= ruleConVariable EOF ;
    public final EObject entryRuleConVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConVariable = null;


        try {
            // InternalFuzzyDsl.g:502:52: (iv_ruleConVariable= ruleConVariable EOF )
            // InternalFuzzyDsl.g:503:2: iv_ruleConVariable= ruleConVariable EOF
            {
             newCompositeNode(grammarAccess.getConVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConVariable=ruleConVariable();

            state._fsp--;

             current =iv_ruleConVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConVariable"


    // $ANTLR start "ruleConVariable"
    // InternalFuzzyDsl.g:509:1: ruleConVariable returns [EObject current=null] : (this_ContinuousVariable_0= ruleContinuousVariable | this_Clock_1= ruleClock ) ;
    public final EObject ruleConVariable() throws RecognitionException {
        EObject current = null;

        EObject this_ContinuousVariable_0 = null;

        EObject this_Clock_1 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:515:2: ( (this_ContinuousVariable_0= ruleContinuousVariable | this_Clock_1= ruleClock ) )
            // InternalFuzzyDsl.g:516:2: (this_ContinuousVariable_0= ruleContinuousVariable | this_Clock_1= ruleClock )
            {
            // InternalFuzzyDsl.g:516:2: (this_ContinuousVariable_0= ruleContinuousVariable | this_Clock_1= ruleClock )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            else if ( (LA10_0==33) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalFuzzyDsl.g:517:3: this_ContinuousVariable_0= ruleContinuousVariable
                    {

                    			newCompositeNode(grammarAccess.getConVariableAccess().getContinuousVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContinuousVariable_0=ruleContinuousVariable();

                    state._fsp--;


                    			current = this_ContinuousVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFuzzyDsl.g:526:3: this_Clock_1= ruleClock
                    {

                    			newCompositeNode(grammarAccess.getConVariableAccess().getClockParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clock_1=ruleClock();

                    state._fsp--;


                    			current = this_Clock_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConVariable"


    // $ANTLR start "entryRuleContinuousVariable"
    // InternalFuzzyDsl.g:538:1: entryRuleContinuousVariable returns [EObject current=null] : iv_ruleContinuousVariable= ruleContinuousVariable EOF ;
    public final EObject entryRuleContinuousVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinuousVariable = null;


        try {
            // InternalFuzzyDsl.g:538:59: (iv_ruleContinuousVariable= ruleContinuousVariable EOF )
            // InternalFuzzyDsl.g:539:2: iv_ruleContinuousVariable= ruleContinuousVariable EOF
            {
             newCompositeNode(grammarAccess.getContinuousVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContinuousVariable=ruleContinuousVariable();

            state._fsp--;

             current =iv_ruleContinuousVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContinuousVariable"


    // $ANTLR start "ruleContinuousVariable"
    // InternalFuzzyDsl.g:545:1: ruleContinuousVariable returns [EObject current=null] : ( () otherlv_1= 'variable' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleContinuousVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:551:2: ( ( () otherlv_1= 'variable' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalFuzzyDsl.g:552:2: ( () otherlv_1= 'variable' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalFuzzyDsl.g:552:2: ( () otherlv_1= 'variable' ( (lv_name_2_0= ruleEString ) ) )
            // InternalFuzzyDsl.g:553:3: () otherlv_1= 'variable' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalFuzzyDsl.g:553:3: ()
            // InternalFuzzyDsl.g:554:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContinuousVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContinuousVariableAccess().getVariableKeyword_1());
            		
            // InternalFuzzyDsl.g:564:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFuzzyDsl.g:565:4: (lv_name_2_0= ruleEString )
            {
            // InternalFuzzyDsl.g:565:4: (lv_name_2_0= ruleEString )
            // InternalFuzzyDsl.g:566:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContinuousVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContinuousVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContinuousVariable"


    // $ANTLR start "entryRuleClock"
    // InternalFuzzyDsl.g:587:1: entryRuleClock returns [EObject current=null] : iv_ruleClock= ruleClock EOF ;
    public final EObject entryRuleClock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClock = null;


        try {
            // InternalFuzzyDsl.g:587:46: (iv_ruleClock= ruleClock EOF )
            // InternalFuzzyDsl.g:588:2: iv_ruleClock= ruleClock EOF
            {
             newCompositeNode(grammarAccess.getClockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClock=ruleClock();

            state._fsp--;

             current =iv_ruleClock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClock"


    // $ANTLR start "ruleClock"
    // InternalFuzzyDsl.g:594:1: ruleClock returns [EObject current=null] : ( () otherlv_1= 'clock' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleClock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:600:2: ( ( () otherlv_1= 'clock' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalFuzzyDsl.g:601:2: ( () otherlv_1= 'clock' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalFuzzyDsl.g:601:2: ( () otherlv_1= 'clock' ( (lv_name_2_0= ruleEString ) ) )
            // InternalFuzzyDsl.g:602:3: () otherlv_1= 'clock' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalFuzzyDsl.g:602:3: ()
            // InternalFuzzyDsl.g:603:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClockAccess().getClockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClockAccess().getClockKeyword_1());
            		
            // InternalFuzzyDsl.g:613:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFuzzyDsl.g:614:4: (lv_name_2_0= ruleEString )
            {
            // InternalFuzzyDsl.g:614:4: (lv_name_2_0= ruleEString )
            // InternalFuzzyDsl.g:615:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClockAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClockRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClock"


    // $ANTLR start "entryRuleFuzzySet"
    // InternalFuzzyDsl.g:636:1: entryRuleFuzzySet returns [EObject current=null] : iv_ruleFuzzySet= ruleFuzzySet EOF ;
    public final EObject entryRuleFuzzySet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzySet = null;


        try {
            // InternalFuzzyDsl.g:636:49: (iv_ruleFuzzySet= ruleFuzzySet EOF )
            // InternalFuzzyDsl.g:637:2: iv_ruleFuzzySet= ruleFuzzySet EOF
            {
             newCompositeNode(grammarAccess.getFuzzySetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzySet=ruleFuzzySet();

            state._fsp--;

             current =iv_ruleFuzzySet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuzzySet"


    // $ANTLR start "ruleFuzzySet"
    // InternalFuzzyDsl.g:643:1: ruleFuzzySet returns [EObject current=null] : ( () otherlv_1= 'fuzzysets' ( (lv_name_2_0= ruleEString ) ) ( (lv_membershipfunction_3_0= ruleMembershipFunction ) ) ( (lv_membershipfunction_4_0= ruleMembershipFunction ) )* otherlv_5= 'end' ) ;
    public final EObject ruleFuzzySet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_membershipfunction_3_0 = null;

        EObject lv_membershipfunction_4_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:649:2: ( ( () otherlv_1= 'fuzzysets' ( (lv_name_2_0= ruleEString ) ) ( (lv_membershipfunction_3_0= ruleMembershipFunction ) ) ( (lv_membershipfunction_4_0= ruleMembershipFunction ) )* otherlv_5= 'end' ) )
            // InternalFuzzyDsl.g:650:2: ( () otherlv_1= 'fuzzysets' ( (lv_name_2_0= ruleEString ) ) ( (lv_membershipfunction_3_0= ruleMembershipFunction ) ) ( (lv_membershipfunction_4_0= ruleMembershipFunction ) )* otherlv_5= 'end' )
            {
            // InternalFuzzyDsl.g:650:2: ( () otherlv_1= 'fuzzysets' ( (lv_name_2_0= ruleEString ) ) ( (lv_membershipfunction_3_0= ruleMembershipFunction ) ) ( (lv_membershipfunction_4_0= ruleMembershipFunction ) )* otherlv_5= 'end' )
            // InternalFuzzyDsl.g:651:3: () otherlv_1= 'fuzzysets' ( (lv_name_2_0= ruleEString ) ) ( (lv_membershipfunction_3_0= ruleMembershipFunction ) ) ( (lv_membershipfunction_4_0= ruleMembershipFunction ) )* otherlv_5= 'end'
            {
            // InternalFuzzyDsl.g:651:3: ()
            // InternalFuzzyDsl.g:652:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFuzzySetAccess().getFuzzySetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFuzzySetAccess().getFuzzysetsKeyword_1());
            		
            // InternalFuzzyDsl.g:662:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFuzzyDsl.g:663:4: (lv_name_2_0= ruleEString )
            {
            // InternalFuzzyDsl.g:663:4: (lv_name_2_0= ruleEString )
            // InternalFuzzyDsl.g:664:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFuzzySetAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzySetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyDsl.g:681:3: ( (lv_membershipfunction_3_0= ruleMembershipFunction ) )
            // InternalFuzzyDsl.g:682:4: (lv_membershipfunction_3_0= ruleMembershipFunction )
            {
            // InternalFuzzyDsl.g:682:4: (lv_membershipfunction_3_0= ruleMembershipFunction )
            // InternalFuzzyDsl.g:683:5: lv_membershipfunction_3_0= ruleMembershipFunction
            {

            					newCompositeNode(grammarAccess.getFuzzySetAccess().getMembershipfunctionMembershipFunctionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_membershipfunction_3_0=ruleMembershipFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuzzySetRule());
            					}
            					add(
            						current,
            						"membershipfunction",
            						lv_membershipfunction_3_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.MembershipFunction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyDsl.g:700:3: ( (lv_membershipfunction_4_0= ruleMembershipFunction ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35||(LA11_0>=39 && LA11_0<=40)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFuzzyDsl.g:701:4: (lv_membershipfunction_4_0= ruleMembershipFunction )
            	    {
            	    // InternalFuzzyDsl.g:701:4: (lv_membershipfunction_4_0= ruleMembershipFunction )
            	    // InternalFuzzyDsl.g:702:5: lv_membershipfunction_4_0= ruleMembershipFunction
            	    {

            	    					newCompositeNode(grammarAccess.getFuzzySetAccess().getMembershipfunctionMembershipFunctionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_membershipfunction_4_0=ruleMembershipFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFuzzySetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"membershipfunction",
            	    						lv_membershipfunction_4_0,
            	    						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.MembershipFunction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFuzzySetAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuzzySet"


    // $ANTLR start "entryRuleMembershipFunction"
    // InternalFuzzyDsl.g:727:1: entryRuleMembershipFunction returns [EObject current=null] : iv_ruleMembershipFunction= ruleMembershipFunction EOF ;
    public final EObject entryRuleMembershipFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembershipFunction = null;


        try {
            // InternalFuzzyDsl.g:727:59: (iv_ruleMembershipFunction= ruleMembershipFunction EOF )
            // InternalFuzzyDsl.g:728:2: iv_ruleMembershipFunction= ruleMembershipFunction EOF
            {
             newCompositeNode(grammarAccess.getMembershipFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMembershipFunction=ruleMembershipFunction();

            state._fsp--;

             current =iv_ruleMembershipFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMembershipFunction"


    // $ANTLR start "ruleMembershipFunction"
    // InternalFuzzyDsl.g:734:1: ruleMembershipFunction returns [EObject current=null] : (this_Lambda_0= ruleLambda | this_Trapezoid_1= ruleTrapezoid | this_Alpha_2= ruleAlpha ) ;
    public final EObject ruleMembershipFunction() throws RecognitionException {
        EObject current = null;

        EObject this_Lambda_0 = null;

        EObject this_Trapezoid_1 = null;

        EObject this_Alpha_2 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:740:2: ( (this_Lambda_0= ruleLambda | this_Trapezoid_1= ruleTrapezoid | this_Alpha_2= ruleAlpha ) )
            // InternalFuzzyDsl.g:741:2: (this_Lambda_0= ruleLambda | this_Trapezoid_1= ruleTrapezoid | this_Alpha_2= ruleAlpha )
            {
            // InternalFuzzyDsl.g:741:2: (this_Lambda_0= ruleLambda | this_Trapezoid_1= ruleTrapezoid | this_Alpha_2= ruleAlpha )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt12=1;
                }
                break;
            case 40:
                {
                alt12=2;
                }
                break;
            case 35:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalFuzzyDsl.g:742:3: this_Lambda_0= ruleLambda
                    {

                    			newCompositeNode(grammarAccess.getMembershipFunctionAccess().getLambdaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lambda_0=ruleLambda();

                    state._fsp--;


                    			current = this_Lambda_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFuzzyDsl.g:751:3: this_Trapezoid_1= ruleTrapezoid
                    {

                    			newCompositeNode(grammarAccess.getMembershipFunctionAccess().getTrapezoidParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Trapezoid_1=ruleTrapezoid();

                    state._fsp--;


                    			current = this_Trapezoid_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFuzzyDsl.g:760:3: this_Alpha_2= ruleAlpha
                    {

                    			newCompositeNode(grammarAccess.getMembershipFunctionAccess().getAlphaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Alpha_2=ruleAlpha();

                    state._fsp--;


                    			current = this_Alpha_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMembershipFunction"


    // $ANTLR start "entryRuleAlpha"
    // InternalFuzzyDsl.g:772:1: entryRuleAlpha returns [EObject current=null] : iv_ruleAlpha= ruleAlpha EOF ;
    public final EObject entryRuleAlpha() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlpha = null;


        try {
            // InternalFuzzyDsl.g:772:46: (iv_ruleAlpha= ruleAlpha EOF )
            // InternalFuzzyDsl.g:773:2: iv_ruleAlpha= ruleAlpha EOF
            {
             newCompositeNode(grammarAccess.getAlphaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlpha=ruleAlpha();

            state._fsp--;

             current =iv_ruleAlpha; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlpha"


    // $ANTLR start "ruleAlpha"
    // InternalFuzzyDsl.g:779:1: ruleAlpha returns [EObject current=null] : ( () otherlv_1= 'alpha' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_b_8_0= RULE_DOUBLE ) ) otherlv_9= ')' ) ;
    public final EObject ruleAlpha() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_a_6_0=null;
        Token otherlv_7=null;
        Token lv_b_8_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:785:2: ( ( () otherlv_1= 'alpha' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_b_8_0= RULE_DOUBLE ) ) otherlv_9= ')' ) )
            // InternalFuzzyDsl.g:786:2: ( () otherlv_1= 'alpha' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_b_8_0= RULE_DOUBLE ) ) otherlv_9= ')' )
            {
            // InternalFuzzyDsl.g:786:2: ( () otherlv_1= 'alpha' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_b_8_0= RULE_DOUBLE ) ) otherlv_9= ')' )
            // InternalFuzzyDsl.g:787:3: () otherlv_1= 'alpha' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_b_8_0= RULE_DOUBLE ) ) otherlv_9= ')'
            {
            // InternalFuzzyDsl.g:787:3: ()
            // InternalFuzzyDsl.g:788:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlphaAccess().getAlphaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAlphaAccess().getAlphaKeyword_1());
            		
            // InternalFuzzyDsl.g:798:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFuzzyDsl.g:799:4: (lv_name_2_0= ruleEString )
            {
            // InternalFuzzyDsl.g:799:4: (lv_name_2_0= ruleEString )
            // InternalFuzzyDsl.g:800:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAlphaAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlphaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAlphaAccess().getOnKeyword_3());
            		
            // InternalFuzzyDsl.g:821:3: ( ( ruleEString ) )
            // InternalFuzzyDsl.g:822:4: ( ruleEString )
            {
            // InternalFuzzyDsl.g:822:4: ( ruleEString )
            // InternalFuzzyDsl.g:823:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlphaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAlphaAccess().getVariableVariableCrossReference_4_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getAlphaAccess().getLeftParenthesisKeyword_5());
            		
            // InternalFuzzyDsl.g:841:3: ( (lv_a_6_0= RULE_DOUBLE ) )
            // InternalFuzzyDsl.g:842:4: (lv_a_6_0= RULE_DOUBLE )
            {
            // InternalFuzzyDsl.g:842:4: (lv_a_6_0= RULE_DOUBLE )
            // InternalFuzzyDsl.g:843:5: lv_a_6_0= RULE_DOUBLE
            {
            lv_a_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_34); 

            					newLeafNode(lv_a_6_0, grammarAccess.getAlphaAccess().getADOUBLETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlphaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"a",
            						lv_a_6_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.DOUBLE");
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getAlphaAccess().getCommaKeyword_7());
            		
            // InternalFuzzyDsl.g:863:3: ( (lv_b_8_0= RULE_DOUBLE ) )
            // InternalFuzzyDsl.g:864:4: (lv_b_8_0= RULE_DOUBLE )
            {
            // InternalFuzzyDsl.g:864:4: (lv_b_8_0= RULE_DOUBLE )
            // InternalFuzzyDsl.g:865:5: lv_b_8_0= RULE_DOUBLE
            {
            lv_b_8_0=(Token)match(input,RULE_DOUBLE,FOLLOW_35); 

            					newLeafNode(lv_b_8_0, grammarAccess.getAlphaAccess().getBDOUBLETerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlphaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"b",
            						lv_b_8_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.DOUBLE");
            				

            }


            }

            otherlv_9=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAlphaAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlpha"


    // $ANTLR start "entryRuleLambda"
    // InternalFuzzyDsl.g:889:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalFuzzyDsl.g:889:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalFuzzyDsl.g:890:2: iv_ruleLambda= ruleLambda EOF
            {
             newCompositeNode(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLambda=ruleLambda();

            state._fsp--;

             current =iv_ruleLambda; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalFuzzyDsl.g:896:1: ruleLambda returns [EObject current=null] : ( () otherlv_1= 'lambda' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_u_8_0= RULE_DOUBLE ) ) otherlv_9= ',' ( (lv_b_10_0= RULE_DOUBLE ) ) otherlv_11= ')' ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_a_6_0=null;
        Token otherlv_7=null;
        Token lv_u_8_0=null;
        Token otherlv_9=null;
        Token lv_b_10_0=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:902:2: ( ( () otherlv_1= 'lambda' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_u_8_0= RULE_DOUBLE ) ) otherlv_9= ',' ( (lv_b_10_0= RULE_DOUBLE ) ) otherlv_11= ')' ) )
            // InternalFuzzyDsl.g:903:2: ( () otherlv_1= 'lambda' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_u_8_0= RULE_DOUBLE ) ) otherlv_9= ',' ( (lv_b_10_0= RULE_DOUBLE ) ) otherlv_11= ')' )
            {
            // InternalFuzzyDsl.g:903:2: ( () otherlv_1= 'lambda' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_u_8_0= RULE_DOUBLE ) ) otherlv_9= ',' ( (lv_b_10_0= RULE_DOUBLE ) ) otherlv_11= ')' )
            // InternalFuzzyDsl.g:904:3: () otherlv_1= 'lambda' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_u_8_0= RULE_DOUBLE ) ) otherlv_9= ',' ( (lv_b_10_0= RULE_DOUBLE ) ) otherlv_11= ')'
            {
            // InternalFuzzyDsl.g:904:3: ()
            // InternalFuzzyDsl.g:905:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLambdaAccess().getLambdaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLambdaAccess().getLambdaKeyword_1());
            		
            // InternalFuzzyDsl.g:915:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFuzzyDsl.g:916:4: (lv_name_2_0= ruleEString )
            {
            // InternalFuzzyDsl.g:916:4: (lv_name_2_0= ruleEString )
            // InternalFuzzyDsl.g:917:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLambdaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getLambdaAccess().getOnKeyword_3());
            		
            // InternalFuzzyDsl.g:938:3: ( ( ruleEString ) )
            // InternalFuzzyDsl.g:939:4: ( ruleEString )
            {
            // InternalFuzzyDsl.g:939:4: ( ruleEString )
            // InternalFuzzyDsl.g:940:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLambdaAccess().getVariableVariableCrossReference_4_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_5());
            		
            // InternalFuzzyDsl.g:958:3: ( (lv_a_6_0= RULE_DOUBLE ) )
            // InternalFuzzyDsl.g:959:4: (lv_a_6_0= RULE_DOUBLE )
            {
            // InternalFuzzyDsl.g:959:4: (lv_a_6_0= RULE_DOUBLE )
            // InternalFuzzyDsl.g:960:5: lv_a_6_0= RULE_DOUBLE
            {
            lv_a_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_34); 

            					newLeafNode(lv_a_6_0, grammarAccess.getLambdaAccess().getADOUBLETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"a",
            						lv_a_6_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.DOUBLE");
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getLambdaAccess().getCommaKeyword_7());
            		
            // InternalFuzzyDsl.g:980:3: ( (lv_u_8_0= RULE_DOUBLE ) )
            // InternalFuzzyDsl.g:981:4: (lv_u_8_0= RULE_DOUBLE )
            {
            // InternalFuzzyDsl.g:981:4: (lv_u_8_0= RULE_DOUBLE )
            // InternalFuzzyDsl.g:982:5: lv_u_8_0= RULE_DOUBLE
            {
            lv_u_8_0=(Token)match(input,RULE_DOUBLE,FOLLOW_34); 

            					newLeafNode(lv_u_8_0, grammarAccess.getLambdaAccess().getUDOUBLETerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"u",
            						lv_u_8_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.DOUBLE");
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getLambdaAccess().getCommaKeyword_9());
            		
            // InternalFuzzyDsl.g:1002:3: ( (lv_b_10_0= RULE_DOUBLE ) )
            // InternalFuzzyDsl.g:1003:4: (lv_b_10_0= RULE_DOUBLE )
            {
            // InternalFuzzyDsl.g:1003:4: (lv_b_10_0= RULE_DOUBLE )
            // InternalFuzzyDsl.g:1004:5: lv_b_10_0= RULE_DOUBLE
            {
            lv_b_10_0=(Token)match(input,RULE_DOUBLE,FOLLOW_35); 

            					newLeafNode(lv_b_10_0, grammarAccess.getLambdaAccess().getBDOUBLETerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"b",
            						lv_b_10_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.DOUBLE");
            				

            }


            }

            otherlv_11=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLambdaAccess().getRightParenthesisKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleTrapezoid"
    // InternalFuzzyDsl.g:1028:1: entryRuleTrapezoid returns [EObject current=null] : iv_ruleTrapezoid= ruleTrapezoid EOF ;
    public final EObject entryRuleTrapezoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrapezoid = null;


        try {
            // InternalFuzzyDsl.g:1028:50: (iv_ruleTrapezoid= ruleTrapezoid EOF )
            // InternalFuzzyDsl.g:1029:2: iv_ruleTrapezoid= ruleTrapezoid EOF
            {
             newCompositeNode(grammarAccess.getTrapezoidRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrapezoid=ruleTrapezoid();

            state._fsp--;

             current =iv_ruleTrapezoid; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrapezoid"


    // $ANTLR start "ruleTrapezoid"
    // InternalFuzzyDsl.g:1035:1: ruleTrapezoid returns [EObject current=null] : ( () otherlv_1= 'trapezoid' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_b_8_0= RULE_DOUBLE ) ) otherlv_9= ')' ) ;
    public final EObject ruleTrapezoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_a_6_0=null;
        Token otherlv_7=null;
        Token lv_b_8_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:1041:2: ( ( () otherlv_1= 'trapezoid' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_b_8_0= RULE_DOUBLE ) ) otherlv_9= ')' ) )
            // InternalFuzzyDsl.g:1042:2: ( () otherlv_1= 'trapezoid' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_b_8_0= RULE_DOUBLE ) ) otherlv_9= ')' )
            {
            // InternalFuzzyDsl.g:1042:2: ( () otherlv_1= 'trapezoid' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_b_8_0= RULE_DOUBLE ) ) otherlv_9= ')' )
            // InternalFuzzyDsl.g:1043:3: () otherlv_1= 'trapezoid' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' ( ( ruleEString ) ) otherlv_5= '(' ( (lv_a_6_0= RULE_DOUBLE ) ) otherlv_7= ',' ( (lv_b_8_0= RULE_DOUBLE ) ) otherlv_9= ')'
            {
            // InternalFuzzyDsl.g:1043:3: ()
            // InternalFuzzyDsl.g:1044:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrapezoidAccess().getTrapezoidAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTrapezoidAccess().getTrapezoidKeyword_1());
            		
            // InternalFuzzyDsl.g:1054:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFuzzyDsl.g:1055:4: (lv_name_2_0= ruleEString )
            {
            // InternalFuzzyDsl.g:1055:4: (lv_name_2_0= ruleEString )
            // InternalFuzzyDsl.g:1056:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTrapezoidAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrapezoidRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTrapezoidAccess().getOnKeyword_3());
            		
            // InternalFuzzyDsl.g:1077:3: ( ( ruleEString ) )
            // InternalFuzzyDsl.g:1078:4: ( ruleEString )
            {
            // InternalFuzzyDsl.g:1078:4: ( ruleEString )
            // InternalFuzzyDsl.g:1079:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrapezoidRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTrapezoidAccess().getVariableVariableCrossReference_4_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getTrapezoidAccess().getLeftParenthesisKeyword_5());
            		
            // InternalFuzzyDsl.g:1097:3: ( (lv_a_6_0= RULE_DOUBLE ) )
            // InternalFuzzyDsl.g:1098:4: (lv_a_6_0= RULE_DOUBLE )
            {
            // InternalFuzzyDsl.g:1098:4: (lv_a_6_0= RULE_DOUBLE )
            // InternalFuzzyDsl.g:1099:5: lv_a_6_0= RULE_DOUBLE
            {
            lv_a_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_34); 

            					newLeafNode(lv_a_6_0, grammarAccess.getTrapezoidAccess().getADOUBLETerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrapezoidRule());
            					}
            					setWithLastConsumed(
            						current,
            						"a",
            						lv_a_6_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.DOUBLE");
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getTrapezoidAccess().getCommaKeyword_7());
            		
            // InternalFuzzyDsl.g:1119:3: ( (lv_b_8_0= RULE_DOUBLE ) )
            // InternalFuzzyDsl.g:1120:4: (lv_b_8_0= RULE_DOUBLE )
            {
            // InternalFuzzyDsl.g:1120:4: (lv_b_8_0= RULE_DOUBLE )
            // InternalFuzzyDsl.g:1121:5: lv_b_8_0= RULE_DOUBLE
            {
            lv_b_8_0=(Token)match(input,RULE_DOUBLE,FOLLOW_35); 

            					newLeafNode(lv_b_8_0, grammarAccess.getTrapezoidAccess().getBDOUBLETerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrapezoidRule());
            					}
            					setWithLastConsumed(
            						current,
            						"b",
            						lv_b_8_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.DOUBLE");
            				

            }


            }

            otherlv_9=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTrapezoidAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrapezoid"


    // $ANTLR start "entryRuleRuleSet"
    // InternalFuzzyDsl.g:1145:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // InternalFuzzyDsl.g:1145:48: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalFuzzyDsl.g:1146:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // InternalFuzzyDsl.g:1152:1: ruleRuleSet returns [EObject current=null] : (this_DiscreteEventRuleset_0= ruleDiscreteEventRuleset | this_ContinuousEventRuleSet_1= ruleContinuousEventRuleSet ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject this_DiscreteEventRuleset_0 = null;

        EObject this_ContinuousEventRuleSet_1 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:1158:2: ( (this_DiscreteEventRuleset_0= ruleDiscreteEventRuleset | this_ContinuousEventRuleSet_1= ruleContinuousEventRuleSet ) )
            // InternalFuzzyDsl.g:1159:2: (this_DiscreteEventRuleset_0= ruleDiscreteEventRuleset | this_ContinuousEventRuleSet_1= ruleContinuousEventRuleSet )
            {
            // InternalFuzzyDsl.g:1159:2: (this_DiscreteEventRuleset_0= ruleDiscreteEventRuleset | this_ContinuousEventRuleSet_1= ruleContinuousEventRuleSet )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            else if ( (LA13_0==44) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalFuzzyDsl.g:1160:3: this_DiscreteEventRuleset_0= ruleDiscreteEventRuleset
                    {

                    			newCompositeNode(grammarAccess.getRuleSetAccess().getDiscreteEventRulesetParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiscreteEventRuleset_0=ruleDiscreteEventRuleset();

                    state._fsp--;


                    			current = this_DiscreteEventRuleset_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFuzzyDsl.g:1169:3: this_ContinuousEventRuleSet_1= ruleContinuousEventRuleSet
                    {

                    			newCompositeNode(grammarAccess.getRuleSetAccess().getContinuousEventRuleSetParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContinuousEventRuleSet_1=ruleContinuousEventRuleSet();

                    state._fsp--;


                    			current = this_ContinuousEventRuleSet_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleDiscreteEventRuleset"
    // InternalFuzzyDsl.g:1181:1: entryRuleDiscreteEventRuleset returns [EObject current=null] : iv_ruleDiscreteEventRuleset= ruleDiscreteEventRuleset EOF ;
    public final EObject entryRuleDiscreteEventRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscreteEventRuleset = null;


        try {
            // InternalFuzzyDsl.g:1181:61: (iv_ruleDiscreteEventRuleset= ruleDiscreteEventRuleset EOF )
            // InternalFuzzyDsl.g:1182:2: iv_ruleDiscreteEventRuleset= ruleDiscreteEventRuleset EOF
            {
             newCompositeNode(grammarAccess.getDiscreteEventRulesetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiscreteEventRuleset=ruleDiscreteEventRuleset();

            state._fsp--;

             current =iv_ruleDiscreteEventRuleset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiscreteEventRuleset"


    // $ANTLR start "ruleDiscreteEventRuleset"
    // InternalFuzzyDsl.g:1188:1: ruleDiscreteEventRuleset returns [EObject current=null] : ( () otherlv_1= 'discreteeventruleset' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'discreteevents' ( (lv_discreteevent_4_0= ruleDiscreteEvent ) ) (otherlv_5= ',' ( (lv_discreteevent_6_0= ruleDiscreteEvent ) ) )* )? otherlv_7= 'endevents' otherlv_8= 'endruleset' ) ;
    public final EObject ruleDiscreteEventRuleset() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_discreteevent_4_0 = null;

        EObject lv_discreteevent_6_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:1194:2: ( ( () otherlv_1= 'discreteeventruleset' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'discreteevents' ( (lv_discreteevent_4_0= ruleDiscreteEvent ) ) (otherlv_5= ',' ( (lv_discreteevent_6_0= ruleDiscreteEvent ) ) )* )? otherlv_7= 'endevents' otherlv_8= 'endruleset' ) )
            // InternalFuzzyDsl.g:1195:2: ( () otherlv_1= 'discreteeventruleset' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'discreteevents' ( (lv_discreteevent_4_0= ruleDiscreteEvent ) ) (otherlv_5= ',' ( (lv_discreteevent_6_0= ruleDiscreteEvent ) ) )* )? otherlv_7= 'endevents' otherlv_8= 'endruleset' )
            {
            // InternalFuzzyDsl.g:1195:2: ( () otherlv_1= 'discreteeventruleset' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'discreteevents' ( (lv_discreteevent_4_0= ruleDiscreteEvent ) ) (otherlv_5= ',' ( (lv_discreteevent_6_0= ruleDiscreteEvent ) ) )* )? otherlv_7= 'endevents' otherlv_8= 'endruleset' )
            // InternalFuzzyDsl.g:1196:3: () otherlv_1= 'discreteeventruleset' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'discreteevents' ( (lv_discreteevent_4_0= ruleDiscreteEvent ) ) (otherlv_5= ',' ( (lv_discreteevent_6_0= ruleDiscreteEvent ) ) )* )? otherlv_7= 'endevents' otherlv_8= 'endruleset'
            {
            // InternalFuzzyDsl.g:1196:3: ()
            // InternalFuzzyDsl.g:1197:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiscreteEventRulesetAccess().getDiscreteEventRulesetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDiscreteEventRulesetAccess().getDiscreteeventrulesetKeyword_1());
            		
            // InternalFuzzyDsl.g:1207:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFuzzyDsl.g:1208:4: (lv_name_2_0= ruleEString )
            {
            // InternalFuzzyDsl.g:1208:4: (lv_name_2_0= ruleEString )
            // InternalFuzzyDsl.g:1209:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDiscreteEventRulesetAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiscreteEventRulesetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyDsl.g:1226:3: (otherlv_3= 'discreteevents' ( (lv_discreteevent_4_0= ruleDiscreteEvent ) ) (otherlv_5= ',' ( (lv_discreteevent_6_0= ruleDiscreteEvent ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFuzzyDsl.g:1227:4: otherlv_3= 'discreteevents' ( (lv_discreteevent_4_0= ruleDiscreteEvent ) ) (otherlv_5= ',' ( (lv_discreteevent_6_0= ruleDiscreteEvent ) ) )*
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getDiscreteEventRulesetAccess().getDiscreteeventsKeyword_3_0());
                    			
                    // InternalFuzzyDsl.g:1231:4: ( (lv_discreteevent_4_0= ruleDiscreteEvent ) )
                    // InternalFuzzyDsl.g:1232:5: (lv_discreteevent_4_0= ruleDiscreteEvent )
                    {
                    // InternalFuzzyDsl.g:1232:5: (lv_discreteevent_4_0= ruleDiscreteEvent )
                    // InternalFuzzyDsl.g:1233:6: lv_discreteevent_4_0= ruleDiscreteEvent
                    {

                    						newCompositeNode(grammarAccess.getDiscreteEventRulesetAccess().getDiscreteeventDiscreteEventParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_discreteevent_4_0=ruleDiscreteEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDiscreteEventRulesetRule());
                    						}
                    						add(
                    							current,
                    							"discreteevent",
                    							lv_discreteevent_4_0,
                    							"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.DiscreteEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFuzzyDsl.g:1250:4: (otherlv_5= ',' ( (lv_discreteevent_6_0= ruleDiscreteEvent ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==13) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalFuzzyDsl.g:1251:5: otherlv_5= ',' ( (lv_discreteevent_6_0= ruleDiscreteEvent ) )
                    	    {
                    	    otherlv_5=(Token)match(input,13,FOLLOW_37); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDiscreteEventRulesetAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalFuzzyDsl.g:1255:5: ( (lv_discreteevent_6_0= ruleDiscreteEvent ) )
                    	    // InternalFuzzyDsl.g:1256:6: (lv_discreteevent_6_0= ruleDiscreteEvent )
                    	    {
                    	    // InternalFuzzyDsl.g:1256:6: (lv_discreteevent_6_0= ruleDiscreteEvent )
                    	    // InternalFuzzyDsl.g:1257:7: lv_discreteevent_6_0= ruleDiscreteEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getDiscreteEventRulesetAccess().getDiscreteeventDiscreteEventParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_discreteevent_6_0=ruleDiscreteEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDiscreteEventRulesetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"discreteevent",
                    	    								lv_discreteevent_6_0,
                    	    								"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.DiscreteEvent");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,43,FOLLOW_39); 

            			newLeafNode(otherlv_7, grammarAccess.getDiscreteEventRulesetAccess().getEndeventsKeyword_4());
            		
            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDiscreteEventRulesetAccess().getEndrulesetKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiscreteEventRuleset"


    // $ANTLR start "entryRuleContinuousEventRuleSet"
    // InternalFuzzyDsl.g:1288:1: entryRuleContinuousEventRuleSet returns [EObject current=null] : iv_ruleContinuousEventRuleSet= ruleContinuousEventRuleSet EOF ;
    public final EObject entryRuleContinuousEventRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinuousEventRuleSet = null;


        try {
            // InternalFuzzyDsl.g:1288:63: (iv_ruleContinuousEventRuleSet= ruleContinuousEventRuleSet EOF )
            // InternalFuzzyDsl.g:1289:2: iv_ruleContinuousEventRuleSet= ruleContinuousEventRuleSet EOF
            {
             newCompositeNode(grammarAccess.getContinuousEventRuleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContinuousEventRuleSet=ruleContinuousEventRuleSet();

            state._fsp--;

             current =iv_ruleContinuousEventRuleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContinuousEventRuleSet"


    // $ANTLR start "ruleContinuousEventRuleSet"
    // InternalFuzzyDsl.g:1295:1: ruleContinuousEventRuleSet returns [EObject current=null] : ( () otherlv_1= 'continouseventruleset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'rules' ( (lv_rule_4_0= ruleRule ) ) ( (lv_rule_5_0= ruleRule ) )* otherlv_6= 'endrules' otherlv_7= 'endruleset' ) ;
    public final EObject ruleContinuousEventRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rule_4_0 = null;

        EObject lv_rule_5_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:1301:2: ( ( () otherlv_1= 'continouseventruleset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'rules' ( (lv_rule_4_0= ruleRule ) ) ( (lv_rule_5_0= ruleRule ) )* otherlv_6= 'endrules' otherlv_7= 'endruleset' ) )
            // InternalFuzzyDsl.g:1302:2: ( () otherlv_1= 'continouseventruleset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'rules' ( (lv_rule_4_0= ruleRule ) ) ( (lv_rule_5_0= ruleRule ) )* otherlv_6= 'endrules' otherlv_7= 'endruleset' )
            {
            // InternalFuzzyDsl.g:1302:2: ( () otherlv_1= 'continouseventruleset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'rules' ( (lv_rule_4_0= ruleRule ) ) ( (lv_rule_5_0= ruleRule ) )* otherlv_6= 'endrules' otherlv_7= 'endruleset' )
            // InternalFuzzyDsl.g:1303:3: () otherlv_1= 'continouseventruleset' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'rules' ( (lv_rule_4_0= ruleRule ) ) ( (lv_rule_5_0= ruleRule ) )* otherlv_6= 'endrules' otherlv_7= 'endruleset'
            {
            // InternalFuzzyDsl.g:1303:3: ()
            // InternalFuzzyDsl.g:1304:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContinuousEventRuleSetAccess().getContinuousEventRulesetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContinuousEventRuleSetAccess().getContinouseventrulesetKeyword_1());
            		
            // InternalFuzzyDsl.g:1314:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFuzzyDsl.g:1315:4: (lv_name_2_0= ruleEString )
            {
            // InternalFuzzyDsl.g:1315:4: (lv_name_2_0= ruleEString )
            // InternalFuzzyDsl.g:1316:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContinuousEventRuleSetAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContinuousEventRuleSetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getContinuousEventRuleSetAccess().getRulesKeyword_3());
            		
            // InternalFuzzyDsl.g:1337:3: ( (lv_rule_4_0= ruleRule ) )
            // InternalFuzzyDsl.g:1338:4: (lv_rule_4_0= ruleRule )
            {
            // InternalFuzzyDsl.g:1338:4: (lv_rule_4_0= ruleRule )
            // InternalFuzzyDsl.g:1339:5: lv_rule_4_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getContinuousEventRuleSetAccess().getRuleRuleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_42);
            lv_rule_4_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContinuousEventRuleSetRule());
            					}
            					add(
            						current,
            						"rule",
            						lv_rule_4_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyDsl.g:1356:3: ( (lv_rule_5_0= ruleRule ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==48||LA16_0==52) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFuzzyDsl.g:1357:4: (lv_rule_5_0= ruleRule )
            	    {
            	    // InternalFuzzyDsl.g:1357:4: (lv_rule_5_0= ruleRule )
            	    // InternalFuzzyDsl.g:1358:5: lv_rule_5_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getContinuousEventRuleSetAccess().getRuleRuleParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_rule_5_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContinuousEventRuleSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rule",
            	    						lv_rule_5_0,
            	    						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_6, grammarAccess.getContinuousEventRuleSetAccess().getEndrulesKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getContinuousEventRuleSetAccess().getEndrulesetKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContinuousEventRuleSet"


    // $ANTLR start "entryRuleDiscreteEvent"
    // InternalFuzzyDsl.g:1387:1: entryRuleDiscreteEvent returns [EObject current=null] : iv_ruleDiscreteEvent= ruleDiscreteEvent EOF ;
    public final EObject entryRuleDiscreteEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscreteEvent = null;


        try {
            // InternalFuzzyDsl.g:1387:54: (iv_ruleDiscreteEvent= ruleDiscreteEvent EOF )
            // InternalFuzzyDsl.g:1388:2: iv_ruleDiscreteEvent= ruleDiscreteEvent EOF
            {
             newCompositeNode(grammarAccess.getDiscreteEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiscreteEvent=ruleDiscreteEvent();

            state._fsp--;

             current =iv_ruleDiscreteEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiscreteEvent"


    // $ANTLR start "ruleDiscreteEvent"
    // InternalFuzzyDsl.g:1394:1: ruleDiscreteEvent returns [EObject current=null] : ( () otherlv_1= 'discreteevent' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDiscreteEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:1400:2: ( ( () otherlv_1= 'discreteevent' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalFuzzyDsl.g:1401:2: ( () otherlv_1= 'discreteevent' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalFuzzyDsl.g:1401:2: ( () otherlv_1= 'discreteevent' ( (lv_name_2_0= ruleEString ) ) )
            // InternalFuzzyDsl.g:1402:3: () otherlv_1= 'discreteevent' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalFuzzyDsl.g:1402:3: ()
            // InternalFuzzyDsl.g:1403:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDiscreteEventAccess().getDiscreteEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDiscreteEventAccess().getDiscreteeventKeyword_1());
            		
            // InternalFuzzyDsl.g:1413:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFuzzyDsl.g:1414:4: (lv_name_2_0= ruleEString )
            {
            // InternalFuzzyDsl.g:1414:4: (lv_name_2_0= ruleEString )
            // InternalFuzzyDsl.g:1415:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDiscreteEventAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiscreteEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiscreteEvent"


    // $ANTLR start "entryRuleRule"
    // InternalFuzzyDsl.g:1436:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalFuzzyDsl.g:1436:45: (iv_ruleRule= ruleRule EOF )
            // InternalFuzzyDsl.g:1437:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalFuzzyDsl.g:1443:1: ruleRule returns [EObject current=null] : (this_FuzzyRule_0= ruleFuzzyRule | this_CrispGuard_1= ruleCrispGuard ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_FuzzyRule_0 = null;

        EObject this_CrispGuard_1 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:1449:2: ( (this_FuzzyRule_0= ruleFuzzyRule | this_CrispGuard_1= ruleCrispGuard ) )
            // InternalFuzzyDsl.g:1450:2: (this_FuzzyRule_0= ruleFuzzyRule | this_CrispGuard_1= ruleCrispGuard )
            {
            // InternalFuzzyDsl.g:1450:2: (this_FuzzyRule_0= ruleFuzzyRule | this_CrispGuard_1= ruleCrispGuard )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            else if ( (LA17_0==48) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalFuzzyDsl.g:1451:3: this_FuzzyRule_0= ruleFuzzyRule
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getFuzzyRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FuzzyRule_0=ruleFuzzyRule();

                    state._fsp--;


                    			current = this_FuzzyRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFuzzyDsl.g:1460:3: this_CrispGuard_1= ruleCrispGuard
                    {

                    			newCompositeNode(grammarAccess.getRuleAccess().getCrispGuardParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CrispGuard_1=ruleCrispGuard();

                    state._fsp--;


                    			current = this_CrispGuard_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCrispGuard"
    // InternalFuzzyDsl.g:1472:1: entryRuleCrispGuard returns [EObject current=null] : iv_ruleCrispGuard= ruleCrispGuard EOF ;
    public final EObject entryRuleCrispGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrispGuard = null;


        try {
            // InternalFuzzyDsl.g:1472:51: (iv_ruleCrispGuard= ruleCrispGuard EOF )
            // InternalFuzzyDsl.g:1473:2: iv_ruleCrispGuard= ruleCrispGuard EOF
            {
             newCompositeNode(grammarAccess.getCrispGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrispGuard=ruleCrispGuard();

            state._fsp--;

             current =iv_ruleCrispGuard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCrispGuard"


    // $ANTLR start "ruleCrispGuard"
    // InternalFuzzyDsl.g:1479:1: ruleCrispGuard returns [EObject current=null] : ( () otherlv_1= 'crisprule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_relationexpression_4_0= ruleRelationExpression ) ) ) ;
    public final EObject ruleCrispGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_relationexpression_4_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:1485:2: ( ( () otherlv_1= 'crisprule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_relationexpression_4_0= ruleRelationExpression ) ) ) )
            // InternalFuzzyDsl.g:1486:2: ( () otherlv_1= 'crisprule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_relationexpression_4_0= ruleRelationExpression ) ) )
            {
            // InternalFuzzyDsl.g:1486:2: ( () otherlv_1= 'crisprule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_relationexpression_4_0= ruleRelationExpression ) ) )
            // InternalFuzzyDsl.g:1487:3: () otherlv_1= 'crisprule' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':=' ( (lv_relationexpression_4_0= ruleRelationExpression ) )
            {
            // InternalFuzzyDsl.g:1487:3: ()
            // InternalFuzzyDsl.g:1488:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCrispGuardAccess().getCrispGuardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCrispGuardAccess().getCrispruleKeyword_1());
            		
            // InternalFuzzyDsl.g:1498:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFuzzyDsl.g:1499:4: (lv_name_2_0= ruleEString )
            {
            // InternalFuzzyDsl.g:1499:4: (lv_name_2_0= ruleEString )
            // InternalFuzzyDsl.g:1500:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCrispGuardAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_43);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCrispGuardRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getCrispGuardAccess().getColonEqualsSignKeyword_3());
            		
            // InternalFuzzyDsl.g:1521:3: ( (lv_relationexpression_4_0= ruleRelationExpression ) )
            // InternalFuzzyDsl.g:1522:4: (lv_relationexpression_4_0= ruleRelationExpression )
            {
            // InternalFuzzyDsl.g:1522:4: (lv_relationexpression_4_0= ruleRelationExpression )
            // InternalFuzzyDsl.g:1523:5: lv_relationexpression_4_0= ruleRelationExpression
            {

            					newCompositeNode(grammarAccess.getCrispGuardAccess().getRelationexpressionRelationExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_relationexpression_4_0=ruleRelationExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCrispGuardRule());
            					}
            					set(
            						current,
            						"relationexpression",
            						lv_relationexpression_4_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.RelationExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrispGuard"


    // $ANTLR start "entryRuleRelationExpression"
    // InternalFuzzyDsl.g:1544:1: entryRuleRelationExpression returns [EObject current=null] : iv_ruleRelationExpression= ruleRelationExpression EOF ;
    public final EObject entryRuleRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationExpression = null;


        try {
            // InternalFuzzyDsl.g:1544:59: (iv_ruleRelationExpression= ruleRelationExpression EOF )
            // InternalFuzzyDsl.g:1545:2: iv_ruleRelationExpression= ruleRelationExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationExpression=ruleRelationExpression();

            state._fsp--;

             current =iv_ruleRelationExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationExpression"


    // $ANTLR start "ruleRelationExpression"
    // InternalFuzzyDsl.g:1551:1: ruleRelationExpression returns [EObject current=null] : (this_GreaterExpression_0= ruleGreaterExpression | this_LessExpression_1= ruleLessExpression ) ;
    public final EObject ruleRelationExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GreaterExpression_0 = null;

        EObject this_LessExpression_1 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:1557:2: ( (this_GreaterExpression_0= ruleGreaterExpression | this_LessExpression_1= ruleLessExpression ) )
            // InternalFuzzyDsl.g:1558:2: (this_GreaterExpression_0= ruleGreaterExpression | this_LessExpression_1= ruleLessExpression )
            {
            // InternalFuzzyDsl.g:1558:2: (this_GreaterExpression_0= ruleGreaterExpression | this_LessExpression_1= ruleLessExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==51) ) {
                    alt18=2;
                }
                else if ( (LA18_1==50) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==RULE_ID) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==51) ) {
                    alt18=2;
                }
                else if ( (LA18_2==50) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalFuzzyDsl.g:1559:3: this_GreaterExpression_0= ruleGreaterExpression
                    {

                    			newCompositeNode(grammarAccess.getRelationExpressionAccess().getGreaterExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GreaterExpression_0=ruleGreaterExpression();

                    state._fsp--;


                    			current = this_GreaterExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFuzzyDsl.g:1568:3: this_LessExpression_1= ruleLessExpression
                    {

                    			newCompositeNode(grammarAccess.getRelationExpressionAccess().getLessExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LessExpression_1=ruleLessExpression();

                    state._fsp--;


                    			current = this_LessExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationExpression"


    // $ANTLR start "entryRuleGreaterExpression"
    // InternalFuzzyDsl.g:1580:1: entryRuleGreaterExpression returns [EObject current=null] : iv_ruleGreaterExpression= ruleGreaterExpression EOF ;
    public final EObject entryRuleGreaterExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterExpression = null;


        try {
            // InternalFuzzyDsl.g:1580:58: (iv_ruleGreaterExpression= ruleGreaterExpression EOF )
            // InternalFuzzyDsl.g:1581:2: iv_ruleGreaterExpression= ruleGreaterExpression EOF
            {
             newCompositeNode(grammarAccess.getGreaterExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreaterExpression=ruleGreaterExpression();

            state._fsp--;

             current =iv_ruleGreaterExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreaterExpression"


    // $ANTLR start "ruleGreaterExpression"
    // InternalFuzzyDsl.g:1587:1: ruleGreaterExpression returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= '>' ( (lv_c_3_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleGreaterExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_c_3_0=null;


        	enterRule();

        try {
            // InternalFuzzyDsl.g:1593:2: ( ( () ( ( ruleEString ) ) otherlv_2= '>' ( (lv_c_3_0= RULE_DOUBLE ) ) ) )
            // InternalFuzzyDsl.g:1594:2: ( () ( ( ruleEString ) ) otherlv_2= '>' ( (lv_c_3_0= RULE_DOUBLE ) ) )
            {
            // InternalFuzzyDsl.g:1594:2: ( () ( ( ruleEString ) ) otherlv_2= '>' ( (lv_c_3_0= RULE_DOUBLE ) ) )
            // InternalFuzzyDsl.g:1595:3: () ( ( ruleEString ) ) otherlv_2= '>' ( (lv_c_3_0= RULE_DOUBLE ) )
            {
            // InternalFuzzyDsl.g:1595:3: ()
            // InternalFuzzyDsl.g:1596:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGreaterExpressionAccess().getGreaterExpressionAction_0(),
            					current);
            			

            }

            // InternalFuzzyDsl.g:1602:3: ( ( ruleEString ) )
            // InternalFuzzyDsl.g:1603:4: ( ruleEString )
            {
            // InternalFuzzyDsl.g:1603:4: ( ruleEString )
            // InternalFuzzyDsl.g:1604:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreaterExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGreaterExpressionAccess().getVariableVariableCrossReference_1_0());
            				
            pushFollow(FOLLOW_44);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,50,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getGreaterExpressionAccess().getGreaterThanSignKeyword_2());
            		
            // InternalFuzzyDsl.g:1622:3: ( (lv_c_3_0= RULE_DOUBLE ) )
            // InternalFuzzyDsl.g:1623:4: (lv_c_3_0= RULE_DOUBLE )
            {
            // InternalFuzzyDsl.g:1623:4: (lv_c_3_0= RULE_DOUBLE )
            // InternalFuzzyDsl.g:1624:5: lv_c_3_0= RULE_DOUBLE
            {
            lv_c_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            					newLeafNode(lv_c_3_0, grammarAccess.getGreaterExpressionAccess().getCDOUBLETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreaterExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"c",
            						lv_c_3_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.DOUBLE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreaterExpression"


    // $ANTLR start "entryRuleLessExpression"
    // InternalFuzzyDsl.g:1644:1: entryRuleLessExpression returns [EObject current=null] : iv_ruleLessExpression= ruleLessExpression EOF ;
    public final EObject entryRuleLessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessExpression = null;


        try {
            // InternalFuzzyDsl.g:1644:55: (iv_ruleLessExpression= ruleLessExpression EOF )
            // InternalFuzzyDsl.g:1645:2: iv_ruleLessExpression= ruleLessExpression EOF
            {
             newCompositeNode(grammarAccess.getLessExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLessExpression=ruleLessExpression();

            state._fsp--;

             current =iv_ruleLessExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLessExpression"


    // $ANTLR start "ruleLessExpression"
    // InternalFuzzyDsl.g:1651:1: ruleLessExpression returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= '<' ( (lv_c_3_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleLessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_c_3_0=null;


        	enterRule();

        try {
            // InternalFuzzyDsl.g:1657:2: ( ( () ( ( ruleEString ) ) otherlv_2= '<' ( (lv_c_3_0= RULE_DOUBLE ) ) ) )
            // InternalFuzzyDsl.g:1658:2: ( () ( ( ruleEString ) ) otherlv_2= '<' ( (lv_c_3_0= RULE_DOUBLE ) ) )
            {
            // InternalFuzzyDsl.g:1658:2: ( () ( ( ruleEString ) ) otherlv_2= '<' ( (lv_c_3_0= RULE_DOUBLE ) ) )
            // InternalFuzzyDsl.g:1659:3: () ( ( ruleEString ) ) otherlv_2= '<' ( (lv_c_3_0= RULE_DOUBLE ) )
            {
            // InternalFuzzyDsl.g:1659:3: ()
            // InternalFuzzyDsl.g:1660:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLessExpressionAccess().getLessExpressionAction_0(),
            					current);
            			

            }

            // InternalFuzzyDsl.g:1666:3: ( ( ruleEString ) )
            // InternalFuzzyDsl.g:1667:4: ( ruleEString )
            {
            // InternalFuzzyDsl.g:1667:4: ( ruleEString )
            // InternalFuzzyDsl.g:1668:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLessExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLessExpressionAccess().getVariableVariableCrossReference_1_0());
            				
            pushFollow(FOLLOW_45);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getLessExpressionAccess().getLessThanSignKeyword_2());
            		
            // InternalFuzzyDsl.g:1686:3: ( (lv_c_3_0= RULE_DOUBLE ) )
            // InternalFuzzyDsl.g:1687:4: (lv_c_3_0= RULE_DOUBLE )
            {
            // InternalFuzzyDsl.g:1687:4: (lv_c_3_0= RULE_DOUBLE )
            // InternalFuzzyDsl.g:1688:5: lv_c_3_0= RULE_DOUBLE
            {
            lv_c_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            					newLeafNode(lv_c_3_0, grammarAccess.getLessExpressionAccess().getCDOUBLETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLessExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"c",
            						lv_c_3_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.DOUBLE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLessExpression"


    // $ANTLR start "entryRuleFuzzyRule"
    // InternalFuzzyDsl.g:1708:1: entryRuleFuzzyRule returns [EObject current=null] : iv_ruleFuzzyRule= ruleFuzzyRule EOF ;
    public final EObject entryRuleFuzzyRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuzzyRule = null;


        try {
            // InternalFuzzyDsl.g:1708:50: (iv_ruleFuzzyRule= ruleFuzzyRule EOF )
            // InternalFuzzyDsl.g:1709:2: iv_ruleFuzzyRule= ruleFuzzyRule EOF
            {
             newCompositeNode(grammarAccess.getFuzzyRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuzzyRule=ruleFuzzyRule();

            state._fsp--;

             current =iv_ruleFuzzyRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuzzyRule"


    // $ANTLR start "ruleFuzzyRule"
    // InternalFuzzyDsl.g:1715:1: ruleFuzzyRule returns [EObject current=null] : ( () otherlv_1= 'fuzzyrule' otherlv_2= 'end' ) ;
    public final EObject ruleFuzzyRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalFuzzyDsl.g:1721:2: ( ( () otherlv_1= 'fuzzyrule' otherlv_2= 'end' ) )
            // InternalFuzzyDsl.g:1722:2: ( () otherlv_1= 'fuzzyrule' otherlv_2= 'end' )
            {
            // InternalFuzzyDsl.g:1722:2: ( () otherlv_1= 'fuzzyrule' otherlv_2= 'end' )
            // InternalFuzzyDsl.g:1723:3: () otherlv_1= 'fuzzyrule' otherlv_2= 'end'
            {
            // InternalFuzzyDsl.g:1723:3: ()
            // InternalFuzzyDsl.g:1724:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFuzzyRuleAccess().getFuzzyRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getFuzzyRuleAccess().getFuzzyruleKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFuzzyRuleAccess().getEndKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuzzyRule"


    // $ANTLR start "entryRuleLocation"
    // InternalFuzzyDsl.g:1742:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalFuzzyDsl.g:1742:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalFuzzyDsl.g:1743:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalFuzzyDsl.g:1749:1: ruleLocation returns [EObject current=null] : ( () otherlv_1= 'location' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'do' ( ( ruleEString ) ) )? otherlv_5= 'end' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:1755:2: ( ( () otherlv_1= 'location' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'do' ( ( ruleEString ) ) )? otherlv_5= 'end' ) )
            // InternalFuzzyDsl.g:1756:2: ( () otherlv_1= 'location' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'do' ( ( ruleEString ) ) )? otherlv_5= 'end' )
            {
            // InternalFuzzyDsl.g:1756:2: ( () otherlv_1= 'location' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'do' ( ( ruleEString ) ) )? otherlv_5= 'end' )
            // InternalFuzzyDsl.g:1757:3: () otherlv_1= 'location' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'do' ( ( ruleEString ) ) )? otherlv_5= 'end'
            {
            // InternalFuzzyDsl.g:1757:3: ()
            // InternalFuzzyDsl.g:1758:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLocationAccess().getLocationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getLocationKeyword_1());
            		
            // InternalFuzzyDsl.g:1768:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFuzzyDsl.g:1769:4: (lv_name_2_0= ruleEString )
            {
            // InternalFuzzyDsl.g:1769:4: (lv_name_2_0= ruleEString )
            // InternalFuzzyDsl.g:1770:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyDsl.g:1787:3: (otherlv_3= 'do' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==54) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFuzzyDsl.g:1788:4: otherlv_3= 'do' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getDoKeyword_3_0());
                    			
                    // InternalFuzzyDsl.g:1792:4: ( ( ruleEString ) )
                    // InternalFuzzyDsl.g:1793:5: ( ruleEString )
                    {
                    // InternalFuzzyDsl.g:1793:5: ( ruleEString )
                    // InternalFuzzyDsl.g:1794:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLocationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getLocationAccess().getCyclicactionActionDefinitionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLocationAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleTransition"
    // InternalFuzzyDsl.g:1817:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalFuzzyDsl.g:1817:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalFuzzyDsl.g:1818:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalFuzzyDsl.g:1824:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) ) otherlv_7= 'trigger' ( ( ruleEString ) ) (otherlv_9= 'action' ( ( ruleEString ) ) )? (otherlv_11= 'invariant' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:1830:2: ( ( () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) ) otherlv_7= 'trigger' ( ( ruleEString ) ) (otherlv_9= 'action' ( ( ruleEString ) ) )? (otherlv_11= 'invariant' ( ( ruleEString ) ) )? ) )
            // InternalFuzzyDsl.g:1831:2: ( () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) ) otherlv_7= 'trigger' ( ( ruleEString ) ) (otherlv_9= 'action' ( ( ruleEString ) ) )? (otherlv_11= 'invariant' ( ( ruleEString ) ) )? )
            {
            // InternalFuzzyDsl.g:1831:2: ( () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) ) otherlv_7= 'trigger' ( ( ruleEString ) ) (otherlv_9= 'action' ( ( ruleEString ) ) )? (otherlv_11= 'invariant' ( ( ruleEString ) ) )? )
            // InternalFuzzyDsl.g:1832:3: () otherlv_1= 'transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) ) otherlv_5= '->' ( ( ruleEString ) ) otherlv_7= 'trigger' ( ( ruleEString ) ) (otherlv_9= 'action' ( ( ruleEString ) ) )? (otherlv_11= 'invariant' ( ( ruleEString ) ) )?
            {
            // InternalFuzzyDsl.g:1832:3: ()
            // InternalFuzzyDsl.g:1833:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            // InternalFuzzyDsl.g:1843:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFuzzyDsl.g:1844:4: (lv_name_2_0= ruleEString )
            {
            // InternalFuzzyDsl.g:1844:4: (lv_name_2_0= ruleEString )
            // InternalFuzzyDsl.g:1845:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getColonKeyword_3());
            		
            // InternalFuzzyDsl.g:1866:3: ( ( ruleEString ) )
            // InternalFuzzyDsl.g:1867:4: ( ruleEString )
            {
            // InternalFuzzyDsl.g:1867:4: ( ruleEString )
            // InternalFuzzyDsl.g:1868:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceLocationCrossReference_4_0());
            				
            pushFollow(FOLLOW_48);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            // InternalFuzzyDsl.g:1886:3: ( ( ruleEString ) )
            // InternalFuzzyDsl.g:1887:4: ( ruleEString )
            {
            // InternalFuzzyDsl.g:1887:4: ( ruleEString )
            // InternalFuzzyDsl.g:1888:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetLocationCrossReference_6_0());
            				
            pushFollow(FOLLOW_49);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTriggerKeyword_7());
            		
            // InternalFuzzyDsl.g:1906:3: ( ( ruleEString ) )
            // InternalFuzzyDsl.g:1907:4: ( ruleEString )
            {
            // InternalFuzzyDsl.g:1907:4: ( ruleEString )
            // InternalFuzzyDsl.g:1908:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTriggerDiscreteEventCrossReference_8_0());
            				
            pushFollow(FOLLOW_50);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyDsl.g:1922:3: (otherlv_9= 'action' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==58) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalFuzzyDsl.g:1923:4: otherlv_9= 'action' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getActionKeyword_9_0());
                    			
                    // InternalFuzzyDsl.g:1927:4: ( ( ruleEString ) )
                    // InternalFuzzyDsl.g:1928:5: ( ruleEString )
                    {
                    // InternalFuzzyDsl.g:1928:5: ( ruleEString )
                    // InternalFuzzyDsl.g:1929:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getActiondefinitionActionDefinitionCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalFuzzyDsl.g:1944:3: (otherlv_11= 'invariant' ( ( ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==59) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFuzzyDsl.g:1945:4: otherlv_11= 'invariant' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getInvariantKeyword_10_0());
                    			
                    // InternalFuzzyDsl.g:1949:4: ( ( ruleEString ) )
                    // InternalFuzzyDsl.g:1950:5: ( ruleEString )
                    {
                    // InternalFuzzyDsl.g:1950:5: ( ruleEString )
                    // InternalFuzzyDsl.g:1951:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getInvariantRuleCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleAction"
    // InternalFuzzyDsl.g:1970:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalFuzzyDsl.g:1970:47: (iv_ruleAction= ruleAction EOF )
            // InternalFuzzyDsl.g:1971:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalFuzzyDsl.g:1977:1: ruleAction returns [EObject current=null] : ( () otherlv_1= 'action' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'reset' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalFuzzyDsl.g:1983:2: ( ( () otherlv_1= 'action' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'reset' ( ( ruleEString ) ) )? ) )
            // InternalFuzzyDsl.g:1984:2: ( () otherlv_1= 'action' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'reset' ( ( ruleEString ) ) )? )
            {
            // InternalFuzzyDsl.g:1984:2: ( () otherlv_1= 'action' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'reset' ( ( ruleEString ) ) )? )
            // InternalFuzzyDsl.g:1985:3: () otherlv_1= 'action' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'reset' ( ( ruleEString ) ) )?
            {
            // InternalFuzzyDsl.g:1985:3: ()
            // InternalFuzzyDsl.g:1986:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getActionKeyword_1());
            		
            otherlv_2=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getNameKeyword_2());
            		
            // InternalFuzzyDsl.g:2000:3: ( (lv_name_3_0= ruleEString ) )
            // InternalFuzzyDsl.g:2001:4: (lv_name_3_0= ruleEString )
            {
            // InternalFuzzyDsl.g:2001:4: (lv_name_3_0= ruleEString )
            // InternalFuzzyDsl.g:2002:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_53);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"hu.sze.aut.fuzzy.hybrid.system.FuzzyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFuzzyDsl.g:2019:3: (otherlv_4= 'reset' ( ( ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==61) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalFuzzyDsl.g:2020:4: otherlv_4= 'reset' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionAccess().getResetKeyword_4_0());
                    			
                    // InternalFuzzyDsl.g:2024:4: ( ( ruleEString ) )
                    // InternalFuzzyDsl.g:2025:5: ( ruleEString )
                    {
                    // InternalFuzzyDsl.g:2025:5: ( ruleEString )
                    // InternalFuzzyDsl.g:2026:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActionAccess().getResetClockCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleEString"
    // InternalFuzzyDsl.g:2045:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFuzzyDsl.g:2045:47: (iv_ruleEString= ruleEString EOF )
            // InternalFuzzyDsl.g:2046:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFuzzyDsl.g:2052:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFuzzyDsl.g:2058:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFuzzyDsl.g:2059:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFuzzyDsl.g:2059:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalFuzzyDsl.g:2060:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFuzzyDsl.g:2068:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0020000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000120000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000120000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0400000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000302000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0080000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000018800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000018800020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000002000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0011400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x2000000000000002L});

}