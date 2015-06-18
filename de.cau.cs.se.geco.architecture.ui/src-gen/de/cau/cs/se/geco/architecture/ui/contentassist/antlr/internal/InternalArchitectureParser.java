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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'weave'", "'gen'", "'model'", "','", "'register'", "'=>'", "':'", "'generate'", "'->'", "'<-'", "'/'", "'null'", "'['", "']'", "'('", "')'", "'<'", "'>'", "'{'", "'}'", "'.'", "'*'", "'text'", "'&'", "'|'", "'=='", "'!='", "'>='", "'<='", "'~'"
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:98:1: ruleImport : ( ( rule__Import__Alternatives ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:102:2: ( ( ( rule__Import__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:103:1: ( ( rule__Import__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:103:1: ( ( rule__Import__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:104:1: ( rule__Import__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:105:1: ( rule__Import__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:105:2: rule__Import__Alternatives
            {
            pushFollow(FOLLOW_rule__Import__Alternatives_in_ruleImport160);
            rule__Import__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleWeaverImport"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:117:1: entryRuleWeaverImport : ruleWeaverImport EOF ;
    public final void entryRuleWeaverImport() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:118:1: ( ruleWeaverImport EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:119:1: ruleWeaverImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverImportRule()); 
            }
            pushFollow(FOLLOW_ruleWeaverImport_in_entryRuleWeaverImport187);
            ruleWeaverImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeaverImport194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleWeaverImport"


    // $ANTLR start "ruleWeaverImport"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:126:1: ruleWeaverImport : ( ( rule__WeaverImport__Group__0 ) ) ;
    public final void ruleWeaverImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:130:2: ( ( ( rule__WeaverImport__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:131:1: ( ( rule__WeaverImport__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:131:1: ( ( rule__WeaverImport__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:132:1: ( rule__WeaverImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverImportAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:133:1: ( rule__WeaverImport__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:133:2: rule__WeaverImport__Group__0
            {
            pushFollow(FOLLOW_rule__WeaverImport__Group__0_in_ruleWeaverImport220);
            rule__WeaverImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWeaverImport"


    // $ANTLR start "entryRuleGeneratorImport"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:145:1: entryRuleGeneratorImport : ruleGeneratorImport EOF ;
    public final void entryRuleGeneratorImport() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:146:1: ( ruleGeneratorImport EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:147:1: ruleGeneratorImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorImportRule()); 
            }
            pushFollow(FOLLOW_ruleGeneratorImport_in_entryRuleGeneratorImport247);
            ruleGeneratorImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneratorImport254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGeneratorImport"


    // $ANTLR start "ruleGeneratorImport"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:154:1: ruleGeneratorImport : ( ( rule__GeneratorImport__Group__0 ) ) ;
    public final void ruleGeneratorImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:158:2: ( ( ( rule__GeneratorImport__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:159:1: ( ( rule__GeneratorImport__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:159:1: ( ( rule__GeneratorImport__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:160:1: ( rule__GeneratorImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorImportAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:161:1: ( rule__GeneratorImport__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:161:2: rule__GeneratorImport__Group__0
            {
            pushFollow(FOLLOW_rule__GeneratorImport__Group__0_in_ruleGeneratorImport280);
            rule__GeneratorImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneratorImport"


    // $ANTLR start "entryRuleMetamodelSequence"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:173:1: entryRuleMetamodelSequence : ruleMetamodelSequence EOF ;
    public final void entryRuleMetamodelSequence() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:174:1: ( ruleMetamodelSequence EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:175:1: ruleMetamodelSequence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceRule()); 
            }
            pushFollow(FOLLOW_ruleMetamodelSequence_in_entryRuleMetamodelSequence307);
            ruleMetamodelSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelSequenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodelSequence314); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:182:1: ruleMetamodelSequence : ( ( rule__MetamodelSequence__Group__0 ) ) ;
    public final void ruleMetamodelSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:186:2: ( ( ( rule__MetamodelSequence__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:187:1: ( ( rule__MetamodelSequence__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:187:1: ( ( rule__MetamodelSequence__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:188:1: ( rule__MetamodelSequence__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:189:1: ( rule__MetamodelSequence__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:189:2: rule__MetamodelSequence__Group__0
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__0_in_ruleMetamodelSequence340);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:201:1: entryRuleMetamodel : ruleMetamodel EOF ;
    public final void entryRuleMetamodel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:202:1: ( ruleMetamodel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:203:1: ruleMetamodel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelRule()); 
            }
            pushFollow(FOLLOW_ruleMetamodel_in_entryRuleMetamodel367);
            ruleMetamodel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMetamodelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetamodel374); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:210:1: ruleMetamodel : ( ( rule__Metamodel__NameAssignment ) ) ;
    public final void ruleMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:214:2: ( ( ( rule__Metamodel__NameAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:215:1: ( ( rule__Metamodel__NameAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:215:1: ( ( rule__Metamodel__NameAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:216:1: ( rule__Metamodel__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelAccess().getNameAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:217:1: ( rule__Metamodel__NameAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:217:2: rule__Metamodel__NameAssignment
            {
            pushFollow(FOLLOW_rule__Metamodel__NameAssignment_in_ruleMetamodel400);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:229:1: entryRuleRegisteredPackage : ruleRegisteredPackage EOF ;
    public final void entryRuleRegisteredPackage() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:230:1: ( ruleRegisteredPackage EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:231:1: ruleRegisteredPackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageRule()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage427);
            ruleRegisteredPackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisteredPackage434); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:238:1: ruleRegisteredPackage : ( ( rule__RegisteredPackage__Group__0 ) ) ;
    public final void ruleRegisteredPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:242:2: ( ( ( rule__RegisteredPackage__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:243:1: ( ( rule__RegisteredPackage__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:243:1: ( ( rule__RegisteredPackage__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:244:1: ( rule__RegisteredPackage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:245:1: ( rule__RegisteredPackage__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:245:2: rule__RegisteredPackage__Group__0
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__0_in_ruleRegisteredPackage460);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:257:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:258:1: ( ruleConnection EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:259:1: ruleConnection EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionRule()); 
            }
            pushFollow(FOLLOW_ruleConnection_in_entryRuleConnection487);
            ruleConnection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConnectionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnection494); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:266:1: ruleConnection : ( ( rule__Connection__Alternatives ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:270:2: ( ( ( rule__Connection__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:271:1: ( ( rule__Connection__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:271:1: ( ( rule__Connection__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:272:1: ( rule__Connection__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConnectionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:273:1: ( rule__Connection__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:273:2: rule__Connection__Alternatives
            {
            pushFollow(FOLLOW_rule__Connection__Alternatives_in_ruleConnection520);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:285:1: entryRuleWeaver : ruleWeaver EOF ;
    public final void entryRuleWeaver() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:286:1: ( ruleWeaver EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:287:1: ruleWeaver EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverRule()); 
            }
            pushFollow(FOLLOW_ruleWeaver_in_entryRuleWeaver547);
            ruleWeaver();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeaver554); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:294:1: ruleWeaver : ( ( rule__Weaver__Group__0 ) ) ;
    public final void ruleWeaver() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:298:2: ( ( ( rule__Weaver__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:299:1: ( ( rule__Weaver__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:299:1: ( ( rule__Weaver__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:300:1: ( rule__Weaver__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:301:1: ( rule__Weaver__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:301:2: rule__Weaver__Group__0
            {
            pushFollow(FOLLOW_rule__Weaver__Group__0_in_ruleWeaver580);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:313:1: entryRuleAspectModel : ruleAspectModel EOF ;
    public final void entryRuleAspectModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:314:1: ( ruleAspectModel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:315:1: ruleAspectModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelRule()); 
            }
            pushFollow(FOLLOW_ruleAspectModel_in_entryRuleAspectModel607);
            ruleAspectModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspectModel614); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:322:1: ruleAspectModel : ( ( rule__AspectModel__Alternatives ) ) ;
    public final void ruleAspectModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:326:2: ( ( ( rule__AspectModel__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:327:1: ( ( rule__AspectModel__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:327:1: ( ( rule__AspectModel__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:328:1: ( rule__AspectModel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:329:1: ( rule__AspectModel__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:329:2: rule__AspectModel__Alternatives
            {
            pushFollow(FOLLOW_rule__AspectModel__Alternatives_in_ruleAspectModel640);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:341:1: entryRuleGenerator : ruleGenerator EOF ;
    public final void entryRuleGenerator() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:342:1: ( ruleGenerator EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:343:1: ruleGenerator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorRule()); 
            }
            pushFollow(FOLLOW_ruleGenerator_in_entryRuleGenerator667);
            ruleGenerator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerator674); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:350:1: ruleGenerator : ( ( rule__Generator__Group__0 ) ) ;
    public final void ruleGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:354:2: ( ( ( rule__Generator__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:355:1: ( ( rule__Generator__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:355:1: ( ( rule__Generator__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:356:1: ( rule__Generator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:357:1: ( rule__Generator__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:357:2: rule__Generator__Group__0
            {
            pushFollow(FOLLOW_rule__Generator__Group__0_in_ruleGenerator700);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:369:1: entryRuleSourceModelNodeSelector : ruleSourceModelNodeSelector EOF ;
    public final void entryRuleSourceModelNodeSelector() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:370:1: ( ruleSourceModelNodeSelector EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:371:1: ruleSourceModelNodeSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_entryRuleSourceModelNodeSelector727);
            ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceModelNodeSelector734); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:378:1: ruleSourceModelNodeSelector : ( ( rule__SourceModelNodeSelector__Alternatives ) ) ;
    public final void ruleSourceModelNodeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:382:2: ( ( ( rule__SourceModelNodeSelector__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:383:1: ( ( rule__SourceModelNodeSelector__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:383:1: ( ( rule__SourceModelNodeSelector__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:384:1: ( rule__SourceModelNodeSelector__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:385:1: ( rule__SourceModelNodeSelector__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:385:2: rule__SourceModelNodeSelector__Alternatives
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Alternatives_in_ruleSourceModelNodeSelector760);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:397:1: entryRuleTargetModelNodeType : ruleTargetModelNodeType EOF ;
    public final void entryRuleTargetModelNodeType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:398:1: ( ruleTargetModelNodeType EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:399:1: ruleTargetModelNodeType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_entryRuleTargetModelNodeType787);
            ruleTargetModelNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelNodeTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetModelNodeType794); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:406:1: ruleTargetModelNodeType : ( ( rule__TargetModelNodeType__Group__0 ) ) ;
    public final void ruleTargetModelNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:410:2: ( ( ( rule__TargetModelNodeType__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:411:1: ( ( rule__TargetModelNodeType__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:411:1: ( ( rule__TargetModelNodeType__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:412:1: ( rule__TargetModelNodeType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:413:1: ( rule__TargetModelNodeType__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:413:2: rule__TargetModelNodeType__Group__0
            {
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__0_in_ruleTargetModelNodeType820);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:425:1: entryRuleModelNodeType : ruleModelNodeType EOF ;
    public final void entryRuleModelNodeType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:426:1: ( ruleModelNodeType EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:427:1: ruleModelNodeType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleModelNodeType_in_entryRuleModelNodeType847);
            ruleModelNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelNodeType854); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:434:1: ruleModelNodeType : ( ( rule__ModelNodeType__Group__0 ) ) ;
    public final void ruleModelNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:438:2: ( ( ( rule__ModelNodeType__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:439:1: ( ( rule__ModelNodeType__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:439:1: ( ( rule__ModelNodeType__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:440:1: ( rule__ModelNodeType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:441:1: ( rule__ModelNodeType__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:441:2: rule__ModelNodeType__Group__0
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__0_in_ruleModelNodeType880);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:453:1: entryRuleNodeProperty : ruleNodeProperty EOF ;
    public final void entryRuleNodeProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:454:1: ( ruleNodeProperty EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:455:1: ruleNodeProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_entryRuleNodeProperty907);
            ruleNodeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeProperty914); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:462:1: ruleNodeProperty : ( ( rule__NodeProperty__Group__0 ) ) ;
    public final void ruleNodeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:466:2: ( ( ( rule__NodeProperty__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:467:1: ( ( rule__NodeProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:467:1: ( ( rule__NodeProperty__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:468:1: ( rule__NodeProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:469:1: ( rule__NodeProperty__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:469:2: rule__NodeProperty__Group__0
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__0_in_ruleNodeProperty940);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:481:1: entryRuleConstraintExpression : ruleConstraintExpression EOF ;
    public final void entryRuleConstraintExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:482:1: ( ruleConstraintExpression EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:483:1: ruleConstraintExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression967);
            ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstraintExpression974); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:490:1: ruleConstraintExpression : ( ( rule__ConstraintExpression__Group__0 ) ) ;
    public final void ruleConstraintExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:494:2: ( ( ( rule__ConstraintExpression__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:495:1: ( ( rule__ConstraintExpression__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:495:1: ( ( rule__ConstraintExpression__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:496:1: ( rule__ConstraintExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:497:1: ( rule__ConstraintExpression__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:497:2: rule__ConstraintExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__0_in_ruleConstraintExpression1000);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:509:1: entryRuleCompareExpression : ruleCompareExpression EOF ;
    public final void entryRuleCompareExpression() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:510:1: ( ruleCompareExpression EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:511:1: ruleCompareExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1027);
            ruleCompareExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareExpression1034); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:518:1: ruleCompareExpression : ( ( rule__CompareExpression__Group__0 ) ) ;
    public final void ruleCompareExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:522:2: ( ( ( rule__CompareExpression__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:523:1: ( ( rule__CompareExpression__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:523:1: ( ( rule__CompareExpression__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:524:1: ( rule__CompareExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:525:1: ( rule__CompareExpression__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:525:2: rule__CompareExpression__Group__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1060);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:537:1: entryRuleBasicConstraint : ruleBasicConstraint EOF ;
    public final void entryRuleBasicConstraint() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:538:1: ( ruleBasicConstraint EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:539:1: ruleBasicConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_entryRuleBasicConstraint1087);
            ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicConstraint1094); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:546:1: ruleBasicConstraint : ( ( rule__BasicConstraint__Alternatives ) ) ;
    public final void ruleBasicConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:550:2: ( ( ( rule__BasicConstraint__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:551:1: ( ( rule__BasicConstraint__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:551:1: ( ( rule__BasicConstraint__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:552:1: ( rule__BasicConstraint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:553:1: ( rule__BasicConstraint__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:553:2: rule__BasicConstraint__Alternatives
            {
            pushFollow(FOLLOW_rule__BasicConstraint__Alternatives_in_ruleBasicConstraint1120);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:565:1: entryRuleParenthesisConstraint : ruleParenthesisConstraint EOF ;
    public final void entryRuleParenthesisConstraint() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:566:1: ( ruleParenthesisConstraint EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:567:1: ruleParenthesisConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint1147);
            ruleParenthesisConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisConstraint1154); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:574:1: ruleParenthesisConstraint : ( ( rule__ParenthesisConstraint__Group__0 ) ) ;
    public final void ruleParenthesisConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:578:2: ( ( ( rule__ParenthesisConstraint__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:579:1: ( ( rule__ParenthesisConstraint__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:579:1: ( ( rule__ParenthesisConstraint__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:580:1: ( rule__ParenthesisConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:581:1: ( rule__ParenthesisConstraint__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:581:2: rule__ParenthesisConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__0_in_ruleParenthesisConstraint1180);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:593:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:594:1: ( ruleOperand EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:595:1: ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_ruleOperand_in_entryRuleOperand1207);
            ruleOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperand1214); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:602:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:606:2: ( ( ( rule__Operand__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:607:1: ( ( rule__Operand__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:607:1: ( ( rule__Operand__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:608:1: ( rule__Operand__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:609:1: ( rule__Operand__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:609:2: rule__Operand__Alternatives
            {
            pushFollow(FOLLOW_rule__Operand__Alternatives_in_ruleOperand1240);
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


    // $ANTLR start "entryRuleTraceModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:621:1: entryRuleTraceModel : ruleTraceModel EOF ;
    public final void entryRuleTraceModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:622:1: ( ruleTraceModel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:623:1: ruleTraceModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelRule()); 
            }
            pushFollow(FOLLOW_ruleTraceModel_in_entryRuleTraceModel1267);
            ruleTraceModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraceModel1274); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:630:1: ruleTraceModel : ( ( rule__TraceModel__Group__0 ) ) ;
    public final void ruleTraceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:634:2: ( ( ( rule__TraceModel__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:635:1: ( ( rule__TraceModel__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:635:1: ( ( rule__TraceModel__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:636:1: ( rule__TraceModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:637:1: ( rule__TraceModel__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:637:2: rule__TraceModel__Group__0
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__0_in_ruleTraceModel1300);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:649:1: entryRuleNodeSetRelation : ruleNodeSetRelation EOF ;
    public final void entryRuleNodeSetRelation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:650:1: ( ruleNodeSetRelation EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:651:1: ruleNodeSetRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationRule()); 
            }
            pushFollow(FOLLOW_ruleNodeSetRelation_in_entryRuleNodeSetRelation1327);
            ruleNodeSetRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeSetRelation1334); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:658:1: ruleNodeSetRelation : ( ( rule__NodeSetRelation__Group__0 ) ) ;
    public final void ruleNodeSetRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:662:2: ( ( ( rule__NodeSetRelation__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:663:1: ( ( rule__NodeSetRelation__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:663:1: ( ( rule__NodeSetRelation__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:664:1: ( rule__NodeSetRelation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:665:1: ( rule__NodeSetRelation__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:665:2: rule__NodeSetRelation__Group__0
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__0_in_ruleNodeSetRelation1360);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:677:1: entryRuleNodeType : ruleNodeType EOF ;
    public final void entryRuleNodeType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:678:1: ( ruleNodeType EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:679:1: ruleNodeType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_entryRuleNodeType1387);
            ruleNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeType1394); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:686:1: ruleNodeType : ( ( rule__NodeType__EclassAssignment ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:690:2: ( ( ( rule__NodeType__EclassAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:691:1: ( ( rule__NodeType__EclassAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:691:1: ( ( rule__NodeType__EclassAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:692:1: ( rule__NodeType__EclassAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getEclassAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:693:1: ( rule__NodeType__EclassAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:693:2: rule__NodeType__EclassAssignment
            {
            pushFollow(FOLLOW_rule__NodeType__EclassAssignment_in_ruleNodeType1420);
            rule__NodeType__EclassAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeTypeAccess().getEclassAssignment()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:705:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:706:1: ( ruleLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:707:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1447);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1454); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:714:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:718:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:719:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:719:1: ( ( rule__Literal__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:720:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:721:1: ( rule__Literal__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:721:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1480);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:733:1: entryRuleArrayLiteral : ruleArrayLiteral EOF ;
    public final void entryRuleArrayLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:734:1: ( ruleArrayLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:735:1: ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1507);
            ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral1514); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:742:1: ruleArrayLiteral : ( ( rule__ArrayLiteral__Group__0 ) ) ;
    public final void ruleArrayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:746:2: ( ( ( rule__ArrayLiteral__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:747:1: ( ( rule__ArrayLiteral__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:747:1: ( ( rule__ArrayLiteral__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:748:1: ( rule__ArrayLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:749:1: ( rule__ArrayLiteral__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:749:2: rule__ArrayLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1540);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:761:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:762:1: ( ruleStringLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:763:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1567);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1574); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:770:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:774:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:775:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:775:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:776:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:777:1: ( rule__StringLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:777:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1600);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:789:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:790:1: ( ruleIntLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:791:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1627);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral1634); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:798:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:802:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:803:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:803:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:804:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:805:1: ( rule__IntLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:805:2: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1660);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:817:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:818:1: ( ruleFloatLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:819:1: ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1687);
            ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral1694); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:826:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:830:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:831:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:831:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:832:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:833:1: ( rule__FloatLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:833:2: rule__FloatLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1720);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:845:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:846:1: ( ruleBooleanLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:847:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1747);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1754); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:854:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:858:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:859:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:859:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:860:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:861:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:861:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1780);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:873:1: entryRuleLogicOperator : ruleLogicOperator EOF ;
    public final void entryRuleLogicOperator() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:874:1: ( ruleLogicOperator EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:875:1: ruleLogicOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_entryRuleLogicOperator1807);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicOperator1814); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:882:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:886:2: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:887:1: ( ( rule__LogicOperator__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:887:1: ( ( rule__LogicOperator__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:888:1: ( rule__LogicOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:889:1: ( rule__LogicOperator__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:889:2: rule__LogicOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator1840);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:901:1: entryRuleComparator : ruleComparator EOF ;
    public final void entryRuleComparator() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:902:1: ( ruleComparator EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:903:1: ruleComparator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorRule()); 
            }
            pushFollow(FOLLOW_ruleComparator_in_entryRuleComparator1867);
            ruleComparator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparator1874); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:910:1: ruleComparator : ( ( rule__Comparator__Alternatives ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:914:2: ( ( ( rule__Comparator__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:915:1: ( ( rule__Comparator__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:915:1: ( ( rule__Comparator__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:916:1: ( rule__Comparator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:917:1: ( rule__Comparator__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:917:2: rule__Comparator__Alternatives
            {
            pushFollow(FOLLOW_rule__Comparator__Alternatives_in_ruleComparator1900);
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:957:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:958:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:959:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1987);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1994); if (state.failed) return ;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:966:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:970:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:971:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:971:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:972:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:973:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:973:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard2020);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "rule__Model__Alternatives_5"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:985:1: rule__Model__Alternatives_5 : ( ( ( rule__Model__ConnectionsAssignment_5_0 ) ) | ( ( rule__Model__MetamodelsAssignment_5_1 ) ) );
    public final void rule__Model__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:989:1: ( ( ( rule__Model__ConnectionsAssignment_5_0 ) ) | ( ( rule__Model__MetamodelsAssignment_5_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16||LA1_0==23) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:990:1: ( ( rule__Model__ConnectionsAssignment_5_0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:990:1: ( ( rule__Model__ConnectionsAssignment_5_0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:991:1: ( rule__Model__ConnectionsAssignment_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getConnectionsAssignment_5_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:992:1: ( rule__Model__ConnectionsAssignment_5_0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:992:2: rule__Model__ConnectionsAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__Model__ConnectionsAssignment_5_0_in_rule__Model__Alternatives_52056);
                    rule__Model__ConnectionsAssignment_5_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getConnectionsAssignment_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:996:6: ( ( rule__Model__MetamodelsAssignment_5_1 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:996:6: ( ( rule__Model__MetamodelsAssignment_5_1 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:997:1: ( rule__Model__MetamodelsAssignment_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getMetamodelsAssignment_5_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:998:1: ( rule__Model__MetamodelsAssignment_5_1 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:998:2: rule__Model__MetamodelsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Model__MetamodelsAssignment_5_1_in_rule__Model__Alternatives_52074);
                    rule__Model__MetamodelsAssignment_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getMetamodelsAssignment_5_1()); 
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
    // $ANTLR end "rule__Model__Alternatives_5"


    // $ANTLR start "rule__Import__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1007:1: rule__Import__Alternatives : ( ( ruleWeaverImport ) | ( ruleGeneratorImport ) );
    public final void rule__Import__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1011:1: ( ( ruleWeaverImport ) | ( ruleGeneratorImport ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1012:1: ( ruleWeaverImport )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1012:1: ( ruleWeaverImport )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1013:1: ruleWeaverImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getWeaverImportParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleWeaverImport_in_rule__Import__Alternatives2107);
                    ruleWeaverImport();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportAccess().getWeaverImportParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1018:6: ( ruleGeneratorImport )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1018:6: ( ruleGeneratorImport )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1019:1: ruleGeneratorImport
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getImportAccess().getGeneratorImportParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGeneratorImport_in_rule__Import__Alternatives2124);
                    ruleGeneratorImport();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getImportAccess().getGeneratorImportParserRuleCall_1()); 
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
    // $ANTLR end "rule__Import__Alternatives"


    // $ANTLR start "rule__RegisteredPackage__Alternatives_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1029:1: rule__RegisteredPackage__Alternatives_2 : ( ( ( rule__RegisteredPackage__ModelPackageAssignment_2_0 ) ) | ( ( rule__RegisteredPackage__Group_2_1__0 ) ) );
    public final void rule__RegisteredPackage__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1033:1: ( ( ( rule__RegisteredPackage__ModelPackageAssignment_2_0 ) ) | ( ( rule__RegisteredPackage__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1034:1: ( ( rule__RegisteredPackage__ModelPackageAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1034:1: ( ( rule__RegisteredPackage__ModelPackageAssignment_2_0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1035:1: ( rule__RegisteredPackage__ModelPackageAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRegisteredPackageAccess().getModelPackageAssignment_2_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1036:1: ( rule__RegisteredPackage__ModelPackageAssignment_2_0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1036:2: rule__RegisteredPackage__ModelPackageAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__RegisteredPackage__ModelPackageAssignment_2_0_in_rule__RegisteredPackage__Alternatives_22156);
                    rule__RegisteredPackage__ModelPackageAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRegisteredPackageAccess().getModelPackageAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1040:6: ( ( rule__RegisteredPackage__Group_2_1__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1040:6: ( ( rule__RegisteredPackage__Group_2_1__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1041:1: ( rule__RegisteredPackage__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRegisteredPackageAccess().getGroup_2_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1042:1: ( rule__RegisteredPackage__Group_2_1__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1042:2: rule__RegisteredPackage__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__RegisteredPackage__Group_2_1__0_in_rule__RegisteredPackage__Alternatives_22174);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1051:1: rule__Connection__Alternatives : ( ( ruleGenerator ) | ( ruleWeaver ) );
    public final void rule__Connection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1055:1: ( ( ruleGenerator ) | ( ruleWeaver ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1056:1: ( ruleGenerator )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1056:1: ( ruleGenerator )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1057:1: ruleGenerator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionAccess().getGeneratorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGenerator_in_rule__Connection__Alternatives2207);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1062:6: ( ruleWeaver )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1062:6: ( ruleWeaver )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1063:1: ruleWeaver
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConnectionAccess().getWeaverParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleWeaver_in_rule__Connection__Alternatives2224);
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


    // $ANTLR start "rule__AspectModel__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1073:1: rule__AspectModel__Alternatives : ( ( ( rule__AspectModel__Group_0__0 ) ) | ( ruleGenerator ) );
    public final void rule__AspectModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1077:1: ( ( ( rule__AspectModel__Group_0__0 ) ) | ( ruleGenerator ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1078:1: ( ( rule__AspectModel__Group_0__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1078:1: ( ( rule__AspectModel__Group_0__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1079:1: ( rule__AspectModel__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1080:1: ( rule__AspectModel__Group_0__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1080:2: rule__AspectModel__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AspectModel__Group_0__0_in_rule__AspectModel__Alternatives2256);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1084:6: ( ruleGenerator )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1084:6: ( ruleGenerator )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1085:1: ruleGenerator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getGeneratorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGenerator_in_rule__AspectModel__Alternatives2274);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1095:1: rule__SourceModelNodeSelector__Alternatives : ( ( ( rule__SourceModelNodeSelector__Group_0__0 ) ) | ( ( rule__SourceModelNodeSelector__Group_1__0 ) ) );
    public final void rule__SourceModelNodeSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1099:1: ( ( ( rule__SourceModelNodeSelector__Group_0__0 ) ) | ( ( rule__SourceModelNodeSelector__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1100:1: ( ( rule__SourceModelNodeSelector__Group_0__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1100:1: ( ( rule__SourceModelNodeSelector__Group_0__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1101:1: ( rule__SourceModelNodeSelector__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1102:1: ( rule__SourceModelNodeSelector__Group_0__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1102:2: rule__SourceModelNodeSelector__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__0_in_rule__SourceModelNodeSelector__Alternatives2306);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1106:6: ( ( rule__SourceModelNodeSelector__Group_1__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1106:6: ( ( rule__SourceModelNodeSelector__Group_1__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1107:1: ( rule__SourceModelNodeSelector__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1108:1: ( rule__SourceModelNodeSelector__Group_1__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1108:2: rule__SourceModelNodeSelector__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__0_in_rule__SourceModelNodeSelector__Alternatives2324);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1117:1: rule__BasicConstraint__Alternatives : ( ( ruleParenthesisConstraint ) | ( ruleOperand ) );
    public final void rule__BasicConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1121:1: ( ( ruleParenthesisConstraint ) | ( ruleOperand ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_BOOLEAN)||LA7_0==34) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1122:1: ( ruleParenthesisConstraint )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1122:1: ( ruleParenthesisConstraint )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1123:1: ruleParenthesisConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getParenthesisConstraintParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleParenthesisConstraint_in_rule__BasicConstraint__Alternatives2357);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1128:6: ( ruleOperand )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1128:6: ( ruleOperand )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1129:1: ruleOperand
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getOperandParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleOperand_in_rule__BasicConstraint__Alternatives2374);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1139:1: rule__Operand__Alternatives : ( ( ruleLiteral ) | ( ruleNodeProperty ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1143:1: ( ( ruleLiteral ) | ( ruleNodeProperty ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_BOOLEAN)||LA8_0==34) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1144:1: ( ruleLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1144:1: ( ruleLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1145:1: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Operand__Alternatives2406);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1150:6: ( ruleNodeProperty )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1150:6: ( ruleNodeProperty )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1151:1: ruleNodeProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getNodePropertyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNodeProperty_in_rule__Operand__Alternatives2423);
                    ruleNodeProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperandAccess().getNodePropertyParserRuleCall_1()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1161:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleArrayLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1165:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleArrayLiteral ) )
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
            case 34:
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1166:1: ( ruleStringLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1166:1: ( ruleStringLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1167:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2455);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1172:6: ( ruleIntLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1172:6: ( ruleIntLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1173:1: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives2472);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1178:6: ( ruleFloatLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1178:6: ( ruleFloatLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1179:1: ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2489);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1184:6: ( ruleBooleanLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1184:6: ( ruleBooleanLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1185:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2506);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1190:6: ( ruleArrayLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1190:6: ( ruleArrayLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1191:1: ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives2523);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1201:1: rule__LogicOperator__Alternatives : ( ( ( rule__LogicOperator__ANDAssignment_0 ) ) | ( ( rule__LogicOperator__ORAssignment_1 ) ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1205:1: ( ( ( rule__LogicOperator__ANDAssignment_0 ) ) | ( ( rule__LogicOperator__ORAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            else if ( (LA10_0==40) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1206:1: ( ( rule__LogicOperator__ANDAssignment_0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1206:1: ( ( rule__LogicOperator__ANDAssignment_0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1207:1: ( rule__LogicOperator__ANDAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getANDAssignment_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1208:1: ( rule__LogicOperator__ANDAssignment_0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1208:2: rule__LogicOperator__ANDAssignment_0
                    {
                    pushFollow(FOLLOW_rule__LogicOperator__ANDAssignment_0_in_rule__LogicOperator__Alternatives2555);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1212:6: ( ( rule__LogicOperator__ORAssignment_1 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1212:6: ( ( rule__LogicOperator__ORAssignment_1 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1213:1: ( rule__LogicOperator__ORAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getORAssignment_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1214:1: ( rule__LogicOperator__ORAssignment_1 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1214:2: rule__LogicOperator__ORAssignment_1
                    {
                    pushFollow(FOLLOW_rule__LogicOperator__ORAssignment_1_in_rule__LogicOperator__Alternatives2573);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1223:1: rule__Comparator__Alternatives : ( ( ( rule__Comparator__EQAssignment_0 ) ) | ( ( rule__Comparator__NEAssignment_1 ) ) | ( ( rule__Comparator__GRAssignment_2 ) ) | ( ( rule__Comparator__LWAssignment_3 ) ) | ( ( rule__Comparator__GEAssignment_4 ) ) | ( ( rule__Comparator__LEAssignment_5 ) ) | ( ( rule__Comparator__LIKEAssignment_6 ) ) );
    public final void rule__Comparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1227:1: ( ( ( rule__Comparator__EQAssignment_0 ) ) | ( ( rule__Comparator__NEAssignment_1 ) ) | ( ( rule__Comparator__GRAssignment_2 ) ) | ( ( rule__Comparator__LWAssignment_3 ) ) | ( ( rule__Comparator__GEAssignment_4 ) ) | ( ( rule__Comparator__LEAssignment_5 ) ) | ( ( rule__Comparator__LIKEAssignment_6 ) ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt11=1;
                }
                break;
            case 42:
                {
                alt11=2;
                }
                break;
            case 33:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
                }
                break;
            case 43:
                {
                alt11=5;
                }
                break;
            case 44:
                {
                alt11=6;
                }
                break;
            case 45:
                {
                alt11=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1228:1: ( ( rule__Comparator__EQAssignment_0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1228:1: ( ( rule__Comparator__EQAssignment_0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1229:1: ( rule__Comparator__EQAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getEQAssignment_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1230:1: ( rule__Comparator__EQAssignment_0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1230:2: rule__Comparator__EQAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Comparator__EQAssignment_0_in_rule__Comparator__Alternatives2606);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1234:6: ( ( rule__Comparator__NEAssignment_1 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1234:6: ( ( rule__Comparator__NEAssignment_1 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1235:1: ( rule__Comparator__NEAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getNEAssignment_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1236:1: ( rule__Comparator__NEAssignment_1 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1236:2: rule__Comparator__NEAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Comparator__NEAssignment_1_in_rule__Comparator__Alternatives2624);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1240:6: ( ( rule__Comparator__GRAssignment_2 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1240:6: ( ( rule__Comparator__GRAssignment_2 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1241:1: ( rule__Comparator__GRAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getGRAssignment_2()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1242:1: ( rule__Comparator__GRAssignment_2 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1242:2: rule__Comparator__GRAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Comparator__GRAssignment_2_in_rule__Comparator__Alternatives2642);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1246:6: ( ( rule__Comparator__LWAssignment_3 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1246:6: ( ( rule__Comparator__LWAssignment_3 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1247:1: ( rule__Comparator__LWAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLWAssignment_3()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1248:1: ( rule__Comparator__LWAssignment_3 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1248:2: rule__Comparator__LWAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Comparator__LWAssignment_3_in_rule__Comparator__Alternatives2660);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1252:6: ( ( rule__Comparator__GEAssignment_4 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1252:6: ( ( rule__Comparator__GEAssignment_4 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1253:1: ( rule__Comparator__GEAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getGEAssignment_4()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1254:1: ( rule__Comparator__GEAssignment_4 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1254:2: rule__Comparator__GEAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Comparator__GEAssignment_4_in_rule__Comparator__Alternatives2678);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1258:6: ( ( rule__Comparator__LEAssignment_5 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1258:6: ( ( rule__Comparator__LEAssignment_5 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1259:1: ( rule__Comparator__LEAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLEAssignment_5()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1260:1: ( rule__Comparator__LEAssignment_5 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1260:2: rule__Comparator__LEAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Comparator__LEAssignment_5_in_rule__Comparator__Alternatives2696);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1264:6: ( ( rule__Comparator__LIKEAssignment_6 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1264:6: ( ( rule__Comparator__LIKEAssignment_6 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1265:1: ( rule__Comparator__LIKEAssignment_6 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLIKEAssignment_6()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1266:1: ( rule__Comparator__LIKEAssignment_6 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1266:2: rule__Comparator__LIKEAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Comparator__LIKEAssignment_6_in_rule__Comparator__Alternatives2714);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1277:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1281:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1282:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02745);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02748);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1289:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1293:1: ( ( 'package' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1294:1: ( 'package' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1294:1: ( 'package' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1295:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Model__Group__0__Impl2776); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1308:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1312:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1313:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12807);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12810);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1320:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1324:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1325:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1325:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1326:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1327:1: ( rule__Model__NameAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1327:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2837);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1337:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1341:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1342:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22867);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22870);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1349:1: rule__Model__Group__2__Impl : ( 'import' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1353:1: ( ( 'import' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1354:1: ( 'import' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1354:1: ( 'import' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1355:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__Model__Group__2__Impl2898); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportKeyword_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1368:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1372:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1373:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32929);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32932);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1380:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1384:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1385:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1385:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1386:1: ( rule__Model__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1387:1: ( rule__Model__ImportsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=16 && LA12_0<=17)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1387:2: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl2959);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1397:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1401:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1402:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42990);
            rule__Model__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42993);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1409:1: rule__Model__Group__4__Impl : ( ( ( rule__Model__RegisteredPackagesAssignment_4 ) ) ( ( rule__Model__RegisteredPackagesAssignment_4 )* ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1413:1: ( ( ( ( rule__Model__RegisteredPackagesAssignment_4 ) ) ( ( rule__Model__RegisteredPackagesAssignment_4 )* ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1414:1: ( ( ( rule__Model__RegisteredPackagesAssignment_4 ) ) ( ( rule__Model__RegisteredPackagesAssignment_4 )* ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1414:1: ( ( ( rule__Model__RegisteredPackagesAssignment_4 ) ) ( ( rule__Model__RegisteredPackagesAssignment_4 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1415:1: ( ( rule__Model__RegisteredPackagesAssignment_4 ) ) ( ( rule__Model__RegisteredPackagesAssignment_4 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1415:1: ( ( rule__Model__RegisteredPackagesAssignment_4 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1416:1: ( rule__Model__RegisteredPackagesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRegisteredPackagesAssignment_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1417:1: ( rule__Model__RegisteredPackagesAssignment_4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1417:2: rule__Model__RegisteredPackagesAssignment_4
            {
            pushFollow(FOLLOW_rule__Model__RegisteredPackagesAssignment_4_in_rule__Model__Group__4__Impl3022);
            rule__Model__RegisteredPackagesAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRegisteredPackagesAssignment_4()); 
            }

            }

            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1420:1: ( ( rule__Model__RegisteredPackagesAssignment_4 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1421:1: ( rule__Model__RegisteredPackagesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRegisteredPackagesAssignment_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1422:1: ( rule__Model__RegisteredPackagesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1422:2: rule__Model__RegisteredPackagesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__RegisteredPackagesAssignment_4_in_rule__Model__Group__4__Impl3034);
            	    rule__Model__RegisteredPackagesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRegisteredPackagesAssignment_4()); 
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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1433:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1437:1: ( rule__Model__Group__5__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1438:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__53067);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1444:1: rule__Model__Group__5__Impl : ( ( rule__Model__Alternatives_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1448:1: ( ( ( rule__Model__Alternatives_5 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1449:1: ( ( rule__Model__Alternatives_5 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1449:1: ( ( rule__Model__Alternatives_5 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1450:1: ( rule__Model__Alternatives_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAlternatives_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1451:1: ( rule__Model__Alternatives_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16||LA14_0==18||LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1451:2: rule__Model__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_5_in_rule__Model__Group__5__Impl3094);
            	    rule__Model__Alternatives_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAlternatives_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__WeaverImport__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1473:1: rule__WeaverImport__Group__0 : rule__WeaverImport__Group__0__Impl rule__WeaverImport__Group__1 ;
    public final void rule__WeaverImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1477:1: ( rule__WeaverImport__Group__0__Impl rule__WeaverImport__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1478:2: rule__WeaverImport__Group__0__Impl rule__WeaverImport__Group__1
            {
            pushFollow(FOLLOW_rule__WeaverImport__Group__0__Impl_in_rule__WeaverImport__Group__03137);
            rule__WeaverImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WeaverImport__Group__1_in_rule__WeaverImport__Group__03140);
            rule__WeaverImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeaverImport__Group__0"


    // $ANTLR start "rule__WeaverImport__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1485:1: rule__WeaverImport__Group__0__Impl : ( 'weave' ) ;
    public final void rule__WeaverImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1489:1: ( ( 'weave' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1490:1: ( 'weave' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1490:1: ( 'weave' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1491:1: 'weave'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverImportAccess().getWeaveKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__WeaverImport__Group__0__Impl3168); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverImportAccess().getWeaveKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeaverImport__Group__0__Impl"


    // $ANTLR start "rule__WeaverImport__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1504:1: rule__WeaverImport__Group__1 : rule__WeaverImport__Group__1__Impl ;
    public final void rule__WeaverImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1508:1: ( rule__WeaverImport__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1509:2: rule__WeaverImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WeaverImport__Group__1__Impl_in_rule__WeaverImport__Group__13199);
            rule__WeaverImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeaverImport__Group__1"


    // $ANTLR start "rule__WeaverImport__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1515:1: rule__WeaverImport__Group__1__Impl : ( ( rule__WeaverImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__WeaverImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1519:1: ( ( ( rule__WeaverImport__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1520:1: ( ( rule__WeaverImport__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1520:1: ( ( rule__WeaverImport__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1521:1: ( rule__WeaverImport__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1522:1: ( rule__WeaverImport__ImportedNamespaceAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1522:2: rule__WeaverImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__WeaverImport__ImportedNamespaceAssignment_1_in_rule__WeaverImport__Group__1__Impl3226);
            rule__WeaverImport__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeaverImport__Group__1__Impl"


    // $ANTLR start "rule__GeneratorImport__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1536:1: rule__GeneratorImport__Group__0 : rule__GeneratorImport__Group__0__Impl rule__GeneratorImport__Group__1 ;
    public final void rule__GeneratorImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1540:1: ( rule__GeneratorImport__Group__0__Impl rule__GeneratorImport__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1541:2: rule__GeneratorImport__Group__0__Impl rule__GeneratorImport__Group__1
            {
            pushFollow(FOLLOW_rule__GeneratorImport__Group__0__Impl_in_rule__GeneratorImport__Group__03260);
            rule__GeneratorImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GeneratorImport__Group__1_in_rule__GeneratorImport__Group__03263);
            rule__GeneratorImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorImport__Group__0"


    // $ANTLR start "rule__GeneratorImport__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1548:1: rule__GeneratorImport__Group__0__Impl : ( 'gen' ) ;
    public final void rule__GeneratorImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1552:1: ( ( 'gen' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1553:1: ( 'gen' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1553:1: ( 'gen' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1554:1: 'gen'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorImportAccess().getGenKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__GeneratorImport__Group__0__Impl3291); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorImportAccess().getGenKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorImport__Group__0__Impl"


    // $ANTLR start "rule__GeneratorImport__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1567:1: rule__GeneratorImport__Group__1 : rule__GeneratorImport__Group__1__Impl ;
    public final void rule__GeneratorImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1571:1: ( rule__GeneratorImport__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1572:2: rule__GeneratorImport__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GeneratorImport__Group__1__Impl_in_rule__GeneratorImport__Group__13322);
            rule__GeneratorImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorImport__Group__1"


    // $ANTLR start "rule__GeneratorImport__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1578:1: rule__GeneratorImport__Group__1__Impl : ( ( rule__GeneratorImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__GeneratorImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1582:1: ( ( ( rule__GeneratorImport__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1583:1: ( ( rule__GeneratorImport__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1583:1: ( ( rule__GeneratorImport__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1584:1: ( rule__GeneratorImport__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1585:1: ( rule__GeneratorImport__ImportedNamespaceAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1585:2: rule__GeneratorImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__GeneratorImport__ImportedNamespaceAssignment_1_in_rule__GeneratorImport__Group__1__Impl3349);
            rule__GeneratorImport__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorImport__Group__1__Impl"


    // $ANTLR start "rule__MetamodelSequence__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1599:1: rule__MetamodelSequence__Group__0 : rule__MetamodelSequence__Group__0__Impl rule__MetamodelSequence__Group__1 ;
    public final void rule__MetamodelSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1603:1: ( rule__MetamodelSequence__Group__0__Impl rule__MetamodelSequence__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1604:2: rule__MetamodelSequence__Group__0__Impl rule__MetamodelSequence__Group__1
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__0__Impl_in_rule__MetamodelSequence__Group__03383);
            rule__MetamodelSequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__1_in_rule__MetamodelSequence__Group__03386);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1611:1: rule__MetamodelSequence__Group__0__Impl : ( 'model' ) ;
    public final void rule__MetamodelSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1615:1: ( ( 'model' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1616:1: ( 'model' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1616:1: ( 'model' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1617:1: 'model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getModelKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__MetamodelSequence__Group__0__Impl3414); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1630:1: rule__MetamodelSequence__Group__1 : rule__MetamodelSequence__Group__1__Impl rule__MetamodelSequence__Group__2 ;
    public final void rule__MetamodelSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1634:1: ( rule__MetamodelSequence__Group__1__Impl rule__MetamodelSequence__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1635:2: rule__MetamodelSequence__Group__1__Impl rule__MetamodelSequence__Group__2
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__1__Impl_in_rule__MetamodelSequence__Group__13445);
            rule__MetamodelSequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__2_in_rule__MetamodelSequence__Group__13448);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1642:1: rule__MetamodelSequence__Group__1__Impl : ( ( rule__MetamodelSequence__TypeAssignment_1 ) ) ;
    public final void rule__MetamodelSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1646:1: ( ( ( rule__MetamodelSequence__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1647:1: ( ( rule__MetamodelSequence__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1647:1: ( ( rule__MetamodelSequence__TypeAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1648:1: ( rule__MetamodelSequence__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1649:1: ( rule__MetamodelSequence__TypeAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1649:2: rule__MetamodelSequence__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__TypeAssignment_1_in_rule__MetamodelSequence__Group__1__Impl3475);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1659:1: rule__MetamodelSequence__Group__2 : rule__MetamodelSequence__Group__2__Impl rule__MetamodelSequence__Group__3 ;
    public final void rule__MetamodelSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1663:1: ( rule__MetamodelSequence__Group__2__Impl rule__MetamodelSequence__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1664:2: rule__MetamodelSequence__Group__2__Impl rule__MetamodelSequence__Group__3
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__2__Impl_in_rule__MetamodelSequence__Group__23505);
            rule__MetamodelSequence__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__3_in_rule__MetamodelSequence__Group__23508);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1671:1: rule__MetamodelSequence__Group__2__Impl : ( ( rule__MetamodelSequence__MetamodelsAssignment_2 ) ) ;
    public final void rule__MetamodelSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1675:1: ( ( ( rule__MetamodelSequence__MetamodelsAssignment_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1676:1: ( ( rule__MetamodelSequence__MetamodelsAssignment_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1676:1: ( ( rule__MetamodelSequence__MetamodelsAssignment_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1677:1: ( rule__MetamodelSequence__MetamodelsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1678:1: ( rule__MetamodelSequence__MetamodelsAssignment_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1678:2: rule__MetamodelSequence__MetamodelsAssignment_2
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__MetamodelsAssignment_2_in_rule__MetamodelSequence__Group__2__Impl3535);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1688:1: rule__MetamodelSequence__Group__3 : rule__MetamodelSequence__Group__3__Impl ;
    public final void rule__MetamodelSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1692:1: ( rule__MetamodelSequence__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1693:2: rule__MetamodelSequence__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group__3__Impl_in_rule__MetamodelSequence__Group__33565);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1699:1: rule__MetamodelSequence__Group__3__Impl : ( ( rule__MetamodelSequence__Group_3__0 )* ) ;
    public final void rule__MetamodelSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1703:1: ( ( ( rule__MetamodelSequence__Group_3__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1704:1: ( ( rule__MetamodelSequence__Group_3__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1704:1: ( ( rule__MetamodelSequence__Group_3__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1705:1: ( rule__MetamodelSequence__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1706:1: ( rule__MetamodelSequence__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1706:2: rule__MetamodelSequence__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__MetamodelSequence__Group_3__0_in_rule__MetamodelSequence__Group__3__Impl3592);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1724:1: rule__MetamodelSequence__Group_3__0 : rule__MetamodelSequence__Group_3__0__Impl rule__MetamodelSequence__Group_3__1 ;
    public final void rule__MetamodelSequence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1728:1: ( rule__MetamodelSequence__Group_3__0__Impl rule__MetamodelSequence__Group_3__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1729:2: rule__MetamodelSequence__Group_3__0__Impl rule__MetamodelSequence__Group_3__1
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group_3__0__Impl_in_rule__MetamodelSequence__Group_3__03631);
            rule__MetamodelSequence__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MetamodelSequence__Group_3__1_in_rule__MetamodelSequence__Group_3__03634);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1736:1: rule__MetamodelSequence__Group_3__0__Impl : ( ',' ) ;
    public final void rule__MetamodelSequence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1740:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1741:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1741:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1742:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getCommaKeyword_3_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__MetamodelSequence__Group_3__0__Impl3662); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1755:1: rule__MetamodelSequence__Group_3__1 : rule__MetamodelSequence__Group_3__1__Impl ;
    public final void rule__MetamodelSequence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1759:1: ( rule__MetamodelSequence__Group_3__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1760:2: rule__MetamodelSequence__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__Group_3__1__Impl_in_rule__MetamodelSequence__Group_3__13693);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1766:1: rule__MetamodelSequence__Group_3__1__Impl : ( ( rule__MetamodelSequence__MetamodelsAssignment_3_1 ) ) ;
    public final void rule__MetamodelSequence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1770:1: ( ( ( rule__MetamodelSequence__MetamodelsAssignment_3_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1771:1: ( ( rule__MetamodelSequence__MetamodelsAssignment_3_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1771:1: ( ( rule__MetamodelSequence__MetamodelsAssignment_3_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1772:1: ( rule__MetamodelSequence__MetamodelsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsAssignment_3_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1773:1: ( rule__MetamodelSequence__MetamodelsAssignment_3_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1773:2: rule__MetamodelSequence__MetamodelsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__MetamodelSequence__MetamodelsAssignment_3_1_in_rule__MetamodelSequence__Group_3__1__Impl3720);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1787:1: rule__RegisteredPackage__Group__0 : rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1 ;
    public final void rule__RegisteredPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1791:1: ( rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1792:2: rule__RegisteredPackage__Group__0__Impl rule__RegisteredPackage__Group__1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__0__Impl_in_rule__RegisteredPackage__Group__03754);
            rule__RegisteredPackage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__1_in_rule__RegisteredPackage__Group__03757);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1799:1: rule__RegisteredPackage__Group__0__Impl : ( 'register' ) ;
    public final void rule__RegisteredPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1803:1: ( ( 'register' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1804:1: ( 'register' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1804:1: ( 'register' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1805:1: 'register'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getRegisterKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__RegisteredPackage__Group__0__Impl3785); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1818:1: rule__RegisteredPackage__Group__1 : rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2 ;
    public final void rule__RegisteredPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1822:1: ( rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1823:2: rule__RegisteredPackage__Group__1__Impl rule__RegisteredPackage__Group__2
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__1__Impl_in_rule__RegisteredPackage__Group__13816);
            rule__RegisteredPackage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__2_in_rule__RegisteredPackage__Group__13819);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1830:1: rule__RegisteredPackage__Group__1__Impl : ( ( rule__RegisteredPackage__NameAssignment_1 ) ) ;
    public final void rule__RegisteredPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1834:1: ( ( ( rule__RegisteredPackage__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1835:1: ( ( rule__RegisteredPackage__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1835:1: ( ( rule__RegisteredPackage__NameAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1836:1: ( rule__RegisteredPackage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1837:1: ( rule__RegisteredPackage__NameAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1837:2: rule__RegisteredPackage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__NameAssignment_1_in_rule__RegisteredPackage__Group__1__Impl3846);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1847:1: rule__RegisteredPackage__Group__2 : rule__RegisteredPackage__Group__2__Impl ;
    public final void rule__RegisteredPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1851:1: ( rule__RegisteredPackage__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1852:2: rule__RegisteredPackage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group__2__Impl_in_rule__RegisteredPackage__Group__23876);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1858:1: rule__RegisteredPackage__Group__2__Impl : ( ( rule__RegisteredPackage__Alternatives_2 ) ) ;
    public final void rule__RegisteredPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1862:1: ( ( ( rule__RegisteredPackage__Alternatives_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1863:1: ( ( rule__RegisteredPackage__Alternatives_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1863:1: ( ( rule__RegisteredPackage__Alternatives_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1864:1: ( rule__RegisteredPackage__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1865:1: ( rule__RegisteredPackage__Alternatives_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1865:2: rule__RegisteredPackage__Alternatives_2
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Alternatives_2_in_rule__RegisteredPackage__Group__2__Impl3903);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1881:1: rule__RegisteredPackage__Group_2_1__0 : rule__RegisteredPackage__Group_2_1__0__Impl rule__RegisteredPackage__Group_2_1__1 ;
    public final void rule__RegisteredPackage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1885:1: ( rule__RegisteredPackage__Group_2_1__0__Impl rule__RegisteredPackage__Group_2_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1886:2: rule__RegisteredPackage__Group_2_1__0__Impl rule__RegisteredPackage__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group_2_1__0__Impl_in_rule__RegisteredPackage__Group_2_1__03939);
            rule__RegisteredPackage__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredPackage__Group_2_1__1_in_rule__RegisteredPackage__Group_2_1__03942);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1893:1: rule__RegisteredPackage__Group_2_1__0__Impl : ( ( rule__RegisteredPackage__IsTextAssignment_2_1_0 ) ) ;
    public final void rule__RegisteredPackage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1897:1: ( ( ( rule__RegisteredPackage__IsTextAssignment_2_1_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1898:1: ( ( rule__RegisteredPackage__IsTextAssignment_2_1_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1898:1: ( ( rule__RegisteredPackage__IsTextAssignment_2_1_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1899:1: ( rule__RegisteredPackage__IsTextAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getIsTextAssignment_2_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1900:1: ( rule__RegisteredPackage__IsTextAssignment_2_1_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1900:2: rule__RegisteredPackage__IsTextAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__IsTextAssignment_2_1_0_in_rule__RegisteredPackage__Group_2_1__0__Impl3969);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1910:1: rule__RegisteredPackage__Group_2_1__1 : rule__RegisteredPackage__Group_2_1__1__Impl ;
    public final void rule__RegisteredPackage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1914:1: ( rule__RegisteredPackage__Group_2_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1915:2: rule__RegisteredPackage__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__Group_2_1__1__Impl_in_rule__RegisteredPackage__Group_2_1__13999);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1921:1: rule__RegisteredPackage__Group_2_1__1__Impl : ( ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 ) ) ;
    public final void rule__RegisteredPackage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1925:1: ( ( ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1926:1: ( ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1926:1: ( ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1927:1: ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getExtensionAssignment_2_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1928:1: ( rule__RegisteredPackage__ExtensionAssignment_2_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1928:2: rule__RegisteredPackage__ExtensionAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__RegisteredPackage__ExtensionAssignment_2_1_1_in_rule__RegisteredPackage__Group_2_1__1__Impl4026);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1942:1: rule__Weaver__Group__0 : rule__Weaver__Group__0__Impl rule__Weaver__Group__1 ;
    public final void rule__Weaver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1946:1: ( rule__Weaver__Group__0__Impl rule__Weaver__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1947:2: rule__Weaver__Group__0__Impl rule__Weaver__Group__1
            {
            pushFollow(FOLLOW_rule__Weaver__Group__0__Impl_in_rule__Weaver__Group__04060);
            rule__Weaver__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__1_in_rule__Weaver__Group__04063);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1954:1: rule__Weaver__Group__0__Impl : ( 'weave' ) ;
    public final void rule__Weaver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1958:1: ( ( 'weave' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1959:1: ( 'weave' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1959:1: ( 'weave' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1960:1: 'weave'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getWeaveKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Weaver__Group__0__Impl4091); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1973:1: rule__Weaver__Group__1 : rule__Weaver__Group__1__Impl rule__Weaver__Group__2 ;
    public final void rule__Weaver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1977:1: ( rule__Weaver__Group__1__Impl rule__Weaver__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1978:2: rule__Weaver__Group__1__Impl rule__Weaver__Group__2
            {
            pushFollow(FOLLOW_rule__Weaver__Group__1__Impl_in_rule__Weaver__Group__14122);
            rule__Weaver__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__2_in_rule__Weaver__Group__14125);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1985:1: rule__Weaver__Group__1__Impl : ( ( rule__Weaver__WeaverAssignment_1 ) ) ;
    public final void rule__Weaver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1989:1: ( ( ( rule__Weaver__WeaverAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1990:1: ( ( rule__Weaver__WeaverAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1990:1: ( ( rule__Weaver__WeaverAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1991:1: ( rule__Weaver__WeaverAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getWeaverAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1992:1: ( rule__Weaver__WeaverAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1992:2: rule__Weaver__WeaverAssignment_1
            {
            pushFollow(FOLLOW_rule__Weaver__WeaverAssignment_1_in_rule__Weaver__Group__1__Impl4152);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2002:1: rule__Weaver__Group__2 : rule__Weaver__Group__2__Impl rule__Weaver__Group__3 ;
    public final void rule__Weaver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2006:1: ( rule__Weaver__Group__2__Impl rule__Weaver__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2007:2: rule__Weaver__Group__2__Impl rule__Weaver__Group__3
            {
            pushFollow(FOLLOW_rule__Weaver__Group__2__Impl_in_rule__Weaver__Group__24182);
            rule__Weaver__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__3_in_rule__Weaver__Group__24185);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2014:1: rule__Weaver__Group__2__Impl : ( ( rule__Weaver__SourceModelAssignment_2 ) ) ;
    public final void rule__Weaver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2018:1: ( ( ( rule__Weaver__SourceModelAssignment_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2019:1: ( ( rule__Weaver__SourceModelAssignment_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2019:1: ( ( rule__Weaver__SourceModelAssignment_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2020:1: ( rule__Weaver__SourceModelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getSourceModelAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2021:1: ( rule__Weaver__SourceModelAssignment_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2021:2: rule__Weaver__SourceModelAssignment_2
            {
            pushFollow(FOLLOW_rule__Weaver__SourceModelAssignment_2_in_rule__Weaver__Group__2__Impl4212);
            rule__Weaver__SourceModelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getSourceModelAssignment_2()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2031:1: rule__Weaver__Group__3 : rule__Weaver__Group__3__Impl rule__Weaver__Group__4 ;
    public final void rule__Weaver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2035:1: ( rule__Weaver__Group__3__Impl rule__Weaver__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2036:2: rule__Weaver__Group__3__Impl rule__Weaver__Group__4
            {
            pushFollow(FOLLOW_rule__Weaver__Group__3__Impl_in_rule__Weaver__Group__34242);
            rule__Weaver__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__4_in_rule__Weaver__Group__34245);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2043:1: rule__Weaver__Group__3__Impl : ( ( rule__Weaver__AspectModelAssignment_3 ) ) ;
    public final void rule__Weaver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2047:1: ( ( ( rule__Weaver__AspectModelAssignment_3 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2048:1: ( ( rule__Weaver__AspectModelAssignment_3 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2048:1: ( ( rule__Weaver__AspectModelAssignment_3 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2049:1: ( rule__Weaver__AspectModelAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getAspectModelAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2050:1: ( rule__Weaver__AspectModelAssignment_3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2050:2: rule__Weaver__AspectModelAssignment_3
            {
            pushFollow(FOLLOW_rule__Weaver__AspectModelAssignment_3_in_rule__Weaver__Group__3__Impl4272);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2060:1: rule__Weaver__Group__4 : rule__Weaver__Group__4__Impl ;
    public final void rule__Weaver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2064:1: ( rule__Weaver__Group__4__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2065:2: rule__Weaver__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Weaver__Group__4__Impl_in_rule__Weaver__Group__44302);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2071:1: rule__Weaver__Group__4__Impl : ( ( rule__Weaver__Group_4__0 )? ) ;
    public final void rule__Weaver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2075:1: ( ( ( rule__Weaver__Group_4__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2076:1: ( ( rule__Weaver__Group_4__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2076:1: ( ( rule__Weaver__Group_4__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2077:1: ( rule__Weaver__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getGroup_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2078:1: ( rule__Weaver__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2078:2: rule__Weaver__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Weaver__Group_4__0_in_rule__Weaver__Group__4__Impl4329);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2098:1: rule__Weaver__Group_4__0 : rule__Weaver__Group_4__0__Impl rule__Weaver__Group_4__1 ;
    public final void rule__Weaver__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2102:1: ( rule__Weaver__Group_4__0__Impl rule__Weaver__Group_4__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2103:2: rule__Weaver__Group_4__0__Impl rule__Weaver__Group_4__1
            {
            pushFollow(FOLLOW_rule__Weaver__Group_4__0__Impl_in_rule__Weaver__Group_4__04370);
            rule__Weaver__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group_4__1_in_rule__Weaver__Group_4__04373);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2110:1: rule__Weaver__Group_4__0__Impl : ( '=>' ) ;
    public final void rule__Weaver__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2114:1: ( ( '=>' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2115:1: ( '=>' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2115:1: ( '=>' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2116:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getEqualsSignGreaterThanSignKeyword_4_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Weaver__Group_4__0__Impl4401); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2129:1: rule__Weaver__Group_4__1 : rule__Weaver__Group_4__1__Impl ;
    public final void rule__Weaver__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2133:1: ( rule__Weaver__Group_4__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2134:2: rule__Weaver__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Weaver__Group_4__1__Impl_in_rule__Weaver__Group_4__14432);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2140:1: rule__Weaver__Group_4__1__Impl : ( ( rule__Weaver__TargetModelAssignment_4_1 ) ) ;
    public final void rule__Weaver__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2144:1: ( ( ( rule__Weaver__TargetModelAssignment_4_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2145:1: ( ( rule__Weaver__TargetModelAssignment_4_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2145:1: ( ( rule__Weaver__TargetModelAssignment_4_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2146:1: ( rule__Weaver__TargetModelAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getTargetModelAssignment_4_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2147:1: ( rule__Weaver__TargetModelAssignment_4_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2147:2: rule__Weaver__TargetModelAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Weaver__TargetModelAssignment_4_1_in_rule__Weaver__Group_4__1__Impl4459);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2161:1: rule__AspectModel__Group_0__0 : rule__AspectModel__Group_0__0__Impl rule__AspectModel__Group_0__1 ;
    public final void rule__AspectModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2165:1: ( rule__AspectModel__Group_0__0__Impl rule__AspectModel__Group_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2166:2: rule__AspectModel__Group_0__0__Impl rule__AspectModel__Group_0__1
            {
            pushFollow(FOLLOW_rule__AspectModel__Group_0__0__Impl_in_rule__AspectModel__Group_0__04493);
            rule__AspectModel__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AspectModel__Group_0__1_in_rule__AspectModel__Group_0__04496);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2173:1: rule__AspectModel__Group_0__0__Impl : ( ':' ) ;
    public final void rule__AspectModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2177:1: ( ( ':' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2178:1: ( ':' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2178:1: ( ':' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2179:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getColonKeyword_0_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__AspectModel__Group_0__0__Impl4524); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2192:1: rule__AspectModel__Group_0__1 : rule__AspectModel__Group_0__1__Impl ;
    public final void rule__AspectModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2196:1: ( rule__AspectModel__Group_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2197:2: rule__AspectModel__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AspectModel__Group_0__1__Impl_in_rule__AspectModel__Group_0__14555);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2203:1: rule__AspectModel__Group_0__1__Impl : ( ruleTargetModelNodeType ) ;
    public final void rule__AspectModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2207:1: ( ( ruleTargetModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2208:1: ( ruleTargetModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2208:1: ( ruleTargetModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2209:1: ruleTargetModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getTargetModelNodeTypeParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_rule__AspectModel__Group_0__1__Impl4582);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2224:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2228:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2229:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
            {
            pushFollow(FOLLOW_rule__Generator__Group__0__Impl_in_rule__Generator__Group__04615);
            rule__Generator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__1_in_rule__Generator__Group__04618);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2236:1: rule__Generator__Group__0__Impl : ( 'generate' ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2240:1: ( ( 'generate' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2241:1: ( 'generate' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2241:1: ( 'generate' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2242:1: 'generate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGenerateKeyword_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Generator__Group__0__Impl4646); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2255:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2259:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2260:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
            {
            pushFollow(FOLLOW_rule__Generator__Group__1__Impl_in_rule__Generator__Group__14677);
            rule__Generator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__2_in_rule__Generator__Group__14680);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2267:1: rule__Generator__Group__1__Impl : ( ( rule__Generator__GeneratorAssignment_1 ) ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2271:1: ( ( ( rule__Generator__GeneratorAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2272:1: ( ( rule__Generator__GeneratorAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2272:1: ( ( rule__Generator__GeneratorAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2273:1: ( rule__Generator__GeneratorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGeneratorAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2274:1: ( rule__Generator__GeneratorAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2274:2: rule__Generator__GeneratorAssignment_1
            {
            pushFollow(FOLLOW_rule__Generator__GeneratorAssignment_1_in_rule__Generator__Group__1__Impl4707);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2284:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2288:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2289:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
            {
            pushFollow(FOLLOW_rule__Generator__Group__2__Impl_in_rule__Generator__Group__24737);
            rule__Generator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__3_in_rule__Generator__Group__24740);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2296:1: rule__Generator__Group__2__Impl : ( ( rule__Generator__SourceModelAssignment_2 ) ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2300:1: ( ( ( rule__Generator__SourceModelAssignment_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2301:1: ( ( rule__Generator__SourceModelAssignment_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2301:1: ( ( rule__Generator__SourceModelAssignment_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2302:1: ( rule__Generator__SourceModelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceModelAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2303:1: ( rule__Generator__SourceModelAssignment_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2303:2: rule__Generator__SourceModelAssignment_2
            {
            pushFollow(FOLLOW_rule__Generator__SourceModelAssignment_2_in_rule__Generator__Group__2__Impl4767);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2313:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2317:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2318:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
            {
            pushFollow(FOLLOW_rule__Generator__Group__3__Impl_in_rule__Generator__Group__34797);
            rule__Generator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__4_in_rule__Generator__Group__34800);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2325:1: rule__Generator__Group__3__Impl : ( ( rule__Generator__TargetModelAssignment_3 ) ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2329:1: ( ( ( rule__Generator__TargetModelAssignment_3 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2330:1: ( ( rule__Generator__TargetModelAssignment_3 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2330:1: ( ( rule__Generator__TargetModelAssignment_3 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2331:1: ( rule__Generator__TargetModelAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetModelAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2332:1: ( rule__Generator__TargetModelAssignment_3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2332:2: rule__Generator__TargetModelAssignment_3
            {
            pushFollow(FOLLOW_rule__Generator__TargetModelAssignment_3_in_rule__Generator__Group__3__Impl4827);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2342:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2346:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2347:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
            {
            pushFollow(FOLLOW_rule__Generator__Group__4__Impl_in_rule__Generator__Group__44857);
            rule__Generator__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__5_in_rule__Generator__Group__44860);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2354:1: rule__Generator__Group__4__Impl : ( ( rule__Generator__Group_4__0 )? ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2358:1: ( ( ( rule__Generator__Group_4__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2359:1: ( ( rule__Generator__Group_4__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2359:1: ( ( rule__Generator__Group_4__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2360:1: ( rule__Generator__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2361:1: ( rule__Generator__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2361:2: rule__Generator__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_4__0_in_rule__Generator__Group__4__Impl4887);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2371:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2375:1: ( rule__Generator__Group__5__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2376:2: rule__Generator__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group__5__Impl_in_rule__Generator__Group__54918);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2382:1: rule__Generator__Group__5__Impl : ( ( rule__Generator__Group_5__0 )? ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2386:1: ( ( ( rule__Generator__Group_5__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2387:1: ( ( rule__Generator__Group_5__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2387:1: ( ( rule__Generator__Group_5__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2388:1: ( rule__Generator__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2389:1: ( rule__Generator__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2389:2: rule__Generator__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_5__0_in_rule__Generator__Group__5__Impl4945);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2411:1: rule__Generator__Group_4__0 : rule__Generator__Group_4__0__Impl rule__Generator__Group_4__1 ;
    public final void rule__Generator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2415:1: ( rule__Generator__Group_4__0__Impl rule__Generator__Group_4__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2416:2: rule__Generator__Group_4__0__Impl rule__Generator__Group_4__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_4__0__Impl_in_rule__Generator__Group_4__04988);
            rule__Generator__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_4__1_in_rule__Generator__Group_4__04991);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2423:1: rule__Generator__Group_4__0__Impl : ( '->' ) ;
    public final void rule__Generator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2427:1: ( ( '->' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2428:1: ( '->' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2428:1: ( '->' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2429:1: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Generator__Group_4__0__Impl5019); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2442:1: rule__Generator__Group_4__1 : rule__Generator__Group_4__1__Impl ;
    public final void rule__Generator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2446:1: ( rule__Generator__Group_4__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2447:2: rule__Generator__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_4__1__Impl_in_rule__Generator__Group_4__15050);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2453:1: rule__Generator__Group_4__1__Impl : ( ( rule__Generator__WriteTraceModelAssignment_4_1 ) ) ;
    public final void rule__Generator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2457:1: ( ( ( rule__Generator__WriteTraceModelAssignment_4_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2458:1: ( ( rule__Generator__WriteTraceModelAssignment_4_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2458:1: ( ( rule__Generator__WriteTraceModelAssignment_4_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2459:1: ( rule__Generator__WriteTraceModelAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getWriteTraceModelAssignment_4_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2460:1: ( rule__Generator__WriteTraceModelAssignment_4_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2460:2: rule__Generator__WriteTraceModelAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Generator__WriteTraceModelAssignment_4_1_in_rule__Generator__Group_4__1__Impl5077);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2474:1: rule__Generator__Group_5__0 : rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1 ;
    public final void rule__Generator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2478:1: ( rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2479:2: rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_5__0__Impl_in_rule__Generator__Group_5__05111);
            rule__Generator__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_5__1_in_rule__Generator__Group_5__05114);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2486:1: rule__Generator__Group_5__0__Impl : ( '<-' ) ;
    public final void rule__Generator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2490:1: ( ( '<-' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2491:1: ( '<-' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2491:1: ( '<-' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2492:1: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getLessThanSignHyphenMinusKeyword_5_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Generator__Group_5__0__Impl5142); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2505:1: rule__Generator__Group_5__1 : rule__Generator__Group_5__1__Impl rule__Generator__Group_5__2 ;
    public final void rule__Generator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2509:1: ( rule__Generator__Group_5__1__Impl rule__Generator__Group_5__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2510:2: rule__Generator__Group_5__1__Impl rule__Generator__Group_5__2
            {
            pushFollow(FOLLOW_rule__Generator__Group_5__1__Impl_in_rule__Generator__Group_5__15173);
            rule__Generator__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_5__2_in_rule__Generator__Group_5__15176);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2517:1: rule__Generator__Group_5__1__Impl : ( ( rule__Generator__ReadTraceModelsAssignment_5_1 ) ) ;
    public final void rule__Generator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2521:1: ( ( ( rule__Generator__ReadTraceModelsAssignment_5_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2522:1: ( ( rule__Generator__ReadTraceModelsAssignment_5_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2522:1: ( ( rule__Generator__ReadTraceModelsAssignment_5_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2523:1: ( rule__Generator__ReadTraceModelsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReadTraceModelsAssignment_5_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2524:1: ( rule__Generator__ReadTraceModelsAssignment_5_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2524:2: rule__Generator__ReadTraceModelsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Generator__ReadTraceModelsAssignment_5_1_in_rule__Generator__Group_5__1__Impl5203);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2534:1: rule__Generator__Group_5__2 : rule__Generator__Group_5__2__Impl ;
    public final void rule__Generator__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2538:1: ( rule__Generator__Group_5__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2539:2: rule__Generator__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_5__2__Impl_in_rule__Generator__Group_5__25233);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2545:1: rule__Generator__Group_5__2__Impl : ( ( rule__Generator__Group_5_2__0 )* ) ;
    public final void rule__Generator__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2549:1: ( ( ( rule__Generator__Group_5_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2550:1: ( ( rule__Generator__Group_5_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2550:1: ( ( rule__Generator__Group_5_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2551:1: ( rule__Generator__Group_5_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_5_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2552:1: ( rule__Generator__Group_5_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2552:2: rule__Generator__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Generator__Group_5_2__0_in_rule__Generator__Group_5__2__Impl5260);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2568:1: rule__Generator__Group_5_2__0 : rule__Generator__Group_5_2__0__Impl rule__Generator__Group_5_2__1 ;
    public final void rule__Generator__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2572:1: ( rule__Generator__Group_5_2__0__Impl rule__Generator__Group_5_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2573:2: rule__Generator__Group_5_2__0__Impl rule__Generator__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_5_2__0__Impl_in_rule__Generator__Group_5_2__05297);
            rule__Generator__Group_5_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_5_2__1_in_rule__Generator__Group_5_2__05300);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2580:1: rule__Generator__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Generator__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2584:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2585:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2585:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2586:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getCommaKeyword_5_2_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Generator__Group_5_2__0__Impl5328); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2599:1: rule__Generator__Group_5_2__1 : rule__Generator__Group_5_2__1__Impl ;
    public final void rule__Generator__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2603:1: ( rule__Generator__Group_5_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2604:2: rule__Generator__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_5_2__1__Impl_in_rule__Generator__Group_5_2__15359);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2610:1: rule__Generator__Group_5_2__1__Impl : ( ( rule__Generator__ReadTraceModelsAssignment_5_2_1 ) ) ;
    public final void rule__Generator__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2614:1: ( ( ( rule__Generator__ReadTraceModelsAssignment_5_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2615:1: ( ( rule__Generator__ReadTraceModelsAssignment_5_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2615:1: ( ( rule__Generator__ReadTraceModelsAssignment_5_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2616:1: ( rule__Generator__ReadTraceModelsAssignment_5_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReadTraceModelsAssignment_5_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2617:1: ( rule__Generator__ReadTraceModelsAssignment_5_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2617:2: rule__Generator__ReadTraceModelsAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Generator__ReadTraceModelsAssignment_5_2_1_in_rule__Generator__Group_5_2__1__Impl5386);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2631:1: rule__SourceModelNodeSelector__Group_0__0 : rule__SourceModelNodeSelector__Group_0__0__Impl rule__SourceModelNodeSelector__Group_0__1 ;
    public final void rule__SourceModelNodeSelector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2635:1: ( rule__SourceModelNodeSelector__Group_0__0__Impl rule__SourceModelNodeSelector__Group_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2636:2: rule__SourceModelNodeSelector__Group_0__0__Impl rule__SourceModelNodeSelector__Group_0__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__0__Impl_in_rule__SourceModelNodeSelector__Group_0__05420);
            rule__SourceModelNodeSelector__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__1_in_rule__SourceModelNodeSelector__Group_0__05423);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2643:1: rule__SourceModelNodeSelector__Group_0__0__Impl : ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) ) ;
    public final void rule__SourceModelNodeSelector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2647:1: ( ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2648:1: ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2648:1: ( ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2649:1: ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceAssignment_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2650:1: ( rule__SourceModelNodeSelector__ReferenceAssignment_0_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2650:2: rule__SourceModelNodeSelector__ReferenceAssignment_0_0
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__ReferenceAssignment_0_0_in_rule__SourceModelNodeSelector__Group_0__0__Impl5450);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2660:1: rule__SourceModelNodeSelector__Group_0__1 : rule__SourceModelNodeSelector__Group_0__1__Impl ;
    public final void rule__SourceModelNodeSelector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2664:1: ( rule__SourceModelNodeSelector__Group_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2665:2: rule__SourceModelNodeSelector__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0__1__Impl_in_rule__SourceModelNodeSelector__Group_0__15480);
            rule__SourceModelNodeSelector__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2671:1: rule__SourceModelNodeSelector__Group_0__1__Impl : ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? ) ;
    public final void rule__SourceModelNodeSelector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2675:1: ( ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2676:1: ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2676:1: ( ( rule__SourceModelNodeSelector__Group_0_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2677:1: ( rule__SourceModelNodeSelector__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2678:1: ( rule__SourceModelNodeSelector__Group_0_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2678:2: rule__SourceModelNodeSelector__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0_in_rule__SourceModelNodeSelector__Group_0__1__Impl5507);
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


    // $ANTLR start "rule__SourceModelNodeSelector__Group_0_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2692:1: rule__SourceModelNodeSelector__Group_0_1__0 : rule__SourceModelNodeSelector__Group_0_1__0__Impl rule__SourceModelNodeSelector__Group_0_1__1 ;
    public final void rule__SourceModelNodeSelector__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2696:1: ( rule__SourceModelNodeSelector__Group_0_1__0__Impl rule__SourceModelNodeSelector__Group_0_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2697:2: rule__SourceModelNodeSelector__Group_0_1__0__Impl rule__SourceModelNodeSelector__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0__Impl_in_rule__SourceModelNodeSelector__Group_0_1__05542);
            rule__SourceModelNodeSelector__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1_in_rule__SourceModelNodeSelector__Group_0_1__05545);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2704:1: rule__SourceModelNodeSelector__Group_0_1__0__Impl : ( '/' ) ;
    public final void rule__SourceModelNodeSelector__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2708:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2709:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2709:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2710:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getSolidusKeyword_0_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__SourceModelNodeSelector__Group_0_1__0__Impl5573); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getSolidusKeyword_0_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2723:1: rule__SourceModelNodeSelector__Group_0_1__1 : rule__SourceModelNodeSelector__Group_0_1__1__Impl ;
    public final void rule__SourceModelNodeSelector__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2727:1: ( rule__SourceModelNodeSelector__Group_0_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2728:2: rule__SourceModelNodeSelector__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1__Impl_in_rule__SourceModelNodeSelector__Group_0_1__15604);
            rule__SourceModelNodeSelector__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2734:1: rule__SourceModelNodeSelector__Group_0_1__1__Impl : ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_1_1 ) ) ;
    public final void rule__SourceModelNodeSelector__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2738:1: ( ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2739:1: ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2739:1: ( ( rule__SourceModelNodeSelector__PropertyAssignment_0_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2740:1: ( rule__SourceModelNodeSelector__PropertyAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyAssignment_0_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2741:1: ( rule__SourceModelNodeSelector__PropertyAssignment_0_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2741:2: rule__SourceModelNodeSelector__PropertyAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__PropertyAssignment_0_1_1_in_rule__SourceModelNodeSelector__Group_0_1__1__Impl5631);
            rule__SourceModelNodeSelector__PropertyAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyAssignment_0_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__SourceModelNodeSelector__Group_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2755:1: rule__SourceModelNodeSelector__Group_1__0 : rule__SourceModelNodeSelector__Group_1__0__Impl rule__SourceModelNodeSelector__Group_1__1 ;
    public final void rule__SourceModelNodeSelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2759:1: ( rule__SourceModelNodeSelector__Group_1__0__Impl rule__SourceModelNodeSelector__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2760:2: rule__SourceModelNodeSelector__Group_1__0__Impl rule__SourceModelNodeSelector__Group_1__1
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__0__Impl_in_rule__SourceModelNodeSelector__Group_1__05665);
            rule__SourceModelNodeSelector__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__1_in_rule__SourceModelNodeSelector__Group_1__05668);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2767:1: rule__SourceModelNodeSelector__Group_1__0__Impl : ( () ) ;
    public final void rule__SourceModelNodeSelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2771:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2772:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2772:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2773:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getSourceModelNodeSelectorAction_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2774:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2776:1: 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2786:1: rule__SourceModelNodeSelector__Group_1__1 : rule__SourceModelNodeSelector__Group_1__1__Impl ;
    public final void rule__SourceModelNodeSelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2790:1: ( rule__SourceModelNodeSelector__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2791:2: rule__SourceModelNodeSelector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelNodeSelector__Group_1__1__Impl_in_rule__SourceModelNodeSelector__Group_1__15726);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2797:1: rule__SourceModelNodeSelector__Group_1__1__Impl : ( 'null' ) ;
    public final void rule__SourceModelNodeSelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2801:1: ( ( 'null' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2802:1: ( 'null' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2802:1: ( 'null' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2803:1: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getNullKeyword_1_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__SourceModelNodeSelector__Group_1__1__Impl5754); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2820:1: rule__TargetModelNodeType__Group__0 : rule__TargetModelNodeType__Group__0__Impl rule__TargetModelNodeType__Group__1 ;
    public final void rule__TargetModelNodeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2824:1: ( rule__TargetModelNodeType__Group__0__Impl rule__TargetModelNodeType__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2825:2: rule__TargetModelNodeType__Group__0__Impl rule__TargetModelNodeType__Group__1
            {
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__0__Impl_in_rule__TargetModelNodeType__Group__05789);
            rule__TargetModelNodeType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__1_in_rule__TargetModelNodeType__Group__05792);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2832:1: rule__TargetModelNodeType__Group__0__Impl : ( () ) ;
    public final void rule__TargetModelNodeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2836:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2837:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2837:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2838:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getTargetModelNodeTypeAction_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2839:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2841:1: 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2851:1: rule__TargetModelNodeType__Group__1 : rule__TargetModelNodeType__Group__1__Impl rule__TargetModelNodeType__Group__2 ;
    public final void rule__TargetModelNodeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2855:1: ( rule__TargetModelNodeType__Group__1__Impl rule__TargetModelNodeType__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2856:2: rule__TargetModelNodeType__Group__1__Impl rule__TargetModelNodeType__Group__2
            {
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__1__Impl_in_rule__TargetModelNodeType__Group__15850);
            rule__TargetModelNodeType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__2_in_rule__TargetModelNodeType__Group__15853);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2863:1: rule__TargetModelNodeType__Group__1__Impl : ( ( rule__TargetModelNodeType__ReferenceAssignment_1 )? ) ;
    public final void rule__TargetModelNodeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2867:1: ( ( ( rule__TargetModelNodeType__ReferenceAssignment_1 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2868:1: ( ( rule__TargetModelNodeType__ReferenceAssignment_1 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2868:1: ( ( rule__TargetModelNodeType__ReferenceAssignment_1 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2869:1: ( rule__TargetModelNodeType__ReferenceAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2870:1: ( rule__TargetModelNodeType__ReferenceAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2870:2: rule__TargetModelNodeType__ReferenceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TargetModelNodeType__ReferenceAssignment_1_in_rule__TargetModelNodeType__Group__1__Impl5880);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2880:1: rule__TargetModelNodeType__Group__2 : rule__TargetModelNodeType__Group__2__Impl ;
    public final void rule__TargetModelNodeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2884:1: ( rule__TargetModelNodeType__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2885:2: rule__TargetModelNodeType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TargetModelNodeType__Group__2__Impl_in_rule__TargetModelNodeType__Group__25911);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2891:1: rule__TargetModelNodeType__Group__2__Impl : ( ( rule__TargetModelNodeType__MultiplyAssignment_2 )? ) ;
    public final void rule__TargetModelNodeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2895:1: ( ( ( rule__TargetModelNodeType__MultiplyAssignment_2 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2896:1: ( ( rule__TargetModelNodeType__MultiplyAssignment_2 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2896:1: ( ( rule__TargetModelNodeType__MultiplyAssignment_2 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2897:1: ( rule__TargetModelNodeType__MultiplyAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getMultiplyAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2898:1: ( rule__TargetModelNodeType__MultiplyAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2898:2: rule__TargetModelNodeType__MultiplyAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TargetModelNodeType__MultiplyAssignment_2_in_rule__TargetModelNodeType__Group__2__Impl5938);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2914:1: rule__ModelNodeType__Group__0 : rule__ModelNodeType__Group__0__Impl rule__ModelNodeType__Group__1 ;
    public final void rule__ModelNodeType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2918:1: ( rule__ModelNodeType__Group__0__Impl rule__ModelNodeType__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2919:2: rule__ModelNodeType__Group__0__Impl rule__ModelNodeType__Group__1
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__0__Impl_in_rule__ModelNodeType__Group__05975);
            rule__ModelNodeType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelNodeType__Group__1_in_rule__ModelNodeType__Group__05978);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2926:1: rule__ModelNodeType__Group__0__Impl : ( ( rule__ModelNodeType__TargetAssignment_0 ) ) ;
    public final void rule__ModelNodeType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2930:1: ( ( ( rule__ModelNodeType__TargetAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2931:1: ( ( rule__ModelNodeType__TargetAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2931:1: ( ( rule__ModelNodeType__TargetAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2932:1: ( rule__ModelNodeType__TargetAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTargetAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2933:1: ( rule__ModelNodeType__TargetAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2933:2: rule__ModelNodeType__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__ModelNodeType__TargetAssignment_0_in_rule__ModelNodeType__Group__0__Impl6005);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2943:1: rule__ModelNodeType__Group__1 : rule__ModelNodeType__Group__1__Impl rule__ModelNodeType__Group__2 ;
    public final void rule__ModelNodeType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2947:1: ( rule__ModelNodeType__Group__1__Impl rule__ModelNodeType__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2948:2: rule__ModelNodeType__Group__1__Impl rule__ModelNodeType__Group__2
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__1__Impl_in_rule__ModelNodeType__Group__16035);
            rule__ModelNodeType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelNodeType__Group__2_in_rule__ModelNodeType__Group__16038);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2955:1: rule__ModelNodeType__Group__1__Impl : ( '/' ) ;
    public final void rule__ModelNodeType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2959:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2960:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2960:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2961:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getSolidusKeyword_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__ModelNodeType__Group__1__Impl6066); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getSolidusKeyword_1()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2974:1: rule__ModelNodeType__Group__2 : rule__ModelNodeType__Group__2__Impl rule__ModelNodeType__Group__3 ;
    public final void rule__ModelNodeType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2978:1: ( rule__ModelNodeType__Group__2__Impl rule__ModelNodeType__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2979:2: rule__ModelNodeType__Group__2__Impl rule__ModelNodeType__Group__3
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__2__Impl_in_rule__ModelNodeType__Group__26097);
            rule__ModelNodeType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelNodeType__Group__3_in_rule__ModelNodeType__Group__26100);
            rule__ModelNodeType__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2986:1: rule__ModelNodeType__Group__2__Impl : ( ( rule__ModelNodeType__TypeAssignment_2 ) ) ;
    public final void rule__ModelNodeType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2990:1: ( ( ( rule__ModelNodeType__TypeAssignment_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2991:1: ( ( rule__ModelNodeType__TypeAssignment_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2991:1: ( ( rule__ModelNodeType__TypeAssignment_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2992:1: ( rule__ModelNodeType__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTypeAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2993:1: ( rule__ModelNodeType__TypeAssignment_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2993:2: rule__ModelNodeType__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ModelNodeType__TypeAssignment_2_in_rule__ModelNodeType__Group__2__Impl6127);
            rule__ModelNodeType__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ModelNodeType__Group__3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3003:1: rule__ModelNodeType__Group__3 : rule__ModelNodeType__Group__3__Impl ;
    public final void rule__ModelNodeType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3007:1: ( rule__ModelNodeType__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3008:2: rule__ModelNodeType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group__3__Impl_in_rule__ModelNodeType__Group__36157);
            rule__ModelNodeType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group__3"


    // $ANTLR start "rule__ModelNodeType__Group__3__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3014:1: rule__ModelNodeType__Group__3__Impl : ( ( rule__ModelNodeType__Group_3__0 )? ) ;
    public final void rule__ModelNodeType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3018:1: ( ( ( rule__ModelNodeType__Group_3__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3019:1: ( ( rule__ModelNodeType__Group_3__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3019:1: ( ( rule__ModelNodeType__Group_3__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3020:1: ( rule__ModelNodeType__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3021:1: ( rule__ModelNodeType__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3021:2: rule__ModelNodeType__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ModelNodeType__Group_3__0_in_rule__ModelNodeType__Group__3__Impl6184);
                    rule__ModelNodeType__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group__3__Impl"


    // $ANTLR start "rule__ModelNodeType__Group_3__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3039:1: rule__ModelNodeType__Group_3__0 : rule__ModelNodeType__Group_3__0__Impl rule__ModelNodeType__Group_3__1 ;
    public final void rule__ModelNodeType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3043:1: ( rule__ModelNodeType__Group_3__0__Impl rule__ModelNodeType__Group_3__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3044:2: rule__ModelNodeType__Group_3__0__Impl rule__ModelNodeType__Group_3__1
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group_3__0__Impl_in_rule__ModelNodeType__Group_3__06223);
            rule__ModelNodeType__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelNodeType__Group_3__1_in_rule__ModelNodeType__Group_3__06226);
            rule__ModelNodeType__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group_3__0"


    // $ANTLR start "rule__ModelNodeType__Group_3__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3051:1: rule__ModelNodeType__Group_3__0__Impl : ( '/' ) ;
    public final void rule__ModelNodeType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3055:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3056:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3056:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3057:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getSolidusKeyword_3_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__ModelNodeType__Group_3__0__Impl6254); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getSolidusKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group_3__0__Impl"


    // $ANTLR start "rule__ModelNodeType__Group_3__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3070:1: rule__ModelNodeType__Group_3__1 : rule__ModelNodeType__Group_3__1__Impl ;
    public final void rule__ModelNodeType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3074:1: ( rule__ModelNodeType__Group_3__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3075:2: rule__ModelNodeType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ModelNodeType__Group_3__1__Impl_in_rule__ModelNodeType__Group_3__16285);
            rule__ModelNodeType__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group_3__1"


    // $ANTLR start "rule__ModelNodeType__Group_3__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3081:1: rule__ModelNodeType__Group_3__1__Impl : ( ( rule__ModelNodeType__PropertyAssignment_3_1 ) ) ;
    public final void rule__ModelNodeType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3085:1: ( ( ( rule__ModelNodeType__PropertyAssignment_3_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3086:1: ( ( rule__ModelNodeType__PropertyAssignment_3_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3086:1: ( ( rule__ModelNodeType__PropertyAssignment_3_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3087:1: ( rule__ModelNodeType__PropertyAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getPropertyAssignment_3_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3088:1: ( rule__ModelNodeType__PropertyAssignment_3_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3088:2: rule__ModelNodeType__PropertyAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ModelNodeType__PropertyAssignment_3_1_in_rule__ModelNodeType__Group_3__1__Impl6312);
            rule__ModelNodeType__PropertyAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getPropertyAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__Group_3__1__Impl"


    // $ANTLR start "rule__NodeProperty__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3102:1: rule__NodeProperty__Group__0 : rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1 ;
    public final void rule__NodeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3106:1: ( rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3107:2: rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__0__Impl_in_rule__NodeProperty__Group__06346);
            rule__NodeProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group__1_in_rule__NodeProperty__Group__06349);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3114:1: rule__NodeProperty__Group__0__Impl : ( ( rule__NodeProperty__PropertyAssignment_0 ) ) ;
    public final void rule__NodeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3118:1: ( ( ( rule__NodeProperty__PropertyAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3119:1: ( ( rule__NodeProperty__PropertyAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3119:1: ( ( rule__NodeProperty__PropertyAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3120:1: ( rule__NodeProperty__PropertyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3121:1: ( rule__NodeProperty__PropertyAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3121:2: rule__NodeProperty__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__NodeProperty__PropertyAssignment_0_in_rule__NodeProperty__Group__0__Impl6376);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3131:1: rule__NodeProperty__Group__1 : rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2 ;
    public final void rule__NodeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3135:1: ( rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3136:2: rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__1__Impl_in_rule__NodeProperty__Group__16406);
            rule__NodeProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group__2_in_rule__NodeProperty__Group__16409);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3143:1: rule__NodeProperty__Group__1__Impl : ( ( rule__NodeProperty__Group_1__0 )? ) ;
    public final void rule__NodeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3147:1: ( ( ( rule__NodeProperty__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3148:1: ( ( rule__NodeProperty__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3148:1: ( ( rule__NodeProperty__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3149:1: ( rule__NodeProperty__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3150:1: ( rule__NodeProperty__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3150:2: rule__NodeProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NodeProperty__Group_1__0_in_rule__NodeProperty__Group__1__Impl6436);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3160:1: rule__NodeProperty__Group__2 : rule__NodeProperty__Group__2__Impl ;
    public final void rule__NodeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3164:1: ( rule__NodeProperty__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3165:2: rule__NodeProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__2__Impl_in_rule__NodeProperty__Group__26467);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3171:1: rule__NodeProperty__Group__2__Impl : ( ( rule__NodeProperty__Group_2__0 )? ) ;
    public final void rule__NodeProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3175:1: ( ( ( rule__NodeProperty__Group_2__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3176:1: ( ( rule__NodeProperty__Group_2__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3176:1: ( ( rule__NodeProperty__Group_2__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3177:1: ( rule__NodeProperty__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3178:1: ( rule__NodeProperty__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3178:2: rule__NodeProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NodeProperty__Group_2__0_in_rule__NodeProperty__Group__2__Impl6494);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3194:1: rule__NodeProperty__Group_1__0 : rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1 ;
    public final void rule__NodeProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3198:1: ( rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3199:2: rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__0__Impl_in_rule__NodeProperty__Group_1__06531);
            rule__NodeProperty__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__1_in_rule__NodeProperty__Group_1__06534);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3206:1: rule__NodeProperty__Group_1__0__Impl : ( '[' ) ;
    public final void rule__NodeProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3210:1: ( ( '[' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3211:1: ( '[' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3211:1: ( '[' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3212:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__NodeProperty__Group_1__0__Impl6562); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3225:1: rule__NodeProperty__Group_1__1 : rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2 ;
    public final void rule__NodeProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3229:1: ( rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3230:2: rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__1__Impl_in_rule__NodeProperty__Group_1__16593);
            rule__NodeProperty__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__2_in_rule__NodeProperty__Group_1__16596);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3237:1: rule__NodeProperty__Group_1__1__Impl : ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) ) ;
    public final void rule__NodeProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3241:1: ( ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3242:1: ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3242:1: ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3243:1: ( rule__NodeProperty__ConstraintAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getConstraintAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3244:1: ( rule__NodeProperty__ConstraintAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3244:2: rule__NodeProperty__ConstraintAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NodeProperty__ConstraintAssignment_1_1_in_rule__NodeProperty__Group_1__1__Impl6623);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3254:1: rule__NodeProperty__Group_1__2 : rule__NodeProperty__Group_1__2__Impl ;
    public final void rule__NodeProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3258:1: ( rule__NodeProperty__Group_1__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3259:2: rule__NodeProperty__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__2__Impl_in_rule__NodeProperty__Group_1__26653);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3265:1: rule__NodeProperty__Group_1__2__Impl : ( ']' ) ;
    public final void rule__NodeProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3269:1: ( ( ']' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3270:1: ( ']' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3270:1: ( ']' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3271:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__NodeProperty__Group_1__2__Impl6681); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3290:1: rule__NodeProperty__Group_2__0 : rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1 ;
    public final void rule__NodeProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3294:1: ( rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3295:2: rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__0__Impl_in_rule__NodeProperty__Group_2__06718);
            rule__NodeProperty__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__1_in_rule__NodeProperty__Group_2__06721);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3302:1: rule__NodeProperty__Group_2__0__Impl : ( '/' ) ;
    public final void rule__NodeProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3306:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3307:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3307:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3308:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSolidusKeyword_2_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__NodeProperty__Group_2__0__Impl6749); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3321:1: rule__NodeProperty__Group_2__1 : rule__NodeProperty__Group_2__1__Impl ;
    public final void rule__NodeProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3325:1: ( rule__NodeProperty__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3326:2: rule__NodeProperty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__1__Impl_in_rule__NodeProperty__Group_2__16780);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3332:1: rule__NodeProperty__Group_2__1__Impl : ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) ) ;
    public final void rule__NodeProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3336:1: ( ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3337:1: ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3337:1: ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3338:1: ( rule__NodeProperty__SubPropertyAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSubPropertyAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3339:1: ( rule__NodeProperty__SubPropertyAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3339:2: rule__NodeProperty__SubPropertyAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NodeProperty__SubPropertyAssignment_2_1_in_rule__NodeProperty__Group_2__1__Impl6807);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3353:1: rule__ConstraintExpression__Group__0 : rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 ;
    public final void rule__ConstraintExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3357:1: ( rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3358:2: rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__06841);
            rule__ConstraintExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__06844);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3365:1: rule__ConstraintExpression__Group__0__Impl : ( ruleCompareExpression ) ;
    public final void rule__ConstraintExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3369:1: ( ( ruleCompareExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3370:1: ( ruleCompareExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3370:1: ( ruleCompareExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3371:1: ruleCompareExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getCompareExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_rule__ConstraintExpression__Group__0__Impl6871);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3382:1: rule__ConstraintExpression__Group__1 : rule__ConstraintExpression__Group__1__Impl ;
    public final void rule__ConstraintExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3386:1: ( rule__ConstraintExpression__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3387:2: rule__ConstraintExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__16900);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3393:1: rule__ConstraintExpression__Group__1__Impl : ( ( rule__ConstraintExpression__Group_1__0 )? ) ;
    public final void rule__ConstraintExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3397:1: ( ( ( rule__ConstraintExpression__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3398:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3398:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3399:1: ( rule__ConstraintExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3400:1: ( rule__ConstraintExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=39 && LA26_0<=40)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3400:2: rule__ConstraintExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl6927);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3414:1: rule__ConstraintExpression__Group_1__0 : rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 ;
    public final void rule__ConstraintExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3418:1: ( rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3419:2: rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__06962);
            rule__ConstraintExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__06965);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3426:1: rule__ConstraintExpression__Group_1__0__Impl : ( ( rule__ConstraintExpression__Group_1_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3430:1: ( ( ( rule__ConstraintExpression__Group_1_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3431:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3431:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3432:1: ( rule__ConstraintExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3433:1: ( rule__ConstraintExpression__Group_1_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3433:2: rule__ConstraintExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl6992);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3443:1: rule__ConstraintExpression__Group_1__1 : rule__ConstraintExpression__Group_1__1__Impl ;
    public final void rule__ConstraintExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3447:1: ( rule__ConstraintExpression__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3448:2: rule__ConstraintExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__17022);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3454:1: rule__ConstraintExpression__Group_1__1__Impl : ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3458:1: ( ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3459:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3459:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3460:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3461:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3461:2: rule__ConstraintExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl7049);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3475:1: rule__ConstraintExpression__Group_1_0__0 : rule__ConstraintExpression__Group_1_0__0__Impl ;
    public final void rule__ConstraintExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3479:1: ( rule__ConstraintExpression__Group_1_0__0__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3480:2: rule__ConstraintExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__07083);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3486:1: rule__ConstraintExpression__Group_1_0__0__Impl : ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3490:1: ( ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3491:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3491:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3492:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3493:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3493:2: rule__ConstraintExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl7110);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3505:1: rule__ConstraintExpression__Group_1_0_0__0 : rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 ;
    public final void rule__ConstraintExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3509:1: ( rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3510:2: rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__07142);
            rule__ConstraintExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__07145);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3517:1: rule__ConstraintExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3521:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3522:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3522:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3523:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3524:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3526:1: 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3536:1: rule__ConstraintExpression__Group_1_0_0__1 : rule__ConstraintExpression__Group_1_0_0__1__Impl ;
    public final void rule__ConstraintExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3540:1: ( rule__ConstraintExpression__Group_1_0_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3541:2: rule__ConstraintExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__17203);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3547:1: rule__ConstraintExpression__Group_1_0_0__1__Impl : ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3551:1: ( ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3552:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3552:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3553:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3554:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3554:2: rule__ConstraintExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl7230);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3568:1: rule__CompareExpression__Group__0 : rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 ;
    public final void rule__CompareExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3572:1: ( rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3573:2: rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__07264);
            rule__CompareExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__07267);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3580:1: rule__CompareExpression__Group__0__Impl : ( ruleBasicConstraint ) ;
    public final void rule__CompareExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3584:1: ( ( ruleBasicConstraint ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3585:1: ( ruleBasicConstraint )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3585:1: ( ruleBasicConstraint )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3586:1: ruleBasicConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getBasicConstraintParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__Group__0__Impl7294);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3597:1: rule__CompareExpression__Group__1 : rule__CompareExpression__Group__1__Impl ;
    public final void rule__CompareExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3601:1: ( rule__CompareExpression__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3602:2: rule__CompareExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__17323);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3608:1: rule__CompareExpression__Group__1__Impl : ( ( rule__CompareExpression__Group_1__0 )? ) ;
    public final void rule__CompareExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3612:1: ( ( ( rule__CompareExpression__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3613:1: ( ( rule__CompareExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3613:1: ( ( rule__CompareExpression__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3614:1: ( rule__CompareExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3615:1: ( rule__CompareExpression__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=32 && LA27_0<=33)||(LA27_0>=41 && LA27_0<=45)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3615:2: rule__CompareExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl7350);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3629:1: rule__CompareExpression__Group_1__0 : rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 ;
    public final void rule__CompareExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3633:1: ( rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3634:2: rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__07385);
            rule__CompareExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__07388);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3641:1: rule__CompareExpression__Group_1__0__Impl : ( ( rule__CompareExpression__Group_1_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3645:1: ( ( ( rule__CompareExpression__Group_1_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3646:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3646:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3647:1: ( rule__CompareExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3648:1: ( rule__CompareExpression__Group_1_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3648:2: rule__CompareExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl7415);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3658:1: rule__CompareExpression__Group_1__1 : rule__CompareExpression__Group_1__1__Impl ;
    public final void rule__CompareExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3662:1: ( rule__CompareExpression__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3663:2: rule__CompareExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__17445);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3669:1: rule__CompareExpression__Group_1__1__Impl : ( ( rule__CompareExpression__RightAssignment_1_1 ) ) ;
    public final void rule__CompareExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3673:1: ( ( ( rule__CompareExpression__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3674:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3674:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3675:1: ( rule__CompareExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3676:1: ( rule__CompareExpression__RightAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3676:2: rule__CompareExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl7472);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3690:1: rule__CompareExpression__Group_1_0__0 : rule__CompareExpression__Group_1_0__0__Impl ;
    public final void rule__CompareExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3694:1: ( rule__CompareExpression__Group_1_0__0__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3695:2: rule__CompareExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__07506);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3701:1: rule__CompareExpression__Group_1_0__0__Impl : ( ( rule__CompareExpression__Group_1_0_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3705:1: ( ( ( rule__CompareExpression__Group_1_0_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3706:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3706:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3707:1: ( rule__CompareExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3708:1: ( rule__CompareExpression__Group_1_0_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3708:2: rule__CompareExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl7533);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3720:1: rule__CompareExpression__Group_1_0_0__0 : rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 ;
    public final void rule__CompareExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3724:1: ( rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3725:2: rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__07565);
            rule__CompareExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__07568);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3732:1: rule__CompareExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__CompareExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3736:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3737:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3737:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3738:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3739:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3741:1: 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3751:1: rule__CompareExpression__Group_1_0_0__1 : rule__CompareExpression__Group_1_0_0__1__Impl ;
    public final void rule__CompareExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3755:1: ( rule__CompareExpression__Group_1_0_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3756:2: rule__CompareExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__17626);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3762:1: rule__CompareExpression__Group_1_0_0__1__Impl : ( ( rule__CompareExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__CompareExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3766:1: ( ( ( rule__CompareExpression__OperatorAssignment_1_0_0_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3767:1: ( ( rule__CompareExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3767:1: ( ( rule__CompareExpression__OperatorAssignment_1_0_0_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3768:1: ( rule__CompareExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3769:1: ( rule__CompareExpression__OperatorAssignment_1_0_0_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3769:2: rule__CompareExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__OperatorAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl7653);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3783:1: rule__ParenthesisConstraint__Group__0 : rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 ;
    public final void rule__ParenthesisConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3787:1: ( rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3788:2: rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__07687);
            rule__ParenthesisConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__07690);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3795:1: rule__ParenthesisConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3799:1: ( ( '(' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3800:1: ( '(' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3800:1: ( '(' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3801:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ParenthesisConstraint__Group__0__Impl7718); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3814:1: rule__ParenthesisConstraint__Group__1 : rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 ;
    public final void rule__ParenthesisConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3818:1: ( rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3819:2: rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__17749);
            rule__ParenthesisConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__17752);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3826:1: rule__ParenthesisConstraint__Group__1__Impl : ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__ParenthesisConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3830:1: ( ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3831:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3831:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3832:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3833:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3833:2: rule__ParenthesisConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl7779);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3843:1: rule__ParenthesisConstraint__Group__2 : rule__ParenthesisConstraint__Group__2__Impl ;
    public final void rule__ParenthesisConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3847:1: ( rule__ParenthesisConstraint__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3848:2: rule__ParenthesisConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__27809);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3854:1: rule__ParenthesisConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3858:1: ( ( ')' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3859:1: ( ')' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3859:1: ( ')' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3860:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__ParenthesisConstraint__Group__2__Impl7837); if (state.failed) return ;
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


    // $ANTLR start "rule__TraceModel__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3879:1: rule__TraceModel__Group__0 : rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1 ;
    public final void rule__TraceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3883:1: ( rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3884:2: rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__0__Impl_in_rule__TraceModel__Group__07874);
            rule__TraceModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__1_in_rule__TraceModel__Group__07877);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3891:1: rule__TraceModel__Group__0__Impl : ( ( rule__TraceModel__NameAssignment_0 ) ) ;
    public final void rule__TraceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3895:1: ( ( ( rule__TraceModel__NameAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3896:1: ( ( rule__TraceModel__NameAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3896:1: ( ( rule__TraceModel__NameAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3897:1: ( rule__TraceModel__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNameAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3898:1: ( rule__TraceModel__NameAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3898:2: rule__TraceModel__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TraceModel__NameAssignment_0_in_rule__TraceModel__Group__0__Impl7904);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3908:1: rule__TraceModel__Group__1 : rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2 ;
    public final void rule__TraceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3912:1: ( rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3913:2: rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__1__Impl_in_rule__TraceModel__Group__17934);
            rule__TraceModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__2_in_rule__TraceModel__Group__17937);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3920:1: rule__TraceModel__Group__1__Impl : ( '<' ) ;
    public final void rule__TraceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3924:1: ( ( '<' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3925:1: ( '<' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3925:1: ( '<' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3926:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getLessThanSignKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__TraceModel__Group__1__Impl7965); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3939:1: rule__TraceModel__Group__2 : rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3 ;
    public final void rule__TraceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3943:1: ( rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3944:2: rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__2__Impl_in_rule__TraceModel__Group__27996);
            rule__TraceModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__3_in_rule__TraceModel__Group__27999);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3951:1: rule__TraceModel__Group__2__Impl : ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) ) ;
    public final void rule__TraceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3955:1: ( ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3956:1: ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3956:1: ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3957:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3957:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3958:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3959:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3959:2: rule__TraceModel__NodeSetRelationsAssignment_2
            {
            pushFollow(FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl8028);
            rule__TraceModel__NodeSetRelationsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }

            }

            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3962:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3963:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3964:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==30) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3964:2: rule__TraceModel__NodeSetRelationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl8040);
            	    rule__TraceModel__NodeSetRelationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3975:1: rule__TraceModel__Group__3 : rule__TraceModel__Group__3__Impl ;
    public final void rule__TraceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3979:1: ( rule__TraceModel__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3980:2: rule__TraceModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__3__Impl_in_rule__TraceModel__Group__38073);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3986:1: rule__TraceModel__Group__3__Impl : ( '>' ) ;
    public final void rule__TraceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3990:1: ( ( '>' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3991:1: ( '>' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3991:1: ( '>' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3992:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,33,FOLLOW_33_in_rule__TraceModel__Group__3__Impl8101); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4013:1: rule__NodeSetRelation__Group__0 : rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1 ;
    public final void rule__NodeSetRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4017:1: ( rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4018:2: rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__0__Impl_in_rule__NodeSetRelation__Group__08140);
            rule__NodeSetRelation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__1_in_rule__NodeSetRelation__Group__08143);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4025:1: rule__NodeSetRelation__Group__0__Impl : ( '(' ) ;
    public final void rule__NodeSetRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4029:1: ( ( '(' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4030:1: ( '(' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4030:1: ( '(' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4031:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__NodeSetRelation__Group__0__Impl8171); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4044:1: rule__NodeSetRelation__Group__1 : rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2 ;
    public final void rule__NodeSetRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4048:1: ( rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4049:2: rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__1__Impl_in_rule__NodeSetRelation__Group__18202);
            rule__NodeSetRelation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__2_in_rule__NodeSetRelation__Group__18205);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4056:1: rule__NodeSetRelation__Group__1__Impl : ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) ) ;
    public final void rule__NodeSetRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4060:1: ( ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4061:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4061:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4062:1: ( rule__NodeSetRelation__SourceNodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4063:1: ( rule__NodeSetRelation__SourceNodesAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4063:2: rule__NodeSetRelation__SourceNodesAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_1_in_rule__NodeSetRelation__Group__1__Impl8232);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4073:1: rule__NodeSetRelation__Group__2 : rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3 ;
    public final void rule__NodeSetRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4077:1: ( rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4078:2: rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__2__Impl_in_rule__NodeSetRelation__Group__28262);
            rule__NodeSetRelation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__3_in_rule__NodeSetRelation__Group__28265);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4085:1: rule__NodeSetRelation__Group__2__Impl : ( ( rule__NodeSetRelation__Group_2__0 )* ) ;
    public final void rule__NodeSetRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4089:1: ( ( ( rule__NodeSetRelation__Group_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4090:1: ( ( rule__NodeSetRelation__Group_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4090:1: ( ( rule__NodeSetRelation__Group_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4091:1: ( rule__NodeSetRelation__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4092:1: ( rule__NodeSetRelation__Group_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==19) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4092:2: rule__NodeSetRelation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__0_in_rule__NodeSetRelation__Group__2__Impl8292);
            	    rule__NodeSetRelation__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4102:1: rule__NodeSetRelation__Group__3 : rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4 ;
    public final void rule__NodeSetRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4106:1: ( rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4107:2: rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__3__Impl_in_rule__NodeSetRelation__Group__38323);
            rule__NodeSetRelation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__4_in_rule__NodeSetRelation__Group__38326);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4114:1: rule__NodeSetRelation__Group__3__Impl : ( ':' ) ;
    public final void rule__NodeSetRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4118:1: ( ( ':' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4119:1: ( ':' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4119:1: ( ':' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4120:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getColonKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__NodeSetRelation__Group__3__Impl8354); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4133:1: rule__NodeSetRelation__Group__4 : rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5 ;
    public final void rule__NodeSetRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4137:1: ( rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4138:2: rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__4__Impl_in_rule__NodeSetRelation__Group__48385);
            rule__NodeSetRelation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__5_in_rule__NodeSetRelation__Group__48388);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4145:1: rule__NodeSetRelation__Group__4__Impl : ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) ) ;
    public final void rule__NodeSetRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4149:1: ( ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4150:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4150:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4151:1: ( rule__NodeSetRelation__TargetNodesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4152:1: ( rule__NodeSetRelation__TargetNodesAssignment_4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4152:2: rule__NodeSetRelation__TargetNodesAssignment_4
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_4_in_rule__NodeSetRelation__Group__4__Impl8415);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4162:1: rule__NodeSetRelation__Group__5 : rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6 ;
    public final void rule__NodeSetRelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4166:1: ( rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4167:2: rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__5__Impl_in_rule__NodeSetRelation__Group__58445);
            rule__NodeSetRelation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__6_in_rule__NodeSetRelation__Group__58448);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4174:1: rule__NodeSetRelation__Group__5__Impl : ( ( rule__NodeSetRelation__Group_5__0 )* ) ;
    public final void rule__NodeSetRelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4178:1: ( ( ( rule__NodeSetRelation__Group_5__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4179:1: ( ( rule__NodeSetRelation__Group_5__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4179:1: ( ( rule__NodeSetRelation__Group_5__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4180:1: ( rule__NodeSetRelation__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4181:1: ( rule__NodeSetRelation__Group_5__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==19) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4181:2: rule__NodeSetRelation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__0_in_rule__NodeSetRelation__Group__5__Impl8475);
            	    rule__NodeSetRelation__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4191:1: rule__NodeSetRelation__Group__6 : rule__NodeSetRelation__Group__6__Impl ;
    public final void rule__NodeSetRelation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4195:1: ( rule__NodeSetRelation__Group__6__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4196:2: rule__NodeSetRelation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__6__Impl_in_rule__NodeSetRelation__Group__68506);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4202:1: rule__NodeSetRelation__Group__6__Impl : ( ')' ) ;
    public final void rule__NodeSetRelation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4206:1: ( ( ')' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4207:1: ( ')' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4207:1: ( ')' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4208:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,31,FOLLOW_31_in_rule__NodeSetRelation__Group__6__Impl8534); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4235:1: rule__NodeSetRelation__Group_2__0 : rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1 ;
    public final void rule__NodeSetRelation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4239:1: ( rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4240:2: rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__0__Impl_in_rule__NodeSetRelation__Group_2__08579);
            rule__NodeSetRelation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__1_in_rule__NodeSetRelation__Group_2__08582);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4247:1: rule__NodeSetRelation__Group_2__0__Impl : ( ',' ) ;
    public final void rule__NodeSetRelation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4251:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4252:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4252:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4253:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getCommaKeyword_2_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__NodeSetRelation__Group_2__0__Impl8610); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4266:1: rule__NodeSetRelation__Group_2__1 : rule__NodeSetRelation__Group_2__1__Impl ;
    public final void rule__NodeSetRelation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4270:1: ( rule__NodeSetRelation__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4271:2: rule__NodeSetRelation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__1__Impl_in_rule__NodeSetRelation__Group_2__18641);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4277:1: rule__NodeSetRelation__Group_2__1__Impl : ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) ) ;
    public final void rule__NodeSetRelation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4281:1: ( ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4282:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4282:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4283:1: ( rule__NodeSetRelation__SourceNodesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4284:1: ( rule__NodeSetRelation__SourceNodesAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4284:2: rule__NodeSetRelation__SourceNodesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_2_1_in_rule__NodeSetRelation__Group_2__1__Impl8668);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4298:1: rule__NodeSetRelation__Group_5__0 : rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1 ;
    public final void rule__NodeSetRelation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4302:1: ( rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4303:2: rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__0__Impl_in_rule__NodeSetRelation__Group_5__08702);
            rule__NodeSetRelation__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__1_in_rule__NodeSetRelation__Group_5__08705);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4310:1: rule__NodeSetRelation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__NodeSetRelation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4314:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4315:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4315:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4316:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getCommaKeyword_5_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__NodeSetRelation__Group_5__0__Impl8733); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4329:1: rule__NodeSetRelation__Group_5__1 : rule__NodeSetRelation__Group_5__1__Impl ;
    public final void rule__NodeSetRelation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4333:1: ( rule__NodeSetRelation__Group_5__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4334:2: rule__NodeSetRelation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__1__Impl_in_rule__NodeSetRelation__Group_5__18764);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4340:1: rule__NodeSetRelation__Group_5__1__Impl : ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) ) ;
    public final void rule__NodeSetRelation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4344:1: ( ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4345:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4345:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4346:1: ( rule__NodeSetRelation__TargetNodesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_5_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4347:1: ( rule__NodeSetRelation__TargetNodesAssignment_5_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4347:2: rule__NodeSetRelation__TargetNodesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_5_1_in_rule__NodeSetRelation__Group_5__1__Impl8791);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4361:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4365:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4366:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__08825);
            rule__ArrayLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__08828);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4373:1: rule__ArrayLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4377:1: ( ( '{' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4378:1: ( '{' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4378:1: ( '{' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4379:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__ArrayLiteral__Group__0__Impl8856); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4392:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4396:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4397:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__18887);
            rule__ArrayLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__18890);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4404:1: rule__ArrayLiteral__Group__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4408:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4409:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4409:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4410:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4411:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4411:2: rule__ArrayLiteral__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl8917);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4421:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4425:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4426:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__28947);
            rule__ArrayLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__28950);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4433:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__Group_2__0 )* ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4437:1: ( ( ( rule__ArrayLiteral__Group_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4438:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4438:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4439:1: ( rule__ArrayLiteral__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4440:1: ( rule__ArrayLiteral__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==19) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4440:2: rule__ArrayLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl8977);
            	    rule__ArrayLiteral__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4450:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4454:1: ( rule__ArrayLiteral__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4455:2: rule__ArrayLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__39008);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4461:1: rule__ArrayLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4465:1: ( ( '}' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4466:1: ( '}' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4466:1: ( '}' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4467:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,35,FOLLOW_35_in_rule__ArrayLiteral__Group__3__Impl9036); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4488:1: rule__ArrayLiteral__Group_2__0 : rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 ;
    public final void rule__ArrayLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4492:1: ( rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4493:2: rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__09075);
            rule__ArrayLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__09078);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4500:1: rule__ArrayLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4504:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4505:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4505:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4506:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__ArrayLiteral__Group_2__0__Impl9106); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4519:1: rule__ArrayLiteral__Group_2__1 : rule__ArrayLiteral__Group_2__1__Impl ;
    public final void rule__ArrayLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4523:1: ( rule__ArrayLiteral__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4524:2: rule__ArrayLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__19137);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4530:1: rule__ArrayLiteral__Group_2__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) ;
    public final void rule__ArrayLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4534:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4535:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4535:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4536:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4537:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4537:2: rule__ArrayLiteral__LiteralsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl9164);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4551:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4555:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4556:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__09198);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__09201);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4563:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4567:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4568:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4568:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4569:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl9228); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4580:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4584:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4585:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19257);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4591:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4595:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4596:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4596:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4597:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4598:1: ( rule__QualifiedName__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36) ) {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==RULE_ID) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4598:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9284);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4612:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4616:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4617:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09319);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09322);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4624:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4628:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4629:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4629:1: ( ( '.' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4630:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4631:1: ( '.' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4632:2: '.'
            {
            match(input,36,FOLLOW_36_in_rule__QualifiedName__Group_1__0__Impl9351); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4643:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4647:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4648:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19383);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4654:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4658:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4659:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4659:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4660:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9410); if (state.failed) return ;
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


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4675:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4679:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4680:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__09443);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__09446);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4687:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4691:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4692:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4692:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4693:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl9473);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4704:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4708:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4709:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__19502);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4715:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4719:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4720:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4720:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4721:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4722:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4722:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl9529);
                    rule__QualifiedNameWithWildcard__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4736:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4740:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4741:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__09564);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__09567);
            rule__QualifiedNameWithWildcard__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4748:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4752:1: ( ( '.' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4753:1: ( '.' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4753:1: ( '.' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4754:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl9595); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4767:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4771:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4772:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__19626);
            rule__QualifiedNameWithWildcard__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4778:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4782:1: ( ( '*' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4783:1: ( '*' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4783:1: ( '*' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4784:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl9654); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group_1__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4802:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4806:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4807:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4807:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4808:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_19694);
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


    // $ANTLR start "rule__Model__ImportsAssignment_3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4817:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4821:1: ( ( ruleImport ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4822:1: ( ruleImport )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4822:1: ( ruleImport )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4823:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_39725);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_3"


    // $ANTLR start "rule__Model__RegisteredPackagesAssignment_4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4832:1: rule__Model__RegisteredPackagesAssignment_4 : ( ruleRegisteredPackage ) ;
    public final void rule__Model__RegisteredPackagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4836:1: ( ( ruleRegisteredPackage ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4837:1: ( ruleRegisteredPackage )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4837:1: ( ruleRegisteredPackage )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4838:1: ruleRegisteredPackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRegisteredPackagesRegisteredPackageParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleRegisteredPackage_in_rule__Model__RegisteredPackagesAssignment_49756);
            ruleRegisteredPackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRegisteredPackagesRegisteredPackageParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RegisteredPackagesAssignment_4"


    // $ANTLR start "rule__Model__ConnectionsAssignment_5_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4847:1: rule__Model__ConnectionsAssignment_5_0 : ( ruleConnection ) ;
    public final void rule__Model__ConnectionsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4851:1: ( ( ruleConnection ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4852:1: ( ruleConnection )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4852:1: ( ruleConnection )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4853:1: ruleConnection
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getConnectionsConnectionParserRuleCall_5_0_0()); 
            }
            pushFollow(FOLLOW_ruleConnection_in_rule__Model__ConnectionsAssignment_5_09787);
            ruleConnection();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getConnectionsConnectionParserRuleCall_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ConnectionsAssignment_5_0"


    // $ANTLR start "rule__Model__MetamodelsAssignment_5_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4862:1: rule__Model__MetamodelsAssignment_5_1 : ( ruleMetamodelSequence ) ;
    public final void rule__Model__MetamodelsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4866:1: ( ( ruleMetamodelSequence ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4867:1: ( ruleMetamodelSequence )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4867:1: ( ruleMetamodelSequence )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4868:1: ruleMetamodelSequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMetamodelsMetamodelSequenceParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodelSequence_in_rule__Model__MetamodelsAssignment_5_19818);
            ruleMetamodelSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getMetamodelsMetamodelSequenceParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MetamodelsAssignment_5_1"


    // $ANTLR start "rule__WeaverImport__ImportedNamespaceAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4877:1: rule__WeaverImport__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__WeaverImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4881:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4882:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4882:1: ( ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4883:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__WeaverImport__ImportedNamespaceAssignment_19849);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WeaverImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__GeneratorImport__ImportedNamespaceAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4892:1: rule__GeneratorImport__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__GeneratorImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4896:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4897:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4897:1: ( ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4898:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__GeneratorImport__ImportedNamespaceAssignment_19880);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratorImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__MetamodelSequence__TypeAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4907:1: rule__MetamodelSequence__TypeAssignment_1 : ( ruleModelNodeType ) ;
    public final void rule__MetamodelSequence__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4911:1: ( ( ruleModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4912:1: ( ruleModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4912:1: ( ruleModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4913:1: ruleModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getTypeModelNodeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleModelNodeType_in_rule__MetamodelSequence__TypeAssignment_19911);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4922:1: rule__MetamodelSequence__MetamodelsAssignment_2 : ( ruleMetamodel ) ;
    public final void rule__MetamodelSequence__MetamodelsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4926:1: ( ( ruleMetamodel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4927:1: ( ruleMetamodel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4927:1: ( ruleMetamodel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4928:1: ruleMetamodel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_29942);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4937:1: rule__MetamodelSequence__MetamodelsAssignment_3_1 : ( ruleMetamodel ) ;
    public final void rule__MetamodelSequence__MetamodelsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4941:1: ( ( ruleMetamodel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4942:1: ( ruleMetamodel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4942:1: ( ruleMetamodel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4943:1: ruleMetamodel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelSequenceAccess().getMetamodelsMetamodelParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_3_19973);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4952:1: rule__Metamodel__NameAssignment : ( RULE_ID ) ;
    public final void rule__Metamodel__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4956:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4957:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4957:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4958:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment10004); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4967:1: rule__RegisteredPackage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RegisteredPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4971:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4972:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4972:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4973:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_110035); if (state.failed) return ;
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


    // $ANTLR start "rule__RegisteredPackage__ModelPackageAssignment_2_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4982:1: rule__RegisteredPackage__ModelPackageAssignment_2_0 : ( ( RULE_STRING ) ) ;
    public final void rule__RegisteredPackage__ModelPackageAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4986:1: ( ( ( RULE_STRING ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4987:1: ( ( RULE_STRING ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4987:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4988:1: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getModelPackageEPackageCrossReference_2_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4989:1: ( RULE_STRING )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4990:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getModelPackageEPackageSTRINGTerminalRuleCall_2_0_0_1()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RegisteredPackage__ModelPackageAssignment_2_010070); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getModelPackageEPackageSTRINGTerminalRuleCall_2_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredPackageAccess().getModelPackageEPackageCrossReference_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredPackage__ModelPackageAssignment_2_0"


    // $ANTLR start "rule__RegisteredPackage__IsTextAssignment_2_1_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5001:1: rule__RegisteredPackage__IsTextAssignment_2_1_0 : ( ( 'text' ) ) ;
    public final void rule__RegisteredPackage__IsTextAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5005:1: ( ( ( 'text' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5006:1: ( ( 'text' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5006:1: ( ( 'text' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5007:1: ( 'text' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getIsTextTextKeyword_2_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5008:1: ( 'text' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5009:1: 'text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getIsTextTextKeyword_2_1_0_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__RegisteredPackage__IsTextAssignment_2_1_010110); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5024:1: rule__RegisteredPackage__ExtensionAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__RegisteredPackage__ExtensionAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5028:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5029:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5029:1: ( RULE_STRING )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5030:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredPackageAccess().getExtensionSTRINGTerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RegisteredPackage__ExtensionAssignment_2_1_110149); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5039:1: rule__Weaver__WeaverAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Weaver__WeaverAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5043:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5044:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5044:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5045:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getWeaverWeaverImportCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5046:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5047:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getWeaverWeaverImportIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Weaver__WeaverAssignment_110184); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getWeaverWeaverImportIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getWeaverWeaverImportCrossReference_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Weaver__SourceModelAssignment_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5058:1: rule__Weaver__SourceModelAssignment_2 : ( ruleSourceModelNodeSelector ) ;
    public final void rule__Weaver__SourceModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5062:1: ( ( ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5063:1: ( ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5063:1: ( ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5064:1: ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_rule__Weaver__SourceModelAssignment_210219);
            ruleSourceModelNodeSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weaver__SourceModelAssignment_2"


    // $ANTLR start "rule__Weaver__AspectModelAssignment_3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5073:1: rule__Weaver__AspectModelAssignment_3 : ( ruleAspectModel ) ;
    public final void rule__Weaver__AspectModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5077:1: ( ( ruleAspectModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5078:1: ( ruleAspectModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5078:1: ( ruleAspectModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5079:1: ruleAspectModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getAspectModelAspectModelParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAspectModel_in_rule__Weaver__AspectModelAssignment_310250);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5088:1: rule__Weaver__TargetModelAssignment_4_1 : ( ruleTargetModelNodeType ) ;
    public final void rule__Weaver__TargetModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5092:1: ( ( ruleTargetModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5093:1: ( ruleTargetModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5093:1: ( ruleTargetModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5094:1: ruleTargetModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getTargetModelTargetModelNodeTypeParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_rule__Weaver__TargetModelAssignment_4_110281);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5103:1: rule__Generator__GeneratorAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generator__GeneratorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5107:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5108:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5108:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5109:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGeneratorGeneratorImportCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5110:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5111:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGeneratorGeneratorImportIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generator__GeneratorAssignment_110316); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGeneratorGeneratorImportIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getGeneratorGeneratorImportCrossReference_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5122:1: rule__Generator__SourceModelAssignment_2 : ( ruleSourceModelNodeSelector ) ;
    public final void rule__Generator__SourceModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5126:1: ( ( ruleSourceModelNodeSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5127:1: ( ruleSourceModelNodeSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5127:1: ( ruleSourceModelNodeSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5128:1: ruleSourceModelNodeSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceModelSourceModelNodeSelectorParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceModelAssignment_210351);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5137:1: rule__Generator__TargetModelAssignment_3 : ( ruleTargetModelNodeType ) ;
    public final void rule__Generator__TargetModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5141:1: ( ( ruleTargetModelNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5142:1: ( ruleTargetModelNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5142:1: ( ruleTargetModelNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5143:1: ruleTargetModelNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetModelTargetModelNodeTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTargetModelNodeType_in_rule__Generator__TargetModelAssignment_310382);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5152:1: rule__Generator__WriteTraceModelAssignment_4_1 : ( ruleTraceModel ) ;
    public final void rule__Generator__WriteTraceModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5156:1: ( ( ruleTraceModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5157:1: ( ruleTraceModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5157:1: ( ruleTraceModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5158:1: ruleTraceModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getWriteTraceModelTraceModelParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleTraceModel_in_rule__Generator__WriteTraceModelAssignment_4_110413);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5167:1: rule__Generator__ReadTraceModelsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generator__ReadTraceModelsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5171:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5172:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5172:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5173:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelCrossReference_5_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5174:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5175:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generator__ReadTraceModelsAssignment_5_110448); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5186:1: rule__Generator__ReadTraceModelsAssignment_5_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generator__ReadTraceModelsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5190:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5191:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5191:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5192:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelCrossReference_5_2_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5193:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5194:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReadTraceModelsTraceModelIDTerminalRuleCall_5_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generator__ReadTraceModelsAssignment_5_2_110487); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5205:1: rule__SourceModelNodeSelector__ReferenceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__SourceModelNodeSelector__ReferenceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5209:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5210:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5210:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5211:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceMetamodelCrossReference_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5212:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5213:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getReferenceMetamodelIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SourceModelNodeSelector__ReferenceAssignment_0_010526); if (state.failed) return ;
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


    // $ANTLR start "rule__SourceModelNodeSelector__PropertyAssignment_0_1_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5224:1: rule__SourceModelNodeSelector__PropertyAssignment_0_1_1 : ( ruleNodeProperty ) ;
    public final void rule__SourceModelNodeSelector__PropertyAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5228:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5229:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5229:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5230:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyNodePropertyParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__SourceModelNodeSelector__PropertyAssignment_0_1_110561);
            ruleNodeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelNodeSelectorAccess().getPropertyNodePropertyParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelNodeSelector__PropertyAssignment_0_1_1"


    // $ANTLR start "rule__TargetModelNodeType__ReferenceAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5239:1: rule__TargetModelNodeType__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModelNodeType__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5243:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5244:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5244:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5245:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getReferenceMetamodelCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5246:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5247:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getReferenceMetamodelIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TargetModelNodeType__ReferenceAssignment_110596); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5258:1: rule__TargetModelNodeType__MultiplyAssignment_2 : ( ( '*' ) ) ;
    public final void rule__TargetModelNodeType__MultiplyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5262:1: ( ( ( '*' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5263:1: ( ( '*' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5263:1: ( ( '*' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5264:1: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getMultiplyAsteriskKeyword_2_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5265:1: ( '*' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5266:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelNodeTypeAccess().getMultiplyAsteriskKeyword_2_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__TargetModelNodeType__MultiplyAssignment_210636); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5281:1: rule__ModelNodeType__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ModelNodeType__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5285:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5286:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5286:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5287:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTargetRegisteredPackageCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5288:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5289:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTargetRegisteredPackageIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModelNodeType__TargetAssignment_010679); if (state.failed) return ;
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


    // $ANTLR start "rule__ModelNodeType__TypeAssignment_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5300:1: rule__ModelNodeType__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ModelNodeType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5304:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5305:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5305:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5306:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTypeEClassCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5307:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5308:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getTypeEClassIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModelNodeType__TypeAssignment_210718); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getTypeEClassIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getTypeEClassCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__TypeAssignment_2"


    // $ANTLR start "rule__ModelNodeType__PropertyAssignment_3_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5319:1: rule__ModelNodeType__PropertyAssignment_3_1 : ( ruleNodeProperty ) ;
    public final void rule__ModelNodeType__PropertyAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5323:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5324:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5324:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5325:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelNodeTypeAccess().getPropertyNodePropertyParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__ModelNodeType__PropertyAssignment_3_110753);
            ruleNodeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelNodeTypeAccess().getPropertyNodePropertyParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelNodeType__PropertyAssignment_3_1"


    // $ANTLR start "rule__NodeProperty__PropertyAssignment_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5334:1: rule__NodeProperty__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NodeProperty__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5338:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5339:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5339:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5340:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyEReferenceCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5341:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5342:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyEReferenceIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeProperty__PropertyAssignment_010788); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getPropertyEReferenceIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodePropertyAccess().getPropertyEReferenceCrossReference_0_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5353:1: rule__NodeProperty__ConstraintAssignment_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__NodeProperty__ConstraintAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5357:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5358:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5358:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5359:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getConstraintConstraintExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__NodeProperty__ConstraintAssignment_1_110823);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5368:1: rule__NodeProperty__SubPropertyAssignment_2_1 : ( ruleNodeProperty ) ;
    public final void rule__NodeProperty__SubPropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5372:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5373:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5373:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5374:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSubPropertyNodePropertyParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__NodeProperty__SubPropertyAssignment_2_110854);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5383:1: rule__ConstraintExpression__OperatorAssignment_1_0_0_1 : ( ruleLogicOperator ) ;
    public final void rule__ConstraintExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5387:1: ( ( ruleLogicOperator ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5388:1: ( ruleLogicOperator )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5388:1: ( ruleLogicOperator )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5389:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_110885);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5398:1: rule__ConstraintExpression__RightAssignment_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__ConstraintExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5402:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5403:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5403:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5404:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightConstraintExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__ConstraintExpression__RightAssignment_1_110916);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5413:1: rule__CompareExpression__OperatorAssignment_1_0_0_1 : ( ruleComparator ) ;
    public final void rule__CompareExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5417:1: ( ( ruleComparator ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5418:1: ( ruleComparator )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5418:1: ( ruleComparator )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5419:1: ruleComparator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getOperatorComparatorParserRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleComparator_in_rule__CompareExpression__OperatorAssignment_1_0_0_110947);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5428:1: rule__CompareExpression__RightAssignment_1_1 : ( ruleBasicConstraint ) ;
    public final void rule__CompareExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5432:1: ( ( ruleBasicConstraint ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5433:1: ( ruleBasicConstraint )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5433:1: ( ruleBasicConstraint )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5434:1: ruleBasicConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightBasicConstraintParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__RightAssignment_1_110978);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5443:1: rule__ParenthesisConstraint__ConstraintAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__ParenthesisConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5447:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5448:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5448:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5449:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_111009);
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


    // $ANTLR start "rule__TraceModel__NameAssignment_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5458:1: rule__TraceModel__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TraceModel__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5462:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5463:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5463:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5464:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TraceModel__NameAssignment_011040); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5473:1: rule__TraceModel__NodeSetRelationsAssignment_2 : ( ruleNodeSetRelation ) ;
    public final void rule__TraceModel__NodeSetRelationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5477:1: ( ( ruleNodeSetRelation ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5478:1: ( ruleNodeSetRelation )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5478:1: ( ruleNodeSetRelation )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5479:1: ruleNodeSetRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsNodeSetRelationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNodeSetRelation_in_rule__TraceModel__NodeSetRelationsAssignment_211071);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5488:1: rule__NodeSetRelation__SourceNodesAssignment_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__SourceNodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5492:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5493:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5493:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5494:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_111102);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5503:1: rule__NodeSetRelation__SourceNodesAssignment_2_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__SourceNodesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5507:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5508:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5508:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5509:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_2_111133);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5518:1: rule__NodeSetRelation__TargetNodesAssignment_4 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__TargetNodesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5522:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5523:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5523:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5524:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_411164);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5533:1: rule__NodeSetRelation__TargetNodesAssignment_5_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__TargetNodesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5537:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5538:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5538:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5539:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_5_111195);
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


    // $ANTLR start "rule__NodeType__EclassAssignment"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5548:1: rule__NodeType__EclassAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NodeType__EclassAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5552:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5553:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5553:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5554:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getEclassEClassCrossReference_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5555:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5556:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getEclassEClassIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeType__EclassAssignment11230); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeTypeAccess().getEclassEClassIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeTypeAccess().getEclassEClassCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeType__EclassAssignment"


    // $ANTLR start "rule__ArrayLiteral__LiteralsAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5567:1: rule__ArrayLiteral__LiteralsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5571:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5572:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5572:1: ( ruleLiteral )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5573:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_111265);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5582:1: rule__ArrayLiteral__LiteralsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5586:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5587:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5587:1: ( ruleLiteral )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5588:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_111296);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5597:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5601:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5602:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5602:1: ( RULE_STRING )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5603:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment11327); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5612:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5616:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5617:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5617:1: ( RULE_INT )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5618:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment11358); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5627:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5631:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5632:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5632:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5633:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment11389); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5642:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5646:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5647:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5647:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5648:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment11420); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5657:1: rule__LogicOperator__ANDAssignment_0 : ( ( '&' ) ) ;
    public final void rule__LogicOperator__ANDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5661:1: ( ( ( '&' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5662:1: ( ( '&' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5662:1: ( ( '&' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5663:1: ( '&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getANDAmpersandKeyword_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5664:1: ( '&' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5665:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getANDAmpersandKeyword_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__LogicOperator__ANDAssignment_011456); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5680:1: rule__LogicOperator__ORAssignment_1 : ( ( '|' ) ) ;
    public final void rule__LogicOperator__ORAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5684:1: ( ( ( '|' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5685:1: ( ( '|' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5685:1: ( ( '|' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5686:1: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getORVerticalLineKeyword_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5687:1: ( '|' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5688:1: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getORVerticalLineKeyword_1_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__LogicOperator__ORAssignment_111500); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5703:1: rule__Comparator__EQAssignment_0 : ( ( '==' ) ) ;
    public final void rule__Comparator__EQAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5707:1: ( ( ( '==' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5708:1: ( ( '==' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5708:1: ( ( '==' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5709:1: ( '==' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getEQEqualsSignEqualsSignKeyword_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5710:1: ( '==' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5711:1: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getEQEqualsSignEqualsSignKeyword_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Comparator__EQAssignment_011544); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5726:1: rule__Comparator__NEAssignment_1 : ( ( '!=' ) ) ;
    public final void rule__Comparator__NEAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5730:1: ( ( ( '!=' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5731:1: ( ( '!=' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5731:1: ( ( '!=' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5732:1: ( '!=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getNEExclamationMarkEqualsSignKeyword_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5733:1: ( '!=' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5734:1: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getNEExclamationMarkEqualsSignKeyword_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Comparator__NEAssignment_111588); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5749:1: rule__Comparator__GRAssignment_2 : ( ( '>' ) ) ;
    public final void rule__Comparator__GRAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5753:1: ( ( ( '>' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5754:1: ( ( '>' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5754:1: ( ( '>' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5755:1: ( '>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getGRGreaterThanSignKeyword_2_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5756:1: ( '>' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5757:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getGRGreaterThanSignKeyword_2_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Comparator__GRAssignment_211632); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5772:1: rule__Comparator__LWAssignment_3 : ( ( '<' ) ) ;
    public final void rule__Comparator__LWAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5776:1: ( ( ( '<' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5777:1: ( ( '<' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5777:1: ( ( '<' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5778:1: ( '<' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getLWLessThanSignKeyword_3_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5779:1: ( '<' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5780:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getLWLessThanSignKeyword_3_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Comparator__LWAssignment_311676); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5795:1: rule__Comparator__GEAssignment_4 : ( ( '>=' ) ) ;
    public final void rule__Comparator__GEAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5799:1: ( ( ( '>=' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5800:1: ( ( '>=' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5800:1: ( ( '>=' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5801:1: ( '>=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getGEGreaterThanSignEqualsSignKeyword_4_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5802:1: ( '>=' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5803:1: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getGEGreaterThanSignEqualsSignKeyword_4_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__Comparator__GEAssignment_411720); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5818:1: rule__Comparator__LEAssignment_5 : ( ( '<=' ) ) ;
    public final void rule__Comparator__LEAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5822:1: ( ( ( '<=' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5823:1: ( ( '<=' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5823:1: ( ( '<=' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5824:1: ( '<=' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getLELessThanSignEqualsSignKeyword_5_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5825:1: ( '<=' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5826:1: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getLELessThanSignEqualsSignKeyword_5_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Comparator__LEAssignment_511764); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5841:1: rule__Comparator__LIKEAssignment_6 : ( ( '~' ) ) ;
    public final void rule__Comparator__LIKEAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5845:1: ( ( ( '~' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5846:1: ( ( '~' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5846:1: ( ( '~' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5847:1: ( '~' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getLIKETildeKeyword_6_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5848:1: ( '~' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5849:1: '~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getLIKETildeKeyword_6_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Comparator__LIKEAssignment_611808); if (state.failed) return ;
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
    public static final BitSet FOLLOW_rule__Import__Alternatives_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaverImport_in_entryRuleWeaverImport187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeaverImport194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeaverImport__Group__0_in_ruleWeaverImport220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneratorImport_in_entryRuleGeneratorImport247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneratorImport254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneratorImport__Group__0_in_ruleGeneratorImport280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelSequence_in_entryRuleMetamodelSequence307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodelSequence314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__0_in_ruleMetamodelSequence340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_entryRuleMetamodel367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetamodel374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Metamodel__NameAssignment_in_ruleMetamodel400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_entryRuleRegisteredPackage427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisteredPackage434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__0_in_ruleRegisteredPackage460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnection494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connection__Alternatives_in_ruleConnection520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaver_in_entryRuleWeaver547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeaver554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__0_in_ruleWeaver580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectModel_in_entryRuleAspectModel607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspectModel614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectModel__Alternatives_in_ruleAspectModel640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_entryRuleGenerator667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerator674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__0_in_ruleGenerator700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_entryRuleSourceModelNodeSelector727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceModelNodeSelector734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Alternatives_in_ruleSourceModelNodeSelector760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_entryRuleTargetModelNodeType787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetModelNodeType794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__0_in_ruleTargetModelNodeType820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodeType_in_entryRuleModelNodeType847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelNodeType854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__0_in_ruleModelNodeType880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_entryRuleNodeProperty907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeProperty914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__0_in_ruleNodeProperty940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_entryRuleConstraintExpression967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstraintExpression974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0_in_ruleConstraintExpression1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_entryRuleCompareExpression1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareExpression1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0_in_ruleCompareExpression1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_entryRuleBasicConstraint1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicConstraint1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicConstraint__Alternatives_in_ruleBasicConstraint1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisConstraint1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__0_in_ruleParenthesisConstraint1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperand1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operand__Alternatives_in_ruleOperand1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModel_in_entryRuleTraceModel1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraceModel1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__0_in_ruleTraceModel1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSetRelation_in_entryRuleNodeSetRelation1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeSetRelation1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__0_in_ruleNodeSetRelation1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_entryRuleNodeType1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeType1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__EclassAssignment_in_ruleNodeType1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_entryRuleLogicOperator1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicOperator1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_entryRuleComparator1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparator1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__Alternatives_in_ruleComparator1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0_in_ruleQualifiedNameWithWildcard2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ConnectionsAssignment_5_0_in_rule__Model__Alternatives_52056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MetamodelsAssignment_5_1_in_rule__Model__Alternatives_52074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaverImport_in_rule__Import__Alternatives2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneratorImport_in_rule__Import__Alternatives2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__ModelPackageAssignment_2_0_in_rule__RegisteredPackage__Alternatives_22156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group_2_1__0_in_rule__RegisteredPackage__Alternatives_22174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_rule__Connection__Alternatives2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaver_in_rule__Connection__Alternatives2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectModel__Group_0__0_in_rule__AspectModel__Alternatives2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_rule__AspectModel__Alternatives2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__0_in_rule__SourceModelNodeSelector__Alternatives2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__0_in_rule__SourceModelNodeSelector__Alternatives2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_rule__BasicConstraint__Alternatives2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_rule__BasicConstraint__Alternatives2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Operand__Alternatives2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__Operand__Alternatives2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOperator__ANDAssignment_0_in_rule__LogicOperator__Alternatives2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOperator__ORAssignment_1_in_rule__LogicOperator__Alternatives2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__EQAssignment_0_in_rule__Comparator__Alternatives2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__NEAssignment_1_in_rule__Comparator__Alternatives2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__GRAssignment_2_in_rule__Comparator__Alternatives2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__LWAssignment_3_in_rule__Comparator__Alternatives2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__GEAssignment_4_in_rule__Comparator__Alternatives2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__LEAssignment_5_in_rule__Comparator__Alternatives2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__LIKEAssignment_6_in_rule__Comparator__Alternatives2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Model__Group__0__Impl2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12807 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22867 = new BitSet(new long[]{0x0000000000130000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Model__Group__2__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32929 = new BitSet(new long[]{0x0000000000130000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl2959 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42990 = new BitSet(new long[]{0x0000000000850000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RegisteredPackagesAssignment_4_in_rule__Model__Group__4__Impl3022 = new BitSet(new long[]{0x0000000000130002L});
    public static final BitSet FOLLOW_rule__Model__RegisteredPackagesAssignment_4_in_rule__Model__Group__4__Impl3034 = new BitSet(new long[]{0x0000000000130002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__53067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_5_in_rule__Model__Group__5__Impl3094 = new BitSet(new long[]{0x0000000000850002L});
    public static final BitSet FOLLOW_rule__WeaverImport__Group__0__Impl_in_rule__WeaverImport__Group__03137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__WeaverImport__Group__1_in_rule__WeaverImport__Group__03140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__WeaverImport__Group__0__Impl3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeaverImport__Group__1__Impl_in_rule__WeaverImport__Group__13199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WeaverImport__ImportedNamespaceAssignment_1_in_rule__WeaverImport__Group__1__Impl3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneratorImport__Group__0__Impl_in_rule__GeneratorImport__Group__03260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GeneratorImport__Group__1_in_rule__GeneratorImport__Group__03263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__GeneratorImport__Group__0__Impl3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneratorImport__Group__1__Impl_in_rule__GeneratorImport__Group__13322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneratorImport__ImportedNamespaceAssignment_1_in_rule__GeneratorImport__Group__1__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__0__Impl_in_rule__MetamodelSequence__Group__03383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__1_in_rule__MetamodelSequence__Group__03386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__MetamodelSequence__Group__0__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__1__Impl_in_rule__MetamodelSequence__Group__13445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__2_in_rule__MetamodelSequence__Group__13448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__TypeAssignment_1_in_rule__MetamodelSequence__Group__1__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__2__Impl_in_rule__MetamodelSequence__Group__23505 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__3_in_rule__MetamodelSequence__Group__23508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__MetamodelsAssignment_2_in_rule__MetamodelSequence__Group__2__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group__3__Impl_in_rule__MetamodelSequence__Group__33565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group_3__0_in_rule__MetamodelSequence__Group__3__Impl3592 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group_3__0__Impl_in_rule__MetamodelSequence__Group_3__03631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group_3__1_in_rule__MetamodelSequence__Group_3__03634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MetamodelSequence__Group_3__0__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__Group_3__1__Impl_in_rule__MetamodelSequence__Group_3__13693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MetamodelSequence__MetamodelsAssignment_3_1_in_rule__MetamodelSequence__Group_3__1__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__0__Impl_in_rule__RegisteredPackage__Group__03754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__1_in_rule__RegisteredPackage__Group__03757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RegisteredPackage__Group__0__Impl3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__1__Impl_in_rule__RegisteredPackage__Group__13816 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__2_in_rule__RegisteredPackage__Group__13819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__NameAssignment_1_in_rule__RegisteredPackage__Group__1__Impl3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group__2__Impl_in_rule__RegisteredPackage__Group__23876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Alternatives_2_in_rule__RegisteredPackage__Group__2__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group_2_1__0__Impl_in_rule__RegisteredPackage__Group_2_1__03939 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group_2_1__1_in_rule__RegisteredPackage__Group_2_1__03942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__IsTextAssignment_2_1_0_in_rule__RegisteredPackage__Group_2_1__0__Impl3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__Group_2_1__1__Impl_in_rule__RegisteredPackage__Group_2_1__13999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredPackage__ExtensionAssignment_2_1_1_in_rule__RegisteredPackage__Group_2_1__1__Impl4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__0__Impl_in_rule__Weaver__Group__04060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Weaver__Group__1_in_rule__Weaver__Group__04063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Weaver__Group__0__Impl4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__1__Impl_in_rule__Weaver__Group__14122 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Weaver__Group__2_in_rule__Weaver__Group__14125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__WeaverAssignment_1_in_rule__Weaver__Group__1__Impl4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__2__Impl_in_rule__Weaver__Group__24182 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Weaver__Group__3_in_rule__Weaver__Group__24185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__SourceModelAssignment_2_in_rule__Weaver__Group__2__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__3__Impl_in_rule__Weaver__Group__34242 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Weaver__Group__4_in_rule__Weaver__Group__34245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__AspectModelAssignment_3_in_rule__Weaver__Group__3__Impl4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__4__Impl_in_rule__Weaver__Group__44302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__0_in_rule__Weaver__Group__4__Impl4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__0__Impl_in_rule__Weaver__Group_4__04370 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__1_in_rule__Weaver__Group_4__04373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Weaver__Group_4__0__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__1__Impl_in_rule__Weaver__Group_4__14432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__TargetModelAssignment_4_1_in_rule__Weaver__Group_4__1__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectModel__Group_0__0__Impl_in_rule__AspectModel__Group_0__04493 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__AspectModel__Group_0__1_in_rule__AspectModel__Group_0__04496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AspectModel__Group_0__0__Impl4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectModel__Group_0__1__Impl_in_rule__AspectModel__Group_0__14555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_rule__AspectModel__Group_0__1__Impl4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__0__Impl_in_rule__Generator__Group__04615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__1_in_rule__Generator__Group__04618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Generator__Group__0__Impl4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__1__Impl_in_rule__Generator__Group__14677 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__2_in_rule__Generator__Group__14680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__GeneratorAssignment_1_in_rule__Generator__Group__1__Impl4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__2__Impl_in_rule__Generator__Group__24737 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__3_in_rule__Generator__Group__24740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceModelAssignment_2_in_rule__Generator__Group__2__Impl4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__3__Impl_in_rule__Generator__Group__34797 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__4_in_rule__Generator__Group__34800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__TargetModelAssignment_3_in_rule__Generator__Group__3__Impl4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__4__Impl_in_rule__Generator__Group__44857 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__5_in_rule__Generator__Group__44860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_4__0_in_rule__Generator__Group__4__Impl4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__5__Impl_in_rule__Generator__Group__54918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__0_in_rule__Generator__Group__5__Impl4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_4__0__Impl_in_rule__Generator__Group_4__04988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_4__1_in_rule__Generator__Group_4__04991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Generator__Group_4__0__Impl5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_4__1__Impl_in_rule__Generator__Group_4__15050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__WriteTraceModelAssignment_4_1_in_rule__Generator__Group_4__1__Impl5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__0__Impl_in_rule__Generator__Group_5__05111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__1_in_rule__Generator__Group_5__05114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Generator__Group_5__0__Impl5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__1__Impl_in_rule__Generator__Group_5__15173 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__2_in_rule__Generator__Group_5__15176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__ReadTraceModelsAssignment_5_1_in_rule__Generator__Group_5__1__Impl5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__2__Impl_in_rule__Generator__Group_5__25233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5_2__0_in_rule__Generator__Group_5__2__Impl5260 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5_2__0__Impl_in_rule__Generator__Group_5_2__05297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_5_2__1_in_rule__Generator__Group_5_2__05300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Generator__Group_5_2__0__Impl5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5_2__1__Impl_in_rule__Generator__Group_5_2__15359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__ReadTraceModelsAssignment_5_2_1_in_rule__Generator__Group_5_2__1__Impl5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__0__Impl_in_rule__SourceModelNodeSelector__Group_0__05420 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__1_in_rule__SourceModelNodeSelector__Group_0__05423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__ReferenceAssignment_0_0_in_rule__SourceModelNodeSelector__Group_0__0__Impl5450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0__1__Impl_in_rule__SourceModelNodeSelector__Group_0__15480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0_in_rule__SourceModelNodeSelector__Group_0__1__Impl5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__0__Impl_in_rule__SourceModelNodeSelector__Group_0_1__05542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1_in_rule__SourceModelNodeSelector__Group_0_1__05545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SourceModelNodeSelector__Group_0_1__0__Impl5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_0_1__1__Impl_in_rule__SourceModelNodeSelector__Group_0_1__15604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__PropertyAssignment_0_1_1_in_rule__SourceModelNodeSelector__Group_0_1__1__Impl5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__0__Impl_in_rule__SourceModelNodeSelector__Group_1__05665 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__1_in_rule__SourceModelNodeSelector__Group_1__05668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelNodeSelector__Group_1__1__Impl_in_rule__SourceModelNodeSelector__Group_1__15726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SourceModelNodeSelector__Group_1__1__Impl5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__0__Impl_in_rule__TargetModelNodeType__Group__05789 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__1_in_rule__TargetModelNodeType__Group__05792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__1__Impl_in_rule__TargetModelNodeType__Group__15850 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__2_in_rule__TargetModelNodeType__Group__15853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__ReferenceAssignment_1_in_rule__TargetModelNodeType__Group__1__Impl5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__Group__2__Impl_in_rule__TargetModelNodeType__Group__25911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModelNodeType__MultiplyAssignment_2_in_rule__TargetModelNodeType__Group__2__Impl5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__0__Impl_in_rule__ModelNodeType__Group__05975 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__1_in_rule__ModelNodeType__Group__05978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__TargetAssignment_0_in_rule__ModelNodeType__Group__0__Impl6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__1__Impl_in_rule__ModelNodeType__Group__16035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__2_in_rule__ModelNodeType__Group__16038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ModelNodeType__Group__1__Impl6066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__2__Impl_in_rule__ModelNodeType__Group__26097 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__3_in_rule__ModelNodeType__Group__26100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__TypeAssignment_2_in_rule__ModelNodeType__Group__2__Impl6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group__3__Impl_in_rule__ModelNodeType__Group__36157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_3__0_in_rule__ModelNodeType__Group__3__Impl6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_3__0__Impl_in_rule__ModelNodeType__Group_3__06223 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_3__1_in_rule__ModelNodeType__Group_3__06226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ModelNodeType__Group_3__0__Impl6254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__Group_3__1__Impl_in_rule__ModelNodeType__Group_3__16285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelNodeType__PropertyAssignment_3_1_in_rule__ModelNodeType__Group_3__1__Impl6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__0__Impl_in_rule__NodeProperty__Group__06346 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__1_in_rule__NodeProperty__Group__06349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__PropertyAssignment_0_in_rule__NodeProperty__Group__0__Impl6376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__1__Impl_in_rule__NodeProperty__Group__16406 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__2_in_rule__NodeProperty__Group__16409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__0_in_rule__NodeProperty__Group__1__Impl6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__2__Impl_in_rule__NodeProperty__Group__26467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__0_in_rule__NodeProperty__Group__2__Impl6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__0__Impl_in_rule__NodeProperty__Group_1__06531 = new BitSet(new long[]{0x00000004400001F0L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__1_in_rule__NodeProperty__Group_1__06534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NodeProperty__Group_1__0__Impl6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__1__Impl_in_rule__NodeProperty__Group_1__16593 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__2_in_rule__NodeProperty__Group_1__16596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__ConstraintAssignment_1_1_in_rule__NodeProperty__Group_1__1__Impl6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__2__Impl_in_rule__NodeProperty__Group_1__26653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NodeProperty__Group_1__2__Impl6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__0__Impl_in_rule__NodeProperty__Group_2__06718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__1_in_rule__NodeProperty__Group_2__06721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__NodeProperty__Group_2__0__Impl6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__1__Impl_in_rule__NodeProperty__Group_2__16780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__SubPropertyAssignment_2_1_in_rule__NodeProperty__Group_2__1__Impl6807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__06841 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__06844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_rule__ConstraintExpression__Group__0__Impl6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__16900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__06962 = new BitSet(new long[]{0x00000004400001F0L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__06965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__17022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__07083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl7110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__07142 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__07145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__17203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__07264 = new BitSet(new long[]{0x00003E0300000000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__07267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__Group__0__Impl7294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__17323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__07385 = new BitSet(new long[]{0x00000004400001F0L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__07388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl7415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__17445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl7472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__07506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl7533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__07565 = new BitSet(new long[]{0x00003E0300000000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__07568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__17626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__OperatorAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__07687 = new BitSet(new long[]{0x00000004400001F0L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__07690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ParenthesisConstraint__Group__0__Impl7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__17749 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__17752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__27809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ParenthesisConstraint__Group__2__Impl7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__0__Impl_in_rule__TraceModel__Group__07874 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__1_in_rule__TraceModel__Group__07877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NameAssignment_0_in_rule__TraceModel__Group__0__Impl7904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__1__Impl_in_rule__TraceModel__Group__17934 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__2_in_rule__TraceModel__Group__17937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TraceModel__Group__1__Impl7965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__2__Impl_in_rule__TraceModel__Group__27996 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__3_in_rule__TraceModel__Group__27999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl8028 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl8040 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__3__Impl_in_rule__TraceModel__Group__38073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TraceModel__Group__3__Impl8101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__0__Impl_in_rule__NodeSetRelation__Group__08140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__1_in_rule__NodeSetRelation__Group__08143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NodeSetRelation__Group__0__Impl8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__1__Impl_in_rule__NodeSetRelation__Group__18202 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__2_in_rule__NodeSetRelation__Group__18205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_1_in_rule__NodeSetRelation__Group__1__Impl8232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__2__Impl_in_rule__NodeSetRelation__Group__28262 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__3_in_rule__NodeSetRelation__Group__28265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__0_in_rule__NodeSetRelation__Group__2__Impl8292 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__3__Impl_in_rule__NodeSetRelation__Group__38323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__4_in_rule__NodeSetRelation__Group__38326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__NodeSetRelation__Group__3__Impl8354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__4__Impl_in_rule__NodeSetRelation__Group__48385 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__5_in_rule__NodeSetRelation__Group__48388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_4_in_rule__NodeSetRelation__Group__4__Impl8415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__5__Impl_in_rule__NodeSetRelation__Group__58445 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__6_in_rule__NodeSetRelation__Group__58448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__0_in_rule__NodeSetRelation__Group__5__Impl8475 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__6__Impl_in_rule__NodeSetRelation__Group__68506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__NodeSetRelation__Group__6__Impl8534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__0__Impl_in_rule__NodeSetRelation__Group_2__08579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__1_in_rule__NodeSetRelation__Group_2__08582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NodeSetRelation__Group_2__0__Impl8610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__1__Impl_in_rule__NodeSetRelation__Group_2__18641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_2_1_in_rule__NodeSetRelation__Group_2__1__Impl8668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__0__Impl_in_rule__NodeSetRelation__Group_5__08702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__1_in_rule__NodeSetRelation__Group_5__08705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NodeSetRelation__Group_5__0__Impl8733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__1__Impl_in_rule__NodeSetRelation__Group_5__18764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_5_1_in_rule__NodeSetRelation__Group_5__1__Impl8791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__08825 = new BitSet(new long[]{0x00000004000001E0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__08828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ArrayLiteral__Group__0__Impl8856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__18887 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__18890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl8917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__28947 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__28950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl8977 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__39008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ArrayLiteral__Group__3__Impl9036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__09075 = new BitSet(new long[]{0x00000004000001E0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__09078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ArrayLiteral__Group_2__0__Impl9106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__19137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl9164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__09198 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__09201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__19257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl9284 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__09319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__09322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__QualifiedName__Group_1__0__Impl9351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__19383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl9410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__09443 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__09446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__19502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl9529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__09564 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__09567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl9595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__19626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl9654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_19694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_39725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredPackage_in_rule__Model__RegisteredPackagesAssignment_49756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_rule__Model__ConnectionsAssignment_5_09787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodelSequence_in_rule__Model__MetamodelsAssignment_5_19818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__WeaverImport__ImportedNamespaceAssignment_19849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__GeneratorImport__ImportedNamespaceAssignment_19880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelNodeType_in_rule__MetamodelSequence__TypeAssignment_19911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_29942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetamodel_in_rule__MetamodelSequence__MetamodelsAssignment_3_19973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Metamodel__NameAssignment10004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RegisteredPackage__NameAssignment_110035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RegisteredPackage__ModelPackageAssignment_2_010070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RegisteredPackage__IsTextAssignment_2_1_010110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RegisteredPackage__ExtensionAssignment_2_1_110149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Weaver__WeaverAssignment_110184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_rule__Weaver__SourceModelAssignment_210219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectModel_in_rule__Weaver__AspectModelAssignment_310250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_rule__Weaver__TargetModelAssignment_4_110281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generator__GeneratorAssignment_110316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelNodeSelector_in_rule__Generator__SourceModelAssignment_210351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModelNodeType_in_rule__Generator__TargetModelAssignment_310382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModel_in_rule__Generator__WriteTraceModelAssignment_4_110413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generator__ReadTraceModelsAssignment_5_110448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generator__ReadTraceModelsAssignment_5_2_110487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SourceModelNodeSelector__ReferenceAssignment_0_010526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__SourceModelNodeSelector__PropertyAssignment_0_1_110561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TargetModelNodeType__ReferenceAssignment_110596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TargetModelNodeType__MultiplyAssignment_210636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModelNodeType__TargetAssignment_010679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModelNodeType__TypeAssignment_210718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__ModelNodeType__PropertyAssignment_3_110753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeProperty__PropertyAssignment_010788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__NodeProperty__ConstraintAssignment_1_110823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__NodeProperty__SubPropertyAssignment_2_110854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_110885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__ConstraintExpression__RightAssignment_1_110916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_rule__CompareExpression__OperatorAssignment_1_0_0_110947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__RightAssignment_1_110978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_111009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TraceModel__NameAssignment_011040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSetRelation_in_rule__TraceModel__NodeSetRelationsAssignment_211071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_111102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_2_111133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_411164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_5_111195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeType__EclassAssignment11230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_111265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_111296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment11327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment11358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment11389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__LogicOperator__ANDAssignment_011456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__LogicOperator__ORAssignment_111500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Comparator__EQAssignment_011544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Comparator__NEAssignment_111588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Comparator__GRAssignment_211632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Comparator__LWAssignment_311676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Comparator__GEAssignment_411720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Comparator__LEAssignment_511764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Comparator__LIKEAssignment_611808 = new BitSet(new long[]{0x0000000000000002L});

}