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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'link'", "'in'", "'out'", "'io'", "'&'", "'|'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'~'", "'package'", "'import'", "'model'", "','", "'register'", "'weave'", "'=>'", "':'", "'generate'", "'source'", "'('", "')'", "'target'", "'trace'", "'['", "']'", "'/'", "'null'", "'!'", "'typeof'", "'use'", "'{'", "'}'", "'.'", "'text'", "'[]'"
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
            else if ( (LA1_0==51) ) {
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

            if ( (LA3_0==RULE_ID||LA3_0==44) ) {
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
            else if ( (LA5_0==44) ) {
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
            case 37:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 46:
            case 48:
                {
                alt6=2;
                }
                break;
            case 45:
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
            case 48:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                alt7=2;
                }
                break;
            case 46:
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
            else if ( (LA8_0==47) ) {
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
            case 48:
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

            if ( (LA19_0==37) ) {
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2369:1: rule__Generator__Group__3__Impl : ( 'source' ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2373:1: ( ( 'source' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2374:1: ( 'source' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2374:1: ( 'source' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2375:1: 'source'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceKeyword_3()); 
            }
            match(input,36,FOLLOW_36_in_rule__Generator__Group__3__Impl4943); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceKeyword_3()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2388:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2392:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2393:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
            {
            pushFollow(FOLLOW_rule__Generator__Group__4__Impl_in_rule__Generator__Group__44974);
            rule__Generator__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__5_in_rule__Generator__Group__44977);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2400:1: rule__Generator__Group__4__Impl : ( ( rule__Generator__SourceModelAssignment_4 ) ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2404:1: ( ( ( rule__Generator__SourceModelAssignment_4 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2405:1: ( ( rule__Generator__SourceModelAssignment_4 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2405:1: ( ( rule__Generator__SourceModelAssignment_4 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2406:1: ( rule__Generator__SourceModelAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceModelAssignment_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2407:1: ( rule__Generator__SourceModelAssignment_4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2407:2: rule__Generator__SourceModelAssignment_4
            {
            pushFollow(FOLLOW_rule__Generator__SourceModelAssignment_4_in_rule__Generator__Group__4__Impl5004);
            rule__Generator__SourceModelAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceModelAssignment_4()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2417:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl rule__Generator__Group__6 ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2421:1: ( rule__Generator__Group__5__Impl rule__Generator__Group__6 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2422:2: rule__Generator__Group__5__Impl rule__Generator__Group__6
            {
            pushFollow(FOLLOW_rule__Generator__Group__5__Impl_in_rule__Generator__Group__55034);
            rule__Generator__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__6_in_rule__Generator__Group__55037);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2429:1: rule__Generator__Group__5__Impl : ( ( rule__Generator__Group_5__0 )? ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2433:1: ( ( ( rule__Generator__Group_5__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2434:1: ( ( rule__Generator__Group_5__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2434:1: ( ( rule__Generator__Group_5__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2435:1: ( rule__Generator__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2436:1: ( rule__Generator__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2436:2: rule__Generator__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_5__0_in_rule__Generator__Group__5__Impl5064);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2446:1: rule__Generator__Group__6 : rule__Generator__Group__6__Impl ;
    public final void rule__Generator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2450:1: ( rule__Generator__Group__6__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2451:2: rule__Generator__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group__6__Impl_in_rule__Generator__Group__65095);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2457:1: rule__Generator__Group__6__Impl : ( ( rule__Generator__Group_6__0 )? ) ;
    public final void rule__Generator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2461:1: ( ( ( rule__Generator__Group_6__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2462:1: ( ( rule__Generator__Group_6__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2462:1: ( ( rule__Generator__Group_6__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2463:1: ( rule__Generator__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_6()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2464:1: ( rule__Generator__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2464:2: rule__Generator__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_6__0_in_rule__Generator__Group__6__Impl5122);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2488:1: rule__Generator__Group_2__0 : rule__Generator__Group_2__0__Impl rule__Generator__Group_2__1 ;
    public final void rule__Generator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2492:1: ( rule__Generator__Group_2__0__Impl rule__Generator__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2493:2: rule__Generator__Group_2__0__Impl rule__Generator__Group_2__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_2__0__Impl_in_rule__Generator__Group_2__05167);
            rule__Generator__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_2__1_in_rule__Generator__Group_2__05170);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2500:1: rule__Generator__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Generator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2504:1: ( ( '(' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2505:1: ( '(' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2505:1: ( '(' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2506:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Generator__Group_2__0__Impl5198); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2519:1: rule__Generator__Group_2__1 : rule__Generator__Group_2__1__Impl rule__Generator__Group_2__2 ;
    public final void rule__Generator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2523:1: ( rule__Generator__Group_2__1__Impl rule__Generator__Group_2__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2524:2: rule__Generator__Group_2__1__Impl rule__Generator__Group_2__2
            {
            pushFollow(FOLLOW_rule__Generator__Group_2__1__Impl_in_rule__Generator__Group_2__15229);
            rule__Generator__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_2__2_in_rule__Generator__Group_2__15232);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2531:1: rule__Generator__Group_2__1__Impl : ( ( rule__Generator__SourceAuxModelsAssignment_2_1 ) ) ;
    public final void rule__Generator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2535:1: ( ( ( rule__Generator__SourceAuxModelsAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2536:1: ( ( rule__Generator__SourceAuxModelsAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2536:1: ( ( rule__Generator__SourceAuxModelsAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2537:1: ( rule__Generator__SourceAuxModelsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceAuxModelsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2538:1: ( rule__Generator__SourceAuxModelsAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2538:2: rule__Generator__SourceAuxModelsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Generator__SourceAuxModelsAssignment_2_1_in_rule__Generator__Group_2__1__Impl5259);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2548:1: rule__Generator__Group_2__2 : rule__Generator__Group_2__2__Impl rule__Generator__Group_2__3 ;
    public final void rule__Generator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2552:1: ( rule__Generator__Group_2__2__Impl rule__Generator__Group_2__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2553:2: rule__Generator__Group_2__2__Impl rule__Generator__Group_2__3
            {
            pushFollow(FOLLOW_rule__Generator__Group_2__2__Impl_in_rule__Generator__Group_2__25289);
            rule__Generator__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_2__3_in_rule__Generator__Group_2__25292);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2560:1: rule__Generator__Group_2__2__Impl : ( ( rule__Generator__Group_2_2__0 )* ) ;
    public final void rule__Generator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2564:1: ( ( ( rule__Generator__Group_2_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2565:1: ( ( rule__Generator__Group_2_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2565:1: ( ( rule__Generator__Group_2_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2566:1: ( rule__Generator__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_2_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2567:1: ( rule__Generator__Group_2_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2567:2: rule__Generator__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Generator__Group_2_2__0_in_rule__Generator__Group_2__2__Impl5319);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2577:1: rule__Generator__Group_2__3 : rule__Generator__Group_2__3__Impl ;
    public final void rule__Generator__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2581:1: ( rule__Generator__Group_2__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2582:2: rule__Generator__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_2__3__Impl_in_rule__Generator__Group_2__35350);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2588:1: rule__Generator__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Generator__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2592:1: ( ( ')' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2593:1: ( ')' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2593:1: ( ')' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2594:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,38,FOLLOW_38_in_rule__Generator__Group_2__3__Impl5378); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2615:1: rule__Generator__Group_2_2__0 : rule__Generator__Group_2_2__0__Impl rule__Generator__Group_2_2__1 ;
    public final void rule__Generator__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2619:1: ( rule__Generator__Group_2_2__0__Impl rule__Generator__Group_2_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2620:2: rule__Generator__Group_2_2__0__Impl rule__Generator__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_2_2__0__Impl_in_rule__Generator__Group_2_2__05417);
            rule__Generator__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_2_2__1_in_rule__Generator__Group_2_2__05420);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2627:1: rule__Generator__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Generator__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2631:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2632:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2632:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2633:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Generator__Group_2_2__0__Impl5448); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2646:1: rule__Generator__Group_2_2__1 : rule__Generator__Group_2_2__1__Impl ;
    public final void rule__Generator__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2650:1: ( rule__Generator__Group_2_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2651:2: rule__Generator__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_2_2__1__Impl_in_rule__Generator__Group_2_2__15479);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2657:1: rule__Generator__Group_2_2__1__Impl : ( ( rule__Generator__SourceAuxModelsAssignment_2_2_1 ) ) ;
    public final void rule__Generator__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2661:1: ( ( ( rule__Generator__SourceAuxModelsAssignment_2_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2662:1: ( ( rule__Generator__SourceAuxModelsAssignment_2_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2662:1: ( ( rule__Generator__SourceAuxModelsAssignment_2_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2663:1: ( rule__Generator__SourceAuxModelsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceAuxModelsAssignment_2_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2664:1: ( rule__Generator__SourceAuxModelsAssignment_2_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2664:2: rule__Generator__SourceAuxModelsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Generator__SourceAuxModelsAssignment_2_2_1_in_rule__Generator__Group_2_2__1__Impl5506);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2678:1: rule__Generator__Group_5__0 : rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1 ;
    public final void rule__Generator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2682:1: ( rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2683:2: rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_5__0__Impl_in_rule__Generator__Group_5__05540);
            rule__Generator__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_5__1_in_rule__Generator__Group_5__05543);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2690:1: rule__Generator__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__Generator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2694:1: ( ( 'target' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2695:1: ( 'target' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2695:1: ( 'target' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2696:1: 'target'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetKeyword_5_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Generator__Group_5__0__Impl5571); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getTargetKeyword_5_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2709:1: rule__Generator__Group_5__1 : rule__Generator__Group_5__1__Impl ;
    public final void rule__Generator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2713:1: ( rule__Generator__Group_5__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2714:2: rule__Generator__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_5__1__Impl_in_rule__Generator__Group_5__15602);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2720:1: rule__Generator__Group_5__1__Impl : ( ( rule__Generator__TargetModelAssignment_5_1 ) ) ;
    public final void rule__Generator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2724:1: ( ( ( rule__Generator__TargetModelAssignment_5_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2725:1: ( ( rule__Generator__TargetModelAssignment_5_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2725:1: ( ( rule__Generator__TargetModelAssignment_5_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2726:1: ( rule__Generator__TargetModelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetModelAssignment_5_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2727:1: ( rule__Generator__TargetModelAssignment_5_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2727:2: rule__Generator__TargetModelAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Generator__TargetModelAssignment_5_1_in_rule__Generator__Group_5__1__Impl5629);
            rule__Generator__TargetModelAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getTargetModelAssignment_5_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2741:1: rule__Generator__Group_6__0 : rule__Generator__Group_6__0__Impl rule__Generator__Group_6__1 ;
    public final void rule__Generator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2745:1: ( rule__Generator__Group_6__0__Impl rule__Generator__Group_6__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2746:2: rule__Generator__Group_6__0__Impl rule__Generator__Group_6__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_6__0__Impl_in_rule__Generator__Group_6__05663);
            rule__Generator__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6__1_in_rule__Generator__Group_6__05666);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2753:1: rule__Generator__Group_6__0__Impl : ( 'trace' ) ;
    public final void rule__Generator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2757:1: ( ( 'trace' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2758:1: ( 'trace' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2758:1: ( 'trace' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2759:1: 'trace'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTraceKeyword_6_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Generator__Group_6__0__Impl5694); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getTraceKeyword_6_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2772:1: rule__Generator__Group_6__1 : rule__Generator__Group_6__1__Impl rule__Generator__Group_6__2 ;
    public final void rule__Generator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2776:1: ( rule__Generator__Group_6__1__Impl rule__Generator__Group_6__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2777:2: rule__Generator__Group_6__1__Impl rule__Generator__Group_6__2
            {
            pushFollow(FOLLOW_rule__Generator__Group_6__1__Impl_in_rule__Generator__Group_6__15725);
            rule__Generator__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6__2_in_rule__Generator__Group_6__15728);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2784:1: rule__Generator__Group_6__1__Impl : ( ( rule__Generator__Group_6_1__0 )? ) ;
    public final void rule__Generator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2788:1: ( ( ( rule__Generator__Group_6_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2789:1: ( ( rule__Generator__Group_6_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2789:1: ( ( rule__Generator__Group_6_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2790:1: ( rule__Generator__Group_6_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_6_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2791:1: ( rule__Generator__Group_6_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2791:2: rule__Generator__Group_6_1__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_6_1__0_in_rule__Generator__Group_6__1__Impl5755);
                    rule__Generator__Group_6_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGroup_6_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2801:1: rule__Generator__Group_6__2 : rule__Generator__Group_6__2__Impl ;
    public final void rule__Generator__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2805:1: ( rule__Generator__Group_6__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2806:2: rule__Generator__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_6__2__Impl_in_rule__Generator__Group_6__25786);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2812:1: rule__Generator__Group_6__2__Impl : ( ( rule__Generator__Group_6_2__0 )? ) ;
    public final void rule__Generator__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2816:1: ( ( ( rule__Generator__Group_6_2__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2817:1: ( ( rule__Generator__Group_6_2__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2817:1: ( ( rule__Generator__Group_6_2__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2818:1: ( rule__Generator__Group_6_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_6_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2819:1: ( rule__Generator__Group_6_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2819:2: rule__Generator__Group_6_2__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_6_2__0_in_rule__Generator__Group_6__2__Impl5813);
                    rule__Generator__Group_6_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

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


    // $ANTLR start "rule__Generator__Group_6_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2835:1: rule__Generator__Group_6_1__0 : rule__Generator__Group_6_1__0__Impl rule__Generator__Group_6_1__1 ;
    public final void rule__Generator__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2839:1: ( rule__Generator__Group_6_1__0__Impl rule__Generator__Group_6_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2840:2: rule__Generator__Group_6_1__0__Impl rule__Generator__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_1__0__Impl_in_rule__Generator__Group_6_1__05850);
            rule__Generator__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6_1__1_in_rule__Generator__Group_6_1__05853);
            rule__Generator__Group_6_1__1();

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
    // $ANTLR end "rule__Generator__Group_6_1__0"


    // $ANTLR start "rule__Generator__Group_6_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2847:1: rule__Generator__Group_6_1__0__Impl : ( 'out' ) ;
    public final void rule__Generator__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2851:1: ( ( 'out' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2852:1: ( 'out' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2852:1: ( 'out' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2853:1: 'out'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getOutKeyword_6_1_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Generator__Group_6_1__0__Impl5881); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getOutKeyword_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_6_1__0__Impl"


    // $ANTLR start "rule__Generator__Group_6_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2866:1: rule__Generator__Group_6_1__1 : rule__Generator__Group_6_1__1__Impl ;
    public final void rule__Generator__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2870:1: ( rule__Generator__Group_6_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2871:2: rule__Generator__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_1__1__Impl_in_rule__Generator__Group_6_1__15912);
            rule__Generator__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__Generator__Group_6_1__1"


    // $ANTLR start "rule__Generator__Group_6_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2877:1: rule__Generator__Group_6_1__1__Impl : ( ( rule__Generator__TargetTraceModelAssignment_6_1_1 ) ) ;
    public final void rule__Generator__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2881:1: ( ( ( rule__Generator__TargetTraceModelAssignment_6_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2882:1: ( ( rule__Generator__TargetTraceModelAssignment_6_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2882:1: ( ( rule__Generator__TargetTraceModelAssignment_6_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2883:1: ( rule__Generator__TargetTraceModelAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetTraceModelAssignment_6_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2884:1: ( rule__Generator__TargetTraceModelAssignment_6_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2884:2: rule__Generator__TargetTraceModelAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__Generator__TargetTraceModelAssignment_6_1_1_in_rule__Generator__Group_6_1__1__Impl5939);
            rule__Generator__TargetTraceModelAssignment_6_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getTargetTraceModelAssignment_6_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_6_1__1__Impl"


    // $ANTLR start "rule__Generator__Group_6_2__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2898:1: rule__Generator__Group_6_2__0 : rule__Generator__Group_6_2__0__Impl rule__Generator__Group_6_2__1 ;
    public final void rule__Generator__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2902:1: ( rule__Generator__Group_6_2__0__Impl rule__Generator__Group_6_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2903:2: rule__Generator__Group_6_2__0__Impl rule__Generator__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_2__0__Impl_in_rule__Generator__Group_6_2__05973);
            rule__Generator__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6_2__1_in_rule__Generator__Group_6_2__05976);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2910:1: rule__Generator__Group_6_2__0__Impl : ( 'in' ) ;
    public final void rule__Generator__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2914:1: ( ( 'in' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2915:1: ( 'in' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2915:1: ( 'in' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2916:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getInKeyword_6_2_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Generator__Group_6_2__0__Impl6004); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getInKeyword_6_2_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2929:1: rule__Generator__Group_6_2__1 : rule__Generator__Group_6_2__1__Impl rule__Generator__Group_6_2__2 ;
    public final void rule__Generator__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2933:1: ( rule__Generator__Group_6_2__1__Impl rule__Generator__Group_6_2__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2934:2: rule__Generator__Group_6_2__1__Impl rule__Generator__Group_6_2__2
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_2__1__Impl_in_rule__Generator__Group_6_2__16035);
            rule__Generator__Group_6_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6_2__2_in_rule__Generator__Group_6_2__16038);
            rule__Generator__Group_6_2__2();

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2941:1: rule__Generator__Group_6_2__1__Impl : ( ( rule__Generator__SourceTraceModelsAssignment_6_2_1 ) ) ;
    public final void rule__Generator__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2945:1: ( ( ( rule__Generator__SourceTraceModelsAssignment_6_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2946:1: ( ( rule__Generator__SourceTraceModelsAssignment_6_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2946:1: ( ( rule__Generator__SourceTraceModelsAssignment_6_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2947:1: ( rule__Generator__SourceTraceModelsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceTraceModelsAssignment_6_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2948:1: ( rule__Generator__SourceTraceModelsAssignment_6_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2948:2: rule__Generator__SourceTraceModelsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Generator__SourceTraceModelsAssignment_6_2_1_in_rule__Generator__Group_6_2__1__Impl6065);
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


    // $ANTLR start "rule__Generator__Group_6_2__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2958:1: rule__Generator__Group_6_2__2 : rule__Generator__Group_6_2__2__Impl ;
    public final void rule__Generator__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2962:1: ( rule__Generator__Group_6_2__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2963:2: rule__Generator__Group_6_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_2__2__Impl_in_rule__Generator__Group_6_2__26095);
            rule__Generator__Group_6_2__2__Impl();

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
    // $ANTLR end "rule__Generator__Group_6_2__2"


    // $ANTLR start "rule__Generator__Group_6_2__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2969:1: rule__Generator__Group_6_2__2__Impl : ( ( rule__Generator__Group_6_2_2__0 )* ) ;
    public final void rule__Generator__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2973:1: ( ( ( rule__Generator__Group_6_2_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2974:1: ( ( rule__Generator__Group_6_2_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2974:1: ( ( rule__Generator__Group_6_2_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2975:1: ( rule__Generator__Group_6_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_6_2_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2976:1: ( rule__Generator__Group_6_2_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2976:2: rule__Generator__Group_6_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Generator__Group_6_2_2__0_in_rule__Generator__Group_6_2__2__Impl6122);
            	    rule__Generator__Group_6_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGroup_6_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_6_2__2__Impl"


    // $ANTLR start "rule__Generator__Group_6_2_2__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2992:1: rule__Generator__Group_6_2_2__0 : rule__Generator__Group_6_2_2__0__Impl rule__Generator__Group_6_2_2__1 ;
    public final void rule__Generator__Group_6_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2996:1: ( rule__Generator__Group_6_2_2__0__Impl rule__Generator__Group_6_2_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2997:2: rule__Generator__Group_6_2_2__0__Impl rule__Generator__Group_6_2_2__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_2_2__0__Impl_in_rule__Generator__Group_6_2_2__06159);
            rule__Generator__Group_6_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6_2_2__1_in_rule__Generator__Group_6_2_2__06162);
            rule__Generator__Group_6_2_2__1();

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
    // $ANTLR end "rule__Generator__Group_6_2_2__0"


    // $ANTLR start "rule__Generator__Group_6_2_2__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3004:1: rule__Generator__Group_6_2_2__0__Impl : ( ',' ) ;
    public final void rule__Generator__Group_6_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3008:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3009:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3009:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3010:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getCommaKeyword_6_2_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Generator__Group_6_2_2__0__Impl6190); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getCommaKeyword_6_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_6_2_2__0__Impl"


    // $ANTLR start "rule__Generator__Group_6_2_2__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3023:1: rule__Generator__Group_6_2_2__1 : rule__Generator__Group_6_2_2__1__Impl ;
    public final void rule__Generator__Group_6_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3027:1: ( rule__Generator__Group_6_2_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3028:2: rule__Generator__Group_6_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_2_2__1__Impl_in_rule__Generator__Group_6_2_2__16221);
            rule__Generator__Group_6_2_2__1__Impl();

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
    // $ANTLR end "rule__Generator__Group_6_2_2__1"


    // $ANTLR start "rule__Generator__Group_6_2_2__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3034:1: rule__Generator__Group_6_2_2__1__Impl : ( ( rule__Generator__SourceTraceModelsAssignment_6_2_2_1 ) ) ;
    public final void rule__Generator__Group_6_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3038:1: ( ( ( rule__Generator__SourceTraceModelsAssignment_6_2_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3039:1: ( ( rule__Generator__SourceTraceModelsAssignment_6_2_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3039:1: ( ( rule__Generator__SourceTraceModelsAssignment_6_2_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3040:1: ( rule__Generator__SourceTraceModelsAssignment_6_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceTraceModelsAssignment_6_2_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3041:1: ( rule__Generator__SourceTraceModelsAssignment_6_2_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3041:2: rule__Generator__SourceTraceModelsAssignment_6_2_2_1
            {
            pushFollow(FOLLOW_rule__Generator__SourceTraceModelsAssignment_6_2_2_1_in_rule__Generator__Group_6_2_2__1__Impl6248);
            rule__Generator__SourceTraceModelsAssignment_6_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceTraceModelsAssignment_6_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__Group_6_2_2__1__Impl"


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3055:1: rule__SourceModelNodeSelector__Group_0__0 : rule__SourceModelNodeSelector__Group_0__0__Impl rule__SourceModelNodeSelector__Group_0__1 ;
    public final void rule__SourceModelNodeSelector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3059:1: ( rule__SourceModelNodeSelector__Group_0__0__Impl rule__SourceModelNodeSelector__Group_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3060:2: rule__SourceModelNodeSelector__Group_0__0__Impl rule__SourceModelNodeSelector__Group_0__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__0__Impl_in_rule__SourceModelNodeSelector__Group_0__06282);
            rule__SourceModelNodeSelector__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__1_in_rule__SourceModelNodeSelector__Group_0__06285);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3067:1: rule__SourceModelNodeSelector__Group_0__0__Impl : ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) ) ;
    public final void rule__SourceModelNodeSelector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3071:1: ( ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3072:1: ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3072:1: ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3073:1: ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceAssignment_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3074:1: ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3074:2: rule__SourceModelNodeSelector__ReferenceAssignment_0_0
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__ReferenceAssignment_0_0_in_rule__SourceModelNodeSelector__Group_0__0__Impl6312);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3084:1: rule__SourceModelNodeSelector__Group_0__1 : rule__SourceModelNodeSelector__Group_0__1__Impl rule__SourceModelNodeSelector__Group_0__2 ;
    public final void rule__SourceModelNodeSelector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3088:1: ( rule__SourceModelNodeSelector__Group_0__1__Impl rule__SourceModelNodeSelector__Group_0__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3089:2: rule__SourceModelNodeSelector__Group_0__1__Impl rule__SourceModelNodeSelector__Group_0__2
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__1__Impl_in_rule__SourceModelNodeSelector__Group_0__16342);
            rule__SourceModelNodeSelector__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__2_in_rule__SourceModelNodeSelector__Group_0__16345);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3096:1: rule__SourceModelNodeSelector__Group_0__1__Impl : ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? ) ;
    public final void rule__SourceModelNodeSelector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3100:1: ( ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3101:1: ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3101:1: ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3102:1: ( rule__SourceModelNodeSelector__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3103:1: ( rule__SourceModelNodeSelector__Group_0_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3103:2: rule__SourceModelNodeSelector__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0_in_rule__SourceModelNodeSelector__Group_0__1__Impl6372);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3113:1: rule__SourceModelNodeSelector__Group_0__2 : rule__SourceModelNodeSelector__Group_0__2__Impl ;
    public final void rule__SourceModelNodeSelector__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3117:1: ( rule__SourceModelNodeSelector__Group_0__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3118:2: rule__SourceModelNodeSelector__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__2__Impl_in_rule__SourceModelNodeSelector__Group_0__26403);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3124:1: rule__SourceModelNodeSelector__Group_0__2__Impl : ( ( rule__SourceModelNodeSelector__Group_0_2__0 )? ) ;
    public final void rule__SourceModelNodeSelector__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3128:1: ( ( ( rule__SourceModelNodeSelector__Group_0_2__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3129:1: ( ( rule__SourceModelNodeSelector__Group_0_2__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3129:1: ( ( rule__SourceModelNodeSelector__Group_0_2__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3130:1: ( rule__SourceModelNodeSelector__Group_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3131:1: ( rule__SourceModelNodeSelector__Group_0_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3131:2: rule__SourceModelNodeSelector__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_2__0_in_rule__SourceModelNodeSelector__Group_0__2__Impl6430);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3147:1: rule__SourceModelNodeSelector__Group_0_1__0 : rule__SourceModelNodeSelector__Group_0_1__0__Impl rule__SourceModelNodeSelector__Group_0_1__1 ;
    public final void rule__SourceModelNodeSelector__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3151:1: ( rule__SourceModelNodeSelector__Group_0_1__0__Impl rule__SourceModelNodeSelector__Group_0_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3152:2: rule__SourceModelNodeSelector__Group_0_1__0__Impl rule__SourceModelNodeSelector__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0__Impl_in_rule__SourceModelNodeSelector__Group_0_1__06467);
            rule__SourceModelNodeSelector__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1_in_rule__SourceModelNodeSelector__Group_0_1__06470);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3159:1: rule__SourceModelNodeSelector__Group_0_1__0__Impl : ( '[' ) ;
    public final void rule__SourceModelNodeSelector__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3163:1: ( ( '[' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3164:1: ( '[' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3164:1: ( '[' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3165:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getLeftSquareBracketKeyword_0_1_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__SourceModelNodeSelector__Group_0_1__0__Impl6498); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3178:1: rule__SourceModelNodeSelector__Group_0_1__1 : rule__SourceModelNodeSelector__Group_0_1__1__Impl rule__SourceModelNodeSelector__Group_0_1__2 ;
    public final void rule__SourceModelNodeSelector__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3182:1: ( rule__SourceModelNodeSelector__Group_0_1__1__Impl rule__SourceModelNodeSelector__Group_0_1__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3183:2: rule__SourceModelNodeSelector__Group_0_1__1__Impl rule__SourceModelNodeSelector__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1__Impl_in_rule__SourceModelNodeSelector__Group_0_1__16529);
            rule__SourceModelNodeSelector__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__2_in_rule__SourceModelNodeSelector__Group_0_1__16532);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3190:1: rule__SourceModelNodeSelector__Group_0_1__1__Impl : ( ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 ) ) ;
    public final void rule__SourceModelNodeSelector__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3194:1: ( ( ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3195:1: ( ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3195:1: ( ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3196:1: ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getConstraintAssignment_0_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3197:1: ( rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3197:2: rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1_in_rule__SourceModelNodeSelector__Group_0_1__1__Impl6559);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3207:1: rule__SourceModelNodeSelector__Group_0_1__2 : rule__SourceModelNodeSelector__Group_0_1__2__Impl ;
    public final void rule__SourceModelNodeSelector__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3211:1: ( rule__SourceModelNodeSelector__Group_0_1__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3212:2: rule__SourceModelNodeSelector__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__2__Impl_in_rule__SourceModelNodeSelector__Group_0_1__26589);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3218:1: rule__SourceModelNodeSelector__Group_0_1__2__Impl : ( ']' ) ;
    public final void rule__SourceModelNodeSelector__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3222:1: ( ( ']' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3223:1: ( ']' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3223:1: ( ']' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3224:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getRightSquareBracketKeyword_0_1_2()); 
            }
            match(input,42,FOLLOW_42_in_rule__SourceModelNodeSelector__Group_0_1__2__Impl6617); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3243:1: rule__SourceModelNodeSelector__Group_0_2__0 : rule__SourceModelNodeSelector__Group_0_2__0__Impl rule__SourceModelNodeSelector__Group_0_2__1 ;
    public final void rule__SourceModelNodeSelector__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3247:1: ( rule__SourceModelNodeSelector__Group_0_2__0__Impl rule__SourceModelNodeSelector__Group_0_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3248:2: rule__SourceModelNodeSelector__Group_0_2__0__Impl rule__SourceModelNodeSelector__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_2__0__Impl_in_rule__SourceModelNodeSelector__Group_0_2__06654);
            rule__SourceModelNodeSelector__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_2__1_in_rule__SourceModelNodeSelector__Group_0_2__06657);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3255:1: rule__SourceModelNodeSelector__Group_0_2__0__Impl : ( '/' ) ;
    public final void rule__SourceModelNodeSelector__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3259:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3260:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3260:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3261:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getSolidusKeyword_0_2_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__SourceModelNodeSelector__Group_0_2__0__Impl6685); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3274:1: rule__SourceModelNodeSelector__Group_0_2__1 : rule__SourceModelNodeSelector__Group_0_2__1__Impl ;
    public final void rule__SourceModelNodeSelector__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3278:1: ( rule__SourceModelNodeSelector__Group_0_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3279:2: rule__SourceModelNodeSelector__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_2__1__Impl_in_rule__SourceModelNodeSelector__Group_0_2__16716);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3285:1: rule__SourceModelNodeSelector__Group_0_2__1__Impl : ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 ) ) ;
    public final void rule__SourceModelNodeSelector__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3289:1: ( ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3290:1: ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3290:1: ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3291:1: ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyAssignment_0_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3292:1: ( rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3292:2: rule__SourceModelNodeSelector__PropertyAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__PropertyAssignment_0_2_1_in_rule__SourceModelNodeSelector__Group_0_2__1__Impl6743);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3306:1: rule__SourceModelNodeSelector__Group_1__0 : rule__SourceModelNodeSelector__Group_1__0__Impl rule__SourceModelNodeSelector__Group_1__1 ;
    public final void rule__SourceModelNodeSelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3310:1: ( rule__SourceModelNodeSelector__Group_1__0__Impl rule__SourceModelNodeSelector__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3311:2: rule__SourceModelNodeSelector__Group_1__0__Impl rule__SourceModelNodeSelector__Group_1__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__0__Impl_in_rule__SourceModelNodeSelector__Group_1__06777);
            rule__SourceModelNodeSelector__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__1_in_rule__SourceModelNodeSelector__Group_1__06780);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3318:1: rule__SourceModelNodeSelector__Group_1__0__Impl : ( () ) ;
    public final void rule__SourceModelNodeSelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3322:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3323:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3323:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3324:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getSourceModelNodeSelectorAction_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3325:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3327:1: 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3337:1: rule__SourceModelNodeSelector__Group_1__1 : rule__SourceModelNodeSelector__Group_1__1__Impl ;
    public final void rule__SourceModelNodeSelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3341:1: ( rule__SourceModelNodeSelector__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3342:2: rule__SourceModelNodeSelector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__1__Impl_in_rule__SourceModelNodeSelector__Group_1__16838);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3348:1: rule__SourceModelNodeSelector__Group_1__1__Impl : ( 'null' ) ;
    public final void rule__SourceModelNodeSelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3352:1: ( ( 'null' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3353:1: ( 'null' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3353:1: ( 'null' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3354:1: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getNullKeyword_1_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__SourceModelNodeSelector__Group_1__1__Impl6866); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3371:1: rule__TargetModelNodeType__Group__0 : rule__TargetModelNodeType__Group__0__Impl rule__TargetModelNodeType__Group__1 ;
    public final void rule__TargetModelNodeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3375:1: ( rule__TargetModelNodeType__Group__0__Impl rule__TargetModelNodeType__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3376:2: rule__TargetModelNodeType__Group__0__Impl rule__TargetModelNodeType__Group__1
            {
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__0__Impl_in_rule__TargetModelNodeType__Group__06901);
            rule__TargetModelNodeType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__1_in_rule__TargetModelNodeType__Group__06904);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3383:1: rule__TargetModelNodeType__Group__0__Impl : ( () ) ;
    public final void rule__TargetModelNodeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3387:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3388:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3388:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3389:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getTargetModelNodeTypeAction_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3390:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3392:1: 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3402:1: rule__TargetModelNodeType__Group__1 : rule__TargetModelNodeType__Group__1__Impl ;
    public final void rule__TargetModelNodeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3406:1: ( rule__TargetModelNodeType__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3407:2: rule__TargetModelNodeType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__1__Impl_in_rule__TargetModelNodeType__Group__16962);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3413:1: rule__TargetModelNodeType__Group__1__Impl : ( ( rule__TargetModelNodeType__ReferenceAssignment_1 ) ) ;
    public final void rule__TargetModelNodeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3417:1: ( ( ( rule__TargetModelNodeType__ReferenceAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3418:1: ( ( rule__TargetModelNodeType__ReferenceAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3418:1: ( ( rule__TargetModelNodeType__ReferenceAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3419:1: ( rule__TargetModelNodeType__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3420:1: ( rule__TargetModelNodeType__ReferenceAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3420:2: rule__TargetModelNodeType__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__TargetModelNodeType__ReferenceAssignment_1_in_rule__TargetModelNodeType__Group__1__Impl6989);
            rule__TargetModelNodeType__ReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3434:1: rule__ModelNodeType__Group__0 : rule__ModelNodeType__Group__0__Impl rule__ModelNodeType__Group__1 ;
    public final void rule__ModelNodeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3438:1: ( rule__ModelNodeType__Group__0__Impl rule__ModelNodeType__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3439:2: rule__ModelNodeType__Group__0__Impl rule__ModelNodeType__Group__1
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__0__Impl_in_rule__ModelNodeType__Group__07023);
            rule__ModelNodeType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelNodeType__Group__1_in_rule__ModelNodeType__Group__07026);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3446:1: rule__ModelNodeType__Group__0__Impl : ( ( rule__ModelNodeType__TargetAssignment_0 ) ) ;
    public final void rule__ModelNodeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3450:1: ( ( ( rule__ModelNodeType__TargetAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3451:1: ( ( rule__ModelNodeType__TargetAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3451:1: ( ( rule__ModelNodeType__TargetAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3452:1: ( rule__ModelNodeType__TargetAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTargetAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3453:1: ( rule__ModelNodeType__TargetAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3453:2: rule__ModelNodeType__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__ModelNodeType__TargetAssignment_0_in_rule__ModelNodeType__Group__0__Impl7053);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3463:1: rule__ModelNodeType__Group__1 : rule__ModelNodeType__Group__1__Impl rule__ModelNodeType__Group__2 ;
    public final void rule__ModelNodeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3467:1: ( rule__ModelNodeType__Group__1__Impl rule__ModelNodeType__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3468:2: rule__ModelNodeType__Group__1__Impl rule__ModelNodeType__Group__2
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__1__Impl_in_rule__ModelNodeType__Group__17083);
            rule__ModelNodeType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelNodeType__Group__2_in_rule__ModelNodeType__Group__17086);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3475:1: rule__ModelNodeType__Group__1__Impl : ( ( rule__ModelNodeType__Group_1__0 )? ) ;
    public final void rule__ModelNodeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3479:1: ( ( ( rule__ModelNodeType__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3480:1: ( ( rule__ModelNodeType__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3480:1: ( ( rule__ModelNodeType__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3481:1: ( rule__ModelNodeType__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3482:1: ( rule__ModelNodeType__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3482:2: rule__ModelNodeType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ModelNodeType__Group_1__0_in_rule__ModelNodeType__Group__1__Impl7113);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3492:1: rule__ModelNodeType__Group__2 : rule__ModelNodeType__Group__2__Impl ;
    public final void rule__ModelNodeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3496:1: ( rule__ModelNodeType__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3497:2: rule__ModelNodeType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__2__Impl_in_rule__ModelNodeType__Group__27144);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3503:1: rule__ModelNodeType__Group__2__Impl : ( ( rule__ModelNodeType__CollectionAssignment_2 )? ) ;
    public final void rule__ModelNodeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3507:1: ( ( ( rule__ModelNodeType__CollectionAssignment_2 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3508:1: ( ( rule__ModelNodeType__CollectionAssignment_2 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3508:1: ( ( rule__ModelNodeType__CollectionAssignment_2 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3509:1: ( rule__ModelNodeType__CollectionAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getCollectionAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3510:1: ( rule__ModelNodeType__CollectionAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==52) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3510:2: rule__ModelNodeType__CollectionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ModelNodeType__CollectionAssignment_2_in_rule__ModelNodeType__Group__2__Impl7171);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3526:1: rule__ModelNodeType__Group_1__0 : rule__ModelNodeType__Group_1__0__Impl rule__ModelNodeType__Group_1__1 ;
    public final void rule__ModelNodeType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3530:1: ( rule__ModelNodeType__Group_1__0__Impl rule__ModelNodeType__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3531:2: rule__ModelNodeType__Group_1__0__Impl rule__ModelNodeType__Group_1__1
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group_1__0__Impl_in_rule__ModelNodeType__Group_1__07208);
            rule__ModelNodeType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelNodeType__Group_1__1_in_rule__ModelNodeType__Group_1__07211);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3538:1: rule__ModelNodeType__Group_1__0__Impl : ( '/' ) ;
    public final void rule__ModelNodeType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3542:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3543:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3543:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3544:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getSolidusKeyword_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__ModelNodeType__Group_1__0__Impl7239); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3557:1: rule__ModelNodeType__Group_1__1 : rule__ModelNodeType__Group_1__1__Impl ;
    public final void rule__ModelNodeType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3561:1: ( rule__ModelNodeType__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3562:2: rule__ModelNodeType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group_1__1__Impl_in_rule__ModelNodeType__Group_1__17270);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3568:1: rule__ModelNodeType__Group_1__1__Impl : ( ( rule__ModelNodeType__PropertyAssignment_1_1 ) ) ;
    public final void rule__ModelNodeType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3572:1: ( ( ( rule__ModelNodeType__PropertyAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3573:1: ( ( rule__ModelNodeType__PropertyAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3573:1: ( ( rule__ModelNodeType__PropertyAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3574:1: ( rule__ModelNodeType__PropertyAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getPropertyAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3575:1: ( rule__ModelNodeType__PropertyAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3575:2: rule__ModelNodeType__PropertyAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ModelNodeType__PropertyAssignment_1_1_in_rule__ModelNodeType__Group_1__1__Impl7297);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3589:1: rule__NodeProperty__Group__0 : rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1 ;
    public final void rule__NodeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3593:1: ( rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3594:2: rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__0__Impl_in_rule__NodeProperty__Group__07331);
            rule__NodeProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group__1_in_rule__NodeProperty__Group__07334);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3601:1: rule__NodeProperty__Group__0__Impl : ( ( rule__NodeProperty__PropertyAssignment_0 ) ) ;
    public final void rule__NodeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3605:1: ( ( ( rule__NodeProperty__PropertyAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3606:1: ( ( rule__NodeProperty__PropertyAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3606:1: ( ( rule__NodeProperty__PropertyAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3607:1: ( rule__NodeProperty__PropertyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3608:1: ( rule__NodeProperty__PropertyAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3608:2: rule__NodeProperty__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__NodeProperty__PropertyAssignment_0_in_rule__NodeProperty__Group__0__Impl7361);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3618:1: rule__NodeProperty__Group__1 : rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2 ;
    public final void rule__NodeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3622:1: ( rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3623:2: rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__1__Impl_in_rule__NodeProperty__Group__17391);
            rule__NodeProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group__2_in_rule__NodeProperty__Group__17394);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3630:1: rule__NodeProperty__Group__1__Impl : ( ( rule__NodeProperty__Group_1__0 )? ) ;
    public final void rule__NodeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3634:1: ( ( ( rule__NodeProperty__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3635:1: ( ( rule__NodeProperty__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3635:1: ( ( rule__NodeProperty__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3636:1: ( rule__NodeProperty__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3637:1: ( rule__NodeProperty__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3637:2: rule__NodeProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NodeProperty__Group_1__0_in_rule__NodeProperty__Group__1__Impl7421);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3647:1: rule__NodeProperty__Group__2 : rule__NodeProperty__Group__2__Impl ;
    public final void rule__NodeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3651:1: ( rule__NodeProperty__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3652:2: rule__NodeProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__2__Impl_in_rule__NodeProperty__Group__27452);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3658:1: rule__NodeProperty__Group__2__Impl : ( ( rule__NodeProperty__Group_2__0 )? ) ;
    public final void rule__NodeProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3662:1: ( ( ( rule__NodeProperty__Group_2__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3663:1: ( ( rule__NodeProperty__Group_2__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3663:1: ( ( rule__NodeProperty__Group_2__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3664:1: ( rule__NodeProperty__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3665:1: ( rule__NodeProperty__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3665:2: rule__NodeProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NodeProperty__Group_2__0_in_rule__NodeProperty__Group__2__Impl7479);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3681:1: rule__NodeProperty__Group_1__0 : rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1 ;
    public final void rule__NodeProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3685:1: ( rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3686:2: rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__0__Impl_in_rule__NodeProperty__Group_1__07516);
            rule__NodeProperty__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__1_in_rule__NodeProperty__Group_1__07519);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3693:1: rule__NodeProperty__Group_1__0__Impl : ( '[' ) ;
    public final void rule__NodeProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3697:1: ( ( '[' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3698:1: ( '[' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3698:1: ( '[' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3699:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__NodeProperty__Group_1__0__Impl7547); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3712:1: rule__NodeProperty__Group_1__1 : rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2 ;
    public final void rule__NodeProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3716:1: ( rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3717:2: rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__1__Impl_in_rule__NodeProperty__Group_1__17578);
            rule__NodeProperty__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__2_in_rule__NodeProperty__Group_1__17581);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3724:1: rule__NodeProperty__Group_1__1__Impl : ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) ) ;
    public final void rule__NodeProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3728:1: ( ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3729:1: ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3729:1: ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3730:1: ( rule__NodeProperty__ConstraintAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getConstraintAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3731:1: ( rule__NodeProperty__ConstraintAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3731:2: rule__NodeProperty__ConstraintAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NodeProperty__ConstraintAssignment_1_1_in_rule__NodeProperty__Group_1__1__Impl7608);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3741:1: rule__NodeProperty__Group_1__2 : rule__NodeProperty__Group_1__2__Impl ;
    public final void rule__NodeProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3745:1: ( rule__NodeProperty__Group_1__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3746:2: rule__NodeProperty__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__2__Impl_in_rule__NodeProperty__Group_1__27638);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3752:1: rule__NodeProperty__Group_1__2__Impl : ( ']' ) ;
    public final void rule__NodeProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3756:1: ( ( ']' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3757:1: ( ']' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3757:1: ( ']' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3758:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,42,FOLLOW_42_in_rule__NodeProperty__Group_1__2__Impl7666); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3777:1: rule__NodeProperty__Group_2__0 : rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1 ;
    public final void rule__NodeProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3781:1: ( rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3782:2: rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__0__Impl_in_rule__NodeProperty__Group_2__07703);
            rule__NodeProperty__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__1_in_rule__NodeProperty__Group_2__07706);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3789:1: rule__NodeProperty__Group_2__0__Impl : ( '/' ) ;
    public final void rule__NodeProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3793:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3794:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3794:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3795:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSolidusKeyword_2_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__NodeProperty__Group_2__0__Impl7734); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3808:1: rule__NodeProperty__Group_2__1 : rule__NodeProperty__Group_2__1__Impl ;
    public final void rule__NodeProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3812:1: ( rule__NodeProperty__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3813:2: rule__NodeProperty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__1__Impl_in_rule__NodeProperty__Group_2__17765);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3819:1: rule__NodeProperty__Group_2__1__Impl : ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) ) ;
    public final void rule__NodeProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3823:1: ( ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3824:1: ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3824:1: ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3825:1: ( rule__NodeProperty__SubPropertyAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSubPropertyAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3826:1: ( rule__NodeProperty__SubPropertyAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3826:2: rule__NodeProperty__SubPropertyAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NodeProperty__SubPropertyAssignment_2_1_in_rule__NodeProperty__Group_2__1__Impl7792);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3840:1: rule__ConstraintExpression__Group__0 : rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 ;
    public final void rule__ConstraintExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3844:1: ( rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3845:2: rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__07826);
            rule__ConstraintExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__07829);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3852:1: rule__ConstraintExpression__Group__0__Impl : ( ruleCompareExpression ) ;
    public final void rule__ConstraintExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3856:1: ( ( ruleCompareExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3857:1: ( ruleCompareExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3857:1: ( ruleCompareExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3858:1: ruleCompareExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getCompareExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_rule__ConstraintExpression__Group__0__Impl7856);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3869:1: rule__ConstraintExpression__Group__1 : rule__ConstraintExpression__Group__1__Impl ;
    public final void rule__ConstraintExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3873:1: ( rule__ConstraintExpression__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3874:2: rule__ConstraintExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__17885);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3880:1: rule__ConstraintExpression__Group__1__Impl : ( ( rule__ConstraintExpression__Group_1__0 )? ) ;
    public final void rule__ConstraintExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3884:1: ( ( ( rule__ConstraintExpression__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3885:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3885:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3886:1: ( rule__ConstraintExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3887:1: ( rule__ConstraintExpression__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==18) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred43_InternalArchitecture()) ) {
                    alt32=1;
                }
            }
            else if ( (LA32_0==19) ) {
                int LA32_2 = input.LA(2);

                if ( (synpred43_InternalArchitecture()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3887:2: rule__ConstraintExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl7912);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3901:1: rule__ConstraintExpression__Group_1__0 : rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 ;
    public final void rule__ConstraintExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3905:1: ( rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3906:2: rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__07947);
            rule__ConstraintExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__07950);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3913:1: rule__ConstraintExpression__Group_1__0__Impl : ( ( rule__ConstraintExpression__Group_1_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3917:1: ( ( ( rule__ConstraintExpression__Group_1_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3918:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3918:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3919:1: ( rule__ConstraintExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3920:1: ( rule__ConstraintExpression__Group_1_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3920:2: rule__ConstraintExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl7977);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3930:1: rule__ConstraintExpression__Group_1__1 : rule__ConstraintExpression__Group_1__1__Impl ;
    public final void rule__ConstraintExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3934:1: ( rule__ConstraintExpression__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3935:2: rule__ConstraintExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__18007);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3941:1: rule__ConstraintExpression__Group_1__1__Impl : ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3945:1: ( ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3946:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3946:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3947:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3948:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3948:2: rule__ConstraintExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl8034);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3962:1: rule__ConstraintExpression__Group_1_0__0 : rule__ConstraintExpression__Group_1_0__0__Impl ;
    public final void rule__ConstraintExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3966:1: ( rule__ConstraintExpression__Group_1_0__0__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3967:2: rule__ConstraintExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__08068);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3973:1: rule__ConstraintExpression__Group_1_0__0__Impl : ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3977:1: ( ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3978:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3978:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3979:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3980:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3980:2: rule__ConstraintExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl8095);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3992:1: rule__ConstraintExpression__Group_1_0_0__0 : rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 ;
    public final void rule__ConstraintExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3996:1: ( rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3997:2: rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__08127);
            rule__ConstraintExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__08130);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4004:1: rule__ConstraintExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4008:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4009:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4009:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4010:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4011:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4013:1: 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4023:1: rule__ConstraintExpression__Group_1_0_0__1 : rule__ConstraintExpression__Group_1_0_0__1__Impl ;
    public final void rule__ConstraintExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4027:1: ( rule__ConstraintExpression__Group_1_0_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4028:2: rule__ConstraintExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__18188);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4034:1: rule__ConstraintExpression__Group_1_0_0__1__Impl : ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4038:1: ( ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4039:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4039:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4040:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4041:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4041:2: rule__ConstraintExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl8215);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4055:1: rule__CompareExpression__Group__0 : rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 ;
    public final void rule__CompareExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4059:1: ( rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4060:2: rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__08249);
            rule__CompareExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__08252);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4067:1: rule__CompareExpression__Group__0__Impl : ( ruleBasicConstraint ) ;
    public final void rule__CompareExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4071:1: ( ( ruleBasicConstraint ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4072:1: ( ruleBasicConstraint )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4072:1: ( ruleBasicConstraint )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4073:1: ruleBasicConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getBasicConstraintParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__Group__0__Impl8279);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4084:1: rule__CompareExpression__Group__1 : rule__CompareExpression__Group__1__Impl ;
    public final void rule__CompareExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4088:1: ( rule__CompareExpression__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4089:2: rule__CompareExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__18308);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4095:1: rule__CompareExpression__Group__1__Impl : ( ( rule__CompareExpression__Group_1__0 )? ) ;
    public final void rule__CompareExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4099:1: ( ( ( rule__CompareExpression__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4100:1: ( ( rule__CompareExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4100:1: ( ( rule__CompareExpression__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4101:1: ( rule__CompareExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4102:1: ( rule__CompareExpression__Group_1__0 )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4102:2: rule__CompareExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl8335);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4116:1: rule__CompareExpression__Group_1__0 : rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 ;
    public final void rule__CompareExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4120:1: ( rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4121:2: rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__08370);
            rule__CompareExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__08373);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4128:1: rule__CompareExpression__Group_1__0__Impl : ( ( rule__CompareExpression__Group_1_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4132:1: ( ( ( rule__CompareExpression__Group_1_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4133:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4133:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4134:1: ( rule__CompareExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4135:1: ( rule__CompareExpression__Group_1_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4135:2: rule__CompareExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl8400);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4145:1: rule__CompareExpression__Group_1__1 : rule__CompareExpression__Group_1__1__Impl ;
    public final void rule__CompareExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4149:1: ( rule__CompareExpression__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4150:2: rule__CompareExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__18430);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4156:1: rule__CompareExpression__Group_1__1__Impl : ( ( rule__CompareExpression__RightAssignment_1_1 ) ) ;
    public final void rule__CompareExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4160:1: ( ( ( rule__CompareExpression__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4161:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4161:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4162:1: ( rule__CompareExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4163:1: ( rule__CompareExpression__RightAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4163:2: rule__CompareExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl8457);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4177:1: rule__CompareExpression__Group_1_0__0 : rule__CompareExpression__Group_1_0__0__Impl ;
    public final void rule__CompareExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4181:1: ( rule__CompareExpression__Group_1_0__0__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4182:2: rule__CompareExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__08491);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4188:1: rule__CompareExpression__Group_1_0__0__Impl : ( ( rule__CompareExpression__Group_1_0_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4192:1: ( ( ( rule__CompareExpression__Group_1_0_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4193:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4193:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4194:1: ( rule__CompareExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4195:1: ( rule__CompareExpression__Group_1_0_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4195:2: rule__CompareExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl8518);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4207:1: rule__CompareExpression__Group_1_0_0__0 : rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 ;
    public final void rule__CompareExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4211:1: ( rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4212:2: rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__08550);
            rule__CompareExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__08553);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4219:1: rule__CompareExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__CompareExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4223:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4224:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4224:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4225:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4226:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4228:1: 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4238:1: rule__CompareExpression__Group_1_0_0__1 : rule__CompareExpression__Group_1_0_0__1__Impl ;
    public final void rule__CompareExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4242:1: ( rule__CompareExpression__Group_1_0_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4243:2: rule__CompareExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__18611);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4249:1: rule__CompareExpression__Group_1_0_0__1__Impl : ( ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 ) ) ;
    public final void rule__CompareExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4253:1: ( ( ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4254:1: ( ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4254:1: ( ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4255:1: ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getComparatorAssignment_1_0_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4256:1: ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4256:2: rule__CompareExpression__ComparatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__ComparatorAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl8638);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4270:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4274:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4275:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__08672);
            rule__Negation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__08675);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4282:1: rule__Negation__Group__0__Impl : ( '!' ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4286:1: ( ( '!' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4287:1: ( '!' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4287:1: ( '!' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4288:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Negation__Group__0__Impl8703); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4301:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4305:1: ( rule__Negation__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4306:2: rule__Negation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__18734);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4312:1: rule__Negation__Group__1__Impl : ( ( rule__Negation__ConstraintAssignment_1 ) ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4316:1: ( ( ( rule__Negation__ConstraintAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4317:1: ( ( rule__Negation__ConstraintAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4317:1: ( ( rule__Negation__ConstraintAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4318:1: ( rule__Negation__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getConstraintAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4319:1: ( rule__Negation__ConstraintAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4319:2: rule__Negation__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__Negation__ConstraintAssignment_1_in_rule__Negation__Group__1__Impl8761);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4333:1: rule__ParenthesisConstraint__Group__0 : rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 ;
    public final void rule__ParenthesisConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4337:1: ( rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4338:2: rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__08795);
            rule__ParenthesisConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__08798);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4345:1: rule__ParenthesisConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4349:1: ( ( '(' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4350:1: ( '(' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4350:1: ( '(' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4351:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ParenthesisConstraint__Group__0__Impl8826); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4364:1: rule__ParenthesisConstraint__Group__1 : rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 ;
    public final void rule__ParenthesisConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4368:1: ( rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4369:2: rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__18857);
            rule__ParenthesisConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__18860);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4376:1: rule__ParenthesisConstraint__Group__1__Impl : ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__ParenthesisConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4380:1: ( ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4381:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4381:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4382:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4383:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4383:2: rule__ParenthesisConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl8887);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4393:1: rule__ParenthesisConstraint__Group__2 : rule__ParenthesisConstraint__Group__2__Impl ;
    public final void rule__ParenthesisConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4397:1: ( rule__ParenthesisConstraint__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4398:2: rule__ParenthesisConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__28917);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4404:1: rule__ParenthesisConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4408:1: ( ( ')' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4409:1: ( ')' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4409:1: ( ')' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4410:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,38,FOLLOW_38_in_rule__ParenthesisConstraint__Group__2__Impl8945); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4429:1: rule__Typeof__Group__0 : rule__Typeof__Group__0__Impl rule__Typeof__Group__1 ;
    public final void rule__Typeof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4433:1: ( rule__Typeof__Group__0__Impl rule__Typeof__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4434:2: rule__Typeof__Group__0__Impl rule__Typeof__Group__1
            {
            pushFollow(FOLLOW_rule__Typeof__Group__0__Impl_in_rule__Typeof__Group__08982);
            rule__Typeof__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Typeof__Group__1_in_rule__Typeof__Group__08985);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4441:1: rule__Typeof__Group__0__Impl : ( 'typeof' ) ;
    public final void rule__Typeof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4445:1: ( ( 'typeof' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4446:1: ( 'typeof' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4446:1: ( 'typeof' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4447:1: 'typeof'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getTypeofKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Typeof__Group__0__Impl9013); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4460:1: rule__Typeof__Group__1 : rule__Typeof__Group__1__Impl ;
    public final void rule__Typeof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4464:1: ( rule__Typeof__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4465:2: rule__Typeof__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Typeof__Group__1__Impl_in_rule__Typeof__Group__19044);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4471:1: rule__Typeof__Group__1__Impl : ( ( rule__Typeof__TypeAssignment_1 ) ) ;
    public final void rule__Typeof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4475:1: ( ( ( rule__Typeof__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4476:1: ( ( rule__Typeof__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4476:1: ( ( rule__Typeof__TypeAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4477:1: ( rule__Typeof__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4478:1: ( rule__Typeof__TypeAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4478:2: rule__Typeof__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Typeof__TypeAssignment_1_in_rule__Typeof__Group__1__Impl9071);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4492:1: rule__TargetTraceModel__Group_1__0 : rule__TargetTraceModel__Group_1__0__Impl rule__TargetTraceModel__Group_1__1 ;
    public final void rule__TargetTraceModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4496:1: ( rule__TargetTraceModel__Group_1__0__Impl rule__TargetTraceModel__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4497:2: rule__TargetTraceModel__Group_1__0__Impl rule__TargetTraceModel__Group_1__1
            {
            pushFollow(FOLLOW_rule__TargetTraceModel__Group_1__0__Impl_in_rule__TargetTraceModel__Group_1__09105);
            rule__TargetTraceModel__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetTraceModel__Group_1__1_in_rule__TargetTraceModel__Group_1__09108);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4504:1: rule__TargetTraceModel__Group_1__0__Impl : ( 'use' ) ;
    public final void rule__TargetTraceModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4508:1: ( ( 'use' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4509:1: ( 'use' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4509:1: ( 'use' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4510:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetTraceModelAccess().getUseKeyword_1_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__TargetTraceModel__Group_1__0__Impl9136); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4523:1: rule__TargetTraceModel__Group_1__1 : rule__TargetTraceModel__Group_1__1__Impl ;
    public final void rule__TargetTraceModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4527:1: ( rule__TargetTraceModel__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4528:2: rule__TargetTraceModel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TargetTraceModel__Group_1__1__Impl_in_rule__TargetTraceModel__Group_1__19167);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4534:1: rule__TargetTraceModel__Group_1__1__Impl : ( ruleTraceModelReference ) ;
    public final void rule__TargetTraceModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4538:1: ( ( ruleTraceModelReference ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4539:1: ( ruleTraceModelReference )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4539:1: ( ruleTraceModelReference )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4540:1: ruleTraceModelReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetTraceModelAccess().getTraceModelReferenceParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleTraceModelReference_in_rule__TargetTraceModel__Group_1__1__Impl9194);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4555:1: rule__TraceModel__Group__0 : rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1 ;
    public final void rule__TraceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4559:1: ( rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4560:2: rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__0__Impl_in_rule__TraceModel__Group__09227);
            rule__TraceModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__1_in_rule__TraceModel__Group__09230);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4567:1: rule__TraceModel__Group__0__Impl : ( ( rule__TraceModel__NameAssignment_0 ) ) ;
    public final void rule__TraceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4571:1: ( ( ( rule__TraceModel__NameAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4572:1: ( ( rule__TraceModel__NameAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4572:1: ( ( rule__TraceModel__NameAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4573:1: ( rule__TraceModel__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNameAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4574:1: ( rule__TraceModel__NameAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4574:2: rule__TraceModel__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TraceModel__NameAssignment_0_in_rule__TraceModel__Group__0__Impl9257);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4584:1: rule__TraceModel__Group__1 : rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2 ;
    public final void rule__TraceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4588:1: ( rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4589:2: rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__1__Impl_in_rule__TraceModel__Group__19287);
            rule__TraceModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__2_in_rule__TraceModel__Group__19290);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4596:1: rule__TraceModel__Group__1__Impl : ( '<' ) ;
    public final void rule__TraceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4600:1: ( ( '<' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4601:1: ( '<' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4601:1: ( '<' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4602:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getLessThanSignKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__TraceModel__Group__1__Impl9318); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4615:1: rule__TraceModel__Group__2 : rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3 ;
    public final void rule__TraceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4619:1: ( rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4620:2: rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__2__Impl_in_rule__TraceModel__Group__29349);
            rule__TraceModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__3_in_rule__TraceModel__Group__29352);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4627:1: rule__TraceModel__Group__2__Impl : ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) ) ;
    public final void rule__TraceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4631:1: ( ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4632:1: ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4632:1: ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4633:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4633:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4634:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4635:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4635:2: rule__TraceModel__NodeSetRelationsAssignment_2
            {
            pushFollow(FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl9381);
            rule__TraceModel__NodeSetRelationsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }

            }

            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4638:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4639:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4640:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==37) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4640:2: rule__TraceModel__NodeSetRelationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl9393);
            	    rule__TraceModel__NodeSetRelationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4651:1: rule__TraceModel__Group__3 : rule__TraceModel__Group__3__Impl ;
    public final void rule__TraceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4655:1: ( rule__TraceModel__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4656:2: rule__TraceModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__3__Impl_in_rule__TraceModel__Group__39426);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4662:1: rule__TraceModel__Group__3__Impl : ( '>' ) ;
    public final void rule__TraceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4666:1: ( ( '>' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4667:1: ( '>' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4667:1: ( '>' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4668:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__TraceModel__Group__3__Impl9454); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4689:1: rule__NodeSetRelation__Group__0 : rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1 ;
    public final void rule__NodeSetRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4693:1: ( rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4694:2: rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__0__Impl_in_rule__NodeSetRelation__Group__09493);
            rule__NodeSetRelation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__1_in_rule__NodeSetRelation__Group__09496);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4701:1: rule__NodeSetRelation__Group__0__Impl : ( '(' ) ;
    public final void rule__NodeSetRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4705:1: ( ( '(' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4706:1: ( '(' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4706:1: ( '(' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4707:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__NodeSetRelation__Group__0__Impl9524); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4720:1: rule__NodeSetRelation__Group__1 : rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2 ;
    public final void rule__NodeSetRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4724:1: ( rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4725:2: rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__1__Impl_in_rule__NodeSetRelation__Group__19555);
            rule__NodeSetRelation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__2_in_rule__NodeSetRelation__Group__19558);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4732:1: rule__NodeSetRelation__Group__1__Impl : ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) ) ;
    public final void rule__NodeSetRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4736:1: ( ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4737:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4737:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4738:1: ( rule__NodeSetRelation__SourceNodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4739:1: ( rule__NodeSetRelation__SourceNodesAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4739:2: rule__NodeSetRelation__SourceNodesAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_1_in_rule__NodeSetRelation__Group__1__Impl9585);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4749:1: rule__NodeSetRelation__Group__2 : rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3 ;
    public final void rule__NodeSetRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4753:1: ( rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4754:2: rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__2__Impl_in_rule__NodeSetRelation__Group__29615);
            rule__NodeSetRelation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__3_in_rule__NodeSetRelation__Group__29618);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4761:1: rule__NodeSetRelation__Group__2__Impl : ( ( rule__NodeSetRelation__Group_2__0 )* ) ;
    public final void rule__NodeSetRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4765:1: ( ( ( rule__NodeSetRelation__Group_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4766:1: ( ( rule__NodeSetRelation__Group_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4766:1: ( ( rule__NodeSetRelation__Group_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4767:1: ( rule__NodeSetRelation__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4768:1: ( rule__NodeSetRelation__Group_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==30) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4768:2: rule__NodeSetRelation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__0_in_rule__NodeSetRelation__Group__2__Impl9645);
            	    rule__NodeSetRelation__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4778:1: rule__NodeSetRelation__Group__3 : rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4 ;
    public final void rule__NodeSetRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4782:1: ( rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4783:2: rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__3__Impl_in_rule__NodeSetRelation__Group__39676);
            rule__NodeSetRelation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__4_in_rule__NodeSetRelation__Group__39679);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4790:1: rule__NodeSetRelation__Group__3__Impl : ( ':' ) ;
    public final void rule__NodeSetRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4794:1: ( ( ':' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4795:1: ( ':' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4795:1: ( ':' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4796:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getColonKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__NodeSetRelation__Group__3__Impl9707); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4809:1: rule__NodeSetRelation__Group__4 : rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5 ;
    public final void rule__NodeSetRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4813:1: ( rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4814:2: rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__4__Impl_in_rule__NodeSetRelation__Group__49738);
            rule__NodeSetRelation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__5_in_rule__NodeSetRelation__Group__49741);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4821:1: rule__NodeSetRelation__Group__4__Impl : ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) ) ;
    public final void rule__NodeSetRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4825:1: ( ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4826:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4826:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4827:1: ( rule__NodeSetRelation__TargetNodesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4828:1: ( rule__NodeSetRelation__TargetNodesAssignment_4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4828:2: rule__NodeSetRelation__TargetNodesAssignment_4
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_4_in_rule__NodeSetRelation__Group__4__Impl9768);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4838:1: rule__NodeSetRelation__Group__5 : rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6 ;
    public final void rule__NodeSetRelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4842:1: ( rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4843:2: rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__5__Impl_in_rule__NodeSetRelation__Group__59798);
            rule__NodeSetRelation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__6_in_rule__NodeSetRelation__Group__59801);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4850:1: rule__NodeSetRelation__Group__5__Impl : ( ( rule__NodeSetRelation__Group_5__0 )* ) ;
    public final void rule__NodeSetRelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4854:1: ( ( ( rule__NodeSetRelation__Group_5__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4855:1: ( ( rule__NodeSetRelation__Group_5__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4855:1: ( ( rule__NodeSetRelation__Group_5__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4856:1: ( rule__NodeSetRelation__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4857:1: ( rule__NodeSetRelation__Group_5__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4857:2: rule__NodeSetRelation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__0_in_rule__NodeSetRelation__Group__5__Impl9828);
            	    rule__NodeSetRelation__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4867:1: rule__NodeSetRelation__Group__6 : rule__NodeSetRelation__Group__6__Impl ;
    public final void rule__NodeSetRelation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4871:1: ( rule__NodeSetRelation__Group__6__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4872:2: rule__NodeSetRelation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__6__Impl_in_rule__NodeSetRelation__Group__69859);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4878:1: rule__NodeSetRelation__Group__6__Impl : ( ')' ) ;
    public final void rule__NodeSetRelation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4882:1: ( ( ')' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4883:1: ( ')' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4883:1: ( ')' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4884:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,38,FOLLOW_38_in_rule__NodeSetRelation__Group__6__Impl9887); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4911:1: rule__NodeSetRelation__Group_2__0 : rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1 ;
    public final void rule__NodeSetRelation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4915:1: ( rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4916:2: rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__0__Impl_in_rule__NodeSetRelation__Group_2__09932);
            rule__NodeSetRelation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__1_in_rule__NodeSetRelation__Group_2__09935);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4923:1: rule__NodeSetRelation__Group_2__0__Impl : ( ',' ) ;
    public final void rule__NodeSetRelation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4927:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4928:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4928:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4929:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getCommaKeyword_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__NodeSetRelation__Group_2__0__Impl9963); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4942:1: rule__NodeSetRelation__Group_2__1 : rule__NodeSetRelation__Group_2__1__Impl ;
    public final void rule__NodeSetRelation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4946:1: ( rule__NodeSetRelation__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4947:2: rule__NodeSetRelation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__1__Impl_in_rule__NodeSetRelation__Group_2__19994);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4953:1: rule__NodeSetRelation__Group_2__1__Impl : ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) ) ;
    public final void rule__NodeSetRelation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4957:1: ( ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4958:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4958:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4959:1: ( rule__NodeSetRelation__SourceNodesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4960:1: ( rule__NodeSetRelation__SourceNodesAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4960:2: rule__NodeSetRelation__SourceNodesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_2_1_in_rule__NodeSetRelation__Group_2__1__Impl10021);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4974:1: rule__NodeSetRelation__Group_5__0 : rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1 ;
    public final void rule__NodeSetRelation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4978:1: ( rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4979:2: rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__0__Impl_in_rule__NodeSetRelation__Group_5__010055);
            rule__NodeSetRelation__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__1_in_rule__NodeSetRelation__Group_5__010058);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4986:1: rule__NodeSetRelation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__NodeSetRelation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4990:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4991:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4991:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4992:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getCommaKeyword_5_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__NodeSetRelation__Group_5__0__Impl10086); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5005:1: rule__NodeSetRelation__Group_5__1 : rule__NodeSetRelation__Group_5__1__Impl ;
    public final void rule__NodeSetRelation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5009:1: ( rule__NodeSetRelation__Group_5__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5010:2: rule__NodeSetRelation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__1__Impl_in_rule__NodeSetRelation__Group_5__110117);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5016:1: rule__NodeSetRelation__Group_5__1__Impl : ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) ) ;
    public final void rule__NodeSetRelation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5020:1: ( ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5021:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5021:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5022:1: ( rule__NodeSetRelation__TargetNodesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_5_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5023:1: ( rule__NodeSetRelation__TargetNodesAssignment_5_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5023:2: rule__NodeSetRelation__TargetNodesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_5_1_in_rule__NodeSetRelation__Group_5__1__Impl10144);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5037:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5041:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5042:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__010178);
            rule__ArrayLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__010181);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5049:1: rule__ArrayLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5053:1: ( ( '{' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5054:1: ( '{' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5054:1: ( '{' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5055:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__ArrayLiteral__Group__0__Impl10209); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5068:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5072:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5073:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__110240);
            rule__ArrayLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__110243);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5080:1: rule__ArrayLiteral__Group__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5084:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5085:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5085:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5086:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5087:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5087:2: rule__ArrayLiteral__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl10270);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5097:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5101:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5102:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__210300);
            rule__ArrayLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__210303);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5109:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__Group_2__0 )* ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5113:1: ( ( ( rule__ArrayLiteral__Group_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5114:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5114:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5115:1: ( rule__ArrayLiteral__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5116:1: ( rule__ArrayLiteral__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==30) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5116:2: rule__ArrayLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl10330);
            	    rule__ArrayLiteral__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5126:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5130:1: ( rule__ArrayLiteral__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5131:2: rule__ArrayLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__310361);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5137:1: rule__ArrayLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5141:1: ( ( '}' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5142:1: ( '}' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5142:1: ( '}' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5143:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,49,FOLLOW_49_in_rule__ArrayLiteral__Group__3__Impl10389); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5164:1: rule__ArrayLiteral__Group_2__0 : rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 ;
    public final void rule__ArrayLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5168:1: ( rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5169:2: rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__010428);
            rule__ArrayLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__010431);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5176:1: rule__ArrayLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5180:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5181:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5181:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5182:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ArrayLiteral__Group_2__0__Impl10459); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5195:1: rule__ArrayLiteral__Group_2__1 : rule__ArrayLiteral__Group_2__1__Impl ;
    public final void rule__ArrayLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5199:1: ( rule__ArrayLiteral__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5200:2: rule__ArrayLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__110490);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5206:1: rule__ArrayLiteral__Group_2__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) ;
    public final void rule__ArrayLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5210:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5211:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5211:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5212:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5213:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5213:2: rule__ArrayLiteral__LiteralsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl10517);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5227:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5231:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5232:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010551);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010554);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5239:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5243:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5244:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5244:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5245:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10581); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5256:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5260:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5261:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110610);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5267:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5271:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5272:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5272:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5273:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5274:1: ( rule__QualifiedName__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==50) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5274:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10637);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5288:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5292:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5293:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010672);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010675);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5300:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5304:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5305:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5305:1: ( ( '.' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5306:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5307:1: ( '.' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5308:2: '.'
            {
            match(input,50,FOLLOW_50_in_rule__QualifiedName__Group_1__0__Impl10704); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5319:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5323:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5324:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110736);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5330:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5334:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5335:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5335:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5336:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl10763); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5354:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5358:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5359:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5359:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5360:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_110803);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5369:1: rule__Model__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5373:1: ( ( ruleImport ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5374:1: ( ruleImport )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5374:1: ( ruleImport )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5375:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_210834);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5384:1: rule__Model__RegisteredPackagesAssignment_3 : ( ruleRegisteredPackage ) ;
    public final void rule__Model__RegisteredPackagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5388:1: ( ( ruleRegisteredPackage ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5389:1: ( ruleRegisteredPackage )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5389:1: ( ruleRegisteredPackage )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5390:1: ruleRegisteredPackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRegisteredPackagesRegisteredPackageParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_rule__Model__RegisteredPackagesAssignment_310865);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5399:1: rule__Model__MetamodelsAssignment_4 : ( ruleMetamodelSequence ) ;
    public final void rule__Model__MetamodelsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5403:1: ( ( ruleMetamodelSequence ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5404:1: ( ruleMetamodelSequence )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5404:1: ( ruleMetamodelSequence )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5405:1: ruleMetamodelSequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetamodelsMetamodelSequenceParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodelSequence_in_rule__Model__MetamodelsAssignment_410896);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5414:1: rule__Model__ProcessorsAssignment_5 : ( ruleProcessor ) ;
    public final void rule__Model__ProcessorsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5418:1: ( ( ruleProcessor ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5419:1: ( ruleProcessor )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5419:1: ( ruleProcessor )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5420:1: ruleProcessor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProcessorsProcessorParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleProcessor_in_rule__Model__ProcessorsAssignment_510927);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5429:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5433:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5434:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5434:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5435:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5436:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5437:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceJvmTypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_110962);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5448:1: rule__MetamodelSequence__ModifierAssignment_1 : ( ruleMetamodelModifier ) ;
    public final void rule__MetamodelSequence__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5452:1: ( ( ruleMetamodelModifier ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5453:1: ( ruleMetamodelModifier )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5453:1: ( ruleMetamodelModifier )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5454:1: ruleMetamodelModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getModifierMetamodelModifierEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodelModifier_in_rule__MetamodelSequence__ModifierAssignment_110997);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5463:1: rule__MetamodelSequence__TypeAssignment_2 : ( ruleModelNodeType ) ;
    public final void rule__MetamodelSequence__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5467:1: ( ( ruleModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5468:1: ( ruleModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5468:1: ( ruleModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5469:1: ruleModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getTypeModelNodeTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleModelNodeType_in_rule__MetamodelSequence__TypeAssignment_211028);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5478:1: rule__MetamodelSequence__MetamodelsAssignment_3 : ( ruleMetamodel ) ;
    public final void rule__MetamodelSequence__MetamodelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5482:1: ( ( ruleMetamodel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5483:1: ( ruleMetamodel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5483:1: ( ruleMetamodel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5484:1: ruleMetamodel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_311059);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5493:1: rule__MetamodelSequence__MetamodelsAssignment_4_1 : ( ruleMetamodel ) ;
    public final void rule__MetamodelSequence__MetamodelsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5497:1: ( ( ruleMetamodel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5498:1: ( ruleMetamodel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5498:1: ( ruleMetamodel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5499:1: ruleMetamodel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_4_111090);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5508:1: rule__Metamodel__NameAssignment : ( RULE_ID ) ;
    public final void rule__Metamodel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5512:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5513:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5513:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5514:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment11121); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5523:1: rule__RegisteredPackage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RegisteredPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5527:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5528:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5528:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5529:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_111152); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5538:1: rule__RegisteredPackage__ImportedNamespaceAssignment_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegisteredPackage__ImportedNamespaceAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5542:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5543:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5543:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5544:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceJvmTypeCrossReference_2_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5545:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5546:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getImportedNamespaceJvmTypeQualifiedNameParserRuleCall_2_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RegisteredPackage__ImportedNamespaceAssignment_2_011187);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5557:1: rule__RegisteredPackage__IsTextAssignment_2_1_0 : ( ( 'text' ) ) ;
    public final void rule__RegisteredPackage__IsTextAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5561:1: ( ( ( 'text' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5562:1: ( ( 'text' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5562:1: ( ( 'text' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5563:1: ( 'text' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getIsTextTextKeyword_2_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5564:1: ( 'text' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5565:1: 'text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getIsTextTextKeyword_2_1_0_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__RegisteredPackage__IsTextAssignment_2_1_011227); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5580:1: rule__RegisteredPackage__ExtensionAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__RegisteredPackage__ExtensionAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5584:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5585:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5585:1: ( RULE_STRING )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5586:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getExtensionSTRINGTerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RegisteredPackage__ExtensionAssignment_2_1_111266); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5595:1: rule__Weaver__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Weaver__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5599:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5600:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5600:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5601:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getReferenceJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5602:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5603:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getReferenceJvmTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Weaver__ReferenceAssignment_111301); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5614:1: rule__Weaver__SourceModelAssignment_2_0 : ( ruleSourceModelNodeSelector ) ;
    public final void rule__Weaver__SourceModelAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5618:1: ( ( ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5619:1: ( ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5619:1: ( ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5620:1: ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_rule__Weaver__SourceModelAssignment_2_011336);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5629:1: rule__Weaver__AspectModelAssignment_3 : ( ruleAspectModel ) ;
    public final void rule__Weaver__AspectModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5633:1: ( ( ruleAspectModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5634:1: ( ruleAspectModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5634:1: ( ruleAspectModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5635:1: ruleAspectModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getAspectModelAspectModelParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAspectModel_in_rule__Weaver__AspectModelAssignment_311367);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5644:1: rule__Weaver__TargetModelAssignment_4_1 : ( ruleTargetModelNodeType ) ;
    public final void rule__Weaver__TargetModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5648:1: ( ( ruleTargetModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5649:1: ( ruleTargetModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5649:1: ( ruleTargetModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5650:1: ruleTargetModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getTargetModelTargetModelNodeTypeParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_rule__Weaver__TargetModelAssignment_4_111398);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5659:1: rule__Generator__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generator__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5663:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5664:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5664:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5665:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReferenceJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5666:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5667:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReferenceJvmTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generator__ReferenceAssignment_111433); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5678:1: rule__Generator__SourceAuxModelsAssignment_2_1 : ( ruleSourceModelNodeSelector ) ;
    public final void rule__Generator__SourceAuxModelsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5682:1: ( ( ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5683:1: ( ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5683:1: ( ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5684:1: ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceAuxModelsSourceModelNodeSelectorParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceAuxModelsAssignment_2_111468);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5693:1: rule__Generator__SourceAuxModelsAssignment_2_2_1 : ( ruleSourceModelNodeSelector ) ;
    public final void rule__Generator__SourceAuxModelsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5697:1: ( ( ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5698:1: ( ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5698:1: ( ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5699:1: ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceAuxModelsSourceModelNodeSelectorParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceAuxModelsAssignment_2_2_111499);
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


    // $ANTLR start "rule__Generator__SourceModelAssignment_4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5708:1: rule__Generator__SourceModelAssignment_4 : ( ruleSourceModelNodeSelector ) ;
    public final void rule__Generator__SourceModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5712:1: ( ( ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5713:1: ( ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5713:1: ( ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5714:1: ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceModelAssignment_411530);
            ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__SourceModelAssignment_4"


    // $ANTLR start "rule__Generator__TargetModelAssignment_5_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5723:1: rule__Generator__TargetModelAssignment_5_1 : ( ruleTargetModelNodeType ) ;
    public final void rule__Generator__TargetModelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5727:1: ( ( ruleTargetModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5728:1: ( ruleTargetModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5728:1: ( ruleTargetModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5729:1: ruleTargetModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetModelTargetModelNodeTypeParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_rule__Generator__TargetModelAssignment_5_111561);
            ruleTargetModelNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getTargetModelTargetModelNodeTypeParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__TargetModelAssignment_5_1"


    // $ANTLR start "rule__Generator__TargetTraceModelAssignment_6_1_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5738:1: rule__Generator__TargetTraceModelAssignment_6_1_1 : ( ruleTargetTraceModel ) ;
    public final void rule__Generator__TargetTraceModelAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5742:1: ( ( ruleTargetTraceModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5743:1: ( ruleTargetTraceModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5743:1: ( ruleTargetTraceModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5744:1: ruleTargetTraceModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetTraceModelTargetTraceModelParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleTargetTraceModel_in_rule__Generator__TargetTraceModelAssignment_6_1_111592);
            ruleTargetTraceModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getTargetTraceModelTargetTraceModelParserRuleCall_6_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__TargetTraceModelAssignment_6_1_1"


    // $ANTLR start "rule__Generator__SourceTraceModelsAssignment_6_2_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5753:1: rule__Generator__SourceTraceModelsAssignment_6_2_1 : ( ruleTraceModelReference ) ;
    public final void rule__Generator__SourceTraceModelsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5757:1: ( ( ruleTraceModelReference ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5758:1: ( ruleTraceModelReference )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5758:1: ( ruleTraceModelReference )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5759:1: ruleTraceModelReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceTraceModelsTraceModelReferenceParserRuleCall_6_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleTraceModelReference_in_rule__Generator__SourceTraceModelsAssignment_6_2_111623);
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


    // $ANTLR start "rule__Generator__SourceTraceModelsAssignment_6_2_2_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5768:1: rule__Generator__SourceTraceModelsAssignment_6_2_2_1 : ( ruleTraceModelReference ) ;
    public final void rule__Generator__SourceTraceModelsAssignment_6_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5772:1: ( ( ruleTraceModelReference ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5773:1: ( ruleTraceModelReference )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5773:1: ( ruleTraceModelReference )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5774:1: ruleTraceModelReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceTraceModelsTraceModelReferenceParserRuleCall_6_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleTraceModelReference_in_rule__Generator__SourceTraceModelsAssignment_6_2_2_111654);
            ruleTraceModelReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceTraceModelsTraceModelReferenceParserRuleCall_6_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Generator__SourceTraceModelsAssignment_6_2_2_1"


    // $ANTLR start "rule__SourceModelNodeSelector__ReferenceAssignment_0_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5783:1: rule__SourceModelNodeSelector__ReferenceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__SourceModelNodeSelector__ReferenceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5787:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5788:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5788:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5789:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceMetamodelCrossReference_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5790:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5791:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceMetamodelIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SourceModelNodeSelector__ReferenceAssignment_0_011689); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5802:1: rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5806:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5807:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5807:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5808:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getConstraintConstraintExpressionParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__SourceModelNodeSelector__ConstraintAssignment_0_1_111724);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5817:1: rule__SourceModelNodeSelector__PropertyAssignment_0_2_1 : ( ruleNodeProperty ) ;
    public final void rule__SourceModelNodeSelector__PropertyAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5821:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5822:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5822:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5823:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyNodePropertyParserRuleCall_0_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__SourceModelNodeSelector__PropertyAssignment_0_2_111755);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5832:1: rule__TargetModelNodeType__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelNodeType__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5836:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5837:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5837:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5838:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getReferenceMetamodelCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5839:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5840:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getReferenceMetamodelIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TargetModelNodeType__ReferenceAssignment_111790); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5851:1: rule__ModelNodeType__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ModelNodeType__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5855:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5856:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5856:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5857:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTargetRegisteredPackageCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5858:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5859:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTargetRegisteredPackageIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModelNodeType__TargetAssignment_011829); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5870:1: rule__ModelNodeType__PropertyAssignment_1_1 : ( ruleNodeProperty ) ;
    public final void rule__ModelNodeType__PropertyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5874:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5875:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5875:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5876:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getPropertyNodePropertyParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__ModelNodeType__PropertyAssignment_1_111864);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5885:1: rule__ModelNodeType__CollectionAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__ModelNodeType__CollectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5889:1: ( ( ( '[]' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5890:1: ( ( '[]' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5890:1: ( ( '[]' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5891:1: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5892:1: ( '[]' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5893:1: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            match(input,52,FOLLOW_52_in_rule__ModelNodeType__CollectionAssignment_211900); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5908:1: rule__NodeProperty__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NodeProperty__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5912:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5913:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5913:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5914:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyJvmMemberCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5915:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5916:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyJvmMemberIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeProperty__PropertyAssignment_011943); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5927:1: rule__NodeProperty__ConstraintAssignment_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__NodeProperty__ConstraintAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5931:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5932:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5932:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5933:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getConstraintConstraintExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__NodeProperty__ConstraintAssignment_1_111978);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5942:1: rule__NodeProperty__SubPropertyAssignment_2_1 : ( ruleNodeProperty ) ;
    public final void rule__NodeProperty__SubPropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5946:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5947:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5947:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5948:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSubPropertyNodePropertyParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__NodeProperty__SubPropertyAssignment_2_112009);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5957:1: rule__ConstraintExpression__OperatorAssignment_1_0_0_1 : ( ruleLogicOperator ) ;
    public final void rule__ConstraintExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5961:1: ( ( ruleLogicOperator ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5962:1: ( ruleLogicOperator )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5962:1: ( ruleLogicOperator )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5963:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_112040);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5972:1: rule__ConstraintExpression__RightAssignment_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__ConstraintExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5976:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5977:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5977:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5978:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightConstraintExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__ConstraintExpression__RightAssignment_1_112071);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5987:1: rule__CompareExpression__ComparatorAssignment_1_0_0_1 : ( ruleComparator ) ;
    public final void rule__CompareExpression__ComparatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5991:1: ( ( ruleComparator ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5992:1: ( ruleComparator )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5992:1: ( ruleComparator )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5993:1: ruleComparator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getComparatorComparatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleComparator_in_rule__CompareExpression__ComparatorAssignment_1_0_0_112102);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6002:1: rule__CompareExpression__RightAssignment_1_1 : ( ruleBasicConstraint ) ;
    public final void rule__CompareExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6006:1: ( ( ruleBasicConstraint ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6007:1: ( ruleBasicConstraint )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6007:1: ( ruleBasicConstraint )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6008:1: ruleBasicConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightBasicConstraintParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__RightAssignment_1_112133);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6017:1: rule__Negation__ConstraintAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__Negation__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6021:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6022:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6022:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6023:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__Negation__ConstraintAssignment_112164);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6032:1: rule__ParenthesisConstraint__ConstraintAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__ParenthesisConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6036:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6037:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6037:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6038:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_112195);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6047:1: rule__Typeof__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Typeof__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6051:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6052:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6052:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6053:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getTypeJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6054:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6055:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getTypeJvmTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Typeof__TypeAssignment_112230); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6066:1: rule__TraceModelReference__TraceModelAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TraceModelReference__TraceModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6070:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6071:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6071:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6072:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelReferenceAccess().getTraceModelTraceModelCrossReference_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6073:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6074:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelReferenceAccess().getTraceModelTraceModelIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TraceModelReference__TraceModelAssignment12269); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6085:1: rule__TraceModel__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TraceModel__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6089:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6090:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6090:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6091:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TraceModel__NameAssignment_012304); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6100:1: rule__TraceModel__NodeSetRelationsAssignment_2 : ( ruleNodeSetRelation ) ;
    public final void rule__TraceModel__NodeSetRelationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6104:1: ( ( ruleNodeSetRelation ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6105:1: ( ruleNodeSetRelation )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6105:1: ( ruleNodeSetRelation )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6106:1: ruleNodeSetRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsNodeSetRelationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNodeSetRelation_in_rule__TraceModel__NodeSetRelationsAssignment_212335);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6115:1: rule__NodeSetRelation__SourceNodesAssignment_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__SourceNodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6119:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6120:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6120:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6121:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_112366);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6130:1: rule__NodeSetRelation__SourceNodesAssignment_2_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__SourceNodesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6134:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6135:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6135:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6136:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_2_112397);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6145:1: rule__NodeSetRelation__TargetNodesAssignment_4 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__TargetNodesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6149:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6150:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6150:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6151:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_412428);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6160:1: rule__NodeSetRelation__TargetNodesAssignment_5_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__TargetNodesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6164:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6165:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6165:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6166:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_5_112459);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6175:1: rule__NodeType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NodeType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6179:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6180:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6180:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6181:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getTypeJvmTypeCrossReference_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6182:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6183:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getTypeJvmTypeIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeType__TypeAssignment12494); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6194:1: rule__ArrayLiteral__LiteralsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6198:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6199:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6199:1: ( ruleLiteral )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6200:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_112529);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6209:1: rule__ArrayLiteral__LiteralsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6213:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6214:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6214:1: ( ruleLiteral )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6215:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_112560);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6224:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6228:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6229:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6229:1: ( RULE_STRING )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6230:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12591); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6239:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6243:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6244:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6244:1: ( RULE_INT )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6245:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment12622); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6254:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6258:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6259:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6259:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6260:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment12653); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6269:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6273:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6274:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6274:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6275:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment12684); if (state.failed) return ;
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

    // $ANTLR start synpred43_InternalArchitecture
    public final void synpred43_InternalArchitecture_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3887:2: ( rule__ConstraintExpression__Group_1__0 )
        // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3887:2: rule__ConstraintExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0_in_synpred43_InternalArchitecture7912);
        rule__ConstraintExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_InternalArchitecture

    // $ANTLR start synpred44_InternalArchitecture
    public final void synpred44_InternalArchitecture_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4102:2: ( rule__CompareExpression__Group_1__0 )
        // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4102:2: rule__CompareExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_synpred44_InternalArchitecture8335);
        rule__CompareExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalArchitecture

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
    public final boolean synpred44_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA33_eotS =
        "\12\uffff";
    static final String DFA33_eofS =
        "\1\10\11\uffff";
    static final String DFA33_minS =
        "\1\22\7\0\2\uffff";
    static final String DFA33_maxS =
        "\1\52\7\0\2\uffff";
    static final String DFA33_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA33_specialS =
        "\1\uffff\1\4\1\0\1\5\1\1\1\6\1\2\1\3\2\uffff}>";
    static final String[] DFA33_transitionS = {
            "\2\10\1\1\1\2\1\3\1\4\1\5\1\6\1\7\13\uffff\1\10\3\uffff\1\10",
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

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "4102:1: ( rule__CompareExpression__Group_1__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_4 = input.LA(1);

                         
                        int index33_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index33_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_6 = input.LA(1);

                         
                        int index33_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index33_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA33_7 = input.LA(1);

                         
                        int index33_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index33_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA33_3 = input.LA(1);

                         
                        int index33_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index33_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA33_5 = input.LA(1);

                         
                        int index33_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index33_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
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
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__1__Impl_in_rule__RegisteredPackage__Group__13930 = new BitSet(new long[]{0x0008000000000010L});
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
    public static final BitSet FOLLOW_rule__Weaver__Group__1__Impl_in_rule__Weaver__Group__14236 = new BitSet(new long[]{0x0000100000004010L});
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
    public static final BitSet FOLLOW_rule__Generator__Group__1__Impl_in_rule__Generator__Group__14791 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__2_in_rule__Generator__Group__14794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__ReferenceAssignment_1_in_rule__Generator__Group__1__Impl4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__2__Impl_in_rule__Generator__Group__24851 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__3_in_rule__Generator__Group__24854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__0_in_rule__Generator__Group__2__Impl4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__3__Impl_in_rule__Generator__Group__34912 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__4_in_rule__Generator__Group__34915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Generator__Group__3__Impl4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__4__Impl_in_rule__Generator__Group__44974 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__5_in_rule__Generator__Group__44977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceModelAssignment_4_in_rule__Generator__Group__4__Impl5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__5__Impl_in_rule__Generator__Group__55034 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__6_in_rule__Generator__Group__55037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__0_in_rule__Generator__Group__5__Impl5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__6__Impl_in_rule__Generator__Group__65095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__0_in_rule__Generator__Group__6__Impl5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__0__Impl_in_rule__Generator__Group_2__05167 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__1_in_rule__Generator__Group_2__05170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Generator__Group_2__0__Impl5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__1__Impl_in_rule__Generator__Group_2__15229 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__2_in_rule__Generator__Group_2__15232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceAuxModelsAssignment_2_1_in_rule__Generator__Group_2__1__Impl5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__2__Impl_in_rule__Generator__Group_2__25289 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__3_in_rule__Generator__Group_2__25292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2_2__0_in_rule__Generator__Group_2__2__Impl5319 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__3__Impl_in_rule__Generator__Group_2__35350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Generator__Group_2__3__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2_2__0__Impl_in_rule__Generator__Group_2_2__05417 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_2_2__1_in_rule__Generator__Group_2_2__05420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Generator__Group_2_2__0__Impl5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2_2__1__Impl_in_rule__Generator__Group_2_2__15479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceAuxModelsAssignment_2_2_1_in_rule__Generator__Group_2_2__1__Impl5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__0__Impl_in_rule__Generator__Group_5__05540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__1_in_rule__Generator__Group_5__05543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Generator__Group_5__0__Impl5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__1__Impl_in_rule__Generator__Group_5__15602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__TargetModelAssignment_5_1_in_rule__Generator__Group_5__1__Impl5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__0__Impl_in_rule__Generator__Group_6__05663 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__1_in_rule__Generator__Group_6__05666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Generator__Group_6__0__Impl5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__1__Impl_in_rule__Generator__Group_6__15725 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__2_in_rule__Generator__Group_6__15728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_1__0_in_rule__Generator__Group_6__1__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__2__Impl_in_rule__Generator__Group_6__25786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__0_in_rule__Generator__Group_6__2__Impl5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_1__0__Impl_in_rule__Generator__Group_6_1__05850 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_1__1_in_rule__Generator__Group_6_1__05853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Generator__Group_6_1__0__Impl5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_1__1__Impl_in_rule__Generator__Group_6_1__15912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__TargetTraceModelAssignment_6_1_1_in_rule__Generator__Group_6_1__1__Impl5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__0__Impl_in_rule__Generator__Group_6_2__05973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__1_in_rule__Generator__Group_6_2__05976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Generator__Group_6_2__0__Impl6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__1__Impl_in_rule__Generator__Group_6_2__16035 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__2_in_rule__Generator__Group_6_2__16038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceTraceModelsAssignment_6_2_1_in_rule__Generator__Group_6_2__1__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__2__Impl_in_rule__Generator__Group_6_2__26095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2_2__0_in_rule__Generator__Group_6_2__2__Impl6122 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2_2__0__Impl_in_rule__Generator__Group_6_2_2__06159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2_2__1_in_rule__Generator__Group_6_2_2__06162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Generator__Group_6_2_2__0__Impl6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2_2__1__Impl_in_rule__Generator__Group_6_2_2__16221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceTraceModelsAssignment_6_2_2_1_in_rule__Generator__Group_6_2_2__1__Impl6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__0__Impl_in_rule__SourceModelNodeSelector__Group_0__06282 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__1_in_rule__SourceModelNodeSelector__Group_0__06285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__ReferenceAssignment_0_0_in_rule__SourceModelNodeSelector__Group_0__0__Impl6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__1__Impl_in_rule__SourceModelNodeSelector__Group_0__16342 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__2_in_rule__SourceModelNodeSelector__Group_0__16345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0_in_rule__SourceModelNodeSelector__Group_0__1__Impl6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__2__Impl_in_rule__SourceModelNodeSelector__Group_0__26403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_2__0_in_rule__SourceModelNodeSelector__Group_0__2__Impl6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0__Impl_in_rule__SourceModelNodeSelector__Group_0_1__06467 = new BitSet(new long[]{0x00016020000001F0L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1_in_rule__SourceModelNodeSelector__Group_0_1__06470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__SourceModelNodeSelector__Group_0_1__0__Impl6498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1__Impl_in_rule__SourceModelNodeSelector__Group_0_1__16529 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__2_in_rule__SourceModelNodeSelector__Group_0_1__16532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__ConstraintAssignment_0_1_1_in_rule__SourceModelNodeSelector__Group_0_1__1__Impl6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__2__Impl_in_rule__SourceModelNodeSelector__Group_0_1__26589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SourceModelNodeSelector__Group_0_1__2__Impl6617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_2__0__Impl_in_rule__SourceModelNodeSelector__Group_0_2__06654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_2__1_in_rule__SourceModelNodeSelector__Group_0_2__06657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SourceModelNodeSelector__Group_0_2__0__Impl6685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_2__1__Impl_in_rule__SourceModelNodeSelector__Group_0_2__16716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__PropertyAssignment_0_2_1_in_rule__SourceModelNodeSelector__Group_0_2__1__Impl6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__0__Impl_in_rule__SourceModelNodeSelector__Group_1__06777 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__1_in_rule__SourceModelNodeSelector__Group_1__06780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__1__Impl_in_rule__SourceModelNodeSelector__Group_1__16838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SourceModelNodeSelector__Group_1__1__Impl6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__0__Impl_in_rule__TargetModelNodeType__Group__06901 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__1_in_rule__TargetModelNodeType__Group__06904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__1__Impl_in_rule__TargetModelNodeType__Group__16962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__ReferenceAssignment_1_in_rule__TargetModelNodeType__Group__1__Impl6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__0__Impl_in_rule__ModelNodeType__Group__07023 = new BitSet(new long[]{0x0010080000000000L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__1_in_rule__ModelNodeType__Group__07026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__TargetAssignment_0_in_rule__ModelNodeType__Group__0__Impl7053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__1__Impl_in_rule__ModelNodeType__Group__17083 = new BitSet(new long[]{0x0010080000000000L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__2_in_rule__ModelNodeType__Group__17086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_1__0_in_rule__ModelNodeType__Group__1__Impl7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__2__Impl_in_rule__ModelNodeType__Group__27144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__CollectionAssignment_2_in_rule__ModelNodeType__Group__2__Impl7171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_1__0__Impl_in_rule__ModelNodeType__Group_1__07208 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_1__1_in_rule__ModelNodeType__Group_1__07211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ModelNodeType__Group_1__0__Impl7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_1__1__Impl_in_rule__ModelNodeType__Group_1__17270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__PropertyAssignment_1_1_in_rule__ModelNodeType__Group_1__1__Impl7297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__0__Impl_in_rule__NodeProperty__Group__07331 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__1_in_rule__NodeProperty__Group__07334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__PropertyAssignment_0_in_rule__NodeProperty__Group__0__Impl7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__1__Impl_in_rule__NodeProperty__Group__17391 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__2_in_rule__NodeProperty__Group__17394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__0_in_rule__NodeProperty__Group__1__Impl7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__2__Impl_in_rule__NodeProperty__Group__27452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__0_in_rule__NodeProperty__Group__2__Impl7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__0__Impl_in_rule__NodeProperty__Group_1__07516 = new BitSet(new long[]{0x00016020000001F0L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__1_in_rule__NodeProperty__Group_1__07519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__NodeProperty__Group_1__0__Impl7547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__1__Impl_in_rule__NodeProperty__Group_1__17578 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__2_in_rule__NodeProperty__Group_1__17581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__ConstraintAssignment_1_1_in_rule__NodeProperty__Group_1__1__Impl7608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__2__Impl_in_rule__NodeProperty__Group_1__27638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__NodeProperty__Group_1__2__Impl7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__0__Impl_in_rule__NodeProperty__Group_2__07703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__1_in_rule__NodeProperty__Group_2__07706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__NodeProperty__Group_2__0__Impl7734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__1__Impl_in_rule__NodeProperty__Group_2__17765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__SubPropertyAssignment_2_1_in_rule__NodeProperty__Group_2__1__Impl7792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__07826 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__07829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_rule__ConstraintExpression__Group__0__Impl7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__17885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__07947 = new BitSet(new long[]{0x00016020000001F0L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__07950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl7977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__18007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl8034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__08068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__08127 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__08130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__18188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl8215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__08249 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__08252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__Group__0__Impl8279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__18308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl8335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__08370 = new BitSet(new long[]{0x00016020000001F0L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__08373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl8400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__18430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl8457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__08491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl8518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__08550 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__08553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__18611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__ComparatorAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl8638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__08672 = new BitSet(new long[]{0x00016020000001F0L});
    public static final BitSet FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__08675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Negation__Group__0__Impl8703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__18734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__ConstraintAssignment_1_in_rule__Negation__Group__1__Impl8761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__08795 = new BitSet(new long[]{0x00016020000001F0L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__08798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ParenthesisConstraint__Group__0__Impl8826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__18857 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__18860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl8887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__28917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ParenthesisConstraint__Group__2__Impl8945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typeof__Group__0__Impl_in_rule__Typeof__Group__08982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Typeof__Group__1_in_rule__Typeof__Group__08985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Typeof__Group__0__Impl9013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typeof__Group__1__Impl_in_rule__Typeof__Group__19044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Typeof__TypeAssignment_1_in_rule__Typeof__Group__1__Impl9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetTraceModel__Group_1__0__Impl_in_rule__TargetTraceModel__Group_1__09105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TargetTraceModel__Group_1__1_in_rule__TargetTraceModel__Group_1__09108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TargetTraceModel__Group_1__0__Impl9136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetTraceModel__Group_1__1__Impl_in_rule__TargetTraceModel__Group_1__19167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModelReference_in_rule__TargetTraceModel__Group_1__1__Impl9194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__0__Impl_in_rule__TraceModel__Group__09227 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__1_in_rule__TraceModel__Group__09230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NameAssignment_0_in_rule__TraceModel__Group__0__Impl9257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__1__Impl_in_rule__TraceModel__Group__19287 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__2_in_rule__TraceModel__Group__19290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TraceModel__Group__1__Impl9318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__2__Impl_in_rule__TraceModel__Group__29349 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__3_in_rule__TraceModel__Group__29352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl9381 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl9393 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__3__Impl_in_rule__TraceModel__Group__39426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TraceModel__Group__3__Impl9454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__0__Impl_in_rule__NodeSetRelation__Group__09493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__1_in_rule__NodeSetRelation__Group__09496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__NodeSetRelation__Group__0__Impl9524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__1__Impl_in_rule__NodeSetRelation__Group__19555 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__2_in_rule__NodeSetRelation__Group__19558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_1_in_rule__NodeSetRelation__Group__1__Impl9585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__2__Impl_in_rule__NodeSetRelation__Group__29615 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__3_in_rule__NodeSetRelation__Group__29618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__0_in_rule__NodeSetRelation__Group__2__Impl9645 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__3__Impl_in_rule__NodeSetRelation__Group__39676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__4_in_rule__NodeSetRelation__Group__39679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__NodeSetRelation__Group__3__Impl9707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__4__Impl_in_rule__NodeSetRelation__Group__49738 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__5_in_rule__NodeSetRelation__Group__49741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_4_in_rule__NodeSetRelation__Group__4__Impl9768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__5__Impl_in_rule__NodeSetRelation__Group__59798 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__6_in_rule__NodeSetRelation__Group__59801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__0_in_rule__NodeSetRelation__Group__5__Impl9828 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__6__Impl_in_rule__NodeSetRelation__Group__69859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__NodeSetRelation__Group__6__Impl9887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__0__Impl_in_rule__NodeSetRelation__Group_2__09932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__1_in_rule__NodeSetRelation__Group_2__09935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NodeSetRelation__Group_2__0__Impl9963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__1__Impl_in_rule__NodeSetRelation__Group_2__19994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_2_1_in_rule__NodeSetRelation__Group_2__1__Impl10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__0__Impl_in_rule__NodeSetRelation__Group_5__010055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__1_in_rule__NodeSetRelation__Group_5__010058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NodeSetRelation__Group_5__0__Impl10086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__1__Impl_in_rule__NodeSetRelation__Group_5__110117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_5_1_in_rule__NodeSetRelation__Group_5__1__Impl10144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__010178 = new BitSet(new long[]{0x00010000000001E0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__010181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ArrayLiteral__Group__0__Impl10209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__110240 = new BitSet(new long[]{0x0002000040000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__110243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl10270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__210300 = new BitSet(new long[]{0x0002000040000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__210303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl10330 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__310361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ArrayLiteral__Group__3__Impl10389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__010428 = new BitSet(new long[]{0x00010000000001E0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__010431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ArrayLiteral__Group_2__0__Impl10459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__110490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl10517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010551 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10637 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__QualifiedName__Group_1__0__Impl10704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__110736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl10763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_110803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_210834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_rule__Model__RegisteredPackagesAssignment_310865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelSequence_in_rule__Model__MetamodelsAssignment_410896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessor_in_rule__Model__ProcessorsAssignment_510927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_110962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelModifier_in_rule__MetamodelSequence__ModifierAssignment_110997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodeType_in_rule__MetamodelSequence__TypeAssignment_211028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_311059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_4_111090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment11121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_111152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RegisteredPackage__ImportedNamespaceAssignment_2_011187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__RegisteredPackage__IsTextAssignment_2_1_011227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RegisteredPackage__ExtensionAssignment_2_1_111266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Weaver__ReferenceAssignment_111301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_rule__Weaver__SourceModelAssignment_2_011336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectModel_in_rule__Weaver__AspectModelAssignment_311367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_rule__Weaver__TargetModelAssignment_4_111398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generator__ReferenceAssignment_111433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceAuxModelsAssignment_2_111468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceAuxModelsAssignment_2_2_111499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceModelAssignment_411530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_rule__Generator__TargetModelAssignment_5_111561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetTraceModel_in_rule__Generator__TargetTraceModelAssignment_6_1_111592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModelReference_in_rule__Generator__SourceTraceModelsAssignment_6_2_111623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModelReference_in_rule__Generator__SourceTraceModelsAssignment_6_2_2_111654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SourceModelNodeSelector__ReferenceAssignment_0_011689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__SourceModelNodeSelector__ConstraintAssignment_0_1_111724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__SourceModelNodeSelector__PropertyAssignment_0_2_111755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TargetModelNodeType__ReferenceAssignment_111790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModelNodeType__TargetAssignment_011829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__ModelNodeType__PropertyAssignment_1_111864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ModelNodeType__CollectionAssignment_211900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeProperty__PropertyAssignment_011943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__NodeProperty__ConstraintAssignment_1_111978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__NodeProperty__SubPropertyAssignment_2_112009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_112040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__ConstraintExpression__RightAssignment_1_112071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_rule__CompareExpression__ComparatorAssignment_1_0_0_112102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__RightAssignment_1_112133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__Negation__ConstraintAssignment_112164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_112195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Typeof__TypeAssignment_112230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TraceModelReference__TraceModelAssignment12269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TraceModel__NameAssignment_012304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSetRelation_in_rule__TraceModel__NodeSetRelationsAssignment_212335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_112366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_2_112397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_412428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_5_112459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeType__TypeAssignment12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_112529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_112560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment12622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment12653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment12684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0_in_synpred43_InternalArchitecture7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_synpred44_InternalArchitecture8335 = new BitSet(new long[]{0x0000000000000002L});

}