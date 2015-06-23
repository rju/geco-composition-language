package de.cau.cs.se.geco.architecture.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.se.geco.architecture.services.ArchitectureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalArchitectureParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'link'", "'package'", "'import'", "'model'", "','", "'register'", "'weave'", "'=>'", "':'", "'generate'", "'->'", "'<-'", "'['", "']'", "'/'", "'null'", "'('", "')'", "'typeof'", "'<'", "'>'", "'{'", "'}'", "'.'", "'text'", "'*'", "'&'", "'|'", "'=='", "'!='", "'>='", "'<='", "'~'"
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
    public String getGrammarFileName() { return "../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g"; }


     
     	private ArchitectureGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ArchitectureGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:62:1: ( ruleModel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:77:1: ( rule__Model__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel100);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:90:1: ( ruleImport EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:91:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport127);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:105:1: ( rule__Import__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport160);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleMetamodelSequence"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:117:1: entryRuleMetamodelSequence : ruleMetamodelSequence EOF ;
    public final void entryRuleMetamodelSequence() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:118:1: ( ruleMetamodelSequence EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:119:1: ruleMetamodelSequence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceRule()); 
            }
            pushFollow(FOLLOW_ruleMetamodelSequence_in_entryRuleMetamodelSequence187);
            ruleMetamodelSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelSequence194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetamodelSequence"


    // $ANTLR start "ruleMetamodelSequence"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:126:1: ruleMetamodelSequence : ( ( rule__MetamodelSequence__Group__0 ) ) ;
    public final void ruleMetamodelSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:130:2: ( ( ( rule__MetamodelSequence__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:131:1: ( ( rule__MetamodelSequence__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:131:1: ( ( rule__MetamodelSequence__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:132:1: ( rule__MetamodelSequence__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:133:1: ( rule__MetamodelSequence__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:133:2: rule__MetamodelSequence__Group__0
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__0_in_ruleMetamodelSequence220);
            rule__MetamodelSequence__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodelSequence"


    // $ANTLR start "entryRuleMetamodel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:145:1: entryRuleMetamodel : ruleMetamodel EOF ;
    public final void entryRuleMetamodel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:146:1: ( ruleMetamodel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:147:1: ruleMetamodel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelRule()); 
            }
            pushFollow(FOLLOW_ruleMetamodel_in_entryRuleMetamodel247);
            ruleMetamodel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodel254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMetamodel"


    // $ANTLR start "ruleMetamodel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:154:1: ruleMetamodel : ( ( rule__Metamodel__NameAssignment ) ) ;
    public final void ruleMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:158:2: ( ( ( rule__Metamodel__NameAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:159:1: ( ( rule__Metamodel__NameAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:159:1: ( ( rule__Metamodel__NameAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:160:1: ( rule__Metamodel__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelAccess().getNameAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:161:1: ( rule__Metamodel__NameAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:161:2: rule__Metamodel__NameAssignment
            {
            pushFollow(FOLLOW_rule__Metamodel__NameAssignment_in_ruleMetamodel280);
            rule__Metamodel__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRuleRegisteredPackage"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:173:1: entryRuleRegisteredPackage : ruleRegisteredPackage EOF ;
    public final void entryRuleRegisteredPackage() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:174:1: ( ruleRegisteredPackage EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:175:1: ruleRegisteredPackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageRule()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage307);
            ruleRegisteredPackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisteredPackage314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegisteredPackage"


    // $ANTLR start "ruleRegisteredPackage"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:182:1: ruleRegisteredPackage : ( ( rule__RegisteredPackage__Group__0 ) ) ;
    public final void ruleRegisteredPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:186:2: ( ( ( rule__RegisteredPackage__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:187:1: ( ( rule__RegisteredPackage__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:187:1: ( ( rule__RegisteredPackage__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:188:1: ( rule__RegisteredPackage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:189:1: ( rule__RegisteredPackage__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:189:2: rule__RegisteredPackage__Group__0
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__0_in_ruleRegisteredPackage340);
            rule__RegisteredPackage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegisteredPackage"


    // $ANTLR start "entryRuleConnection"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:201:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:202:1: ( ruleConnection EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:203:1: ruleConnection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionRule()); 
            }
            pushFollow(FOLLOW_ruleConnection_in_entryRuleConnection367);
            ruleConnection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnection374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:210:1: ruleConnection : ( ( rule__Connection__Alternatives ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:214:2: ( ( ( rule__Connection__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:215:1: ( ( rule__Connection__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:215:1: ( ( rule__Connection__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:216:1: ( rule__Connection__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:217:1: ( rule__Connection__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:217:2: rule__Connection__Alternatives
            {
            pushFollow(FOLLOW_rule__Connection__Alternatives_in_ruleConnection400);
            rule__Connection__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleWeaver"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:229:1: entryRuleWeaver : ruleWeaver EOF ;
    public final void entryRuleWeaver() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:230:1: ( ruleWeaver EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:231:1: ruleWeaver EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverRule()); 
            }
            pushFollow(FOLLOW_ruleWeaver_in_entryRuleWeaver427);
            ruleWeaver();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeaver434); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWeaver"


    // $ANTLR start "ruleWeaver"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:238:1: ruleWeaver : ( ( rule__Weaver__Group__0 ) ) ;
    public final void ruleWeaver() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:242:2: ( ( ( rule__Weaver__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:243:1: ( ( rule__Weaver__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:243:1: ( ( rule__Weaver__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:244:1: ( rule__Weaver__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:245:1: ( rule__Weaver__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:245:2: rule__Weaver__Group__0
            {
            pushFollow(FOLLOW_rule__Weaver__Group__0_in_ruleWeaver460);
            rule__Weaver__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWeaver"


    // $ANTLR start "entryRuleAspectModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:257:1: entryRuleAspectModel : ruleAspectModel EOF ;
    public final void entryRuleAspectModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:258:1: ( ruleAspectModel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:259:1: ruleAspectModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelRule()); 
            }
            pushFollow(FOLLOW_ruleAspectModel_in_entryRuleAspectModel487);
            ruleAspectModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspectModel494); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAspectModel"


    // $ANTLR start "ruleAspectModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:266:1: ruleAspectModel : ( ( rule__AspectModel__Alternatives ) ) ;
    public final void ruleAspectModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:270:2: ( ( ( rule__AspectModel__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:271:1: ( ( rule__AspectModel__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:271:1: ( ( rule__AspectModel__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:272:1: ( rule__AspectModel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:273:1: ( rule__AspectModel__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:273:2: rule__AspectModel__Alternatives
            {
            pushFollow(FOLLOW_rule__AspectModel__Alternatives_in_ruleAspectModel520);
            rule__AspectModel__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAspectModel"


    // $ANTLR start "entryRuleGenerator"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:285:1: entryRuleGenerator : ruleGenerator EOF ;
    public final void entryRuleGenerator() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:286:1: ( ruleGenerator EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:287:1: ruleGenerator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorRule()); 
            }
            pushFollow(FOLLOW_ruleGenerator_in_entryRuleGenerator547);
            ruleGenerator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerator554); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenerator"


    // $ANTLR start "ruleGenerator"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:294:1: ruleGenerator : ( ( rule__Generator__Group__0 ) ) ;
    public final void ruleGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:298:2: ( ( ( rule__Generator__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:299:1: ( ( rule__Generator__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:299:1: ( ( rule__Generator__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:300:1: ( rule__Generator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:301:1: ( rule__Generator__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:301:2: rule__Generator__Group__0
            {
            pushFollow(FOLLOW_rule__Generator__Group__0_in_ruleGenerator580);
            rule__Generator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenerator"


    // $ANTLR start "entryRuleSourceModelNodeSelector"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:313:1: entryRuleSourceModelNodeSelector : ruleSourceModelNodeSelector EOF ;
    public final void entryRuleSourceModelNodeSelector() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:314:1: ( ruleSourceModelNodeSelector EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:315:1: ruleSourceModelNodeSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_entryRuleSourceModelNodeSelector607);
            ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceModelNodeSelector614); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceModelNodeSelector"


    // $ANTLR start "ruleSourceModelNodeSelector"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:322:1: ruleSourceModelNodeSelector : ( ( rule__SourceModelNodeSelector__Alternatives ) ) ;
    public final void ruleSourceModelNodeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:326:2: ( ( ( rule__SourceModelNodeSelector__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:327:1: ( ( rule__SourceModelNodeSelector__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:327:1: ( ( rule__SourceModelNodeSelector__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:328:1: ( rule__SourceModelNodeSelector__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:329:1: ( rule__SourceModelNodeSelector__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:329:2: rule__SourceModelNodeSelector__Alternatives
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Alternatives_in_ruleSourceModelNodeSelector640);
            rule__SourceModelNodeSelector__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceModelNodeSelector"


    // $ANTLR start "entryRuleTargetModelNodeType"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:341:1: entryRuleTargetModelNodeType : ruleTargetModelNodeType EOF ;
    public final void entryRuleTargetModelNodeType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:342:1: ( ruleTargetModelNodeType EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:343:1: ruleTargetModelNodeType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_entryRuleTargetModelNodeType667);
            ruleTargetModelNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelNodeTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetModelNodeType674); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTargetModelNodeType"


    // $ANTLR start "ruleTargetModelNodeType"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:350:1: ruleTargetModelNodeType : ( ( rule__TargetModelNodeType__Group__0 ) ) ;
    public final void ruleTargetModelNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:354:2: ( ( ( rule__TargetModelNodeType__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:355:1: ( ( rule__TargetModelNodeType__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:355:1: ( ( rule__TargetModelNodeType__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:356:1: ( rule__TargetModelNodeType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:357:1: ( rule__TargetModelNodeType__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:357:2: rule__TargetModelNodeType__Group__0
            {
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__0_in_ruleTargetModelNodeType700);
            rule__TargetModelNodeType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelNodeTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetModelNodeType"


    // $ANTLR start "entryRuleModelNodeType"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:369:1: entryRuleModelNodeType : ruleModelNodeType EOF ;
    public final void entryRuleModelNodeType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:370:1: ( ruleModelNodeType EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:371:1: ruleModelNodeType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleModelNodeType_in_entryRuleModelNodeType727);
            ruleModelNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelNodeType734); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelNodeType"


    // $ANTLR start "ruleModelNodeType"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:378:1: ruleModelNodeType : ( ( rule__ModelNodeType__Group__0 ) ) ;
    public final void ruleModelNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:382:2: ( ( ( rule__ModelNodeType__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:383:1: ( ( rule__ModelNodeType__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:383:1: ( ( rule__ModelNodeType__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:384:1: ( rule__ModelNodeType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:385:1: ( rule__ModelNodeType__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:385:2: rule__ModelNodeType__Group__0
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__0_in_ruleModelNodeType760);
            rule__ModelNodeType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelNodeType"


    // $ANTLR start "entryRuleNodeProperty"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:397:1: entryRuleNodeProperty : ruleNodeProperty EOF ;
    public final void entryRuleNodeProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:398:1: ( ruleNodeProperty EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:399:1: ruleNodeProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_entryRuleNodeProperty787);
            ruleNodeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeProperty794); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeProperty"


    // $ANTLR start "ruleNodeProperty"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:406:1: ruleNodeProperty : ( ( rule__NodeProperty__Group__0 ) ) ;
    public final void ruleNodeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:410:2: ( ( ( rule__NodeProperty__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:411:1: ( ( rule__NodeProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:411:1: ( ( rule__NodeProperty__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:412:1: ( rule__NodeProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:413:1: ( rule__NodeProperty__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:413:2: rule__NodeProperty__Group__0
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__0_in_ruleNodeProperty820);
            rule__NodeProperty__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeProperty"


    // $ANTLR start "entryRuleConstraintExpression"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:425:1: entryRuleConstraintExpression : ruleConstraintExpression EOF ;
    public final void entryRuleConstraintExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:426:1: ( ruleConstraintExpression EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:427:1: ruleConstraintExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression847);
            ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintExpression854); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraintExpression"


    // $ANTLR start "ruleConstraintExpression"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:434:1: ruleConstraintExpression : ( ( rule__ConstraintExpression__Group__0 ) ) ;
    public final void ruleConstraintExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:438:2: ( ( ( rule__ConstraintExpression__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:439:1: ( ( rule__ConstraintExpression__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:439:1: ( ( rule__ConstraintExpression__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:440:1: ( rule__ConstraintExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:441:1: ( rule__ConstraintExpression__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:441:2: rule__ConstraintExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__0_in_ruleConstraintExpression880);
            rule__ConstraintExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintExpression"


    // $ANTLR start "entryRuleCompareExpression"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:453:1: entryRuleCompareExpression : ruleCompareExpression EOF ;
    public final void entryRuleCompareExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:454:1: ( ruleCompareExpression EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:455:1: ruleCompareExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression907);
            ruleCompareExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression914); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompareExpression"


    // $ANTLR start "ruleCompareExpression"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:462:1: ruleCompareExpression : ( ( rule__CompareExpression__Group__0 ) ) ;
    public final void ruleCompareExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:466:2: ( ( ( rule__CompareExpression__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:467:1: ( ( rule__CompareExpression__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:467:1: ( ( rule__CompareExpression__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:468:1: ( rule__CompareExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:469:1: ( rule__CompareExpression__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:469:2: rule__CompareExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression940);
            rule__CompareExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareExpression"


    // $ANTLR start "entryRuleBasicConstraint"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:481:1: entryRuleBasicConstraint : ruleBasicConstraint EOF ;
    public final void entryRuleBasicConstraint() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:482:1: ( ruleBasicConstraint EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:483:1: ruleBasicConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_entryRuleBasicConstraint967);
            ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicConstraint974); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicConstraint"


    // $ANTLR start "ruleBasicConstraint"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:490:1: ruleBasicConstraint : ( ( rule__BasicConstraint__Alternatives ) ) ;
    public final void ruleBasicConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:494:2: ( ( ( rule__BasicConstraint__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:495:1: ( ( rule__BasicConstraint__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:495:1: ( ( rule__BasicConstraint__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:496:1: ( rule__BasicConstraint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:497:1: ( rule__BasicConstraint__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:497:2: rule__BasicConstraint__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicConstraint__Alternatives_in_ruleBasicConstraint1000);
            rule__BasicConstraint__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicConstraint"


    // $ANTLR start "entryRuleParenthesisConstraint"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:509:1: entryRuleParenthesisConstraint : ruleParenthesisConstraint EOF ;
    public final void entryRuleParenthesisConstraint() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:510:1: ( ruleParenthesisConstraint EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:511:1: ruleParenthesisConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint1027);
            ruleParenthesisConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisConstraint1034); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesisConstraint"


    // $ANTLR start "ruleParenthesisConstraint"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:518:1: ruleParenthesisConstraint : ( ( rule__ParenthesisConstraint__Group__0 ) ) ;
    public final void ruleParenthesisConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:522:2: ( ( ( rule__ParenthesisConstraint__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:523:1: ( ( rule__ParenthesisConstraint__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:523:1: ( ( rule__ParenthesisConstraint__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:524:1: ( rule__ParenthesisConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:525:1: ( rule__ParenthesisConstraint__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:525:2: rule__ParenthesisConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__0_in_ruleParenthesisConstraint1060);
            rule__ParenthesisConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesisConstraint"


    // $ANTLR start "entryRuleOperand"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:537:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:538:1: ( ruleOperand EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:539:1: ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_ruleOperand_in_entryRuleOperand1087);
            ruleOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperand1094); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:546:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:550:2: ( ( ( rule__Operand__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:551:1: ( ( rule__Operand__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:551:1: ( ( rule__Operand__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:552:1: ( rule__Operand__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:553:1: ( rule__Operand__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:553:2: rule__Operand__Alternatives
            {
            pushFollow(FOLLOW_rule__Operand__Alternatives_in_ruleOperand1120);
            rule__Operand__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleTypeof"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:565:1: entryRuleTypeof : ruleTypeof EOF ;
    public final void entryRuleTypeof() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:566:1: ( ruleTypeof EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:567:1: ruleTypeof EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofRule()); 
            }
            pushFollow(FOLLOW_ruleTypeof_in_entryRuleTypeof1147);
            ruleTypeof();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeof1154); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeof"


    // $ANTLR start "ruleTypeof"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:574:1: ruleTypeof : ( ( rule__Typeof__Group__0 ) ) ;
    public final void ruleTypeof() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:578:2: ( ( ( rule__Typeof__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:579:1: ( ( rule__Typeof__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:579:1: ( ( rule__Typeof__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:580:1: ( rule__Typeof__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:581:1: ( rule__Typeof__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:581:2: rule__Typeof__Group__0
            {
            pushFollow(FOLLOW_rule__Typeof__Group__0_in_ruleTypeof1180);
            rule__Typeof__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeof"


    // $ANTLR start "entryRuleTraceModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:593:1: entryRuleTraceModel : ruleTraceModel EOF ;
    public final void entryRuleTraceModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:594:1: ( ruleTraceModel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:595:1: ruleTraceModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelRule()); 
            }
            pushFollow(FOLLOW_ruleTraceModel_in_entryRuleTraceModel1207);
            ruleTraceModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraceModel1214); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTraceModel"


    // $ANTLR start "ruleTraceModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:602:1: ruleTraceModel : ( ( rule__TraceModel__Group__0 ) ) ;
    public final void ruleTraceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:606:2: ( ( ( rule__TraceModel__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:607:1: ( ( rule__TraceModel__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:607:1: ( ( rule__TraceModel__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:608:1: ( rule__TraceModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:609:1: ( rule__TraceModel__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:609:2: rule__TraceModel__Group__0
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__0_in_ruleTraceModel1240);
            rule__TraceModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTraceModel"


    // $ANTLR start "entryRuleNodeSetRelation"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:621:1: entryRuleNodeSetRelation : ruleNodeSetRelation EOF ;
    public final void entryRuleNodeSetRelation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:622:1: ( ruleNodeSetRelation EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:623:1: ruleNodeSetRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationRule()); 
            }
            pushFollow(FOLLOW_ruleNodeSetRelation_in_entryRuleNodeSetRelation1267);
            ruleNodeSetRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeSetRelation1274); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeSetRelation"


    // $ANTLR start "ruleNodeSetRelation"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:630:1: ruleNodeSetRelation : ( ( rule__NodeSetRelation__Group__0 ) ) ;
    public final void ruleNodeSetRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:634:2: ( ( ( rule__NodeSetRelation__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:635:1: ( ( rule__NodeSetRelation__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:635:1: ( ( rule__NodeSetRelation__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:636:1: ( rule__NodeSetRelation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:637:1: ( rule__NodeSetRelation__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:637:2: rule__NodeSetRelation__Group__0
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__0_in_ruleNodeSetRelation1300);
            rule__NodeSetRelation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeSetRelation"


    // $ANTLR start "entryRuleNodeType"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:649:1: entryRuleNodeType : ruleNodeType EOF ;
    public final void entryRuleNodeType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:650:1: ( ruleNodeType EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:651:1: ruleNodeType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_entryRuleNodeType1327);
            ruleNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeType1334); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeType"


    // $ANTLR start "ruleNodeType"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:658:1: ruleNodeType : ( ( rule__NodeType__TypeAssignment ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:662:2: ( ( ( rule__NodeType__TypeAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:663:1: ( ( rule__NodeType__TypeAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:663:1: ( ( rule__NodeType__TypeAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:664:1: ( rule__NodeType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getTypeAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:665:1: ( rule__NodeType__TypeAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:665:2: rule__NodeType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__NodeType__TypeAssignment_in_ruleNodeType1360);
            rule__NodeType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeTypeAccess().getTypeAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeType"


    // $ANTLR start "entryRuleLiteral"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:677:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:678:1: ( ruleLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:679:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1387);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1394); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:686:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:690:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:691:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:691:1: ( ( rule__Literal__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:692:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:693:1: ( rule__Literal__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:693:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1420);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleArrayLiteral"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:705:1: entryRuleArrayLiteral : ruleArrayLiteral EOF ;
    public final void entryRuleArrayLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:706:1: ( ruleArrayLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:707:1: ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1447);
            ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral1454); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayLiteral"


    // $ANTLR start "ruleArrayLiteral"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:714:1: ruleArrayLiteral : ( ( rule__ArrayLiteral__Group__0 ) ) ;
    public final void ruleArrayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:718:2: ( ( ( rule__ArrayLiteral__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:719:1: ( ( rule__ArrayLiteral__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:719:1: ( ( rule__ArrayLiteral__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:720:1: ( rule__ArrayLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:721:1: ( rule__ArrayLiteral__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:721:2: rule__ArrayLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1480);
            rule__ArrayLiteral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:733:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:734:1: ( ruleStringLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:735:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1507);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1514); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:742:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:746:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:747:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:747:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:748:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:749:1: ( rule__StringLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:749:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1540);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:761:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:762:1: ( ruleIntLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:763:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1567);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral1574); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:770:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:774:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:775:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:775:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:776:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:777:1: ( rule__IntLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:777:2: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1600);
            rule__IntLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleFloatLiteral"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:789:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:790:1: ( ruleFloatLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:791:1: ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1627);
            ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral1634); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:798:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:802:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:803:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:803:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:804:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:805:1: ( rule__FloatLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:805:2: rule__FloatLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1660);
            rule__FloatLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:817:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:818:1: ( ruleBooleanLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:819:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1687);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1694); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:826:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:830:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:831:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:831:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:832:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:833:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:833:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1720);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleLogicOperator"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:845:1: entryRuleLogicOperator : ruleLogicOperator EOF ;
    public final void entryRuleLogicOperator() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:846:1: ( ruleLogicOperator EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:847:1: ruleLogicOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_entryRuleLogicOperator1747);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicOperator1754); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicOperator"


    // $ANTLR start "ruleLogicOperator"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:854:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:858:2: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:859:1: ( ( rule__LogicOperator__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:859:1: ( ( rule__LogicOperator__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:860:1: ( rule__LogicOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:861:1: ( rule__LogicOperator__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:861:2: rule__LogicOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator1780);
            rule__LogicOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "entryRuleComparator"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:873:1: entryRuleComparator : ruleComparator EOF ;
    public final void entryRuleComparator() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:874:1: ( ruleComparator EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:875:1: ruleComparator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorRule()); 
            }
            pushFollow(FOLLOW_ruleComparator_in_entryRuleComparator1807);
            ruleComparator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparator1814); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:882:1: ruleComparator : ( ( rule__Comparator__Alternatives ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:886:2: ( ( ( rule__Comparator__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:887:1: ( ( rule__Comparator__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:887:1: ( ( rule__Comparator__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:888:1: ( rule__Comparator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:889:1: ( rule__Comparator__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:889:2: rule__Comparator__Alternatives
            {
            pushFollow(FOLLOW_rule__Comparator__Alternatives_in_ruleComparator1840);
            rule__Comparator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:901:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:902:1: ( ruleQualifiedName EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:903:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1867);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1874); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:910:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:914:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:915:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:915:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:916:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:917:1: ( rule__QualifiedName__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:917:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1900);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__RegisteredPackage__Alternatives_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:931:1: rule__RegisteredPackage__Alternatives_2 : ( ( ( rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 ) ) | ( ( rule__RegisteredPackage__Group_2_1__0 ) ) );
    public final void rule__RegisteredPackage__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:935:1: ( ( ( rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 ) ) | ( ( rule__RegisteredPackage__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==38) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:936:1: ( ( rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:936:1: ( ( rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:937:1: ( rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceAssignment_2_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:938:1: ( rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:938:2: rule__RegisteredPackage__ImportedNamespaceAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__RegisteredPackage__ImportedNamespaceAssignment_2_0_in_rule__RegisteredPackage__Alternatives_21938);
                    rule__RegisteredPackage__ImportedNamespaceAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:942:6: ( ( rule__RegisteredPackage__Group_2_1__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:942:6: ( ( rule__RegisteredPackage__Group_2_1__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:943:1: ( rule__RegisteredPackage__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRegisteredPackageAccess().getGroup_2_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:944:1: ( rule__RegisteredPackage__Group_2_1__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:944:2: rule__RegisteredPackage__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__RegisteredPackage__Group_2_1__0_in_rule__RegisteredPackage__Alternatives_21956);
                    rule__RegisteredPackage__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRegisteredPackageAccess().getGroup_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Alternatives_2"


    // $ANTLR start "rule__Connection__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:953:1: rule__Connection__Alternatives : ( ( ruleGenerator ) | ( ruleWeaver ) );
    public final void rule__Connection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:957:1: ( ( ruleGenerator ) | ( ruleWeaver ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:958:1: ( ruleGenerator )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:958:1: ( ruleGenerator )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:959:1: ruleGenerator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionAccess().getGeneratorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGenerator_in_rule__Connection__Alternatives1989);
                    ruleGenerator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConnectionAccess().getGeneratorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:964:6: ( ruleWeaver )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:964:6: ( ruleWeaver )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:965:1: ruleWeaver
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionAccess().getWeaverParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleWeaver_in_rule__Connection__Alternatives2006);
                    ruleWeaver();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConnectionAccess().getWeaverParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Alternatives"


    // $ANTLR start "rule__Weaver__Alternatives_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:975:1: rule__Weaver__Alternatives_2 : ( ( ( rule__Weaver__SourceModelAssignment_2_0 ) ) | ( 'link' ) );
    public final void rule__Weaver__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:979:1: ( ( ( rule__Weaver__SourceModelAssignment_2_0 ) ) | ( 'link' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:980:1: ( ( rule__Weaver__SourceModelAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:980:1: ( ( rule__Weaver__SourceModelAssignment_2_0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:981:1: ( rule__Weaver__SourceModelAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWeaverAccess().getSourceModelAssignment_2_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:982:1: ( rule__Weaver__SourceModelAssignment_2_0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:982:2: rule__Weaver__SourceModelAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Weaver__SourceModelAssignment_2_0_in_rule__Weaver__Alternatives_22038);
                    rule__Weaver__SourceModelAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWeaverAccess().getSourceModelAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:986:6: ( 'link' )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:986:6: ( 'link' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:987:1: 'link'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWeaverAccess().getLinkKeyword_2_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Weaver__Alternatives_22057); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getWeaverAccess().getLinkKeyword_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Alternatives_2"


    // $ANTLR start "rule__AspectModel__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:999:1: rule__AspectModel__Alternatives : ( ( ( rule__AspectModel__Group_0__0 ) ) | ( ruleGenerator ) );
    public final void rule__AspectModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1003:1: ( ( ( rule__AspectModel__Group_0__0 ) ) | ( ruleGenerator ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1004:1: ( ( rule__AspectModel__Group_0__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1004:1: ( ( rule__AspectModel__Group_0__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1005:1: ( rule__AspectModel__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1006:1: ( rule__AspectModel__Group_0__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1006:2: rule__AspectModel__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AspectModel__Group_0__0_in_rule__AspectModel__Alternatives2091);
                    rule__AspectModel__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAspectModelAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1010:6: ( ruleGenerator )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1010:6: ( ruleGenerator )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1011:1: ruleGenerator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getGeneratorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGenerator_in_rule__AspectModel__Alternatives2109);
                    ruleGenerator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAspectModelAccess().getGeneratorParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Alternatives"


    // $ANTLR start "rule__SourceModelNodeSelector__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1021:1: rule__SourceModelNodeSelector__Alternatives : ( ( ( rule__SourceModelNodeSelector__Group_0__0 ) ) | ( ( rule__SourceModelNodeSelector__Group_1__0 ) ) );
    public final void rule__SourceModelNodeSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1025:1: ( ( ( rule__SourceModelNodeSelector__Group_0__0 ) ) | ( ( rule__SourceModelNodeSelector__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1026:1: ( ( rule__SourceModelNodeSelector__Group_0__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1026:1: ( ( rule__SourceModelNodeSelector__Group_0__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1027:1: ( rule__SourceModelNodeSelector__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1028:1: ( rule__SourceModelNodeSelector__Group_0__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1028:2: rule__SourceModelNodeSelector__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__0_in_rule__SourceModelNodeSelector__Alternatives2141);
                    rule__SourceModelNodeSelector__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1032:6: ( ( rule__SourceModelNodeSelector__Group_1__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1032:6: ( ( rule__SourceModelNodeSelector__Group_1__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1033:1: ( rule__SourceModelNodeSelector__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1034:1: ( rule__SourceModelNodeSelector__Group_1__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1034:2: rule__SourceModelNodeSelector__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__0_in_rule__SourceModelNodeSelector__Alternatives2159);
                    rule__SourceModelNodeSelector__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Alternatives"


    // $ANTLR start "rule__BasicConstraint__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1043:1: rule__BasicConstraint__Alternatives : ( ( ruleParenthesisConstraint ) | ( ruleOperand ) );
    public final void rule__BasicConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1047:1: ( ( ruleParenthesisConstraint ) | ( ruleOperand ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_BOOLEAN)||LA6_0==32||LA6_0==35) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1048:1: ( ruleParenthesisConstraint )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1048:1: ( ruleParenthesisConstraint )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1049:1: ruleParenthesisConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getParenthesisConstraintParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleParenthesisConstraint_in_rule__BasicConstraint__Alternatives2192);
                    ruleParenthesisConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicConstraintAccess().getParenthesisConstraintParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1054:6: ( ruleOperand )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1054:6: ( ruleOperand )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1055:1: ruleOperand
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getOperandParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleOperand_in_rule__BasicConstraint__Alternatives2209);
                    ruleOperand();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicConstraintAccess().getOperandParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicConstraint__Alternatives"


    // $ANTLR start "rule__Operand__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1065:1: rule__Operand__Alternatives : ( ( ruleLiteral ) | ( ruleNodeProperty ) | ( ruleTypeof ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1069:1: ( ( ruleLiteral ) | ( ruleNodeProperty ) | ( ruleTypeof ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 35:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1070:1: ( ruleLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1070:1: ( ruleLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1071:1: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Operand__Alternatives2241);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperandAccess().getLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1076:6: ( ruleNodeProperty )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1076:6: ( ruleNodeProperty )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1077:1: ruleNodeProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getNodePropertyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNodeProperty_in_rule__Operand__Alternatives2258);
                    ruleNodeProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperandAccess().getNodePropertyParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1082:6: ( ruleTypeof )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1082:6: ( ruleTypeof )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1083:1: ruleTypeof
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getTypeofParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleTypeof_in_rule__Operand__Alternatives2275);
                    ruleTypeof();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperandAccess().getTypeofParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1093:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleArrayLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1097:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleArrayLiteral ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt8=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt8=4;
                }
                break;
            case 35:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1098:1: ( ruleStringLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1098:1: ( ruleStringLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1099:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2307);
                    ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1104:6: ( ruleIntLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1104:6: ( ruleIntLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1105:1: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives2324);
                    ruleIntLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1110:6: ( ruleFloatLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1110:6: ( ruleFloatLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1111:1: ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2341);
                    ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1116:6: ( ruleBooleanLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1116:6: ( ruleBooleanLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1117:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2358);
                    ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1122:6: ( ruleArrayLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1122:6: ( ruleArrayLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1123:1: ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives2375);
                    ruleArrayLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__LogicOperator__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1133:1: rule__LogicOperator__Alternatives : ( ( ( rule__LogicOperator__ANDAssignment_0 ) ) | ( ( rule__LogicOperator__ORAssignment_1 ) ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1137:1: ( ( ( rule__LogicOperator__ANDAssignment_0 ) ) | ( ( rule__LogicOperator__ORAssignment_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==40) ) {
                alt9=1;
            }
            else if ( (LA9_0==41) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1138:1: ( ( rule__LogicOperator__ANDAssignment_0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1138:1: ( ( rule__LogicOperator__ANDAssignment_0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1139:1: ( rule__LogicOperator__ANDAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getANDAssignment_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1140:1: ( rule__LogicOperator__ANDAssignment_0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1140:2: rule__LogicOperator__ANDAssignment_0
                    {
                    pushFollow(FOLLOW_rule__LogicOperator__ANDAssignment_0_in_rule__LogicOperator__Alternatives2407);
                    rule__LogicOperator__ANDAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getANDAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1144:6: ( ( rule__LogicOperator__ORAssignment_1 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1144:6: ( ( rule__LogicOperator__ORAssignment_1 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1145:1: ( rule__LogicOperator__ORAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getORAssignment_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1146:1: ( rule__LogicOperator__ORAssignment_1 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1146:2: rule__LogicOperator__ORAssignment_1
                    {
                    pushFollow(FOLLOW_rule__LogicOperator__ORAssignment_1_in_rule__LogicOperator__Alternatives2425);
                    rule__LogicOperator__ORAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getORAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Alternatives"


    // $ANTLR start "rule__Comparator__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1155:1: rule__Comparator__Alternatives : ( ( ( rule__Comparator__EQAssignment_0 ) ) | ( ( rule__Comparator__NEAssignment_1 ) ) | ( ( rule__Comparator__GRAssignment_2 ) ) | ( ( rule__Comparator__LWAssignment_3 ) ) | ( ( rule__Comparator__GEAssignment_4 ) ) | ( ( rule__Comparator__LEAssignment_5 ) ) | ( ( rule__Comparator__LIKEAssignment_6 ) ) );
    public final void rule__Comparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1159:1: ( ( ( rule__Comparator__EQAssignment_0 ) ) | ( ( rule__Comparator__NEAssignment_1 ) ) | ( ( rule__Comparator__GRAssignment_2 ) ) | ( ( rule__Comparator__LWAssignment_3 ) ) | ( ( rule__Comparator__GEAssignment_4 ) ) | ( ( rule__Comparator__LEAssignment_5 ) ) | ( ( rule__Comparator__LIKEAssignment_6 ) ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt10=1;
                }
                break;
            case 43:
                {
                alt10=2;
                }
                break;
            case 34:
                {
                alt10=3;
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            case 44:
                {
                alt10=5;
                }
                break;
            case 45:
                {
                alt10=6;
                }
                break;
            case 46:
                {
                alt10=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1160:1: ( ( rule__Comparator__EQAssignment_0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1160:1: ( ( rule__Comparator__EQAssignment_0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1161:1: ( rule__Comparator__EQAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getEQAssignment_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1162:1: ( rule__Comparator__EQAssignment_0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1162:2: rule__Comparator__EQAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Comparator__EQAssignment_0_in_rule__Comparator__Alternatives2458);
                    rule__Comparator__EQAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getEQAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1166:6: ( ( rule__Comparator__NEAssignment_1 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1166:6: ( ( rule__Comparator__NEAssignment_1 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1167:1: ( rule__Comparator__NEAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getNEAssignment_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1168:1: ( rule__Comparator__NEAssignment_1 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1168:2: rule__Comparator__NEAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Comparator__NEAssignment_1_in_rule__Comparator__Alternatives2476);
                    rule__Comparator__NEAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getNEAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1172:6: ( ( rule__Comparator__GRAssignment_2 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1172:6: ( ( rule__Comparator__GRAssignment_2 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1173:1: ( rule__Comparator__GRAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getGRAssignment_2()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1174:1: ( rule__Comparator__GRAssignment_2 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1174:2: rule__Comparator__GRAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Comparator__GRAssignment_2_in_rule__Comparator__Alternatives2494);
                    rule__Comparator__GRAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getGRAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1178:6: ( ( rule__Comparator__LWAssignment_3 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1178:6: ( ( rule__Comparator__LWAssignment_3 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1179:1: ( rule__Comparator__LWAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLWAssignment_3()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1180:1: ( rule__Comparator__LWAssignment_3 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1180:2: rule__Comparator__LWAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Comparator__LWAssignment_3_in_rule__Comparator__Alternatives2512);
                    rule__Comparator__LWAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getLWAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1184:6: ( ( rule__Comparator__GEAssignment_4 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1184:6: ( ( rule__Comparator__GEAssignment_4 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1185:1: ( rule__Comparator__GEAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getGEAssignment_4()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1186:1: ( rule__Comparator__GEAssignment_4 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1186:2: rule__Comparator__GEAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Comparator__GEAssignment_4_in_rule__Comparator__Alternatives2530);
                    rule__Comparator__GEAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getGEAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1190:6: ( ( rule__Comparator__LEAssignment_5 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1190:6: ( ( rule__Comparator__LEAssignment_5 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1191:1: ( rule__Comparator__LEAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLEAssignment_5()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1192:1: ( rule__Comparator__LEAssignment_5 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1192:2: rule__Comparator__LEAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Comparator__LEAssignment_5_in_rule__Comparator__Alternatives2548);
                    rule__Comparator__LEAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getLEAssignment_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1196:6: ( ( rule__Comparator__LIKEAssignment_6 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1196:6: ( ( rule__Comparator__LIKEAssignment_6 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1197:1: ( rule__Comparator__LIKEAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLIKEAssignment_6()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1198:1: ( rule__Comparator__LIKEAssignment_6 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1198:2: rule__Comparator__LIKEAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Comparator__LIKEAssignment_6_in_rule__Comparator__Alternatives2566);
                    rule__Comparator__LIKEAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getLIKEAssignment_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1209:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1213:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1214:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02597);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02600);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1221:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1225:1: ( ( 'package' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1226:1: ( 'package' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1226:1: ( 'package' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1227:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Model__Group__0__Impl2628); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1240:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1244:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1245:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12659);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12662);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1252:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1256:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1257:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1257:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1258:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1259:1: ( rule__Model__NameAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1259:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2689);
            rule__Model__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1269:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1273:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1274:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22719);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22722);
            rule__Model__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1281:1: rule__Model__Group__2__Impl : ( ( rule__Model__ImportsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1285:1: ( ( ( rule__Model__ImportsAssignment_2 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1286:1: ( ( rule__Model__ImportsAssignment_2 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1286:1: ( ( rule__Model__ImportsAssignment_2 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1287:1: ( rule__Model__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1288:1: ( rule__Model__ImportsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1288:2: rule__Model__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl2749);
            	    rule__Model__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1298:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1302:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1303:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32780);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32783);
            rule__Model__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1310:1: rule__Model__Group__3__Impl : ( ( rule__Model__RegisteredPackagesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1314:1: ( ( ( rule__Model__RegisteredPackagesAssignment_3 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1315:1: ( ( rule__Model__RegisteredPackagesAssignment_3 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1315:1: ( ( rule__Model__RegisteredPackagesAssignment_3 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1316:1: ( rule__Model__RegisteredPackagesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRegisteredPackagesAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1317:1: ( rule__Model__RegisteredPackagesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1317:2: rule__Model__RegisteredPackagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__RegisteredPackagesAssignment_3_in_rule__Model__Group__3__Impl2810);
            	    rule__Model__RegisteredPackagesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRegisteredPackagesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1327:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1331:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1332:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42841);
            rule__Model__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42844);
            rule__Model__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1339:1: rule__Model__Group__4__Impl : ( ( rule__Model__MetamodelsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1343:1: ( ( ( rule__Model__MetamodelsAssignment_4 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1344:1: ( ( rule__Model__MetamodelsAssignment_4 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1344:1: ( ( rule__Model__MetamodelsAssignment_4 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1345:1: ( rule__Model__MetamodelsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetamodelsAssignment_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1346:1: ( rule__Model__MetamodelsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1346:2: rule__Model__MetamodelsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__MetamodelsAssignment_4_in_rule__Model__Group__4__Impl2871);
            	    rule__Model__MetamodelsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getMetamodelsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1356:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1360:1: ( rule__Model__Group__5__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1361:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52902);
            rule__Model__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1367:1: rule__Model__Group__5__Impl : ( ( rule__Model__ConnectionsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1371:1: ( ( ( rule__Model__ConnectionsAssignment_5 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1372:1: ( ( rule__Model__ConnectionsAssignment_5 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1372:1: ( ( rule__Model__ConnectionsAssignment_5 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1373:1: ( rule__Model__ConnectionsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getConnectionsAssignment_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1374:1: ( rule__Model__ConnectionsAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20||LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1374:2: rule__Model__ConnectionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__ConnectionsAssignment_5_in_rule__Model__Group__5__Impl2929);
            	    rule__Model__ConnectionsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getConnectionsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1396:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1400:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1401:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02972);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02975);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1408:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1412:1: ( ( 'import' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1413:1: ( 'import' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1413:1: ( 'import' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1414:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Import__Group__0__Impl3003); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1427:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1431:1: ( rule__Import__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1432:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13034);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1438:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1442:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1443:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1443:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1444:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1445:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1445:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3061);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__MetamodelSequence__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1459:1: rule__MetamodelSequence__Group__0 : rule__MetamodelSequence__Group__0__Impl rule__MetamodelSequence__Group__1 ;
    public final void rule__MetamodelSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1463:1: ( rule__MetamodelSequence__Group__0__Impl rule__MetamodelSequence__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1464:2: rule__MetamodelSequence__Group__0__Impl rule__MetamodelSequence__Group__1
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__0__Impl_in_rule__MetamodelSequence__Group__03095);
            rule__MetamodelSequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__1_in_rule__MetamodelSequence__Group__03098);
            rule__MetamodelSequence__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__Group__0"


    // $ANTLR start "rule__MetamodelSequence__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1471:1: rule__MetamodelSequence__Group__0__Impl : ( 'model' ) ;
    public final void rule__MetamodelSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1475:1: ( ( 'model' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1476:1: ( 'model' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1476:1: ( 'model' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1477:1: 'model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getModelKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__MetamodelSequence__Group__0__Impl3126); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getModelKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__Group__0__Impl"


    // $ANTLR start "rule__MetamodelSequence__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1490:1: rule__MetamodelSequence__Group__1 : rule__MetamodelSequence__Group__1__Impl rule__MetamodelSequence__Group__2 ;
    public final void rule__MetamodelSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1494:1: ( rule__MetamodelSequence__Group__1__Impl rule__MetamodelSequence__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1495:2: rule__MetamodelSequence__Group__1__Impl rule__MetamodelSequence__Group__2
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__1__Impl_in_rule__MetamodelSequence__Group__13157);
            rule__MetamodelSequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__2_in_rule__MetamodelSequence__Group__13160);
            rule__MetamodelSequence__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__Group__1"


    // $ANTLR start "rule__MetamodelSequence__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1502:1: rule__MetamodelSequence__Group__1__Impl : ( ( rule__MetamodelSequence__TypeAssignment_1 ) ) ;
    public final void rule__MetamodelSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1506:1: ( ( ( rule__MetamodelSequence__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1507:1: ( ( rule__MetamodelSequence__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1507:1: ( ( rule__MetamodelSequence__TypeAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1508:1: ( rule__MetamodelSequence__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1509:1: ( rule__MetamodelSequence__TypeAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1509:2: rule__MetamodelSequence__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__TypeAssignment_1_in_rule__MetamodelSequence__Group__1__Impl3187);
            rule__MetamodelSequence__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__Group__1__Impl"


    // $ANTLR start "rule__MetamodelSequence__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1519:1: rule__MetamodelSequence__Group__2 : rule__MetamodelSequence__Group__2__Impl rule__MetamodelSequence__Group__3 ;
    public final void rule__MetamodelSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1523:1: ( rule__MetamodelSequence__Group__2__Impl rule__MetamodelSequence__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1524:2: rule__MetamodelSequence__Group__2__Impl rule__MetamodelSequence__Group__3
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__2__Impl_in_rule__MetamodelSequence__Group__23217);
            rule__MetamodelSequence__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__3_in_rule__MetamodelSequence__Group__23220);
            rule__MetamodelSequence__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__Group__2"


    // $ANTLR start "rule__MetamodelSequence__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1531:1: rule__MetamodelSequence__Group__2__Impl : ( ( rule__MetamodelSequence__MetamodelsAssignment_2 ) ) ;
    public final void rule__MetamodelSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1535:1: ( ( ( rule__MetamodelSequence__MetamodelsAssignment_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1536:1: ( ( rule__MetamodelSequence__MetamodelsAssignment_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1536:1: ( ( rule__MetamodelSequence__MetamodelsAssignment_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1537:1: ( rule__MetamodelSequence__MetamodelsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1538:1: ( rule__MetamodelSequence__MetamodelsAssignment_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1538:2: rule__MetamodelSequence__MetamodelsAssignment_2
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__MetamodelsAssignment_2_in_rule__MetamodelSequence__Group__2__Impl3247);
            rule__MetamodelSequence__MetamodelsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getMetamodelsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__Group__2__Impl"


    // $ANTLR start "rule__MetamodelSequence__Group__3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1548:1: rule__MetamodelSequence__Group__3 : rule__MetamodelSequence__Group__3__Impl ;
    public final void rule__MetamodelSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1552:1: ( rule__MetamodelSequence__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1553:2: rule__MetamodelSequence__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__3__Impl_in_rule__MetamodelSequence__Group__33277);
            rule__MetamodelSequence__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__Group__3"


    // $ANTLR start "rule__MetamodelSequence__Group__3__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1559:1: rule__MetamodelSequence__Group__3__Impl : ( ( rule__MetamodelSequence__Group_3__0 )* ) ;
    public final void rule__MetamodelSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1563:1: ( ( ( rule__MetamodelSequence__Group_3__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1564:1: ( ( rule__MetamodelSequence__Group_3__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1564:1: ( ( rule__MetamodelSequence__Group_3__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1565:1: ( rule__MetamodelSequence__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1566:1: ( rule__MetamodelSequence__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1566:2: rule__MetamodelSequence__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__MetamodelSequence__Group_3__0_in_rule__MetamodelSequence__Group__3__Impl3304);
            	    rule__MetamodelSequence__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__Group__3__Impl"


    // $ANTLR start "rule__MetamodelSequence__Group_3__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1584:1: rule__MetamodelSequence__Group_3__0 : rule__MetamodelSequence__Group_3__0__Impl rule__MetamodelSequence__Group_3__1 ;
    public final void rule__MetamodelSequence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1588:1: ( rule__MetamodelSequence__Group_3__0__Impl rule__MetamodelSequence__Group_3__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1589:2: rule__MetamodelSequence__Group_3__0__Impl rule__MetamodelSequence__Group_3__1
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group_3__0__Impl_in_rule__MetamodelSequence__Group_3__03343);
            rule__MetamodelSequence__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetamodelSequence__Group_3__1_in_rule__MetamodelSequence__Group_3__03346);
            rule__MetamodelSequence__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__Group_3__0"


    // $ANTLR start "rule__MetamodelSequence__Group_3__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1596:1: rule__MetamodelSequence__Group_3__0__Impl : ( ',' ) ;
    public final void rule__MetamodelSequence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1600:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1601:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1601:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1602:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getCommaKeyword_3_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__MetamodelSequence__Group_3__0__Impl3374); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__Group_3__0__Impl"


    // $ANTLR start "rule__MetamodelSequence__Group_3__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1615:1: rule__MetamodelSequence__Group_3__1 : rule__MetamodelSequence__Group_3__1__Impl ;
    public final void rule__MetamodelSequence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1619:1: ( rule__MetamodelSequence__Group_3__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1620:2: rule__MetamodelSequence__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group_3__1__Impl_in_rule__MetamodelSequence__Group_3__13405);
            rule__MetamodelSequence__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__Group_3__1"


    // $ANTLR start "rule__MetamodelSequence__Group_3__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1626:1: rule__MetamodelSequence__Group_3__1__Impl : ( ( rule__MetamodelSequence__MetamodelsAssignment_3_1 ) ) ;
    public final void rule__MetamodelSequence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1630:1: ( ( ( rule__MetamodelSequence__MetamodelsAssignment_3_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1631:1: ( ( rule__MetamodelSequence__MetamodelsAssignment_3_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1631:1: ( ( rule__MetamodelSequence__MetamodelsAssignment_3_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1632:1: ( rule__MetamodelSequence__MetamodelsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsAssignment_3_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1633:1: ( rule__MetamodelSequence__MetamodelsAssignment_3_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1633:2: rule__MetamodelSequence__MetamodelsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__MetamodelsAssignment_3_1_in_rule__MetamodelSequence__Group_3__1__Impl3432);
            rule__MetamodelSequence__MetamodelsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getMetamodelsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__Group_3__1__Impl"


    // $ANTLR start "rule__RegisteredPackage__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1647:1: rule__RegisteredPackage__Group__0 : rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1 ;
    public final void rule__RegisteredPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1651:1: ( rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1652:2: rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__0__Impl_in_rule__RegisteredPackage__Group__03466);
            rule__RegisteredPackage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__1_in_rule__RegisteredPackage__Group__03469);
            rule__RegisteredPackage__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group__0"


    // $ANTLR start "rule__RegisteredPackage__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1659:1: rule__RegisteredPackage__Group__0__Impl : ( 'register' ) ;
    public final void rule__RegisteredPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1663:1: ( ( 'register' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1664:1: ( 'register' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1664:1: ( 'register' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1665:1: 'register'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getRegisterKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__RegisteredPackage__Group__0__Impl3497); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getRegisterKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group__0__Impl"


    // $ANTLR start "rule__RegisteredPackage__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1678:1: rule__RegisteredPackage__Group__1 : rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2 ;
    public final void rule__RegisteredPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1682:1: ( rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1683:2: rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__1__Impl_in_rule__RegisteredPackage__Group__13528);
            rule__RegisteredPackage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__2_in_rule__RegisteredPackage__Group__13531);
            rule__RegisteredPackage__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group__1"


    // $ANTLR start "rule__RegisteredPackage__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1690:1: rule__RegisteredPackage__Group__1__Impl : ( ( rule__RegisteredPackage__NameAssignment_1 ) ) ;
    public final void rule__RegisteredPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1694:1: ( ( ( rule__RegisteredPackage__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1695:1: ( ( rule__RegisteredPackage__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1695:1: ( ( rule__RegisteredPackage__NameAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1696:1: ( rule__RegisteredPackage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1697:1: ( rule__RegisteredPackage__NameAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1697:2: rule__RegisteredPackage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__NameAssignment_1_in_rule__RegisteredPackage__Group__1__Impl3558);
            rule__RegisteredPackage__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group__1__Impl"


    // $ANTLR start "rule__RegisteredPackage__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1707:1: rule__RegisteredPackage__Group__2 : rule__RegisteredPackage__Group__2__Impl ;
    public final void rule__RegisteredPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1711:1: ( rule__RegisteredPackage__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1712:2: rule__RegisteredPackage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__2__Impl_in_rule__RegisteredPackage__Group__23588);
            rule__RegisteredPackage__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group__2"


    // $ANTLR start "rule__RegisteredPackage__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1718:1: rule__RegisteredPackage__Group__2__Impl : ( ( rule__RegisteredPackage__Alternatives_2 ) ) ;
    public final void rule__RegisteredPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1722:1: ( ( ( rule__RegisteredPackage__Alternatives_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1723:1: ( ( rule__RegisteredPackage__Alternatives_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1723:1: ( ( rule__RegisteredPackage__Alternatives_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1724:1: ( rule__RegisteredPackage__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1725:1: ( rule__RegisteredPackage__Alternatives_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1725:2: rule__RegisteredPackage__Alternatives_2
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Alternatives_2_in_rule__RegisteredPackage__Group__2__Impl3615);
            rule__RegisteredPackage__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group__2__Impl"


    // $ANTLR start "rule__RegisteredPackage__Group_2_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1741:1: rule__RegisteredPackage__Group_2_1__0 : rule__RegisteredPackage__Group_2_1__0__Impl rule__RegisteredPackage__Group_2_1__1 ;
    public final void rule__RegisteredPackage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1745:1: ( rule__RegisteredPackage__Group_2_1__0__Impl rule__RegisteredPackage__Group_2_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1746:2: rule__RegisteredPackage__Group_2_1__0__Impl rule__RegisteredPackage__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group_2_1__0__Impl_in_rule__RegisteredPackage__Group_2_1__03651);
            rule__RegisteredPackage__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group_2_1__1_in_rule__RegisteredPackage__Group_2_1__03654);
            rule__RegisteredPackage__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group_2_1__0"


    // $ANTLR start "rule__RegisteredPackage__Group_2_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1753:1: rule__RegisteredPackage__Group_2_1__0__Impl : ( ( rule__RegisteredPackage__IsTextAssignment_2_1_0 ) ) ;
    public final void rule__RegisteredPackage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1757:1: ( ( ( rule__RegisteredPackage__IsTextAssignment_2_1_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1758:1: ( ( rule__RegisteredPackage__IsTextAssignment_2_1_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1758:1: ( ( rule__RegisteredPackage__IsTextAssignment_2_1_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1759:1: ( rule__RegisteredPackage__IsTextAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getIsTextAssignment_2_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1760:1: ( rule__RegisteredPackage__IsTextAssignment_2_1_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1760:2: rule__RegisteredPackage__IsTextAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__IsTextAssignment_2_1_0_in_rule__RegisteredPackage__Group_2_1__0__Impl3681);
            rule__RegisteredPackage__IsTextAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getIsTextAssignment_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group_2_1__0__Impl"


    // $ANTLR start "rule__RegisteredPackage__Group_2_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1770:1: rule__RegisteredPackage__Group_2_1__1 : rule__RegisteredPackage__Group_2_1__1__Impl ;
    public final void rule__RegisteredPackage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1774:1: ( rule__RegisteredPackage__Group_2_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1775:2: rule__RegisteredPackage__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group_2_1__1__Impl_in_rule__RegisteredPackage__Group_2_1__13711);
            rule__RegisteredPackage__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group_2_1__1"


    // $ANTLR start "rule__RegisteredPackage__Group_2_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1781:1: rule__RegisteredPackage__Group_2_1__1__Impl : ( ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 ) ) ;
    public final void rule__RegisteredPackage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1785:1: ( ( ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1786:1: ( ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1786:1: ( ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1787:1: ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getExtensionAssignment_2_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1788:1: ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1788:2: rule__RegisteredPackage__ExtensionAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__ExtensionAssignment_2_1_1_in_rule__RegisteredPackage__Group_2_1__1__Impl3738);
            rule__RegisteredPackage__ExtensionAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getExtensionAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__Group_2_1__1__Impl"


    // $ANTLR start "rule__Weaver__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1802:1: rule__Weaver__Group__0 : rule__Weaver__Group__0__Impl rule__Weaver__Group__1 ;
    public final void rule__Weaver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1806:1: ( rule__Weaver__Group__0__Impl rule__Weaver__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1807:2: rule__Weaver__Group__0__Impl rule__Weaver__Group__1
            {
            pushFollow(FOLLOW_rule__Weaver__Group__0__Impl_in_rule__Weaver__Group__03772);
            rule__Weaver__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__1_in_rule__Weaver__Group__03775);
            rule__Weaver__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group__0"


    // $ANTLR start "rule__Weaver__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1814:1: rule__Weaver__Group__0__Impl : ( 'weave' ) ;
    public final void rule__Weaver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1818:1: ( ( 'weave' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1819:1: ( 'weave' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1819:1: ( 'weave' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1820:1: 'weave'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getWeaveKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Weaver__Group__0__Impl3803); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getWeaveKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group__0__Impl"


    // $ANTLR start "rule__Weaver__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1833:1: rule__Weaver__Group__1 : rule__Weaver__Group__1__Impl rule__Weaver__Group__2 ;
    public final void rule__Weaver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1837:1: ( rule__Weaver__Group__1__Impl rule__Weaver__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1838:2: rule__Weaver__Group__1__Impl rule__Weaver__Group__2
            {
            pushFollow(FOLLOW_rule__Weaver__Group__1__Impl_in_rule__Weaver__Group__13834);
            rule__Weaver__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__2_in_rule__Weaver__Group__13837);
            rule__Weaver__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group__1"


    // $ANTLR start "rule__Weaver__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1845:1: rule__Weaver__Group__1__Impl : ( ( rule__Weaver__WeaverAssignment_1 ) ) ;
    public final void rule__Weaver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1849:1: ( ( ( rule__Weaver__WeaverAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1850:1: ( ( rule__Weaver__WeaverAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1850:1: ( ( rule__Weaver__WeaverAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1851:1: ( rule__Weaver__WeaverAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getWeaverAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1852:1: ( rule__Weaver__WeaverAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1852:2: rule__Weaver__WeaverAssignment_1
            {
            pushFollow(FOLLOW_rule__Weaver__WeaverAssignment_1_in_rule__Weaver__Group__1__Impl3864);
            rule__Weaver__WeaverAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getWeaverAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group__1__Impl"


    // $ANTLR start "rule__Weaver__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1862:1: rule__Weaver__Group__2 : rule__Weaver__Group__2__Impl rule__Weaver__Group__3 ;
    public final void rule__Weaver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1866:1: ( rule__Weaver__Group__2__Impl rule__Weaver__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1867:2: rule__Weaver__Group__2__Impl rule__Weaver__Group__3
            {
            pushFollow(FOLLOW_rule__Weaver__Group__2__Impl_in_rule__Weaver__Group__23894);
            rule__Weaver__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__3_in_rule__Weaver__Group__23897);
            rule__Weaver__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group__2"


    // $ANTLR start "rule__Weaver__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1874:1: rule__Weaver__Group__2__Impl : ( ( rule__Weaver__Alternatives_2 ) ) ;
    public final void rule__Weaver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1878:1: ( ( ( rule__Weaver__Alternatives_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1879:1: ( ( rule__Weaver__Alternatives_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1879:1: ( ( rule__Weaver__Alternatives_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1880:1: ( rule__Weaver__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1881:1: ( rule__Weaver__Alternatives_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1881:2: rule__Weaver__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Weaver__Alternatives_2_in_rule__Weaver__Group__2__Impl3924);
            rule__Weaver__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group__2__Impl"


    // $ANTLR start "rule__Weaver__Group__3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1891:1: rule__Weaver__Group__3 : rule__Weaver__Group__3__Impl rule__Weaver__Group__4 ;
    public final void rule__Weaver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1895:1: ( rule__Weaver__Group__3__Impl rule__Weaver__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1896:2: rule__Weaver__Group__3__Impl rule__Weaver__Group__4
            {
            pushFollow(FOLLOW_rule__Weaver__Group__3__Impl_in_rule__Weaver__Group__33954);
            rule__Weaver__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__4_in_rule__Weaver__Group__33957);
            rule__Weaver__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group__3"


    // $ANTLR start "rule__Weaver__Group__3__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1903:1: rule__Weaver__Group__3__Impl : ( ( rule__Weaver__AspectModelAssignment_3 ) ) ;
    public final void rule__Weaver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1907:1: ( ( ( rule__Weaver__AspectModelAssignment_3 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1908:1: ( ( rule__Weaver__AspectModelAssignment_3 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1908:1: ( ( rule__Weaver__AspectModelAssignment_3 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1909:1: ( rule__Weaver__AspectModelAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getAspectModelAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1910:1: ( rule__Weaver__AspectModelAssignment_3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1910:2: rule__Weaver__AspectModelAssignment_3
            {
            pushFollow(FOLLOW_rule__Weaver__AspectModelAssignment_3_in_rule__Weaver__Group__3__Impl3984);
            rule__Weaver__AspectModelAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getAspectModelAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group__3__Impl"


    // $ANTLR start "rule__Weaver__Group__4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1920:1: rule__Weaver__Group__4 : rule__Weaver__Group__4__Impl ;
    public final void rule__Weaver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1924:1: ( rule__Weaver__Group__4__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1925:2: rule__Weaver__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Weaver__Group__4__Impl_in_rule__Weaver__Group__44014);
            rule__Weaver__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group__4"


    // $ANTLR start "rule__Weaver__Group__4__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1931:1: rule__Weaver__Group__4__Impl : ( ( rule__Weaver__Group_4__0 )? ) ;
    public final void rule__Weaver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1935:1: ( ( ( rule__Weaver__Group_4__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1936:1: ( ( rule__Weaver__Group_4__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1936:1: ( ( rule__Weaver__Group_4__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1937:1: ( rule__Weaver__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getGroup_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1938:1: ( rule__Weaver__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1938:2: rule__Weaver__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Weaver__Group_4__0_in_rule__Weaver__Group__4__Impl4041);
                    rule__Weaver__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group__4__Impl"


    // $ANTLR start "rule__Weaver__Group_4__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1958:1: rule__Weaver__Group_4__0 : rule__Weaver__Group_4__0__Impl rule__Weaver__Group_4__1 ;
    public final void rule__Weaver__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1962:1: ( rule__Weaver__Group_4__0__Impl rule__Weaver__Group_4__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1963:2: rule__Weaver__Group_4__0__Impl rule__Weaver__Group_4__1
            {
            pushFollow(FOLLOW_rule__Weaver__Group_4__0__Impl_in_rule__Weaver__Group_4__04082);
            rule__Weaver__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group_4__1_in_rule__Weaver__Group_4__04085);
            rule__Weaver__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group_4__0"


    // $ANTLR start "rule__Weaver__Group_4__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1970:1: rule__Weaver__Group_4__0__Impl : ( '=>' ) ;
    public final void rule__Weaver__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1974:1: ( ( '=>' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1975:1: ( '=>' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1975:1: ( '=>' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1976:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getEqualsSignGreaterThanSignKeyword_4_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Weaver__Group_4__0__Impl4113); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getEqualsSignGreaterThanSignKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group_4__0__Impl"


    // $ANTLR start "rule__Weaver__Group_4__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1989:1: rule__Weaver__Group_4__1 : rule__Weaver__Group_4__1__Impl ;
    public final void rule__Weaver__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1993:1: ( rule__Weaver__Group_4__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1994:2: rule__Weaver__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Weaver__Group_4__1__Impl_in_rule__Weaver__Group_4__14144);
            rule__Weaver__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group_4__1"


    // $ANTLR start "rule__Weaver__Group_4__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2000:1: rule__Weaver__Group_4__1__Impl : ( ( rule__Weaver__TargetModelAssignment_4_1 ) ) ;
    public final void rule__Weaver__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2004:1: ( ( ( rule__Weaver__TargetModelAssignment_4_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2005:1: ( ( rule__Weaver__TargetModelAssignment_4_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2005:1: ( ( rule__Weaver__TargetModelAssignment_4_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2006:1: ( rule__Weaver__TargetModelAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getTargetModelAssignment_4_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2007:1: ( rule__Weaver__TargetModelAssignment_4_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2007:2: rule__Weaver__TargetModelAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Weaver__TargetModelAssignment_4_1_in_rule__Weaver__Group_4__1__Impl4171);
            rule__Weaver__TargetModelAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getTargetModelAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__Group_4__1__Impl"


    // $ANTLR start "rule__AspectModel__Group_0__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2021:1: rule__AspectModel__Group_0__0 : rule__AspectModel__Group_0__0__Impl rule__AspectModel__Group_0__1 ;
    public final void rule__AspectModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2025:1: ( rule__AspectModel__Group_0__0__Impl rule__AspectModel__Group_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2026:2: rule__AspectModel__Group_0__0__Impl rule__AspectModel__Group_0__1
            {
            pushFollow(FOLLOW_rule__AspectModel__Group_0__0__Impl_in_rule__AspectModel__Group_0__04205);
            rule__AspectModel__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AspectModel__Group_0__1_in_rule__AspectModel__Group_0__04208);
            rule__AspectModel__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group_0__0"


    // $ANTLR start "rule__AspectModel__Group_0__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2033:1: rule__AspectModel__Group_0__0__Impl : ( ':' ) ;
    public final void rule__AspectModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2037:1: ( ( ':' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2038:1: ( ':' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2038:1: ( ':' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2039:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getColonKeyword_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__AspectModel__Group_0__0__Impl4236); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getColonKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group_0__0__Impl"


    // $ANTLR start "rule__AspectModel__Group_0__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2052:1: rule__AspectModel__Group_0__1 : rule__AspectModel__Group_0__1__Impl ;
    public final void rule__AspectModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2056:1: ( rule__AspectModel__Group_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2057:2: rule__AspectModel__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AspectModel__Group_0__1__Impl_in_rule__AspectModel__Group_0__14267);
            rule__AspectModel__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group_0__1"


    // $ANTLR start "rule__AspectModel__Group_0__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2063:1: rule__AspectModel__Group_0__1__Impl : ( ruleTargetModelNodeType ) ;
    public final void rule__AspectModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2067:1: ( ( ruleTargetModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2068:1: ( ruleTargetModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2068:1: ( ruleTargetModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2069:1: ruleTargetModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getTargetModelNodeTypeParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_rule__AspectModel__Group_0__1__Impl4294);
            ruleTargetModelNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getTargetModelNodeTypeParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group_0__1__Impl"


    // $ANTLR start "rule__Generator__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2084:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2088:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2089:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
            {
            pushFollow(FOLLOW_rule__Generator__Group__0__Impl_in_rule__Generator__Group__04327);
            rule__Generator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__1_in_rule__Generator__Group__04330);
            rule__Generator__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__0"


    // $ANTLR start "rule__Generator__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2096:1: rule__Generator__Group__0__Impl : ( 'generate' ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2100:1: ( ( 'generate' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2101:1: ( 'generate' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2101:1: ( 'generate' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2102:1: 'generate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGenerateKeyword_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Generator__Group__0__Impl4358); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGenerateKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__0__Impl"


    // $ANTLR start "rule__Generator__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2115:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2119:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2120:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
            {
            pushFollow(FOLLOW_rule__Generator__Group__1__Impl_in_rule__Generator__Group__14389);
            rule__Generator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__2_in_rule__Generator__Group__14392);
            rule__Generator__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__1"


    // $ANTLR start "rule__Generator__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2127:1: rule__Generator__Group__1__Impl : ( ( rule__Generator__GeneratorAssignment_1 ) ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2131:1: ( ( ( rule__Generator__GeneratorAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2132:1: ( ( rule__Generator__GeneratorAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2132:1: ( ( rule__Generator__GeneratorAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2133:1: ( rule__Generator__GeneratorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGeneratorAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2134:1: ( rule__Generator__GeneratorAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2134:2: rule__Generator__GeneratorAssignment_1
            {
            pushFollow(FOLLOW_rule__Generator__GeneratorAssignment_1_in_rule__Generator__Group__1__Impl4419);
            rule__Generator__GeneratorAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGeneratorAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__1__Impl"


    // $ANTLR start "rule__Generator__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2144:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2148:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2149:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
            {
            pushFollow(FOLLOW_rule__Generator__Group__2__Impl_in_rule__Generator__Group__24449);
            rule__Generator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__3_in_rule__Generator__Group__24452);
            rule__Generator__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__2"


    // $ANTLR start "rule__Generator__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2156:1: rule__Generator__Group__2__Impl : ( ( rule__Generator__SourceModelAssignment_2 ) ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2160:1: ( ( ( rule__Generator__SourceModelAssignment_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2161:1: ( ( rule__Generator__SourceModelAssignment_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2161:1: ( ( rule__Generator__SourceModelAssignment_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2162:1: ( rule__Generator__SourceModelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceModelAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2163:1: ( rule__Generator__SourceModelAssignment_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2163:2: rule__Generator__SourceModelAssignment_2
            {
            pushFollow(FOLLOW_rule__Generator__SourceModelAssignment_2_in_rule__Generator__Group__2__Impl4479);
            rule__Generator__SourceModelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceModelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__2__Impl"


    // $ANTLR start "rule__Generator__Group__3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2173:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2177:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2178:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
            {
            pushFollow(FOLLOW_rule__Generator__Group__3__Impl_in_rule__Generator__Group__34509);
            rule__Generator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__4_in_rule__Generator__Group__34512);
            rule__Generator__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__3"


    // $ANTLR start "rule__Generator__Group__3__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2185:1: rule__Generator__Group__3__Impl : ( ( rule__Generator__TargetModelAssignment_3 ) ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2189:1: ( ( ( rule__Generator__TargetModelAssignment_3 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2190:1: ( ( rule__Generator__TargetModelAssignment_3 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2190:1: ( ( rule__Generator__TargetModelAssignment_3 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2191:1: ( rule__Generator__TargetModelAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetModelAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2192:1: ( rule__Generator__TargetModelAssignment_3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2192:2: rule__Generator__TargetModelAssignment_3
            {
            pushFollow(FOLLOW_rule__Generator__TargetModelAssignment_3_in_rule__Generator__Group__3__Impl4539);
            rule__Generator__TargetModelAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getTargetModelAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__3__Impl"


    // $ANTLR start "rule__Generator__Group__4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2202:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2206:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2207:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
            {
            pushFollow(FOLLOW_rule__Generator__Group__4__Impl_in_rule__Generator__Group__44569);
            rule__Generator__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__5_in_rule__Generator__Group__44572);
            rule__Generator__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__4"


    // $ANTLR start "rule__Generator__Group__4__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2214:1: rule__Generator__Group__4__Impl : ( ( rule__Generator__Group_4__0 )? ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2218:1: ( ( ( rule__Generator__Group_4__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2219:1: ( ( rule__Generator__Group_4__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2219:1: ( ( rule__Generator__Group_4__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2220:1: ( rule__Generator__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2221:1: ( rule__Generator__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2221:2: rule__Generator__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_4__0_in_rule__Generator__Group__4__Impl4599);
                    rule__Generator__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__4__Impl"


    // $ANTLR start "rule__Generator__Group__5"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2231:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2235:1: ( rule__Generator__Group__5__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2236:2: rule__Generator__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group__5__Impl_in_rule__Generator__Group__54630);
            rule__Generator__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__5"


    // $ANTLR start "rule__Generator__Group__5__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2242:1: rule__Generator__Group__5__Impl : ( ( rule__Generator__Group_5__0 )? ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2246:1: ( ( ( rule__Generator__Group_5__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2247:1: ( ( rule__Generator__Group_5__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2247:1: ( ( rule__Generator__Group_5__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2248:1: ( rule__Generator__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2249:1: ( rule__Generator__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2249:2: rule__Generator__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_5__0_in_rule__Generator__Group__5__Impl4657);
                    rule__Generator__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group__5__Impl"


    // $ANTLR start "rule__Generator__Group_4__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2271:1: rule__Generator__Group_4__0 : rule__Generator__Group_4__0__Impl rule__Generator__Group_4__1 ;
    public final void rule__Generator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2275:1: ( rule__Generator__Group_4__0__Impl rule__Generator__Group_4__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2276:2: rule__Generator__Group_4__0__Impl rule__Generator__Group_4__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_4__0__Impl_in_rule__Generator__Group_4__04700);
            rule__Generator__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_4__1_in_rule__Generator__Group_4__04703);
            rule__Generator__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_4__0"


    // $ANTLR start "rule__Generator__Group_4__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2283:1: rule__Generator__Group_4__0__Impl : ( '->' ) ;
    public final void rule__Generator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2287:1: ( ( '->' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2288:1: ( '->' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2288:1: ( '->' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2289:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Generator__Group_4__0__Impl4731); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_4__0__Impl"


    // $ANTLR start "rule__Generator__Group_4__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2302:1: rule__Generator__Group_4__1 : rule__Generator__Group_4__1__Impl ;
    public final void rule__Generator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2306:1: ( rule__Generator__Group_4__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2307:2: rule__Generator__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_4__1__Impl_in_rule__Generator__Group_4__14762);
            rule__Generator__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_4__1"


    // $ANTLR start "rule__Generator__Group_4__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2313:1: rule__Generator__Group_4__1__Impl : ( ( rule__Generator__WriteTraceModelAssignment_4_1 ) ) ;
    public final void rule__Generator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2317:1: ( ( ( rule__Generator__WriteTraceModelAssignment_4_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2318:1: ( ( rule__Generator__WriteTraceModelAssignment_4_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2318:1: ( ( rule__Generator__WriteTraceModelAssignment_4_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2319:1: ( rule__Generator__WriteTraceModelAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getWriteTraceModelAssignment_4_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2320:1: ( rule__Generator__WriteTraceModelAssignment_4_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2320:2: rule__Generator__WriteTraceModelAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Generator__WriteTraceModelAssignment_4_1_in_rule__Generator__Group_4__1__Impl4789);
            rule__Generator__WriteTraceModelAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getWriteTraceModelAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_4__1__Impl"


    // $ANTLR start "rule__Generator__Group_5__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2334:1: rule__Generator__Group_5__0 : rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1 ;
    public final void rule__Generator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2338:1: ( rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2339:2: rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_5__0__Impl_in_rule__Generator__Group_5__04823);
            rule__Generator__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_5__1_in_rule__Generator__Group_5__04826);
            rule__Generator__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_5__0"


    // $ANTLR start "rule__Generator__Group_5__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2346:1: rule__Generator__Group_5__0__Impl : ( '<-' ) ;
    public final void rule__Generator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2350:1: ( ( '<-' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2351:1: ( '<-' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2351:1: ( '<-' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2352:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getLessThanSignHyphenMinusKeyword_5_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Generator__Group_5__0__Impl4854); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getLessThanSignHyphenMinusKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_5__0__Impl"


    // $ANTLR start "rule__Generator__Group_5__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2365:1: rule__Generator__Group_5__1 : rule__Generator__Group_5__1__Impl rule__Generator__Group_5__2 ;
    public final void rule__Generator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2369:1: ( rule__Generator__Group_5__1__Impl rule__Generator__Group_5__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2370:2: rule__Generator__Group_5__1__Impl rule__Generator__Group_5__2
            {
            pushFollow(FOLLOW_rule__Generator__Group_5__1__Impl_in_rule__Generator__Group_5__14885);
            rule__Generator__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_5__2_in_rule__Generator__Group_5__14888);
            rule__Generator__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_5__1"


    // $ANTLR start "rule__Generator__Group_5__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2377:1: rule__Generator__Group_5__1__Impl : ( ( rule__Generator__ReadTraceModelsAssignment_5_1 ) ) ;
    public final void rule__Generator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2381:1: ( ( ( rule__Generator__ReadTraceModelsAssignment_5_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2382:1: ( ( rule__Generator__ReadTraceModelsAssignment_5_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2382:1: ( ( rule__Generator__ReadTraceModelsAssignment_5_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2383:1: ( rule__Generator__ReadTraceModelsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReadTraceModelsAssignment_5_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2384:1: ( rule__Generator__ReadTraceModelsAssignment_5_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2384:2: rule__Generator__ReadTraceModelsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Generator__ReadTraceModelsAssignment_5_1_in_rule__Generator__Group_5__1__Impl4915);
            rule__Generator__ReadTraceModelsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getReadTraceModelsAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_5__1__Impl"


    // $ANTLR start "rule__Generator__Group_5__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2394:1: rule__Generator__Group_5__2 : rule__Generator__Group_5__2__Impl ;
    public final void rule__Generator__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2398:1: ( rule__Generator__Group_5__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2399:2: rule__Generator__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_5__2__Impl_in_rule__Generator__Group_5__24945);
            rule__Generator__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_5__2"


    // $ANTLR start "rule__Generator__Group_5__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2405:1: rule__Generator__Group_5__2__Impl : ( ( rule__Generator__Group_5_2__0 )* ) ;
    public final void rule__Generator__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2409:1: ( ( ( rule__Generator__Group_5_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2410:1: ( ( rule__Generator__Group_5_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2410:1: ( ( rule__Generator__Group_5_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2411:1: ( rule__Generator__Group_5_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_5_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2412:1: ( rule__Generator__Group_5_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2412:2: rule__Generator__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Generator__Group_5_2__0_in_rule__Generator__Group_5__2__Impl4972);
            	    rule__Generator__Group_5_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGroup_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_5__2__Impl"


    // $ANTLR start "rule__Generator__Group_5_2__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2428:1: rule__Generator__Group_5_2__0 : rule__Generator__Group_5_2__0__Impl rule__Generator__Group_5_2__1 ;
    public final void rule__Generator__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2432:1: ( rule__Generator__Group_5_2__0__Impl rule__Generator__Group_5_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2433:2: rule__Generator__Group_5_2__0__Impl rule__Generator__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_5_2__0__Impl_in_rule__Generator__Group_5_2__05009);
            rule__Generator__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_5_2__1_in_rule__Generator__Group_5_2__05012);
            rule__Generator__Group_5_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_5_2__0"


    // $ANTLR start "rule__Generator__Group_5_2__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2440:1: rule__Generator__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Generator__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2444:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2445:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2445:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2446:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getCommaKeyword_5_2_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Generator__Group_5_2__0__Impl5040); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getCommaKeyword_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_5_2__0__Impl"


    // $ANTLR start "rule__Generator__Group_5_2__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2459:1: rule__Generator__Group_5_2__1 : rule__Generator__Group_5_2__1__Impl ;
    public final void rule__Generator__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2463:1: ( rule__Generator__Group_5_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2464:2: rule__Generator__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_5_2__1__Impl_in_rule__Generator__Group_5_2__15071);
            rule__Generator__Group_5_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_5_2__1"


    // $ANTLR start "rule__Generator__Group_5_2__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2470:1: rule__Generator__Group_5_2__1__Impl : ( ( rule__Generator__ReadTraceModelsAssignment_5_2_1 ) ) ;
    public final void rule__Generator__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2474:1: ( ( ( rule__Generator__ReadTraceModelsAssignment_5_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2475:1: ( ( rule__Generator__ReadTraceModelsAssignment_5_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2475:1: ( ( rule__Generator__ReadTraceModelsAssignment_5_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2476:1: ( rule__Generator__ReadTraceModelsAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReadTraceModelsAssignment_5_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2477:1: ( rule__Generator__ReadTraceModelsAssignment_5_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2477:2: rule__Generator__ReadTraceModelsAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Generator__ReadTraceModelsAssignment_5_2_1_in_rule__Generator__Group_5_2__1__Impl5098);
            rule__Generator__ReadTraceModelsAssignment_5_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getReadTraceModelsAssignment_5_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_5_2__1__Impl"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2491:1: rule__SourceModelNodeSelector__Group_0__0 : rule__SourceModelNodeSelector__Group_0__0__Impl rule__SourceModelNodeSelector__Group_0__1 ;
    public final void rule__SourceModelNodeSelector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2495:1: ( rule__SourceModelNodeSelector__Group_0__0__Impl rule__SourceModelNodeSelector__Group_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2496:2: rule__SourceModelNodeSelector__Group_0__0__Impl rule__SourceModelNodeSelector__Group_0__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__0__Impl_in_rule__SourceModelNodeSelector__Group_0__05132);
            rule__SourceModelNodeSelector__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__1_in_rule__SourceModelNodeSelector__Group_0__05135);
            rule__SourceModelNodeSelector__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0__0"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2503:1: rule__SourceModelNodeSelector__Group_0__0__Impl : ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) ) ;
    public final void rule__SourceModelNodeSelector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2507:1: ( ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2508:1: ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2508:1: ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2509:1: ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceAssignment_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2510:1: ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2510:2: rule__SourceModelNodeSelector__ReferenceAssignment_0_0
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__ReferenceAssignment_0_0_in_rule__SourceModelNodeSelector__Group_0__0__Impl5162);
            rule__SourceModelNodeSelector__ReferenceAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0__0__Impl"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2520:1: rule__SourceModelNodeSelector__Group_0__1 : rule__SourceModelNodeSelector__Group_0__1__Impl rule__SourceModelNodeSelector__Group_0__2 ;
    public final void rule__SourceModelNodeSelector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2524:1: ( rule__SourceModelNodeSelector__Group_0__1__Impl rule__SourceModelNodeSelector__Group_0__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2525:2: rule__SourceModelNodeSelector__Group_0__1__Impl rule__SourceModelNodeSelector__Group_0__2
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__1__Impl_in_rule__SourceModelNodeSelector__Group_0__15192);
            rule__SourceModelNodeSelector__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__2_in_rule__SourceModelNodeSelector__Group_0__15195);
            rule__SourceModelNodeSelector__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0__1"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2532:1: rule__SourceModelNodeSelector__Group_0__1__Impl : ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? ) ;
    public final void rule__SourceModelNodeSelector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2536:1: ( ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2537:1: ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2537:1: ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2538:1: ( rule__SourceModelNodeSelector__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2539:1: ( rule__SourceModelNodeSelector__Group_0_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2539:2: rule__SourceModelNodeSelector__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0_in_rule__SourceModelNodeSelector__Group_0__1__Impl5222);
                    rule__SourceModelNodeSelector__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0__1__Impl"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2549:1: rule__SourceModelNodeSelector__Group_0__2 : rule__SourceModelNodeSelector__Group_0__2__Impl ;
    public final void rule__SourceModelNodeSelector__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2553:1: ( rule__SourceModelNodeSelector__Group_0__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2554:2: rule__SourceModelNodeSelector__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__2__Impl_in_rule__SourceModelNodeSelector__Group_0__25253);
            rule__SourceModelNodeSelector__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0__2"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2560:1: rule__SourceModelNodeSelector__Group_0__2__Impl : ( ( rule__SourceModelNodeSelector__Group_0_2__0 )? ) ;
    public final void rule__SourceModelNodeSelector__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2564:1: ( ( ( rule__SourceModelNodeSelector__Group_0_2__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2565:1: ( ( rule__SourceModelNodeSelector__Group_0_2__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2565:1: ( ( rule__SourceModelNodeSelector__Group_0_2__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2566:1: ( rule__SourceModelNodeSelector__Group_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2567:1: ( rule__SourceModelNodeSelector__Group_0_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2567:2: rule__SourceModelNodeSelector__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_2__0_in_rule__SourceModelNodeSelector__Group_0__2__Impl5280);
                    rule__SourceModelNodeSelector__Group_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0__2__Impl"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2583:1: rule__SourceModelNodeSelector__Group_0_1__0 : rule__SourceModelNodeSelector__Group_0_1__0__Impl rule__SourceModelNodeSelector__Group_0_1__1 ;
    public final void rule__SourceModelNodeSelector__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2587:1: ( rule__SourceModelNodeSelector__Group_0_1__0__Impl rule__SourceModelNodeSelector__Group_0_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2588:2: rule__SourceModelNodeSelector__Group_0_1__0__Impl rule__SourceModelNodeSelector__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0__Impl_in_rule__SourceModelNodeSelector__Group_0_1__05317);
            rule__SourceModelNodeSelector__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1_in_rule__SourceModelNodeSelector__Group_0_1__05320);
            rule__SourceModelNodeSelector__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0_1__0"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2595:1: rule__SourceModelNodeSelector__Group_0_1__0__Impl : ( '[' ) ;
    public final void rule__SourceModelNodeSelector__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2599:1: ( ( '[' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2600:1: ( '[' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2600:1: ( '[' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2601:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getLeftSquareBracketKeyword_0_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__SourceModelNodeSelector__Group_0_1__0__Impl5348); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getLeftSquareBracketKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0_1__0__Impl"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2614:1: rule__SourceModelNodeSelector__Group_0_1__1 : rule__SourceModelNodeSelector__Group_0_1__1__Impl rule__SourceModelNodeSelector__Group_0_1__2 ;
    public final void rule__SourceModelNodeSelector__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2618:1: ( rule__SourceModelNodeSelector__Group_0_1__1__Impl rule__SourceModelNodeSelector__Group_0_1__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2619:2: rule__SourceModelNodeSelector__Group_0_1__1__Impl rule__SourceModelNodeSelector__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1__Impl_in_rule__SourceModelNodeSelector__Group_0_1__15379);
            rule__SourceModelNodeSelector__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__2_in_rule__SourceModelNodeSelector__Group_0_1__15382);
            rule__SourceModelNodeSelector__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0_1__1"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2626:1: rule__SourceModelNodeSelector__Group_0_1__1__Impl : ( ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 ) ) ;
    public final void rule__SourceModelNodeSelector__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2630:1: ( ( ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2631:1: ( ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2631:1: ( ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2632:1: ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getConstraintAssignment_0_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2633:1: ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2633:2: rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1_in_rule__SourceModelNodeSelector__Group_0_1__1__Impl5409);
            rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getConstraintAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0_1__1__Impl"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0_1__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2643:1: rule__SourceModelNodeSelector__Group_0_1__2 : rule__SourceModelNodeSelector__Group_0_1__2__Impl ;
    public final void rule__SourceModelNodeSelector__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2647:1: ( rule__SourceModelNodeSelector__Group_0_1__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2648:2: rule__SourceModelNodeSelector__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__2__Impl_in_rule__SourceModelNodeSelector__Group_0_1__25439);
            rule__SourceModelNodeSelector__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0_1__2"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0_1__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2654:1: rule__SourceModelNodeSelector__Group_0_1__2__Impl : ( ']' ) ;
    public final void rule__SourceModelNodeSelector__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2658:1: ( ( ']' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2659:1: ( ']' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2659:1: ( ']' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2660:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getRightSquareBracketKeyword_0_1_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__SourceModelNodeSelector__Group_0_1__2__Impl5467); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getRightSquareBracketKeyword_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0_1__2__Impl"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0_2__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2679:1: rule__SourceModelNodeSelector__Group_0_2__0 : rule__SourceModelNodeSelector__Group_0_2__0__Impl rule__SourceModelNodeSelector__Group_0_2__1 ;
    public final void rule__SourceModelNodeSelector__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2683:1: ( rule__SourceModelNodeSelector__Group_0_2__0__Impl rule__SourceModelNodeSelector__Group_0_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2684:2: rule__SourceModelNodeSelector__Group_0_2__0__Impl rule__SourceModelNodeSelector__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_2__0__Impl_in_rule__SourceModelNodeSelector__Group_0_2__05504);
            rule__SourceModelNodeSelector__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_2__1_in_rule__SourceModelNodeSelector__Group_0_2__05507);
            rule__SourceModelNodeSelector__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0_2__0"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0_2__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2691:1: rule__SourceModelNodeSelector__Group_0_2__0__Impl : ( '/' ) ;
    public final void rule__SourceModelNodeSelector__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2695:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2696:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2696:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2697:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getSolidusKeyword_0_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__SourceModelNodeSelector__Group_0_2__0__Impl5535); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getSolidusKeyword_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0_2__0__Impl"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0_2__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2710:1: rule__SourceModelNodeSelector__Group_0_2__1 : rule__SourceModelNodeSelector__Group_0_2__1__Impl ;
    public final void rule__SourceModelNodeSelector__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2714:1: ( rule__SourceModelNodeSelector__Group_0_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2715:2: rule__SourceModelNodeSelector__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_2__1__Impl_in_rule__SourceModelNodeSelector__Group_0_2__15566);
            rule__SourceModelNodeSelector__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0_2__1"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0_2__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2721:1: rule__SourceModelNodeSelector__Group_0_2__1__Impl : ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 ) ) ;
    public final void rule__SourceModelNodeSelector__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2725:1: ( ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2726:1: ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2726:1: ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2727:1: ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyAssignment_0_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2728:1: ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2728:2: rule__SourceModelNodeSelector__PropertyAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__PropertyAssignment_0_2_1_in_rule__SourceModelNodeSelector__Group_0_2__1__Impl5593);
            rule__SourceModelNodeSelector__PropertyAssignment_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyAssignment_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_0_2__1__Impl"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2742:1: rule__SourceModelNodeSelector__Group_1__0 : rule__SourceModelNodeSelector__Group_1__0__Impl rule__SourceModelNodeSelector__Group_1__1 ;
    public final void rule__SourceModelNodeSelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2746:1: ( rule__SourceModelNodeSelector__Group_1__0__Impl rule__SourceModelNodeSelector__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2747:2: rule__SourceModelNodeSelector__Group_1__0__Impl rule__SourceModelNodeSelector__Group_1__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__0__Impl_in_rule__SourceModelNodeSelector__Group_1__05627);
            rule__SourceModelNodeSelector__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__1_in_rule__SourceModelNodeSelector__Group_1__05630);
            rule__SourceModelNodeSelector__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_1__0"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2754:1: rule__SourceModelNodeSelector__Group_1__0__Impl : ( () ) ;
    public final void rule__SourceModelNodeSelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2758:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2759:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2759:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2760:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getSourceModelNodeSelectorAction_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2761:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2763:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getSourceModelNodeSelectorAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_1__0__Impl"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2773:1: rule__SourceModelNodeSelector__Group_1__1 : rule__SourceModelNodeSelector__Group_1__1__Impl ;
    public final void rule__SourceModelNodeSelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2777:1: ( rule__SourceModelNodeSelector__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2778:2: rule__SourceModelNodeSelector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__1__Impl_in_rule__SourceModelNodeSelector__Group_1__15688);
            rule__SourceModelNodeSelector__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_1__1"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2784:1: rule__SourceModelNodeSelector__Group_1__1__Impl : ( 'null' ) ;
    public final void rule__SourceModelNodeSelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2788:1: ( ( 'null' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2789:1: ( 'null' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2789:1: ( 'null' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2790:1: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getNullKeyword_1_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__SourceModelNodeSelector__Group_1__1__Impl5716); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getNullKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__Group_1__1__Impl"


    // $ANTLR start "rule__TargetModelNodeType__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2807:1: rule__TargetModelNodeType__Group__0 : rule__TargetModelNodeType__Group__0__Impl rule__TargetModelNodeType__Group__1 ;
    public final void rule__TargetModelNodeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2811:1: ( rule__TargetModelNodeType__Group__0__Impl rule__TargetModelNodeType__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2812:2: rule__TargetModelNodeType__Group__0__Impl rule__TargetModelNodeType__Group__1
            {
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__0__Impl_in_rule__TargetModelNodeType__Group__05751);
            rule__TargetModelNodeType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__1_in_rule__TargetModelNodeType__Group__05754);
            rule__TargetModelNodeType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelNodeType__Group__0"


    // $ANTLR start "rule__TargetModelNodeType__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2819:1: rule__TargetModelNodeType__Group__0__Impl : ( () ) ;
    public final void rule__TargetModelNodeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2823:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2824:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2824:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2825:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getTargetModelNodeTypeAction_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2826:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2828:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelNodeTypeAccess().getTargetModelNodeTypeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelNodeType__Group__0__Impl"


    // $ANTLR start "rule__TargetModelNodeType__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2838:1: rule__TargetModelNodeType__Group__1 : rule__TargetModelNodeType__Group__1__Impl rule__TargetModelNodeType__Group__2 ;
    public final void rule__TargetModelNodeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2842:1: ( rule__TargetModelNodeType__Group__1__Impl rule__TargetModelNodeType__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2843:2: rule__TargetModelNodeType__Group__1__Impl rule__TargetModelNodeType__Group__2
            {
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__1__Impl_in_rule__TargetModelNodeType__Group__15812);
            rule__TargetModelNodeType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__2_in_rule__TargetModelNodeType__Group__15815);
            rule__TargetModelNodeType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelNodeType__Group__1"


    // $ANTLR start "rule__TargetModelNodeType__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2850:1: rule__TargetModelNodeType__Group__1__Impl : ( ( rule__TargetModelNodeType__ReferenceAssignment_1 )? ) ;
    public final void rule__TargetModelNodeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2854:1: ( ( ( rule__TargetModelNodeType__ReferenceAssignment_1 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2855:1: ( ( rule__TargetModelNodeType__ReferenceAssignment_1 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2855:1: ( ( rule__TargetModelNodeType__ReferenceAssignment_1 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2856:1: ( rule__TargetModelNodeType__ReferenceAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2857:1: ( rule__TargetModelNodeType__ReferenceAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2857:2: rule__TargetModelNodeType__ReferenceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TargetModelNodeType__ReferenceAssignment_1_in_rule__TargetModelNodeType__Group__1__Impl5842);
                    rule__TargetModelNodeType__ReferenceAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelNodeTypeAccess().getReferenceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelNodeType__Group__1__Impl"


    // $ANTLR start "rule__TargetModelNodeType__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2867:1: rule__TargetModelNodeType__Group__2 : rule__TargetModelNodeType__Group__2__Impl ;
    public final void rule__TargetModelNodeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2871:1: ( rule__TargetModelNodeType__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2872:2: rule__TargetModelNodeType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__2__Impl_in_rule__TargetModelNodeType__Group__25873);
            rule__TargetModelNodeType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelNodeType__Group__2"


    // $ANTLR start "rule__TargetModelNodeType__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2878:1: rule__TargetModelNodeType__Group__2__Impl : ( ( rule__TargetModelNodeType__MultiplyAssignment_2 )? ) ;
    public final void rule__TargetModelNodeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2882:1: ( ( ( rule__TargetModelNodeType__MultiplyAssignment_2 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2883:1: ( ( rule__TargetModelNodeType__MultiplyAssignment_2 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2883:1: ( ( rule__TargetModelNodeType__MultiplyAssignment_2 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2884:1: ( rule__TargetModelNodeType__MultiplyAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getMultiplyAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2885:1: ( rule__TargetModelNodeType__MultiplyAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2885:2: rule__TargetModelNodeType__MultiplyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TargetModelNodeType__MultiplyAssignment_2_in_rule__TargetModelNodeType__Group__2__Impl5900);
                    rule__TargetModelNodeType__MultiplyAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelNodeTypeAccess().getMultiplyAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelNodeType__Group__2__Impl"


    // $ANTLR start "rule__ModelNodeType__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2901:1: rule__ModelNodeType__Group__0 : rule__ModelNodeType__Group__0__Impl rule__ModelNodeType__Group__1 ;
    public final void rule__ModelNodeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2905:1: ( rule__ModelNodeType__Group__0__Impl rule__ModelNodeType__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2906:2: rule__ModelNodeType__Group__0__Impl rule__ModelNodeType__Group__1
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__0__Impl_in_rule__ModelNodeType__Group__05937);
            rule__ModelNodeType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelNodeType__Group__1_in_rule__ModelNodeType__Group__05940);
            rule__ModelNodeType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group__0"


    // $ANTLR start "rule__ModelNodeType__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2913:1: rule__ModelNodeType__Group__0__Impl : ( ( rule__ModelNodeType__TargetAssignment_0 ) ) ;
    public final void rule__ModelNodeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2917:1: ( ( ( rule__ModelNodeType__TargetAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2918:1: ( ( rule__ModelNodeType__TargetAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2918:1: ( ( rule__ModelNodeType__TargetAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2919:1: ( rule__ModelNodeType__TargetAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTargetAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2920:1: ( rule__ModelNodeType__TargetAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2920:2: rule__ModelNodeType__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__ModelNodeType__TargetAssignment_0_in_rule__ModelNodeType__Group__0__Impl5967);
            rule__ModelNodeType__TargetAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getTargetAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group__0__Impl"


    // $ANTLR start "rule__ModelNodeType__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2930:1: rule__ModelNodeType__Group__1 : rule__ModelNodeType__Group__1__Impl ;
    public final void rule__ModelNodeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2934:1: ( rule__ModelNodeType__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2935:2: rule__ModelNodeType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__1__Impl_in_rule__ModelNodeType__Group__15997);
            rule__ModelNodeType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group__1"


    // $ANTLR start "rule__ModelNodeType__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2941:1: rule__ModelNodeType__Group__1__Impl : ( ( rule__ModelNodeType__Group_1__0 )? ) ;
    public final void rule__ModelNodeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2945:1: ( ( ( rule__ModelNodeType__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2946:1: ( ( rule__ModelNodeType__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2946:1: ( ( rule__ModelNodeType__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2947:1: ( rule__ModelNodeType__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2948:1: ( rule__ModelNodeType__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2948:2: rule__ModelNodeType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ModelNodeType__Group_1__0_in_rule__ModelNodeType__Group__1__Impl6024);
                    rule__ModelNodeType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group__1__Impl"


    // $ANTLR start "rule__ModelNodeType__Group_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2962:1: rule__ModelNodeType__Group_1__0 : rule__ModelNodeType__Group_1__0__Impl rule__ModelNodeType__Group_1__1 ;
    public final void rule__ModelNodeType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2966:1: ( rule__ModelNodeType__Group_1__0__Impl rule__ModelNodeType__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2967:2: rule__ModelNodeType__Group_1__0__Impl rule__ModelNodeType__Group_1__1
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group_1__0__Impl_in_rule__ModelNodeType__Group_1__06059);
            rule__ModelNodeType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelNodeType__Group_1__1_in_rule__ModelNodeType__Group_1__06062);
            rule__ModelNodeType__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group_1__0"


    // $ANTLR start "rule__ModelNodeType__Group_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2974:1: rule__ModelNodeType__Group_1__0__Impl : ( '/' ) ;
    public final void rule__ModelNodeType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2978:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2979:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2979:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2980:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getSolidusKeyword_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__ModelNodeType__Group_1__0__Impl6090); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getSolidusKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group_1__0__Impl"


    // $ANTLR start "rule__ModelNodeType__Group_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2993:1: rule__ModelNodeType__Group_1__1 : rule__ModelNodeType__Group_1__1__Impl ;
    public final void rule__ModelNodeType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2997:1: ( rule__ModelNodeType__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2998:2: rule__ModelNodeType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group_1__1__Impl_in_rule__ModelNodeType__Group_1__16121);
            rule__ModelNodeType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group_1__1"


    // $ANTLR start "rule__ModelNodeType__Group_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3004:1: rule__ModelNodeType__Group_1__1__Impl : ( ( rule__ModelNodeType__PropertyAssignment_1_1 ) ) ;
    public final void rule__ModelNodeType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3008:1: ( ( ( rule__ModelNodeType__PropertyAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3009:1: ( ( rule__ModelNodeType__PropertyAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3009:1: ( ( rule__ModelNodeType__PropertyAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3010:1: ( rule__ModelNodeType__PropertyAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getPropertyAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3011:1: ( rule__ModelNodeType__PropertyAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3011:2: rule__ModelNodeType__PropertyAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ModelNodeType__PropertyAssignment_1_1_in_rule__ModelNodeType__Group_1__1__Impl6148);
            rule__ModelNodeType__PropertyAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getPropertyAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group_1__1__Impl"


    // $ANTLR start "rule__NodeProperty__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3025:1: rule__NodeProperty__Group__0 : rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1 ;
    public final void rule__NodeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3029:1: ( rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3030:2: rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__0__Impl_in_rule__NodeProperty__Group__06182);
            rule__NodeProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group__1_in_rule__NodeProperty__Group__06185);
            rule__NodeProperty__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group__0"


    // $ANTLR start "rule__NodeProperty__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3037:1: rule__NodeProperty__Group__0__Impl : ( ( rule__NodeProperty__PropertyAssignment_0 ) ) ;
    public final void rule__NodeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3041:1: ( ( ( rule__NodeProperty__PropertyAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3042:1: ( ( rule__NodeProperty__PropertyAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3042:1: ( ( rule__NodeProperty__PropertyAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3043:1: ( rule__NodeProperty__PropertyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3044:1: ( rule__NodeProperty__PropertyAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3044:2: rule__NodeProperty__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__NodeProperty__PropertyAssignment_0_in_rule__NodeProperty__Group__0__Impl6212);
            rule__NodeProperty__PropertyAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getPropertyAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group__0__Impl"


    // $ANTLR start "rule__NodeProperty__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3054:1: rule__NodeProperty__Group__1 : rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2 ;
    public final void rule__NodeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3058:1: ( rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3059:2: rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__1__Impl_in_rule__NodeProperty__Group__16242);
            rule__NodeProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group__2_in_rule__NodeProperty__Group__16245);
            rule__NodeProperty__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group__1"


    // $ANTLR start "rule__NodeProperty__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3066:1: rule__NodeProperty__Group__1__Impl : ( ( rule__NodeProperty__Group_1__0 )? ) ;
    public final void rule__NodeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3070:1: ( ( ( rule__NodeProperty__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3071:1: ( ( rule__NodeProperty__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3071:1: ( ( rule__NodeProperty__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3072:1: ( rule__NodeProperty__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3073:1: ( rule__NodeProperty__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3073:2: rule__NodeProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NodeProperty__Group_1__0_in_rule__NodeProperty__Group__1__Impl6272);
                    rule__NodeProperty__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group__1__Impl"


    // $ANTLR start "rule__NodeProperty__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3083:1: rule__NodeProperty__Group__2 : rule__NodeProperty__Group__2__Impl ;
    public final void rule__NodeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3087:1: ( rule__NodeProperty__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3088:2: rule__NodeProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__2__Impl_in_rule__NodeProperty__Group__26303);
            rule__NodeProperty__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group__2"


    // $ANTLR start "rule__NodeProperty__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3094:1: rule__NodeProperty__Group__2__Impl : ( ( rule__NodeProperty__Group_2__0 )? ) ;
    public final void rule__NodeProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3098:1: ( ( ( rule__NodeProperty__Group_2__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3099:1: ( ( rule__NodeProperty__Group_2__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3099:1: ( ( rule__NodeProperty__Group_2__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3100:1: ( rule__NodeProperty__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3101:1: ( rule__NodeProperty__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3101:2: rule__NodeProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NodeProperty__Group_2__0_in_rule__NodeProperty__Group__2__Impl6330);
                    rule__NodeProperty__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group__2__Impl"


    // $ANTLR start "rule__NodeProperty__Group_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3117:1: rule__NodeProperty__Group_1__0 : rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1 ;
    public final void rule__NodeProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3121:1: ( rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3122:2: rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__0__Impl_in_rule__NodeProperty__Group_1__06367);
            rule__NodeProperty__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__1_in_rule__NodeProperty__Group_1__06370);
            rule__NodeProperty__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group_1__0"


    // $ANTLR start "rule__NodeProperty__Group_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3129:1: rule__NodeProperty__Group_1__0__Impl : ( '[' ) ;
    public final void rule__NodeProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3133:1: ( ( '[' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3134:1: ( '[' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3134:1: ( '[' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3135:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__NodeProperty__Group_1__0__Impl6398); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getLeftSquareBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group_1__0__Impl"


    // $ANTLR start "rule__NodeProperty__Group_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3148:1: rule__NodeProperty__Group_1__1 : rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2 ;
    public final void rule__NodeProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3152:1: ( rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3153:2: rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__1__Impl_in_rule__NodeProperty__Group_1__16429);
            rule__NodeProperty__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__2_in_rule__NodeProperty__Group_1__16432);
            rule__NodeProperty__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group_1__1"


    // $ANTLR start "rule__NodeProperty__Group_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3160:1: rule__NodeProperty__Group_1__1__Impl : ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) ) ;
    public final void rule__NodeProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3164:1: ( ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3165:1: ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3165:1: ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3166:1: ( rule__NodeProperty__ConstraintAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getConstraintAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3167:1: ( rule__NodeProperty__ConstraintAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3167:2: rule__NodeProperty__ConstraintAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NodeProperty__ConstraintAssignment_1_1_in_rule__NodeProperty__Group_1__1__Impl6459);
            rule__NodeProperty__ConstraintAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getConstraintAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group_1__1__Impl"


    // $ANTLR start "rule__NodeProperty__Group_1__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3177:1: rule__NodeProperty__Group_1__2 : rule__NodeProperty__Group_1__2__Impl ;
    public final void rule__NodeProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3181:1: ( rule__NodeProperty__Group_1__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3182:2: rule__NodeProperty__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__2__Impl_in_rule__NodeProperty__Group_1__26489);
            rule__NodeProperty__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group_1__2"


    // $ANTLR start "rule__NodeProperty__Group_1__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3188:1: rule__NodeProperty__Group_1__2__Impl : ( ']' ) ;
    public final void rule__NodeProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3192:1: ( ( ']' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3193:1: ( ']' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3193:1: ( ']' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3194:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__NodeProperty__Group_1__2__Impl6517); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getRightSquareBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group_1__2__Impl"


    // $ANTLR start "rule__NodeProperty__Group_2__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3213:1: rule__NodeProperty__Group_2__0 : rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1 ;
    public final void rule__NodeProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3217:1: ( rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3218:2: rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__0__Impl_in_rule__NodeProperty__Group_2__06554);
            rule__NodeProperty__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__1_in_rule__NodeProperty__Group_2__06557);
            rule__NodeProperty__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group_2__0"


    // $ANTLR start "rule__NodeProperty__Group_2__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3225:1: rule__NodeProperty__Group_2__0__Impl : ( '/' ) ;
    public final void rule__NodeProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3229:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3230:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3230:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3231:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSolidusKeyword_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__NodeProperty__Group_2__0__Impl6585); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getSolidusKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group_2__0__Impl"


    // $ANTLR start "rule__NodeProperty__Group_2__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3244:1: rule__NodeProperty__Group_2__1 : rule__NodeProperty__Group_2__1__Impl ;
    public final void rule__NodeProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3248:1: ( rule__NodeProperty__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3249:2: rule__NodeProperty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__1__Impl_in_rule__NodeProperty__Group_2__16616);
            rule__NodeProperty__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group_2__1"


    // $ANTLR start "rule__NodeProperty__Group_2__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3255:1: rule__NodeProperty__Group_2__1__Impl : ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) ) ;
    public final void rule__NodeProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3259:1: ( ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3260:1: ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3260:1: ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3261:1: ( rule__NodeProperty__SubPropertyAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSubPropertyAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3262:1: ( rule__NodeProperty__SubPropertyAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3262:2: rule__NodeProperty__SubPropertyAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NodeProperty__SubPropertyAssignment_2_1_in_rule__NodeProperty__Group_2__1__Impl6643);
            rule__NodeProperty__SubPropertyAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getSubPropertyAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__Group_2__1__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3276:1: rule__ConstraintExpression__Group__0 : rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 ;
    public final void rule__ConstraintExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3280:1: ( rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3281:2: rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__06677);
            rule__ConstraintExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__06680);
            rule__ConstraintExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__0"


    // $ANTLR start "rule__ConstraintExpression__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3288:1: rule__ConstraintExpression__Group__0__Impl : ( ruleCompareExpression ) ;
    public final void rule__ConstraintExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3292:1: ( ( ruleCompareExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3293:1: ( ruleCompareExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3293:1: ( ruleCompareExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3294:1: ruleCompareExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getCompareExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_rule__ConstraintExpression__Group__0__Impl6707);
            ruleCompareExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getCompareExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__0__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3305:1: rule__ConstraintExpression__Group__1 : rule__ConstraintExpression__Group__1__Impl ;
    public final void rule__ConstraintExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3309:1: ( rule__ConstraintExpression__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3310:2: rule__ConstraintExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__16736);
            rule__ConstraintExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__1"


    // $ANTLR start "rule__ConstraintExpression__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3316:1: rule__ConstraintExpression__Group__1__Impl : ( ( rule__ConstraintExpression__Group_1__0 )? ) ;
    public final void rule__ConstraintExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3320:1: ( ( ( rule__ConstraintExpression__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3321:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3321:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3322:1: ( rule__ConstraintExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3323:1: ( rule__ConstraintExpression__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=40 && LA27_0<=41)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3323:2: rule__ConstraintExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl6763);
                    rule__ConstraintExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group__1__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3337:1: rule__ConstraintExpression__Group_1__0 : rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 ;
    public final void rule__ConstraintExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3341:1: ( rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3342:2: rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__06798);
            rule__ConstraintExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__06801);
            rule__ConstraintExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1__0"


    // $ANTLR start "rule__ConstraintExpression__Group_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3349:1: rule__ConstraintExpression__Group_1__0__Impl : ( ( rule__ConstraintExpression__Group_1_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3353:1: ( ( ( rule__ConstraintExpression__Group_1_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3354:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3354:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3355:1: ( rule__ConstraintExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3356:1: ( rule__ConstraintExpression__Group_1_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3356:2: rule__ConstraintExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl6828);
            rule__ConstraintExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3366:1: rule__ConstraintExpression__Group_1__1 : rule__ConstraintExpression__Group_1__1__Impl ;
    public final void rule__ConstraintExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3370:1: ( rule__ConstraintExpression__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3371:2: rule__ConstraintExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__16858);
            rule__ConstraintExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1__1"


    // $ANTLR start "rule__ConstraintExpression__Group_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3377:1: rule__ConstraintExpression__Group_1__1__Impl : ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3381:1: ( ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3382:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3382:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3383:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3384:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3384:2: rule__ConstraintExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl6885);
            rule__ConstraintExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group_1_0__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3398:1: rule__ConstraintExpression__Group_1_0__0 : rule__ConstraintExpression__Group_1_0__0__Impl ;
    public final void rule__ConstraintExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3402:1: ( rule__ConstraintExpression__Group_1_0__0__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3403:2: rule__ConstraintExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__06919);
            rule__ConstraintExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1_0__0"


    // $ANTLR start "rule__ConstraintExpression__Group_1_0__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3409:1: rule__ConstraintExpression__Group_1_0__0__Impl : ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3413:1: ( ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3414:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3414:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3415:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3416:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3416:2: rule__ConstraintExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl6946);
            rule__ConstraintExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getGroup_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group_1_0_0__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3428:1: rule__ConstraintExpression__Group_1_0_0__0 : rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 ;
    public final void rule__ConstraintExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3432:1: ( rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3433:2: rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__06978);
            rule__ConstraintExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__06981);
            rule__ConstraintExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1_0_0__0"


    // $ANTLR start "rule__ConstraintExpression__Group_1_0_0__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3440:1: rule__ConstraintExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3444:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3445:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3445:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3446:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3447:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3449:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__ConstraintExpression__Group_1_0_0__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3459:1: rule__ConstraintExpression__Group_1_0_0__1 : rule__ConstraintExpression__Group_1_0_0__1__Impl ;
    public final void rule__ConstraintExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3463:1: ( rule__ConstraintExpression__Group_1_0_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3464:2: rule__ConstraintExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__17039);
            rule__ConstraintExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1_0_0__1"


    // $ANTLR start "rule__ConstraintExpression__Group_1_0_0__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3470:1: rule__ConstraintExpression__Group_1_0_0__1__Impl : ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3474:1: ( ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3475:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3475:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3476:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3477:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3477:2: rule__ConstraintExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl7066);
            rule__ConstraintExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__CompareExpression__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3491:1: rule__CompareExpression__Group__0 : rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 ;
    public final void rule__CompareExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3495:1: ( rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3496:2: rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__07100);
            rule__CompareExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__07103);
            rule__CompareExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group__0"


    // $ANTLR start "rule__CompareExpression__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3503:1: rule__CompareExpression__Group__0__Impl : ( ruleBasicConstraint ) ;
    public final void rule__CompareExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3507:1: ( ( ruleBasicConstraint ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3508:1: ( ruleBasicConstraint )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3508:1: ( ruleBasicConstraint )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3509:1: ruleBasicConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getBasicConstraintParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__Group__0__Impl7130);
            ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getBasicConstraintParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group__0__Impl"


    // $ANTLR start "rule__CompareExpression__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3520:1: rule__CompareExpression__Group__1 : rule__CompareExpression__Group__1__Impl ;
    public final void rule__CompareExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3524:1: ( rule__CompareExpression__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3525:2: rule__CompareExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__17159);
            rule__CompareExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group__1"


    // $ANTLR start "rule__CompareExpression__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3531:1: rule__CompareExpression__Group__1__Impl : ( ( rule__CompareExpression__Group_1__0 )? ) ;
    public final void rule__CompareExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3535:1: ( ( ( rule__CompareExpression__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3536:1: ( ( rule__CompareExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3536:1: ( ( rule__CompareExpression__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3537:1: ( rule__CompareExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3538:1: ( rule__CompareExpression__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=33 && LA28_0<=34)||(LA28_0>=42 && LA28_0<=46)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3538:2: rule__CompareExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl7186);
                    rule__CompareExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group__1__Impl"


    // $ANTLR start "rule__CompareExpression__Group_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3552:1: rule__CompareExpression__Group_1__0 : rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 ;
    public final void rule__CompareExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3556:1: ( rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3557:2: rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__07221);
            rule__CompareExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__07224);
            rule__CompareExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1__0"


    // $ANTLR start "rule__CompareExpression__Group_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3564:1: rule__CompareExpression__Group_1__0__Impl : ( ( rule__CompareExpression__Group_1_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3568:1: ( ( ( rule__CompareExpression__Group_1_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3569:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3569:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3570:1: ( rule__CompareExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3571:1: ( rule__CompareExpression__Group_1_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3571:2: rule__CompareExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl7251);
            rule__CompareExpression__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1__0__Impl"


    // $ANTLR start "rule__CompareExpression__Group_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3581:1: rule__CompareExpression__Group_1__1 : rule__CompareExpression__Group_1__1__Impl ;
    public final void rule__CompareExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3585:1: ( rule__CompareExpression__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3586:2: rule__CompareExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__17281);
            rule__CompareExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1__1"


    // $ANTLR start "rule__CompareExpression__Group_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3592:1: rule__CompareExpression__Group_1__1__Impl : ( ( rule__CompareExpression__RightAssignment_1_1 ) ) ;
    public final void rule__CompareExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3596:1: ( ( ( rule__CompareExpression__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3597:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3597:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3598:1: ( rule__CompareExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3599:1: ( rule__CompareExpression__RightAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3599:2: rule__CompareExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl7308);
            rule__CompareExpression__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1__1__Impl"


    // $ANTLR start "rule__CompareExpression__Group_1_0__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3613:1: rule__CompareExpression__Group_1_0__0 : rule__CompareExpression__Group_1_0__0__Impl ;
    public final void rule__CompareExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3617:1: ( rule__CompareExpression__Group_1_0__0__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3618:2: rule__CompareExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__07342);
            rule__CompareExpression__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1_0__0"


    // $ANTLR start "rule__CompareExpression__Group_1_0__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3624:1: rule__CompareExpression__Group_1_0__0__Impl : ( ( rule__CompareExpression__Group_1_0_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3628:1: ( ( ( rule__CompareExpression__Group_1_0_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3629:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3629:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3630:1: ( rule__CompareExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3631:1: ( rule__CompareExpression__Group_1_0_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3631:2: rule__CompareExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl7369);
            rule__CompareExpression__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getGroup_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__CompareExpression__Group_1_0_0__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3643:1: rule__CompareExpression__Group_1_0_0__0 : rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 ;
    public final void rule__CompareExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3647:1: ( rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3648:2: rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__07401);
            rule__CompareExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__07404);
            rule__CompareExpression__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1_0_0__0"


    // $ANTLR start "rule__CompareExpression__Group_1_0_0__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3655:1: rule__CompareExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__CompareExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3659:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3660:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3660:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3661:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3662:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3664:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__CompareExpression__Group_1_0_0__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3674:1: rule__CompareExpression__Group_1_0_0__1 : rule__CompareExpression__Group_1_0_0__1__Impl ;
    public final void rule__CompareExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3678:1: ( rule__CompareExpression__Group_1_0_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3679:2: rule__CompareExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__17462);
            rule__CompareExpression__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1_0_0__1"


    // $ANTLR start "rule__CompareExpression__Group_1_0_0__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3685:1: rule__CompareExpression__Group_1_0_0__1__Impl : ( ( rule__CompareExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__CompareExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3689:1: ( ( ( rule__CompareExpression__OperatorAssignment_1_0_0_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3690:1: ( ( rule__CompareExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3690:1: ( ( rule__CompareExpression__OperatorAssignment_1_0_0_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3691:1: ( rule__CompareExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3692:1: ( rule__CompareExpression__OperatorAssignment_1_0_0_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3692:2: rule__CompareExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__OperatorAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl7489);
            rule__CompareExpression__OperatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__ParenthesisConstraint__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3706:1: rule__ParenthesisConstraint__Group__0 : rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 ;
    public final void rule__ParenthesisConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3710:1: ( rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3711:2: rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__07523);
            rule__ParenthesisConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__07526);
            rule__ParenthesisConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisConstraint__Group__0"


    // $ANTLR start "rule__ParenthesisConstraint__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3718:1: rule__ParenthesisConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3722:1: ( ( '(' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3723:1: ( '(' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3723:1: ( '(' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3724:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParenthesisConstraint__Group__0__Impl7554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisConstraint__Group__0__Impl"


    // $ANTLR start "rule__ParenthesisConstraint__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3737:1: rule__ParenthesisConstraint__Group__1 : rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 ;
    public final void rule__ParenthesisConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3741:1: ( rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3742:2: rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__17585);
            rule__ParenthesisConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__17588);
            rule__ParenthesisConstraint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisConstraint__Group__1"


    // $ANTLR start "rule__ParenthesisConstraint__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3749:1: rule__ParenthesisConstraint__Group__1__Impl : ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__ParenthesisConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3753:1: ( ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3754:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3754:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3755:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3756:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3756:2: rule__ParenthesisConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl7615);
            rule__ParenthesisConstraint__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisConstraint__Group__1__Impl"


    // $ANTLR start "rule__ParenthesisConstraint__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3766:1: rule__ParenthesisConstraint__Group__2 : rule__ParenthesisConstraint__Group__2__Impl ;
    public final void rule__ParenthesisConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3770:1: ( rule__ParenthesisConstraint__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3771:2: rule__ParenthesisConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__27645);
            rule__ParenthesisConstraint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisConstraint__Group__2"


    // $ANTLR start "rule__ParenthesisConstraint__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3777:1: rule__ParenthesisConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3781:1: ( ( ')' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3782:1: ( ')' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3782:1: ( ')' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3783:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ParenthesisConstraint__Group__2__Impl7673); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintAccess().getRightParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisConstraint__Group__2__Impl"


    // $ANTLR start "rule__Typeof__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3802:1: rule__Typeof__Group__0 : rule__Typeof__Group__0__Impl rule__Typeof__Group__1 ;
    public final void rule__Typeof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3806:1: ( rule__Typeof__Group__0__Impl rule__Typeof__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3807:2: rule__Typeof__Group__0__Impl rule__Typeof__Group__1
            {
            pushFollow(FOLLOW_rule__Typeof__Group__0__Impl_in_rule__Typeof__Group__07710);
            rule__Typeof__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typeof__Group__1_in_rule__Typeof__Group__07713);
            rule__Typeof__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__Group__0"


    // $ANTLR start "rule__Typeof__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3814:1: rule__Typeof__Group__0__Impl : ( 'typeof' ) ;
    public final void rule__Typeof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3818:1: ( ( 'typeof' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3819:1: ( 'typeof' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3819:1: ( 'typeof' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3820:1: 'typeof'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getTypeofKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Typeof__Group__0__Impl7741); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofAccess().getTypeofKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__Group__0__Impl"


    // $ANTLR start "rule__Typeof__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3833:1: rule__Typeof__Group__1 : rule__Typeof__Group__1__Impl ;
    public final void rule__Typeof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3837:1: ( rule__Typeof__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3838:2: rule__Typeof__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Typeof__Group__1__Impl_in_rule__Typeof__Group__17772);
            rule__Typeof__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__Group__1"


    // $ANTLR start "rule__Typeof__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3844:1: rule__Typeof__Group__1__Impl : ( ( rule__Typeof__TypeAssignment_1 ) ) ;
    public final void rule__Typeof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3848:1: ( ( ( rule__Typeof__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3849:1: ( ( rule__Typeof__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3849:1: ( ( rule__Typeof__TypeAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3850:1: ( rule__Typeof__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3851:1: ( rule__Typeof__TypeAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3851:2: rule__Typeof__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Typeof__TypeAssignment_1_in_rule__Typeof__Group__1__Impl7799);
            rule__Typeof__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__Group__1__Impl"


    // $ANTLR start "rule__TraceModel__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3865:1: rule__TraceModel__Group__0 : rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1 ;
    public final void rule__TraceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3869:1: ( rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3870:2: rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__0__Impl_in_rule__TraceModel__Group__07833);
            rule__TraceModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__1_in_rule__TraceModel__Group__07836);
            rule__TraceModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceModel__Group__0"


    // $ANTLR start "rule__TraceModel__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3877:1: rule__TraceModel__Group__0__Impl : ( ( rule__TraceModel__NameAssignment_0 ) ) ;
    public final void rule__TraceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3881:1: ( ( ( rule__TraceModel__NameAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3882:1: ( ( rule__TraceModel__NameAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3882:1: ( ( rule__TraceModel__NameAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3883:1: ( rule__TraceModel__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNameAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3884:1: ( rule__TraceModel__NameAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3884:2: rule__TraceModel__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TraceModel__NameAssignment_0_in_rule__TraceModel__Group__0__Impl7863);
            rule__TraceModel__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceModel__Group__0__Impl"


    // $ANTLR start "rule__TraceModel__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3894:1: rule__TraceModel__Group__1 : rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2 ;
    public final void rule__TraceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3898:1: ( rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3899:2: rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__1__Impl_in_rule__TraceModel__Group__17893);
            rule__TraceModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__2_in_rule__TraceModel__Group__17896);
            rule__TraceModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceModel__Group__1"


    // $ANTLR start "rule__TraceModel__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3906:1: rule__TraceModel__Group__1__Impl : ( '<' ) ;
    public final void rule__TraceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3910:1: ( ( '<' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3911:1: ( '<' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3911:1: ( '<' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3912:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getLessThanSignKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__TraceModel__Group__1__Impl7924); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelAccess().getLessThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceModel__Group__1__Impl"


    // $ANTLR start "rule__TraceModel__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3925:1: rule__TraceModel__Group__2 : rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3 ;
    public final void rule__TraceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3929:1: ( rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3930:2: rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__2__Impl_in_rule__TraceModel__Group__27955);
            rule__TraceModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__3_in_rule__TraceModel__Group__27958);
            rule__TraceModel__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceModel__Group__2"


    // $ANTLR start "rule__TraceModel__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3937:1: rule__TraceModel__Group__2__Impl : ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) ) ;
    public final void rule__TraceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3941:1: ( ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3942:1: ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3942:1: ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3943:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3943:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3944:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3945:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3945:2: rule__TraceModel__NodeSetRelationsAssignment_2
            {
            pushFollow(FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl7987);
            rule__TraceModel__NodeSetRelationsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }

            }

            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3948:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3949:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3950:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==30) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3950:2: rule__TraceModel__NodeSetRelationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl7999);
            	    rule__TraceModel__NodeSetRelationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceModel__Group__2__Impl"


    // $ANTLR start "rule__TraceModel__Group__3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3961:1: rule__TraceModel__Group__3 : rule__TraceModel__Group__3__Impl ;
    public final void rule__TraceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3965:1: ( rule__TraceModel__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3966:2: rule__TraceModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__3__Impl_in_rule__TraceModel__Group__38032);
            rule__TraceModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceModel__Group__3"


    // $ANTLR start "rule__TraceModel__Group__3__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3972:1: rule__TraceModel__Group__3__Impl : ( '>' ) ;
    public final void rule__TraceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3976:1: ( ( '>' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3977:1: ( '>' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3977:1: ( '>' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3978:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__TraceModel__Group__3__Impl8060); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelAccess().getGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceModel__Group__3__Impl"


    // $ANTLR start "rule__NodeSetRelation__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3999:1: rule__NodeSetRelation__Group__0 : rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1 ;
    public final void rule__NodeSetRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4003:1: ( rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4004:2: rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__0__Impl_in_rule__NodeSetRelation__Group__08099);
            rule__NodeSetRelation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__1_in_rule__NodeSetRelation__Group__08102);
            rule__NodeSetRelation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__0"


    // $ANTLR start "rule__NodeSetRelation__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4011:1: rule__NodeSetRelation__Group__0__Impl : ( '(' ) ;
    public final void rule__NodeSetRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4015:1: ( ( '(' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4016:1: ( '(' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4016:1: ( '(' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4017:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__NodeSetRelation__Group__0__Impl8130); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__0__Impl"


    // $ANTLR start "rule__NodeSetRelation__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4030:1: rule__NodeSetRelation__Group__1 : rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2 ;
    public final void rule__NodeSetRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4034:1: ( rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4035:2: rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__1__Impl_in_rule__NodeSetRelation__Group__18161);
            rule__NodeSetRelation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__2_in_rule__NodeSetRelation__Group__18164);
            rule__NodeSetRelation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__1"


    // $ANTLR start "rule__NodeSetRelation__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4042:1: rule__NodeSetRelation__Group__1__Impl : ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) ) ;
    public final void rule__NodeSetRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4046:1: ( ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4047:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4047:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4048:1: ( rule__NodeSetRelation__SourceNodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4049:1: ( rule__NodeSetRelation__SourceNodesAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4049:2: rule__NodeSetRelation__SourceNodesAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_1_in_rule__NodeSetRelation__Group__1__Impl8191);
            rule__NodeSetRelation__SourceNodesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__1__Impl"


    // $ANTLR start "rule__NodeSetRelation__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4059:1: rule__NodeSetRelation__Group__2 : rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3 ;
    public final void rule__NodeSetRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4063:1: ( rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4064:2: rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__2__Impl_in_rule__NodeSetRelation__Group__28221);
            rule__NodeSetRelation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__3_in_rule__NodeSetRelation__Group__28224);
            rule__NodeSetRelation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__2"


    // $ANTLR start "rule__NodeSetRelation__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4071:1: rule__NodeSetRelation__Group__2__Impl : ( ( rule__NodeSetRelation__Group_2__0 )* ) ;
    public final void rule__NodeSetRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4075:1: ( ( ( rule__NodeSetRelation__Group_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4076:1: ( ( rule__NodeSetRelation__Group_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4076:1: ( ( rule__NodeSetRelation__Group_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4077:1: ( rule__NodeSetRelation__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4078:1: ( rule__NodeSetRelation__Group_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==18) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4078:2: rule__NodeSetRelation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__0_in_rule__NodeSetRelation__Group__2__Impl8251);
            	    rule__NodeSetRelation__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__2__Impl"


    // $ANTLR start "rule__NodeSetRelation__Group__3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4088:1: rule__NodeSetRelation__Group__3 : rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4 ;
    public final void rule__NodeSetRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4092:1: ( rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4093:2: rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__3__Impl_in_rule__NodeSetRelation__Group__38282);
            rule__NodeSetRelation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__4_in_rule__NodeSetRelation__Group__38285);
            rule__NodeSetRelation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__3"


    // $ANTLR start "rule__NodeSetRelation__Group__3__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4100:1: rule__NodeSetRelation__Group__3__Impl : ( ':' ) ;
    public final void rule__NodeSetRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4104:1: ( ( ':' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4105:1: ( ':' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4105:1: ( ':' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4106:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getColonKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__NodeSetRelation__Group__3__Impl8313); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__3__Impl"


    // $ANTLR start "rule__NodeSetRelation__Group__4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4119:1: rule__NodeSetRelation__Group__4 : rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5 ;
    public final void rule__NodeSetRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4123:1: ( rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4124:2: rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__4__Impl_in_rule__NodeSetRelation__Group__48344);
            rule__NodeSetRelation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__5_in_rule__NodeSetRelation__Group__48347);
            rule__NodeSetRelation__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__4"


    // $ANTLR start "rule__NodeSetRelation__Group__4__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4131:1: rule__NodeSetRelation__Group__4__Impl : ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) ) ;
    public final void rule__NodeSetRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4135:1: ( ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4136:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4136:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4137:1: ( rule__NodeSetRelation__TargetNodesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4138:1: ( rule__NodeSetRelation__TargetNodesAssignment_4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4138:2: rule__NodeSetRelation__TargetNodesAssignment_4
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_4_in_rule__NodeSetRelation__Group__4__Impl8374);
            rule__NodeSetRelation__TargetNodesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__4__Impl"


    // $ANTLR start "rule__NodeSetRelation__Group__5"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4148:1: rule__NodeSetRelation__Group__5 : rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6 ;
    public final void rule__NodeSetRelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4152:1: ( rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4153:2: rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__5__Impl_in_rule__NodeSetRelation__Group__58404);
            rule__NodeSetRelation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__6_in_rule__NodeSetRelation__Group__58407);
            rule__NodeSetRelation__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__5"


    // $ANTLR start "rule__NodeSetRelation__Group__5__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4160:1: rule__NodeSetRelation__Group__5__Impl : ( ( rule__NodeSetRelation__Group_5__0 )* ) ;
    public final void rule__NodeSetRelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4164:1: ( ( ( rule__NodeSetRelation__Group_5__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4165:1: ( ( rule__NodeSetRelation__Group_5__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4165:1: ( ( rule__NodeSetRelation__Group_5__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4166:1: ( rule__NodeSetRelation__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4167:1: ( rule__NodeSetRelation__Group_5__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==18) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4167:2: rule__NodeSetRelation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__0_in_rule__NodeSetRelation__Group__5__Impl8434);
            	    rule__NodeSetRelation__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__5__Impl"


    // $ANTLR start "rule__NodeSetRelation__Group__6"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4177:1: rule__NodeSetRelation__Group__6 : rule__NodeSetRelation__Group__6__Impl ;
    public final void rule__NodeSetRelation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4181:1: ( rule__NodeSetRelation__Group__6__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4182:2: rule__NodeSetRelation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__6__Impl_in_rule__NodeSetRelation__Group__68465);
            rule__NodeSetRelation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__6"


    // $ANTLR start "rule__NodeSetRelation__Group__6__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4188:1: rule__NodeSetRelation__Group__6__Impl : ( ')' ) ;
    public final void rule__NodeSetRelation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4192:1: ( ( ')' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4193:1: ( ')' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4193:1: ( ')' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4194:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,31,FOLLOW_31_in_rule__NodeSetRelation__Group__6__Impl8493); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group__6__Impl"


    // $ANTLR start "rule__NodeSetRelation__Group_2__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4221:1: rule__NodeSetRelation__Group_2__0 : rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1 ;
    public final void rule__NodeSetRelation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4225:1: ( rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4226:2: rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__0__Impl_in_rule__NodeSetRelation__Group_2__08538);
            rule__NodeSetRelation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__1_in_rule__NodeSetRelation__Group_2__08541);
            rule__NodeSetRelation__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group_2__0"


    // $ANTLR start "rule__NodeSetRelation__Group_2__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4233:1: rule__NodeSetRelation__Group_2__0__Impl : ( ',' ) ;
    public final void rule__NodeSetRelation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4237:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4238:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4238:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4239:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getCommaKeyword_2_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__NodeSetRelation__Group_2__0__Impl8569); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group_2__0__Impl"


    // $ANTLR start "rule__NodeSetRelation__Group_2__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4252:1: rule__NodeSetRelation__Group_2__1 : rule__NodeSetRelation__Group_2__1__Impl ;
    public final void rule__NodeSetRelation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4256:1: ( rule__NodeSetRelation__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4257:2: rule__NodeSetRelation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__1__Impl_in_rule__NodeSetRelation__Group_2__18600);
            rule__NodeSetRelation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group_2__1"


    // $ANTLR start "rule__NodeSetRelation__Group_2__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4263:1: rule__NodeSetRelation__Group_2__1__Impl : ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) ) ;
    public final void rule__NodeSetRelation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4267:1: ( ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4268:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4268:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4269:1: ( rule__NodeSetRelation__SourceNodesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4270:1: ( rule__NodeSetRelation__SourceNodesAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4270:2: rule__NodeSetRelation__SourceNodesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_2_1_in_rule__NodeSetRelation__Group_2__1__Impl8627);
            rule__NodeSetRelation__SourceNodesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group_2__1__Impl"


    // $ANTLR start "rule__NodeSetRelation__Group_5__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4284:1: rule__NodeSetRelation__Group_5__0 : rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1 ;
    public final void rule__NodeSetRelation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4288:1: ( rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4289:2: rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__0__Impl_in_rule__NodeSetRelation__Group_5__08661);
            rule__NodeSetRelation__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__1_in_rule__NodeSetRelation__Group_5__08664);
            rule__NodeSetRelation__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group_5__0"


    // $ANTLR start "rule__NodeSetRelation__Group_5__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4296:1: rule__NodeSetRelation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__NodeSetRelation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4300:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4301:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4301:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4302:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getCommaKeyword_5_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__NodeSetRelation__Group_5__0__Impl8692); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getCommaKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group_5__0__Impl"


    // $ANTLR start "rule__NodeSetRelation__Group_5__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4315:1: rule__NodeSetRelation__Group_5__1 : rule__NodeSetRelation__Group_5__1__Impl ;
    public final void rule__NodeSetRelation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4319:1: ( rule__NodeSetRelation__Group_5__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4320:2: rule__NodeSetRelation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__1__Impl_in_rule__NodeSetRelation__Group_5__18723);
            rule__NodeSetRelation__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group_5__1"


    // $ANTLR start "rule__NodeSetRelation__Group_5__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4326:1: rule__NodeSetRelation__Group_5__1__Impl : ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) ) ;
    public final void rule__NodeSetRelation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4330:1: ( ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4331:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4331:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4332:1: ( rule__NodeSetRelation__TargetNodesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_5_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4333:1: ( rule__NodeSetRelation__TargetNodesAssignment_5_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4333:2: rule__NodeSetRelation__TargetNodesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_5_1_in_rule__NodeSetRelation__Group_5__1__Impl8750);
            rule__NodeSetRelation__TargetNodesAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__Group_5__1__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4347:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4351:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4352:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__08784);
            rule__ArrayLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__08787);
            rule__ArrayLiteral__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__0"


    // $ANTLR start "rule__ArrayLiteral__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4359:1: rule__ArrayLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4363:1: ( ( '{' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4364:1: ( '{' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4364:1: ( '{' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4365:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__ArrayLiteral__Group__0__Impl8815); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__0__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4378:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4382:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4383:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__18846);
            rule__ArrayLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__18849);
            rule__ArrayLiteral__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__1"


    // $ANTLR start "rule__ArrayLiteral__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4390:1: rule__ArrayLiteral__Group__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4394:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4395:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4395:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4396:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4397:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4397:2: rule__ArrayLiteral__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl8876);
            rule__ArrayLiteral__LiteralsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__1__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4407:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4411:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4412:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__28906);
            rule__ArrayLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__28909);
            rule__ArrayLiteral__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__2"


    // $ANTLR start "rule__ArrayLiteral__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4419:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__Group_2__0 )* ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4423:1: ( ( ( rule__ArrayLiteral__Group_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4424:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4424:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4425:1: ( rule__ArrayLiteral__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4426:1: ( rule__ArrayLiteral__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==18) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4426:2: rule__ArrayLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl8936);
            	    rule__ArrayLiteral__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__2__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group__3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4436:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4440:1: ( rule__ArrayLiteral__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4441:2: rule__ArrayLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__38967);
            rule__ArrayLiteral__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__3"


    // $ANTLR start "rule__ArrayLiteral__Group__3__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4447:1: rule__ArrayLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4451:1: ( ( '}' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4452:1: ( '}' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4452:1: ( '}' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4453:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,36,FOLLOW_36_in_rule__ArrayLiteral__Group__3__Impl8995); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group__3__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group_2__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4474:1: rule__ArrayLiteral__Group_2__0 : rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 ;
    public final void rule__ArrayLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4478:1: ( rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4479:2: rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__09034);
            rule__ArrayLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__09037);
            rule__ArrayLiteral__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_2__0"


    // $ANTLR start "rule__ArrayLiteral__Group_2__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4486:1: rule__ArrayLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4490:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4491:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4491:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4492:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__ArrayLiteral__Group_2__0__Impl9065); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayLiteral__Group_2__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4505:1: rule__ArrayLiteral__Group_2__1 : rule__ArrayLiteral__Group_2__1__Impl ;
    public final void rule__ArrayLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4509:1: ( rule__ArrayLiteral__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4510:2: rule__ArrayLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__19096);
            rule__ArrayLiteral__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_2__1"


    // $ANTLR start "rule__ArrayLiteral__Group_2__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4516:1: rule__ArrayLiteral__Group_2__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) ;
    public final void rule__ArrayLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4520:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4521:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4521:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4522:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4523:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4523:2: rule__ArrayLiteral__LiteralsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl9123);
            rule__ArrayLiteral__LiteralsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4537:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4541:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4542:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__09157);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__09160);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4549:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4553:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4554:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4554:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4555:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl9187); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4566:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4570:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4571:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19216);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4577:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4581:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4582:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4582:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4583:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4584:1: ( rule__QualifiedName__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==37) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4584:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9243);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4598:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4602:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4603:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09278);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09281);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4610:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4614:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4615:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4615:1: ( ( '.' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4616:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4617:1: ( '.' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4618:2: '.'
            {
            match(input,37,FOLLOW_37_in_rule__QualifiedName__Group_1__0__Impl9310); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4629:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4633:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4634:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19342);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4640:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4644:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4645:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4645:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4646:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9369); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4664:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4668:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4669:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4669:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4670:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_19409);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__ImportsAssignment_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4679:1: rule__Model__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4683:1: ( ( ruleImport ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4684:1: ( ruleImport )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4684:1: ( ruleImport )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4685:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_29440);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_2"


    // $ANTLR start "rule__Model__RegisteredPackagesAssignment_3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4694:1: rule__Model__RegisteredPackagesAssignment_3 : ( ruleRegisteredPackage ) ;
    public final void rule__Model__RegisteredPackagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4698:1: ( ( ruleRegisteredPackage ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4699:1: ( ruleRegisteredPackage )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4699:1: ( ruleRegisteredPackage )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4700:1: ruleRegisteredPackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRegisteredPackagesRegisteredPackageParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_rule__Model__RegisteredPackagesAssignment_39471);
            ruleRegisteredPackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRegisteredPackagesRegisteredPackageParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RegisteredPackagesAssignment_3"


    // $ANTLR start "rule__Model__MetamodelsAssignment_4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4709:1: rule__Model__MetamodelsAssignment_4 : ( ruleMetamodelSequence ) ;
    public final void rule__Model__MetamodelsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4713:1: ( ( ruleMetamodelSequence ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4714:1: ( ruleMetamodelSequence )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4714:1: ( ruleMetamodelSequence )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4715:1: ruleMetamodelSequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetamodelsMetamodelSequenceParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodelSequence_in_rule__Model__MetamodelsAssignment_49502);
            ruleMetamodelSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getMetamodelsMetamodelSequenceParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MetamodelsAssignment_4"


    // $ANTLR start "rule__Model__ConnectionsAssignment_5"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4724:1: rule__Model__ConnectionsAssignment_5 : ( ruleConnection ) ;
    public final void rule__Model__ConnectionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4728:1: ( ( ruleConnection ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4729:1: ( ruleConnection )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4729:1: ( ruleConnection )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4730:1: ruleConnection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getConnectionsConnectionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleConnection_in_rule__Model__ConnectionsAssignment_59533);
            ruleConnection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getConnectionsConnectionParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConnectionsAssignment_5"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4739:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4743:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4744:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4744:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4745:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_19564);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__MetamodelSequence__TypeAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4754:1: rule__MetamodelSequence__TypeAssignment_1 : ( ruleModelNodeType ) ;
    public final void rule__MetamodelSequence__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4758:1: ( ( ruleModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4759:1: ( ruleModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4759:1: ( ruleModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4760:1: ruleModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getTypeModelNodeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleModelNodeType_in_rule__MetamodelSequence__TypeAssignment_19595);
            ruleModelNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getTypeModelNodeTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__TypeAssignment_1"


    // $ANTLR start "rule__MetamodelSequence__MetamodelsAssignment_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4769:1: rule__MetamodelSequence__MetamodelsAssignment_2 : ( ruleMetamodel ) ;
    public final void rule__MetamodelSequence__MetamodelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4773:1: ( ( ruleMetamodel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4774:1: ( ruleMetamodel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4774:1: ( ruleMetamodel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4775:1: ruleMetamodel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_29626);
            ruleMetamodel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__MetamodelsAssignment_2"


    // $ANTLR start "rule__MetamodelSequence__MetamodelsAssignment_3_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4784:1: rule__MetamodelSequence__MetamodelsAssignment_3_1 : ( ruleMetamodel ) ;
    public final void rule__MetamodelSequence__MetamodelsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4788:1: ( ( ruleMetamodel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4789:1: ( ruleMetamodel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4789:1: ( ruleMetamodel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4790:1: ruleMetamodel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_3_19657);
            ruleMetamodel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetamodelSequence__MetamodelsAssignment_3_1"


    // $ANTLR start "rule__Metamodel__NameAssignment"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4799:1: rule__Metamodel__NameAssignment : ( RULE_ID ) ;
    public final void rule__Metamodel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4803:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4804:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4804:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4805:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment9688); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metamodel__NameAssignment"


    // $ANTLR start "rule__RegisteredPackage__NameAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4814:1: rule__RegisteredPackage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RegisteredPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4818:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4819:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4819:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4820:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_19719); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__NameAssignment_1"


    // $ANTLR start "rule__RegisteredPackage__ImportedNamespaceAssignment_2_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4829:1: rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegisteredPackage__ImportedNamespaceAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4833:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4834:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4834:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4835:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceJvmTypeCrossReference_2_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4836:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4837:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceJvmTypeQualifiedNameParserRuleCall_2_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RegisteredPackage__ImportedNamespaceAssignment_2_09754);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceJvmTypeQualifiedNameParserRuleCall_2_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceJvmTypeCrossReference_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__ImportedNamespaceAssignment_2_0"


    // $ANTLR start "rule__RegisteredPackage__IsTextAssignment_2_1_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4848:1: rule__RegisteredPackage__IsTextAssignment_2_1_0 : ( ( 'text' ) ) ;
    public final void rule__RegisteredPackage__IsTextAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4852:1: ( ( ( 'text' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4853:1: ( ( 'text' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4853:1: ( ( 'text' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4854:1: ( 'text' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getIsTextTextKeyword_2_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4855:1: ( 'text' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4856:1: 'text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getIsTextTextKeyword_2_1_0_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__RegisteredPackage__IsTextAssignment_2_1_09794); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getIsTextTextKeyword_2_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getIsTextTextKeyword_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__IsTextAssignment_2_1_0"


    // $ANTLR start "rule__RegisteredPackage__ExtensionAssignment_2_1_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4871:1: rule__RegisteredPackage__ExtensionAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__RegisteredPackage__ExtensionAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4875:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4876:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4876:1: ( RULE_STRING )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4877:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getExtensionSTRINGTerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RegisteredPackage__ExtensionAssignment_2_1_19833); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getExtensionSTRINGTerminalRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__ExtensionAssignment_2_1_1"


    // $ANTLR start "rule__Weaver__WeaverAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4886:1: rule__Weaver__WeaverAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Weaver__WeaverAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4890:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4891:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4891:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4892:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getWeaverJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4893:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4894:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getWeaverJvmTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Weaver__WeaverAssignment_19868); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getWeaverJvmTypeIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getWeaverJvmTypeCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__WeaverAssignment_1"


    // $ANTLR start "rule__Weaver__SourceModelAssignment_2_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4905:1: rule__Weaver__SourceModelAssignment_2_0 : ( ruleSourceModelNodeSelector ) ;
    public final void rule__Weaver__SourceModelAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4909:1: ( ( ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4910:1: ( ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4910:1: ( ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4911:1: ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_rule__Weaver__SourceModelAssignment_2_09903);
            ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__SourceModelAssignment_2_0"


    // $ANTLR start "rule__Weaver__AspectModelAssignment_3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4920:1: rule__Weaver__AspectModelAssignment_3 : ( ruleAspectModel ) ;
    public final void rule__Weaver__AspectModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4924:1: ( ( ruleAspectModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4925:1: ( ruleAspectModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4925:1: ( ruleAspectModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4926:1: ruleAspectModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getAspectModelAspectModelParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAspectModel_in_rule__Weaver__AspectModelAssignment_39934);
            ruleAspectModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getAspectModelAspectModelParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__AspectModelAssignment_3"


    // $ANTLR start "rule__Weaver__TargetModelAssignment_4_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4935:1: rule__Weaver__TargetModelAssignment_4_1 : ( ruleTargetModelNodeType ) ;
    public final void rule__Weaver__TargetModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4939:1: ( ( ruleTargetModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4940:1: ( ruleTargetModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4940:1: ( ruleTargetModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4941:1: ruleTargetModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getTargetModelTargetModelNodeTypeParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_rule__Weaver__TargetModelAssignment_4_19965);
            ruleTargetModelNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getTargetModelTargetModelNodeTypeParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__TargetModelAssignment_4_1"


    // $ANTLR start "rule__Generator__GeneratorAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4950:1: rule__Generator__GeneratorAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generator__GeneratorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4954:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4955:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4955:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4956:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGeneratorJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4957:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4958:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGeneratorJvmTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generator__GeneratorAssignment_110000); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGeneratorJvmTypeIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGeneratorJvmTypeCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__GeneratorAssignment_1"


    // $ANTLR start "rule__Generator__SourceModelAssignment_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4969:1: rule__Generator__SourceModelAssignment_2 : ( ruleSourceModelNodeSelector ) ;
    public final void rule__Generator__SourceModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4973:1: ( ( ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4974:1: ( ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4974:1: ( ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4975:1: ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceModelAssignment_210035);
            ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__SourceModelAssignment_2"


    // $ANTLR start "rule__Generator__TargetModelAssignment_3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4984:1: rule__Generator__TargetModelAssignment_3 : ( ruleTargetModelNodeType ) ;
    public final void rule__Generator__TargetModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4988:1: ( ( ruleTargetModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4989:1: ( ruleTargetModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4989:1: ( ruleTargetModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4990:1: ruleTargetModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetModelTargetModelNodeTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_rule__Generator__TargetModelAssignment_310066);
            ruleTargetModelNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getTargetModelTargetModelNodeTypeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__TargetModelAssignment_3"


    // $ANTLR start "rule__Generator__WriteTraceModelAssignment_4_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4999:1: rule__Generator__WriteTraceModelAssignment_4_1 : ( ruleTraceModel ) ;
    public final void rule__Generator__WriteTraceModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5003:1: ( ( ruleTraceModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5004:1: ( ruleTraceModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5004:1: ( ruleTraceModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5005:1: ruleTraceModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getWriteTraceModelTraceModelParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleTraceModel_in_rule__Generator__WriteTraceModelAssignment_4_110097);
            ruleTraceModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getWriteTraceModelTraceModelParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__WriteTraceModelAssignment_4_1"


    // $ANTLR start "rule__Generator__ReadTraceModelsAssignment_5_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5014:1: rule__Generator__ReadTraceModelsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generator__ReadTraceModelsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5018:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5019:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5019:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5020:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelCrossReference_5_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5021:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5022:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generator__ReadTraceModelsAssignment_5_110132); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelIDTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelCrossReference_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__ReadTraceModelsAssignment_5_1"


    // $ANTLR start "rule__Generator__ReadTraceModelsAssignment_5_2_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5033:1: rule__Generator__ReadTraceModelsAssignment_5_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generator__ReadTraceModelsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5037:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5038:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5038:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5039:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelCrossReference_5_2_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5040:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5041:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelIDTerminalRuleCall_5_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generator__ReadTraceModelsAssignment_5_2_110171); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelIDTerminalRuleCall_5_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelCrossReference_5_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__ReadTraceModelsAssignment_5_2_1"


    // $ANTLR start "rule__SourceModelNodeSelector__ReferenceAssignment_0_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5052:1: rule__SourceModelNodeSelector__ReferenceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__SourceModelNodeSelector__ReferenceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5056:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5057:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5057:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5058:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceMetamodelCrossReference_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5059:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5060:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceMetamodelIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SourceModelNodeSelector__ReferenceAssignment_0_010210); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceMetamodelIDTerminalRuleCall_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceMetamodelCrossReference_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__ReferenceAssignment_0_0"


    // $ANTLR start "rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5071:1: rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5075:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5076:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5076:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5077:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getConstraintConstraintExpressionParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__SourceModelNodeSelector__ConstraintAssignment_0_1_110245);
            ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getConstraintConstraintExpressionParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1"


    // $ANTLR start "rule__SourceModelNodeSelector__PropertyAssignment_0_2_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5086:1: rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 : ( ruleNodeProperty ) ;
    public final void rule__SourceModelNodeSelector__PropertyAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5090:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5091:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5091:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5092:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyNodePropertyParserRuleCall_0_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__SourceModelNodeSelector__PropertyAssignment_0_2_110276);
            ruleNodeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyNodePropertyParserRuleCall_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__PropertyAssignment_0_2_1"


    // $ANTLR start "rule__TargetModelNodeType__ReferenceAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5101:1: rule__TargetModelNodeType__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelNodeType__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5105:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5106:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5106:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5107:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getReferenceMetamodelCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5108:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5109:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getReferenceMetamodelIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TargetModelNodeType__ReferenceAssignment_110311); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelNodeTypeAccess().getReferenceMetamodelIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelNodeTypeAccess().getReferenceMetamodelCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelNodeType__ReferenceAssignment_1"


    // $ANTLR start "rule__TargetModelNodeType__MultiplyAssignment_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5120:1: rule__TargetModelNodeType__MultiplyAssignment_2 : ( ( '*' ) ) ;
    public final void rule__TargetModelNodeType__MultiplyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5124:1: ( ( ( '*' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5125:1: ( ( '*' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5125:1: ( ( '*' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5126:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getMultiplyAsteriskKeyword_2_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5127:1: ( '*' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5128:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getMultiplyAsteriskKeyword_2_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__TargetModelNodeType__MultiplyAssignment_210351); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelNodeTypeAccess().getMultiplyAsteriskKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelNodeTypeAccess().getMultiplyAsteriskKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModelNodeType__MultiplyAssignment_2"


    // $ANTLR start "rule__ModelNodeType__TargetAssignment_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5143:1: rule__ModelNodeType__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ModelNodeType__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5147:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5148:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5148:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5149:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTargetRegisteredPackageCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5150:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5151:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTargetRegisteredPackageIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModelNodeType__TargetAssignment_010394); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getTargetRegisteredPackageIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getTargetRegisteredPackageCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__TargetAssignment_0"


    // $ANTLR start "rule__ModelNodeType__PropertyAssignment_1_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5162:1: rule__ModelNodeType__PropertyAssignment_1_1 : ( ruleNodeProperty ) ;
    public final void rule__ModelNodeType__PropertyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5166:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5167:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5167:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5168:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getPropertyNodePropertyParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__ModelNodeType__PropertyAssignment_1_110429);
            ruleNodeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getPropertyNodePropertyParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__PropertyAssignment_1_1"


    // $ANTLR start "rule__NodeProperty__PropertyAssignment_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5177:1: rule__NodeProperty__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NodeProperty__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5181:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5182:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5182:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5183:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyJvmMemberCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5184:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5185:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyJvmMemberIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeProperty__PropertyAssignment_010464); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getPropertyJvmMemberIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getPropertyJvmMemberCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__PropertyAssignment_0"


    // $ANTLR start "rule__NodeProperty__ConstraintAssignment_1_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5196:1: rule__NodeProperty__ConstraintAssignment_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__NodeProperty__ConstraintAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5200:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5201:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5201:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5202:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getConstraintConstraintExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__NodeProperty__ConstraintAssignment_1_110499);
            ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getConstraintConstraintExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__ConstraintAssignment_1_1"


    // $ANTLR start "rule__NodeProperty__SubPropertyAssignment_2_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5211:1: rule__NodeProperty__SubPropertyAssignment_2_1 : ( ruleNodeProperty ) ;
    public final void rule__NodeProperty__SubPropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5215:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5216:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5216:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5217:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSubPropertyNodePropertyParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__NodeProperty__SubPropertyAssignment_2_110530);
            ruleNodeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getSubPropertyNodePropertyParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeProperty__SubPropertyAssignment_2_1"


    // $ANTLR start "rule__ConstraintExpression__OperatorAssignment_1_0_0_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5226:1: rule__ConstraintExpression__OperatorAssignment_1_0_0_1 : ( ruleLogicOperator ) ;
    public final void rule__ConstraintExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5230:1: ( ( ruleLogicOperator ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5231:1: ( ruleLogicOperator )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5231:1: ( ruleLogicOperator )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5232:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_110561);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorParserRuleCall_1_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__ConstraintExpression__RightAssignment_1_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5241:1: rule__ConstraintExpression__RightAssignment_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__ConstraintExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5245:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5246:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5246:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5247:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightConstraintExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__ConstraintExpression__RightAssignment_1_110592);
            ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getRightConstraintExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintExpression__RightAssignment_1_1"


    // $ANTLR start "rule__CompareExpression__OperatorAssignment_1_0_0_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5256:1: rule__CompareExpression__OperatorAssignment_1_0_0_1 : ( ruleComparator ) ;
    public final void rule__CompareExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5260:1: ( ( ruleComparator ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5261:1: ( ruleComparator )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5261:1: ( ruleComparator )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5262:1: ruleComparator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getOperatorComparatorParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleComparator_in_rule__CompareExpression__OperatorAssignment_1_0_0_110623);
            ruleComparator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getOperatorComparatorParserRuleCall_1_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__OperatorAssignment_1_0_0_1"


    // $ANTLR start "rule__CompareExpression__RightAssignment_1_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5271:1: rule__CompareExpression__RightAssignment_1_1 : ( ruleBasicConstraint ) ;
    public final void rule__CompareExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5275:1: ( ( ruleBasicConstraint ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5276:1: ( ruleBasicConstraint )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5276:1: ( ruleBasicConstraint )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5277:1: ruleBasicConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightBasicConstraintParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__RightAssignment_1_110654);
            ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getRightBasicConstraintParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExpression__RightAssignment_1_1"


    // $ANTLR start "rule__ParenthesisConstraint__ConstraintAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5286:1: rule__ParenthesisConstraint__ConstraintAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__ParenthesisConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5290:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5291:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5291:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5292:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_110685);
            ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisConstraint__ConstraintAssignment_1"


    // $ANTLR start "rule__Typeof__TypeAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5301:1: rule__Typeof__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Typeof__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5305:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5306:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5306:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5307:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getTypeJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5308:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5309:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getTypeJvmTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Typeof__TypeAssignment_110720); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofAccess().getTypeJvmTypeIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofAccess().getTypeJvmTypeCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__TypeAssignment_1"


    // $ANTLR start "rule__TraceModel__NameAssignment_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5320:1: rule__TraceModel__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TraceModel__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5324:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5325:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5325:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5326:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TraceModel__NameAssignment_010755); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelAccess().getNameIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceModel__NameAssignment_0"


    // $ANTLR start "rule__TraceModel__NodeSetRelationsAssignment_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5335:1: rule__TraceModel__NodeSetRelationsAssignment_2 : ( ruleNodeSetRelation ) ;
    public final void rule__TraceModel__NodeSetRelationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5339:1: ( ( ruleNodeSetRelation ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5340:1: ( ruleNodeSetRelation )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5340:1: ( ruleNodeSetRelation )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5341:1: ruleNodeSetRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsNodeSetRelationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNodeSetRelation_in_rule__TraceModel__NodeSetRelationsAssignment_210786);
            ruleNodeSetRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelAccess().getNodeSetRelationsNodeSetRelationParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceModel__NodeSetRelationsAssignment_2"


    // $ANTLR start "rule__NodeSetRelation__SourceNodesAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5350:1: rule__NodeSetRelation__SourceNodesAssignment_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__SourceNodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5354:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5355:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5355:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5356:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_110817);
            ruleNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__SourceNodesAssignment_1"


    // $ANTLR start "rule__NodeSetRelation__SourceNodesAssignment_2_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5365:1: rule__NodeSetRelation__SourceNodesAssignment_2_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__SourceNodesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5369:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5370:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5370:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5371:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_2_110848);
            ruleNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__SourceNodesAssignment_2_1"


    // $ANTLR start "rule__NodeSetRelation__TargetNodesAssignment_4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5380:1: rule__NodeSetRelation__TargetNodesAssignment_4 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__TargetNodesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5384:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5385:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5385:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5386:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_410879);
            ruleNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__TargetNodesAssignment_4"


    // $ANTLR start "rule__NodeSetRelation__TargetNodesAssignment_5_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5395:1: rule__NodeSetRelation__TargetNodesAssignment_5_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__TargetNodesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5399:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5400:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5400:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5401:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_5_110910);
            ruleNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeSetRelation__TargetNodesAssignment_5_1"


    // $ANTLR start "rule__NodeType__TypeAssignment"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5410:1: rule__NodeType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NodeType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5414:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5415:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5415:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5416:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getTypeJvmTypeCrossReference_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5417:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5418:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getTypeJvmTypeIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeType__TypeAssignment10945); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeTypeAccess().getTypeJvmTypeIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeTypeAccess().getTypeJvmTypeCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__TypeAssignment"


    // $ANTLR start "rule__ArrayLiteral__LiteralsAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5429:1: rule__ArrayLiteral__LiteralsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5433:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5434:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5434:1: ( ruleLiteral )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5435:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_110980);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__LiteralsAssignment_1"


    // $ANTLR start "rule__ArrayLiteral__LiteralsAssignment_2_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5444:1: rule__ArrayLiteral__LiteralsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5448:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5449:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5449:1: ( ruleLiteral )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5450:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_111011);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayLiteral__LiteralsAssignment_2_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5459:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5463:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5464:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5464:1: ( RULE_STRING )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5465:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment11042); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__IntLiteral__ValueAssignment"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5474:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5478:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5479:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5479:1: ( RULE_INT )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5480:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment11073); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValueAssignment"


    // $ANTLR start "rule__FloatLiteral__ValueAssignment"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5489:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5493:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5494:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5494:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5495:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment11104); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FloatLiteral__ValueAssignment"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5504:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5508:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5509:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5509:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5510:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment11135); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"


    // $ANTLR start "rule__LogicOperator__ANDAssignment_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5519:1: rule__LogicOperator__ANDAssignment_0 : ( ( '&' ) ) ;
    public final void rule__LogicOperator__ANDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5523:1: ( ( ( '&' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5524:1: ( ( '&' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5524:1: ( ( '&' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5525:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getANDAmpersandKeyword_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5526:1: ( '&' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5527:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getANDAmpersandKeyword_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__LogicOperator__ANDAssignment_011171); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getANDAmpersandKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getANDAmpersandKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__ANDAssignment_0"


    // $ANTLR start "rule__LogicOperator__ORAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5542:1: rule__LogicOperator__ORAssignment_1 : ( ( '|' ) ) ;
    public final void rule__LogicOperator__ORAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5546:1: ( ( ( '|' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5547:1: ( ( '|' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5547:1: ( ( '|' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5548:1: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getORVerticalLineKeyword_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5549:1: ( '|' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5550:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getORVerticalLineKeyword_1_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__LogicOperator__ORAssignment_111215); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getORVerticalLineKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getORVerticalLineKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__ORAssignment_1"


    // $ANTLR start "rule__Comparator__EQAssignment_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5565:1: rule__Comparator__EQAssignment_0 : ( ( '==' ) ) ;
    public final void rule__Comparator__EQAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5569:1: ( ( ( '==' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5570:1: ( ( '==' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5570:1: ( ( '==' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5571:1: ( '==' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getEQEqualsSignEqualsSignKeyword_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5572:1: ( '==' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5573:1: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getEQEqualsSignEqualsSignKeyword_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Comparator__EQAssignment_011259); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getEQEqualsSignEqualsSignKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getEQEqualsSignEqualsSignKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__EQAssignment_0"


    // $ANTLR start "rule__Comparator__NEAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5588:1: rule__Comparator__NEAssignment_1 : ( ( '!=' ) ) ;
    public final void rule__Comparator__NEAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5592:1: ( ( ( '!=' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5593:1: ( ( '!=' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5593:1: ( ( '!=' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5594:1: ( '!=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getNEExclamationMarkEqualsSignKeyword_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5595:1: ( '!=' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5596:1: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getNEExclamationMarkEqualsSignKeyword_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__Comparator__NEAssignment_111303); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getNEExclamationMarkEqualsSignKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getNEExclamationMarkEqualsSignKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__NEAssignment_1"


    // $ANTLR start "rule__Comparator__GRAssignment_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5611:1: rule__Comparator__GRAssignment_2 : ( ( '>' ) ) ;
    public final void rule__Comparator__GRAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5615:1: ( ( ( '>' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5616:1: ( ( '>' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5616:1: ( ( '>' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5617:1: ( '>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getGRGreaterThanSignKeyword_2_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5618:1: ( '>' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5619:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getGRGreaterThanSignKeyword_2_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Comparator__GRAssignment_211347); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getGRGreaterThanSignKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getGRGreaterThanSignKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__GRAssignment_2"


    // $ANTLR start "rule__Comparator__LWAssignment_3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5634:1: rule__Comparator__LWAssignment_3 : ( ( '<' ) ) ;
    public final void rule__Comparator__LWAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5638:1: ( ( ( '<' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5639:1: ( ( '<' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5639:1: ( ( '<' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5640:1: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getLWLessThanSignKeyword_3_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5641:1: ( '<' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5642:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getLWLessThanSignKeyword_3_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Comparator__LWAssignment_311391); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getLWLessThanSignKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getLWLessThanSignKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__LWAssignment_3"


    // $ANTLR start "rule__Comparator__GEAssignment_4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5657:1: rule__Comparator__GEAssignment_4 : ( ( '>=' ) ) ;
    public final void rule__Comparator__GEAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5661:1: ( ( ( '>=' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5662:1: ( ( '>=' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5662:1: ( ( '>=' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5663:1: ( '>=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getGEGreaterThanSignEqualsSignKeyword_4_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5664:1: ( '>=' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5665:1: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getGEGreaterThanSignEqualsSignKeyword_4_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Comparator__GEAssignment_411435); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getGEGreaterThanSignEqualsSignKeyword_4_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getGEGreaterThanSignEqualsSignKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__GEAssignment_4"


    // $ANTLR start "rule__Comparator__LEAssignment_5"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5680:1: rule__Comparator__LEAssignment_5 : ( ( '<=' ) ) ;
    public final void rule__Comparator__LEAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5684:1: ( ( ( '<=' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5685:1: ( ( '<=' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5685:1: ( ( '<=' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5686:1: ( '<=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getLELessThanSignEqualsSignKeyword_5_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5687:1: ( '<=' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5688:1: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getLELessThanSignEqualsSignKeyword_5_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Comparator__LEAssignment_511479); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getLELessThanSignEqualsSignKeyword_5_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getLELessThanSignEqualsSignKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__LEAssignment_5"


    // $ANTLR start "rule__Comparator__LIKEAssignment_6"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5703:1: rule__Comparator__LIKEAssignment_6 : ( ( '~' ) ) ;
    public final void rule__Comparator__LIKEAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5707:1: ( ( ( '~' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5708:1: ( ( '~' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5708:1: ( ( '~' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5709:1: ( '~' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getLIKETildeKeyword_6_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5710:1: ( '~' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5711:1: '~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getLIKETildeKeyword_6_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Comparator__LIKEAssignment_611523); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getLIKETildeKeyword_6_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorAccess().getLIKETildeKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__LIKEAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelSequence_in_entryRuleMetamodelSequence187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelSequence194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__0_in_ruleMetamodelSequence220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_entryRuleMetamodel247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodel254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__NameAssignment_in_ruleMetamodel280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisteredPackage314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__0_in_ruleRegisteredPackage340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnection374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Alternatives_in_ruleConnection400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaver_in_entryRuleWeaver427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeaver434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__0_in_ruleWeaver460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectModel_in_entryRuleAspectModel487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspectModel494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectModel__Alternatives_in_ruleAspectModel520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_entryRuleGenerator547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerator554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__0_in_ruleGenerator580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_entryRuleSourceModelNodeSelector607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceModelNodeSelector614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Alternatives_in_ruleSourceModelNodeSelector640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_entryRuleTargetModelNodeType667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetModelNodeType674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__0_in_ruleTargetModelNodeType700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodeType_in_entryRuleModelNodeType727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelNodeType734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__0_in_ruleModelNodeType760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_entryRuleNodeProperty787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeProperty794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__0_in_ruleNodeProperty820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintExpression854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0_in_ruleConstraintExpression880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_entryRuleBasicConstraint967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicConstraint974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicConstraint__Alternatives_in_ruleBasicConstraint1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisConstraint1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__0_in_ruleParenthesisConstraint1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperand1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operand__Alternatives_in_ruleOperand1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeof_in_entryRuleTypeof1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeof1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typeof__Group__0_in_ruleTypeof1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModel_in_entryRuleTraceModel1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraceModel1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__0_in_ruleTraceModel1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSetRelation_in_entryRuleNodeSetRelation1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeSetRelation1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__0_in_ruleNodeSetRelation1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_entryRuleNodeType1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeType1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__TypeAssignment_in_ruleNodeType1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_entryRuleLogicOperator1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicOperator1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_entryRuleComparator1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparator1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__Alternatives_in_ruleComparator1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__ImportedNamespaceAssignment_2_0_in_rule__RegisteredPackage__Alternatives_21938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group_2_1__0_in_rule__RegisteredPackage__Alternatives_21956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_rule__Connection__Alternatives1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaver_in_rule__Connection__Alternatives2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__SourceModelAssignment_2_0_in_rule__Weaver__Alternatives_22038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Weaver__Alternatives_22057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectModel__Group_0__0_in_rule__AspectModel__Alternatives2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_rule__AspectModel__Alternatives2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__0_in_rule__SourceModelNodeSelector__Alternatives2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__0_in_rule__SourceModelNodeSelector__Alternatives2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_rule__BasicConstraint__Alternatives2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_rule__BasicConstraint__Alternatives2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Operand__Alternatives2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__Operand__Alternatives2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeof_in_rule__Operand__Alternatives2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOperator__ANDAssignment_0_in_rule__LogicOperator__Alternatives2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOperator__ORAssignment_1_in_rule__LogicOperator__Alternatives2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__EQAssignment_0_in_rule__Comparator__Alternatives2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__NEAssignment_1_in_rule__Comparator__Alternatives2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__GRAssignment_2_in_rule__Comparator__Alternatives2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__LWAssignment_3_in_rule__Comparator__Alternatives2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__GEAssignment_4_in_rule__Comparator__Alternatives2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__LEAssignment_5_in_rule__Comparator__Alternatives2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__LIKEAssignment_6_in_rule__Comparator__Alternatives2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group__0__Impl2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12659 = new BitSet(new long[]{0x00000000009B0000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22719 = new BitSet(new long[]{0x00000000009B0000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl2749 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32780 = new BitSet(new long[]{0x00000000009B0000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RegisteredPackagesAssignment_3_in_rule__Model__Group__3__Impl2810 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42841 = new BitSet(new long[]{0x00000000009B0000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelsAssignment_4_in_rule__Model__Group__4__Impl2871 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ConnectionsAssignment_5_in_rule__Model__Group__5__Impl2929 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Import__Group__0__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__0__Impl_in_rule__MetamodelSequence__Group__03095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__1_in_rule__MetamodelSequence__Group__03098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MetamodelSequence__Group__0__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__1__Impl_in_rule__MetamodelSequence__Group__13157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__2_in_rule__MetamodelSequence__Group__13160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__TypeAssignment_1_in_rule__MetamodelSequence__Group__1__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__2__Impl_in_rule__MetamodelSequence__Group__23217 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__3_in_rule__MetamodelSequence__Group__23220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__MetamodelsAssignment_2_in_rule__MetamodelSequence__Group__2__Impl3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__3__Impl_in_rule__MetamodelSequence__Group__33277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group_3__0_in_rule__MetamodelSequence__Group__3__Impl3304 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group_3__0__Impl_in_rule__MetamodelSequence__Group_3__03343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group_3__1_in_rule__MetamodelSequence__Group_3__03346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MetamodelSequence__Group_3__0__Impl3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group_3__1__Impl_in_rule__MetamodelSequence__Group_3__13405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__MetamodelsAssignment_3_1_in_rule__MetamodelSequence__Group_3__1__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__0__Impl_in_rule__RegisteredPackage__Group__03466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__1_in_rule__RegisteredPackage__Group__03469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RegisteredPackage__Group__0__Impl3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__1__Impl_in_rule__RegisteredPackage__Group__13528 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__2_in_rule__RegisteredPackage__Group__13531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__NameAssignment_1_in_rule__RegisteredPackage__Group__1__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__2__Impl_in_rule__RegisteredPackage__Group__23588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Alternatives_2_in_rule__RegisteredPackage__Group__2__Impl3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group_2_1__0__Impl_in_rule__RegisteredPackage__Group_2_1__03651 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group_2_1__1_in_rule__RegisteredPackage__Group_2_1__03654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__IsTextAssignment_2_1_0_in_rule__RegisteredPackage__Group_2_1__0__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group_2_1__1__Impl_in_rule__RegisteredPackage__Group_2_1__13711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__ExtensionAssignment_2_1_1_in_rule__RegisteredPackage__Group_2_1__1__Impl3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__0__Impl_in_rule__Weaver__Group__03772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Weaver__Group__1_in_rule__Weaver__Group__03775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Weaver__Group__0__Impl3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__1__Impl_in_rule__Weaver__Group__13834 = new BitSet(new long[]{0x0000000020004010L});
    public static final BitSet FOLLOW_rule__Weaver__Group__2_in_rule__Weaver__Group__13837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__WeaverAssignment_1_in_rule__Weaver__Group__1__Impl3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__2__Impl_in_rule__Weaver__Group__23894 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Weaver__Group__3_in_rule__Weaver__Group__23897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Alternatives_2_in_rule__Weaver__Group__2__Impl3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__3__Impl_in_rule__Weaver__Group__33954 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Weaver__Group__4_in_rule__Weaver__Group__33957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__AspectModelAssignment_3_in_rule__Weaver__Group__3__Impl3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__4__Impl_in_rule__Weaver__Group__44014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__0_in_rule__Weaver__Group__4__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__0__Impl_in_rule__Weaver__Group_4__04082 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__1_in_rule__Weaver__Group_4__04085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Weaver__Group_4__0__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__1__Impl_in_rule__Weaver__Group_4__14144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__TargetModelAssignment_4_1_in_rule__Weaver__Group_4__1__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectModel__Group_0__0__Impl_in_rule__AspectModel__Group_0__04205 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__AspectModel__Group_0__1_in_rule__AspectModel__Group_0__04208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AspectModel__Group_0__0__Impl4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectModel__Group_0__1__Impl_in_rule__AspectModel__Group_0__14267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_rule__AspectModel__Group_0__1__Impl4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__0__Impl_in_rule__Generator__Group__04327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__1_in_rule__Generator__Group__04330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Generator__Group__0__Impl4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__1__Impl_in_rule__Generator__Group__14389 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__2_in_rule__Generator__Group__14392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__GeneratorAssignment_1_in_rule__Generator__Group__1__Impl4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__2__Impl_in_rule__Generator__Group__24449 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__3_in_rule__Generator__Group__24452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceModelAssignment_2_in_rule__Generator__Group__2__Impl4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__3__Impl_in_rule__Generator__Group__34509 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__4_in_rule__Generator__Group__34512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__TargetModelAssignment_3_in_rule__Generator__Group__3__Impl4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__4__Impl_in_rule__Generator__Group__44569 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__5_in_rule__Generator__Group__44572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_4__0_in_rule__Generator__Group__4__Impl4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__5__Impl_in_rule__Generator__Group__54630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__0_in_rule__Generator__Group__5__Impl4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_4__0__Impl_in_rule__Generator__Group_4__04700 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_4__1_in_rule__Generator__Group_4__04703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Generator__Group_4__0__Impl4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_4__1__Impl_in_rule__Generator__Group_4__14762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__WriteTraceModelAssignment_4_1_in_rule__Generator__Group_4__1__Impl4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__0__Impl_in_rule__Generator__Group_5__04823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__1_in_rule__Generator__Group_5__04826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Generator__Group_5__0__Impl4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__1__Impl_in_rule__Generator__Group_5__14885 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__2_in_rule__Generator__Group_5__14888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__ReadTraceModelsAssignment_5_1_in_rule__Generator__Group_5__1__Impl4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__2__Impl_in_rule__Generator__Group_5__24945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5_2__0_in_rule__Generator__Group_5__2__Impl4972 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5_2__0__Impl_in_rule__Generator__Group_5_2__05009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_5_2__1_in_rule__Generator__Group_5_2__05012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Generator__Group_5_2__0__Impl5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5_2__1__Impl_in_rule__Generator__Group_5_2__15071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__ReadTraceModelsAssignment_5_2_1_in_rule__Generator__Group_5_2__1__Impl5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__0__Impl_in_rule__SourceModelNodeSelector__Group_0__05132 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__1_in_rule__SourceModelNodeSelector__Group_0__05135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__ReferenceAssignment_0_0_in_rule__SourceModelNodeSelector__Group_0__0__Impl5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__1__Impl_in_rule__SourceModelNodeSelector__Group_0__15192 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__2_in_rule__SourceModelNodeSelector__Group_0__15195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0_in_rule__SourceModelNodeSelector__Group_0__1__Impl5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__2__Impl_in_rule__SourceModelNodeSelector__Group_0__25253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_2__0_in_rule__SourceModelNodeSelector__Group_0__2__Impl5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0__Impl_in_rule__SourceModelNodeSelector__Group_0_1__05317 = new BitSet(new long[]{0x00000009400001F0L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1_in_rule__SourceModelNodeSelector__Group_0_1__05320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SourceModelNodeSelector__Group_0_1__0__Impl5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1__Impl_in_rule__SourceModelNodeSelector__Group_0_1__15379 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__2_in_rule__SourceModelNodeSelector__Group_0_1__15382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1_in_rule__SourceModelNodeSelector__Group_0_1__1__Impl5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__2__Impl_in_rule__SourceModelNodeSelector__Group_0_1__25439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SourceModelNodeSelector__Group_0_1__2__Impl5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_2__0__Impl_in_rule__SourceModelNodeSelector__Group_0_2__05504 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_2__1_in_rule__SourceModelNodeSelector__Group_0_2__05507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SourceModelNodeSelector__Group_0_2__0__Impl5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_2__1__Impl_in_rule__SourceModelNodeSelector__Group_0_2__15566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__PropertyAssignment_0_2_1_in_rule__SourceModelNodeSelector__Group_0_2__1__Impl5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__0__Impl_in_rule__SourceModelNodeSelector__Group_1__05627 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__1_in_rule__SourceModelNodeSelector__Group_1__05630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__1__Impl_in_rule__SourceModelNodeSelector__Group_1__15688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SourceModelNodeSelector__Group_1__1__Impl5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__0__Impl_in_rule__TargetModelNodeType__Group__05751 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__1_in_rule__TargetModelNodeType__Group__05754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__1__Impl_in_rule__TargetModelNodeType__Group__15812 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__2_in_rule__TargetModelNodeType__Group__15815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__ReferenceAssignment_1_in_rule__TargetModelNodeType__Group__1__Impl5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__2__Impl_in_rule__TargetModelNodeType__Group__25873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__MultiplyAssignment_2_in_rule__TargetModelNodeType__Group__2__Impl5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__0__Impl_in_rule__ModelNodeType__Group__05937 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__1_in_rule__ModelNodeType__Group__05940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__TargetAssignment_0_in_rule__ModelNodeType__Group__0__Impl5967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__1__Impl_in_rule__ModelNodeType__Group__15997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_1__0_in_rule__ModelNodeType__Group__1__Impl6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_1__0__Impl_in_rule__ModelNodeType__Group_1__06059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_1__1_in_rule__ModelNodeType__Group_1__06062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ModelNodeType__Group_1__0__Impl6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_1__1__Impl_in_rule__ModelNodeType__Group_1__16121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__PropertyAssignment_1_1_in_rule__ModelNodeType__Group_1__1__Impl6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__0__Impl_in_rule__NodeProperty__Group__06182 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__1_in_rule__NodeProperty__Group__06185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__PropertyAssignment_0_in_rule__NodeProperty__Group__0__Impl6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__1__Impl_in_rule__NodeProperty__Group__16242 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__2_in_rule__NodeProperty__Group__16245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__0_in_rule__NodeProperty__Group__1__Impl6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__2__Impl_in_rule__NodeProperty__Group__26303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__0_in_rule__NodeProperty__Group__2__Impl6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__0__Impl_in_rule__NodeProperty__Group_1__06367 = new BitSet(new long[]{0x00000009400001F0L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__1_in_rule__NodeProperty__Group_1__06370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__NodeProperty__Group_1__0__Impl6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__1__Impl_in_rule__NodeProperty__Group_1__16429 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__2_in_rule__NodeProperty__Group_1__16432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__ConstraintAssignment_1_1_in_rule__NodeProperty__Group_1__1__Impl6459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__2__Impl_in_rule__NodeProperty__Group_1__26489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NodeProperty__Group_1__2__Impl6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__0__Impl_in_rule__NodeProperty__Group_2__06554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__1_in_rule__NodeProperty__Group_2__06557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NodeProperty__Group_2__0__Impl6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__1__Impl_in_rule__NodeProperty__Group_2__16616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__SubPropertyAssignment_2_1_in_rule__NodeProperty__Group_2__1__Impl6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__06677 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__06680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_rule__ConstraintExpression__Group__0__Impl6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__16736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl6763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__06798 = new BitSet(new long[]{0x00000009400001F0L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__06801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl6828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__16858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__06919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__06978 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__06981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__17039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__07100 = new BitSet(new long[]{0x00007C0600000000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__07103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__Group__0__Impl7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__17159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl7186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__07221 = new BitSet(new long[]{0x00000009400001F0L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__07224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__17281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl7308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__07342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl7369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__07401 = new BitSet(new long[]{0x00007C0600000000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__07404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__17462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__OperatorAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl7489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__07523 = new BitSet(new long[]{0x00000009400001F0L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__07526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParenthesisConstraint__Group__0__Impl7554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__17585 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__17588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__27645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParenthesisConstraint__Group__2__Impl7673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typeof__Group__0__Impl_in_rule__Typeof__Group__07710 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Typeof__Group__1_in_rule__Typeof__Group__07713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Typeof__Group__0__Impl7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typeof__Group__1__Impl_in_rule__Typeof__Group__17772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typeof__TypeAssignment_1_in_rule__Typeof__Group__1__Impl7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__0__Impl_in_rule__TraceModel__Group__07833 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__1_in_rule__TraceModel__Group__07836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NameAssignment_0_in_rule__TraceModel__Group__0__Impl7863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__1__Impl_in_rule__TraceModel__Group__17893 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__2_in_rule__TraceModel__Group__17896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TraceModel__Group__1__Impl7924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__2__Impl_in_rule__TraceModel__Group__27955 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__3_in_rule__TraceModel__Group__27958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl7987 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl7999 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__3__Impl_in_rule__TraceModel__Group__38032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TraceModel__Group__3__Impl8060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__0__Impl_in_rule__NodeSetRelation__Group__08099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__1_in_rule__NodeSetRelation__Group__08102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NodeSetRelation__Group__0__Impl8130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__1__Impl_in_rule__NodeSetRelation__Group__18161 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__2_in_rule__NodeSetRelation__Group__18164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_1_in_rule__NodeSetRelation__Group__1__Impl8191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__2__Impl_in_rule__NodeSetRelation__Group__28221 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__3_in_rule__NodeSetRelation__Group__28224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__0_in_rule__NodeSetRelation__Group__2__Impl8251 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__3__Impl_in_rule__NodeSetRelation__Group__38282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__4_in_rule__NodeSetRelation__Group__38285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__NodeSetRelation__Group__3__Impl8313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__4__Impl_in_rule__NodeSetRelation__Group__48344 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__5_in_rule__NodeSetRelation__Group__48347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_4_in_rule__NodeSetRelation__Group__4__Impl8374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__5__Impl_in_rule__NodeSetRelation__Group__58404 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__6_in_rule__NodeSetRelation__Group__58407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__0_in_rule__NodeSetRelation__Group__5__Impl8434 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__6__Impl_in_rule__NodeSetRelation__Group__68465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__NodeSetRelation__Group__6__Impl8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__0__Impl_in_rule__NodeSetRelation__Group_2__08538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__1_in_rule__NodeSetRelation__Group_2__08541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NodeSetRelation__Group_2__0__Impl8569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__1__Impl_in_rule__NodeSetRelation__Group_2__18600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_2_1_in_rule__NodeSetRelation__Group_2__1__Impl8627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__0__Impl_in_rule__NodeSetRelation__Group_5__08661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__1_in_rule__NodeSetRelation__Group_5__08664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NodeSetRelation__Group_5__0__Impl8692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__1__Impl_in_rule__NodeSetRelation__Group_5__18723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_5_1_in_rule__NodeSetRelation__Group_5__1__Impl8750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__08784 = new BitSet(new long[]{0x00000008000001E0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__08787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ArrayLiteral__Group__0__Impl8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__18846 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__18849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl8876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__28906 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__28909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl8936 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__38967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ArrayLiteral__Group__3__Impl8995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__09034 = new BitSet(new long[]{0x00000008000001E0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__09037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ArrayLiteral__Group_2__0__Impl9065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__19096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl9123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__09157 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__09160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl9187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9243 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__QualifiedName__Group_1__0__Impl9310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_19409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_29440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_rule__Model__RegisteredPackagesAssignment_39471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelSequence_in_rule__Model__MetamodelsAssignment_49502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_rule__Model__ConnectionsAssignment_59533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_19564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodeType_in_rule__MetamodelSequence__TypeAssignment_19595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_29626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_3_19657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment9688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_19719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RegisteredPackage__ImportedNamespaceAssignment_2_09754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RegisteredPackage__IsTextAssignment_2_1_09794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RegisteredPackage__ExtensionAssignment_2_1_19833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Weaver__WeaverAssignment_19868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_rule__Weaver__SourceModelAssignment_2_09903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectModel_in_rule__Weaver__AspectModelAssignment_39934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_rule__Weaver__TargetModelAssignment_4_19965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generator__GeneratorAssignment_110000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceModelAssignment_210035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_rule__Generator__TargetModelAssignment_310066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModel_in_rule__Generator__WriteTraceModelAssignment_4_110097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generator__ReadTraceModelsAssignment_5_110132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generator__ReadTraceModelsAssignment_5_2_110171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SourceModelNodeSelector__ReferenceAssignment_0_010210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__SourceModelNodeSelector__ConstraintAssignment_0_1_110245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__SourceModelNodeSelector__PropertyAssignment_0_2_110276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TargetModelNodeType__ReferenceAssignment_110311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TargetModelNodeType__MultiplyAssignment_210351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModelNodeType__TargetAssignment_010394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__ModelNodeType__PropertyAssignment_1_110429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeProperty__PropertyAssignment_010464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__NodeProperty__ConstraintAssignment_1_110499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__NodeProperty__SubPropertyAssignment_2_110530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_110561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__ConstraintExpression__RightAssignment_1_110592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_rule__CompareExpression__OperatorAssignment_1_0_0_110623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__RightAssignment_1_110654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_110685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Typeof__TypeAssignment_110720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TraceModel__NameAssignment_010755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSetRelation_in_rule__TraceModel__NodeSetRelationsAssignment_210786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_110817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_2_110848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_410879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_5_110910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeType__TypeAssignment10945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_110980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_111011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment11042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment11073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment11104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment11135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__LogicOperator__ANDAssignment_011171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__LogicOperator__ORAssignment_111215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Comparator__EQAssignment_011259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Comparator__NEAssignment_111303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Comparator__GRAssignment_211347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Comparator__LWAssignment_311391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Comparator__GEAssignment_411435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Comparator__LEAssignment_511479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Comparator__LIKEAssignment_611523 = new BitSet(new long[]{0x0000000000000002L});

}