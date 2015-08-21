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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'link'", "'in'", "'out'", "'io'", "'&'", "'|'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'~'", "'package'", "'import'", "'model'", "','", "'register'", "'weave'", "'=>'", "':'", "'generate'", "'('", "')'", "'->'", "'<-'", "'['", "']'", "'/'", "'null'", "'!'", "'typeof'", "'use'", "'{'", "'}'", "'.'", "'text'", "'[]'"
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


    // $ANTLR start "entryRuleProcessor"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:201:1: entryRuleProcessor : ruleProcessor EOF ;
    public final void entryRuleProcessor() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:202:1: ( ruleProcessor EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:203:1: ruleProcessor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorRule()); 
            }
            pushFollow(FOLLOW_ruleProcessor_in_entryRuleProcessor367);
            ruleProcessor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessor374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProcessor"


    // $ANTLR start "ruleProcessor"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:210:1: ruleProcessor : ( ( rule__Processor__Alternatives ) ) ;
    public final void ruleProcessor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:214:2: ( ( ( rule__Processor__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:215:1: ( ( rule__Processor__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:215:1: ( ( rule__Processor__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:216:1: ( rule__Processor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProcessorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:217:1: ( rule__Processor__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:217:2: rule__Processor__Alternatives
            {
            pushFollow(FOLLOW_rule__Processor__Alternatives_in_ruleProcessor400);
            rule__Processor__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProcessorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleProcessor"


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


    // $ANTLR start "entryRuleNegation"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:509:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:510:1: ( ruleNegation EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:511:1: ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation1027);
            ruleNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation1034); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:518:1: ruleNegation : ( ( rule__Negation__Group__0 ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:522:2: ( ( ( rule__Negation__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:523:1: ( ( rule__Negation__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:523:1: ( ( rule__Negation__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:524:1: ( rule__Negation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:525:1: ( rule__Negation__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:525:2: rule__Negation__Group__0
            {
            pushFollow(FOLLOW_rule__Negation__Group__0_in_ruleNegation1060);
            rule__Negation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getGroup()); 
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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleParenthesisConstraint"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:537:1: entryRuleParenthesisConstraint : ruleParenthesisConstraint EOF ;
    public final void entryRuleParenthesisConstraint() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:538:1: ( ruleParenthesisConstraint EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:539:1: ruleParenthesisConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint1087);
            ruleParenthesisConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisConstraint1094); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:546:1: ruleParenthesisConstraint : ( ( rule__ParenthesisConstraint__Group__0 ) ) ;
    public final void ruleParenthesisConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:550:2: ( ( ( rule__ParenthesisConstraint__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:551:1: ( ( rule__ParenthesisConstraint__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:551:1: ( ( rule__ParenthesisConstraint__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:552:1: ( rule__ParenthesisConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:553:1: ( rule__ParenthesisConstraint__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:553:2: rule__ParenthesisConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__0_in_ruleParenthesisConstraint1120);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:565:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:566:1: ( ruleOperand EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:567:1: ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_ruleOperand_in_entryRuleOperand1147);
            ruleOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperand1154); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:574:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:578:2: ( ( ( rule__Operand__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:579:1: ( ( rule__Operand__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:579:1: ( ( rule__Operand__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:580:1: ( rule__Operand__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:581:1: ( rule__Operand__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:581:2: rule__Operand__Alternatives
            {
            pushFollow(FOLLOW_rule__Operand__Alternatives_in_ruleOperand1180);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:593:1: entryRuleTypeof : ruleTypeof EOF ;
    public final void entryRuleTypeof() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:594:1: ( ruleTypeof EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:595:1: ruleTypeof EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofRule()); 
            }
            pushFollow(FOLLOW_ruleTypeof_in_entryRuleTypeof1207);
            ruleTypeof();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeof1214); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:602:1: ruleTypeof : ( ( rule__Typeof__Group__0 ) ) ;
    public final void ruleTypeof() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:606:2: ( ( ( rule__Typeof__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:607:1: ( ( rule__Typeof__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:607:1: ( ( rule__Typeof__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:608:1: ( rule__Typeof__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:609:1: ( rule__Typeof__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:609:2: rule__Typeof__Group__0
            {
            pushFollow(FOLLOW_rule__Typeof__Group__0_in_ruleTypeof1240);
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


    // $ANTLR start "entryRuleTargetTraceModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:621:1: entryRuleTargetTraceModel : ruleTargetTraceModel EOF ;
    public final void entryRuleTargetTraceModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:622:1: ( ruleTargetTraceModel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:623:1: ruleTargetTraceModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetTraceModelRule()); 
            }
            pushFollow(FOLLOW_ruleTargetTraceModel_in_entryRuleTargetTraceModel1267);
            ruleTargetTraceModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetTraceModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetTraceModel1274); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTargetTraceModel"


    // $ANTLR start "ruleTargetTraceModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:630:1: ruleTargetTraceModel : ( ( rule__TargetTraceModel__Alternatives ) ) ;
    public final void ruleTargetTraceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:634:2: ( ( ( rule__TargetTraceModel__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:635:1: ( ( rule__TargetTraceModel__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:635:1: ( ( rule__TargetTraceModel__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:636:1: ( rule__TargetTraceModel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetTraceModelAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:637:1: ( rule__TargetTraceModel__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:637:2: rule__TargetTraceModel__Alternatives
            {
            pushFollow(FOLLOW_rule__TargetTraceModel__Alternatives_in_ruleTargetTraceModel1300);
            rule__TargetTraceModel__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetTraceModelAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTargetTraceModel"


    // $ANTLR start "entryRuleTraceModelReference"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:649:1: entryRuleTraceModelReference : ruleTraceModelReference EOF ;
    public final void entryRuleTraceModelReference() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:650:1: ( ruleTraceModelReference EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:651:1: ruleTraceModelReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTraceModelReference_in_entryRuleTraceModelReference1327);
            ruleTraceModelReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraceModelReference1334); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTraceModelReference"


    // $ANTLR start "ruleTraceModelReference"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:658:1: ruleTraceModelReference : ( ( rule__TraceModelReference__TraceModelAssignment ) ) ;
    public final void ruleTraceModelReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:662:2: ( ( ( rule__TraceModelReference__TraceModelAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:663:1: ( ( rule__TraceModelReference__TraceModelAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:663:1: ( ( rule__TraceModelReference__TraceModelAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:664:1: ( rule__TraceModelReference__TraceModelAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelReferenceAccess().getTraceModelAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:665:1: ( rule__TraceModelReference__TraceModelAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:665:2: rule__TraceModelReference__TraceModelAssignment
            {
            pushFollow(FOLLOW_rule__TraceModelReference__TraceModelAssignment_in_ruleTraceModelReference1360);
            rule__TraceModelReference__TraceModelAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelReferenceAccess().getTraceModelAssignment()); 
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
    // $ANTLR end "ruleTraceModelReference"


    // $ANTLR start "entryRuleTraceModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:677:1: entryRuleTraceModel : ruleTraceModel EOF ;
    public final void entryRuleTraceModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:678:1: ( ruleTraceModel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:679:1: ruleTraceModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelRule()); 
            }
            pushFollow(FOLLOW_ruleTraceModel_in_entryRuleTraceModel1387);
            ruleTraceModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraceModel1394); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:686:1: ruleTraceModel : ( ( rule__TraceModel__Group__0 ) ) ;
    public final void ruleTraceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:690:2: ( ( ( rule__TraceModel__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:691:1: ( ( rule__TraceModel__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:691:1: ( ( rule__TraceModel__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:692:1: ( rule__TraceModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:693:1: ( rule__TraceModel__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:693:2: rule__TraceModel__Group__0
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__0_in_ruleTraceModel1420);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:705:1: entryRuleNodeSetRelation : ruleNodeSetRelation EOF ;
    public final void entryRuleNodeSetRelation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:706:1: ( ruleNodeSetRelation EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:707:1: ruleNodeSetRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationRule()); 
            }
            pushFollow(FOLLOW_ruleNodeSetRelation_in_entryRuleNodeSetRelation1447);
            ruleNodeSetRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeSetRelation1454); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:714:1: ruleNodeSetRelation : ( ( rule__NodeSetRelation__Group__0 ) ) ;
    public final void ruleNodeSetRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:718:2: ( ( ( rule__NodeSetRelation__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:719:1: ( ( rule__NodeSetRelation__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:719:1: ( ( rule__NodeSetRelation__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:720:1: ( rule__NodeSetRelation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:721:1: ( rule__NodeSetRelation__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:721:2: rule__NodeSetRelation__Group__0
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__0_in_ruleNodeSetRelation1480);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:733:1: entryRuleNodeType : ruleNodeType EOF ;
    public final void entryRuleNodeType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:734:1: ( ruleNodeType EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:735:1: ruleNodeType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_entryRuleNodeType1507);
            ruleNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeType1514); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:742:1: ruleNodeType : ( ( rule__NodeType__TypeAssignment ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:746:2: ( ( ( rule__NodeType__TypeAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:747:1: ( ( rule__NodeType__TypeAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:747:1: ( ( rule__NodeType__TypeAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:748:1: ( rule__NodeType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getTypeAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:749:1: ( rule__NodeType__TypeAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:749:2: rule__NodeType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__NodeType__TypeAssignment_in_ruleNodeType1540);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:761:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:762:1: ( ruleLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:763:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1567);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1574); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:770:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:774:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:775:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:775:1: ( ( rule__Literal__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:776:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:777:1: ( rule__Literal__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:777:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1600);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:789:1: entryRuleArrayLiteral : ruleArrayLiteral EOF ;
    public final void entryRuleArrayLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:790:1: ( ruleArrayLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:791:1: ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1627);
            ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral1634); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:798:1: ruleArrayLiteral : ( ( rule__ArrayLiteral__Group__0 ) ) ;
    public final void ruleArrayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:802:2: ( ( ( rule__ArrayLiteral__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:803:1: ( ( rule__ArrayLiteral__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:803:1: ( ( rule__ArrayLiteral__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:804:1: ( rule__ArrayLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:805:1: ( rule__ArrayLiteral__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:805:2: rule__ArrayLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1660);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:817:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:818:1: ( ruleStringLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:819:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1687);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1694); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:826:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:830:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:831:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:831:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:832:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:833:1: ( rule__StringLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:833:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1720);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:845:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:846:1: ( ruleIntLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:847:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1747);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral1754); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:854:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:858:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:859:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:859:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:860:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:861:1: ( rule__IntLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:861:2: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1780);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:873:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:874:1: ( ruleFloatLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:875:1: ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1807);
            ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral1814); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:882:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:886:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:887:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:887:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:888:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:889:1: ( rule__FloatLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:889:2: rule__FloatLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1840);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:901:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:902:1: ( ruleBooleanLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:903:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1867);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1874); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:910:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:914:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:915:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:915:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:916:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:917:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:917:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1900);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:929:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:930:1: ( ruleQualifiedName EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:931:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1927);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1934); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:938:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:942:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:943:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:943:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:944:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:945:1: ( rule__QualifiedName__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:945:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1960);
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


    // $ANTLR start "ruleMetamodelModifier"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:960:1: ruleMetamodelModifier : ( ( rule__MetamodelModifier__Alternatives ) ) ;
    public final void ruleMetamodelModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:964:1: ( ( ( rule__MetamodelModifier__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:965:1: ( ( rule__MetamodelModifier__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:965:1: ( ( rule__MetamodelModifier__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:966:1: ( rule__MetamodelModifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelModifierAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:967:1: ( rule__MetamodelModifier__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:967:2: rule__MetamodelModifier__Alternatives
            {
            pushFollow(FOLLOW_rule__MetamodelModifier__Alternatives_in_ruleMetamodelModifier1999);
            rule__MetamodelModifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelModifierAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMetamodelModifier"


    // $ANTLR start "ruleLogicOperator"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:979:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:983:1: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:984:1: ( ( rule__LogicOperator__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:984:1: ( ( rule__LogicOperator__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:985:1: ( rule__LogicOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:986:1: ( rule__LogicOperator__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:986:2: rule__LogicOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator2035);
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


    // $ANTLR start "ruleComparator"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:998:1: ruleComparator : ( ( rule__Comparator__Alternatives ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1002:1: ( ( ( rule__Comparator__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1003:1: ( ( rule__Comparator__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1003:1: ( ( rule__Comparator__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1004:1: ( rule__Comparator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1005:1: ( rule__Comparator__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1005:2: rule__Comparator__Alternatives
            {
            pushFollow(FOLLOW_rule__Comparator__Alternatives_in_ruleComparator2071);
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


    // $ANTLR start "rule__RegisteredPackage__Alternatives_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1016:1: rule__RegisteredPackage__Alternatives_2 : ( ( ( rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 ) ) | ( ( rule__RegisteredPackage__Group_2_1__0 ) ) );
    public final void rule__RegisteredPackage__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1020:1: ( ( ( rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 ) ) | ( ( rule__RegisteredPackage__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==50) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1021:1: ( ( rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1021:1: ( ( rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1022:1: ( rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceAssignment_2_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1023:1: ( rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1023:2: rule__RegisteredPackage__ImportedNamespaceAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__RegisteredPackage__ImportedNamespaceAssignment_2_0_in_rule__RegisteredPackage__Alternatives_22106);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1027:6: ( ( rule__RegisteredPackage__Group_2_1__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1027:6: ( ( rule__RegisteredPackage__Group_2_1__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1028:1: ( rule__RegisteredPackage__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRegisteredPackageAccess().getGroup_2_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1029:1: ( rule__RegisteredPackage__Group_2_1__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1029:2: rule__RegisteredPackage__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__RegisteredPackage__Group_2_1__0_in_rule__RegisteredPackage__Alternatives_22124);
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


    // $ANTLR start "rule__Processor__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1038:1: rule__Processor__Alternatives : ( ( ruleGenerator ) | ( ruleWeaver ) );
    public final void rule__Processor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1042:1: ( ( ruleGenerator ) | ( ruleWeaver ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==35) ) {
                alt2=1;
            }
            else if ( (LA2_0==32) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1043:1: ( ruleGenerator )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1043:1: ( ruleGenerator )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1044:1: ruleGenerator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorAccess().getGeneratorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGenerator_in_rule__Processor__Alternatives2157);
                    ruleGenerator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProcessorAccess().getGeneratorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1049:6: ( ruleWeaver )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1049:6: ( ruleWeaver )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1050:1: ruleWeaver
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProcessorAccess().getWeaverParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleWeaver_in_rule__Processor__Alternatives2174);
                    ruleWeaver();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProcessorAccess().getWeaverParserRuleCall_1()); 
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
    // $ANTLR end "rule__Processor__Alternatives"


    // $ANTLR start "rule__Weaver__Alternatives_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1060:1: rule__Weaver__Alternatives_2 : ( ( ( rule__Weaver__SourceModelAssignment_2_0 ) ) | ( 'link' ) );
    public final void rule__Weaver__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1064:1: ( ( ( rule__Weaver__SourceModelAssignment_2_0 ) ) | ( 'link' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==43) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1065:1: ( ( rule__Weaver__SourceModelAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1065:1: ( ( rule__Weaver__SourceModelAssignment_2_0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1066:1: ( rule__Weaver__SourceModelAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWeaverAccess().getSourceModelAssignment_2_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1067:1: ( rule__Weaver__SourceModelAssignment_2_0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1067:2: rule__Weaver__SourceModelAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Weaver__SourceModelAssignment_2_0_in_rule__Weaver__Alternatives_22206);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1071:6: ( 'link' )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1071:6: ( 'link' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1072:1: 'link'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWeaverAccess().getLinkKeyword_2_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Weaver__Alternatives_22225); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1084:1: rule__AspectModel__Alternatives : ( ( ( rule__AspectModel__Group_0__0 ) ) | ( ruleGenerator ) );
    public final void rule__AspectModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1088:1: ( ( ( rule__AspectModel__Group_0__0 ) ) | ( ruleGenerator ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1089:1: ( ( rule__AspectModel__Group_0__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1089:1: ( ( rule__AspectModel__Group_0__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1090:1: ( rule__AspectModel__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1091:1: ( rule__AspectModel__Group_0__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1091:2: rule__AspectModel__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AspectModel__Group_0__0_in_rule__AspectModel__Alternatives2259);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1095:6: ( ruleGenerator )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1095:6: ( ruleGenerator )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1096:1: ruleGenerator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getGeneratorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGenerator_in_rule__AspectModel__Alternatives2277);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1106:1: rule__SourceModelNodeSelector__Alternatives : ( ( ( rule__SourceModelNodeSelector__Group_0__0 ) ) | ( ( rule__SourceModelNodeSelector__Group_1__0 ) ) );
    public final void rule__SourceModelNodeSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1110:1: ( ( ( rule__SourceModelNodeSelector__Group_0__0 ) ) | ( ( rule__SourceModelNodeSelector__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==43) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1111:1: ( ( rule__SourceModelNodeSelector__Group_0__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1111:1: ( ( rule__SourceModelNodeSelector__Group_0__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1112:1: ( rule__SourceModelNodeSelector__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1113:1: ( rule__SourceModelNodeSelector__Group_0__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1113:2: rule__SourceModelNodeSelector__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__0_in_rule__SourceModelNodeSelector__Alternatives2309);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1117:6: ( ( rule__SourceModelNodeSelector__Group_1__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1117:6: ( ( rule__SourceModelNodeSelector__Group_1__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1118:1: ( rule__SourceModelNodeSelector__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1119:1: ( rule__SourceModelNodeSelector__Group_1__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1119:2: rule__SourceModelNodeSelector__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__0_in_rule__SourceModelNodeSelector__Alternatives2327);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1128:1: rule__BasicConstraint__Alternatives : ( ( ruleParenthesisConstraint ) | ( ruleOperand ) | ( ruleNegation ) );
    public final void rule__BasicConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1132:1: ( ( ruleParenthesisConstraint ) | ( ruleOperand ) | ( ruleNegation ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 45:
            case 47:
                {
                alt6=2;
                }
                break;
            case 44:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1133:1: ( ruleParenthesisConstraint )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1133:1: ( ruleParenthesisConstraint )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1134:1: ruleParenthesisConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getParenthesisConstraintParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleParenthesisConstraint_in_rule__BasicConstraint__Alternatives2360);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1139:6: ( ruleOperand )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1139:6: ( ruleOperand )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1140:1: ruleOperand
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getOperandParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleOperand_in_rule__BasicConstraint__Alternatives2377);
                    ruleOperand();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicConstraintAccess().getOperandParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1145:6: ( ruleNegation )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1145:6: ( ruleNegation )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1146:1: ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getNegationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleNegation_in_rule__BasicConstraint__Alternatives2394);
                    ruleNegation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBasicConstraintAccess().getNegationParserRuleCall_2()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1156:1: rule__Operand__Alternatives : ( ( ruleLiteral ) | ( ruleNodeProperty ) | ( ruleTypeof ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1160:1: ( ( ruleLiteral ) | ( ruleNodeProperty ) | ( ruleTypeof ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 47:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 45:
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1161:1: ( ruleLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1161:1: ( ruleLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1162:1: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Operand__Alternatives2426);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1167:6: ( ruleNodeProperty )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1167:6: ( ruleNodeProperty )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1168:1: ruleNodeProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getNodePropertyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNodeProperty_in_rule__Operand__Alternatives2443);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1173:6: ( ruleTypeof )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1173:6: ( ruleTypeof )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1174:1: ruleTypeof
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getTypeofParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleTypeof_in_rule__Operand__Alternatives2460);
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


    // $ANTLR start "rule__TargetTraceModel__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1184:1: rule__TargetTraceModel__Alternatives : ( ( ruleTraceModel ) | ( ( rule__TargetTraceModel__Group_1__0 ) ) );
    public final void rule__TargetTraceModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1188:1: ( ( ruleTraceModel ) | ( ( rule__TargetTraceModel__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==46) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1189:1: ( ruleTraceModel )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1189:1: ( ruleTraceModel )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1190:1: ruleTraceModel
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTargetTraceModelAccess().getTraceModelParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleTraceModel_in_rule__TargetTraceModel__Alternatives2492);
                    ruleTraceModel();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTargetTraceModelAccess().getTraceModelParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1195:6: ( ( rule__TargetTraceModel__Group_1__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1195:6: ( ( rule__TargetTraceModel__Group_1__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1196:1: ( rule__TargetTraceModel__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTargetTraceModelAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1197:1: ( rule__TargetTraceModel__Group_1__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1197:2: rule__TargetTraceModel__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TargetTraceModel__Group_1__0_in_rule__TargetTraceModel__Alternatives2509);
                    rule__TargetTraceModel__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTargetTraceModelAccess().getGroup_1()); 
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
    // $ANTLR end "rule__TargetTraceModel__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1206:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleArrayLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1210:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleArrayLiteral ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt9=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt9=4;
                }
                break;
            case 47:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1211:1: ( ruleStringLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1211:1: ( ruleStringLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1212:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2542);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1217:6: ( ruleIntLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1217:6: ( ruleIntLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1218:1: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives2559);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1223:6: ( ruleFloatLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1223:6: ( ruleFloatLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1224:1: ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2576);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1229:6: ( ruleBooleanLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1229:6: ( ruleBooleanLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1230:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2593);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1235:6: ( ruleArrayLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1235:6: ( ruleArrayLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1236:1: ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives2610);
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


    // $ANTLR start "rule__MetamodelModifier__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1246:1: rule__MetamodelModifier__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'io' ) ) );
    public final void rule__MetamodelModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1250:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'io' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt10=1;
                }
                break;
            case 16:
                {
                alt10=2;
                }
                break;
            case 17:
                {
                alt10=3;
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1251:1: ( ( 'in' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1251:1: ( ( 'in' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1252:1: ( 'in' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMetamodelModifierAccess().getINPUTEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1253:1: ( 'in' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1253:3: 'in'
                    {
                    match(input,15,FOLLOW_15_in_rule__MetamodelModifier__Alternatives2643); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMetamodelModifierAccess().getINPUTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1258:6: ( ( 'out' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1258:6: ( ( 'out' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1259:1: ( 'out' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMetamodelModifierAccess().getOUTPUTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1260:1: ( 'out' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1260:3: 'out'
                    {
                    match(input,16,FOLLOW_16_in_rule__MetamodelModifier__Alternatives2664); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMetamodelModifierAccess().getOUTPUTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1265:6: ( ( 'io' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1265:6: ( ( 'io' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1266:1: ( 'io' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMetamodelModifierAccess().getINTERMEDIATEEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1267:1: ( 'io' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1267:3: 'io'
                    {
                    match(input,17,FOLLOW_17_in_rule__MetamodelModifier__Alternatives2685); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMetamodelModifierAccess().getINTERMEDIATEEnumLiteralDeclaration_2()); 
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
    // $ANTLR end "rule__MetamodelModifier__Alternatives"


    // $ANTLR start "rule__LogicOperator__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1277:1: rule__LogicOperator__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1281:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1282:1: ( ( '&' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1282:1: ( ( '&' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1283:1: ( '&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1284:1: ( '&' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1284:3: '&'
                    {
                    match(input,18,FOLLOW_18_in_rule__LogicOperator__Alternatives2721); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1289:6: ( ( '|' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1289:6: ( ( '|' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1290:1: ( '|' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1291:1: ( '|' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1291:3: '|'
                    {
                    match(input,19,FOLLOW_19_in_rule__LogicOperator__Alternatives2742); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1301:1: rule__Comparator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '~' ) ) );
    public final void rule__Comparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1305:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '~' ) ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt12=1;
                }
                break;
            case 21:
                {
                alt12=2;
                }
                break;
            case 22:
                {
                alt12=3;
                }
                break;
            case 23:
                {
                alt12=4;
                }
                break;
            case 24:
                {
                alt12=5;
                }
                break;
            case 25:
                {
                alt12=6;
                }
                break;
            case 26:
                {
                alt12=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1306:1: ( ( '==' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1306:1: ( ( '==' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1307:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1308:1: ( '==' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1308:3: '=='
                    {
                    match(input,20,FOLLOW_20_in_rule__Comparator__Alternatives2778); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1313:6: ( ( '!=' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1313:6: ( ( '!=' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1314:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getNEEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1315:1: ( '!=' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1315:3: '!='
                    {
                    match(input,21,FOLLOW_21_in_rule__Comparator__Alternatives2799); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getNEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1320:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1320:6: ( ( '>' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1321:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getGREnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1322:1: ( '>' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1322:3: '>'
                    {
                    match(input,22,FOLLOW_22_in_rule__Comparator__Alternatives2820); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getGREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1327:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1327:6: ( ( '<' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1328:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLWEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1329:1: ( '<' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1329:3: '<'
                    {
                    match(input,23,FOLLOW_23_in_rule__Comparator__Alternatives2841); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getLWEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1334:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1334:6: ( ( '>=' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1335:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1336:1: ( '>=' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1336:3: '>='
                    {
                    match(input,24,FOLLOW_24_in_rule__Comparator__Alternatives2862); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1341:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1341:6: ( ( '<=' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1342:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1343:1: ( '<=' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1343:3: '<='
                    {
                    match(input,25,FOLLOW_25_in_rule__Comparator__Alternatives2883); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1348:6: ( ( '~' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1348:6: ( ( '~' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1349:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLIKEEnumLiteralDeclaration_6()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1350:1: ( '~' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1350:3: '~'
                    {
                    match(input,26,FOLLOW_26_in_rule__Comparator__Alternatives2904); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getLIKEEnumLiteralDeclaration_6()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1362:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1366:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1367:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02937);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02940);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1374:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1378:1: ( ( 'package' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1379:1: ( 'package' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1379:1: ( 'package' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1380:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Model__Group__0__Impl2968); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1393:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1397:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1398:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12999);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13002);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1405:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1409:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1410:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1410:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1411:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1412:1: ( rule__Model__NameAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1412:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl3029);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1422:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1426:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1427:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23059);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23062);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1434:1: rule__Model__Group__2__Impl : ( ( rule__Model__ImportsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1438:1: ( ( ( rule__Model__ImportsAssignment_2 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1439:1: ( ( rule__Model__ImportsAssignment_2 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1439:1: ( ( rule__Model__ImportsAssignment_2 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1440:1: ( rule__Model__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1441:1: ( rule__Model__ImportsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1441:2: rule__Model__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl3089);
            	    rule__Model__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1451:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1455:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1456:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33120);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__33123);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1463:1: rule__Model__Group__3__Impl : ( ( rule__Model__RegisteredPackagesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1467:1: ( ( ( rule__Model__RegisteredPackagesAssignment_3 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1468:1: ( ( rule__Model__RegisteredPackagesAssignment_3 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1468:1: ( ( rule__Model__RegisteredPackagesAssignment_3 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1469:1: ( rule__Model__RegisteredPackagesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRegisteredPackagesAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1470:1: ( rule__Model__RegisteredPackagesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1470:2: rule__Model__RegisteredPackagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__RegisteredPackagesAssignment_3_in_rule__Model__Group__3__Impl3150);
            	    rule__Model__RegisteredPackagesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1480:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1484:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1485:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43181);
            rule__Model__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__43184);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1492:1: rule__Model__Group__4__Impl : ( ( rule__Model__MetamodelsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1496:1: ( ( ( rule__Model__MetamodelsAssignment_4 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1497:1: ( ( rule__Model__MetamodelsAssignment_4 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1497:1: ( ( rule__Model__MetamodelsAssignment_4 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1498:1: ( rule__Model__MetamodelsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetamodelsAssignment_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1499:1: ( rule__Model__MetamodelsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1499:2: rule__Model__MetamodelsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__MetamodelsAssignment_4_in_rule__Model__Group__4__Impl3211);
            	    rule__Model__MetamodelsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1509:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1513:1: ( rule__Model__Group__5__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1514:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__53242);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1520:1: rule__Model__Group__5__Impl : ( ( rule__Model__ProcessorsAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1524:1: ( ( ( rule__Model__ProcessorsAssignment_5 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1525:1: ( ( rule__Model__ProcessorsAssignment_5 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1525:1: ( ( rule__Model__ProcessorsAssignment_5 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1526:1: ( rule__Model__ProcessorsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProcessorsAssignment_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1527:1: ( rule__Model__ProcessorsAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32||LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1527:2: rule__Model__ProcessorsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__ProcessorsAssignment_5_in_rule__Model__Group__5__Impl3269);
            	    rule__Model__ProcessorsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getProcessorsAssignment_5()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1549:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1553:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1554:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03312);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03315);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1561:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1565:1: ( ( 'import' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1566:1: ( 'import' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1566:1: ( 'import' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1567:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Import__Group__0__Impl3343); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1580:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1584:1: ( rule__Import__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1585:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13374);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1591:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1595:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1596:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1596:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1597:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1598:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1598:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3401);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1612:1: rule__MetamodelSequence__Group__0 : rule__MetamodelSequence__Group__0__Impl rule__MetamodelSequence__Group__1 ;
    public final void rule__MetamodelSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1616:1: ( rule__MetamodelSequence__Group__0__Impl rule__MetamodelSequence__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1617:2: rule__MetamodelSequence__Group__0__Impl rule__MetamodelSequence__Group__1
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__0__Impl_in_rule__MetamodelSequence__Group__03435);
            rule__MetamodelSequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__1_in_rule__MetamodelSequence__Group__03438);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1624:1: rule__MetamodelSequence__Group__0__Impl : ( 'model' ) ;
    public final void rule__MetamodelSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1628:1: ( ( 'model' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1629:1: ( 'model' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1629:1: ( 'model' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1630:1: 'model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getModelKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__MetamodelSequence__Group__0__Impl3466); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1643:1: rule__MetamodelSequence__Group__1 : rule__MetamodelSequence__Group__1__Impl rule__MetamodelSequence__Group__2 ;
    public final void rule__MetamodelSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1647:1: ( rule__MetamodelSequence__Group__1__Impl rule__MetamodelSequence__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1648:2: rule__MetamodelSequence__Group__1__Impl rule__MetamodelSequence__Group__2
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__1__Impl_in_rule__MetamodelSequence__Group__13497);
            rule__MetamodelSequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__2_in_rule__MetamodelSequence__Group__13500);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1655:1: rule__MetamodelSequence__Group__1__Impl : ( ( rule__MetamodelSequence__ModifierAssignment_1 ) ) ;
    public final void rule__MetamodelSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1659:1: ( ( ( rule__MetamodelSequence__ModifierAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1660:1: ( ( rule__MetamodelSequence__ModifierAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1660:1: ( ( rule__MetamodelSequence__ModifierAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1661:1: ( rule__MetamodelSequence__ModifierAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getModifierAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1662:1: ( rule__MetamodelSequence__ModifierAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1662:2: rule__MetamodelSequence__ModifierAssignment_1
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__ModifierAssignment_1_in_rule__MetamodelSequence__Group__1__Impl3527);
            rule__MetamodelSequence__ModifierAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getModifierAssignment_1()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1672:1: rule__MetamodelSequence__Group__2 : rule__MetamodelSequence__Group__2__Impl rule__MetamodelSequence__Group__3 ;
    public final void rule__MetamodelSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1676:1: ( rule__MetamodelSequence__Group__2__Impl rule__MetamodelSequence__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1677:2: rule__MetamodelSequence__Group__2__Impl rule__MetamodelSequence__Group__3
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__2__Impl_in_rule__MetamodelSequence__Group__23557);
            rule__MetamodelSequence__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__3_in_rule__MetamodelSequence__Group__23560);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1684:1: rule__MetamodelSequence__Group__2__Impl : ( ( rule__MetamodelSequence__TypeAssignment_2 ) ) ;
    public final void rule__MetamodelSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1688:1: ( ( ( rule__MetamodelSequence__TypeAssignment_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1689:1: ( ( rule__MetamodelSequence__TypeAssignment_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1689:1: ( ( rule__MetamodelSequence__TypeAssignment_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1690:1: ( rule__MetamodelSequence__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getTypeAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1691:1: ( rule__MetamodelSequence__TypeAssignment_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1691:2: rule__MetamodelSequence__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__TypeAssignment_2_in_rule__MetamodelSequence__Group__2__Impl3587);
            rule__MetamodelSequence__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getTypeAssignment_2()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1701:1: rule__MetamodelSequence__Group__3 : rule__MetamodelSequence__Group__3__Impl rule__MetamodelSequence__Group__4 ;
    public final void rule__MetamodelSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1705:1: ( rule__MetamodelSequence__Group__3__Impl rule__MetamodelSequence__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1706:2: rule__MetamodelSequence__Group__3__Impl rule__MetamodelSequence__Group__4
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__3__Impl_in_rule__MetamodelSequence__Group__33617);
            rule__MetamodelSequence__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__4_in_rule__MetamodelSequence__Group__33620);
            rule__MetamodelSequence__Group__4();

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1713:1: rule__MetamodelSequence__Group__3__Impl : ( ( rule__MetamodelSequence__MetamodelsAssignment_3 ) ) ;
    public final void rule__MetamodelSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1717:1: ( ( ( rule__MetamodelSequence__MetamodelsAssignment_3 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1718:1: ( ( rule__MetamodelSequence__MetamodelsAssignment_3 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1718:1: ( ( rule__MetamodelSequence__MetamodelsAssignment_3 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1719:1: ( rule__MetamodelSequence__MetamodelsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1720:1: ( rule__MetamodelSequence__MetamodelsAssignment_3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1720:2: rule__MetamodelSequence__MetamodelsAssignment_3
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__MetamodelsAssignment_3_in_rule__MetamodelSequence__Group__3__Impl3647);
            rule__MetamodelSequence__MetamodelsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getMetamodelsAssignment_3()); 
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


    // $ANTLR start "rule__MetamodelSequence__Group__4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1730:1: rule__MetamodelSequence__Group__4 : rule__MetamodelSequence__Group__4__Impl ;
    public final void rule__MetamodelSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1734:1: ( rule__MetamodelSequence__Group__4__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1735:2: rule__MetamodelSequence__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__4__Impl_in_rule__MetamodelSequence__Group__43677);
            rule__MetamodelSequence__Group__4__Impl();

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
    // $ANTLR end "rule__MetamodelSequence__Group__4"


    // $ANTLR start "rule__MetamodelSequence__Group__4__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1741:1: rule__MetamodelSequence__Group__4__Impl : ( ( rule__MetamodelSequence__Group_4__0 )* ) ;
    public final void rule__MetamodelSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1745:1: ( ( ( rule__MetamodelSequence__Group_4__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1746:1: ( ( rule__MetamodelSequence__Group_4__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1746:1: ( ( rule__MetamodelSequence__Group_4__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1747:1: ( rule__MetamodelSequence__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getGroup_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1748:1: ( rule__MetamodelSequence__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1748:2: rule__MetamodelSequence__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__MetamodelSequence__Group_4__0_in_rule__MetamodelSequence__Group__4__Impl3704);
            	    rule__MetamodelSequence__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getGroup_4()); 
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
    // $ANTLR end "rule__MetamodelSequence__Group__4__Impl"


    // $ANTLR start "rule__MetamodelSequence__Group_4__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1768:1: rule__MetamodelSequence__Group_4__0 : rule__MetamodelSequence__Group_4__0__Impl rule__MetamodelSequence__Group_4__1 ;
    public final void rule__MetamodelSequence__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1772:1: ( rule__MetamodelSequence__Group_4__0__Impl rule__MetamodelSequence__Group_4__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1773:2: rule__MetamodelSequence__Group_4__0__Impl rule__MetamodelSequence__Group_4__1
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group_4__0__Impl_in_rule__MetamodelSequence__Group_4__03745);
            rule__MetamodelSequence__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetamodelSequence__Group_4__1_in_rule__MetamodelSequence__Group_4__03748);
            rule__MetamodelSequence__Group_4__1();

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
    // $ANTLR end "rule__MetamodelSequence__Group_4__0"


    // $ANTLR start "rule__MetamodelSequence__Group_4__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1780:1: rule__MetamodelSequence__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MetamodelSequence__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1784:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1785:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1785:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1786:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getCommaKeyword_4_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__MetamodelSequence__Group_4__0__Impl3776); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getCommaKeyword_4_0()); 
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
    // $ANTLR end "rule__MetamodelSequence__Group_4__0__Impl"


    // $ANTLR start "rule__MetamodelSequence__Group_4__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1799:1: rule__MetamodelSequence__Group_4__1 : rule__MetamodelSequence__Group_4__1__Impl ;
    public final void rule__MetamodelSequence__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1803:1: ( rule__MetamodelSequence__Group_4__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1804:2: rule__MetamodelSequence__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group_4__1__Impl_in_rule__MetamodelSequence__Group_4__13807);
            rule__MetamodelSequence__Group_4__1__Impl();

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
    // $ANTLR end "rule__MetamodelSequence__Group_4__1"


    // $ANTLR start "rule__MetamodelSequence__Group_4__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1810:1: rule__MetamodelSequence__Group_4__1__Impl : ( ( rule__MetamodelSequence__MetamodelsAssignment_4_1 ) ) ;
    public final void rule__MetamodelSequence__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1814:1: ( ( ( rule__MetamodelSequence__MetamodelsAssignment_4_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1815:1: ( ( rule__MetamodelSequence__MetamodelsAssignment_4_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1815:1: ( ( rule__MetamodelSequence__MetamodelsAssignment_4_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1816:1: ( rule__MetamodelSequence__MetamodelsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsAssignment_4_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1817:1: ( rule__MetamodelSequence__MetamodelsAssignment_4_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1817:2: rule__MetamodelSequence__MetamodelsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__MetamodelsAssignment_4_1_in_rule__MetamodelSequence__Group_4__1__Impl3834);
            rule__MetamodelSequence__MetamodelsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getMetamodelsAssignment_4_1()); 
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
    // $ANTLR end "rule__MetamodelSequence__Group_4__1__Impl"


    // $ANTLR start "rule__RegisteredPackage__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1831:1: rule__RegisteredPackage__Group__0 : rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1 ;
    public final void rule__RegisteredPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1835:1: ( rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1836:2: rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__0__Impl_in_rule__RegisteredPackage__Group__03868);
            rule__RegisteredPackage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__1_in_rule__RegisteredPackage__Group__03871);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1843:1: rule__RegisteredPackage__Group__0__Impl : ( 'register' ) ;
    public final void rule__RegisteredPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1847:1: ( ( 'register' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1848:1: ( 'register' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1848:1: ( 'register' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1849:1: 'register'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getRegisterKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__RegisteredPackage__Group__0__Impl3899); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1862:1: rule__RegisteredPackage__Group__1 : rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2 ;
    public final void rule__RegisteredPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1866:1: ( rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1867:2: rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__1__Impl_in_rule__RegisteredPackage__Group__13930);
            rule__RegisteredPackage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__2_in_rule__RegisteredPackage__Group__13933);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1874:1: rule__RegisteredPackage__Group__1__Impl : ( ( rule__RegisteredPackage__NameAssignment_1 ) ) ;
    public final void rule__RegisteredPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1878:1: ( ( ( rule__RegisteredPackage__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1879:1: ( ( rule__RegisteredPackage__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1879:1: ( ( rule__RegisteredPackage__NameAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1880:1: ( rule__RegisteredPackage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1881:1: ( rule__RegisteredPackage__NameAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1881:2: rule__RegisteredPackage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__NameAssignment_1_in_rule__RegisteredPackage__Group__1__Impl3960);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1891:1: rule__RegisteredPackage__Group__2 : rule__RegisteredPackage__Group__2__Impl ;
    public final void rule__RegisteredPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1895:1: ( rule__RegisteredPackage__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1896:2: rule__RegisteredPackage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__2__Impl_in_rule__RegisteredPackage__Group__23990);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1902:1: rule__RegisteredPackage__Group__2__Impl : ( ( rule__RegisteredPackage__Alternatives_2 ) ) ;
    public final void rule__RegisteredPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1906:1: ( ( ( rule__RegisteredPackage__Alternatives_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1907:1: ( ( rule__RegisteredPackage__Alternatives_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1907:1: ( ( rule__RegisteredPackage__Alternatives_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1908:1: ( rule__RegisteredPackage__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1909:1: ( rule__RegisteredPackage__Alternatives_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1909:2: rule__RegisteredPackage__Alternatives_2
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Alternatives_2_in_rule__RegisteredPackage__Group__2__Impl4017);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1925:1: rule__RegisteredPackage__Group_2_1__0 : rule__RegisteredPackage__Group_2_1__0__Impl rule__RegisteredPackage__Group_2_1__1 ;
    public final void rule__RegisteredPackage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1929:1: ( rule__RegisteredPackage__Group_2_1__0__Impl rule__RegisteredPackage__Group_2_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1930:2: rule__RegisteredPackage__Group_2_1__0__Impl rule__RegisteredPackage__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group_2_1__0__Impl_in_rule__RegisteredPackage__Group_2_1__04053);
            rule__RegisteredPackage__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group_2_1__1_in_rule__RegisteredPackage__Group_2_1__04056);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1937:1: rule__RegisteredPackage__Group_2_1__0__Impl : ( ( rule__RegisteredPackage__IsTextAssignment_2_1_0 ) ) ;
    public final void rule__RegisteredPackage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1941:1: ( ( ( rule__RegisteredPackage__IsTextAssignment_2_1_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1942:1: ( ( rule__RegisteredPackage__IsTextAssignment_2_1_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1942:1: ( ( rule__RegisteredPackage__IsTextAssignment_2_1_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1943:1: ( rule__RegisteredPackage__IsTextAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getIsTextAssignment_2_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1944:1: ( rule__RegisteredPackage__IsTextAssignment_2_1_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1944:2: rule__RegisteredPackage__IsTextAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__IsTextAssignment_2_1_0_in_rule__RegisteredPackage__Group_2_1__0__Impl4083);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1954:1: rule__RegisteredPackage__Group_2_1__1 : rule__RegisteredPackage__Group_2_1__1__Impl ;
    public final void rule__RegisteredPackage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1958:1: ( rule__RegisteredPackage__Group_2_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1959:2: rule__RegisteredPackage__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group_2_1__1__Impl_in_rule__RegisteredPackage__Group_2_1__14113);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1965:1: rule__RegisteredPackage__Group_2_1__1__Impl : ( ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 ) ) ;
    public final void rule__RegisteredPackage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1969:1: ( ( ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1970:1: ( ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1970:1: ( ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1971:1: ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getExtensionAssignment_2_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1972:1: ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1972:2: rule__RegisteredPackage__ExtensionAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__ExtensionAssignment_2_1_1_in_rule__RegisteredPackage__Group_2_1__1__Impl4140);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1986:1: rule__Weaver__Group__0 : rule__Weaver__Group__0__Impl rule__Weaver__Group__1 ;
    public final void rule__Weaver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1990:1: ( rule__Weaver__Group__0__Impl rule__Weaver__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1991:2: rule__Weaver__Group__0__Impl rule__Weaver__Group__1
            {
            pushFollow(FOLLOW_rule__Weaver__Group__0__Impl_in_rule__Weaver__Group__04174);
            rule__Weaver__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__1_in_rule__Weaver__Group__04177);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1998:1: rule__Weaver__Group__0__Impl : ( 'weave' ) ;
    public final void rule__Weaver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2002:1: ( ( 'weave' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2003:1: ( 'weave' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2003:1: ( 'weave' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2004:1: 'weave'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getWeaveKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Weaver__Group__0__Impl4205); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2017:1: rule__Weaver__Group__1 : rule__Weaver__Group__1__Impl rule__Weaver__Group__2 ;
    public final void rule__Weaver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2021:1: ( rule__Weaver__Group__1__Impl rule__Weaver__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2022:2: rule__Weaver__Group__1__Impl rule__Weaver__Group__2
            {
            pushFollow(FOLLOW_rule__Weaver__Group__1__Impl_in_rule__Weaver__Group__14236);
            rule__Weaver__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__2_in_rule__Weaver__Group__14239);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2029:1: rule__Weaver__Group__1__Impl : ( ( rule__Weaver__ReferenceAssignment_1 ) ) ;
    public final void rule__Weaver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2033:1: ( ( ( rule__Weaver__ReferenceAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2034:1: ( ( rule__Weaver__ReferenceAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2034:1: ( ( rule__Weaver__ReferenceAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2035:1: ( rule__Weaver__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2036:1: ( rule__Weaver__ReferenceAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2036:2: rule__Weaver__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Weaver__ReferenceAssignment_1_in_rule__Weaver__Group__1__Impl4266);
            rule__Weaver__ReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getReferenceAssignment_1()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2046:1: rule__Weaver__Group__2 : rule__Weaver__Group__2__Impl rule__Weaver__Group__3 ;
    public final void rule__Weaver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2050:1: ( rule__Weaver__Group__2__Impl rule__Weaver__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2051:2: rule__Weaver__Group__2__Impl rule__Weaver__Group__3
            {
            pushFollow(FOLLOW_rule__Weaver__Group__2__Impl_in_rule__Weaver__Group__24296);
            rule__Weaver__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__3_in_rule__Weaver__Group__24299);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2058:1: rule__Weaver__Group__2__Impl : ( ( rule__Weaver__Alternatives_2 ) ) ;
    public final void rule__Weaver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2062:1: ( ( ( rule__Weaver__Alternatives_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2063:1: ( ( rule__Weaver__Alternatives_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2063:1: ( ( rule__Weaver__Alternatives_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2064:1: ( rule__Weaver__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2065:1: ( rule__Weaver__Alternatives_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2065:2: rule__Weaver__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Weaver__Alternatives_2_in_rule__Weaver__Group__2__Impl4326);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2075:1: rule__Weaver__Group__3 : rule__Weaver__Group__3__Impl rule__Weaver__Group__4 ;
    public final void rule__Weaver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2079:1: ( rule__Weaver__Group__3__Impl rule__Weaver__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2080:2: rule__Weaver__Group__3__Impl rule__Weaver__Group__4
            {
            pushFollow(FOLLOW_rule__Weaver__Group__3__Impl_in_rule__Weaver__Group__34356);
            rule__Weaver__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__4_in_rule__Weaver__Group__34359);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2087:1: rule__Weaver__Group__3__Impl : ( ( rule__Weaver__AspectModelAssignment_3 ) ) ;
    public final void rule__Weaver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2091:1: ( ( ( rule__Weaver__AspectModelAssignment_3 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2092:1: ( ( rule__Weaver__AspectModelAssignment_3 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2092:1: ( ( rule__Weaver__AspectModelAssignment_3 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2093:1: ( rule__Weaver__AspectModelAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getAspectModelAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2094:1: ( rule__Weaver__AspectModelAssignment_3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2094:2: rule__Weaver__AspectModelAssignment_3
            {
            pushFollow(FOLLOW_rule__Weaver__AspectModelAssignment_3_in_rule__Weaver__Group__3__Impl4386);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2104:1: rule__Weaver__Group__4 : rule__Weaver__Group__4__Impl ;
    public final void rule__Weaver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2108:1: ( rule__Weaver__Group__4__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2109:2: rule__Weaver__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Weaver__Group__4__Impl_in_rule__Weaver__Group__44416);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2115:1: rule__Weaver__Group__4__Impl : ( ( rule__Weaver__Group_4__0 )? ) ;
    public final void rule__Weaver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2119:1: ( ( ( rule__Weaver__Group_4__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2120:1: ( ( rule__Weaver__Group_4__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2120:1: ( ( rule__Weaver__Group_4__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2121:1: ( rule__Weaver__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getGroup_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2122:1: ( rule__Weaver__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2122:2: rule__Weaver__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Weaver__Group_4__0_in_rule__Weaver__Group__4__Impl4443);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2142:1: rule__Weaver__Group_4__0 : rule__Weaver__Group_4__0__Impl rule__Weaver__Group_4__1 ;
    public final void rule__Weaver__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2146:1: ( rule__Weaver__Group_4__0__Impl rule__Weaver__Group_4__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2147:2: rule__Weaver__Group_4__0__Impl rule__Weaver__Group_4__1
            {
            pushFollow(FOLLOW_rule__Weaver__Group_4__0__Impl_in_rule__Weaver__Group_4__04484);
            rule__Weaver__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group_4__1_in_rule__Weaver__Group_4__04487);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2154:1: rule__Weaver__Group_4__0__Impl : ( '=>' ) ;
    public final void rule__Weaver__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2158:1: ( ( '=>' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2159:1: ( '=>' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2159:1: ( '=>' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2160:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getEqualsSignGreaterThanSignKeyword_4_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Weaver__Group_4__0__Impl4515); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2173:1: rule__Weaver__Group_4__1 : rule__Weaver__Group_4__1__Impl ;
    public final void rule__Weaver__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2177:1: ( rule__Weaver__Group_4__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2178:2: rule__Weaver__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Weaver__Group_4__1__Impl_in_rule__Weaver__Group_4__14546);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2184:1: rule__Weaver__Group_4__1__Impl : ( ( rule__Weaver__TargetModelAssignment_4_1 ) ) ;
    public final void rule__Weaver__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2188:1: ( ( ( rule__Weaver__TargetModelAssignment_4_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2189:1: ( ( rule__Weaver__TargetModelAssignment_4_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2189:1: ( ( rule__Weaver__TargetModelAssignment_4_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2190:1: ( rule__Weaver__TargetModelAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getTargetModelAssignment_4_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2191:1: ( rule__Weaver__TargetModelAssignment_4_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2191:2: rule__Weaver__TargetModelAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Weaver__TargetModelAssignment_4_1_in_rule__Weaver__Group_4__1__Impl4573);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2205:1: rule__AspectModel__Group_0__0 : rule__AspectModel__Group_0__0__Impl rule__AspectModel__Group_0__1 ;
    public final void rule__AspectModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2209:1: ( rule__AspectModel__Group_0__0__Impl rule__AspectModel__Group_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2210:2: rule__AspectModel__Group_0__0__Impl rule__AspectModel__Group_0__1
            {
            pushFollow(FOLLOW_rule__AspectModel__Group_0__0__Impl_in_rule__AspectModel__Group_0__04607);
            rule__AspectModel__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AspectModel__Group_0__1_in_rule__AspectModel__Group_0__04610);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2217:1: rule__AspectModel__Group_0__0__Impl : ( ':' ) ;
    public final void rule__AspectModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2221:1: ( ( ':' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2222:1: ( ':' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2222:1: ( ':' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2223:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getColonKeyword_0_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__AspectModel__Group_0__0__Impl4638); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2236:1: rule__AspectModel__Group_0__1 : rule__AspectModel__Group_0__1__Impl ;
    public final void rule__AspectModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2240:1: ( rule__AspectModel__Group_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2241:2: rule__AspectModel__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AspectModel__Group_0__1__Impl_in_rule__AspectModel__Group_0__14669);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2247:1: rule__AspectModel__Group_0__1__Impl : ( ruleTargetModelNodeType ) ;
    public final void rule__AspectModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2251:1: ( ( ruleTargetModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2252:1: ( ruleTargetModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2252:1: ( ruleTargetModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2253:1: ruleTargetModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getTargetModelNodeTypeParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_rule__AspectModel__Group_0__1__Impl4696);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2268:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2272:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2273:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
            {
            pushFollow(FOLLOW_rule__Generator__Group__0__Impl_in_rule__Generator__Group__04729);
            rule__Generator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__1_in_rule__Generator__Group__04732);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2280:1: rule__Generator__Group__0__Impl : ( 'generate' ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2284:1: ( ( 'generate' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2285:1: ( 'generate' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2285:1: ( 'generate' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2286:1: 'generate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGenerateKeyword_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Generator__Group__0__Impl4760); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2299:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2303:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2304:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
            {
            pushFollow(FOLLOW_rule__Generator__Group__1__Impl_in_rule__Generator__Group__14791);
            rule__Generator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__2_in_rule__Generator__Group__14794);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2311:1: rule__Generator__Group__1__Impl : ( ( rule__Generator__ReferenceAssignment_1 ) ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2315:1: ( ( ( rule__Generator__ReferenceAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2316:1: ( ( rule__Generator__ReferenceAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2316:1: ( ( rule__Generator__ReferenceAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2317:1: ( rule__Generator__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2318:1: ( rule__Generator__ReferenceAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2318:2: rule__Generator__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Generator__ReferenceAssignment_1_in_rule__Generator__Group__1__Impl4821);
            rule__Generator__ReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getReferenceAssignment_1()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2328:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2332:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2333:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
            {
            pushFollow(FOLLOW_rule__Generator__Group__2__Impl_in_rule__Generator__Group__24851);
            rule__Generator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__3_in_rule__Generator__Group__24854);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2340:1: rule__Generator__Group__2__Impl : ( ( rule__Generator__Group_2__0 )? ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2344:1: ( ( ( rule__Generator__Group_2__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2345:1: ( ( rule__Generator__Group_2__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2345:1: ( ( rule__Generator__Group_2__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2346:1: ( rule__Generator__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2347:1: ( rule__Generator__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2347:2: rule__Generator__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_2__0_in_rule__Generator__Group__2__Impl4881);
                    rule__Generator__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGroup_2()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2357:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2361:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2362:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
            {
            pushFollow(FOLLOW_rule__Generator__Group__3__Impl_in_rule__Generator__Group__34912);
            rule__Generator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__4_in_rule__Generator__Group__34915);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2369:1: rule__Generator__Group__3__Impl : ( ( rule__Generator__SourceModelAssignment_3 ) ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2373:1: ( ( ( rule__Generator__SourceModelAssignment_3 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2374:1: ( ( rule__Generator__SourceModelAssignment_3 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2374:1: ( ( rule__Generator__SourceModelAssignment_3 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2375:1: ( rule__Generator__SourceModelAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceModelAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2376:1: ( rule__Generator__SourceModelAssignment_3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2376:2: rule__Generator__SourceModelAssignment_3
            {
            pushFollow(FOLLOW_rule__Generator__SourceModelAssignment_3_in_rule__Generator__Group__3__Impl4942);
            rule__Generator__SourceModelAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceModelAssignment_3()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2386:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2390:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2391:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
            {
            pushFollow(FOLLOW_rule__Generator__Group__4__Impl_in_rule__Generator__Group__44972);
            rule__Generator__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__5_in_rule__Generator__Group__44975);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2398:1: rule__Generator__Group__4__Impl : ( ( rule__Generator__TargetModelAssignment_4 ) ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2402:1: ( ( ( rule__Generator__TargetModelAssignment_4 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2403:1: ( ( rule__Generator__TargetModelAssignment_4 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2403:1: ( ( rule__Generator__TargetModelAssignment_4 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2404:1: ( rule__Generator__TargetModelAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetModelAssignment_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2405:1: ( rule__Generator__TargetModelAssignment_4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2405:2: rule__Generator__TargetModelAssignment_4
            {
            pushFollow(FOLLOW_rule__Generator__TargetModelAssignment_4_in_rule__Generator__Group__4__Impl5002);
            rule__Generator__TargetModelAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getTargetModelAssignment_4()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2415:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl rule__Generator__Group__6 ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2419:1: ( rule__Generator__Group__5__Impl rule__Generator__Group__6 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2420:2: rule__Generator__Group__5__Impl rule__Generator__Group__6
            {
            pushFollow(FOLLOW_rule__Generator__Group__5__Impl_in_rule__Generator__Group__55032);
            rule__Generator__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__6_in_rule__Generator__Group__55035);
            rule__Generator__Group__6();

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2427:1: rule__Generator__Group__5__Impl : ( ( rule__Generator__Group_5__0 )? ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2431:1: ( ( ( rule__Generator__Group_5__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2432:1: ( ( rule__Generator__Group_5__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2432:1: ( ( rule__Generator__Group_5__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2433:1: ( rule__Generator__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2434:1: ( rule__Generator__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2434:2: rule__Generator__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_5__0_in_rule__Generator__Group__5__Impl5062);
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


    // $ANTLR start "rule__Generator__Group__6"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2444:1: rule__Generator__Group__6 : rule__Generator__Group__6__Impl ;
    public final void rule__Generator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2448:1: ( rule__Generator__Group__6__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2449:2: rule__Generator__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group__6__Impl_in_rule__Generator__Group__65093);
            rule__Generator__Group__6__Impl();

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
    // $ANTLR end "rule__Generator__Group__6"


    // $ANTLR start "rule__Generator__Group__6__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2455:1: rule__Generator__Group__6__Impl : ( ( rule__Generator__Group_6__0 )? ) ;
    public final void rule__Generator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2459:1: ( ( ( rule__Generator__Group_6__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2460:1: ( ( rule__Generator__Group_6__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2460:1: ( ( rule__Generator__Group_6__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2461:1: ( rule__Generator__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_6()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2462:1: ( rule__Generator__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2462:2: rule__Generator__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_6__0_in_rule__Generator__Group__6__Impl5120);
                    rule__Generator__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGroup_6()); 
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
    // $ANTLR end "rule__Generator__Group__6__Impl"


    // $ANTLR start "rule__Generator__Group_2__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2486:1: rule__Generator__Group_2__0 : rule__Generator__Group_2__0__Impl rule__Generator__Group_2__1 ;
    public final void rule__Generator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2490:1: ( rule__Generator__Group_2__0__Impl rule__Generator__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2491:2: rule__Generator__Group_2__0__Impl rule__Generator__Group_2__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_2__0__Impl_in_rule__Generator__Group_2__05165);
            rule__Generator__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_2__1_in_rule__Generator__Group_2__05168);
            rule__Generator__Group_2__1();

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
    // $ANTLR end "rule__Generator__Group_2__0"


    // $ANTLR start "rule__Generator__Group_2__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2498:1: rule__Generator__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Generator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2502:1: ( ( '(' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2503:1: ( '(' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2503:1: ( '(' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2504:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Generator__Group_2__0__Impl5196); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__Generator__Group_2__0__Impl"


    // $ANTLR start "rule__Generator__Group_2__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2517:1: rule__Generator__Group_2__1 : rule__Generator__Group_2__1__Impl rule__Generator__Group_2__2 ;
    public final void rule__Generator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2521:1: ( rule__Generator__Group_2__1__Impl rule__Generator__Group_2__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2522:2: rule__Generator__Group_2__1__Impl rule__Generator__Group_2__2
            {
            pushFollow(FOLLOW_rule__Generator__Group_2__1__Impl_in_rule__Generator__Group_2__15227);
            rule__Generator__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_2__2_in_rule__Generator__Group_2__15230);
            rule__Generator__Group_2__2();

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
    // $ANTLR end "rule__Generator__Group_2__1"


    // $ANTLR start "rule__Generator__Group_2__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2529:1: rule__Generator__Group_2__1__Impl : ( ( rule__Generator__SourceAuxModelsAssignment_2_1 ) ) ;
    public final void rule__Generator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2533:1: ( ( ( rule__Generator__SourceAuxModelsAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2534:1: ( ( rule__Generator__SourceAuxModelsAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2534:1: ( ( rule__Generator__SourceAuxModelsAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2535:1: ( rule__Generator__SourceAuxModelsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceAuxModelsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2536:1: ( rule__Generator__SourceAuxModelsAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2536:2: rule__Generator__SourceAuxModelsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Generator__SourceAuxModelsAssignment_2_1_in_rule__Generator__Group_2__1__Impl5257);
            rule__Generator__SourceAuxModelsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceAuxModelsAssignment_2_1()); 
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
    // $ANTLR end "rule__Generator__Group_2__1__Impl"


    // $ANTLR start "rule__Generator__Group_2__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2546:1: rule__Generator__Group_2__2 : rule__Generator__Group_2__2__Impl rule__Generator__Group_2__3 ;
    public final void rule__Generator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2550:1: ( rule__Generator__Group_2__2__Impl rule__Generator__Group_2__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2551:2: rule__Generator__Group_2__2__Impl rule__Generator__Group_2__3
            {
            pushFollow(FOLLOW_rule__Generator__Group_2__2__Impl_in_rule__Generator__Group_2__25287);
            rule__Generator__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_2__3_in_rule__Generator__Group_2__25290);
            rule__Generator__Group_2__3();

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
    // $ANTLR end "rule__Generator__Group_2__2"


    // $ANTLR start "rule__Generator__Group_2__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2558:1: rule__Generator__Group_2__2__Impl : ( ( rule__Generator__Group_2_2__0 )* ) ;
    public final void rule__Generator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2562:1: ( ( ( rule__Generator__Group_2_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2563:1: ( ( rule__Generator__Group_2_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2563:1: ( ( rule__Generator__Group_2_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2564:1: ( rule__Generator__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_2_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2565:1: ( rule__Generator__Group_2_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2565:2: rule__Generator__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Generator__Group_2_2__0_in_rule__Generator__Group_2__2__Impl5317);
            	    rule__Generator__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGroup_2_2()); 
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
    // $ANTLR end "rule__Generator__Group_2__2__Impl"


    // $ANTLR start "rule__Generator__Group_2__3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2575:1: rule__Generator__Group_2__3 : rule__Generator__Group_2__3__Impl ;
    public final void rule__Generator__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2579:1: ( rule__Generator__Group_2__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2580:2: rule__Generator__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_2__3__Impl_in_rule__Generator__Group_2__35348);
            rule__Generator__Group_2__3__Impl();

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
    // $ANTLR end "rule__Generator__Group_2__3"


    // $ANTLR start "rule__Generator__Group_2__3__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2586:1: rule__Generator__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Generator__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2590:1: ( ( ')' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2591:1: ( ')' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2591:1: ( ')' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2592:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,37,FOLLOW_37_in_rule__Generator__Group_2__3__Impl5376); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_2_3()); 
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
    // $ANTLR end "rule__Generator__Group_2__3__Impl"


    // $ANTLR start "rule__Generator__Group_2_2__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2613:1: rule__Generator__Group_2_2__0 : rule__Generator__Group_2_2__0__Impl rule__Generator__Group_2_2__1 ;
    public final void rule__Generator__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2617:1: ( rule__Generator__Group_2_2__0__Impl rule__Generator__Group_2_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2618:2: rule__Generator__Group_2_2__0__Impl rule__Generator__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_2_2__0__Impl_in_rule__Generator__Group_2_2__05415);
            rule__Generator__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_2_2__1_in_rule__Generator__Group_2_2__05418);
            rule__Generator__Group_2_2__1();

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
    // $ANTLR end "rule__Generator__Group_2_2__0"


    // $ANTLR start "rule__Generator__Group_2_2__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2625:1: rule__Generator__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Generator__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2629:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2630:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2630:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2631:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Generator__Group_2_2__0__Impl5446); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getCommaKeyword_2_2_0()); 
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
    // $ANTLR end "rule__Generator__Group_2_2__0__Impl"


    // $ANTLR start "rule__Generator__Group_2_2__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2644:1: rule__Generator__Group_2_2__1 : rule__Generator__Group_2_2__1__Impl ;
    public final void rule__Generator__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2648:1: ( rule__Generator__Group_2_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2649:2: rule__Generator__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_2_2__1__Impl_in_rule__Generator__Group_2_2__15477);
            rule__Generator__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Generator__Group_2_2__1"


    // $ANTLR start "rule__Generator__Group_2_2__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2655:1: rule__Generator__Group_2_2__1__Impl : ( ( rule__Generator__SourceAuxModelsAssignment_2_2_1 ) ) ;
    public final void rule__Generator__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2659:1: ( ( ( rule__Generator__SourceAuxModelsAssignment_2_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2660:1: ( ( rule__Generator__SourceAuxModelsAssignment_2_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2660:1: ( ( rule__Generator__SourceAuxModelsAssignment_2_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2661:1: ( rule__Generator__SourceAuxModelsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceAuxModelsAssignment_2_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2662:1: ( rule__Generator__SourceAuxModelsAssignment_2_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2662:2: rule__Generator__SourceAuxModelsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Generator__SourceAuxModelsAssignment_2_2_1_in_rule__Generator__Group_2_2__1__Impl5504);
            rule__Generator__SourceAuxModelsAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceAuxModelsAssignment_2_2_1()); 
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
    // $ANTLR end "rule__Generator__Group_2_2__1__Impl"


    // $ANTLR start "rule__Generator__Group_5__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2676:1: rule__Generator__Group_5__0 : rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1 ;
    public final void rule__Generator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2680:1: ( rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2681:2: rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_5__0__Impl_in_rule__Generator__Group_5__05538);
            rule__Generator__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_5__1_in_rule__Generator__Group_5__05541);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2688:1: rule__Generator__Group_5__0__Impl : ( '->' ) ;
    public final void rule__Generator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2692:1: ( ( '->' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2693:1: ( '->' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2693:1: ( '->' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2694:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Generator__Group_5__0__Impl5569); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getHyphenMinusGreaterThanSignKeyword_5_0()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2707:1: rule__Generator__Group_5__1 : rule__Generator__Group_5__1__Impl ;
    public final void rule__Generator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2711:1: ( rule__Generator__Group_5__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2712:2: rule__Generator__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_5__1__Impl_in_rule__Generator__Group_5__15600);
            rule__Generator__Group_5__1__Impl();

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2718:1: rule__Generator__Group_5__1__Impl : ( ( rule__Generator__TargetTraceModelAssignment_5_1 ) ) ;
    public final void rule__Generator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2722:1: ( ( ( rule__Generator__TargetTraceModelAssignment_5_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2723:1: ( ( rule__Generator__TargetTraceModelAssignment_5_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2723:1: ( ( rule__Generator__TargetTraceModelAssignment_5_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2724:1: ( rule__Generator__TargetTraceModelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetTraceModelAssignment_5_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2725:1: ( rule__Generator__TargetTraceModelAssignment_5_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2725:2: rule__Generator__TargetTraceModelAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Generator__TargetTraceModelAssignment_5_1_in_rule__Generator__Group_5__1__Impl5627);
            rule__Generator__TargetTraceModelAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getTargetTraceModelAssignment_5_1()); 
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


    // $ANTLR start "rule__Generator__Group_6__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2739:1: rule__Generator__Group_6__0 : rule__Generator__Group_6__0__Impl rule__Generator__Group_6__1 ;
    public final void rule__Generator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2743:1: ( rule__Generator__Group_6__0__Impl rule__Generator__Group_6__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2744:2: rule__Generator__Group_6__0__Impl rule__Generator__Group_6__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_6__0__Impl_in_rule__Generator__Group_6__05661);
            rule__Generator__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6__1_in_rule__Generator__Group_6__05664);
            rule__Generator__Group_6__1();

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
    // $ANTLR end "rule__Generator__Group_6__0"


    // $ANTLR start "rule__Generator__Group_6__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2751:1: rule__Generator__Group_6__0__Impl : ( '<-' ) ;
    public final void rule__Generator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2755:1: ( ( '<-' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2756:1: ( '<-' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2756:1: ( '<-' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2757:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getLessThanSignHyphenMinusKeyword_6_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Generator__Group_6__0__Impl5692); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getLessThanSignHyphenMinusKeyword_6_0()); 
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
    // $ANTLR end "rule__Generator__Group_6__0__Impl"


    // $ANTLR start "rule__Generator__Group_6__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2770:1: rule__Generator__Group_6__1 : rule__Generator__Group_6__1__Impl rule__Generator__Group_6__2 ;
    public final void rule__Generator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2774:1: ( rule__Generator__Group_6__1__Impl rule__Generator__Group_6__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2775:2: rule__Generator__Group_6__1__Impl rule__Generator__Group_6__2
            {
            pushFollow(FOLLOW_rule__Generator__Group_6__1__Impl_in_rule__Generator__Group_6__15723);
            rule__Generator__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6__2_in_rule__Generator__Group_6__15726);
            rule__Generator__Group_6__2();

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
    // $ANTLR end "rule__Generator__Group_6__1"


    // $ANTLR start "rule__Generator__Group_6__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2782:1: rule__Generator__Group_6__1__Impl : ( ( rule__Generator__SourceTraceModelsAssignment_6_1 ) ) ;
    public final void rule__Generator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2786:1: ( ( ( rule__Generator__SourceTraceModelsAssignment_6_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2787:1: ( ( rule__Generator__SourceTraceModelsAssignment_6_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2787:1: ( ( rule__Generator__SourceTraceModelsAssignment_6_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2788:1: ( rule__Generator__SourceTraceModelsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceTraceModelsAssignment_6_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2789:1: ( rule__Generator__SourceTraceModelsAssignment_6_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2789:2: rule__Generator__SourceTraceModelsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Generator__SourceTraceModelsAssignment_6_1_in_rule__Generator__Group_6__1__Impl5753);
            rule__Generator__SourceTraceModelsAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceTraceModelsAssignment_6_1()); 
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
    // $ANTLR end "rule__Generator__Group_6__1__Impl"


    // $ANTLR start "rule__Generator__Group_6__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2799:1: rule__Generator__Group_6__2 : rule__Generator__Group_6__2__Impl ;
    public final void rule__Generator__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2803:1: ( rule__Generator__Group_6__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2804:2: rule__Generator__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_6__2__Impl_in_rule__Generator__Group_6__25783);
            rule__Generator__Group_6__2__Impl();

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
    // $ANTLR end "rule__Generator__Group_6__2"


    // $ANTLR start "rule__Generator__Group_6__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2810:1: rule__Generator__Group_6__2__Impl : ( ( rule__Generator__Group_6_2__0 )* ) ;
    public final void rule__Generator__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2814:1: ( ( ( rule__Generator__Group_6_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2815:1: ( ( rule__Generator__Group_6_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2815:1: ( ( rule__Generator__Group_6_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2816:1: ( rule__Generator__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_6_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2817:1: ( rule__Generator__Group_6_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2817:2: rule__Generator__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Generator__Group_6_2__0_in_rule__Generator__Group_6__2__Impl5810);
            	    rule__Generator__Group_6_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGroup_6_2()); 
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
    // $ANTLR end "rule__Generator__Group_6__2__Impl"


    // $ANTLR start "rule__Generator__Group_6_2__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2833:1: rule__Generator__Group_6_2__0 : rule__Generator__Group_6_2__0__Impl rule__Generator__Group_6_2__1 ;
    public final void rule__Generator__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2837:1: ( rule__Generator__Group_6_2__0__Impl rule__Generator__Group_6_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2838:2: rule__Generator__Group_6_2__0__Impl rule__Generator__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_2__0__Impl_in_rule__Generator__Group_6_2__05847);
            rule__Generator__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6_2__1_in_rule__Generator__Group_6_2__05850);
            rule__Generator__Group_6_2__1();

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
    // $ANTLR end "rule__Generator__Group_6_2__0"


    // $ANTLR start "rule__Generator__Group_6_2__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2845:1: rule__Generator__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Generator__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2849:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2850:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2850:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2851:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getCommaKeyword_6_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Generator__Group_6_2__0__Impl5878); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getCommaKeyword_6_2_0()); 
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
    // $ANTLR end "rule__Generator__Group_6_2__0__Impl"


    // $ANTLR start "rule__Generator__Group_6_2__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2864:1: rule__Generator__Group_6_2__1 : rule__Generator__Group_6_2__1__Impl ;
    public final void rule__Generator__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2868:1: ( rule__Generator__Group_6_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2869:2: rule__Generator__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_2__1__Impl_in_rule__Generator__Group_6_2__15909);
            rule__Generator__Group_6_2__1__Impl();

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
    // $ANTLR end "rule__Generator__Group_6_2__1"


    // $ANTLR start "rule__Generator__Group_6_2__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2875:1: rule__Generator__Group_6_2__1__Impl : ( ( rule__Generator__SourceTraceModelsAssignment_6_2_1 ) ) ;
    public final void rule__Generator__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2879:1: ( ( ( rule__Generator__SourceTraceModelsAssignment_6_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2880:1: ( ( rule__Generator__SourceTraceModelsAssignment_6_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2880:1: ( ( rule__Generator__SourceTraceModelsAssignment_6_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2881:1: ( rule__Generator__SourceTraceModelsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceTraceModelsAssignment_6_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2882:1: ( rule__Generator__SourceTraceModelsAssignment_6_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2882:2: rule__Generator__SourceTraceModelsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Generator__SourceTraceModelsAssignment_6_2_1_in_rule__Generator__Group_6_2__1__Impl5936);
            rule__Generator__SourceTraceModelsAssignment_6_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceTraceModelsAssignment_6_2_1()); 
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
    // $ANTLR end "rule__Generator__Group_6_2__1__Impl"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2896:1: rule__SourceModelNodeSelector__Group_0__0 : rule__SourceModelNodeSelector__Group_0__0__Impl rule__SourceModelNodeSelector__Group_0__1 ;
    public final void rule__SourceModelNodeSelector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2900:1: ( rule__SourceModelNodeSelector__Group_0__0__Impl rule__SourceModelNodeSelector__Group_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2901:2: rule__SourceModelNodeSelector__Group_0__0__Impl rule__SourceModelNodeSelector__Group_0__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__0__Impl_in_rule__SourceModelNodeSelector__Group_0__05970);
            rule__SourceModelNodeSelector__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__1_in_rule__SourceModelNodeSelector__Group_0__05973);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2908:1: rule__SourceModelNodeSelector__Group_0__0__Impl : ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) ) ;
    public final void rule__SourceModelNodeSelector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2912:1: ( ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2913:1: ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2913:1: ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2914:1: ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceAssignment_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2915:1: ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2915:2: rule__SourceModelNodeSelector__ReferenceAssignment_0_0
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__ReferenceAssignment_0_0_in_rule__SourceModelNodeSelector__Group_0__0__Impl6000);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2925:1: rule__SourceModelNodeSelector__Group_0__1 : rule__SourceModelNodeSelector__Group_0__1__Impl rule__SourceModelNodeSelector__Group_0__2 ;
    public final void rule__SourceModelNodeSelector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2929:1: ( rule__SourceModelNodeSelector__Group_0__1__Impl rule__SourceModelNodeSelector__Group_0__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2930:2: rule__SourceModelNodeSelector__Group_0__1__Impl rule__SourceModelNodeSelector__Group_0__2
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__1__Impl_in_rule__SourceModelNodeSelector__Group_0__16030);
            rule__SourceModelNodeSelector__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__2_in_rule__SourceModelNodeSelector__Group_0__16033);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2937:1: rule__SourceModelNodeSelector__Group_0__1__Impl : ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? ) ;
    public final void rule__SourceModelNodeSelector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2941:1: ( ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2942:1: ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2942:1: ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2943:1: ( rule__SourceModelNodeSelector__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2944:1: ( rule__SourceModelNodeSelector__Group_0_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2944:2: rule__SourceModelNodeSelector__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0_in_rule__SourceModelNodeSelector__Group_0__1__Impl6060);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2954:1: rule__SourceModelNodeSelector__Group_0__2 : rule__SourceModelNodeSelector__Group_0__2__Impl ;
    public final void rule__SourceModelNodeSelector__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2958:1: ( rule__SourceModelNodeSelector__Group_0__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2959:2: rule__SourceModelNodeSelector__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__2__Impl_in_rule__SourceModelNodeSelector__Group_0__26091);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2965:1: rule__SourceModelNodeSelector__Group_0__2__Impl : ( ( rule__SourceModelNodeSelector__Group_0_2__0 )? ) ;
    public final void rule__SourceModelNodeSelector__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2969:1: ( ( ( rule__SourceModelNodeSelector__Group_0_2__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2970:1: ( ( rule__SourceModelNodeSelector__Group_0_2__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2970:1: ( ( rule__SourceModelNodeSelector__Group_0_2__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2971:1: ( rule__SourceModelNodeSelector__Group_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2972:1: ( rule__SourceModelNodeSelector__Group_0_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2972:2: rule__SourceModelNodeSelector__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_2__0_in_rule__SourceModelNodeSelector__Group_0__2__Impl6118);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2988:1: rule__SourceModelNodeSelector__Group_0_1__0 : rule__SourceModelNodeSelector__Group_0_1__0__Impl rule__SourceModelNodeSelector__Group_0_1__1 ;
    public final void rule__SourceModelNodeSelector__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2992:1: ( rule__SourceModelNodeSelector__Group_0_1__0__Impl rule__SourceModelNodeSelector__Group_0_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2993:2: rule__SourceModelNodeSelector__Group_0_1__0__Impl rule__SourceModelNodeSelector__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0__Impl_in_rule__SourceModelNodeSelector__Group_0_1__06155);
            rule__SourceModelNodeSelector__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1_in_rule__SourceModelNodeSelector__Group_0_1__06158);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3000:1: rule__SourceModelNodeSelector__Group_0_1__0__Impl : ( '[' ) ;
    public final void rule__SourceModelNodeSelector__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3004:1: ( ( '[' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3005:1: ( '[' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3005:1: ( '[' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3006:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getLeftSquareBracketKeyword_0_1_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__SourceModelNodeSelector__Group_0_1__0__Impl6186); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3019:1: rule__SourceModelNodeSelector__Group_0_1__1 : rule__SourceModelNodeSelector__Group_0_1__1__Impl rule__SourceModelNodeSelector__Group_0_1__2 ;
    public final void rule__SourceModelNodeSelector__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3023:1: ( rule__SourceModelNodeSelector__Group_0_1__1__Impl rule__SourceModelNodeSelector__Group_0_1__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3024:2: rule__SourceModelNodeSelector__Group_0_1__1__Impl rule__SourceModelNodeSelector__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1__Impl_in_rule__SourceModelNodeSelector__Group_0_1__16217);
            rule__SourceModelNodeSelector__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__2_in_rule__SourceModelNodeSelector__Group_0_1__16220);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3031:1: rule__SourceModelNodeSelector__Group_0_1__1__Impl : ( ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 ) ) ;
    public final void rule__SourceModelNodeSelector__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3035:1: ( ( ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3036:1: ( ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3036:1: ( ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3037:1: ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getConstraintAssignment_0_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3038:1: ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3038:2: rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1_in_rule__SourceModelNodeSelector__Group_0_1__1__Impl6247);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3048:1: rule__SourceModelNodeSelector__Group_0_1__2 : rule__SourceModelNodeSelector__Group_0_1__2__Impl ;
    public final void rule__SourceModelNodeSelector__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3052:1: ( rule__SourceModelNodeSelector__Group_0_1__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3053:2: rule__SourceModelNodeSelector__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__2__Impl_in_rule__SourceModelNodeSelector__Group_0_1__26277);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3059:1: rule__SourceModelNodeSelector__Group_0_1__2__Impl : ( ']' ) ;
    public final void rule__SourceModelNodeSelector__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3063:1: ( ( ']' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3064:1: ( ']' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3064:1: ( ']' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3065:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getRightSquareBracketKeyword_0_1_2()); 
            }
            match(input,41,FOLLOW_41_in_rule__SourceModelNodeSelector__Group_0_1__2__Impl6305); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3084:1: rule__SourceModelNodeSelector__Group_0_2__0 : rule__SourceModelNodeSelector__Group_0_2__0__Impl rule__SourceModelNodeSelector__Group_0_2__1 ;
    public final void rule__SourceModelNodeSelector__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3088:1: ( rule__SourceModelNodeSelector__Group_0_2__0__Impl rule__SourceModelNodeSelector__Group_0_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3089:2: rule__SourceModelNodeSelector__Group_0_2__0__Impl rule__SourceModelNodeSelector__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_2__0__Impl_in_rule__SourceModelNodeSelector__Group_0_2__06342);
            rule__SourceModelNodeSelector__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_2__1_in_rule__SourceModelNodeSelector__Group_0_2__06345);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3096:1: rule__SourceModelNodeSelector__Group_0_2__0__Impl : ( '/' ) ;
    public final void rule__SourceModelNodeSelector__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3100:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3101:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3101:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3102:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getSolidusKeyword_0_2_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__SourceModelNodeSelector__Group_0_2__0__Impl6373); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3115:1: rule__SourceModelNodeSelector__Group_0_2__1 : rule__SourceModelNodeSelector__Group_0_2__1__Impl ;
    public final void rule__SourceModelNodeSelector__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3119:1: ( rule__SourceModelNodeSelector__Group_0_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3120:2: rule__SourceModelNodeSelector__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_2__1__Impl_in_rule__SourceModelNodeSelector__Group_0_2__16404);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3126:1: rule__SourceModelNodeSelector__Group_0_2__1__Impl : ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 ) ) ;
    public final void rule__SourceModelNodeSelector__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3130:1: ( ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3131:1: ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3131:1: ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3132:1: ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyAssignment_0_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3133:1: ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3133:2: rule__SourceModelNodeSelector__PropertyAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__PropertyAssignment_0_2_1_in_rule__SourceModelNodeSelector__Group_0_2__1__Impl6431);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3147:1: rule__SourceModelNodeSelector__Group_1__0 : rule__SourceModelNodeSelector__Group_1__0__Impl rule__SourceModelNodeSelector__Group_1__1 ;
    public final void rule__SourceModelNodeSelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3151:1: ( rule__SourceModelNodeSelector__Group_1__0__Impl rule__SourceModelNodeSelector__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3152:2: rule__SourceModelNodeSelector__Group_1__0__Impl rule__SourceModelNodeSelector__Group_1__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__0__Impl_in_rule__SourceModelNodeSelector__Group_1__06465);
            rule__SourceModelNodeSelector__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__1_in_rule__SourceModelNodeSelector__Group_1__06468);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3159:1: rule__SourceModelNodeSelector__Group_1__0__Impl : ( () ) ;
    public final void rule__SourceModelNodeSelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3163:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3164:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3164:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3165:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getSourceModelNodeSelectorAction_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3166:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3168:1: 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3178:1: rule__SourceModelNodeSelector__Group_1__1 : rule__SourceModelNodeSelector__Group_1__1__Impl ;
    public final void rule__SourceModelNodeSelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3182:1: ( rule__SourceModelNodeSelector__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3183:2: rule__SourceModelNodeSelector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__1__Impl_in_rule__SourceModelNodeSelector__Group_1__16526);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3189:1: rule__SourceModelNodeSelector__Group_1__1__Impl : ( 'null' ) ;
    public final void rule__SourceModelNodeSelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3193:1: ( ( 'null' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3194:1: ( 'null' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3194:1: ( 'null' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3195:1: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getNullKeyword_1_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__SourceModelNodeSelector__Group_1__1__Impl6554); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3212:1: rule__TargetModelNodeType__Group__0 : rule__TargetModelNodeType__Group__0__Impl rule__TargetModelNodeType__Group__1 ;
    public final void rule__TargetModelNodeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3216:1: ( rule__TargetModelNodeType__Group__0__Impl rule__TargetModelNodeType__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3217:2: rule__TargetModelNodeType__Group__0__Impl rule__TargetModelNodeType__Group__1
            {
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__0__Impl_in_rule__TargetModelNodeType__Group__06589);
            rule__TargetModelNodeType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__1_in_rule__TargetModelNodeType__Group__06592);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3224:1: rule__TargetModelNodeType__Group__0__Impl : ( () ) ;
    public final void rule__TargetModelNodeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3228:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3229:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3229:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3230:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getTargetModelNodeTypeAction_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3231:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3233:1: 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3243:1: rule__TargetModelNodeType__Group__1 : rule__TargetModelNodeType__Group__1__Impl ;
    public final void rule__TargetModelNodeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3247:1: ( rule__TargetModelNodeType__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3248:2: rule__TargetModelNodeType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__1__Impl_in_rule__TargetModelNodeType__Group__16650);
            rule__TargetModelNodeType__Group__1__Impl();

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3254:1: rule__TargetModelNodeType__Group__1__Impl : ( ( rule__TargetModelNodeType__ReferenceAssignment_1 )? ) ;
    public final void rule__TargetModelNodeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3258:1: ( ( ( rule__TargetModelNodeType__ReferenceAssignment_1 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3259:1: ( ( rule__TargetModelNodeType__ReferenceAssignment_1 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3259:1: ( ( rule__TargetModelNodeType__ReferenceAssignment_1 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3260:1: ( rule__TargetModelNodeType__ReferenceAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3261:1: ( rule__TargetModelNodeType__ReferenceAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3261:2: rule__TargetModelNodeType__ReferenceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TargetModelNodeType__ReferenceAssignment_1_in_rule__TargetModelNodeType__Group__1__Impl6677);
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


    // $ANTLR start "rule__ModelNodeType__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3275:1: rule__ModelNodeType__Group__0 : rule__ModelNodeType__Group__0__Impl rule__ModelNodeType__Group__1 ;
    public final void rule__ModelNodeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3279:1: ( rule__ModelNodeType__Group__0__Impl rule__ModelNodeType__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3280:2: rule__ModelNodeType__Group__0__Impl rule__ModelNodeType__Group__1
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__0__Impl_in_rule__ModelNodeType__Group__06712);
            rule__ModelNodeType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelNodeType__Group__1_in_rule__ModelNodeType__Group__06715);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3287:1: rule__ModelNodeType__Group__0__Impl : ( ( rule__ModelNodeType__TargetAssignment_0 ) ) ;
    public final void rule__ModelNodeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3291:1: ( ( ( rule__ModelNodeType__TargetAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3292:1: ( ( rule__ModelNodeType__TargetAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3292:1: ( ( rule__ModelNodeType__TargetAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3293:1: ( rule__ModelNodeType__TargetAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTargetAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3294:1: ( rule__ModelNodeType__TargetAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3294:2: rule__ModelNodeType__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__ModelNodeType__TargetAssignment_0_in_rule__ModelNodeType__Group__0__Impl6742);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3304:1: rule__ModelNodeType__Group__1 : rule__ModelNodeType__Group__1__Impl rule__ModelNodeType__Group__2 ;
    public final void rule__ModelNodeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3308:1: ( rule__ModelNodeType__Group__1__Impl rule__ModelNodeType__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3309:2: rule__ModelNodeType__Group__1__Impl rule__ModelNodeType__Group__2
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__1__Impl_in_rule__ModelNodeType__Group__16772);
            rule__ModelNodeType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelNodeType__Group__2_in_rule__ModelNodeType__Group__16775);
            rule__ModelNodeType__Group__2();

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3316:1: rule__ModelNodeType__Group__1__Impl : ( ( rule__ModelNodeType__Group_1__0 )? ) ;
    public final void rule__ModelNodeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3320:1: ( ( ( rule__ModelNodeType__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3321:1: ( ( rule__ModelNodeType__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3321:1: ( ( rule__ModelNodeType__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3322:1: ( rule__ModelNodeType__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3323:1: ( rule__ModelNodeType__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3323:2: rule__ModelNodeType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ModelNodeType__Group_1__0_in_rule__ModelNodeType__Group__1__Impl6802);
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


    // $ANTLR start "rule__ModelNodeType__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3333:1: rule__ModelNodeType__Group__2 : rule__ModelNodeType__Group__2__Impl ;
    public final void rule__ModelNodeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3337:1: ( rule__ModelNodeType__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3338:2: rule__ModelNodeType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__2__Impl_in_rule__ModelNodeType__Group__26833);
            rule__ModelNodeType__Group__2__Impl();

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
    // $ANTLR end "rule__ModelNodeType__Group__2"


    // $ANTLR start "rule__ModelNodeType__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3344:1: rule__ModelNodeType__Group__2__Impl : ( ( rule__ModelNodeType__CollectionAssignment_2 )? ) ;
    public final void rule__ModelNodeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3348:1: ( ( ( rule__ModelNodeType__CollectionAssignment_2 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3349:1: ( ( rule__ModelNodeType__CollectionAssignment_2 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3349:1: ( ( rule__ModelNodeType__CollectionAssignment_2 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3350:1: ( rule__ModelNodeType__CollectionAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getCollectionAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3351:1: ( rule__ModelNodeType__CollectionAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==51) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3351:2: rule__ModelNodeType__CollectionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ModelNodeType__CollectionAssignment_2_in_rule__ModelNodeType__Group__2__Impl6860);
                    rule__ModelNodeType__CollectionAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getCollectionAssignment_2()); 
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
    // $ANTLR end "rule__ModelNodeType__Group__2__Impl"


    // $ANTLR start "rule__ModelNodeType__Group_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3367:1: rule__ModelNodeType__Group_1__0 : rule__ModelNodeType__Group_1__0__Impl rule__ModelNodeType__Group_1__1 ;
    public final void rule__ModelNodeType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3371:1: ( rule__ModelNodeType__Group_1__0__Impl rule__ModelNodeType__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3372:2: rule__ModelNodeType__Group_1__0__Impl rule__ModelNodeType__Group_1__1
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group_1__0__Impl_in_rule__ModelNodeType__Group_1__06897);
            rule__ModelNodeType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelNodeType__Group_1__1_in_rule__ModelNodeType__Group_1__06900);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3379:1: rule__ModelNodeType__Group_1__0__Impl : ( '/' ) ;
    public final void rule__ModelNodeType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3383:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3384:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3384:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3385:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getSolidusKeyword_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__ModelNodeType__Group_1__0__Impl6928); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3398:1: rule__ModelNodeType__Group_1__1 : rule__ModelNodeType__Group_1__1__Impl ;
    public final void rule__ModelNodeType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3402:1: ( rule__ModelNodeType__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3403:2: rule__ModelNodeType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group_1__1__Impl_in_rule__ModelNodeType__Group_1__16959);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3409:1: rule__ModelNodeType__Group_1__1__Impl : ( ( rule__ModelNodeType__PropertyAssignment_1_1 ) ) ;
    public final void rule__ModelNodeType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3413:1: ( ( ( rule__ModelNodeType__PropertyAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3414:1: ( ( rule__ModelNodeType__PropertyAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3414:1: ( ( rule__ModelNodeType__PropertyAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3415:1: ( rule__ModelNodeType__PropertyAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getPropertyAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3416:1: ( rule__ModelNodeType__PropertyAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3416:2: rule__ModelNodeType__PropertyAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ModelNodeType__PropertyAssignment_1_1_in_rule__ModelNodeType__Group_1__1__Impl6986);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3430:1: rule__NodeProperty__Group__0 : rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1 ;
    public final void rule__NodeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3434:1: ( rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3435:2: rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__0__Impl_in_rule__NodeProperty__Group__07020);
            rule__NodeProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group__1_in_rule__NodeProperty__Group__07023);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3442:1: rule__NodeProperty__Group__0__Impl : ( ( rule__NodeProperty__PropertyAssignment_0 ) ) ;
    public final void rule__NodeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3446:1: ( ( ( rule__NodeProperty__PropertyAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3447:1: ( ( rule__NodeProperty__PropertyAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3447:1: ( ( rule__NodeProperty__PropertyAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3448:1: ( rule__NodeProperty__PropertyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3449:1: ( rule__NodeProperty__PropertyAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3449:2: rule__NodeProperty__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__NodeProperty__PropertyAssignment_0_in_rule__NodeProperty__Group__0__Impl7050);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3459:1: rule__NodeProperty__Group__1 : rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2 ;
    public final void rule__NodeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3463:1: ( rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3464:2: rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__1__Impl_in_rule__NodeProperty__Group__17080);
            rule__NodeProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group__2_in_rule__NodeProperty__Group__17083);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3471:1: rule__NodeProperty__Group__1__Impl : ( ( rule__NodeProperty__Group_1__0 )? ) ;
    public final void rule__NodeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3475:1: ( ( ( rule__NodeProperty__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3476:1: ( ( rule__NodeProperty__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3476:1: ( ( rule__NodeProperty__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3477:1: ( rule__NodeProperty__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3478:1: ( rule__NodeProperty__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3478:2: rule__NodeProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NodeProperty__Group_1__0_in_rule__NodeProperty__Group__1__Impl7110);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3488:1: rule__NodeProperty__Group__2 : rule__NodeProperty__Group__2__Impl ;
    public final void rule__NodeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3492:1: ( rule__NodeProperty__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3493:2: rule__NodeProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__2__Impl_in_rule__NodeProperty__Group__27141);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3499:1: rule__NodeProperty__Group__2__Impl : ( ( rule__NodeProperty__Group_2__0 )? ) ;
    public final void rule__NodeProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3503:1: ( ( ( rule__NodeProperty__Group_2__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3504:1: ( ( rule__NodeProperty__Group_2__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3504:1: ( ( rule__NodeProperty__Group_2__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3505:1: ( rule__NodeProperty__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3506:1: ( rule__NodeProperty__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3506:2: rule__NodeProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NodeProperty__Group_2__0_in_rule__NodeProperty__Group__2__Impl7168);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3522:1: rule__NodeProperty__Group_1__0 : rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1 ;
    public final void rule__NodeProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3526:1: ( rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3527:2: rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__0__Impl_in_rule__NodeProperty__Group_1__07205);
            rule__NodeProperty__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__1_in_rule__NodeProperty__Group_1__07208);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3534:1: rule__NodeProperty__Group_1__0__Impl : ( '[' ) ;
    public final void rule__NodeProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3538:1: ( ( '[' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3539:1: ( '[' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3539:1: ( '[' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3540:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__NodeProperty__Group_1__0__Impl7236); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3553:1: rule__NodeProperty__Group_1__1 : rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2 ;
    public final void rule__NodeProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3557:1: ( rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3558:2: rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__1__Impl_in_rule__NodeProperty__Group_1__17267);
            rule__NodeProperty__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__2_in_rule__NodeProperty__Group_1__17270);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3565:1: rule__NodeProperty__Group_1__1__Impl : ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) ) ;
    public final void rule__NodeProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3569:1: ( ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3570:1: ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3570:1: ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3571:1: ( rule__NodeProperty__ConstraintAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getConstraintAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3572:1: ( rule__NodeProperty__ConstraintAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3572:2: rule__NodeProperty__ConstraintAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NodeProperty__ConstraintAssignment_1_1_in_rule__NodeProperty__Group_1__1__Impl7297);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3582:1: rule__NodeProperty__Group_1__2 : rule__NodeProperty__Group_1__2__Impl ;
    public final void rule__NodeProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3586:1: ( rule__NodeProperty__Group_1__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3587:2: rule__NodeProperty__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__2__Impl_in_rule__NodeProperty__Group_1__27327);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3593:1: rule__NodeProperty__Group_1__2__Impl : ( ']' ) ;
    public final void rule__NodeProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3597:1: ( ( ']' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3598:1: ( ']' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3598:1: ( ']' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3599:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,41,FOLLOW_41_in_rule__NodeProperty__Group_1__2__Impl7355); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3618:1: rule__NodeProperty__Group_2__0 : rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1 ;
    public final void rule__NodeProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3622:1: ( rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3623:2: rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__0__Impl_in_rule__NodeProperty__Group_2__07392);
            rule__NodeProperty__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__1_in_rule__NodeProperty__Group_2__07395);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3630:1: rule__NodeProperty__Group_2__0__Impl : ( '/' ) ;
    public final void rule__NodeProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3634:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3635:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3635:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3636:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSolidusKeyword_2_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__NodeProperty__Group_2__0__Impl7423); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3649:1: rule__NodeProperty__Group_2__1 : rule__NodeProperty__Group_2__1__Impl ;
    public final void rule__NodeProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3653:1: ( rule__NodeProperty__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3654:2: rule__NodeProperty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__1__Impl_in_rule__NodeProperty__Group_2__17454);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3660:1: rule__NodeProperty__Group_2__1__Impl : ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) ) ;
    public final void rule__NodeProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3664:1: ( ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3665:1: ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3665:1: ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3666:1: ( rule__NodeProperty__SubPropertyAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSubPropertyAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3667:1: ( rule__NodeProperty__SubPropertyAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3667:2: rule__NodeProperty__SubPropertyAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NodeProperty__SubPropertyAssignment_2_1_in_rule__NodeProperty__Group_2__1__Impl7481);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3681:1: rule__ConstraintExpression__Group__0 : rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 ;
    public final void rule__ConstraintExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3685:1: ( rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3686:2: rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__07515);
            rule__ConstraintExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__07518);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3693:1: rule__ConstraintExpression__Group__0__Impl : ( ruleCompareExpression ) ;
    public final void rule__ConstraintExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3697:1: ( ( ruleCompareExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3698:1: ( ruleCompareExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3698:1: ( ruleCompareExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3699:1: ruleCompareExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getCompareExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_rule__ConstraintExpression__Group__0__Impl7545);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3710:1: rule__ConstraintExpression__Group__1 : rule__ConstraintExpression__Group__1__Impl ;
    public final void rule__ConstraintExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3714:1: ( rule__ConstraintExpression__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3715:2: rule__ConstraintExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__17574);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3721:1: rule__ConstraintExpression__Group__1__Impl : ( ( rule__ConstraintExpression__Group_1__0 )? ) ;
    public final void rule__ConstraintExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3725:1: ( ( ( rule__ConstraintExpression__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3726:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3726:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3727:1: ( rule__ConstraintExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3728:1: ( rule__ConstraintExpression__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred42_InternalArchitecture()) ) {
                    alt31=1;
                }
            }
            else if ( (LA31_0==19) ) {
                int LA31_2 = input.LA(2);

                if ( (synpred42_InternalArchitecture()) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3728:2: rule__ConstraintExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl7601);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3742:1: rule__ConstraintExpression__Group_1__0 : rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 ;
    public final void rule__ConstraintExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3746:1: ( rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3747:2: rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__07636);
            rule__ConstraintExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__07639);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3754:1: rule__ConstraintExpression__Group_1__0__Impl : ( ( rule__ConstraintExpression__Group_1_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3758:1: ( ( ( rule__ConstraintExpression__Group_1_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3759:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3759:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3760:1: ( rule__ConstraintExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3761:1: ( rule__ConstraintExpression__Group_1_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3761:2: rule__ConstraintExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl7666);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3771:1: rule__ConstraintExpression__Group_1__1 : rule__ConstraintExpression__Group_1__1__Impl ;
    public final void rule__ConstraintExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3775:1: ( rule__ConstraintExpression__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3776:2: rule__ConstraintExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__17696);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3782:1: rule__ConstraintExpression__Group_1__1__Impl : ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3786:1: ( ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3787:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3787:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3788:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3789:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3789:2: rule__ConstraintExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl7723);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3803:1: rule__ConstraintExpression__Group_1_0__0 : rule__ConstraintExpression__Group_1_0__0__Impl ;
    public final void rule__ConstraintExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3807:1: ( rule__ConstraintExpression__Group_1_0__0__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3808:2: rule__ConstraintExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__07757);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3814:1: rule__ConstraintExpression__Group_1_0__0__Impl : ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3818:1: ( ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3819:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3819:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3820:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3821:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3821:2: rule__ConstraintExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl7784);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3833:1: rule__ConstraintExpression__Group_1_0_0__0 : rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 ;
    public final void rule__ConstraintExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3837:1: ( rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3838:2: rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__07816);
            rule__ConstraintExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__07819);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3845:1: rule__ConstraintExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3849:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3850:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3850:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3851:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3852:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3854:1: 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3864:1: rule__ConstraintExpression__Group_1_0_0__1 : rule__ConstraintExpression__Group_1_0_0__1__Impl ;
    public final void rule__ConstraintExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3868:1: ( rule__ConstraintExpression__Group_1_0_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3869:2: rule__ConstraintExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__17877);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3875:1: rule__ConstraintExpression__Group_1_0_0__1__Impl : ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3879:1: ( ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3880:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3880:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3881:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3882:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3882:2: rule__ConstraintExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl7904);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3896:1: rule__CompareExpression__Group__0 : rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 ;
    public final void rule__CompareExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3900:1: ( rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3901:2: rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__07938);
            rule__CompareExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__07941);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3908:1: rule__CompareExpression__Group__0__Impl : ( ruleBasicConstraint ) ;
    public final void rule__CompareExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3912:1: ( ( ruleBasicConstraint ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3913:1: ( ruleBasicConstraint )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3913:1: ( ruleBasicConstraint )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3914:1: ruleBasicConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getBasicConstraintParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__Group__0__Impl7968);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3925:1: rule__CompareExpression__Group__1 : rule__CompareExpression__Group__1__Impl ;
    public final void rule__CompareExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3929:1: ( rule__CompareExpression__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3930:2: rule__CompareExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__17997);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3936:1: rule__CompareExpression__Group__1__Impl : ( ( rule__CompareExpression__Group_1__0 )? ) ;
    public final void rule__CompareExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3940:1: ( ( ( rule__CompareExpression__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3941:1: ( ( rule__CompareExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3941:1: ( ( rule__CompareExpression__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3942:1: ( rule__CompareExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3943:1: ( rule__CompareExpression__Group_1__0 )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3943:2: rule__CompareExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl8024);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3957:1: rule__CompareExpression__Group_1__0 : rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 ;
    public final void rule__CompareExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3961:1: ( rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3962:2: rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__08059);
            rule__CompareExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__08062);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3969:1: rule__CompareExpression__Group_1__0__Impl : ( ( rule__CompareExpression__Group_1_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3973:1: ( ( ( rule__CompareExpression__Group_1_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3974:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3974:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3975:1: ( rule__CompareExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3976:1: ( rule__CompareExpression__Group_1_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3976:2: rule__CompareExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl8089);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3986:1: rule__CompareExpression__Group_1__1 : rule__CompareExpression__Group_1__1__Impl ;
    public final void rule__CompareExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3990:1: ( rule__CompareExpression__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3991:2: rule__CompareExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__18119);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3997:1: rule__CompareExpression__Group_1__1__Impl : ( ( rule__CompareExpression__RightAssignment_1_1 ) ) ;
    public final void rule__CompareExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4001:1: ( ( ( rule__CompareExpression__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4002:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4002:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4003:1: ( rule__CompareExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4004:1: ( rule__CompareExpression__RightAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4004:2: rule__CompareExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl8146);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4018:1: rule__CompareExpression__Group_1_0__0 : rule__CompareExpression__Group_1_0__0__Impl ;
    public final void rule__CompareExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4022:1: ( rule__CompareExpression__Group_1_0__0__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4023:2: rule__CompareExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__08180);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4029:1: rule__CompareExpression__Group_1_0__0__Impl : ( ( rule__CompareExpression__Group_1_0_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4033:1: ( ( ( rule__CompareExpression__Group_1_0_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4034:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4034:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4035:1: ( rule__CompareExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4036:1: ( rule__CompareExpression__Group_1_0_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4036:2: rule__CompareExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl8207);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4048:1: rule__CompareExpression__Group_1_0_0__0 : rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 ;
    public final void rule__CompareExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4052:1: ( rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4053:2: rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__08239);
            rule__CompareExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__08242);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4060:1: rule__CompareExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__CompareExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4064:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4065:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4065:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4066:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4067:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4069:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4079:1: rule__CompareExpression__Group_1_0_0__1 : rule__CompareExpression__Group_1_0_0__1__Impl ;
    public final void rule__CompareExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4083:1: ( rule__CompareExpression__Group_1_0_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4084:2: rule__CompareExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__18300);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4090:1: rule__CompareExpression__Group_1_0_0__1__Impl : ( ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 ) ) ;
    public final void rule__CompareExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4094:1: ( ( ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4095:1: ( ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4095:1: ( ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4096:1: ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getComparatorAssignment_1_0_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4097:1: ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4097:2: rule__CompareExpression__ComparatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__ComparatorAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl8327);
            rule__CompareExpression__ComparatorAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getComparatorAssignment_1_0_0_1()); 
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


    // $ANTLR start "rule__Negation__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4111:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4115:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4116:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__08361);
            rule__Negation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__08364);
            rule__Negation__Group__1();

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
    // $ANTLR end "rule__Negation__Group__0"


    // $ANTLR start "rule__Negation__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4123:1: rule__Negation__Group__0__Impl : ( '!' ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4127:1: ( ( '!' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4128:1: ( '!' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4128:1: ( '!' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4129:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Negation__Group__0__Impl8392); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 
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
    // $ANTLR end "rule__Negation__Group__0__Impl"


    // $ANTLR start "rule__Negation__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4142:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4146:1: ( rule__Negation__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4147:2: rule__Negation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__18423);
            rule__Negation__Group__1__Impl();

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
    // $ANTLR end "rule__Negation__Group__1"


    // $ANTLR start "rule__Negation__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4153:1: rule__Negation__Group__1__Impl : ( ( rule__Negation__ConstraintAssignment_1 ) ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4157:1: ( ( ( rule__Negation__ConstraintAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4158:1: ( ( rule__Negation__ConstraintAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4158:1: ( ( rule__Negation__ConstraintAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4159:1: ( rule__Negation__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getConstraintAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4160:1: ( rule__Negation__ConstraintAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4160:2: rule__Negation__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__Negation__ConstraintAssignment_1_in_rule__Negation__Group__1__Impl8450);
            rule__Negation__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getConstraintAssignment_1()); 
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
    // $ANTLR end "rule__Negation__Group__1__Impl"


    // $ANTLR start "rule__ParenthesisConstraint__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4174:1: rule__ParenthesisConstraint__Group__0 : rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 ;
    public final void rule__ParenthesisConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4178:1: ( rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4179:2: rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__08484);
            rule__ParenthesisConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__08487);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4186:1: rule__ParenthesisConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4190:1: ( ( '(' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4191:1: ( '(' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4191:1: ( '(' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4192:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__ParenthesisConstraint__Group__0__Impl8515); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4205:1: rule__ParenthesisConstraint__Group__1 : rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 ;
    public final void rule__ParenthesisConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4209:1: ( rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4210:2: rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__18546);
            rule__ParenthesisConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__18549);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4217:1: rule__ParenthesisConstraint__Group__1__Impl : ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__ParenthesisConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4221:1: ( ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4222:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4222:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4223:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4224:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4224:2: rule__ParenthesisConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl8576);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4234:1: rule__ParenthesisConstraint__Group__2 : rule__ParenthesisConstraint__Group__2__Impl ;
    public final void rule__ParenthesisConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4238:1: ( rule__ParenthesisConstraint__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4239:2: rule__ParenthesisConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__28606);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4245:1: rule__ParenthesisConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4249:1: ( ( ')' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4250:1: ( ')' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4250:1: ( ')' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4251:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__ParenthesisConstraint__Group__2__Impl8634); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4270:1: rule__Typeof__Group__0 : rule__Typeof__Group__0__Impl rule__Typeof__Group__1 ;
    public final void rule__Typeof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4274:1: ( rule__Typeof__Group__0__Impl rule__Typeof__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4275:2: rule__Typeof__Group__0__Impl rule__Typeof__Group__1
            {
            pushFollow(FOLLOW_rule__Typeof__Group__0__Impl_in_rule__Typeof__Group__08671);
            rule__Typeof__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typeof__Group__1_in_rule__Typeof__Group__08674);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4282:1: rule__Typeof__Group__0__Impl : ( 'typeof' ) ;
    public final void rule__Typeof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4286:1: ( ( 'typeof' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4287:1: ( 'typeof' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4287:1: ( 'typeof' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4288:1: 'typeof'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getTypeofKeyword_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Typeof__Group__0__Impl8702); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4301:1: rule__Typeof__Group__1 : rule__Typeof__Group__1__Impl ;
    public final void rule__Typeof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4305:1: ( rule__Typeof__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4306:2: rule__Typeof__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Typeof__Group__1__Impl_in_rule__Typeof__Group__18733);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4312:1: rule__Typeof__Group__1__Impl : ( ( rule__Typeof__TypeAssignment_1 ) ) ;
    public final void rule__Typeof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4316:1: ( ( ( rule__Typeof__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4317:1: ( ( rule__Typeof__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4317:1: ( ( rule__Typeof__TypeAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4318:1: ( rule__Typeof__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4319:1: ( rule__Typeof__TypeAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4319:2: rule__Typeof__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Typeof__TypeAssignment_1_in_rule__Typeof__Group__1__Impl8760);
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


    // $ANTLR start "rule__TargetTraceModel__Group_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4333:1: rule__TargetTraceModel__Group_1__0 : rule__TargetTraceModel__Group_1__0__Impl rule__TargetTraceModel__Group_1__1 ;
    public final void rule__TargetTraceModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4337:1: ( rule__TargetTraceModel__Group_1__0__Impl rule__TargetTraceModel__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4338:2: rule__TargetTraceModel__Group_1__0__Impl rule__TargetTraceModel__Group_1__1
            {
            pushFollow(FOLLOW_rule__TargetTraceModel__Group_1__0__Impl_in_rule__TargetTraceModel__Group_1__08794);
            rule__TargetTraceModel__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetTraceModel__Group_1__1_in_rule__TargetTraceModel__Group_1__08797);
            rule__TargetTraceModel__Group_1__1();

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
    // $ANTLR end "rule__TargetTraceModel__Group_1__0"


    // $ANTLR start "rule__TargetTraceModel__Group_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4345:1: rule__TargetTraceModel__Group_1__0__Impl : ( 'use' ) ;
    public final void rule__TargetTraceModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4349:1: ( ( 'use' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4350:1: ( 'use' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4350:1: ( 'use' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4351:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetTraceModelAccess().getUseKeyword_1_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__TargetTraceModel__Group_1__0__Impl8825); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetTraceModelAccess().getUseKeyword_1_0()); 
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
    // $ANTLR end "rule__TargetTraceModel__Group_1__0__Impl"


    // $ANTLR start "rule__TargetTraceModel__Group_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4364:1: rule__TargetTraceModel__Group_1__1 : rule__TargetTraceModel__Group_1__1__Impl ;
    public final void rule__TargetTraceModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4368:1: ( rule__TargetTraceModel__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4369:2: rule__TargetTraceModel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TargetTraceModel__Group_1__1__Impl_in_rule__TargetTraceModel__Group_1__18856);
            rule__TargetTraceModel__Group_1__1__Impl();

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
    // $ANTLR end "rule__TargetTraceModel__Group_1__1"


    // $ANTLR start "rule__TargetTraceModel__Group_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4375:1: rule__TargetTraceModel__Group_1__1__Impl : ( ruleTraceModelReference ) ;
    public final void rule__TargetTraceModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4379:1: ( ( ruleTraceModelReference ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4380:1: ( ruleTraceModelReference )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4380:1: ( ruleTraceModelReference )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4381:1: ruleTraceModelReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetTraceModelAccess().getTraceModelReferenceParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleTraceModelReference_in_rule__TargetTraceModel__Group_1__1__Impl8883);
            ruleTraceModelReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetTraceModelAccess().getTraceModelReferenceParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__TargetTraceModel__Group_1__1__Impl"


    // $ANTLR start "rule__TraceModel__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4396:1: rule__TraceModel__Group__0 : rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1 ;
    public final void rule__TraceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4400:1: ( rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4401:2: rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__0__Impl_in_rule__TraceModel__Group__08916);
            rule__TraceModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__1_in_rule__TraceModel__Group__08919);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4408:1: rule__TraceModel__Group__0__Impl : ( ( rule__TraceModel__NameAssignment_0 ) ) ;
    public final void rule__TraceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4412:1: ( ( ( rule__TraceModel__NameAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4413:1: ( ( rule__TraceModel__NameAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4413:1: ( ( rule__TraceModel__NameAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4414:1: ( rule__TraceModel__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNameAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4415:1: ( rule__TraceModel__NameAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4415:2: rule__TraceModel__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TraceModel__NameAssignment_0_in_rule__TraceModel__Group__0__Impl8946);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4425:1: rule__TraceModel__Group__1 : rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2 ;
    public final void rule__TraceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4429:1: ( rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4430:2: rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__1__Impl_in_rule__TraceModel__Group__18976);
            rule__TraceModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__2_in_rule__TraceModel__Group__18979);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4437:1: rule__TraceModel__Group__1__Impl : ( '<' ) ;
    public final void rule__TraceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4441:1: ( ( '<' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4442:1: ( '<' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4442:1: ( '<' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4443:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getLessThanSignKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__TraceModel__Group__1__Impl9007); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4456:1: rule__TraceModel__Group__2 : rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3 ;
    public final void rule__TraceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4460:1: ( rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4461:2: rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__2__Impl_in_rule__TraceModel__Group__29038);
            rule__TraceModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__3_in_rule__TraceModel__Group__29041);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4468:1: rule__TraceModel__Group__2__Impl : ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) ) ;
    public final void rule__TraceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4472:1: ( ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4473:1: ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4473:1: ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4474:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4474:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4475:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4476:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4476:2: rule__TraceModel__NodeSetRelationsAssignment_2
            {
            pushFollow(FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl9070);
            rule__TraceModel__NodeSetRelationsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }

            }

            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4479:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4480:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4481:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==36) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4481:2: rule__TraceModel__NodeSetRelationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl9082);
            	    rule__TraceModel__NodeSetRelationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4492:1: rule__TraceModel__Group__3 : rule__TraceModel__Group__3__Impl ;
    public final void rule__TraceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4496:1: ( rule__TraceModel__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4497:2: rule__TraceModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__3__Impl_in_rule__TraceModel__Group__39115);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4503:1: rule__TraceModel__Group__3__Impl : ( '>' ) ;
    public final void rule__TraceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4507:1: ( ( '>' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4508:1: ( '>' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4508:1: ( '>' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4509:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__TraceModel__Group__3__Impl9143); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4530:1: rule__NodeSetRelation__Group__0 : rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1 ;
    public final void rule__NodeSetRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4534:1: ( rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4535:2: rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__0__Impl_in_rule__NodeSetRelation__Group__09182);
            rule__NodeSetRelation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__1_in_rule__NodeSetRelation__Group__09185);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4542:1: rule__NodeSetRelation__Group__0__Impl : ( '(' ) ;
    public final void rule__NodeSetRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4546:1: ( ( '(' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4547:1: ( '(' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4547:1: ( '(' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4548:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__NodeSetRelation__Group__0__Impl9213); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4561:1: rule__NodeSetRelation__Group__1 : rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2 ;
    public final void rule__NodeSetRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4565:1: ( rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4566:2: rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__1__Impl_in_rule__NodeSetRelation__Group__19244);
            rule__NodeSetRelation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__2_in_rule__NodeSetRelation__Group__19247);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4573:1: rule__NodeSetRelation__Group__1__Impl : ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) ) ;
    public final void rule__NodeSetRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4577:1: ( ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4578:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4578:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4579:1: ( rule__NodeSetRelation__SourceNodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4580:1: ( rule__NodeSetRelation__SourceNodesAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4580:2: rule__NodeSetRelation__SourceNodesAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_1_in_rule__NodeSetRelation__Group__1__Impl9274);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4590:1: rule__NodeSetRelation__Group__2 : rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3 ;
    public final void rule__NodeSetRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4594:1: ( rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4595:2: rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__2__Impl_in_rule__NodeSetRelation__Group__29304);
            rule__NodeSetRelation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__3_in_rule__NodeSetRelation__Group__29307);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4602:1: rule__NodeSetRelation__Group__2__Impl : ( ( rule__NodeSetRelation__Group_2__0 )* ) ;
    public final void rule__NodeSetRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4606:1: ( ( ( rule__NodeSetRelation__Group_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4607:1: ( ( rule__NodeSetRelation__Group_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4607:1: ( ( rule__NodeSetRelation__Group_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4608:1: ( rule__NodeSetRelation__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4609:1: ( rule__NodeSetRelation__Group_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==30) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4609:2: rule__NodeSetRelation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__0_in_rule__NodeSetRelation__Group__2__Impl9334);
            	    rule__NodeSetRelation__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4619:1: rule__NodeSetRelation__Group__3 : rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4 ;
    public final void rule__NodeSetRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4623:1: ( rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4624:2: rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__3__Impl_in_rule__NodeSetRelation__Group__39365);
            rule__NodeSetRelation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__4_in_rule__NodeSetRelation__Group__39368);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4631:1: rule__NodeSetRelation__Group__3__Impl : ( ':' ) ;
    public final void rule__NodeSetRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4635:1: ( ( ':' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4636:1: ( ':' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4636:1: ( ':' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4637:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getColonKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__NodeSetRelation__Group__3__Impl9396); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4650:1: rule__NodeSetRelation__Group__4 : rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5 ;
    public final void rule__NodeSetRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4654:1: ( rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4655:2: rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__4__Impl_in_rule__NodeSetRelation__Group__49427);
            rule__NodeSetRelation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__5_in_rule__NodeSetRelation__Group__49430);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4662:1: rule__NodeSetRelation__Group__4__Impl : ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) ) ;
    public final void rule__NodeSetRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4666:1: ( ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4667:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4667:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4668:1: ( rule__NodeSetRelation__TargetNodesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4669:1: ( rule__NodeSetRelation__TargetNodesAssignment_4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4669:2: rule__NodeSetRelation__TargetNodesAssignment_4
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_4_in_rule__NodeSetRelation__Group__4__Impl9457);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4679:1: rule__NodeSetRelation__Group__5 : rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6 ;
    public final void rule__NodeSetRelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4683:1: ( rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4684:2: rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__5__Impl_in_rule__NodeSetRelation__Group__59487);
            rule__NodeSetRelation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__6_in_rule__NodeSetRelation__Group__59490);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4691:1: rule__NodeSetRelation__Group__5__Impl : ( ( rule__NodeSetRelation__Group_5__0 )* ) ;
    public final void rule__NodeSetRelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4695:1: ( ( ( rule__NodeSetRelation__Group_5__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4696:1: ( ( rule__NodeSetRelation__Group_5__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4696:1: ( ( rule__NodeSetRelation__Group_5__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4697:1: ( rule__NodeSetRelation__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4698:1: ( rule__NodeSetRelation__Group_5__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==30) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4698:2: rule__NodeSetRelation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__0_in_rule__NodeSetRelation__Group__5__Impl9517);
            	    rule__NodeSetRelation__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4708:1: rule__NodeSetRelation__Group__6 : rule__NodeSetRelation__Group__6__Impl ;
    public final void rule__NodeSetRelation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4712:1: ( rule__NodeSetRelation__Group__6__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4713:2: rule__NodeSetRelation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__6__Impl_in_rule__NodeSetRelation__Group__69548);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4719:1: rule__NodeSetRelation__Group__6__Impl : ( ')' ) ;
    public final void rule__NodeSetRelation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4723:1: ( ( ')' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4724:1: ( ')' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4724:1: ( ')' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4725:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,37,FOLLOW_37_in_rule__NodeSetRelation__Group__6__Impl9576); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4752:1: rule__NodeSetRelation__Group_2__0 : rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1 ;
    public final void rule__NodeSetRelation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4756:1: ( rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4757:2: rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__0__Impl_in_rule__NodeSetRelation__Group_2__09621);
            rule__NodeSetRelation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__1_in_rule__NodeSetRelation__Group_2__09624);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4764:1: rule__NodeSetRelation__Group_2__0__Impl : ( ',' ) ;
    public final void rule__NodeSetRelation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4768:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4769:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4769:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4770:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getCommaKeyword_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__NodeSetRelation__Group_2__0__Impl9652); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4783:1: rule__NodeSetRelation__Group_2__1 : rule__NodeSetRelation__Group_2__1__Impl ;
    public final void rule__NodeSetRelation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4787:1: ( rule__NodeSetRelation__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4788:2: rule__NodeSetRelation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__1__Impl_in_rule__NodeSetRelation__Group_2__19683);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4794:1: rule__NodeSetRelation__Group_2__1__Impl : ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) ) ;
    public final void rule__NodeSetRelation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4798:1: ( ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4799:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4799:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4800:1: ( rule__NodeSetRelation__SourceNodesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4801:1: ( rule__NodeSetRelation__SourceNodesAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4801:2: rule__NodeSetRelation__SourceNodesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_2_1_in_rule__NodeSetRelation__Group_2__1__Impl9710);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4815:1: rule__NodeSetRelation__Group_5__0 : rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1 ;
    public final void rule__NodeSetRelation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4819:1: ( rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4820:2: rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__0__Impl_in_rule__NodeSetRelation__Group_5__09744);
            rule__NodeSetRelation__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__1_in_rule__NodeSetRelation__Group_5__09747);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4827:1: rule__NodeSetRelation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__NodeSetRelation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4831:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4832:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4832:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4833:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getCommaKeyword_5_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__NodeSetRelation__Group_5__0__Impl9775); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4846:1: rule__NodeSetRelation__Group_5__1 : rule__NodeSetRelation__Group_5__1__Impl ;
    public final void rule__NodeSetRelation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4850:1: ( rule__NodeSetRelation__Group_5__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4851:2: rule__NodeSetRelation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__1__Impl_in_rule__NodeSetRelation__Group_5__19806);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4857:1: rule__NodeSetRelation__Group_5__1__Impl : ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) ) ;
    public final void rule__NodeSetRelation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4861:1: ( ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4862:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4862:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4863:1: ( rule__NodeSetRelation__TargetNodesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_5_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4864:1: ( rule__NodeSetRelation__TargetNodesAssignment_5_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4864:2: rule__NodeSetRelation__TargetNodesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_5_1_in_rule__NodeSetRelation__Group_5__1__Impl9833);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4878:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4882:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4883:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__09867);
            rule__ArrayLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__09870);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4890:1: rule__ArrayLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4894:1: ( ( '{' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4895:1: ( '{' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4895:1: ( '{' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4896:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__ArrayLiteral__Group__0__Impl9898); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4909:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4913:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4914:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__19929);
            rule__ArrayLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__19932);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4921:1: rule__ArrayLiteral__Group__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4925:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4926:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4926:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4927:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4928:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4928:2: rule__ArrayLiteral__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl9959);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4938:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4942:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4943:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__29989);
            rule__ArrayLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__29992);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4950:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__Group_2__0 )* ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4954:1: ( ( ( rule__ArrayLiteral__Group_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4955:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4955:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4956:1: ( rule__ArrayLiteral__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4957:1: ( rule__ArrayLiteral__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4957:2: rule__ArrayLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl10019);
            	    rule__ArrayLiteral__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4967:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4971:1: ( rule__ArrayLiteral__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4972:2: rule__ArrayLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__310050);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4978:1: rule__ArrayLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4982:1: ( ( '}' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4983:1: ( '}' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4983:1: ( '}' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4984:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,48,FOLLOW_48_in_rule__ArrayLiteral__Group__3__Impl10078); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5005:1: rule__ArrayLiteral__Group_2__0 : rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 ;
    public final void rule__ArrayLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5009:1: ( rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5010:2: rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__010117);
            rule__ArrayLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__010120);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5017:1: rule__ArrayLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5021:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5022:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5022:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5023:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ArrayLiteral__Group_2__0__Impl10148); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5036:1: rule__ArrayLiteral__Group_2__1 : rule__ArrayLiteral__Group_2__1__Impl ;
    public final void rule__ArrayLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5040:1: ( rule__ArrayLiteral__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5041:2: rule__ArrayLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__110179);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5047:1: rule__ArrayLiteral__Group_2__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) ;
    public final void rule__ArrayLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5051:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5052:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5052:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5053:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5054:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5054:2: rule__ArrayLiteral__LiteralsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl10206);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5068:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5072:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5073:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010240);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010243);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5080:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5084:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5085:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5085:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5086:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10270); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5097:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5101:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5102:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110299);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5108:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5112:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5113:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5113:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5114:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5115:1: ( rule__QualifiedName__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==49) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5115:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10326);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5129:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5133:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5134:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010361);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010364);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5141:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5145:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5146:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5146:1: ( ( '.' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5147:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5148:1: ( '.' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5149:2: '.'
            {
            match(input,49,FOLLOW_49_in_rule__QualifiedName__Group_1__0__Impl10393); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5160:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5164:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5165:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110425);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5171:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5175:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5176:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5176:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5177:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl10452); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5195:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5199:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5200:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5200:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5201:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_110492);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5210:1: rule__Model__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5214:1: ( ( ruleImport ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5215:1: ( ruleImport )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5215:1: ( ruleImport )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5216:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_210523);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5225:1: rule__Model__RegisteredPackagesAssignment_3 : ( ruleRegisteredPackage ) ;
    public final void rule__Model__RegisteredPackagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5229:1: ( ( ruleRegisteredPackage ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5230:1: ( ruleRegisteredPackage )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5230:1: ( ruleRegisteredPackage )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5231:1: ruleRegisteredPackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRegisteredPackagesRegisteredPackageParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_rule__Model__RegisteredPackagesAssignment_310554);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5240:1: rule__Model__MetamodelsAssignment_4 : ( ruleMetamodelSequence ) ;
    public final void rule__Model__MetamodelsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5244:1: ( ( ruleMetamodelSequence ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5245:1: ( ruleMetamodelSequence )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5245:1: ( ruleMetamodelSequence )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5246:1: ruleMetamodelSequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetamodelsMetamodelSequenceParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodelSequence_in_rule__Model__MetamodelsAssignment_410585);
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


    // $ANTLR start "rule__Model__ProcessorsAssignment_5"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5255:1: rule__Model__ProcessorsAssignment_5 : ( ruleProcessor ) ;
    public final void rule__Model__ProcessorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5259:1: ( ( ruleProcessor ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5260:1: ( ruleProcessor )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5260:1: ( ruleProcessor )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5261:1: ruleProcessor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProcessorsProcessorParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleProcessor_in_rule__Model__ProcessorsAssignment_510616);
            ruleProcessor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getProcessorsProcessorParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Model__ProcessorsAssignment_5"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5270:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5274:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5275:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5275:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5276:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5277:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5278:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceJvmTypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_110651);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceJvmTypeQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceJvmTypeCrossReference_1_0()); 
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


    // $ANTLR start "rule__MetamodelSequence__ModifierAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5289:1: rule__MetamodelSequence__ModifierAssignment_1 : ( ruleMetamodelModifier ) ;
    public final void rule__MetamodelSequence__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5293:1: ( ( ruleMetamodelModifier ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5294:1: ( ruleMetamodelModifier )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5294:1: ( ruleMetamodelModifier )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5295:1: ruleMetamodelModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getModifierMetamodelModifierEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodelModifier_in_rule__MetamodelSequence__ModifierAssignment_110686);
            ruleMetamodelModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getModifierMetamodelModifierEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__MetamodelSequence__ModifierAssignment_1"


    // $ANTLR start "rule__MetamodelSequence__TypeAssignment_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5304:1: rule__MetamodelSequence__TypeAssignment_2 : ( ruleModelNodeType ) ;
    public final void rule__MetamodelSequence__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5308:1: ( ( ruleModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5309:1: ( ruleModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5309:1: ( ruleModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5310:1: ruleModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getTypeModelNodeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleModelNodeType_in_rule__MetamodelSequence__TypeAssignment_210717);
            ruleModelNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getTypeModelNodeTypeParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__MetamodelSequence__TypeAssignment_2"


    // $ANTLR start "rule__MetamodelSequence__MetamodelsAssignment_3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5319:1: rule__MetamodelSequence__MetamodelsAssignment_3 : ( ruleMetamodel ) ;
    public final void rule__MetamodelSequence__MetamodelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5323:1: ( ( ruleMetamodel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5324:1: ( ruleMetamodel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5324:1: ( ruleMetamodel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5325:1: ruleMetamodel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_310748);
            ruleMetamodel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__MetamodelSequence__MetamodelsAssignment_3"


    // $ANTLR start "rule__MetamodelSequence__MetamodelsAssignment_4_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5334:1: rule__MetamodelSequence__MetamodelsAssignment_4_1 : ( ruleMetamodel ) ;
    public final void rule__MetamodelSequence__MetamodelsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5338:1: ( ( ruleMetamodel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5339:1: ( ruleMetamodel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5339:1: ( ruleMetamodel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5340:1: ruleMetamodel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_4_110779);
            ruleMetamodel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__MetamodelSequence__MetamodelsAssignment_4_1"


    // $ANTLR start "rule__Metamodel__NameAssignment"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5349:1: rule__Metamodel__NameAssignment : ( RULE_ID ) ;
    public final void rule__Metamodel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5353:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5354:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5354:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5355:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment10810); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5364:1: rule__RegisteredPackage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RegisteredPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5368:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5369:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5369:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5370:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_110841); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5379:1: rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegisteredPackage__ImportedNamespaceAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5383:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5384:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5384:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5385:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceJvmTypeCrossReference_2_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5386:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5387:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceJvmTypeQualifiedNameParserRuleCall_2_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RegisteredPackage__ImportedNamespaceAssignment_2_010876);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5398:1: rule__RegisteredPackage__IsTextAssignment_2_1_0 : ( ( 'text' ) ) ;
    public final void rule__RegisteredPackage__IsTextAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5402:1: ( ( ( 'text' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5403:1: ( ( 'text' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5403:1: ( ( 'text' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5404:1: ( 'text' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getIsTextTextKeyword_2_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5405:1: ( 'text' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5406:1: 'text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getIsTextTextKeyword_2_1_0_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__RegisteredPackage__IsTextAssignment_2_1_010916); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5421:1: rule__RegisteredPackage__ExtensionAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__RegisteredPackage__ExtensionAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5425:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5426:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5426:1: ( RULE_STRING )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5427:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getExtensionSTRINGTerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RegisteredPackage__ExtensionAssignment_2_1_110955); if (state.failed) return ;
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


    // $ANTLR start "rule__Weaver__ReferenceAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5436:1: rule__Weaver__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Weaver__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5440:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5441:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5441:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5442:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getReferenceJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5443:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5444:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getReferenceJvmTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Weaver__ReferenceAssignment_110990); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getReferenceJvmTypeIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getReferenceJvmTypeCrossReference_1_0()); 
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
    // $ANTLR end "rule__Weaver__ReferenceAssignment_1"


    // $ANTLR start "rule__Weaver__SourceModelAssignment_2_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5455:1: rule__Weaver__SourceModelAssignment_2_0 : ( ruleSourceModelNodeSelector ) ;
    public final void rule__Weaver__SourceModelAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5459:1: ( ( ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5460:1: ( ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5460:1: ( ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5461:1: ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_rule__Weaver__SourceModelAssignment_2_011025);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5470:1: rule__Weaver__AspectModelAssignment_3 : ( ruleAspectModel ) ;
    public final void rule__Weaver__AspectModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5474:1: ( ( ruleAspectModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5475:1: ( ruleAspectModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5475:1: ( ruleAspectModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5476:1: ruleAspectModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getAspectModelAspectModelParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAspectModel_in_rule__Weaver__AspectModelAssignment_311056);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5485:1: rule__Weaver__TargetModelAssignment_4_1 : ( ruleTargetModelNodeType ) ;
    public final void rule__Weaver__TargetModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5489:1: ( ( ruleTargetModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5490:1: ( ruleTargetModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5490:1: ( ruleTargetModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5491:1: ruleTargetModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getTargetModelTargetModelNodeTypeParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_rule__Weaver__TargetModelAssignment_4_111087);
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


    // $ANTLR start "rule__Generator__ReferenceAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5500:1: rule__Generator__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generator__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5504:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5505:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5505:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5506:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReferenceJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5507:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5508:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReferenceJvmTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generator__ReferenceAssignment_111122); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getReferenceJvmTypeIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getReferenceJvmTypeCrossReference_1_0()); 
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
    // $ANTLR end "rule__Generator__ReferenceAssignment_1"


    // $ANTLR start "rule__Generator__SourceAuxModelsAssignment_2_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5519:1: rule__Generator__SourceAuxModelsAssignment_2_1 : ( ruleSourceModelNodeSelector ) ;
    public final void rule__Generator__SourceAuxModelsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5523:1: ( ( ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5524:1: ( ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5524:1: ( ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5525:1: ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceAuxModelsSourceModelNodeSelectorParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceAuxModelsAssignment_2_111157);
            ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceAuxModelsSourceModelNodeSelectorParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Generator__SourceAuxModelsAssignment_2_1"


    // $ANTLR start "rule__Generator__SourceAuxModelsAssignment_2_2_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5534:1: rule__Generator__SourceAuxModelsAssignment_2_2_1 : ( ruleSourceModelNodeSelector ) ;
    public final void rule__Generator__SourceAuxModelsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5538:1: ( ( ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5539:1: ( ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5539:1: ( ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5540:1: ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceAuxModelsSourceModelNodeSelectorParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceAuxModelsAssignment_2_2_111188);
            ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceAuxModelsSourceModelNodeSelectorParserRuleCall_2_2_1_0()); 
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
    // $ANTLR end "rule__Generator__SourceAuxModelsAssignment_2_2_1"


    // $ANTLR start "rule__Generator__SourceModelAssignment_3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5549:1: rule__Generator__SourceModelAssignment_3 : ( ruleSourceModelNodeSelector ) ;
    public final void rule__Generator__SourceModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5553:1: ( ( ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5554:1: ( ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5554:1: ( ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5555:1: ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceModelAssignment_311219);
            ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Generator__SourceModelAssignment_3"


    // $ANTLR start "rule__Generator__TargetModelAssignment_4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5564:1: rule__Generator__TargetModelAssignment_4 : ( ruleTargetModelNodeType ) ;
    public final void rule__Generator__TargetModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5568:1: ( ( ruleTargetModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5569:1: ( ruleTargetModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5569:1: ( ruleTargetModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5570:1: ruleTargetModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetModelTargetModelNodeTypeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_rule__Generator__TargetModelAssignment_411250);
            ruleTargetModelNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getTargetModelTargetModelNodeTypeParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Generator__TargetModelAssignment_4"


    // $ANTLR start "rule__Generator__TargetTraceModelAssignment_5_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5579:1: rule__Generator__TargetTraceModelAssignment_5_1 : ( ruleTargetTraceModel ) ;
    public final void rule__Generator__TargetTraceModelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5583:1: ( ( ruleTargetTraceModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5584:1: ( ruleTargetTraceModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5584:1: ( ruleTargetTraceModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5585:1: ruleTargetTraceModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetTraceModelTargetTraceModelParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleTargetTraceModel_in_rule__Generator__TargetTraceModelAssignment_5_111281);
            ruleTargetTraceModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getTargetTraceModelTargetTraceModelParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__Generator__TargetTraceModelAssignment_5_1"


    // $ANTLR start "rule__Generator__SourceTraceModelsAssignment_6_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5594:1: rule__Generator__SourceTraceModelsAssignment_6_1 : ( ruleTraceModelReference ) ;
    public final void rule__Generator__SourceTraceModelsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5598:1: ( ( ruleTraceModelReference ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5599:1: ( ruleTraceModelReference )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5599:1: ( ruleTraceModelReference )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5600:1: ruleTraceModelReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceTraceModelsTraceModelReferenceParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleTraceModelReference_in_rule__Generator__SourceTraceModelsAssignment_6_111312);
            ruleTraceModelReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceTraceModelsTraceModelReferenceParserRuleCall_6_1_0()); 
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
    // $ANTLR end "rule__Generator__SourceTraceModelsAssignment_6_1"


    // $ANTLR start "rule__Generator__SourceTraceModelsAssignment_6_2_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5609:1: rule__Generator__SourceTraceModelsAssignment_6_2_1 : ( ruleTraceModelReference ) ;
    public final void rule__Generator__SourceTraceModelsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5613:1: ( ( ruleTraceModelReference ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5614:1: ( ruleTraceModelReference )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5614:1: ( ruleTraceModelReference )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5615:1: ruleTraceModelReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceTraceModelsTraceModelReferenceParserRuleCall_6_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleTraceModelReference_in_rule__Generator__SourceTraceModelsAssignment_6_2_111343);
            ruleTraceModelReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceTraceModelsTraceModelReferenceParserRuleCall_6_2_1_0()); 
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
    // $ANTLR end "rule__Generator__SourceTraceModelsAssignment_6_2_1"


    // $ANTLR start "rule__SourceModelNodeSelector__ReferenceAssignment_0_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5624:1: rule__SourceModelNodeSelector__ReferenceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__SourceModelNodeSelector__ReferenceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5628:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5629:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5629:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5630:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceMetamodelCrossReference_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5631:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5632:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceMetamodelIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SourceModelNodeSelector__ReferenceAssignment_0_011378); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5643:1: rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5647:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5648:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5648:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5649:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getConstraintConstraintExpressionParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__SourceModelNodeSelector__ConstraintAssignment_0_1_111413);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5658:1: rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 : ( ruleNodeProperty ) ;
    public final void rule__SourceModelNodeSelector__PropertyAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5662:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5663:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5663:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5664:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyNodePropertyParserRuleCall_0_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__SourceModelNodeSelector__PropertyAssignment_0_2_111444);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5673:1: rule__TargetModelNodeType__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelNodeType__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5677:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5678:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5678:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5679:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getReferenceMetamodelCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5680:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5681:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getReferenceMetamodelIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TargetModelNodeType__ReferenceAssignment_111479); if (state.failed) return ;
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


    // $ANTLR start "rule__ModelNodeType__TargetAssignment_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5692:1: rule__ModelNodeType__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ModelNodeType__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5696:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5697:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5697:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5698:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTargetRegisteredPackageCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5699:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5700:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTargetRegisteredPackageIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModelNodeType__TargetAssignment_011518); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5711:1: rule__ModelNodeType__PropertyAssignment_1_1 : ( ruleNodeProperty ) ;
    public final void rule__ModelNodeType__PropertyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5715:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5716:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5716:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5717:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getPropertyNodePropertyParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__ModelNodeType__PropertyAssignment_1_111553);
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


    // $ANTLR start "rule__ModelNodeType__CollectionAssignment_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5726:1: rule__ModelNodeType__CollectionAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__ModelNodeType__CollectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5730:1: ( ( ( '[]' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5731:1: ( ( '[]' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5731:1: ( ( '[]' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5732:1: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5733:1: ( '[]' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5734:1: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__ModelNodeType__CollectionAssignment_211589); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_2_0()); 
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
    // $ANTLR end "rule__ModelNodeType__CollectionAssignment_2"


    // $ANTLR start "rule__NodeProperty__PropertyAssignment_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5749:1: rule__NodeProperty__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NodeProperty__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5753:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5754:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5754:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5755:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyJvmMemberCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5756:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5757:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyJvmMemberIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeProperty__PropertyAssignment_011632); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5768:1: rule__NodeProperty__ConstraintAssignment_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__NodeProperty__ConstraintAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5772:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5773:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5773:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5774:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getConstraintConstraintExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__NodeProperty__ConstraintAssignment_1_111667);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5783:1: rule__NodeProperty__SubPropertyAssignment_2_1 : ( ruleNodeProperty ) ;
    public final void rule__NodeProperty__SubPropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5787:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5788:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5788:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5789:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSubPropertyNodePropertyParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__NodeProperty__SubPropertyAssignment_2_111698);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5798:1: rule__ConstraintExpression__OperatorAssignment_1_0_0_1 : ( ruleLogicOperator ) ;
    public final void rule__ConstraintExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5802:1: ( ( ruleLogicOperator ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5803:1: ( ruleLogicOperator )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5803:1: ( ruleLogicOperator )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5804:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_111729);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5813:1: rule__ConstraintExpression__RightAssignment_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__ConstraintExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5817:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5818:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5818:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5819:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightConstraintExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__ConstraintExpression__RightAssignment_1_111760);
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


    // $ANTLR start "rule__CompareExpression__ComparatorAssignment_1_0_0_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5828:1: rule__CompareExpression__ComparatorAssignment_1_0_0_1 : ( ruleComparator ) ;
    public final void rule__CompareExpression__ComparatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5832:1: ( ( ruleComparator ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5833:1: ( ruleComparator )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5833:1: ( ruleComparator )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5834:1: ruleComparator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getComparatorComparatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleComparator_in_rule__CompareExpression__ComparatorAssignment_1_0_0_111791);
            ruleComparator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionAccess().getComparatorComparatorEnumRuleCall_1_0_0_1_0()); 
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
    // $ANTLR end "rule__CompareExpression__ComparatorAssignment_1_0_0_1"


    // $ANTLR start "rule__CompareExpression__RightAssignment_1_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5843:1: rule__CompareExpression__RightAssignment_1_1 : ( ruleBasicConstraint ) ;
    public final void rule__CompareExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5847:1: ( ( ruleBasicConstraint ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5848:1: ( ruleBasicConstraint )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5848:1: ( ruleBasicConstraint )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5849:1: ruleBasicConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightBasicConstraintParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__RightAssignment_1_111822);
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


    // $ANTLR start "rule__Negation__ConstraintAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5858:1: rule__Negation__ConstraintAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__Negation__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5862:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5863:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5863:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5864:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__Negation__ConstraintAssignment_111853);
            ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Negation__ConstraintAssignment_1"


    // $ANTLR start "rule__ParenthesisConstraint__ConstraintAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5873:1: rule__ParenthesisConstraint__ConstraintAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__ParenthesisConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5877:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5878:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5878:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5879:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_111884);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5888:1: rule__Typeof__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Typeof__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5892:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5893:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5893:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5894:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getTypeJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5895:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5896:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getTypeJvmTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Typeof__TypeAssignment_111919); if (state.failed) return ;
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


    // $ANTLR start "rule__TraceModelReference__TraceModelAssignment"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5907:1: rule__TraceModelReference__TraceModelAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TraceModelReference__TraceModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5911:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5912:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5912:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5913:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelReferenceAccess().getTraceModelTraceModelCrossReference_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5914:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5915:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelReferenceAccess().getTraceModelTraceModelIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TraceModelReference__TraceModelAssignment11958); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelReferenceAccess().getTraceModelTraceModelIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelReferenceAccess().getTraceModelTraceModelCrossReference_0()); 
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
    // $ANTLR end "rule__TraceModelReference__TraceModelAssignment"


    // $ANTLR start "rule__TraceModel__NameAssignment_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5926:1: rule__TraceModel__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TraceModel__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5930:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5931:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5931:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5932:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TraceModel__NameAssignment_011993); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5941:1: rule__TraceModel__NodeSetRelationsAssignment_2 : ( ruleNodeSetRelation ) ;
    public final void rule__TraceModel__NodeSetRelationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5945:1: ( ( ruleNodeSetRelation ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5946:1: ( ruleNodeSetRelation )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5946:1: ( ruleNodeSetRelation )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5947:1: ruleNodeSetRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsNodeSetRelationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNodeSetRelation_in_rule__TraceModel__NodeSetRelationsAssignment_212024);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5956:1: rule__NodeSetRelation__SourceNodesAssignment_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__SourceNodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5960:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5961:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5961:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5962:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_112055);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5971:1: rule__NodeSetRelation__SourceNodesAssignment_2_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__SourceNodesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5975:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5976:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5976:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5977:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_2_112086);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5986:1: rule__NodeSetRelation__TargetNodesAssignment_4 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__TargetNodesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5990:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5991:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5991:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5992:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_412117);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6001:1: rule__NodeSetRelation__TargetNodesAssignment_5_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__TargetNodesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6005:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6006:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6006:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6007:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_5_112148);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6016:1: rule__NodeType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NodeType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6020:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6021:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6021:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6022:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getTypeJvmTypeCrossReference_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6023:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6024:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getTypeJvmTypeIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeType__TypeAssignment12183); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6035:1: rule__ArrayLiteral__LiteralsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6039:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6040:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6040:1: ( ruleLiteral )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6041:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_112218);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6050:1: rule__ArrayLiteral__LiteralsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6054:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6055:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6055:1: ( ruleLiteral )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6056:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_112249);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6065:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6069:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6070:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6070:1: ( RULE_STRING )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6071:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12280); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6080:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6084:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6085:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6085:1: ( RULE_INT )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6086:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment12311); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6095:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6099:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6100:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6100:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6101:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment12342); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6110:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6114:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6115:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6115:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6116:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment12373); if (state.failed) return ;
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

    // $ANTLR start synpred42_InternalArchitecture
    public final void synpred42_InternalArchitecture_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3728:2: ( rule__ConstraintExpression__Group_1__0 )
        // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3728:2: rule__ConstraintExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0_in_synpred42_InternalArchitecture7601);
        rule__ConstraintExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_InternalArchitecture

    // $ANTLR start synpred43_InternalArchitecture
    public final void synpred43_InternalArchitecture_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3943:2: ( rule__CompareExpression__Group_1__0 )
        // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3943:2: rule__CompareExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_synpred43_InternalArchitecture8024);
        rule__CompareExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalArchitecture

    // Delegated rules

    public final boolean synpred43_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA32_eotS =
        "\12\uffff";
    static final String DFA32_eofS =
        "\1\10\11\uffff";
    static final String DFA32_minS =
        "\1\22\7\0\2\uffff";
    static final String DFA32_maxS =
        "\1\51\7\0\2\uffff";
    static final String DFA32_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA32_specialS =
        "\1\uffff\1\0\1\3\1\1\1\4\1\2\1\5\1\6\2\uffff}>";
    static final String[] DFA32_transitionS = {
            "\2\10\1\1\1\2\1\3\1\4\1\5\1\6\1\7\12\uffff\1\10\3\uffff\1\10",
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "3943:1: ( rule__CompareExpression__Group_1__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index32_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

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
    public static final BitSet FOLLOW_ruleProcessor_in_entryRuleProcessor367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessor374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Processor__Alternatives_in_ruleProcessor400 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0_in_ruleNegation1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisConstraint1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__0_in_ruleParenthesisConstraint1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperand1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operand__Alternatives_in_ruleOperand1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeof_in_entryRuleTypeof1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeof1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typeof__Group__0_in_ruleTypeof1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetTraceModel_in_entryRuleTargetTraceModel1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetTraceModel1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetTraceModel__Alternatives_in_ruleTargetTraceModel1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModelReference_in_entryRuleTraceModelReference1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraceModelReference1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModelReference__TraceModelAssignment_in_ruleTraceModelReference1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModel_in_entryRuleTraceModel1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraceModel1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__0_in_ruleTraceModel1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSetRelation_in_entryRuleNodeSetRelation1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeSetRelation1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__0_in_ruleNodeSetRelation1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_entryRuleNodeType1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeType1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__TypeAssignment_in_ruleNodeType1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelModifier__Alternatives_in_ruleMetamodelModifier1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__Alternatives_in_ruleComparator2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__ImportedNamespaceAssignment_2_0_in_rule__RegisteredPackage__Alternatives_22106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group_2_1__0_in_rule__RegisteredPackage__Alternatives_22124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_rule__Processor__Alternatives2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaver_in_rule__Processor__Alternatives2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__SourceModelAssignment_2_0_in_rule__Weaver__Alternatives_22206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Weaver__Alternatives_22225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectModel__Group_0__0_in_rule__AspectModel__Alternatives2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_rule__AspectModel__Alternatives2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__0_in_rule__SourceModelNodeSelector__Alternatives2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__0_in_rule__SourceModelNodeSelector__Alternatives2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_rule__BasicConstraint__Alternatives2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_rule__BasicConstraint__Alternatives2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__BasicConstraint__Alternatives2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Operand__Alternatives2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__Operand__Alternatives2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeof_in_rule__Operand__Alternatives2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModel_in_rule__TargetTraceModel__Alternatives2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetTraceModel__Group_1__0_in_rule__TargetTraceModel__Alternatives2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MetamodelModifier__Alternatives2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__MetamodelModifier__Alternatives2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MetamodelModifier__Alternatives2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LogicOperator__Alternatives2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LogicOperator__Alternatives2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Comparator__Alternatives2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Comparator__Alternatives2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Comparator__Alternatives2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Comparator__Alternatives2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Comparator__Alternatives2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Comparator__Alternatives2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Comparator__Alternatives2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Model__Group__0__Impl2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12999 = new BitSet(new long[]{0x00000009B0000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23059 = new BitSet(new long[]{0x00000009B0000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_2_in_rule__Model__Group__2__Impl3089 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33120 = new BitSet(new long[]{0x00000009B0000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__33123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RegisteredPackagesAssignment_3_in_rule__Model__Group__3__Impl3150 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43181 = new BitSet(new long[]{0x00000009B0000000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__43184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelsAssignment_4_in_rule__Model__Group__4__Impl3211 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__53242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ProcessorsAssignment_5_in_rule__Model__Group__5__Impl3269 = new BitSet(new long[]{0x0000000900000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Import__Group__0__Impl3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__0__Impl_in_rule__MetamodelSequence__Group__03435 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__1_in_rule__MetamodelSequence__Group__03438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MetamodelSequence__Group__0__Impl3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__1__Impl_in_rule__MetamodelSequence__Group__13497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__2_in_rule__MetamodelSequence__Group__13500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__ModifierAssignment_1_in_rule__MetamodelSequence__Group__1__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__2__Impl_in_rule__MetamodelSequence__Group__23557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__3_in_rule__MetamodelSequence__Group__23560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__TypeAssignment_2_in_rule__MetamodelSequence__Group__2__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__3__Impl_in_rule__MetamodelSequence__Group__33617 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__4_in_rule__MetamodelSequence__Group__33620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__MetamodelsAssignment_3_in_rule__MetamodelSequence__Group__3__Impl3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__4__Impl_in_rule__MetamodelSequence__Group__43677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group_4__0_in_rule__MetamodelSequence__Group__4__Impl3704 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group_4__0__Impl_in_rule__MetamodelSequence__Group_4__03745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group_4__1_in_rule__MetamodelSequence__Group_4__03748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MetamodelSequence__Group_4__0__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group_4__1__Impl_in_rule__MetamodelSequence__Group_4__13807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__MetamodelsAssignment_4_1_in_rule__MetamodelSequence__Group_4__1__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__0__Impl_in_rule__RegisteredPackage__Group__03868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__1_in_rule__RegisteredPackage__Group__03871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RegisteredPackage__Group__0__Impl3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__1__Impl_in_rule__RegisteredPackage__Group__13930 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__2_in_rule__RegisteredPackage__Group__13933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__NameAssignment_1_in_rule__RegisteredPackage__Group__1__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__2__Impl_in_rule__RegisteredPackage__Group__23990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Alternatives_2_in_rule__RegisteredPackage__Group__2__Impl4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group_2_1__0__Impl_in_rule__RegisteredPackage__Group_2_1__04053 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group_2_1__1_in_rule__RegisteredPackage__Group_2_1__04056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__IsTextAssignment_2_1_0_in_rule__RegisteredPackage__Group_2_1__0__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group_2_1__1__Impl_in_rule__RegisteredPackage__Group_2_1__14113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__ExtensionAssignment_2_1_1_in_rule__RegisteredPackage__Group_2_1__1__Impl4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__0__Impl_in_rule__Weaver__Group__04174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Weaver__Group__1_in_rule__Weaver__Group__04177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Weaver__Group__0__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__1__Impl_in_rule__Weaver__Group__14236 = new BitSet(new long[]{0x0000080000004010L});
    public static final BitSet FOLLOW_rule__Weaver__Group__2_in_rule__Weaver__Group__14239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__ReferenceAssignment_1_in_rule__Weaver__Group__1__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__2__Impl_in_rule__Weaver__Group__24296 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_rule__Weaver__Group__3_in_rule__Weaver__Group__24299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Alternatives_2_in_rule__Weaver__Group__2__Impl4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__3__Impl_in_rule__Weaver__Group__34356 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Weaver__Group__4_in_rule__Weaver__Group__34359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__AspectModelAssignment_3_in_rule__Weaver__Group__3__Impl4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__4__Impl_in_rule__Weaver__Group__44416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__0_in_rule__Weaver__Group__4__Impl4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__0__Impl_in_rule__Weaver__Group_4__04484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__1_in_rule__Weaver__Group_4__04487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Weaver__Group_4__0__Impl4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__1__Impl_in_rule__Weaver__Group_4__14546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__TargetModelAssignment_4_1_in_rule__Weaver__Group_4__1__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectModel__Group_0__0__Impl_in_rule__AspectModel__Group_0__04607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AspectModel__Group_0__1_in_rule__AspectModel__Group_0__04610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__AspectModel__Group_0__0__Impl4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectModel__Group_0__1__Impl_in_rule__AspectModel__Group_0__14669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_rule__AspectModel__Group_0__1__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__0__Impl_in_rule__Generator__Group__04729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__1_in_rule__Generator__Group__04732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Generator__Group__0__Impl4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__1__Impl_in_rule__Generator__Group__14791 = new BitSet(new long[]{0x0000081000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__2_in_rule__Generator__Group__14794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__ReferenceAssignment_1_in_rule__Generator__Group__1__Impl4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__2__Impl_in_rule__Generator__Group__24851 = new BitSet(new long[]{0x0000081000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__3_in_rule__Generator__Group__24854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__0_in_rule__Generator__Group__2__Impl4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__3__Impl_in_rule__Generator__Group__34912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__4_in_rule__Generator__Group__34915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceModelAssignment_3_in_rule__Generator__Group__3__Impl4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__4__Impl_in_rule__Generator__Group__44972 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__5_in_rule__Generator__Group__44975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__TargetModelAssignment_4_in_rule__Generator__Group__4__Impl5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__5__Impl_in_rule__Generator__Group__55032 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__6_in_rule__Generator__Group__55035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__0_in_rule__Generator__Group__5__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__6__Impl_in_rule__Generator__Group__65093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__0_in_rule__Generator__Group__6__Impl5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__0__Impl_in_rule__Generator__Group_2__05165 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__1_in_rule__Generator__Group_2__05168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Generator__Group_2__0__Impl5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__1__Impl_in_rule__Generator__Group_2__15227 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__2_in_rule__Generator__Group_2__15230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceAuxModelsAssignment_2_1_in_rule__Generator__Group_2__1__Impl5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__2__Impl_in_rule__Generator__Group_2__25287 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__3_in_rule__Generator__Group_2__25290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2_2__0_in_rule__Generator__Group_2__2__Impl5317 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__3__Impl_in_rule__Generator__Group_2__35348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Generator__Group_2__3__Impl5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2_2__0__Impl_in_rule__Generator__Group_2_2__05415 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_2_2__1_in_rule__Generator__Group_2_2__05418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Generator__Group_2_2__0__Impl5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2_2__1__Impl_in_rule__Generator__Group_2_2__15477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceAuxModelsAssignment_2_2_1_in_rule__Generator__Group_2_2__1__Impl5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__0__Impl_in_rule__Generator__Group_5__05538 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__1_in_rule__Generator__Group_5__05541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Generator__Group_5__0__Impl5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__1__Impl_in_rule__Generator__Group_5__15600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__TargetTraceModelAssignment_5_1_in_rule__Generator__Group_5__1__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__0__Impl_in_rule__Generator__Group_6__05661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__1_in_rule__Generator__Group_6__05664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Generator__Group_6__0__Impl5692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__1__Impl_in_rule__Generator__Group_6__15723 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__2_in_rule__Generator__Group_6__15726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceTraceModelsAssignment_6_1_in_rule__Generator__Group_6__1__Impl5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__2__Impl_in_rule__Generator__Group_6__25783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__0_in_rule__Generator__Group_6__2__Impl5810 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__0__Impl_in_rule__Generator__Group_6_2__05847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__1_in_rule__Generator__Group_6_2__05850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Generator__Group_6_2__0__Impl5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__1__Impl_in_rule__Generator__Group_6_2__15909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceTraceModelsAssignment_6_2_1_in_rule__Generator__Group_6_2__1__Impl5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__0__Impl_in_rule__SourceModelNodeSelector__Group_0__05970 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__1_in_rule__SourceModelNodeSelector__Group_0__05973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__ReferenceAssignment_0_0_in_rule__SourceModelNodeSelector__Group_0__0__Impl6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__1__Impl_in_rule__SourceModelNodeSelector__Group_0__16030 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__2_in_rule__SourceModelNodeSelector__Group_0__16033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0_in_rule__SourceModelNodeSelector__Group_0__1__Impl6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__2__Impl_in_rule__SourceModelNodeSelector__Group_0__26091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_2__0_in_rule__SourceModelNodeSelector__Group_0__2__Impl6118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0__Impl_in_rule__SourceModelNodeSelector__Group_0_1__06155 = new BitSet(new long[]{0x0000B010000001F0L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1_in_rule__SourceModelNodeSelector__Group_0_1__06158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SourceModelNodeSelector__Group_0_1__0__Impl6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1__Impl_in_rule__SourceModelNodeSelector__Group_0_1__16217 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__2_in_rule__SourceModelNodeSelector__Group_0_1__16220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1_in_rule__SourceModelNodeSelector__Group_0_1__1__Impl6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__2__Impl_in_rule__SourceModelNodeSelector__Group_0_1__26277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SourceModelNodeSelector__Group_0_1__2__Impl6305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_2__0__Impl_in_rule__SourceModelNodeSelector__Group_0_2__06342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_2__1_in_rule__SourceModelNodeSelector__Group_0_2__06345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SourceModelNodeSelector__Group_0_2__0__Impl6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_2__1__Impl_in_rule__SourceModelNodeSelector__Group_0_2__16404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__PropertyAssignment_0_2_1_in_rule__SourceModelNodeSelector__Group_0_2__1__Impl6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__0__Impl_in_rule__SourceModelNodeSelector__Group_1__06465 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__1_in_rule__SourceModelNodeSelector__Group_1__06468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__1__Impl_in_rule__SourceModelNodeSelector__Group_1__16526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SourceModelNodeSelector__Group_1__1__Impl6554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__0__Impl_in_rule__TargetModelNodeType__Group__06589 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__1_in_rule__TargetModelNodeType__Group__06592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__1__Impl_in_rule__TargetModelNodeType__Group__16650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__ReferenceAssignment_1_in_rule__TargetModelNodeType__Group__1__Impl6677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__0__Impl_in_rule__ModelNodeType__Group__06712 = new BitSet(new long[]{0x0008040000000000L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__1_in_rule__ModelNodeType__Group__06715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__TargetAssignment_0_in_rule__ModelNodeType__Group__0__Impl6742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__1__Impl_in_rule__ModelNodeType__Group__16772 = new BitSet(new long[]{0x0008040000000000L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__2_in_rule__ModelNodeType__Group__16775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_1__0_in_rule__ModelNodeType__Group__1__Impl6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__2__Impl_in_rule__ModelNodeType__Group__26833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__CollectionAssignment_2_in_rule__ModelNodeType__Group__2__Impl6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_1__0__Impl_in_rule__ModelNodeType__Group_1__06897 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_1__1_in_rule__ModelNodeType__Group_1__06900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ModelNodeType__Group_1__0__Impl6928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_1__1__Impl_in_rule__ModelNodeType__Group_1__16959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__PropertyAssignment_1_1_in_rule__ModelNodeType__Group_1__1__Impl6986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__0__Impl_in_rule__NodeProperty__Group__07020 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__1_in_rule__NodeProperty__Group__07023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__PropertyAssignment_0_in_rule__NodeProperty__Group__0__Impl7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__1__Impl_in_rule__NodeProperty__Group__17080 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__2_in_rule__NodeProperty__Group__17083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__0_in_rule__NodeProperty__Group__1__Impl7110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__2__Impl_in_rule__NodeProperty__Group__27141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__0_in_rule__NodeProperty__Group__2__Impl7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__0__Impl_in_rule__NodeProperty__Group_1__07205 = new BitSet(new long[]{0x0000B010000001F0L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__1_in_rule__NodeProperty__Group_1__07208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__NodeProperty__Group_1__0__Impl7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__1__Impl_in_rule__NodeProperty__Group_1__17267 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__2_in_rule__NodeProperty__Group_1__17270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__ConstraintAssignment_1_1_in_rule__NodeProperty__Group_1__1__Impl7297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__2__Impl_in_rule__NodeProperty__Group_1__27327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__NodeProperty__Group_1__2__Impl7355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__0__Impl_in_rule__NodeProperty__Group_2__07392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__1_in_rule__NodeProperty__Group_2__07395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__NodeProperty__Group_2__0__Impl7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__1__Impl_in_rule__NodeProperty__Group_2__17454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__SubPropertyAssignment_2_1_in_rule__NodeProperty__Group_2__1__Impl7481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__07515 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__07518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_rule__ConstraintExpression__Group__0__Impl7545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__17574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl7601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__07636 = new BitSet(new long[]{0x0000B010000001F0L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__07639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__17696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__07757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__07816 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__07819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__17877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl7904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__07938 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__07941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__Group__0__Impl7968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__17997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__08059 = new BitSet(new long[]{0x0000B010000001F0L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__08062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl8089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__18119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl8146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__08180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__08239 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__08242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__18300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__ComparatorAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl8327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__08361 = new BitSet(new long[]{0x0000B010000001F0L});
    public static final BitSet FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__08364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Negation__Group__0__Impl8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__18423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__ConstraintAssignment_1_in_rule__Negation__Group__1__Impl8450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__08484 = new BitSet(new long[]{0x0000B010000001F0L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__08487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ParenthesisConstraint__Group__0__Impl8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__18546 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__18549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__28606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParenthesisConstraint__Group__2__Impl8634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typeof__Group__0__Impl_in_rule__Typeof__Group__08671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Typeof__Group__1_in_rule__Typeof__Group__08674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Typeof__Group__0__Impl8702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typeof__Group__1__Impl_in_rule__Typeof__Group__18733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typeof__TypeAssignment_1_in_rule__Typeof__Group__1__Impl8760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetTraceModel__Group_1__0__Impl_in_rule__TargetTraceModel__Group_1__08794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TargetTraceModel__Group_1__1_in_rule__TargetTraceModel__Group_1__08797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__TargetTraceModel__Group_1__0__Impl8825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetTraceModel__Group_1__1__Impl_in_rule__TargetTraceModel__Group_1__18856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModelReference_in_rule__TargetTraceModel__Group_1__1__Impl8883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__0__Impl_in_rule__TraceModel__Group__08916 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__1_in_rule__TraceModel__Group__08919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NameAssignment_0_in_rule__TraceModel__Group__0__Impl8946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__1__Impl_in_rule__TraceModel__Group__18976 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__2_in_rule__TraceModel__Group__18979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TraceModel__Group__1__Impl9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__2__Impl_in_rule__TraceModel__Group__29038 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__3_in_rule__TraceModel__Group__29041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl9070 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl9082 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__3__Impl_in_rule__TraceModel__Group__39115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TraceModel__Group__3__Impl9143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__0__Impl_in_rule__NodeSetRelation__Group__09182 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__1_in_rule__NodeSetRelation__Group__09185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__NodeSetRelation__Group__0__Impl9213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__1__Impl_in_rule__NodeSetRelation__Group__19244 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__2_in_rule__NodeSetRelation__Group__19247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_1_in_rule__NodeSetRelation__Group__1__Impl9274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__2__Impl_in_rule__NodeSetRelation__Group__29304 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__3_in_rule__NodeSetRelation__Group__29307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__0_in_rule__NodeSetRelation__Group__2__Impl9334 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__3__Impl_in_rule__NodeSetRelation__Group__39365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__4_in_rule__NodeSetRelation__Group__39368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__NodeSetRelation__Group__3__Impl9396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__4__Impl_in_rule__NodeSetRelation__Group__49427 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__5_in_rule__NodeSetRelation__Group__49430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_4_in_rule__NodeSetRelation__Group__4__Impl9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__5__Impl_in_rule__NodeSetRelation__Group__59487 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__6_in_rule__NodeSetRelation__Group__59490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__0_in_rule__NodeSetRelation__Group__5__Impl9517 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__6__Impl_in_rule__NodeSetRelation__Group__69548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__NodeSetRelation__Group__6__Impl9576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__0__Impl_in_rule__NodeSetRelation__Group_2__09621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__1_in_rule__NodeSetRelation__Group_2__09624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NodeSetRelation__Group_2__0__Impl9652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__1__Impl_in_rule__NodeSetRelation__Group_2__19683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_2_1_in_rule__NodeSetRelation__Group_2__1__Impl9710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__0__Impl_in_rule__NodeSetRelation__Group_5__09744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__1_in_rule__NodeSetRelation__Group_5__09747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NodeSetRelation__Group_5__0__Impl9775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__1__Impl_in_rule__NodeSetRelation__Group_5__19806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_5_1_in_rule__NodeSetRelation__Group_5__1__Impl9833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__09867 = new BitSet(new long[]{0x00008000000001E0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__09870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__ArrayLiteral__Group__0__Impl9898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__19929 = new BitSet(new long[]{0x0001000040000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__19932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl9959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__29989 = new BitSet(new long[]{0x0001000040000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__29992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl10019 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__310050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ArrayLiteral__Group__3__Impl10078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__010117 = new BitSet(new long[]{0x00008000000001E0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__010120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ArrayLiteral__Group_2__0__Impl10148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__110179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl10206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010240 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10326 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__QualifiedName__Group_1__0__Impl10393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl10452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_110492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_210523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_rule__Model__RegisteredPackagesAssignment_310554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelSequence_in_rule__Model__MetamodelsAssignment_410585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessor_in_rule__Model__ProcessorsAssignment_510616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_110651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelModifier_in_rule__MetamodelSequence__ModifierAssignment_110686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodeType_in_rule__MetamodelSequence__TypeAssignment_210717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_310748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_4_110779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment10810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_110841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RegisteredPackage__ImportedNamespaceAssignment_2_010876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__RegisteredPackage__IsTextAssignment_2_1_010916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RegisteredPackage__ExtensionAssignment_2_1_110955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Weaver__ReferenceAssignment_110990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_rule__Weaver__SourceModelAssignment_2_011025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectModel_in_rule__Weaver__AspectModelAssignment_311056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_rule__Weaver__TargetModelAssignment_4_111087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generator__ReferenceAssignment_111122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceAuxModelsAssignment_2_111157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceAuxModelsAssignment_2_2_111188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceModelAssignment_311219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_rule__Generator__TargetModelAssignment_411250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetTraceModel_in_rule__Generator__TargetTraceModelAssignment_5_111281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModelReference_in_rule__Generator__SourceTraceModelsAssignment_6_111312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModelReference_in_rule__Generator__SourceTraceModelsAssignment_6_2_111343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SourceModelNodeSelector__ReferenceAssignment_0_011378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__SourceModelNodeSelector__ConstraintAssignment_0_1_111413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__SourceModelNodeSelector__PropertyAssignment_0_2_111444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TargetModelNodeType__ReferenceAssignment_111479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModelNodeType__TargetAssignment_011518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__ModelNodeType__PropertyAssignment_1_111553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ModelNodeType__CollectionAssignment_211589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeProperty__PropertyAssignment_011632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__NodeProperty__ConstraintAssignment_1_111667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__NodeProperty__SubPropertyAssignment_2_111698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_111729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__ConstraintExpression__RightAssignment_1_111760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_rule__CompareExpression__ComparatorAssignment_1_0_0_111791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__RightAssignment_1_111822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__Negation__ConstraintAssignment_111853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_111884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Typeof__TypeAssignment_111919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TraceModelReference__TraceModelAssignment11958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TraceModel__NameAssignment_011993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSetRelation_in_rule__TraceModel__NodeSetRelationsAssignment_212024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_112055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_2_112086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_412117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_5_112148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeType__TypeAssignment12183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_112218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_112249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment12311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment12342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment12373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0_in_synpred42_InternalArchitecture7601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_synpred43_InternalArchitecture8024 = new BitSet(new long[]{0x0000000000000002L});

}