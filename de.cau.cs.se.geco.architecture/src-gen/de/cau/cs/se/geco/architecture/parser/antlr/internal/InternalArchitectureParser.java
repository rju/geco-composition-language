package de.cau.cs.se.geco.architecture.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.se.geco.architecture.services.ArchitectureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalArchitectureParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'register'", "'text'", "'model'", "','", "'weave'", "'link'", "'=>'", "'pointcut'", "'advice'", "'generate'", "'('", "')'", "'source'", "'target'", "'trace'", "'out'", "'in'", "'['", "']'", "'/'", "'null'", "'[]'", "'!'", "'is'", "'use'", "'<'", "'>'", "':'", "'{'", "'}'", "'.'", "'io'", "'&'", "'|'", "'=='", "'!='", "'>='", "'<='", "'~'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
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
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalArchitectureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArchitectureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArchitectureParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArchitecture.g"; }



     	private ArchitectureGrammarAccess grammarAccess;

        public InternalArchitectureParser(TokenStream input, ArchitectureGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GecoModel";
       	}

       	@Override
       	protected ArchitectureGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGecoModel"
    // InternalArchitecture.g:65:1: entryRuleGecoModel returns [EObject current=null] : iv_ruleGecoModel= ruleGecoModel EOF ;
    public final EObject entryRuleGecoModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGecoModel = null;


        try {
            // InternalArchitecture.g:65:50: (iv_ruleGecoModel= ruleGecoModel EOF )
            // InternalArchitecture.g:66:2: iv_ruleGecoModel= ruleGecoModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGecoModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGecoModel=ruleGecoModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGecoModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGecoModel"


    // $ANTLR start "ruleGecoModel"
    // InternalArchitecture.g:72:1: ruleGecoModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_registeredRootClass_3_0= ruleRegisteredRootClass ) )* ( (lv_models_4_0= ruleModelSequence ) )* ( (lv_fragments_5_0= ruleFragment ) )* ) ;
    public final EObject ruleGecoModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_registeredRootClass_3_0 = null;

        EObject lv_models_4_0 = null;

        EObject lv_fragments_5_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:78:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_registeredRootClass_3_0= ruleRegisteredRootClass ) )* ( (lv_models_4_0= ruleModelSequence ) )* ( (lv_fragments_5_0= ruleFragment ) )* ) )
            // InternalArchitecture.g:79:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_registeredRootClass_3_0= ruleRegisteredRootClass ) )* ( (lv_models_4_0= ruleModelSequence ) )* ( (lv_fragments_5_0= ruleFragment ) )* )
            {
            // InternalArchitecture.g:79:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_registeredRootClass_3_0= ruleRegisteredRootClass ) )* ( (lv_models_4_0= ruleModelSequence ) )* ( (lv_fragments_5_0= ruleFragment ) )* )
            // InternalArchitecture.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_registeredRootClass_3_0= ruleRegisteredRootClass ) )* ( (lv_models_4_0= ruleModelSequence ) )* ( (lv_fragments_5_0= ruleFragment ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGecoModelAccess().getPackageKeyword_0());
              		
            }
            // InternalArchitecture.g:84:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalArchitecture.g:85:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalArchitecture.g:85:4: (lv_name_1_0= ruleQualifiedName )
            // InternalArchitecture.g:86:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGecoModelAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGecoModelRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.cau.cs.se.geco.architecture.Architecture.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalArchitecture.g:103:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArchitecture.g:104:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalArchitecture.g:104:4: (lv_imports_2_0= ruleImport )
            	    // InternalArchitecture.g:105:5: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGecoModelAccess().getImportsImportParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGecoModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_2_0,
            	      						"de.cau.cs.se.geco.architecture.Architecture.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalArchitecture.g:122:3: ( (lv_registeredRootClass_3_0= ruleRegisteredRootClass ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArchitecture.g:123:4: (lv_registeredRootClass_3_0= ruleRegisteredRootClass )
            	    {
            	    // InternalArchitecture.g:123:4: (lv_registeredRootClass_3_0= ruleRegisteredRootClass )
            	    // InternalArchitecture.g:124:5: lv_registeredRootClass_3_0= ruleRegisteredRootClass
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGecoModelAccess().getRegisteredRootClassRegisteredRootClassParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_registeredRootClass_3_0=ruleRegisteredRootClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGecoModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"registeredRootClass",
            	      						lv_registeredRootClass_3_0,
            	      						"de.cau.cs.se.geco.architecture.Architecture.RegisteredRootClass");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalArchitecture.g:141:3: ( (lv_models_4_0= ruleModelSequence ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalArchitecture.g:142:4: (lv_models_4_0= ruleModelSequence )
            	    {
            	    // InternalArchitecture.g:142:4: (lv_models_4_0= ruleModelSequence )
            	    // InternalArchitecture.g:143:5: lv_models_4_0= ruleModelSequence
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGecoModelAccess().getModelsModelSequenceParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_models_4_0=ruleModelSequence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGecoModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"models",
            	      						lv_models_4_0,
            	      						"de.cau.cs.se.geco.architecture.Architecture.ModelSequence");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalArchitecture.g:160:3: ( (lv_fragments_5_0= ruleFragment ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20||LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalArchitecture.g:161:4: (lv_fragments_5_0= ruleFragment )
            	    {
            	    // InternalArchitecture.g:161:4: (lv_fragments_5_0= ruleFragment )
            	    // InternalArchitecture.g:162:5: lv_fragments_5_0= ruleFragment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGecoModelAccess().getFragmentsFragmentParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_fragments_5_0=ruleFragment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGecoModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"fragments",
            	      						lv_fragments_5_0,
            	      						"de.cau.cs.se.geco.architecture.Architecture.Fragment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGecoModel"


    // $ANTLR start "entryRuleImport"
    // InternalArchitecture.g:183:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalArchitecture.g:183:47: (iv_ruleImport= ruleImport EOF )
            // InternalArchitecture.g:184:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalArchitecture.g:190:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:196:2: ( (otherlv_0= 'import' ( ( ruleQualifiedName ) ) ) )
            // InternalArchitecture.g:197:2: (otherlv_0= 'import' ( ( ruleQualifiedName ) ) )
            {
            // InternalArchitecture.g:197:2: (otherlv_0= 'import' ( ( ruleQualifiedName ) ) )
            // InternalArchitecture.g:198:3: otherlv_0= 'import' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalArchitecture.g:202:3: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:203:4: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:203:4: ( ruleQualifiedName )
            // InternalArchitecture.g:204:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getImportRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceJvmTypeCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleRegisteredRootClass"
    // InternalArchitecture.g:222:1: entryRuleRegisteredRootClass returns [EObject current=null] : iv_ruleRegisteredRootClass= ruleRegisteredRootClass EOF ;
    public final EObject entryRuleRegisteredRootClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisteredRootClass = null;


        try {
            // InternalArchitecture.g:222:60: (iv_ruleRegisteredRootClass= ruleRegisteredRootClass EOF )
            // InternalArchitecture.g:223:2: iv_ruleRegisteredRootClass= ruleRegisteredRootClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegisteredRootClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRegisteredRootClass=ruleRegisteredRootClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegisteredRootClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRegisteredRootClass"


    // $ANTLR start "ruleRegisteredRootClass"
    // InternalArchitecture.g:229:1: ruleRegisteredRootClass returns [EObject current=null] : (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleQualifiedName ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleRegisteredRootClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isText_3_0=null;
        Token lv_extension_4_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:235:2: ( (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleQualifiedName ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) ) ) )
            // InternalArchitecture.g:236:2: (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleQualifiedName ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) ) )
            {
            // InternalArchitecture.g:236:2: (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleQualifiedName ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) ) )
            // InternalArchitecture.g:237:3: otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleQualifiedName ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRegisteredRootClassAccess().getRegisterKeyword_0());
              		
            }
            // InternalArchitecture.g:241:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalArchitecture.g:242:4: (lv_name_1_0= RULE_ID )
            {
            // InternalArchitecture.g:242:4: (lv_name_1_0= RULE_ID )
            // InternalArchitecture.g:243:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRegisteredRootClassAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRegisteredRootClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalArchitecture.g:259:3: ( ( ( ruleQualifiedName ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalArchitecture.g:260:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalArchitecture.g:260:4: ( ( ruleQualifiedName ) )
                    // InternalArchitecture.g:261:5: ( ruleQualifiedName )
                    {
                    // InternalArchitecture.g:261:5: ( ruleQualifiedName )
                    // InternalArchitecture.g:262:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRegisteredRootClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRegisteredRootClassAccess().getImportedNamespaceJvmTypeCrossReference_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:277:4: ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) )
                    {
                    // InternalArchitecture.g:277:4: ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) )
                    // InternalArchitecture.g:278:5: ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) )
                    {
                    // InternalArchitecture.g:278:5: ( (lv_isText_3_0= 'text' ) )
                    // InternalArchitecture.g:279:6: (lv_isText_3_0= 'text' )
                    {
                    // InternalArchitecture.g:279:6: (lv_isText_3_0= 'text' )
                    // InternalArchitecture.g:280:7: lv_isText_3_0= 'text'
                    {
                    lv_isText_3_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_isText_3_0, grammarAccess.getRegisteredRootClassAccess().getIsTextTextKeyword_2_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getRegisteredRootClassRule());
                      							}
                      							setWithLastConsumed(current, "isText", true, "text");
                      						
                    }

                    }


                    }

                    // InternalArchitecture.g:292:5: ( (lv_extension_4_0= RULE_STRING ) )
                    // InternalArchitecture.g:293:6: (lv_extension_4_0= RULE_STRING )
                    {
                    // InternalArchitecture.g:293:6: (lv_extension_4_0= RULE_STRING )
                    // InternalArchitecture.g:294:7: lv_extension_4_0= RULE_STRING
                    {
                    lv_extension_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_extension_4_0, grammarAccess.getRegisteredRootClassAccess().getExtensionSTRINGTerminalRuleCall_2_1_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getRegisteredRootClassRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"extension",
                      								lv_extension_4_0,
                      								"org.eclipse.xtext.common.Terminals.STRING");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRegisteredRootClass"


    // $ANTLR start "entryRuleModelSequence"
    // InternalArchitecture.g:316:1: entryRuleModelSequence returns [EObject current=null] : iv_ruleModelSequence= ruleModelSequence EOF ;
    public final EObject entryRuleModelSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelSequence = null;


        try {
            // InternalArchitecture.g:316:54: (iv_ruleModelSequence= ruleModelSequence EOF )
            // InternalArchitecture.g:317:2: iv_ruleModelSequence= ruleModelSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelSequenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelSequence=ruleModelSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelSequence; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModelSequence"


    // $ANTLR start "ruleModelSequence"
    // InternalArchitecture.g:323:1: ruleModelSequence returns [EObject current=null] : (otherlv_0= 'model' ( (lv_modifier_1_0= ruleModelModifier ) ) ( (lv_type_2_0= ruleModelType ) ) ( (lv_models_3_0= ruleModel ) ) (otherlv_4= ',' ( (lv_models_5_0= ruleModel ) ) )* ) ;
    public final EObject ruleModelSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Enumerator lv_modifier_1_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_models_3_0 = null;

        EObject lv_models_5_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:329:2: ( (otherlv_0= 'model' ( (lv_modifier_1_0= ruleModelModifier ) ) ( (lv_type_2_0= ruleModelType ) ) ( (lv_models_3_0= ruleModel ) ) (otherlv_4= ',' ( (lv_models_5_0= ruleModel ) ) )* ) )
            // InternalArchitecture.g:330:2: (otherlv_0= 'model' ( (lv_modifier_1_0= ruleModelModifier ) ) ( (lv_type_2_0= ruleModelType ) ) ( (lv_models_3_0= ruleModel ) ) (otherlv_4= ',' ( (lv_models_5_0= ruleModel ) ) )* )
            {
            // InternalArchitecture.g:330:2: (otherlv_0= 'model' ( (lv_modifier_1_0= ruleModelModifier ) ) ( (lv_type_2_0= ruleModelType ) ) ( (lv_models_3_0= ruleModel ) ) (otherlv_4= ',' ( (lv_models_5_0= ruleModel ) ) )* )
            // InternalArchitecture.g:331:3: otherlv_0= 'model' ( (lv_modifier_1_0= ruleModelModifier ) ) ( (lv_type_2_0= ruleModelType ) ) ( (lv_models_3_0= ruleModel ) ) (otherlv_4= ',' ( (lv_models_5_0= ruleModel ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelSequenceAccess().getModelKeyword_0());
              		
            }
            // InternalArchitecture.g:335:3: ( (lv_modifier_1_0= ruleModelModifier ) )
            // InternalArchitecture.g:336:4: (lv_modifier_1_0= ruleModelModifier )
            {
            // InternalArchitecture.g:336:4: (lv_modifier_1_0= ruleModelModifier )
            // InternalArchitecture.g:337:5: lv_modifier_1_0= ruleModelModifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelSequenceAccess().getModifierModelModifierEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_modifier_1_0=ruleModelModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelSequenceRule());
              					}
              					set(
              						current,
              						"modifier",
              						lv_modifier_1_0,
              						"de.cau.cs.se.geco.architecture.Architecture.ModelModifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalArchitecture.g:354:3: ( (lv_type_2_0= ruleModelType ) )
            // InternalArchitecture.g:355:4: (lv_type_2_0= ruleModelType )
            {
            // InternalArchitecture.g:355:4: (lv_type_2_0= ruleModelType )
            // InternalArchitecture.g:356:5: lv_type_2_0= ruleModelType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelSequenceAccess().getTypeModelTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_type_2_0=ruleModelType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelSequenceRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"de.cau.cs.se.geco.architecture.Architecture.ModelType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalArchitecture.g:373:3: ( (lv_models_3_0= ruleModel ) )
            // InternalArchitecture.g:374:4: (lv_models_3_0= ruleModel )
            {
            // InternalArchitecture.g:374:4: (lv_models_3_0= ruleModel )
            // InternalArchitecture.g:375:5: lv_models_3_0= ruleModel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelSequenceAccess().getModelsModelParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_models_3_0=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelSequenceRule());
              					}
              					add(
              						current,
              						"models",
              						lv_models_3_0,
              						"de.cau.cs.se.geco.architecture.Architecture.Model");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalArchitecture.g:392:3: (otherlv_4= ',' ( (lv_models_5_0= ruleModel ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArchitecture.g:393:4: otherlv_4= ',' ( (lv_models_5_0= ruleModel ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getModelSequenceAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalArchitecture.g:397:4: ( (lv_models_5_0= ruleModel ) )
            	    // InternalArchitecture.g:398:5: (lv_models_5_0= ruleModel )
            	    {
            	    // InternalArchitecture.g:398:5: (lv_models_5_0= ruleModel )
            	    // InternalArchitecture.g:399:6: lv_models_5_0= ruleModel
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModelSequenceAccess().getModelsModelParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_models_5_0=ruleModel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModelSequenceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"models",
            	      							lv_models_5_0,
            	      							"de.cau.cs.se.geco.architecture.Architecture.Model");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModelSequence"


    // $ANTLR start "entryRuleModel"
    // InternalArchitecture.g:421:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalArchitecture.g:421:46: (iv_ruleModel= ruleModel EOF )
            // InternalArchitecture.g:422:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalArchitecture.g:428:1: ruleModel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:434:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalArchitecture.g:435:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalArchitecture.g:435:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalArchitecture.g:436:3: (lv_name_0_0= RULE_ID )
            {
            // InternalArchitecture.g:436:3: (lv_name_0_0= RULE_ID )
            // InternalArchitecture.g:437:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getModelRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFragment"
    // InternalArchitecture.g:456:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalArchitecture.g:456:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalArchitecture.g:457:2: iv_ruleFragment= ruleFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFragmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFragment=ruleFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFragment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalArchitecture.g:463:1: ruleFragment returns [EObject current=null] : (this_Generator_0= ruleGenerator | this_Weaver_1= ruleWeaver ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        EObject this_Generator_0 = null;

        EObject this_Weaver_1 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:469:2: ( (this_Generator_0= ruleGenerator | this_Weaver_1= ruleWeaver ) )
            // InternalArchitecture.g:470:2: (this_Generator_0= ruleGenerator | this_Weaver_1= ruleWeaver )
            {
            // InternalArchitecture.g:470:2: (this_Generator_0= ruleGenerator | this_Weaver_1= ruleWeaver )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalArchitecture.g:471:3: this_Generator_0= ruleGenerator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFragmentAccess().getGeneratorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Generator_0=ruleGenerator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Generator_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:480:3: this_Weaver_1= ruleWeaver
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFragmentAccess().getWeaverParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Weaver_1=ruleWeaver();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Weaver_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleWeaver"
    // InternalArchitecture.g:492:1: entryRuleWeaver returns [EObject current=null] : iv_ruleWeaver= ruleWeaver EOF ;
    public final EObject entryRuleWeaver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeaver = null;


        try {
            // InternalArchitecture.g:492:47: (iv_ruleWeaver= ruleWeaver EOF )
            // InternalArchitecture.g:493:2: iv_ruleWeaver= ruleWeaver EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWeaverRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWeaver=ruleWeaver();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWeaver; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleWeaver"


    // $ANTLR start "ruleWeaver"
    // InternalArchitecture.g:499:1: ruleWeaver returns [EObject current=null] : (otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( ( (lv_sourceModel_2_0= ruleSourceModelSelector ) ) | otherlv_3= 'link' ) ( (lv_aspectModel_4_0= ruleAspectModel ) ) (otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModel ) ) )? ) ;
    public final EObject ruleWeaver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_sourceModel_2_0 = null;

        EObject lv_aspectModel_4_0 = null;

        EObject lv_targetModel_6_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:505:2: ( (otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( ( (lv_sourceModel_2_0= ruleSourceModelSelector ) ) | otherlv_3= 'link' ) ( (lv_aspectModel_4_0= ruleAspectModel ) ) (otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModel ) ) )? ) )
            // InternalArchitecture.g:506:2: (otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( ( (lv_sourceModel_2_0= ruleSourceModelSelector ) ) | otherlv_3= 'link' ) ( (lv_aspectModel_4_0= ruleAspectModel ) ) (otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModel ) ) )? )
            {
            // InternalArchitecture.g:506:2: (otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( ( (lv_sourceModel_2_0= ruleSourceModelSelector ) ) | otherlv_3= 'link' ) ( (lv_aspectModel_4_0= ruleAspectModel ) ) (otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModel ) ) )? )
            // InternalArchitecture.g:507:3: otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( ( (lv_sourceModel_2_0= ruleSourceModelSelector ) ) | otherlv_3= 'link' ) ( (lv_aspectModel_4_0= ruleAspectModel ) ) (otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModel ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWeaverAccess().getWeaveKeyword_0());
              		
            }
            // InternalArchitecture.g:511:3: ( (otherlv_1= RULE_ID ) )
            // InternalArchitecture.g:512:4: (otherlv_1= RULE_ID )
            {
            // InternalArchitecture.g:512:4: (otherlv_1= RULE_ID )
            // InternalArchitecture.g:513:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWeaverRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getWeaverAccess().getReferenceJvmTypeCrossReference_1_0());
              				
            }

            }


            }

            // InternalArchitecture.g:524:3: ( ( (lv_sourceModel_2_0= ruleSourceModelSelector ) ) | otherlv_3= 'link' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==36) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalArchitecture.g:525:4: ( (lv_sourceModel_2_0= ruleSourceModelSelector ) )
                    {
                    // InternalArchitecture.g:525:4: ( (lv_sourceModel_2_0= ruleSourceModelSelector ) )
                    // InternalArchitecture.g:526:5: (lv_sourceModel_2_0= ruleSourceModelSelector )
                    {
                    // InternalArchitecture.g:526:5: (lv_sourceModel_2_0= ruleSourceModelSelector )
                    // InternalArchitecture.g:527:6: lv_sourceModel_2_0= ruleSourceModelSelector
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getWeaverAccess().getSourceModelSourceModelSelectorParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_sourceModel_2_0=ruleSourceModelSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getWeaverRule());
                      						}
                      						set(
                      							current,
                      							"sourceModel",
                      							lv_sourceModel_2_0,
                      							"de.cau.cs.se.geco.architecture.Architecture.SourceModelSelector");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:545:4: otherlv_3= 'link'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getWeaverAccess().getLinkKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalArchitecture.g:550:3: ( (lv_aspectModel_4_0= ruleAspectModel ) )
            // InternalArchitecture.g:551:4: (lv_aspectModel_4_0= ruleAspectModel )
            {
            // InternalArchitecture.g:551:4: (lv_aspectModel_4_0= ruleAspectModel )
            // InternalArchitecture.g:552:5: lv_aspectModel_4_0= ruleAspectModel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWeaverAccess().getAspectModelAspectModelParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_aspectModel_4_0=ruleAspectModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWeaverRule());
              					}
              					set(
              						current,
              						"aspectModel",
              						lv_aspectModel_4_0,
              						"de.cau.cs.se.geco.architecture.Architecture.AspectModel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalArchitecture.g:569:3: (otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModel ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalArchitecture.g:570:4: otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModel ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getWeaverAccess().getEqualsSignGreaterThanSignKeyword_4_0());
                      			
                    }
                    // InternalArchitecture.g:574:4: ( (lv_targetModel_6_0= ruleTargetModel ) )
                    // InternalArchitecture.g:575:5: (lv_targetModel_6_0= ruleTargetModel )
                    {
                    // InternalArchitecture.g:575:5: (lv_targetModel_6_0= ruleTargetModel )
                    // InternalArchitecture.g:576:6: lv_targetModel_6_0= ruleTargetModel
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getWeaverAccess().getTargetModelTargetModelParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_targetModel_6_0=ruleTargetModel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getWeaverRule());
                      						}
                      						set(
                      							current,
                      							"targetModel",
                      							lv_targetModel_6_0,
                      							"de.cau.cs.se.geco.architecture.Architecture.TargetModel");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleWeaver"


    // $ANTLR start "entryRuleAspectModel"
    // InternalArchitecture.g:598:1: entryRuleAspectModel returns [EObject current=null] : iv_ruleAspectModel= ruleAspectModel EOF ;
    public final EObject entryRuleAspectModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspectModel = null;


        try {
            // InternalArchitecture.g:598:52: (iv_ruleAspectModel= ruleAspectModel EOF )
            // InternalArchitecture.g:599:2: iv_ruleAspectModel= ruleAspectModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAspectModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAspectModel=ruleAspectModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAspectModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAspectModel"


    // $ANTLR start "ruleAspectModel"
    // InternalArchitecture.g:605:1: ruleAspectModel returns [EObject current=null] : (this_CombinedModel_0= ruleCombinedModel | this_SeparateModels_1= ruleSeparateModels ) ;
    public final EObject ruleAspectModel() throws RecognitionException {
        EObject current = null;

        EObject this_CombinedModel_0 = null;

        EObject this_SeparateModels_1 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:611:2: ( (this_CombinedModel_0= ruleCombinedModel | this_SeparateModels_1= ruleSeparateModels ) )
            // InternalArchitecture.g:612:2: (this_CombinedModel_0= ruleCombinedModel | this_SeparateModels_1= ruleSeparateModels )
            {
            // InternalArchitecture.g:612:2: (this_CombinedModel_0= ruleCombinedModel | this_SeparateModels_1= ruleSeparateModels )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalArchitecture.g:613:3: this_CombinedModel_0= ruleCombinedModel
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAspectModelAccess().getCombinedModelParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CombinedModel_0=ruleCombinedModel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CombinedModel_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:622:3: this_SeparateModels_1= ruleSeparateModels
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAspectModelAccess().getSeparateModelsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SeparateModels_1=ruleSeparateModels();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SeparateModels_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAspectModel"


    // $ANTLR start "entryRuleSeparateModels"
    // InternalArchitecture.g:634:1: entryRuleSeparateModels returns [EObject current=null] : iv_ruleSeparateModels= ruleSeparateModels EOF ;
    public final EObject entryRuleSeparateModels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeparateModels = null;


        try {
            // InternalArchitecture.g:634:55: (iv_ruleSeparateModels= ruleSeparateModels EOF )
            // InternalArchitecture.g:635:2: iv_ruleSeparateModels= ruleSeparateModels EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSeparateModelsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSeparateModels=ruleSeparateModels();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSeparateModels; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSeparateModels"


    // $ANTLR start "ruleSeparateModels"
    // InternalArchitecture.g:641:1: ruleSeparateModels returns [EObject current=null] : (otherlv_0= 'pointcut' ( (lv_pointcut_1_0= ruleTargetModel ) ) otherlv_2= 'advice' ( (lv_advice_3_0= ruleCombinedModel ) ) ) ;
    public final EObject ruleSeparateModels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_pointcut_1_0 = null;

        EObject lv_advice_3_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:647:2: ( (otherlv_0= 'pointcut' ( (lv_pointcut_1_0= ruleTargetModel ) ) otherlv_2= 'advice' ( (lv_advice_3_0= ruleCombinedModel ) ) ) )
            // InternalArchitecture.g:648:2: (otherlv_0= 'pointcut' ( (lv_pointcut_1_0= ruleTargetModel ) ) otherlv_2= 'advice' ( (lv_advice_3_0= ruleCombinedModel ) ) )
            {
            // InternalArchitecture.g:648:2: (otherlv_0= 'pointcut' ( (lv_pointcut_1_0= ruleTargetModel ) ) otherlv_2= 'advice' ( (lv_advice_3_0= ruleCombinedModel ) ) )
            // InternalArchitecture.g:649:3: otherlv_0= 'pointcut' ( (lv_pointcut_1_0= ruleTargetModel ) ) otherlv_2= 'advice' ( (lv_advice_3_0= ruleCombinedModel ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSeparateModelsAccess().getPointcutKeyword_0());
              		
            }
            // InternalArchitecture.g:653:3: ( (lv_pointcut_1_0= ruleTargetModel ) )
            // InternalArchitecture.g:654:4: (lv_pointcut_1_0= ruleTargetModel )
            {
            // InternalArchitecture.g:654:4: (lv_pointcut_1_0= ruleTargetModel )
            // InternalArchitecture.g:655:5: lv_pointcut_1_0= ruleTargetModel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSeparateModelsAccess().getPointcutTargetModelParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_pointcut_1_0=ruleTargetModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSeparateModelsRule());
              					}
              					set(
              						current,
              						"pointcut",
              						lv_pointcut_1_0,
              						"de.cau.cs.se.geco.architecture.Architecture.TargetModel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSeparateModelsAccess().getAdviceKeyword_2());
              		
            }
            // InternalArchitecture.g:676:3: ( (lv_advice_3_0= ruleCombinedModel ) )
            // InternalArchitecture.g:677:4: (lv_advice_3_0= ruleCombinedModel )
            {
            // InternalArchitecture.g:677:4: (lv_advice_3_0= ruleCombinedModel )
            // InternalArchitecture.g:678:5: lv_advice_3_0= ruleCombinedModel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSeparateModelsAccess().getAdviceCombinedModelParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_advice_3_0=ruleCombinedModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSeparateModelsRule());
              					}
              					set(
              						current,
              						"advice",
              						lv_advice_3_0,
              						"de.cau.cs.se.geco.architecture.Architecture.CombinedModel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSeparateModels"


    // $ANTLR start "entryRuleCombinedModel"
    // InternalArchitecture.g:699:1: entryRuleCombinedModel returns [EObject current=null] : iv_ruleCombinedModel= ruleCombinedModel EOF ;
    public final EObject entryRuleCombinedModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombinedModel = null;


        try {
            // InternalArchitecture.g:699:54: (iv_ruleCombinedModel= ruleCombinedModel EOF )
            // InternalArchitecture.g:700:2: iv_ruleCombinedModel= ruleCombinedModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCombinedModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCombinedModel=ruleCombinedModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCombinedModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCombinedModel"


    // $ANTLR start "ruleCombinedModel"
    // InternalArchitecture.g:706:1: ruleCombinedModel returns [EObject current=null] : (this_TargetModel_0= ruleTargetModel | this_Generator_1= ruleGenerator ) ;
    public final EObject ruleCombinedModel() throws RecognitionException {
        EObject current = null;

        EObject this_TargetModel_0 = null;

        EObject this_Generator_1 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:712:2: ( (this_TargetModel_0= ruleTargetModel | this_Generator_1= ruleGenerator ) )
            // InternalArchitecture.g:713:2: (this_TargetModel_0= ruleTargetModel | this_Generator_1= ruleGenerator )
            {
            // InternalArchitecture.g:713:2: (this_TargetModel_0= ruleTargetModel | this_Generator_1= ruleGenerator )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalArchitecture.g:714:3: this_TargetModel_0= ruleTargetModel
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCombinedModelAccess().getTargetModelParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TargetModel_0=ruleTargetModel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TargetModel_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:723:3: this_Generator_1= ruleGenerator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCombinedModelAccess().getGeneratorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Generator_1=ruleGenerator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Generator_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCombinedModel"


    // $ANTLR start "entryRuleGenerator"
    // InternalArchitecture.g:735:1: entryRuleGenerator returns [EObject current=null] : iv_ruleGenerator= ruleGenerator EOF ;
    public final EObject entryRuleGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerator = null;


        try {
            // InternalArchitecture.g:735:50: (iv_ruleGenerator= ruleGenerator EOF )
            // InternalArchitecture.g:736:2: iv_ruleGenerator= ruleGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGenerator=ruleGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGenerator"


    // $ANTLR start "ruleGenerator"
    // InternalArchitecture.g:742:1: ruleGenerator returns [EObject current=null] : (otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_sourceAuxModels_3_0= ruleSourceModelSelector ) ) (otherlv_4= ',' ( (lv_sourceAuxModels_5_0= ruleSourceModelSelector ) ) )* otherlv_6= ')' )? otherlv_7= 'source' ( (lv_sourceModel_8_0= ruleSourceModelSelector ) ) (otherlv_9= 'target' ( (lv_targetModel_10_0= ruleTargetModel ) ) )? (otherlv_11= 'trace' (otherlv_12= 'out' ( (lv_targetTraceModel_13_0= ruleTargetTraceModel ) ) )? (otherlv_14= 'in' ( (lv_sourceTraceModels_15_0= ruleTraceModelReference ) ) (otherlv_16= ',' ( (lv_sourceTraceModels_17_0= ruleTraceModelReference ) ) )* )? )? ) ;
    public final EObject ruleGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_sourceAuxModels_3_0 = null;

        EObject lv_sourceAuxModels_5_0 = null;

        EObject lv_sourceModel_8_0 = null;

        EObject lv_targetModel_10_0 = null;

        EObject lv_targetTraceModel_13_0 = null;

        EObject lv_sourceTraceModels_15_0 = null;

        EObject lv_sourceTraceModels_17_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:748:2: ( (otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_sourceAuxModels_3_0= ruleSourceModelSelector ) ) (otherlv_4= ',' ( (lv_sourceAuxModels_5_0= ruleSourceModelSelector ) ) )* otherlv_6= ')' )? otherlv_7= 'source' ( (lv_sourceModel_8_0= ruleSourceModelSelector ) ) (otherlv_9= 'target' ( (lv_targetModel_10_0= ruleTargetModel ) ) )? (otherlv_11= 'trace' (otherlv_12= 'out' ( (lv_targetTraceModel_13_0= ruleTargetTraceModel ) ) )? (otherlv_14= 'in' ( (lv_sourceTraceModels_15_0= ruleTraceModelReference ) ) (otherlv_16= ',' ( (lv_sourceTraceModels_17_0= ruleTraceModelReference ) ) )* )? )? ) )
            // InternalArchitecture.g:749:2: (otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_sourceAuxModels_3_0= ruleSourceModelSelector ) ) (otherlv_4= ',' ( (lv_sourceAuxModels_5_0= ruleSourceModelSelector ) ) )* otherlv_6= ')' )? otherlv_7= 'source' ( (lv_sourceModel_8_0= ruleSourceModelSelector ) ) (otherlv_9= 'target' ( (lv_targetModel_10_0= ruleTargetModel ) ) )? (otherlv_11= 'trace' (otherlv_12= 'out' ( (lv_targetTraceModel_13_0= ruleTargetTraceModel ) ) )? (otherlv_14= 'in' ( (lv_sourceTraceModels_15_0= ruleTraceModelReference ) ) (otherlv_16= ',' ( (lv_sourceTraceModels_17_0= ruleTraceModelReference ) ) )* )? )? )
            {
            // InternalArchitecture.g:749:2: (otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_sourceAuxModels_3_0= ruleSourceModelSelector ) ) (otherlv_4= ',' ( (lv_sourceAuxModels_5_0= ruleSourceModelSelector ) ) )* otherlv_6= ')' )? otherlv_7= 'source' ( (lv_sourceModel_8_0= ruleSourceModelSelector ) ) (otherlv_9= 'target' ( (lv_targetModel_10_0= ruleTargetModel ) ) )? (otherlv_11= 'trace' (otherlv_12= 'out' ( (lv_targetTraceModel_13_0= ruleTargetTraceModel ) ) )? (otherlv_14= 'in' ( (lv_sourceTraceModels_15_0= ruleTraceModelReference ) ) (otherlv_16= ',' ( (lv_sourceTraceModels_17_0= ruleTraceModelReference ) ) )* )? )? )
            // InternalArchitecture.g:750:3: otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_sourceAuxModels_3_0= ruleSourceModelSelector ) ) (otherlv_4= ',' ( (lv_sourceAuxModels_5_0= ruleSourceModelSelector ) ) )* otherlv_6= ')' )? otherlv_7= 'source' ( (lv_sourceModel_8_0= ruleSourceModelSelector ) ) (otherlv_9= 'target' ( (lv_targetModel_10_0= ruleTargetModel ) ) )? (otherlv_11= 'trace' (otherlv_12= 'out' ( (lv_targetTraceModel_13_0= ruleTargetTraceModel ) ) )? (otherlv_14= 'in' ( (lv_sourceTraceModels_15_0= ruleTraceModelReference ) ) (otherlv_16= ',' ( (lv_sourceTraceModels_17_0= ruleTraceModelReference ) ) )* )? )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGeneratorAccess().getGenerateKeyword_0());
              		
            }
            // InternalArchitecture.g:754:3: ( (otherlv_1= RULE_ID ) )
            // InternalArchitecture.g:755:4: (otherlv_1= RULE_ID )
            {
            // InternalArchitecture.g:755:4: (otherlv_1= RULE_ID )
            // InternalArchitecture.g:756:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGeneratorRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getGeneratorAccess().getReferenceJvmTypeCrossReference_1_0());
              				
            }

            }


            }

            // InternalArchitecture.g:767:3: (otherlv_2= '(' ( (lv_sourceAuxModels_3_0= ruleSourceModelSelector ) ) (otherlv_4= ',' ( (lv_sourceAuxModels_5_0= ruleSourceModelSelector ) ) )* otherlv_6= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArchitecture.g:768:4: otherlv_2= '(' ( (lv_sourceAuxModels_3_0= ruleSourceModelSelector ) ) (otherlv_4= ',' ( (lv_sourceAuxModels_5_0= ruleSourceModelSelector ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalArchitecture.g:772:4: ( (lv_sourceAuxModels_3_0= ruleSourceModelSelector ) )
                    // InternalArchitecture.g:773:5: (lv_sourceAuxModels_3_0= ruleSourceModelSelector )
                    {
                    // InternalArchitecture.g:773:5: (lv_sourceAuxModels_3_0= ruleSourceModelSelector )
                    // InternalArchitecture.g:774:6: lv_sourceAuxModels_3_0= ruleSourceModelSelector
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGeneratorAccess().getSourceAuxModelsSourceModelSelectorParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_sourceAuxModels_3_0=ruleSourceModelSelector();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGeneratorRule());
                      						}
                      						add(
                      							current,
                      							"sourceAuxModels",
                      							lv_sourceAuxModels_3_0,
                      							"de.cau.cs.se.geco.architecture.Architecture.SourceModelSelector");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalArchitecture.g:791:4: (otherlv_4= ',' ( (lv_sourceAuxModels_5_0= ruleSourceModelSelector ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalArchitecture.g:792:5: otherlv_4= ',' ( (lv_sourceAuxModels_5_0= ruleSourceModelSelector ) )
                    	    {
                    	    otherlv_4=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getGeneratorAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalArchitecture.g:796:5: ( (lv_sourceAuxModels_5_0= ruleSourceModelSelector ) )
                    	    // InternalArchitecture.g:797:6: (lv_sourceAuxModels_5_0= ruleSourceModelSelector )
                    	    {
                    	    // InternalArchitecture.g:797:6: (lv_sourceAuxModels_5_0= ruleSourceModelSelector )
                    	    // InternalArchitecture.g:798:7: lv_sourceAuxModels_5_0= ruleSourceModelSelector
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGeneratorAccess().getSourceAuxModelsSourceModelSelectorParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_sourceAuxModels_5_0=ruleSourceModelSelector();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGeneratorRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"sourceAuxModels",
                    	      								lv_sourceAuxModels_5_0,
                    	      								"de.cau.cs.se.geco.architecture.Architecture.SourceModelSelector");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,28,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGeneratorAccess().getSourceKeyword_3());
              		
            }
            // InternalArchitecture.g:825:3: ( (lv_sourceModel_8_0= ruleSourceModelSelector ) )
            // InternalArchitecture.g:826:4: (lv_sourceModel_8_0= ruleSourceModelSelector )
            {
            // InternalArchitecture.g:826:4: (lv_sourceModel_8_0= ruleSourceModelSelector )
            // InternalArchitecture.g:827:5: lv_sourceModel_8_0= ruleSourceModelSelector
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGeneratorAccess().getSourceModelSourceModelSelectorParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_sourceModel_8_0=ruleSourceModelSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGeneratorRule());
              					}
              					set(
              						current,
              						"sourceModel",
              						lv_sourceModel_8_0,
              						"de.cau.cs.se.geco.architecture.Architecture.SourceModelSelector");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalArchitecture.g:844:3: (otherlv_9= 'target' ( (lv_targetModel_10_0= ruleTargetModel ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalArchitecture.g:845:4: otherlv_9= 'target' ( (lv_targetModel_10_0= ruleTargetModel ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getGeneratorAccess().getTargetKeyword_5_0());
                      			
                    }
                    // InternalArchitecture.g:849:4: ( (lv_targetModel_10_0= ruleTargetModel ) )
                    // InternalArchitecture.g:850:5: (lv_targetModel_10_0= ruleTargetModel )
                    {
                    // InternalArchitecture.g:850:5: (lv_targetModel_10_0= ruleTargetModel )
                    // InternalArchitecture.g:851:6: lv_targetModel_10_0= ruleTargetModel
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGeneratorAccess().getTargetModelTargetModelParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_targetModel_10_0=ruleTargetModel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGeneratorRule());
                      						}
                      						set(
                      							current,
                      							"targetModel",
                      							lv_targetModel_10_0,
                      							"de.cau.cs.se.geco.architecture.Architecture.TargetModel");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalArchitecture.g:869:3: (otherlv_11= 'trace' (otherlv_12= 'out' ( (lv_targetTraceModel_13_0= ruleTargetTraceModel ) ) )? (otherlv_14= 'in' ( (lv_sourceTraceModels_15_0= ruleTraceModelReference ) ) (otherlv_16= ',' ( (lv_sourceTraceModels_17_0= ruleTraceModelReference ) ) )* )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalArchitecture.g:870:4: otherlv_11= 'trace' (otherlv_12= 'out' ( (lv_targetTraceModel_13_0= ruleTargetTraceModel ) ) )? (otherlv_14= 'in' ( (lv_sourceTraceModels_15_0= ruleTraceModelReference ) ) (otherlv_16= ',' ( (lv_sourceTraceModels_17_0= ruleTraceModelReference ) ) )* )?
                    {
                    otherlv_11=(Token)match(input,30,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGeneratorAccess().getTraceKeyword_6_0());
                      			
                    }
                    // InternalArchitecture.g:874:4: (otherlv_12= 'out' ( (lv_targetTraceModel_13_0= ruleTargetTraceModel ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==31) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalArchitecture.g:875:5: otherlv_12= 'out' ( (lv_targetTraceModel_13_0= ruleTargetTraceModel ) )
                            {
                            otherlv_12=(Token)match(input,31,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getGeneratorAccess().getOutKeyword_6_1_0());
                              				
                            }
                            // InternalArchitecture.g:879:5: ( (lv_targetTraceModel_13_0= ruleTargetTraceModel ) )
                            // InternalArchitecture.g:880:6: (lv_targetTraceModel_13_0= ruleTargetTraceModel )
                            {
                            // InternalArchitecture.g:880:6: (lv_targetTraceModel_13_0= ruleTargetTraceModel )
                            // InternalArchitecture.g:881:7: lv_targetTraceModel_13_0= ruleTargetTraceModel
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getGeneratorAccess().getTargetTraceModelTargetTraceModelParserRuleCall_6_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_25);
                            lv_targetTraceModel_13_0=ruleTargetTraceModel();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getGeneratorRule());
                              							}
                              							set(
                              								current,
                              								"targetTraceModel",
                              								lv_targetTraceModel_13_0,
                              								"de.cau.cs.se.geco.architecture.Architecture.TargetTraceModel");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalArchitecture.g:899:4: (otherlv_14= 'in' ( (lv_sourceTraceModels_15_0= ruleTraceModelReference ) ) (otherlv_16= ',' ( (lv_sourceTraceModels_17_0= ruleTraceModelReference ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==32) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalArchitecture.g:900:5: otherlv_14= 'in' ( (lv_sourceTraceModels_15_0= ruleTraceModelReference ) ) (otherlv_16= ',' ( (lv_sourceTraceModels_17_0= ruleTraceModelReference ) ) )*
                            {
                            otherlv_14=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getGeneratorAccess().getInKeyword_6_2_0());
                              				
                            }
                            // InternalArchitecture.g:904:5: ( (lv_sourceTraceModels_15_0= ruleTraceModelReference ) )
                            // InternalArchitecture.g:905:6: (lv_sourceTraceModels_15_0= ruleTraceModelReference )
                            {
                            // InternalArchitecture.g:905:6: (lv_sourceTraceModels_15_0= ruleTraceModelReference )
                            // InternalArchitecture.g:906:7: lv_sourceTraceModels_15_0= ruleTraceModelReference
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getGeneratorAccess().getSourceTraceModelsTraceModelReferenceParserRuleCall_6_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_11);
                            lv_sourceTraceModels_15_0=ruleTraceModelReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getGeneratorRule());
                              							}
                              							add(
                              								current,
                              								"sourceTraceModels",
                              								lv_sourceTraceModels_15_0,
                              								"de.cau.cs.se.geco.architecture.Architecture.TraceModelReference");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalArchitecture.g:923:5: (otherlv_16= ',' ( (lv_sourceTraceModels_17_0= ruleTraceModelReference ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==19) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalArchitecture.g:924:6: otherlv_16= ',' ( (lv_sourceTraceModels_17_0= ruleTraceModelReference ) )
                            	    {
                            	    otherlv_16=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_16, grammarAccess.getGeneratorAccess().getCommaKeyword_6_2_2_0());
                            	      					
                            	    }
                            	    // InternalArchitecture.g:928:6: ( (lv_sourceTraceModels_17_0= ruleTraceModelReference ) )
                            	    // InternalArchitecture.g:929:7: (lv_sourceTraceModels_17_0= ruleTraceModelReference )
                            	    {
                            	    // InternalArchitecture.g:929:7: (lv_sourceTraceModels_17_0= ruleTraceModelReference )
                            	    // InternalArchitecture.g:930:8: lv_sourceTraceModels_17_0= ruleTraceModelReference
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getGeneratorAccess().getSourceTraceModelsTraceModelReferenceParserRuleCall_6_2_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_11);
                            	    lv_sourceTraceModels_17_0=ruleTraceModelReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getGeneratorRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"sourceTraceModels",
                            	      									lv_sourceTraceModels_17_0,
                            	      									"de.cau.cs.se.geco.architecture.Architecture.TraceModelReference");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGenerator"


    // $ANTLR start "entryRuleSourceModelSelector"
    // InternalArchitecture.g:954:1: entryRuleSourceModelSelector returns [EObject current=null] : iv_ruleSourceModelSelector= ruleSourceModelSelector EOF ;
    public final EObject entryRuleSourceModelSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceModelSelector = null;


        try {
            // InternalArchitecture.g:954:60: (iv_ruleSourceModelSelector= ruleSourceModelSelector EOF )
            // InternalArchitecture.g:955:2: iv_ruleSourceModelSelector= ruleSourceModelSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceModelSelectorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSourceModelSelector=ruleSourceModelSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSourceModelSelector; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSourceModelSelector"


    // $ANTLR start "ruleSourceModelSelector"
    // InternalArchitecture.g:961:1: ruleSourceModelSelector returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )? ) | ( () otherlv_7= 'null' ) ) ;
    public final EObject ruleSourceModelSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_constraint_2_0 = null;

        EObject lv_property_5_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:967:2: ( ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )? ) | ( () otherlv_7= 'null' ) ) )
            // InternalArchitecture.g:968:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )? ) | ( () otherlv_7= 'null' ) )
            {
            // InternalArchitecture.g:968:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )? ) | ( () otherlv_7= 'null' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==36) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalArchitecture.g:969:3: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )? )
                    {
                    // InternalArchitecture.g:969:3: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )? )
                    // InternalArchitecture.g:970:4: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )?
                    {
                    // InternalArchitecture.g:970:4: ( (otherlv_0= RULE_ID ) )
                    // InternalArchitecture.g:971:5: (otherlv_0= RULE_ID )
                    {
                    // InternalArchitecture.g:971:5: (otherlv_0= RULE_ID )
                    // InternalArchitecture.g:972:6: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSourceModelSelectorRule());
                      						}
                      					
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_0, grammarAccess.getSourceModelSelectorAccess().getReferenceModelCrossReference_0_0_0());
                      					
                    }

                    }


                    }

                    // InternalArchitecture.g:983:4: (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==33) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalArchitecture.g:984:5: otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']'
                            {
                            otherlv_1=(Token)match(input,33,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getSourceModelSelectorAccess().getLeftSquareBracketKeyword_0_1_0());
                              				
                            }
                            // InternalArchitecture.g:988:5: ( (lv_constraint_2_0= ruleConstraintExpression ) )
                            // InternalArchitecture.g:989:6: (lv_constraint_2_0= ruleConstraintExpression )
                            {
                            // InternalArchitecture.g:989:6: (lv_constraint_2_0= ruleConstraintExpression )
                            // InternalArchitecture.g:990:7: lv_constraint_2_0= ruleConstraintExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSourceModelSelectorAccess().getConstraintConstraintExpressionParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_28);
                            lv_constraint_2_0=ruleConstraintExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSourceModelSelectorRule());
                              							}
                              							set(
                              								current,
                              								"constraint",
                              								lv_constraint_2_0,
                              								"de.cau.cs.se.geco.architecture.Architecture.ConstraintExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,34,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getSourceModelSelectorAccess().getRightSquareBracketKeyword_0_1_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalArchitecture.g:1012:4: (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==35) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalArchitecture.g:1013:5: otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) )
                            {
                            otherlv_4=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getSourceModelSelectorAccess().getSolidusKeyword_0_2_0());
                              				
                            }
                            // InternalArchitecture.g:1017:5: ( (lv_property_5_0= ruleNodeProperty ) )
                            // InternalArchitecture.g:1018:6: (lv_property_5_0= ruleNodeProperty )
                            {
                            // InternalArchitecture.g:1018:6: (lv_property_5_0= ruleNodeProperty )
                            // InternalArchitecture.g:1019:7: lv_property_5_0= ruleNodeProperty
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getSourceModelSelectorAccess().getPropertyNodePropertyParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_property_5_0=ruleNodeProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getSourceModelSelectorRule());
                              							}
                              							set(
                              								current,
                              								"property",
                              								lv_property_5_0,
                              								"de.cau.cs.se.geco.architecture.Architecture.NodeProperty");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:1039:3: ( () otherlv_7= 'null' )
                    {
                    // InternalArchitecture.g:1039:3: ( () otherlv_7= 'null' )
                    // InternalArchitecture.g:1040:4: () otherlv_7= 'null'
                    {
                    // InternalArchitecture.g:1040:4: ()
                    // InternalArchitecture.g:1041:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSourceModelSelectorAccess().getSourceModelSelectorAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSourceModelSelectorAccess().getNullKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSourceModelSelector"


    // $ANTLR start "entryRuleTargetModel"
    // InternalArchitecture.g:1056:1: entryRuleTargetModel returns [EObject current=null] : iv_ruleTargetModel= ruleTargetModel EOF ;
    public final EObject entryRuleTargetModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetModel = null;


        try {
            // InternalArchitecture.g:1056:52: (iv_ruleTargetModel= ruleTargetModel EOF )
            // InternalArchitecture.g:1057:2: iv_ruleTargetModel= ruleTargetModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTargetModel=ruleTargetModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTargetModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTargetModel"


    // $ANTLR start "ruleTargetModel"
    // InternalArchitecture.g:1063:1: ruleTargetModel returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleTargetModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArchitecture.g:1069:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalArchitecture.g:1070:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalArchitecture.g:1070:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalArchitecture.g:1071:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalArchitecture.g:1071:3: ()
            // InternalArchitecture.g:1072:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTargetModelAccess().getTargetModelAction_0(),
              					current);
              			
            }

            }

            // InternalArchitecture.g:1078:3: ( (otherlv_1= RULE_ID ) )
            // InternalArchitecture.g:1079:4: (otherlv_1= RULE_ID )
            {
            // InternalArchitecture.g:1079:4: (otherlv_1= RULE_ID )
            // InternalArchitecture.g:1080:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTargetModelRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getTargetModelAccess().getReferenceModelCrossReference_1_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTargetModel"


    // $ANTLR start "entryRuleModelType"
    // InternalArchitecture.g:1095:1: entryRuleModelType returns [EObject current=null] : iv_ruleModelType= ruleModelType EOF ;
    public final EObject entryRuleModelType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelType = null;


        try {
            // InternalArchitecture.g:1095:50: (iv_ruleModelType= ruleModelType EOF )
            // InternalArchitecture.g:1096:2: iv_ruleModelType= ruleModelType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelType=ruleModelType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModelType"


    // $ANTLR start "ruleModelType"
    // InternalArchitecture.g:1102:1: ruleModelType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? ( (lv_collection_3_0= '[]' ) )? ) ;
    public final EObject ruleModelType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_collection_3_0=null;
        EObject lv_property_2_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:1108:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? ( (lv_collection_3_0= '[]' ) )? ) )
            // InternalArchitecture.g:1109:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? ( (lv_collection_3_0= '[]' ) )? )
            {
            // InternalArchitecture.g:1109:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? ( (lv_collection_3_0= '[]' ) )? )
            // InternalArchitecture.g:1110:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? ( (lv_collection_3_0= '[]' ) )?
            {
            // InternalArchitecture.g:1110:3: ( (otherlv_0= RULE_ID ) )
            // InternalArchitecture.g:1111:4: (otherlv_0= RULE_ID )
            {
            // InternalArchitecture.g:1111:4: (otherlv_0= RULE_ID )
            // InternalArchitecture.g:1112:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelTypeRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getModelTypeAccess().getTargetRegisteredRootClassCrossReference_0_0());
              				
            }

            }


            }

            // InternalArchitecture.g:1123:3: (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalArchitecture.g:1124:4: otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getModelTypeAccess().getSolidusKeyword_1_0());
                      			
                    }
                    // InternalArchitecture.g:1128:4: ( (lv_property_2_0= ruleNodeProperty ) )
                    // InternalArchitecture.g:1129:5: (lv_property_2_0= ruleNodeProperty )
                    {
                    // InternalArchitecture.g:1129:5: (lv_property_2_0= ruleNodeProperty )
                    // InternalArchitecture.g:1130:6: lv_property_2_0= ruleNodeProperty
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModelTypeAccess().getPropertyNodePropertyParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_property_2_0=ruleNodeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModelTypeRule());
                      						}
                      						set(
                      							current,
                      							"property",
                      							lv_property_2_0,
                      							"de.cau.cs.se.geco.architecture.Architecture.NodeProperty");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalArchitecture.g:1148:3: ( (lv_collection_3_0= '[]' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalArchitecture.g:1149:4: (lv_collection_3_0= '[]' )
                    {
                    // InternalArchitecture.g:1149:4: (lv_collection_3_0= '[]' )
                    // InternalArchitecture.g:1150:5: lv_collection_3_0= '[]'
                    {
                    lv_collection_3_0=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_collection_3_0, grammarAccess.getModelTypeAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getModelTypeRule());
                      					}
                      					setWithLastConsumed(current, "collection", true, "[]");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModelType"


    // $ANTLR start "entryRuleNodeProperty"
    // InternalArchitecture.g:1166:1: entryRuleNodeProperty returns [EObject current=null] : iv_ruleNodeProperty= ruleNodeProperty EOF ;
    public final EObject entryRuleNodeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeProperty = null;


        try {
            // InternalArchitecture.g:1166:53: (iv_ruleNodeProperty= ruleNodeProperty EOF )
            // InternalArchitecture.g:1167:2: iv_ruleNodeProperty= ruleNodeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodePropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNodeProperty=ruleNodeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeProperty"


    // $ANTLR start "ruleNodeProperty"
    // InternalArchitecture.g:1173:1: ruleNodeProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )? ) ;
    public final EObject ruleNodeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_constraint_2_0 = null;

        EObject lv_subProperty_5_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:1179:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )? ) )
            // InternalArchitecture.g:1180:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )? )
            {
            // InternalArchitecture.g:1180:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )? )
            // InternalArchitecture.g:1181:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )?
            {
            // InternalArchitecture.g:1181:3: ( (otherlv_0= RULE_ID ) )
            // InternalArchitecture.g:1182:4: (otherlv_0= RULE_ID )
            {
            // InternalArchitecture.g:1182:4: (otherlv_0= RULE_ID )
            // InternalArchitecture.g:1183:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNodePropertyRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getNodePropertyAccess().getPropertyJvmMemberCrossReference_0_0());
              				
            }

            }


            }

            // InternalArchitecture.g:1194:3: (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalArchitecture.g:1195:4: otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getNodePropertyAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalArchitecture.g:1199:4: ( (lv_constraint_2_0= ruleConstraintExpression ) )
                    // InternalArchitecture.g:1200:5: (lv_constraint_2_0= ruleConstraintExpression )
                    {
                    // InternalArchitecture.g:1200:5: (lv_constraint_2_0= ruleConstraintExpression )
                    // InternalArchitecture.g:1201:6: lv_constraint_2_0= ruleConstraintExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodePropertyAccess().getConstraintConstraintExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_constraint_2_0=ruleConstraintExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodePropertyRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_2_0,
                      							"de.cau.cs.se.geco.architecture.Architecture.ConstraintExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,34,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getNodePropertyAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalArchitecture.g:1223:3: (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalArchitecture.g:1224:4: otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getNodePropertyAccess().getSolidusKeyword_2_0());
                      			
                    }
                    // InternalArchitecture.g:1228:4: ( (lv_subProperty_5_0= ruleNodeProperty ) )
                    // InternalArchitecture.g:1229:5: (lv_subProperty_5_0= ruleNodeProperty )
                    {
                    // InternalArchitecture.g:1229:5: (lv_subProperty_5_0= ruleNodeProperty )
                    // InternalArchitecture.g:1230:6: lv_subProperty_5_0= ruleNodeProperty
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNodePropertyAccess().getSubPropertyNodePropertyParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_subProperty_5_0=ruleNodeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNodePropertyRule());
                      						}
                      						set(
                      							current,
                      							"subProperty",
                      							lv_subProperty_5_0,
                      							"de.cau.cs.se.geco.architecture.Architecture.NodeProperty");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNodeProperty"


    // $ANTLR start "entryRuleConstraintExpression"
    // InternalArchitecture.g:1252:1: entryRuleConstraintExpression returns [EObject current=null] : iv_ruleConstraintExpression= ruleConstraintExpression EOF ;
    public final EObject entryRuleConstraintExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintExpression = null;


        try {
            // InternalArchitecture.g:1252:61: (iv_ruleConstraintExpression= ruleConstraintExpression EOF )
            // InternalArchitecture.g:1253:2: iv_ruleConstraintExpression= ruleConstraintExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraintExpression=ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraintExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstraintExpression"


    // $ANTLR start "ruleConstraintExpression"
    // InternalArchitecture.g:1259:1: ruleConstraintExpression returns [EObject current=null] : (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )? ) ;
    public final EObject ruleConstraintExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:1265:2: ( (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )? ) )
            // InternalArchitecture.g:1266:2: (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )? )
            {
            // InternalArchitecture.g:1266:2: (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )? )
            // InternalArchitecture.g:1267:3: this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConstraintExpressionAccess().getCompareExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_32);
            this_CompareExpression_0=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CompareExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalArchitecture.g:1275:3: ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred1_InternalArchitecture()) ) {
                    alt26=1;
                }
            }
            else if ( (LA26_0==49) ) {
                int LA26_2 = input.LA(2);

                if ( (synpred1_InternalArchitecture()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalArchitecture.g:1276:4: ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) )
                    {
                    // InternalArchitecture.g:1276:4: ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) )
                    // InternalArchitecture.g:1277:5: ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) )
                    {
                    // InternalArchitecture.g:1287:5: ( () ( (lv_operator_2_0= ruleLogicOperator ) ) )
                    // InternalArchitecture.g:1288:6: () ( (lv_operator_2_0= ruleLogicOperator ) )
                    {
                    // InternalArchitecture.g:1288:6: ()
                    // InternalArchitecture.g:1289:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalArchitecture.g:1295:6: ( (lv_operator_2_0= ruleLogicOperator ) )
                    // InternalArchitecture.g:1296:7: (lv_operator_2_0= ruleLogicOperator )
                    {
                    // InternalArchitecture.g:1296:7: (lv_operator_2_0= ruleLogicOperator )
                    // InternalArchitecture.g:1297:8: lv_operator_2_0= ruleLogicOperator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0());
                      							
                    }
                    pushFollow(FOLLOW_27);
                    lv_operator_2_0=ruleLogicOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
                      								}
                      								set(
                      									current,
                      									"operator",
                      									lv_operator_2_0,
                      									"de.cau.cs.se.geco.architecture.Architecture.LogicOperator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }


                    }

                    // InternalArchitecture.g:1316:4: ( (lv_right_3_0= ruleConstraintExpression ) )
                    // InternalArchitecture.g:1317:5: (lv_right_3_0= ruleConstraintExpression )
                    {
                    // InternalArchitecture.g:1317:5: (lv_right_3_0= ruleConstraintExpression )
                    // InternalArchitecture.g:1318:6: lv_right_3_0= ruleConstraintExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstraintExpressionAccess().getRightConstraintExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleConstraintExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getConstraintExpressionRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"de.cau.cs.se.geco.architecture.Architecture.ConstraintExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstraintExpression"


    // $ANTLR start "entryRuleCompareExpression"
    // InternalArchitecture.g:1340:1: entryRuleCompareExpression returns [EObject current=null] : iv_ruleCompareExpression= ruleCompareExpression EOF ;
    public final EObject entryRuleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareExpression = null;


        try {
            // InternalArchitecture.g:1340:58: (iv_ruleCompareExpression= ruleCompareExpression EOF )
            // InternalArchitecture.g:1341:2: iv_ruleCompareExpression= ruleCompareExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCompareExpression=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompareExpression"


    // $ANTLR start "ruleCompareExpression"
    // InternalArchitecture.g:1347:1: ruleCompareExpression returns [EObject current=null] : (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_comparator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )? ) ;
    public final EObject ruleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BasicConstraint_0 = null;

        Enumerator lv_comparator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:1353:2: ( (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_comparator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )? ) )
            // InternalArchitecture.g:1354:2: (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_comparator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )? )
            {
            // InternalArchitecture.g:1354:2: (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_comparator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )? )
            // InternalArchitecture.g:1355:3: this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_comparator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCompareExpressionAccess().getBasicConstraintParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_33);
            this_BasicConstraint_0=ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BasicConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalArchitecture.g:1363:3: ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_comparator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalArchitecture.g:1364:4: ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_comparator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) )
                    {
                    // InternalArchitecture.g:1364:4: ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_comparator_2_0= ruleComparator ) ) ) )
                    // InternalArchitecture.g:1365:5: ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_comparator_2_0= ruleComparator ) ) )
                    {
                    // InternalArchitecture.g:1375:5: ( () ( (lv_comparator_2_0= ruleComparator ) ) )
                    // InternalArchitecture.g:1376:6: () ( (lv_comparator_2_0= ruleComparator ) )
                    {
                    // InternalArchitecture.g:1376:6: ()
                    // InternalArchitecture.g:1377:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalArchitecture.g:1383:6: ( (lv_comparator_2_0= ruleComparator ) )
                    // InternalArchitecture.g:1384:7: (lv_comparator_2_0= ruleComparator )
                    {
                    // InternalArchitecture.g:1384:7: (lv_comparator_2_0= ruleComparator )
                    // InternalArchitecture.g:1385:8: lv_comparator_2_0= ruleComparator
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getCompareExpressionAccess().getComparatorComparatorEnumRuleCall_1_0_0_1_0());
                      							
                    }
                    pushFollow(FOLLOW_27);
                    lv_comparator_2_0=ruleComparator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getCompareExpressionRule());
                      								}
                      								set(
                      									current,
                      									"comparator",
                      									lv_comparator_2_0,
                      									"de.cau.cs.se.geco.architecture.Architecture.Comparator");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }


                    }

                    // InternalArchitecture.g:1404:4: ( (lv_right_3_0= ruleBasicConstraint ) )
                    // InternalArchitecture.g:1405:5: (lv_right_3_0= ruleBasicConstraint )
                    {
                    // InternalArchitecture.g:1405:5: (lv_right_3_0= ruleBasicConstraint )
                    // InternalArchitecture.g:1406:6: lv_right_3_0= ruleBasicConstraint
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCompareExpressionAccess().getRightBasicConstraintParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleBasicConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCompareExpressionRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"de.cau.cs.se.geco.architecture.Architecture.BasicConstraint");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCompareExpression"


    // $ANTLR start "entryRuleBasicConstraint"
    // InternalArchitecture.g:1428:1: entryRuleBasicConstraint returns [EObject current=null] : iv_ruleBasicConstraint= ruleBasicConstraint EOF ;
    public final EObject entryRuleBasicConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicConstraint = null;


        try {
            // InternalArchitecture.g:1428:56: (iv_ruleBasicConstraint= ruleBasicConstraint EOF )
            // InternalArchitecture.g:1429:2: iv_ruleBasicConstraint= ruleBasicConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicConstraint=ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicConstraint"


    // $ANTLR start "ruleBasicConstraint"
    // InternalArchitecture.g:1435:1: ruleBasicConstraint returns [EObject current=null] : (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Operand_1= ruleOperand | this_Negation_2= ruleNegation ) ;
    public final EObject ruleBasicConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ParenthesisConstraint_0 = null;

        EObject this_Operand_1 = null;

        EObject this_Negation_2 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:1441:2: ( (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Operand_1= ruleOperand | this_Negation_2= ruleNegation ) )
            // InternalArchitecture.g:1442:2: (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Operand_1= ruleOperand | this_Negation_2= ruleNegation )
            {
            // InternalArchitecture.g:1442:2: (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Operand_1= ruleOperand | this_Negation_2= ruleNegation )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt28=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 39:
            case 44:
                {
                alt28=2;
                }
                break;
            case 38:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalArchitecture.g:1443:3: this_ParenthesisConstraint_0= ruleParenthesisConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicConstraintAccess().getParenthesisConstraintParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParenthesisConstraint_0=ruleParenthesisConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParenthesisConstraint_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:1452:3: this_Operand_1= ruleOperand
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicConstraintAccess().getOperandParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Operand_1=ruleOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Operand_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalArchitecture.g:1461:3: this_Negation_2= ruleNegation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBasicConstraintAccess().getNegationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Negation_2=ruleNegation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Negation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBasicConstraint"


    // $ANTLR start "entryRuleNegation"
    // InternalArchitecture.g:1473:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // InternalArchitecture.g:1473:49: (iv_ruleNegation= ruleNegation EOF )
            // InternalArchitecture.g:1474:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalArchitecture.g:1480:1: ruleNegation returns [EObject current=null] : (otherlv_0= '!' ( (lv_constraint_1_0= ruleConstraintExpression ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:1486:2: ( (otherlv_0= '!' ( (lv_constraint_1_0= ruleConstraintExpression ) ) ) )
            // InternalArchitecture.g:1487:2: (otherlv_0= '!' ( (lv_constraint_1_0= ruleConstraintExpression ) ) )
            {
            // InternalArchitecture.g:1487:2: (otherlv_0= '!' ( (lv_constraint_1_0= ruleConstraintExpression ) ) )
            // InternalArchitecture.g:1488:3: otherlv_0= '!' ( (lv_constraint_1_0= ruleConstraintExpression ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
              		
            }
            // InternalArchitecture.g:1492:3: ( (lv_constraint_1_0= ruleConstraintExpression ) )
            // InternalArchitecture.g:1493:4: (lv_constraint_1_0= ruleConstraintExpression )
            {
            // InternalArchitecture.g:1493:4: (lv_constraint_1_0= ruleConstraintExpression )
            // InternalArchitecture.g:1494:5: lv_constraint_1_0= ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNegationAccess().getConstraintConstraintExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_constraint_1_0=ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNegationRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"de.cau.cs.se.geco.architecture.Architecture.ConstraintExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleParenthesisConstraint"
    // InternalArchitecture.g:1515:1: entryRuleParenthesisConstraint returns [EObject current=null] : iv_ruleParenthesisConstraint= ruleParenthesisConstraint EOF ;
    public final EObject entryRuleParenthesisConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisConstraint = null;


        try {
            // InternalArchitecture.g:1515:62: (iv_ruleParenthesisConstraint= ruleParenthesisConstraint EOF )
            // InternalArchitecture.g:1516:2: iv_ruleParenthesisConstraint= ruleParenthesisConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesisConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParenthesisConstraint=ruleParenthesisConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesisConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenthesisConstraint"


    // $ANTLR start "ruleParenthesisConstraint"
    // InternalArchitecture.g:1522:1: ruleParenthesisConstraint returns [EObject current=null] : (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesisConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:1528:2: ( (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' ) )
            // InternalArchitecture.g:1529:2: (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' )
            {
            // InternalArchitecture.g:1529:2: (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' )
            // InternalArchitecture.g:1530:3: otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParenthesisConstraintAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalArchitecture.g:1534:3: ( (lv_constraint_1_0= ruleConstraintExpression ) )
            // InternalArchitecture.g:1535:4: (lv_constraint_1_0= ruleConstraintExpression )
            {
            // InternalArchitecture.g:1535:4: (lv_constraint_1_0= ruleConstraintExpression )
            // InternalArchitecture.g:1536:5: lv_constraint_1_0= ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParenthesisConstraintAccess().getConstraintConstraintExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_34);
            lv_constraint_1_0=ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParenthesisConstraintRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"de.cau.cs.se.geco.architecture.Architecture.ConstraintExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParenthesisConstraintAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParenthesisConstraint"


    // $ANTLR start "entryRuleOperand"
    // InternalArchitecture.g:1561:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // InternalArchitecture.g:1561:48: (iv_ruleOperand= ruleOperand EOF )
            // InternalArchitecture.g:1562:2: iv_ruleOperand= ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperand=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalArchitecture.g:1568:1: ruleOperand returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_NodeProperty_1= ruleNodeProperty | this_InstanceOf_2= ruleInstanceOf ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_NodeProperty_1 = null;

        EObject this_InstanceOf_2 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:1574:2: ( (this_Literal_0= ruleLiteral | this_NodeProperty_1= ruleNodeProperty | this_InstanceOf_2= ruleInstanceOf ) )
            // InternalArchitecture.g:1575:2: (this_Literal_0= ruleLiteral | this_NodeProperty_1= ruleNodeProperty | this_InstanceOf_2= ruleInstanceOf )
            {
            // InternalArchitecture.g:1575:2: (this_Literal_0= ruleLiteral | this_NodeProperty_1= ruleNodeProperty | this_InstanceOf_2= ruleInstanceOf )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 44:
                {
                alt29=1;
                }
                break;
            case RULE_ID:
                {
                alt29=2;
                }
                break;
            case 39:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalArchitecture.g:1576:3: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandAccess().getLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Literal_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:1585:3: this_NodeProperty_1= ruleNodeProperty
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandAccess().getNodePropertyParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NodeProperty_1=ruleNodeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NodeProperty_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalArchitecture.g:1594:3: this_InstanceOf_2= ruleInstanceOf
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperandAccess().getInstanceOfParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InstanceOf_2=ruleInstanceOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InstanceOf_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleInstanceOf"
    // InternalArchitecture.g:1606:1: entryRuleInstanceOf returns [EObject current=null] : iv_ruleInstanceOf= ruleInstanceOf EOF ;
    public final EObject entryRuleInstanceOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceOf = null;


        try {
            // InternalArchitecture.g:1606:51: (iv_ruleInstanceOf= ruleInstanceOf EOF )
            // InternalArchitecture.g:1607:2: iv_ruleInstanceOf= ruleInstanceOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceOfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstanceOf=ruleInstanceOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceOf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstanceOf"


    // $ANTLR start "ruleInstanceOf"
    // InternalArchitecture.g:1613:1: ruleInstanceOf returns [EObject current=null] : (otherlv_0= 'is' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleInstanceOf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArchitecture.g:1619:2: ( (otherlv_0= 'is' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalArchitecture.g:1620:2: (otherlv_0= 'is' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalArchitecture.g:1620:2: (otherlv_0= 'is' ( (otherlv_1= RULE_ID ) ) )
            // InternalArchitecture.g:1621:3: otherlv_0= 'is' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInstanceOfAccess().getIsKeyword_0());
              		
            }
            // InternalArchitecture.g:1625:3: ( (otherlv_1= RULE_ID ) )
            // InternalArchitecture.g:1626:4: (otherlv_1= RULE_ID )
            {
            // InternalArchitecture.g:1626:4: (otherlv_1= RULE_ID )
            // InternalArchitecture.g:1627:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceOfRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getInstanceOfAccess().getTypeJvmTypeCrossReference_1_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInstanceOf"


    // $ANTLR start "entryRuleTargetTraceModel"
    // InternalArchitecture.g:1642:1: entryRuleTargetTraceModel returns [EObject current=null] : iv_ruleTargetTraceModel= ruleTargetTraceModel EOF ;
    public final EObject entryRuleTargetTraceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetTraceModel = null;


        try {
            // InternalArchitecture.g:1642:57: (iv_ruleTargetTraceModel= ruleTargetTraceModel EOF )
            // InternalArchitecture.g:1643:2: iv_ruleTargetTraceModel= ruleTargetTraceModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetTraceModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTargetTraceModel=ruleTargetTraceModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTargetTraceModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTargetTraceModel"


    // $ANTLR start "ruleTargetTraceModel"
    // InternalArchitecture.g:1649:1: ruleTargetTraceModel returns [EObject current=null] : (this_TraceModel_0= ruleTraceModel | (otherlv_1= 'use' this_TraceModelReference_2= ruleTraceModelReference ) ) ;
    public final EObject ruleTargetTraceModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_TraceModel_0 = null;

        EObject this_TraceModelReference_2 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:1655:2: ( (this_TraceModel_0= ruleTraceModel | (otherlv_1= 'use' this_TraceModelReference_2= ruleTraceModelReference ) ) )
            // InternalArchitecture.g:1656:2: (this_TraceModel_0= ruleTraceModel | (otherlv_1= 'use' this_TraceModelReference_2= ruleTraceModelReference ) )
            {
            // InternalArchitecture.g:1656:2: (this_TraceModel_0= ruleTraceModel | (otherlv_1= 'use' this_TraceModelReference_2= ruleTraceModelReference ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==40) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalArchitecture.g:1657:3: this_TraceModel_0= ruleTraceModel
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTargetTraceModelAccess().getTraceModelParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TraceModel_0=ruleTraceModel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TraceModel_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:1666:3: (otherlv_1= 'use' this_TraceModelReference_2= ruleTraceModelReference )
                    {
                    // InternalArchitecture.g:1666:3: (otherlv_1= 'use' this_TraceModelReference_2= ruleTraceModelReference )
                    // InternalArchitecture.g:1667:4: otherlv_1= 'use' this_TraceModelReference_2= ruleTraceModelReference
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTargetTraceModelAccess().getUseKeyword_1_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTargetTraceModelAccess().getTraceModelReferenceParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_TraceModelReference_2=ruleTraceModelReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TraceModelReference_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTargetTraceModel"


    // $ANTLR start "entryRuleTraceModelReference"
    // InternalArchitecture.g:1684:1: entryRuleTraceModelReference returns [EObject current=null] : iv_ruleTraceModelReference= ruleTraceModelReference EOF ;
    public final EObject entryRuleTraceModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceModelReference = null;


        try {
            // InternalArchitecture.g:1684:60: (iv_ruleTraceModelReference= ruleTraceModelReference EOF )
            // InternalArchitecture.g:1685:2: iv_ruleTraceModelReference= ruleTraceModelReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceModelReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTraceModelReference=ruleTraceModelReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceModelReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTraceModelReference"


    // $ANTLR start "ruleTraceModelReference"
    // InternalArchitecture.g:1691:1: ruleTraceModelReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTraceModelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:1697:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalArchitecture.g:1698:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalArchitecture.g:1698:2: ( (otherlv_0= RULE_ID ) )
            // InternalArchitecture.g:1699:3: (otherlv_0= RULE_ID )
            {
            // InternalArchitecture.g:1699:3: (otherlv_0= RULE_ID )
            // InternalArchitecture.g:1700:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getTraceModelReferenceRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getTraceModelReferenceAccess().getTraceModelTraceModelCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTraceModelReference"


    // $ANTLR start "entryRuleTraceModel"
    // InternalArchitecture.g:1714:1: entryRuleTraceModel returns [EObject current=null] : iv_ruleTraceModel= ruleTraceModel EOF ;
    public final EObject entryRuleTraceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceModel = null;


        try {
            // InternalArchitecture.g:1714:51: (iv_ruleTraceModel= ruleTraceModel EOF )
            // InternalArchitecture.g:1715:2: iv_ruleTraceModel= ruleTraceModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTraceModel=ruleTraceModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTraceModel"


    // $ANTLR start "ruleTraceModel"
    // InternalArchitecture.g:1721:1: ruleTraceModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>' ) ;
    public final EObject ruleTraceModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_nodeSetRelations_2_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:1727:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>' ) )
            // InternalArchitecture.g:1728:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>' )
            {
            // InternalArchitecture.g:1728:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>' )
            // InternalArchitecture.g:1729:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>'
            {
            // InternalArchitecture.g:1729:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalArchitecture.g:1730:4: (lv_name_0_0= RULE_ID )
            {
            // InternalArchitecture.g:1730:4: (lv_name_0_0= RULE_ID )
            // InternalArchitecture.g:1731:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTraceModelAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTraceModelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTraceModelAccess().getLessThanSignKeyword_1());
              		
            }
            // InternalArchitecture.g:1751:3: ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalArchitecture.g:1752:4: (lv_nodeSetRelations_2_0= ruleNodeSetRelation )
            	    {
            	    // InternalArchitecture.g:1752:4: (lv_nodeSetRelations_2_0= ruleNodeSetRelation )
            	    // InternalArchitecture.g:1753:5: lv_nodeSetRelations_2_0= ruleNodeSetRelation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTraceModelAccess().getNodeSetRelationsNodeSetRelationParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_nodeSetRelations_2_0=ruleNodeSetRelation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTraceModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"nodeSetRelations",
            	      						lv_nodeSetRelations_2_0,
            	      						"de.cau.cs.se.geco.architecture.Architecture.NodeSetRelation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            otherlv_3=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTraceModelAccess().getGreaterThanSignKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTraceModel"


    // $ANTLR start "entryRuleNodeSetRelation"
    // InternalArchitecture.g:1778:1: entryRuleNodeSetRelation returns [EObject current=null] : iv_ruleNodeSetRelation= ruleNodeSetRelation EOF ;
    public final EObject entryRuleNodeSetRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeSetRelation = null;


        try {
            // InternalArchitecture.g:1778:56: (iv_ruleNodeSetRelation= ruleNodeSetRelation EOF )
            // InternalArchitecture.g:1779:2: iv_ruleNodeSetRelation= ruleNodeSetRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeSetRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNodeSetRelation=ruleNodeSetRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeSetRelation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeSetRelation"


    // $ANTLR start "ruleNodeSetRelation"
    // InternalArchitecture.g:1785:1: ruleNodeSetRelation returns [EObject current=null] : (otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')' ) ;
    public final EObject ruleNodeSetRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_sourceNodes_1_0 = null;

        EObject lv_sourceNodes_3_0 = null;

        EObject lv_targetNodes_5_0 = null;

        EObject lv_targetNodes_7_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:1791:2: ( (otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')' ) )
            // InternalArchitecture.g:1792:2: (otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')' )
            {
            // InternalArchitecture.g:1792:2: (otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')' )
            // InternalArchitecture.g:1793:3: otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNodeSetRelationAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalArchitecture.g:1797:3: ( (lv_sourceNodes_1_0= ruleNodeType ) )
            // InternalArchitecture.g:1798:4: (lv_sourceNodes_1_0= ruleNodeType )
            {
            // InternalArchitecture.g:1798:4: (lv_sourceNodes_1_0= ruleNodeType )
            // InternalArchitecture.g:1799:5: lv_sourceNodes_1_0= ruleNodeType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_sourceNodes_1_0=ruleNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNodeSetRelationRule());
              					}
              					add(
              						current,
              						"sourceNodes",
              						lv_sourceNodes_1_0,
              						"de.cau.cs.se.geco.architecture.Architecture.NodeType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalArchitecture.g:1816:3: (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==19) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalArchitecture.g:1817:4: otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getNodeSetRelationAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalArchitecture.g:1821:4: ( (lv_sourceNodes_3_0= ruleNodeType ) )
            	    // InternalArchitecture.g:1822:5: (lv_sourceNodes_3_0= ruleNodeType )
            	    {
            	    // InternalArchitecture.g:1822:5: (lv_sourceNodes_3_0= ruleNodeType )
            	    // InternalArchitecture.g:1823:6: lv_sourceNodes_3_0= ruleNodeType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_sourceNodes_3_0=ruleNodeType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNodeSetRelationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"sourceNodes",
            	      							lv_sourceNodes_3_0,
            	      							"de.cau.cs.se.geco.architecture.Architecture.NodeType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_4=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getNodeSetRelationAccess().getColonKeyword_3());
              		
            }
            // InternalArchitecture.g:1845:3: ( (lv_targetNodes_5_0= ruleNodeType ) )
            // InternalArchitecture.g:1846:4: (lv_targetNodes_5_0= ruleNodeType )
            {
            // InternalArchitecture.g:1846:4: (lv_targetNodes_5_0= ruleNodeType )
            // InternalArchitecture.g:1847:5: lv_targetNodes_5_0= ruleNodeType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_targetNodes_5_0=ruleNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNodeSetRelationRule());
              					}
              					add(
              						current,
              						"targetNodes",
              						lv_targetNodes_5_0,
              						"de.cau.cs.se.geco.architecture.Architecture.NodeType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalArchitecture.g:1864:3: (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==19) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalArchitecture.g:1865:4: otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) )
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getNodeSetRelationAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalArchitecture.g:1869:4: ( (lv_targetNodes_7_0= ruleNodeType ) )
            	    // InternalArchitecture.g:1870:5: (lv_targetNodes_7_0= ruleNodeType )
            	    {
            	    // InternalArchitecture.g:1870:5: (lv_targetNodes_7_0= ruleNodeType )
            	    // InternalArchitecture.g:1871:6: lv_targetNodes_7_0= ruleNodeType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_targetNodes_7_0=ruleNodeType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getNodeSetRelationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"targetNodes",
            	      							lv_targetNodes_7_0,
            	      							"de.cau.cs.se.geco.architecture.Architecture.NodeType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getNodeSetRelationAccess().getRightParenthesisKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNodeSetRelation"


    // $ANTLR start "entryRuleNodeType"
    // InternalArchitecture.g:1897:1: entryRuleNodeType returns [EObject current=null] : iv_ruleNodeType= ruleNodeType EOF ;
    public final EObject entryRuleNodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeType = null;


        try {
            // InternalArchitecture.g:1897:49: (iv_ruleNodeType= ruleNodeType EOF )
            // InternalArchitecture.g:1898:2: iv_ruleNodeType= ruleNodeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNodeType=ruleNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNodeType"


    // $ANTLR start "ruleNodeType"
    // InternalArchitecture.g:1904:1: ruleNodeType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNodeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:1910:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalArchitecture.g:1911:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalArchitecture.g:1911:2: ( (otherlv_0= RULE_ID ) )
            // InternalArchitecture.g:1912:3: (otherlv_0= RULE_ID )
            {
            // InternalArchitecture.g:1912:3: (otherlv_0= RULE_ID )
            // InternalArchitecture.g:1913:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNodeTypeRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getNodeTypeAccess().getTypeJvmTypeCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "entryRuleLiteral"
    // InternalArchitecture.g:1927:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalArchitecture.g:1927:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalArchitecture.g:1928:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalArchitecture.g:1934:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_FloatLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;

        EObject this_ArrayLiteral_4 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:1940:2: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral ) )
            // InternalArchitecture.g:1941:2: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral )
            {
            // InternalArchitecture.g:1941:2: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral )
            int alt34=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt34=1;
                }
                break;
            case RULE_INT:
                {
                alt34=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt34=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt34=4;
                }
                break;
            case 44:
                {
                alt34=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalArchitecture.g:1942:3: this_StringLiteral_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteral_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:1951:3: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_1=ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntLiteral_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalArchitecture.g:1960:3: this_FloatLiteral_2= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FloatLiteral_2=ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FloatLiteral_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalArchitecture.g:1969:3: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_3=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteral_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalArchitecture.g:1978:3: this_ArrayLiteral_4= ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayLiteral_4=ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrayLiteral_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleArrayLiteral"
    // InternalArchitecture.g:1990:1: entryRuleArrayLiteral returns [EObject current=null] : iv_ruleArrayLiteral= ruleArrayLiteral EOF ;
    public final EObject entryRuleArrayLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteral = null;


        try {
            // InternalArchitecture.g:1990:53: (iv_ruleArrayLiteral= ruleArrayLiteral EOF )
            // InternalArchitecture.g:1991:2: iv_ruleArrayLiteral= ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayLiteral=ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayLiteral"


    // $ANTLR start "ruleArrayLiteral"
    // InternalArchitecture.g:1997:1: ruleArrayLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleArrayLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_1_0 = null;

        EObject lv_literals_3_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:2003:2: ( (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) )
            // InternalArchitecture.g:2004:2: (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            {
            // InternalArchitecture.g:2004:2: (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            // InternalArchitecture.g:2005:3: otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalArchitecture.g:2009:3: ( (lv_literals_1_0= ruleLiteral ) )
            // InternalArchitecture.g:2010:4: (lv_literals_1_0= ruleLiteral )
            {
            // InternalArchitecture.g:2010:4: (lv_literals_1_0= ruleLiteral )
            // InternalArchitecture.g:2011:5: lv_literals_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_40);
            lv_literals_1_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
              					}
              					add(
              						current,
              						"literals",
              						lv_literals_1_0,
              						"de.cau.cs.se.geco.architecture.Architecture.Literal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalArchitecture.g:2028:3: (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==19) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalArchitecture.g:2029:4: otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_39); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalArchitecture.g:2033:4: ( (lv_literals_3_0= ruleLiteral ) )
            	    // InternalArchitecture.g:2034:5: (lv_literals_3_0= ruleLiteral )
            	    {
            	    // InternalArchitecture.g:2034:5: (lv_literals_3_0= ruleLiteral )
            	    // InternalArchitecture.g:2035:6: lv_literals_3_0= ruleLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_literals_3_0=ruleLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArrayLiteralRule());
            	      						}
            	      						add(
            	      							current,
            	      							"literals",
            	      							lv_literals_3_0,
            	      							"de.cau.cs.se.geco.architecture.Architecture.Literal");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArrayLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalArchitecture.g:2061:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalArchitecture.g:2061:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalArchitecture.g:2062:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalArchitecture.g:2068:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:2074:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalArchitecture.g:2075:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalArchitecture.g:2075:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalArchitecture.g:2076:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalArchitecture.g:2076:3: (lv_value_0_0= RULE_STRING )
            // InternalArchitecture.g:2077:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getStringLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalArchitecture.g:2096:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalArchitecture.g:2096:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalArchitecture.g:2097:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalArchitecture.g:2103:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:2109:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalArchitecture.g:2110:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalArchitecture.g:2110:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalArchitecture.g:2111:3: (lv_value_0_0= RULE_INT )
            {
            // InternalArchitecture.g:2111:3: (lv_value_0_0= RULE_INT )
            // InternalArchitecture.g:2112:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getIntLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // InternalArchitecture.g:2131:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // InternalArchitecture.g:2131:53: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // InternalArchitecture.g:2132:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // InternalArchitecture.g:2138:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:2144:2: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // InternalArchitecture.g:2145:2: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // InternalArchitecture.g:2145:2: ( (lv_value_0_0= RULE_FLOAT ) )
            // InternalArchitecture.g:2146:3: (lv_value_0_0= RULE_FLOAT )
            {
            // InternalArchitecture.g:2146:3: (lv_value_0_0= RULE_FLOAT )
            // InternalArchitecture.g:2147:4: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFloatLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.cau.cs.se.geco.architecture.Architecture.FLOAT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalArchitecture.g:2166:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalArchitecture.g:2166:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalArchitecture.g:2167:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalArchitecture.g:2173:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:2179:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalArchitecture.g:2180:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalArchitecture.g:2180:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalArchitecture.g:2181:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalArchitecture.g:2181:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalArchitecture.g:2182:4: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getBooleanLiteralRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.cau.cs.se.geco.architecture.Architecture.BOOLEAN");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalArchitecture.g:2201:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalArchitecture.g:2201:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalArchitecture.g:2202:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalArchitecture.g:2208:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalArchitecture.g:2214:2: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // InternalArchitecture.g:2215:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // InternalArchitecture.g:2215:2: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // InternalArchitecture.g:2216:3: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalArchitecture.g:2223:3: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==46) && (synpred3_InternalArchitecture())) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalArchitecture.g:2224:4: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // InternalArchitecture.g:2224:4: ( ( '.' )=>kw= '.' )
            	    // InternalArchitecture.g:2225:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleModelModifier"
    // InternalArchitecture.g:2244:1: ruleModelModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'io' ) ) ;
    public final Enumerator ruleModelModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalArchitecture.g:2250:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'io' ) ) )
            // InternalArchitecture.g:2251:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'io' ) )
            {
            // InternalArchitecture.g:2251:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'io' ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt37=1;
                }
                break;
            case 31:
                {
                alt37=2;
                }
                break;
            case 47:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalArchitecture.g:2252:3: (enumLiteral_0= 'in' )
                    {
                    // InternalArchitecture.g:2252:3: (enumLiteral_0= 'in' )
                    // InternalArchitecture.g:2253:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getModelModifierAccess().getINPUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getModelModifierAccess().getINPUTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:2260:3: (enumLiteral_1= 'out' )
                    {
                    // InternalArchitecture.g:2260:3: (enumLiteral_1= 'out' )
                    // InternalArchitecture.g:2261:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getModelModifierAccess().getOUTPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getModelModifierAccess().getOUTPUTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalArchitecture.g:2268:3: (enumLiteral_2= 'io' )
                    {
                    // InternalArchitecture.g:2268:3: (enumLiteral_2= 'io' )
                    // InternalArchitecture.g:2269:4: enumLiteral_2= 'io'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getModelModifierAccess().getINTERMEDIATEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getModelModifierAccess().getINTERMEDIATEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModelModifier"


    // $ANTLR start "ruleLogicOperator"
    // InternalArchitecture.g:2279:1: ruleLogicOperator returns [Enumerator current=null] : ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) ;
    public final Enumerator ruleLogicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalArchitecture.g:2285:2: ( ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) ) )
            // InternalArchitecture.g:2286:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            {
            // InternalArchitecture.g:2286:2: ( (enumLiteral_0= '&' ) | (enumLiteral_1= '|' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            else if ( (LA38_0==49) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalArchitecture.g:2287:3: (enumLiteral_0= '&' )
                    {
                    // InternalArchitecture.g:2287:3: (enumLiteral_0= '&' )
                    // InternalArchitecture.g:2288:4: enumLiteral_0= '&'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:2295:3: (enumLiteral_1= '|' )
                    {
                    // InternalArchitecture.g:2295:3: (enumLiteral_1= '|' )
                    // InternalArchitecture.g:2296:4: enumLiteral_1= '|'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "ruleComparator"
    // InternalArchitecture.g:2306:1: ruleComparator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '~' ) ) ;
    public final Enumerator ruleComparator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalArchitecture.g:2312:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '~' ) ) )
            // InternalArchitecture.g:2313:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '~' ) )
            {
            // InternalArchitecture.g:2313:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) | (enumLiteral_6= '~' ) )
            int alt39=7;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt39=1;
                }
                break;
            case 51:
                {
                alt39=2;
                }
                break;
            case 42:
                {
                alt39=3;
                }
                break;
            case 41:
                {
                alt39=4;
                }
                break;
            case 52:
                {
                alt39=5;
                }
                break;
            case 53:
                {
                alt39=6;
                }
                break;
            case 54:
                {
                alt39=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalArchitecture.g:2314:3: (enumLiteral_0= '==' )
                    {
                    // InternalArchitecture.g:2314:3: (enumLiteral_0= '==' )
                    // InternalArchitecture.g:2315:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:2322:3: (enumLiteral_1= '!=' )
                    {
                    // InternalArchitecture.g:2322:3: (enumLiteral_1= '!=' )
                    // InternalArchitecture.g:2323:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparatorAccess().getNEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getComparatorAccess().getNEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalArchitecture.g:2330:3: (enumLiteral_2= '>' )
                    {
                    // InternalArchitecture.g:2330:3: (enumLiteral_2= '>' )
                    // InternalArchitecture.g:2331:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparatorAccess().getGREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getComparatorAccess().getGREnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalArchitecture.g:2338:3: (enumLiteral_3= '<' )
                    {
                    // InternalArchitecture.g:2338:3: (enumLiteral_3= '<' )
                    // InternalArchitecture.g:2339:4: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparatorAccess().getLWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getComparatorAccess().getLWEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalArchitecture.g:2346:3: (enumLiteral_4= '>=' )
                    {
                    // InternalArchitecture.g:2346:3: (enumLiteral_4= '>=' )
                    // InternalArchitecture.g:2347:4: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalArchitecture.g:2354:3: (enumLiteral_5= '<=' )
                    {
                    // InternalArchitecture.g:2354:3: (enumLiteral_5= '<=' )
                    // InternalArchitecture.g:2355:4: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalArchitecture.g:2362:3: (enumLiteral_6= '~' )
                    {
                    // InternalArchitecture.g:2362:3: (enumLiteral_6= '~' )
                    // InternalArchitecture.g:2363:4: enumLiteral_6= '~'
                    {
                    enumLiteral_6=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getComparatorAccess().getLIKEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getComparatorAccess().getLIKEEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparator"

    // $ANTLR start synpred1_InternalArchitecture
    public final void synpred1_InternalArchitecture_fragment() throws RecognitionException {   
        // InternalArchitecture.g:1277:5: ( ( () ( ( ruleLogicOperator ) ) ) )
        // InternalArchitecture.g:1277:6: ( () ( ( ruleLogicOperator ) ) )
        {
        // InternalArchitecture.g:1277:6: ( () ( ( ruleLogicOperator ) ) )
        // InternalArchitecture.g:1278:6: () ( ( ruleLogicOperator ) )
        {
        // InternalArchitecture.g:1278:6: ()
        // InternalArchitecture.g:1279:6: 
        {
        }

        // InternalArchitecture.g:1280:6: ( ( ruleLogicOperator ) )
        // InternalArchitecture.g:1281:7: ( ruleLogicOperator )
        {
        // InternalArchitecture.g:1281:7: ( ruleLogicOperator )
        // InternalArchitecture.g:1282:8: ruleLogicOperator
        {
        pushFollow(FOLLOW_2);
        ruleLogicOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalArchitecture

    // $ANTLR start synpred2_InternalArchitecture
    public final void synpred2_InternalArchitecture_fragment() throws RecognitionException {   
        // InternalArchitecture.g:1365:5: ( ( () ( ( ruleComparator ) ) ) )
        // InternalArchitecture.g:1365:6: ( () ( ( ruleComparator ) ) )
        {
        // InternalArchitecture.g:1365:6: ( () ( ( ruleComparator ) ) )
        // InternalArchitecture.g:1366:6: () ( ( ruleComparator ) )
        {
        // InternalArchitecture.g:1366:6: ()
        // InternalArchitecture.g:1367:6: 
        {
        }

        // InternalArchitecture.g:1368:6: ( ( ruleComparator ) )
        // InternalArchitecture.g:1369:7: ( ruleComparator )
        {
        // InternalArchitecture.g:1369:7: ( ruleComparator )
        // InternalArchitecture.g:1370:8: ruleComparator
        {
        pushFollow(FOLLOW_2);
        ruleComparator();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalArchitecture

    // $ANTLR start synpred3_InternalArchitecture
    public final void synpred3_InternalArchitecture_fragment() throws RecognitionException {   
        // InternalArchitecture.g:2225:5: ( '.' )
        // InternalArchitecture.g:2225:6: '.'
        {
        match(input,46,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalArchitecture

    // Delegated rules

    public final boolean synpred1_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\10\11\uffff";
    static final String dfa_3s = "\1\33\7\0\2\uffff";
    static final String dfa_4s = "\1\66\7\0\2\uffff";
    static final String dfa_5s = "\10\uffff\1\2\1\1";
    static final String dfa_6s = "\1\uffff\1\0\1\2\1\4\1\6\1\1\1\3\1\5\2\uffff}>";
    static final String[] dfa_7s = {
            "\1\10\6\uffff\1\10\6\uffff\1\4\1\3\5\uffff\2\10\1\1\1\2\1\5\1\6\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1363:3: ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_comparator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_5 = input.LA(1);

                         
                        int index27_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index27_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index27_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_6 = input.LA(1);

                         
                        int index27_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index27_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_3 = input.LA(1);

                         
                        int index27_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index27_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_7 = input.LA(1);

                         
                        int index27_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index27_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_4 = input.LA(1);

                         
                        int index27_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index27_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002158002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002150002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002140002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002100002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000800180000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000200010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002800010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000010C0040001F0L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x007C060000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000080000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00001000000001E0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000200000080000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000002L});

}