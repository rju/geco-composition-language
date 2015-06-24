package de.cau.cs.se.geco.architecture.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'model'", "','", "'register'", "'text'", "'weave'", "'link'", "'=>'", "':'", "'generate'", "'->'", "'<-'", "'['", "']'", "'/'", "'null'", "'!'", "'('", "')'", "'typeof'", "'<'", "'>'", "'{'", "'}'", "'&'", "'|'", "'=='", "'!='", "'>='", "'<='", "'~'", "'.'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int T__46=46;
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
    public String getGrammarFileName() { return "../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g"; }



     	private ArchitectureGrammarAccess grammarAccess;
     	
        public InternalArchitectureParser(TokenStream input, ArchitectureGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ArchitectureGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_registeredPackages_3_0= ruleRegisteredPackage ) )* ( (lv_metamodels_4_0= ruleMetamodelSequence ) )* ( (lv_connections_5_0= ruleConnection ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_registeredPackages_3_0 = null;

        EObject lv_metamodels_4_0 = null;

        EObject lv_connections_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:79:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_registeredPackages_3_0= ruleRegisteredPackage ) )* ( (lv_metamodels_4_0= ruleMetamodelSequence ) )* ( (lv_connections_5_0= ruleConnection ) )* ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_registeredPackages_3_0= ruleRegisteredPackage ) )* ( (lv_metamodels_4_0= ruleMetamodelSequence ) )* ( (lv_connections_5_0= ruleConnection ) )* )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:80:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_registeredPackages_3_0= ruleRegisteredPackage ) )* ( (lv_metamodels_4_0= ruleMetamodelSequence ) )* ( (lv_connections_5_0= ruleConnection ) )* )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_registeredPackages_3_0= ruleRegisteredPackage ) )* ( (lv_metamodels_4_0= ruleMetamodelSequence ) )* ( (lv_connections_5_0= ruleConnection ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleModel122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:85:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:85:1: (lv_name_1_0= ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:86:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel143);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:102:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel164);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:120:3: ( (lv_registeredPackages_3_0= ruleRegisteredPackage ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:121:1: (lv_registeredPackages_3_0= ruleRegisteredPackage )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:121:1: (lv_registeredPackages_3_0= ruleRegisteredPackage )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:122:3: lv_registeredPackages_3_0= ruleRegisteredPackage
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getRegisteredPackagesRegisteredPackageParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRegisteredPackage_in_ruleModel186);
            	    lv_registeredPackages_3_0=ruleRegisteredPackage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"registeredPackages",
            	              		lv_registeredPackages_3_0, 
            	              		"RegisteredPackage");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:138:3: ( (lv_metamodels_4_0= ruleMetamodelSequence ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:139:1: (lv_metamodels_4_0= ruleMetamodelSequence )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:139:1: (lv_metamodels_4_0= ruleMetamodelSequence )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:140:3: lv_metamodels_4_0= ruleMetamodelSequence
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getMetamodelsMetamodelSequenceParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMetamodelSequence_in_ruleModel208);
            	    lv_metamodels_4_0=ruleMetamodelSequence();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"metamodels",
            	              		lv_metamodels_4_0, 
            	              		"MetamodelSequence");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:156:3: ( (lv_connections_5_0= ruleConnection ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:157:1: (lv_connections_5_0= ruleConnection )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:157:1: (lv_connections_5_0= ruleConnection )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:158:3: lv_connections_5_0= ruleConnection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getConnectionsConnectionParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConnection_in_ruleModel230);
            	    lv_connections_5_0=ruleConnection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"connections",
            	              		lv_connections_5_0, 
            	              		"Connection");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:182:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:183:2: (iv_ruleImport= ruleImport EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:184:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport267);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport277); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:191:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:194:28: ( (otherlv_0= 'import' ( ( ruleQualifiedName ) ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:195:1: (otherlv_0= 'import' ( ( ruleQualifiedName ) ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:195:1: (otherlv_0= 'import' ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:195:3: otherlv_0= 'import' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:199:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:200:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:200:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:201:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getImportRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceJvmTypeCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport337);
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


    // $ANTLR start "entryRuleMetamodelSequence"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:222:1: entryRuleMetamodelSequence returns [EObject current=null] : iv_ruleMetamodelSequence= ruleMetamodelSequence EOF ;
    public final EObject entryRuleMetamodelSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodelSequence = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:223:2: (iv_ruleMetamodelSequence= ruleMetamodelSequence EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:224:2: iv_ruleMetamodelSequence= ruleMetamodelSequence EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetamodelSequenceRule()); 
            }
            pushFollow(FOLLOW_ruleMetamodelSequence_in_entryRuleMetamodelSequence373);
            iv_ruleMetamodelSequence=ruleMetamodelSequence();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetamodelSequence; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelSequence383); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMetamodelSequence"


    // $ANTLR start "ruleMetamodelSequence"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:231:1: ruleMetamodelSequence returns [EObject current=null] : (otherlv_0= 'model' ( (lv_type_1_0= ruleModelNodeType ) ) ( (lv_metamodels_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) ) )* ) ;
    public final EObject ruleMetamodelSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_metamodels_2_0 = null;

        EObject lv_metamodels_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:234:28: ( (otherlv_0= 'model' ( (lv_type_1_0= ruleModelNodeType ) ) ( (lv_metamodels_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) ) )* ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:235:1: (otherlv_0= 'model' ( (lv_type_1_0= ruleModelNodeType ) ) ( (lv_metamodels_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) ) )* )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:235:1: (otherlv_0= 'model' ( (lv_type_1_0= ruleModelNodeType ) ) ( (lv_metamodels_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) ) )* )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:235:3: otherlv_0= 'model' ( (lv_type_1_0= ruleModelNodeType ) ) ( (lv_metamodels_2_0= ruleMetamodel ) ) (otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleMetamodelSequence420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMetamodelSequenceAccess().getModelKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:239:1: ( (lv_type_1_0= ruleModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:240:1: (lv_type_1_0= ruleModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:240:1: (lv_type_1_0= ruleModelNodeType )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:241:3: lv_type_1_0= ruleModelNodeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetamodelSequenceAccess().getTypeModelNodeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleModelNodeType_in_ruleMetamodelSequence441);
            lv_type_1_0=ruleModelNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMetamodelSequenceRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"ModelNodeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:257:2: ( (lv_metamodels_2_0= ruleMetamodel ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:258:1: (lv_metamodels_2_0= ruleMetamodel )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:258:1: (lv_metamodels_2_0= ruleMetamodel )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:259:3: lv_metamodels_2_0= ruleMetamodel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMetamodel_in_ruleMetamodelSequence462);
            lv_metamodels_2_0=ruleMetamodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMetamodelSequenceRule());
              	        }
                     		add(
                     			current, 
                     			"metamodels",
                      		lv_metamodels_2_0, 
                      		"Metamodel");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:275:2: (otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:275:4: otherlv_3= ',' ( (lv_metamodels_4_0= ruleMetamodel ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleMetamodelSequence475); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMetamodelSequenceAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:279:1: ( (lv_metamodels_4_0= ruleMetamodel ) )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:280:1: (lv_metamodels_4_0= ruleMetamodel )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:280:1: (lv_metamodels_4_0= ruleMetamodel )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:281:3: lv_metamodels_4_0= ruleMetamodel
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMetamodel_in_ruleMetamodelSequence496);
            	    lv_metamodels_4_0=ruleMetamodel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMetamodelSequenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"metamodels",
            	              		lv_metamodels_4_0, 
            	              		"Metamodel");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleMetamodelSequence"


    // $ANTLR start "entryRuleMetamodel"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:305:1: entryRuleMetamodel returns [EObject current=null] : iv_ruleMetamodel= ruleMetamodel EOF ;
    public final EObject entryRuleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodel = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:306:2: (iv_ruleMetamodel= ruleMetamodel EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:307:2: iv_ruleMetamodel= ruleMetamodel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetamodelRule()); 
            }
            pushFollow(FOLLOW_ruleMetamodel_in_entryRuleMetamodel534);
            iv_ruleMetamodel=ruleMetamodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetamodel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodel544); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMetamodel"


    // $ANTLR start "ruleMetamodel"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:314:1: ruleMetamodel returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleMetamodel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:317:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:318:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:318:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:319:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:319:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:320:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetamodel585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMetamodelRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRuleRegisteredPackage"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:344:1: entryRuleRegisteredPackage returns [EObject current=null] : iv_ruleRegisteredPackage= ruleRegisteredPackage EOF ;
    public final EObject entryRuleRegisteredPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisteredPackage = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:345:2: (iv_ruleRegisteredPackage= ruleRegisteredPackage EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:346:2: iv_ruleRegisteredPackage= ruleRegisteredPackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegisteredPackageRule()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage625);
            iv_ruleRegisteredPackage=ruleRegisteredPackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegisteredPackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisteredPackage635); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRegisteredPackage"


    // $ANTLR start "ruleRegisteredPackage"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:353:1: ruleRegisteredPackage returns [EObject current=null] : (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleQualifiedName ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleRegisteredPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_isText_3_0=null;
        Token lv_extension_4_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:356:28: ( (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleQualifiedName ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:357:1: (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleQualifiedName ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:357:1: (otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleQualifiedName ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:357:3: otherlv_0= 'register' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ruleQualifiedName ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleRegisteredPackage672); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRegisteredPackageAccess().getRegisterKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:361:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:362:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:362:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:363:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRegisteredPackage689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRegisteredPackageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRegisteredPackageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:379:2: ( ( ( ruleQualifiedName ) ) | ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:379:3: ( ( ruleQualifiedName ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:379:3: ( ( ruleQualifiedName ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:380:1: ( ruleQualifiedName )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:380:1: ( ruleQualifiedName )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:381:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRegisteredPackageRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceJvmTypeCrossReference_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRegisteredPackage718);
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:395:6: ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:395:6: ( ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:395:7: ( (lv_isText_3_0= 'text' ) ) ( (lv_extension_4_0= RULE_STRING ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:395:7: ( (lv_isText_3_0= 'text' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:396:1: (lv_isText_3_0= 'text' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:396:1: (lv_isText_3_0= 'text' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:397:3: lv_isText_3_0= 'text'
                    {
                    lv_isText_3_0=(Token)match(input,19,FOLLOW_19_in_ruleRegisteredPackage743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isText_3_0, grammarAccess.getRegisteredPackageAccess().getIsTextTextKeyword_2_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRegisteredPackageRule());
                      	        }
                             		setWithLastConsumed(current, "isText", true, "text");
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:410:2: ( (lv_extension_4_0= RULE_STRING ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:411:1: (lv_extension_4_0= RULE_STRING )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:411:1: (lv_extension_4_0= RULE_STRING )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:412:3: lv_extension_4_0= RULE_STRING
                    {
                    lv_extension_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRegisteredPackage773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_extension_4_0, grammarAccess.getRegisteredPackageAccess().getExtensionSTRINGTerminalRuleCall_2_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRegisteredPackageRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"extension",
                              		lv_extension_4_0, 
                              		"STRING");
                      	    
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
    // $ANTLR end "ruleRegisteredPackage"


    // $ANTLR start "entryRuleConnection"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:436:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:437:2: (iv_ruleConnection= ruleConnection EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:438:2: iv_ruleConnection= ruleConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectionRule()); 
            }
            pushFollow(FOLLOW_ruleConnection_in_entryRuleConnection816);
            iv_ruleConnection=ruleConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnection826); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:445:1: ruleConnection returns [EObject current=null] : (this_Generator_0= ruleGenerator | this_Weaver_1= ruleWeaver ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        EObject this_Generator_0 = null;

        EObject this_Weaver_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:448:28: ( (this_Generator_0= ruleGenerator | this_Weaver_1= ruleWeaver ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:449:1: (this_Generator_0= ruleGenerator | this_Weaver_1= ruleWeaver )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:449:1: (this_Generator_0= ruleGenerator | this_Weaver_1= ruleWeaver )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:450:5: this_Generator_0= ruleGenerator
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConnectionAccess().getGeneratorParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGenerator_in_ruleConnection873);
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:460:5: this_Weaver_1= ruleWeaver
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConnectionAccess().getWeaverParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleWeaver_in_ruleConnection900);
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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleWeaver"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:476:1: entryRuleWeaver returns [EObject current=null] : iv_ruleWeaver= ruleWeaver EOF ;
    public final EObject entryRuleWeaver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeaver = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:477:2: (iv_ruleWeaver= ruleWeaver EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:478:2: iv_ruleWeaver= ruleWeaver EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWeaverRule()); 
            }
            pushFollow(FOLLOW_ruleWeaver_in_entryRuleWeaver935);
            iv_ruleWeaver=ruleWeaver();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWeaver; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeaver945); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:485:1: ruleWeaver returns [EObject current=null] : (otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) | otherlv_3= 'link' ) ( (lv_aspectModel_4_0= ruleAspectModel ) ) (otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModelNodeType ) ) )? ) ;
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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:488:28: ( (otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) | otherlv_3= 'link' ) ( (lv_aspectModel_4_0= ruleAspectModel ) ) (otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModelNodeType ) ) )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:489:1: (otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) | otherlv_3= 'link' ) ( (lv_aspectModel_4_0= ruleAspectModel ) ) (otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModelNodeType ) ) )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:489:1: (otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) | otherlv_3= 'link' ) ( (lv_aspectModel_4_0= ruleAspectModel ) ) (otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModelNodeType ) ) )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:489:3: otherlv_0= 'weave' ( (otherlv_1= RULE_ID ) ) ( ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) | otherlv_3= 'link' ) ( (lv_aspectModel_4_0= ruleAspectModel ) ) (otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModelNodeType ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleWeaver982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWeaverAccess().getWeaveKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:493:1: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:494:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:494:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:495:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getWeaverRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWeaver1002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getWeaverAccess().getReferenceJvmTypeCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:506:2: ( ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) | otherlv_3= 'link' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==30) ) {
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:506:3: ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:506:3: ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:507:1: (lv_sourceModel_2_0= ruleSourceModelNodeSelector )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:507:1: (lv_sourceModel_2_0= ruleSourceModelNodeSelector )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:508:3: lv_sourceModel_2_0= ruleSourceModelNodeSelector
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWeaverAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_ruleWeaver1024);
                    lv_sourceModel_2_0=ruleSourceModelNodeSelector();

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
                              		"SourceModelNodeSelector");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:525:7: otherlv_3= 'link'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleWeaver1042); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getWeaverAccess().getLinkKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:529:2: ( (lv_aspectModel_4_0= ruleAspectModel ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:530:1: (lv_aspectModel_4_0= ruleAspectModel )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:530:1: (lv_aspectModel_4_0= ruleAspectModel )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:531:3: lv_aspectModel_4_0= ruleAspectModel
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWeaverAccess().getAspectModelAspectModelParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAspectModel_in_ruleWeaver1064);
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
                      		"AspectModel");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:547:2: (otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModelNodeType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:547:4: otherlv_5= '=>' ( (lv_targetModel_6_0= ruleTargetModelNodeType ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleWeaver1077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getWeaverAccess().getEqualsSignGreaterThanSignKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:551:1: ( (lv_targetModel_6_0= ruleTargetModelNodeType ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:552:1: (lv_targetModel_6_0= ruleTargetModelNodeType )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:552:1: (lv_targetModel_6_0= ruleTargetModelNodeType )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:553:3: lv_targetModel_6_0= ruleTargetModelNodeType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWeaverAccess().getTargetModelTargetModelNodeTypeParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTargetModelNodeType_in_ruleWeaver1098);
                    lv_targetModel_6_0=ruleTargetModelNodeType();

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
                              		"TargetModelNodeType");
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:577:1: entryRuleAspectModel returns [EObject current=null] : iv_ruleAspectModel= ruleAspectModel EOF ;
    public final EObject entryRuleAspectModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspectModel = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:578:2: (iv_ruleAspectModel= ruleAspectModel EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:579:2: iv_ruleAspectModel= ruleAspectModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAspectModelRule()); 
            }
            pushFollow(FOLLOW_ruleAspectModel_in_entryRuleAspectModel1136);
            iv_ruleAspectModel=ruleAspectModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAspectModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspectModel1146); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:586:1: ruleAspectModel returns [EObject current=null] : ( (otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType ) | this_Generator_2= ruleGenerator ) ;
    public final EObject ruleAspectModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TargetModelNodeType_1 = null;

        EObject this_Generator_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:589:28: ( ( (otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType ) | this_Generator_2= ruleGenerator ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:590:1: ( (otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType ) | this_Generator_2= ruleGenerator )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:590:1: ( (otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType ) | this_Generator_2= ruleGenerator )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:590:2: (otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:590:2: (otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:590:4: otherlv_0= ':' this_TargetModelNodeType_1= ruleTargetModelNodeType
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleAspectModel1184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getAspectModelAccess().getColonKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAspectModelAccess().getTargetModelNodeTypeParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTargetModelNodeType_in_ruleAspectModel1206);
                    this_TargetModelNodeType_1=ruleTargetModelNodeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TargetModelNodeType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:605:5: this_Generator_2= ruleGenerator
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAspectModelAccess().getGeneratorParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGenerator_in_ruleAspectModel1234);
                    this_Generator_2=ruleGenerator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Generator_2; 
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


    // $ANTLR start "entryRuleGenerator"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:621:1: entryRuleGenerator returns [EObject current=null] : iv_ruleGenerator= ruleGenerator EOF ;
    public final EObject entryRuleGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerator = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:622:2: (iv_ruleGenerator= ruleGenerator EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:623:2: iv_ruleGenerator= ruleGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneratorRule()); 
            }
            pushFollow(FOLLOW_ruleGenerator_in_entryRuleGenerator1269);
            iv_ruleGenerator=ruleGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerator1279); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:630:1: ruleGenerator returns [EObject current=null] : (otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_targetModel_3_0= ruleTargetModelNodeType ) ) (otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) ) )? (otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ) ;
    public final EObject ruleGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_sourceModel_2_0 = null;

        EObject lv_targetModel_3_0 = null;

        EObject lv_writeTraceModel_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:633:28: ( (otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_targetModel_3_0= ruleTargetModelNodeType ) ) (otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) ) )? (otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:634:1: (otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_targetModel_3_0= ruleTargetModelNodeType ) ) (otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) ) )? (otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:634:1: (otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_targetModel_3_0= ruleTargetModelNodeType ) ) (otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) ) )? (otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:634:3: otherlv_0= 'generate' ( (otherlv_1= RULE_ID ) ) ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) ) ( (lv_targetModel_3_0= ruleTargetModelNodeType ) ) (otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) ) )? (otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGenerator1316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGeneratorAccess().getGenerateKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:638:1: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:639:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:639:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:640:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGeneratorRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenerator1336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getGeneratorAccess().getReferenceJvmTypeCrossReference_1_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:651:2: ( (lv_sourceModel_2_0= ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:652:1: (lv_sourceModel_2_0= ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:652:1: (lv_sourceModel_2_0= ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:653:3: lv_sourceModel_2_0= ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGeneratorAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_ruleGenerator1357);
            lv_sourceModel_2_0=ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGeneratorRule());
              	        }
                     		set(
                     			current, 
                     			"sourceModel",
                      		lv_sourceModel_2_0, 
                      		"SourceModelNodeSelector");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:669:2: ( (lv_targetModel_3_0= ruleTargetModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:670:1: (lv_targetModel_3_0= ruleTargetModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:670:1: (lv_targetModel_3_0= ruleTargetModelNodeType )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:671:3: lv_targetModel_3_0= ruleTargetModelNodeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGeneratorAccess().getTargetModelTargetModelNodeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_ruleGenerator1378);
            lv_targetModel_3_0=ruleTargetModelNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGeneratorRule());
              	        }
                     		set(
                     			current, 
                     			"targetModel",
                      		lv_targetModel_3_0, 
                      		"TargetModelNodeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:687:2: (otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:687:4: otherlv_4= '->' ( (lv_writeTraceModel_5_0= ruleTraceModel ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleGenerator1391); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getGeneratorAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:691:1: ( (lv_writeTraceModel_5_0= ruleTraceModel ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:692:1: (lv_writeTraceModel_5_0= ruleTraceModel )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:692:1: (lv_writeTraceModel_5_0= ruleTraceModel )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:693:3: lv_writeTraceModel_5_0= ruleTraceModel
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGeneratorAccess().getWriteTraceModelTraceModelParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTraceModel_in_ruleGenerator1412);
                    lv_writeTraceModel_5_0=ruleTraceModel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGeneratorRule());
                      	        }
                             		set(
                             			current, 
                             			"writeTraceModel",
                              		lv_writeTraceModel_5_0, 
                              		"TraceModel");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:709:4: (otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:709:6: otherlv_6= '<-' ( (otherlv_7= RULE_ID ) ) (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleGenerator1427); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getGeneratorAccess().getLessThanSignHyphenMinusKeyword_5_0());
                          
                    }
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:713:1: ( (otherlv_7= RULE_ID ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:714:1: (otherlv_7= RULE_ID )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:714:1: (otherlv_7= RULE_ID )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:715:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getGeneratorRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenerator1447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelCrossReference_5_1_0()); 
                      	
                    }

                    }


                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:726:2: (otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:726:4: otherlv_8= ',' ( (otherlv_9= RULE_ID ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleGenerator1460); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getGeneratorAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:730:1: ( (otherlv_9= RULE_ID ) )
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:731:1: (otherlv_9= RULE_ID )
                    	    {
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:731:1: (otherlv_9= RULE_ID )
                    	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:732:3: otherlv_9= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getGeneratorRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenerator1480); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_9, grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelCrossReference_5_2_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


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


    // $ANTLR start "entryRuleSourceModelNodeSelector"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:751:1: entryRuleSourceModelNodeSelector returns [EObject current=null] : iv_ruleSourceModelNodeSelector= ruleSourceModelNodeSelector EOF ;
    public final EObject entryRuleSourceModelNodeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceModelNodeSelector = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:752:2: (iv_ruleSourceModelNodeSelector= ruleSourceModelNodeSelector EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:753:2: iv_ruleSourceModelNodeSelector= ruleSourceModelNodeSelector EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceModelNodeSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_entryRuleSourceModelNodeSelector1520);
            iv_ruleSourceModelNodeSelector=ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSourceModelNodeSelector; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceModelNodeSelector1530); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSourceModelNodeSelector"


    // $ANTLR start "ruleSourceModelNodeSelector"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:760:1: ruleSourceModelNodeSelector returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )? ) | ( () otherlv_7= 'null' ) ) ;
    public final EObject ruleSourceModelNodeSelector() throws RecognitionException {
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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:763:28: ( ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )? ) | ( () otherlv_7= 'null' ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:764:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )? ) | ( () otherlv_7= 'null' ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:764:1: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )? ) | ( () otherlv_7= 'null' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==30) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:764:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )? )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:764:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )? )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:764:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )?
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:764:3: ( (otherlv_0= RULE_ID ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:765:1: (otherlv_0= RULE_ID )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:765:1: (otherlv_0= RULE_ID )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:766:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSourceModelNodeSelectorRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSourceModelNodeSelector1576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getSourceModelNodeSelectorAccess().getReferenceMetamodelCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:777:2: (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==27) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:777:4: otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']'
                            {
                            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleSourceModelNodeSelector1589); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getSourceModelNodeSelectorAccess().getLeftSquareBracketKeyword_0_1_0());
                                  
                            }
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:781:1: ( (lv_constraint_2_0= ruleConstraintExpression ) )
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:782:1: (lv_constraint_2_0= ruleConstraintExpression )
                            {
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:782:1: (lv_constraint_2_0= ruleConstraintExpression )
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:783:3: lv_constraint_2_0= ruleConstraintExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSourceModelNodeSelectorAccess().getConstraintConstraintExpressionParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConstraintExpression_in_ruleSourceModelNodeSelector1610);
                            lv_constraint_2_0=ruleConstraintExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSourceModelNodeSelectorRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"constraint",
                                      		lv_constraint_2_0, 
                                      		"ConstraintExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleSourceModelNodeSelector1622); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getSourceModelNodeSelectorAccess().getRightSquareBracketKeyword_0_1_2());
                                  
                            }

                            }
                            break;

                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:803:3: (otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==29) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:803:5: otherlv_4= '/' ( (lv_property_5_0= ruleNodeProperty ) )
                            {
                            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleSourceModelNodeSelector1637); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getSourceModelNodeSelectorAccess().getSolidusKeyword_0_2_0());
                                  
                            }
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:807:1: ( (lv_property_5_0= ruleNodeProperty ) )
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:808:1: (lv_property_5_0= ruleNodeProperty )
                            {
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:808:1: (lv_property_5_0= ruleNodeProperty )
                            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:809:3: lv_property_5_0= ruleNodeProperty
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyNodePropertyParserRuleCall_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNodeProperty_in_ruleSourceModelNodeSelector1658);
                            lv_property_5_0=ruleNodeProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSourceModelNodeSelectorRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"property",
                                      		lv_property_5_0, 
                                      		"NodeProperty");
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:826:6: ( () otherlv_7= 'null' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:826:6: ( () otherlv_7= 'null' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:826:7: () otherlv_7= 'null'
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:826:7: ()
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:827:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSourceModelNodeSelectorAccess().getSourceModelNodeSelectorAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleSourceModelNodeSelector1689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSourceModelNodeSelectorAccess().getNullKeyword_1_1());
                          
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
    // $ANTLR end "ruleSourceModelNodeSelector"


    // $ANTLR start "entryRuleTargetModelNodeType"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:844:1: entryRuleTargetModelNodeType returns [EObject current=null] : iv_ruleTargetModelNodeType= ruleTargetModelNodeType EOF ;
    public final EObject entryRuleTargetModelNodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetModelNodeType = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:845:2: (iv_ruleTargetModelNodeType= ruleTargetModelNodeType EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:846:2: iv_ruleTargetModelNodeType= ruleTargetModelNodeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTargetModelNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_entryRuleTargetModelNodeType1726);
            iv_ruleTargetModelNodeType=ruleTargetModelNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTargetModelNodeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetModelNodeType1736); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTargetModelNodeType"


    // $ANTLR start "ruleTargetModelNodeType"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:853:1: ruleTargetModelNodeType returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleTargetModelNodeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:856:28: ( ( () ( (otherlv_1= RULE_ID ) )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:857:1: ( () ( (otherlv_1= RULE_ID ) )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:857:1: ( () ( (otherlv_1= RULE_ID ) )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:857:2: () ( (otherlv_1= RULE_ID ) )?
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:857:2: ()
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:858:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTargetModelNodeTypeAccess().getTargetModelNodeTypeAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:863:2: ( (otherlv_1= RULE_ID ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:864:1: (otherlv_1= RULE_ID )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:864:1: (otherlv_1= RULE_ID )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:865:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTargetModelNodeTypeRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTargetModelNodeType1790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getTargetModelNodeTypeAccess().getReferenceMetamodelCrossReference_1_0()); 
                      	
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
    // $ANTLR end "ruleTargetModelNodeType"


    // $ANTLR start "entryRuleModelNodeType"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:884:1: entryRuleModelNodeType returns [EObject current=null] : iv_ruleModelNodeType= ruleModelNodeType EOF ;
    public final EObject entryRuleModelNodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelNodeType = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:885:2: (iv_ruleModelNodeType= ruleModelNodeType EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:886:2: iv_ruleModelNodeType= ruleModelNodeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleModelNodeType_in_entryRuleModelNodeType1827);
            iv_ruleModelNodeType=ruleModelNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelNodeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelNodeType1837); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModelNodeType"


    // $ANTLR start "ruleModelNodeType"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:893:1: ruleModelNodeType returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? ) ;
    public final EObject ruleModelNodeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_property_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:896:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:897:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:897:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:897:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )?
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:897:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:898:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:898:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:899:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getModelNodeTypeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelNodeType1882); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getModelNodeTypeAccess().getTargetRegisteredPackageCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:910:2: (otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:910:4: otherlv_1= '/' ( (lv_property_2_0= ruleNodeProperty ) )
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleModelNodeType1895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getModelNodeTypeAccess().getSolidusKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:914:1: ( (lv_property_2_0= ruleNodeProperty ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:915:1: (lv_property_2_0= ruleNodeProperty )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:915:1: (lv_property_2_0= ruleNodeProperty )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:916:3: lv_property_2_0= ruleNodeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModelNodeTypeAccess().getPropertyNodePropertyParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeProperty_in_ruleModelNodeType1916);
                    lv_property_2_0=ruleNodeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getModelNodeTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"property",
                              		lv_property_2_0, 
                              		"NodeProperty");
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
    // $ANTLR end "ruleModelNodeType"


    // $ANTLR start "entryRuleNodeProperty"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:940:1: entryRuleNodeProperty returns [EObject current=null] : iv_ruleNodeProperty= ruleNodeProperty EOF ;
    public final EObject entryRuleNodeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeProperty = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:941:2: (iv_ruleNodeProperty= ruleNodeProperty EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:942:2: iv_ruleNodeProperty= ruleNodeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_entryRuleNodeProperty1954);
            iv_ruleNodeProperty=ruleNodeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeProperty1964); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:949:1: ruleNodeProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )? ) ;
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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:952:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:953:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:953:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:953:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )? (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )?
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:953:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:954:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:954:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:955:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNodePropertyRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeProperty2009); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getNodePropertyAccess().getPropertyJvmMemberCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:966:2: (otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:966:4: otherlv_1= '[' ( (lv_constraint_2_0= ruleConstraintExpression ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleNodeProperty2022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNodePropertyAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:970:1: ( (lv_constraint_2_0= ruleConstraintExpression ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:971:1: (lv_constraint_2_0= ruleConstraintExpression )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:971:1: (lv_constraint_2_0= ruleConstraintExpression )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:972:3: lv_constraint_2_0= ruleConstraintExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodePropertyAccess().getConstraintConstraintExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstraintExpression_in_ruleNodeProperty2043);
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
                              		"ConstraintExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleNodeProperty2055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNodePropertyAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:992:3: (otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:992:5: otherlv_4= '/' ( (lv_subProperty_5_0= ruleNodeProperty ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleNodeProperty2070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNodePropertyAccess().getSolidusKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:996:1: ( (lv_subProperty_5_0= ruleNodeProperty ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:997:1: (lv_subProperty_5_0= ruleNodeProperty )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:997:1: (lv_subProperty_5_0= ruleNodeProperty )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:998:3: lv_subProperty_5_0= ruleNodeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNodePropertyAccess().getSubPropertyNodePropertyParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNodeProperty_in_ruleNodeProperty2091);
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
                              		"NodeProperty");
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1022:1: entryRuleConstraintExpression returns [EObject current=null] : iv_ruleConstraintExpression= ruleConstraintExpression EOF ;
    public final EObject entryRuleConstraintExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintExpression = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1023:2: (iv_ruleConstraintExpression= ruleConstraintExpression EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1024:2: iv_ruleConstraintExpression= ruleConstraintExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression2129);
            iv_ruleConstraintExpression=ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraintExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintExpression2139); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1031:1: ruleConstraintExpression returns [EObject current=null] : (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )? ) ;
    public final EObject ruleConstraintExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1034:28: ( (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1035:1: (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1035:1: (this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1036:5: this_CompareExpression_0= ruleCompareExpression ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConstraintExpressionAccess().getCompareExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_ruleConstraintExpression2186);
            this_CompareExpression_0=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1044:1: ( ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred1_InternalArchitecture()) ) {
                    alt21=1;
                }
            }
            else if ( (LA21_0==40) ) {
                int LA21_2 = input.LA(2);

                if ( (synpred1_InternalArchitecture()) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1044:2: ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) ) ( (lv_right_3_0= ruleConstraintExpression ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1044:2: ( ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1044:3: ( ( () ( ( ruleLogicOperator ) ) ) )=> ( () ( (lv_operator_2_0= ruleLogicOperator ) ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1049:6: ( () ( (lv_operator_2_0= ruleLogicOperator ) ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1049:7: () ( (lv_operator_2_0= ruleLogicOperator ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1049:7: ()
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1050:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1055:2: ( (lv_operator_2_0= ruleLogicOperator ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1056:1: (lv_operator_2_0= ruleLogicOperator )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1056:1: (lv_operator_2_0= ruleLogicOperator )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1057:3: lv_operator_2_0= ruleLogicOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorParserRuleCall_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicOperator_in_ruleConstraintExpression2235);
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
                              		"LogicOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1073:4: ( (lv_right_3_0= ruleConstraintExpression ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1074:1: (lv_right_3_0= ruleConstraintExpression )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1074:1: (lv_right_3_0= ruleConstraintExpression )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1075:3: lv_right_3_0= ruleConstraintExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstraintExpressionAccess().getRightConstraintExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstraintExpression_in_ruleConstraintExpression2258);
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
                              		"ConstraintExpression");
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1099:1: entryRuleCompareExpression returns [EObject current=null] : iv_ruleCompareExpression= ruleCompareExpression EOF ;
    public final EObject entryRuleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareExpression = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1100:2: (iv_ruleCompareExpression= ruleCompareExpression EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1101:2: iv_ruleCompareExpression= ruleCompareExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression2296);
            iv_ruleCompareExpression=ruleCompareExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression2306); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1108:1: ruleCompareExpression returns [EObject current=null] : (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )? ) ;
    public final EObject ruleCompareExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BasicConstraint_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1111:28: ( (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )? ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1112:1: (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )? )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1112:1: (this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )? )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1113:5: this_BasicConstraint_0= ruleBasicConstraint ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareExpressionAccess().getBasicConstraintParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_ruleCompareExpression2353);
            this_BasicConstraint_0=ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BasicConstraint_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1121:1: ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1121:2: ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1121:2: ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1121:3: ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1126:6: ( () ( (lv_operator_2_0= ruleComparator ) ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1126:7: () ( (lv_operator_2_0= ruleComparator ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1126:7: ()
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1127:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1132:2: ( (lv_operator_2_0= ruleComparator ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1133:1: (lv_operator_2_0= ruleComparator )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1133:1: (lv_operator_2_0= ruleComparator )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1134:3: lv_operator_2_0= ruleComparator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getOperatorComparatorParserRuleCall_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComparator_in_ruleCompareExpression2402);
                    lv_operator_2_0=ruleComparator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompareExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"Comparator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1150:4: ( (lv_right_3_0= ruleBasicConstraint ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1151:1: (lv_right_3_0= ruleBasicConstraint )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1151:1: (lv_right_3_0= ruleBasicConstraint )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1152:3: lv_right_3_0= ruleBasicConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareExpressionAccess().getRightBasicConstraintParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBasicConstraint_in_ruleCompareExpression2425);
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
                              		"BasicConstraint");
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1176:1: entryRuleBasicConstraint returns [EObject current=null] : iv_ruleBasicConstraint= ruleBasicConstraint EOF ;
    public final EObject entryRuleBasicConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicConstraint = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1177:2: (iv_ruleBasicConstraint= ruleBasicConstraint EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1178:2: iv_ruleBasicConstraint= ruleBasicConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_entryRuleBasicConstraint2463);
            iv_ruleBasicConstraint=ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicConstraint2473); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1185:1: ruleBasicConstraint returns [EObject current=null] : (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Operand_1= ruleOperand | this_Negation_2= ruleNegation ) ;
    public final EObject ruleBasicConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ParenthesisConstraint_0 = null;

        EObject this_Operand_1 = null;

        EObject this_Negation_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1188:28: ( (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Operand_1= ruleOperand | this_Negation_2= ruleNegation ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1189:1: (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Operand_1= ruleOperand | this_Negation_2= ruleNegation )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1189:1: (this_ParenthesisConstraint_0= ruleParenthesisConstraint | this_Operand_1= ruleOperand | this_Negation_2= ruleNegation )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt23=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 34:
            case 37:
                {
                alt23=2;
                }
                break;
            case 31:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1190:5: this_ParenthesisConstraint_0= ruleParenthesisConstraint
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicConstraintAccess().getParenthesisConstraintParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesisConstraint_in_ruleBasicConstraint2520);
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1200:5: this_Operand_1= ruleOperand
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicConstraintAccess().getOperandParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperand_in_ruleBasicConstraint2547);
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1210:5: this_Negation_2= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBasicConstraintAccess().getNegationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBasicConstraint2574);
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1226:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1227:2: (iv_ruleNegation= ruleNegation EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1228:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation2609);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation2619); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1235:1: ruleNegation returns [EObject current=null] : (otherlv_0= '!' ( (lv_constraint_1_0= ruleConstraintExpression ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1238:28: ( (otherlv_0= '!' ( (lv_constraint_1_0= ruleConstraintExpression ) ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1239:1: (otherlv_0= '!' ( (lv_constraint_1_0= ruleConstraintExpression ) ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1239:1: (otherlv_0= '!' ( (lv_constraint_1_0= ruleConstraintExpression ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1239:3: otherlv_0= '!' ( (lv_constraint_1_0= ruleConstraintExpression ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleNegation2656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1243:1: ( (lv_constraint_1_0= ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1244:1: (lv_constraint_1_0= ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1244:1: (lv_constraint_1_0= ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1245:3: lv_constraint_1_0= ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_ruleNegation2677);
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
                      		"ConstraintExpression");
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1269:1: entryRuleParenthesisConstraint returns [EObject current=null] : iv_ruleParenthesisConstraint= ruleParenthesisConstraint EOF ;
    public final EObject entryRuleParenthesisConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisConstraint = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1270:2: (iv_ruleParenthesisConstraint= ruleParenthesisConstraint EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1271:2: iv_ruleParenthesisConstraint= ruleParenthesisConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesisConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint2713);
            iv_ruleParenthesisConstraint=ruleParenthesisConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesisConstraint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisConstraint2723); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1278:1: ruleParenthesisConstraint returns [EObject current=null] : (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesisConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1281:28: ( (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1282:1: (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1282:1: (otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1282:3: otherlv_0= '(' ( (lv_constraint_1_0= ruleConstraintExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleParenthesisConstraint2760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesisConstraintAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1286:1: ( (lv_constraint_1_0= ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1287:1: (lv_constraint_1_0= ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1287:1: (lv_constraint_1_0= ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1288:3: lv_constraint_1_0= ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesisConstraintAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_ruleParenthesisConstraint2781);
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
                      		"ConstraintExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleParenthesisConstraint2793); if (state.failed) return current;
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1316:1: entryRuleOperand returns [EObject current=null] : iv_ruleOperand= ruleOperand EOF ;
    public final EObject entryRuleOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperand = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1317:2: (iv_ruleOperand= ruleOperand EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1318:2: iv_ruleOperand= ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_ruleOperand_in_entryRuleOperand2829);
            iv_ruleOperand=ruleOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperand2839); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1325:1: ruleOperand returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_NodeProperty_1= ruleNodeProperty | this_Typeof_2= ruleTypeof ) ;
    public final EObject ruleOperand() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_NodeProperty_1 = null;

        EObject this_Typeof_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1328:28: ( (this_Literal_0= ruleLiteral | this_NodeProperty_1= ruleNodeProperty | this_Typeof_2= ruleTypeof ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1329:1: (this_Literal_0= ruleLiteral | this_NodeProperty_1= ruleNodeProperty | this_Typeof_2= ruleTypeof )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1329:1: (this_Literal_0= ruleLiteral | this_NodeProperty_1= ruleNodeProperty | this_Typeof_2= ruleTypeof )
            int alt24=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 37:
                {
                alt24=1;
                }
                break;
            case RULE_ID:
                {
                alt24=2;
                }
                break;
            case 34:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1330:5: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperandAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleOperand2886);
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1340:5: this_NodeProperty_1= ruleNodeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperandAccess().getNodePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNodeProperty_in_ruleOperand2913);
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1350:5: this_Typeof_2= ruleTypeof
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOperandAccess().getTypeofParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeof_in_ruleOperand2940);
                    this_Typeof_2=ruleTypeof();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Typeof_2; 
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


    // $ANTLR start "entryRuleTypeof"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1366:1: entryRuleTypeof returns [EObject current=null] : iv_ruleTypeof= ruleTypeof EOF ;
    public final EObject entryRuleTypeof() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeof = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1367:2: (iv_ruleTypeof= ruleTypeof EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1368:2: iv_ruleTypeof= ruleTypeof EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeofRule()); 
            }
            pushFollow(FOLLOW_ruleTypeof_in_entryRuleTypeof2975);
            iv_ruleTypeof=ruleTypeof();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeof; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeof2985); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeof"


    // $ANTLR start "ruleTypeof"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1375:1: ruleTypeof returns [EObject current=null] : (otherlv_0= 'typeof' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleTypeof() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1378:28: ( (otherlv_0= 'typeof' ( (otherlv_1= RULE_ID ) ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1379:1: (otherlv_0= 'typeof' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1379:1: (otherlv_0= 'typeof' ( (otherlv_1= RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1379:3: otherlv_0= 'typeof' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleTypeof3022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeofAccess().getTypeofKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1383:1: ( (otherlv_1= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1384:1: (otherlv_1= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1384:1: (otherlv_1= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1385:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeofRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeof3042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getTypeofAccess().getTypeJvmTypeCrossReference_1_0()); 
              	
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
    // $ANTLR end "ruleTypeof"


    // $ANTLR start "entryRuleTraceModel"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1404:1: entryRuleTraceModel returns [EObject current=null] : iv_ruleTraceModel= ruleTraceModel EOF ;
    public final EObject entryRuleTraceModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceModel = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1405:2: (iv_ruleTraceModel= ruleTraceModel EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1406:2: iv_ruleTraceModel= ruleTraceModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceModelRule()); 
            }
            pushFollow(FOLLOW_ruleTraceModel_in_entryRuleTraceModel3078);
            iv_ruleTraceModel=ruleTraceModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraceModel3088); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1413:1: ruleTraceModel returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>' ) ;
    public final EObject ruleTraceModel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_nodeSetRelations_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1416:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>' ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1417:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>' )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1417:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1417:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '<' ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+ otherlv_3= '>'
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1417:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1418:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1418:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1419:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTraceModel3130); if (state.failed) return current;
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
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleTraceModel3147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTraceModelAccess().getLessThanSignKeyword_1());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1439:1: ( (lv_nodeSetRelations_2_0= ruleNodeSetRelation ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==32) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1440:1: (lv_nodeSetRelations_2_0= ruleNodeSetRelation )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1440:1: (lv_nodeSetRelations_2_0= ruleNodeSetRelation )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1441:3: lv_nodeSetRelations_2_0= ruleNodeSetRelation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTraceModelAccess().getNodeSetRelationsNodeSetRelationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNodeSetRelation_in_ruleTraceModel3168);
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
            	              		"NodeSetRelation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleTraceModel3181); if (state.failed) return current;
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1469:1: entryRuleNodeSetRelation returns [EObject current=null] : iv_ruleNodeSetRelation= ruleNodeSetRelation EOF ;
    public final EObject entryRuleNodeSetRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeSetRelation = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1470:2: (iv_ruleNodeSetRelation= ruleNodeSetRelation EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1471:2: iv_ruleNodeSetRelation= ruleNodeSetRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeSetRelationRule()); 
            }
            pushFollow(FOLLOW_ruleNodeSetRelation_in_entryRuleNodeSetRelation3217);
            iv_ruleNodeSetRelation=ruleNodeSetRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeSetRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeSetRelation3227); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1478:1: ruleNodeSetRelation returns [EObject current=null] : (otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')' ) ;
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
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1481:28: ( (otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')' ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1482:1: (otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')' )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1482:1: (otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1482:3: otherlv_0= '(' ( (lv_sourceNodes_1_0= ruleNodeType ) ) (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )* otherlv_4= ':' ( (lv_targetNodes_5_0= ruleNodeType ) ) (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )* otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleNodeSetRelation3264); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNodeSetRelationAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1486:1: ( (lv_sourceNodes_1_0= ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1487:1: (lv_sourceNodes_1_0= ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1487:1: (lv_sourceNodes_1_0= ruleNodeType )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1488:3: lv_sourceNodes_1_0= ruleNodeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNodeType_in_ruleNodeSetRelation3285);
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
                      		"NodeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1504:2: (otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==17) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1504:4: otherlv_2= ',' ( (lv_sourceNodes_3_0= ruleNodeType ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleNodeSetRelation3298); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNodeSetRelationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1508:1: ( (lv_sourceNodes_3_0= ruleNodeType ) )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1509:1: (lv_sourceNodes_3_0= ruleNodeType )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1509:1: (lv_sourceNodes_3_0= ruleNodeType )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1510:3: lv_sourceNodes_3_0= ruleNodeType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNodeType_in_ruleNodeSetRelation3319);
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
            	              		"NodeType");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleNodeSetRelation3333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getNodeSetRelationAccess().getColonKeyword_3());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1530:1: ( (lv_targetNodes_5_0= ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1531:1: (lv_targetNodes_5_0= ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1531:1: (lv_targetNodes_5_0= ruleNodeType )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1532:3: lv_targetNodes_5_0= ruleNodeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNodeType_in_ruleNodeSetRelation3354);
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
                      		"NodeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1548:2: (otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==17) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1548:4: otherlv_6= ',' ( (lv_targetNodes_7_0= ruleNodeType ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleNodeSetRelation3367); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getNodeSetRelationAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1552:1: ( (lv_targetNodes_7_0= ruleNodeType ) )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1553:1: (lv_targetNodes_7_0= ruleNodeType )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1553:1: (lv_targetNodes_7_0= ruleNodeType )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1554:3: lv_targetNodes_7_0= ruleNodeType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNodeType_in_ruleNodeSetRelation3388);
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
            	              		"NodeType");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleNodeSetRelation3402); if (state.failed) return current;
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1582:1: entryRuleNodeType returns [EObject current=null] : iv_ruleNodeType= ruleNodeType EOF ;
    public final EObject entryRuleNodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeType = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1583:2: (iv_ruleNodeType= ruleNodeType EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1584:2: iv_ruleNodeType= ruleNodeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_entryRuleNodeType3438);
            iv_ruleNodeType=ruleNodeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNodeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeType3448); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1591:1: ruleNodeType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNodeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1594:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1595:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1595:1: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1596:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1596:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1597:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNodeTypeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeType3492); if (state.failed) return current;
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1616:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1617:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1618:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral3527);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral3537); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1625:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_IntLiteral_1 = null;

        EObject this_FloatLiteral_2 = null;

        EObject this_BooleanLiteral_3 = null;

        EObject this_ArrayLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1628:28: ( (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1629:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1629:1: (this_StringLiteral_0= ruleStringLiteral | this_IntLiteral_1= ruleIntLiteral | this_FloatLiteral_2= ruleFloatLiteral | this_BooleanLiteral_3= ruleBooleanLiteral | this_ArrayLiteral_4= ruleArrayLiteral )
            int alt28=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt28=1;
                }
                break;
            case RULE_INT:
                {
                alt28=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt28=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt28=4;
                }
                break;
            case 37:
                {
                alt28=5;
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1630:5: this_StringLiteral_0= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral3584);
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1640:5: this_IntLiteral_1= ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_ruleLiteral3611);
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1650:5: this_FloatLiteral_2= ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_ruleLiteral3638);
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1660:5: this_BooleanLiteral_3= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral3665);
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1670:5: this_ArrayLiteral_4= ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_ruleLiteral3692);
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1686:1: entryRuleArrayLiteral returns [EObject current=null] : iv_ruleArrayLiteral= ruleArrayLiteral EOF ;
    public final EObject entryRuleArrayLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteral = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1687:2: (iv_ruleArrayLiteral= ruleArrayLiteral EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1688:2: iv_ruleArrayLiteral= ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral3727);
            iv_ruleArrayLiteral=ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral3737); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1695:1: ruleArrayLiteral returns [EObject current=null] : (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleArrayLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_1_0 = null;

        EObject lv_literals_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1698:28: ( (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1699:1: (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1699:1: (otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1699:3: otherlv_0= '{' ( (lv_literals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleArrayLiteral3774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1703:1: ( (lv_literals_1_0= ruleLiteral ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1704:1: (lv_literals_1_0= ruleLiteral )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1704:1: (lv_literals_1_0= ruleLiteral )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1705:3: lv_literals_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleArrayLiteral3795);
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
                      		"Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1721:2: (otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==17) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1721:4: otherlv_2= ',' ( (lv_literals_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleArrayLiteral3808); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1725:1: ( (lv_literals_3_0= ruleLiteral ) )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1726:1: (lv_literals_3_0= ruleLiteral )
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1726:1: (lv_literals_3_0= ruleLiteral )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1727:3: lv_literals_3_0= ruleLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLiteral_in_ruleArrayLiteral3829);
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
            	              		"Literal");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleArrayLiteral3843); if (state.failed) return current;
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1755:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1756:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1757:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3879);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral3889); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1764:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1767:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1768:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1768:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1769:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1769:1: (lv_value_0_0= RULE_STRING )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1770:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral3930); if (state.failed) return current;
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
                      		"STRING");
              	    
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1794:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1795:2: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1796:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral3970);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral3980); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1803:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1806:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1807:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1807:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1808:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1808:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1809:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntLiteral4021); if (state.failed) return current;
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
                      		"INT");
              	    
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1833:1: entryRuleFloatLiteral returns [EObject current=null] : iv_ruleFloatLiteral= ruleFloatLiteral EOF ;
    public final EObject entryRuleFloatLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatLiteral = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1834:2: (iv_ruleFloatLiteral= ruleFloatLiteral EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1835:2: iv_ruleFloatLiteral= ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral4061);
            iv_ruleFloatLiteral=ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral4071); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1842:1: ruleFloatLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1845:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1846:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1846:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1847:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1847:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1848:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleFloatLiteral4112); if (state.failed) return current;
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
                      		"FLOAT");
              	    
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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1872:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1873:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1874:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral4152);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral4162); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1881:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1884:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1885:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1885:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1886:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1886:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1887:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanLiteral4203); if (state.failed) return current;
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
                      		"BOOLEAN");
              	    
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


    // $ANTLR start "entryRuleLogicOperator"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1911:1: entryRuleLogicOperator returns [EObject current=null] : iv_ruleLogicOperator= ruleLogicOperator EOF ;
    public final EObject entryRuleLogicOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOperator = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1912:2: (iv_ruleLogicOperator= ruleLogicOperator EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1913:2: iv_ruleLogicOperator= ruleLogicOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_entryRuleLogicOperator4243);
            iv_ruleLogicOperator=ruleLogicOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicOperator4253); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicOperator"


    // $ANTLR start "ruleLogicOperator"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1920:1: ruleLogicOperator returns [EObject current=null] : ( ( (lv_AND_0_0= '&' ) ) | ( (lv_OR_1_0= '|' ) ) ) ;
    public final EObject ruleLogicOperator() throws RecognitionException {
        EObject current = null;

        Token lv_AND_0_0=null;
        Token lv_OR_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1923:28: ( ( ( (lv_AND_0_0= '&' ) ) | ( (lv_OR_1_0= '|' ) ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1924:1: ( ( (lv_AND_0_0= '&' ) ) | ( (lv_OR_1_0= '|' ) ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1924:1: ( ( (lv_AND_0_0= '&' ) ) | ( (lv_OR_1_0= '|' ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
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
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1924:2: ( (lv_AND_0_0= '&' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1924:2: ( (lv_AND_0_0= '&' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1925:1: (lv_AND_0_0= '&' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1925:1: (lv_AND_0_0= '&' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1926:3: lv_AND_0_0= '&'
                    {
                    lv_AND_0_0=(Token)match(input,39,FOLLOW_39_in_ruleLogicOperator4296); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_AND_0_0, grammarAccess.getLogicOperatorAccess().getANDAmpersandKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogicOperatorRule());
                      	        }
                             		setWithLastConsumed(current, "AND", lv_AND_0_0, "&");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1940:6: ( (lv_OR_1_0= '|' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1940:6: ( (lv_OR_1_0= '|' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1941:1: (lv_OR_1_0= '|' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1941:1: (lv_OR_1_0= '|' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1942:3: lv_OR_1_0= '|'
                    {
                    lv_OR_1_0=(Token)match(input,40,FOLLOW_40_in_ruleLogicOperator4333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_OR_1_0, grammarAccess.getLogicOperatorAccess().getORVerticalLineKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLogicOperatorRule());
                      	        }
                             		setWithLastConsumed(current, "OR", lv_OR_1_0, "|");
                      	    
                    }

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


    // $ANTLR start "entryRuleComparator"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1963:1: entryRuleComparator returns [EObject current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final EObject entryRuleComparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparator = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1964:2: (iv_ruleComparator= ruleComparator EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1965:2: iv_ruleComparator= ruleComparator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparatorRule()); 
            }
            pushFollow(FOLLOW_ruleComparator_in_entryRuleComparator4382);
            iv_ruleComparator=ruleComparator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparator4392); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1972:1: ruleComparator returns [EObject current=null] : ( ( (lv_EQ_0_0= '==' ) ) | ( (lv_NE_1_0= '!=' ) ) | ( (lv_GR_2_0= '>' ) ) | ( (lv_LW_3_0= '<' ) ) | ( (lv_GE_4_0= '>=' ) ) | ( (lv_LE_5_0= '<=' ) ) | ( (lv_LIKE_6_0= '~' ) ) ) ;
    public final EObject ruleComparator() throws RecognitionException {
        EObject current = null;

        Token lv_EQ_0_0=null;
        Token lv_NE_1_0=null;
        Token lv_GR_2_0=null;
        Token lv_LW_3_0=null;
        Token lv_GE_4_0=null;
        Token lv_LE_5_0=null;
        Token lv_LIKE_6_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1975:28: ( ( ( (lv_EQ_0_0= '==' ) ) | ( (lv_NE_1_0= '!=' ) ) | ( (lv_GR_2_0= '>' ) ) | ( (lv_LW_3_0= '<' ) ) | ( (lv_GE_4_0= '>=' ) ) | ( (lv_LE_5_0= '<=' ) ) | ( (lv_LIKE_6_0= '~' ) ) ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1976:1: ( ( (lv_EQ_0_0= '==' ) ) | ( (lv_NE_1_0= '!=' ) ) | ( (lv_GR_2_0= '>' ) ) | ( (lv_LW_3_0= '<' ) ) | ( (lv_GE_4_0= '>=' ) ) | ( (lv_LE_5_0= '<=' ) ) | ( (lv_LIKE_6_0= '~' ) ) )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1976:1: ( ( (lv_EQ_0_0= '==' ) ) | ( (lv_NE_1_0= '!=' ) ) | ( (lv_GR_2_0= '>' ) ) | ( (lv_LW_3_0= '<' ) ) | ( (lv_GE_4_0= '>=' ) ) | ( (lv_LE_5_0= '<=' ) ) | ( (lv_LIKE_6_0= '~' ) ) )
            int alt31=7;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt31=1;
                }
                break;
            case 42:
                {
                alt31=2;
                }
                break;
            case 36:
                {
                alt31=3;
                }
                break;
            case 35:
                {
                alt31=4;
                }
                break;
            case 43:
                {
                alt31=5;
                }
                break;
            case 44:
                {
                alt31=6;
                }
                break;
            case 45:
                {
                alt31=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1976:2: ( (lv_EQ_0_0= '==' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1976:2: ( (lv_EQ_0_0= '==' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1977:1: (lv_EQ_0_0= '==' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1977:1: (lv_EQ_0_0= '==' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1978:3: lv_EQ_0_0= '=='
                    {
                    lv_EQ_0_0=(Token)match(input,41,FOLLOW_41_in_ruleComparator4435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_EQ_0_0, grammarAccess.getComparatorAccess().getEQEqualsSignEqualsSignKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "EQ", lv_EQ_0_0, "==");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1992:6: ( (lv_NE_1_0= '!=' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1992:6: ( (lv_NE_1_0= '!=' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1993:1: (lv_NE_1_0= '!=' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1993:1: (lv_NE_1_0= '!=' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1994:3: lv_NE_1_0= '!='
                    {
                    lv_NE_1_0=(Token)match(input,42,FOLLOW_42_in_ruleComparator4472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_NE_1_0, grammarAccess.getComparatorAccess().getNEExclamationMarkEqualsSignKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "NE", lv_NE_1_0, "!=");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2008:6: ( (lv_GR_2_0= '>' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2008:6: ( (lv_GR_2_0= '>' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2009:1: (lv_GR_2_0= '>' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2009:1: (lv_GR_2_0= '>' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2010:3: lv_GR_2_0= '>'
                    {
                    lv_GR_2_0=(Token)match(input,36,FOLLOW_36_in_ruleComparator4509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_GR_2_0, grammarAccess.getComparatorAccess().getGRGreaterThanSignKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "GR", lv_GR_2_0, ">");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2024:6: ( (lv_LW_3_0= '<' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2024:6: ( (lv_LW_3_0= '<' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2025:1: (lv_LW_3_0= '<' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2025:1: (lv_LW_3_0= '<' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2026:3: lv_LW_3_0= '<'
                    {
                    lv_LW_3_0=(Token)match(input,35,FOLLOW_35_in_ruleComparator4546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_LW_3_0, grammarAccess.getComparatorAccess().getLWLessThanSignKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "LW", lv_LW_3_0, "<");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2040:6: ( (lv_GE_4_0= '>=' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2040:6: ( (lv_GE_4_0= '>=' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2041:1: (lv_GE_4_0= '>=' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2041:1: (lv_GE_4_0= '>=' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2042:3: lv_GE_4_0= '>='
                    {
                    lv_GE_4_0=(Token)match(input,43,FOLLOW_43_in_ruleComparator4583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_GE_4_0, grammarAccess.getComparatorAccess().getGEGreaterThanSignEqualsSignKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "GE", lv_GE_4_0, ">=");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2056:6: ( (lv_LE_5_0= '<=' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2056:6: ( (lv_LE_5_0= '<=' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2057:1: (lv_LE_5_0= '<=' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2057:1: (lv_LE_5_0= '<=' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2058:3: lv_LE_5_0= '<='
                    {
                    lv_LE_5_0=(Token)match(input,44,FOLLOW_44_in_ruleComparator4620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_LE_5_0, grammarAccess.getComparatorAccess().getLELessThanSignEqualsSignKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "LE", lv_LE_5_0, "<=");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2072:6: ( (lv_LIKE_6_0= '~' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2072:6: ( (lv_LIKE_6_0= '~' ) )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2073:1: (lv_LIKE_6_0= '~' )
                    {
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2073:1: (lv_LIKE_6_0= '~' )
                    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2074:3: lv_LIKE_6_0= '~'
                    {
                    lv_LIKE_6_0=(Token)match(input,45,FOLLOW_45_in_ruleComparator4657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_LIKE_6_0, grammarAccess.getComparatorAccess().getLIKETildeKeyword_6_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getComparatorRule());
                      	        }
                             		setWithLastConsumed(current, "LIKE", lv_LIKE_6_0, "~");
                      	    
                    }

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


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2095:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2096:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2097:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4707);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName4718); if (state.failed) return current;

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
    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2104:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2107:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2108:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2108:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2108:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2115:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==46) && (synpred3_InternalArchitecture())) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2115:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2115:2: ( ( '.' )=>kw= '.' )
            	    // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2115:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,46,FOLLOW_46_in_ruleQualifiedName4786); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName4802); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
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

    // $ANTLR start synpred1_InternalArchitecture
    public final void synpred1_InternalArchitecture_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1044:3: ( ( () ( ( ruleLogicOperator ) ) ) )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1044:4: ( () ( ( ruleLogicOperator ) ) )
        {
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1044:4: ( () ( ( ruleLogicOperator ) ) )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1044:5: () ( ( ruleLogicOperator ) )
        {
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1044:5: ()
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1045:1: 
        {
        }

        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1045:2: ( ( ruleLogicOperator ) )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1046:1: ( ruleLogicOperator )
        {
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1046:1: ( ruleLogicOperator )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1047:1: ruleLogicOperator
        {
        pushFollow(FOLLOW_ruleLogicOperator_in_synpred1_InternalArchitecture2205);
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
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1121:3: ( ( () ( ( ruleComparator ) ) ) )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1121:4: ( () ( ( ruleComparator ) ) )
        {
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1121:4: ( () ( ( ruleComparator ) ) )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1121:5: () ( ( ruleComparator ) )
        {
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1121:5: ()
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1122:1: 
        {
        }

        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1122:2: ( ( ruleComparator ) )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1123:1: ( ruleComparator )
        {
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1123:1: ( ruleComparator )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:1124:1: ruleComparator
        {
        pushFollow(FOLLOW_ruleComparator_in_synpred2_InternalArchitecture2372);
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
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2115:3: ( '.' )
        // ../de.cau.cs.se.geco.architecture/src-gen/de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.g:2116:2: '.'
        {
        match(input,46,FOLLOW_46_in_synpred3_InternalArchitecture4777); if (state.failed) return ;

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


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\12\uffff";
    static final String DFA22_eofS =
        "\1\10\11\uffff";
    static final String DFA22_minS =
        "\1\34\7\0\2\uffff";
    static final String DFA22_maxS =
        "\1\55\7\0\2\uffff";
    static final String DFA22_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA22_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\10\4\uffff\1\10\1\uffff\1\4\1\3\2\uffff\2\10\1\1\1\2\1\5\1\6\1\7",
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1121:1: ( ( ( ( () ( ( ruleComparator ) ) ) )=> ( () ( (lv_operator_2_0= ruleComparator ) ) ) ) ( (lv_right_3_0= ruleBasicConstraint ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_4 = input.LA(1);

                         
                        int index22_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_5 = input.LA(1);

                         
                        int index22_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_6 = input.LA(1);

                         
                        int index22_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_7 = input.LA(1);

                         
                        int index22_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index22_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel143 = new BitSet(new long[]{0x0000000001158002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel164 = new BitSet(new long[]{0x0000000001158002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_ruleModel186 = new BitSet(new long[]{0x0000000001150002L});
    public static final BitSet FOLLOW_ruleMetamodelSequence_in_ruleModel208 = new BitSet(new long[]{0x0000000001110002L});
    public static final BitSet FOLLOW_ruleConnection_in_ruleModel230 = new BitSet(new long[]{0x0000000001100002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelSequence_in_entryRuleMetamodelSequence373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelSequence383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMetamodelSequence420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleModelNodeType_in_ruleMetamodelSequence441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMetamodel_in_ruleMetamodelSequence462 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleMetamodelSequence475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMetamodel_in_ruleMetamodelSequence496 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_entryRuleMetamodel534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodel544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetamodel585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisteredPackage635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleRegisteredPackage672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRegisteredPackage689 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRegisteredPackage718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRegisteredPackage743 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRegisteredPackage773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnection826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_ruleConnection873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaver_in_ruleConnection900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaver_in_entryRuleWeaver935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeaver945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleWeaver982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWeaver1002 = new BitSet(new long[]{0x0000000040200010L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_ruleWeaver1024 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_21_in_ruleWeaver1042 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleAspectModel_in_ruleWeaver1064 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleWeaver1077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_ruleWeaver1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectModel_in_entryRuleAspectModel1136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspectModel1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAspectModel1184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_ruleAspectModel1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_ruleAspectModel1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_entryRuleGenerator1269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerator1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGenerator1316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenerator1336 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_ruleGenerator1357 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_ruleGenerator1378 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleGenerator1391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTraceModel_in_ruleGenerator1412 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleGenerator1427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenerator1447 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleGenerator1460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenerator1480 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_entryRuleSourceModelNodeSelector1520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceModelNodeSelector1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSourceModelNodeSelector1576 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_27_in_ruleSourceModelNodeSelector1589 = new BitSet(new long[]{0x00000025800001F0L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_ruleSourceModelNodeSelector1610 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSourceModelNodeSelector1622 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleSourceModelNodeSelector1637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_ruleSourceModelNodeSelector1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSourceModelNodeSelector1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_entryRuleTargetModelNodeType1726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetModelNodeType1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTargetModelNodeType1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodeType_in_entryRuleModelNodeType1827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelNodeType1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelNodeType1882 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleModelNodeType1895 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_ruleModelNodeType1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_entryRuleNodeProperty1954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeProperty1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeProperty2009 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_27_in_ruleNodeProperty2022 = new BitSet(new long[]{0x00000025800001F0L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_ruleNodeProperty2043 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNodeProperty2055 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleNodeProperty2070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_ruleNodeProperty2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression2129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintExpression2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_ruleConstraintExpression2186 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_ruleConstraintExpression2235 = new BitSet(new long[]{0x00000025800001F0L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_ruleConstraintExpression2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression2296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_ruleCompareExpression2353 = new BitSet(new long[]{0x00003E1800000002L});
    public static final BitSet FOLLOW_ruleComparator_in_ruleCompareExpression2402 = new BitSet(new long[]{0x00000025800001F0L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_ruleCompareExpression2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_entryRuleBasicConstraint2463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicConstraint2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_ruleBasicConstraint2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_ruleBasicConstraint2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBasicConstraint2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation2609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleNegation2656 = new BitSet(new long[]{0x00000025800001F0L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_ruleNegation2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint2713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisConstraint2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleParenthesisConstraint2760 = new BitSet(new long[]{0x00000025800001F0L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_ruleParenthesisConstraint2781 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleParenthesisConstraint2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand2829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperand2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleOperand2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_ruleOperand2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeof_in_ruleOperand2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeof_in_entryRuleTypeof2975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeof2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTypeof3022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeof3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModel_in_entryRuleTraceModel3078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraceModel3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTraceModel3130 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTraceModel3147 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleNodeSetRelation_in_ruleTraceModel3168 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_36_in_ruleTraceModel3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSetRelation_in_entryRuleNodeSetRelation3217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeSetRelation3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleNodeSetRelation3264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNodeSetRelation3285 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_17_in_ruleNodeSetRelation3298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNodeSetRelation3319 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_23_in_ruleNodeSetRelation3333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNodeSetRelation3354 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_17_in_ruleNodeSetRelation3367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleNodeType_in_ruleNodeSetRelation3388 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_ruleNodeSetRelation3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_entryRuleNodeType3438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeType3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeType3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_ruleLiteral3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_ruleLiteral3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_ruleLiteral3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral3727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleArrayLiteral3774 = new BitSet(new long[]{0x00000020000001E0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleArrayLiteral3795 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_17_in_ruleArrayLiteral3808 = new BitSet(new long[]{0x00000020000001E0L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleArrayLiteral3829 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_38_in_ruleArrayLiteral3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral3970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntLiteral4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral4061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatLiteral4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral4152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanLiteral4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_entryRuleLogicOperator4243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicOperator4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleLogicOperator4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleLogicOperator4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_entryRuleComparator4382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparator4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleComparator4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleComparator4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleComparator4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleComparator4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleComparator4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleComparator4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleComparator4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName4707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4758 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleQualifiedName4786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName4802 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_synpred1_InternalArchitecture2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_synpred2_InternalArchitecture2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred3_InternalArchitecture4777 = new BitSet(new long[]{0x0000000000000002L});

}