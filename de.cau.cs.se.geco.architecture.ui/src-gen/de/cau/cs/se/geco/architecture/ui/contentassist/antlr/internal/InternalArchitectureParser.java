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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'link'", "'in'", "'out'", "'io'", "'&'", "'|'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'~'", "'package'", "'import'", "'register'", "'model'", "','", "'weave'", "'=>'", "'pointcut'", "'advice'", "'generate'", "'source'", "'('", "')'", "'target'", "'trace'", "'['", "']'", "'/'", "'null'", "'!'", "'is'", "'use'", "':'", "'{'", "'}'", "'.'", "'text'", "'[]'"
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




    // $ANTLR start "entryRuleGecoModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:61:1: entryRuleGecoModel : ruleGecoModel EOF ;
    public final void entryRuleGecoModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:62:1: ( ruleGecoModel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:63:1: ruleGecoModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGecoModelRule()); 
            }
            pushFollow(FOLLOW_ruleGecoModel_in_entryRuleGecoModel67);
            ruleGecoModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGecoModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGecoModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleGecoModel"


    // $ANTLR start "ruleGecoModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:70:1: ruleGecoModel : ( ( rule__GecoModel__Group__0 ) ) ;
    public final void ruleGecoModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:74:2: ( ( ( rule__GecoModel__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:75:1: ( ( rule__GecoModel__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:75:1: ( ( rule__GecoModel__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:76:1: ( rule__GecoModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGecoModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:77:1: ( rule__GecoModel__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:77:2: rule__GecoModel__Group__0
            {
            pushFollow(FOLLOW_rule__GecoModel__Group__0_in_ruleGecoModel100);
            rule__GecoModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGecoModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGecoModel"


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


    // $ANTLR start "entryRuleRegisteredRootClass"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:117:1: entryRuleRegisteredRootClass : ruleRegisteredRootClass EOF ;
    public final void entryRuleRegisteredRootClass() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:118:1: ( ruleRegisteredRootClass EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:119:1: ruleRegisteredRootClass EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredRootClassRule()); 
            }
            pushFollow(FOLLOW_ruleRegisteredRootClass_in_entryRuleRegisteredRootClass187);
            ruleRegisteredRootClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredRootClassRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisteredRootClass194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRegisteredRootClass"


    // $ANTLR start "ruleRegisteredRootClass"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:126:1: ruleRegisteredRootClass : ( ( rule__RegisteredRootClass__Group__0 ) ) ;
    public final void ruleRegisteredRootClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:130:2: ( ( ( rule__RegisteredRootClass__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:131:1: ( ( rule__RegisteredRootClass__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:131:1: ( ( rule__RegisteredRootClass__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:132:1: ( rule__RegisteredRootClass__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredRootClassAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:133:1: ( rule__RegisteredRootClass__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:133:2: rule__RegisteredRootClass__Group__0
            {
            pushFollow(FOLLOW_rule__RegisteredRootClass__Group__0_in_ruleRegisteredRootClass220);
            rule__RegisteredRootClass__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredRootClassAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegisteredRootClass"


    // $ANTLR start "entryRuleModelSequence"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:145:1: entryRuleModelSequence : ruleModelSequence EOF ;
    public final void entryRuleModelSequence() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:146:1: ( ruleModelSequence EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:147:1: ruleModelSequence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelSequenceRule()); 
            }
            pushFollow(FOLLOW_ruleModelSequence_in_entryRuleModelSequence247);
            ruleModelSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelSequenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelSequence254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModelSequence"


    // $ANTLR start "ruleModelSequence"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:154:1: ruleModelSequence : ( ( rule__ModelSequence__Group__0 ) ) ;
    public final void ruleModelSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:158:2: ( ( ( rule__ModelSequence__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:159:1: ( ( rule__ModelSequence__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:159:1: ( ( rule__ModelSequence__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:160:1: ( rule__ModelSequence__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelSequenceAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:161:1: ( rule__ModelSequence__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:161:2: rule__ModelSequence__Group__0
            {
            pushFollow(FOLLOW_rule__ModelSequence__Group__0_in_ruleModelSequence280);
            rule__ModelSequence__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelSequenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelSequence"


    // $ANTLR start "entryRuleModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:173:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:174:1: ( ruleModel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:175:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel307);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel314); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:182:1: ruleModel : ( ( rule__Model__NameAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:186:2: ( ( ( rule__Model__NameAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:187:1: ( ( rule__Model__NameAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:187:1: ( ( rule__Model__NameAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:188:1: ( rule__Model__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:189:1: ( rule__Model__NameAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:189:2: rule__Model__NameAssignment
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_in_ruleModel340);
            rule__Model__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleFragment"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:201:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:202:1: ( ruleFragment EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:203:1: ruleFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleFragment_in_entryRuleFragment367);
            ruleFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFragment374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:210:1: ruleFragment : ( ( rule__Fragment__Alternatives ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:214:2: ( ( ( rule__Fragment__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:215:1: ( ( rule__Fragment__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:215:1: ( ( rule__Fragment__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:216:1: ( rule__Fragment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFragmentAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:217:1: ( rule__Fragment__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:217:2: rule__Fragment__Alternatives
            {
            pushFollow(FOLLOW_rule__Fragment__Alternatives_in_ruleFragment400);
            rule__Fragment__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFragmentAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFragment"


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


    // $ANTLR start "entryRuleSeparateModels"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:285:1: entryRuleSeparateModels : ruleSeparateModels EOF ;
    public final void entryRuleSeparateModels() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:286:1: ( ruleSeparateModels EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:287:1: ruleSeparateModels EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeparateModelsRule()); 
            }
            pushFollow(FOLLOW_ruleSeparateModels_in_entryRuleSeparateModels547);
            ruleSeparateModels();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeparateModelsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSeparateModels554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSeparateModels"


    // $ANTLR start "ruleSeparateModels"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:294:1: ruleSeparateModels : ( ( rule__SeparateModels__Group__0 ) ) ;
    public final void ruleSeparateModels() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:298:2: ( ( ( rule__SeparateModels__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:299:1: ( ( rule__SeparateModels__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:299:1: ( ( rule__SeparateModels__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:300:1: ( rule__SeparateModels__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeparateModelsAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:301:1: ( rule__SeparateModels__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:301:2: rule__SeparateModels__Group__0
            {
            pushFollow(FOLLOW_rule__SeparateModels__Group__0_in_ruleSeparateModels580);
            rule__SeparateModels__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeparateModelsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeparateModels"


    // $ANTLR start "entryRuleCombinedModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:313:1: entryRuleCombinedModel : ruleCombinedModel EOF ;
    public final void entryRuleCombinedModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:314:1: ( ruleCombinedModel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:315:1: ruleCombinedModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCombinedModelRule()); 
            }
            pushFollow(FOLLOW_ruleCombinedModel_in_entryRuleCombinedModel607);
            ruleCombinedModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCombinedModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCombinedModel614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCombinedModel"


    // $ANTLR start "ruleCombinedModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:322:1: ruleCombinedModel : ( ( rule__CombinedModel__Alternatives ) ) ;
    public final void ruleCombinedModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:326:2: ( ( ( rule__CombinedModel__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:327:1: ( ( rule__CombinedModel__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:327:1: ( ( rule__CombinedModel__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:328:1: ( rule__CombinedModel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCombinedModelAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:329:1: ( rule__CombinedModel__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:329:2: rule__CombinedModel__Alternatives
            {
            pushFollow(FOLLOW_rule__CombinedModel__Alternatives_in_ruleCombinedModel640);
            rule__CombinedModel__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCombinedModelAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCombinedModel"


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


    // $ANTLR start "entryRuleSourceModelSelector"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:369:1: entryRuleSourceModelSelector : ruleSourceModelSelector EOF ;
    public final void entryRuleSourceModelSelector() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:370:1: ( ruleSourceModelSelector EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:371:1: ruleSourceModelSelector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorRule()); 
            }
            pushFollow(FOLLOW_ruleSourceModelSelector_in_entryRuleSourceModelSelector727);
            ruleSourceModelSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceModelSelector734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSourceModelSelector"


    // $ANTLR start "ruleSourceModelSelector"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:378:1: ruleSourceModelSelector : ( ( rule__SourceModelSelector__Alternatives ) ) ;
    public final void ruleSourceModelSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:382:2: ( ( ( rule__SourceModelSelector__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:383:1: ( ( rule__SourceModelSelector__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:383:1: ( ( rule__SourceModelSelector__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:384:1: ( rule__SourceModelSelector__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:385:1: ( rule__SourceModelSelector__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:385:2: rule__SourceModelSelector__Alternatives
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__Alternatives_in_ruleSourceModelSelector760);
            rule__SourceModelSelector__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceModelSelector"


    // $ANTLR start "entryRuleTargetModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:397:1: entryRuleTargetModel : ruleTargetModel EOF ;
    public final void entryRuleTargetModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:398:1: ( ruleTargetModel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:399:1: ruleTargetModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelRule()); 
            }
            pushFollow(FOLLOW_ruleTargetModel_in_entryRuleTargetModel787);
            ruleTargetModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetModel794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTargetModel"


    // $ANTLR start "ruleTargetModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:406:1: ruleTargetModel : ( ( rule__TargetModel__Group__0 ) ) ;
    public final void ruleTargetModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:410:2: ( ( ( rule__TargetModel__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:411:1: ( ( rule__TargetModel__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:411:1: ( ( rule__TargetModel__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:412:1: ( rule__TargetModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:413:1: ( rule__TargetModel__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:413:2: rule__TargetModel__Group__0
            {
            pushFollow(FOLLOW_rule__TargetModel__Group__0_in_ruleTargetModel820);
            rule__TargetModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetModel"


    // $ANTLR start "entryRuleModelType"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:425:1: entryRuleModelType : ruleModelType EOF ;
    public final void entryRuleModelType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:426:1: ( ruleModelType EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:427:1: ruleModelType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelTypeRule()); 
            }
            pushFollow(FOLLOW_ruleModelType_in_entryRuleModelType847);
            ruleModelType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelType854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModelType"


    // $ANTLR start "ruleModelType"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:434:1: ruleModelType : ( ( rule__ModelType__Group__0 ) ) ;
    public final void ruleModelType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:438:2: ( ( ( rule__ModelType__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:439:1: ( ( rule__ModelType__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:439:1: ( ( rule__ModelType__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:440:1: ( rule__ModelType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelTypeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:441:1: ( rule__ModelType__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:441:2: rule__ModelType__Group__0
            {
            pushFollow(FOLLOW_rule__ModelType__Group__0_in_ruleModelType880);
            rule__ModelType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelType"


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


    // $ANTLR start "entryRuleNegation"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:565:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:566:1: ( ruleNegation EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:567:1: ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation1147);
            ruleNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation1154); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:574:1: ruleNegation : ( ( rule__Negation__Group__0 ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:578:2: ( ( ( rule__Negation__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:579:1: ( ( rule__Negation__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:579:1: ( ( rule__Negation__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:580:1: ( rule__Negation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:581:1: ( rule__Negation__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:581:2: rule__Negation__Group__0
            {
            pushFollow(FOLLOW_rule__Negation__Group__0_in_ruleNegation1180);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:593:1: entryRuleParenthesisConstraint : ruleParenthesisConstraint EOF ;
    public final void entryRuleParenthesisConstraint() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:594:1: ( ruleParenthesisConstraint EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:595:1: ruleParenthesisConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint1207);
            ruleParenthesisConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisConstraintRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisConstraint1214); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:602:1: ruleParenthesisConstraint : ( ( rule__ParenthesisConstraint__Group__0 ) ) ;
    public final void ruleParenthesisConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:606:2: ( ( ( rule__ParenthesisConstraint__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:607:1: ( ( rule__ParenthesisConstraint__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:607:1: ( ( rule__ParenthesisConstraint__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:608:1: ( rule__ParenthesisConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:609:1: ( rule__ParenthesisConstraint__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:609:2: rule__ParenthesisConstraint__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__0_in_ruleParenthesisConstraint1240);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:621:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:622:1: ( ruleOperand EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:623:1: ruleOperand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandRule()); 
            }
            pushFollow(FOLLOW_ruleOperand_in_entryRuleOperand1267);
            ruleOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperand1274); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:630:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:634:2: ( ( ( rule__Operand__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:635:1: ( ( rule__Operand__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:635:1: ( ( rule__Operand__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:636:1: ( rule__Operand__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperandAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:637:1: ( rule__Operand__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:637:2: rule__Operand__Alternatives
            {
            pushFollow(FOLLOW_rule__Operand__Alternatives_in_ruleOperand1300);
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


    // $ANTLR start "entryRuleInstanceOf"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:649:1: entryRuleInstanceOf : ruleInstanceOf EOF ;
    public final void entryRuleInstanceOf() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:650:1: ( ruleInstanceOf EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:651:1: ruleInstanceOf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceOfRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceOf_in_entryRuleInstanceOf1327);
            ruleInstanceOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceOfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceOf1334); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInstanceOf"


    // $ANTLR start "ruleInstanceOf"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:658:1: ruleInstanceOf : ( ( rule__InstanceOf__Group__0 ) ) ;
    public final void ruleInstanceOf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:662:2: ( ( ( rule__InstanceOf__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:663:1: ( ( rule__InstanceOf__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:663:1: ( ( rule__InstanceOf__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:664:1: ( rule__InstanceOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceOfAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:665:1: ( rule__InstanceOf__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:665:2: rule__InstanceOf__Group__0
            {
            pushFollow(FOLLOW_rule__InstanceOf__Group__0_in_ruleInstanceOf1360);
            rule__InstanceOf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceOfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceOf"


    // $ANTLR start "entryRuleTargetTraceModel"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:677:1: entryRuleTargetTraceModel : ruleTargetTraceModel EOF ;
    public final void entryRuleTargetTraceModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:678:1: ( ruleTargetTraceModel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:679:1: ruleTargetTraceModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetTraceModelRule()); 
            }
            pushFollow(FOLLOW_ruleTargetTraceModel_in_entryRuleTargetTraceModel1387);
            ruleTargetTraceModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetTraceModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTargetTraceModel1394); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:686:1: ruleTargetTraceModel : ( ( rule__TargetTraceModel__Alternatives ) ) ;
    public final void ruleTargetTraceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:690:2: ( ( ( rule__TargetTraceModel__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:691:1: ( ( rule__TargetTraceModel__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:691:1: ( ( rule__TargetTraceModel__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:692:1: ( rule__TargetTraceModel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetTraceModelAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:693:1: ( rule__TargetTraceModel__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:693:2: rule__TargetTraceModel__Alternatives
            {
            pushFollow(FOLLOW_rule__TargetTraceModel__Alternatives_in_ruleTargetTraceModel1420);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:705:1: entryRuleTraceModelReference : ruleTraceModelReference EOF ;
    public final void entryRuleTraceModelReference() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:706:1: ( ruleTraceModelReference EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:707:1: ruleTraceModelReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTraceModelReference_in_entryRuleTraceModelReference1447);
            ruleTraceModelReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraceModelReference1454); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:714:1: ruleTraceModelReference : ( ( rule__TraceModelReference__TraceModelAssignment ) ) ;
    public final void ruleTraceModelReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:718:2: ( ( ( rule__TraceModelReference__TraceModelAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:719:1: ( ( rule__TraceModelReference__TraceModelAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:719:1: ( ( rule__TraceModelReference__TraceModelAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:720:1: ( rule__TraceModelReference__TraceModelAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelReferenceAccess().getTraceModelAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:721:1: ( rule__TraceModelReference__TraceModelAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:721:2: rule__TraceModelReference__TraceModelAssignment
            {
            pushFollow(FOLLOW_rule__TraceModelReference__TraceModelAssignment_in_ruleTraceModelReference1480);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:733:1: entryRuleTraceModel : ruleTraceModel EOF ;
    public final void entryRuleTraceModel() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:734:1: ( ruleTraceModel EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:735:1: ruleTraceModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelRule()); 
            }
            pushFollow(FOLLOW_ruleTraceModel_in_entryRuleTraceModel1507);
            ruleTraceModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraceModel1514); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:742:1: ruleTraceModel : ( ( rule__TraceModel__Group__0 ) ) ;
    public final void ruleTraceModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:746:2: ( ( ( rule__TraceModel__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:747:1: ( ( rule__TraceModel__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:747:1: ( ( rule__TraceModel__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:748:1: ( rule__TraceModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:749:1: ( rule__TraceModel__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:749:2: rule__TraceModel__Group__0
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__0_in_ruleTraceModel1540);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:761:1: entryRuleNodeSetRelation : ruleNodeSetRelation EOF ;
    public final void entryRuleNodeSetRelation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:762:1: ( ruleNodeSetRelation EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:763:1: ruleNodeSetRelation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationRule()); 
            }
            pushFollow(FOLLOW_ruleNodeSetRelation_in_entryRuleNodeSetRelation1567);
            ruleNodeSetRelation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeSetRelationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeSetRelation1574); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:770:1: ruleNodeSetRelation : ( ( rule__NodeSetRelation__Group__0 ) ) ;
    public final void ruleNodeSetRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:774:2: ( ( ( rule__NodeSetRelation__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:775:1: ( ( rule__NodeSetRelation__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:775:1: ( ( rule__NodeSetRelation__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:776:1: ( rule__NodeSetRelation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:777:1: ( rule__NodeSetRelation__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:777:2: rule__NodeSetRelation__Group__0
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__0_in_ruleNodeSetRelation1600);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:789:1: entryRuleNodeType : ruleNodeType EOF ;
    public final void entryRuleNodeType() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:790:1: ( ruleNodeType EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:791:1: ruleNodeType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_entryRuleNodeType1627);
            ruleNodeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeType1634); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:798:1: ruleNodeType : ( ( rule__NodeType__TypeAssignment ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:802:2: ( ( ( rule__NodeType__TypeAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:803:1: ( ( rule__NodeType__TypeAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:803:1: ( ( rule__NodeType__TypeAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:804:1: ( rule__NodeType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getTypeAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:805:1: ( rule__NodeType__TypeAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:805:2: rule__NodeType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__NodeType__TypeAssignment_in_ruleNodeType1660);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:817:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:818:1: ( ruleLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:819:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1687);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1694); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:826:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:830:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:831:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:831:1: ( ( rule__Literal__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:832:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:833:1: ( rule__Literal__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:833:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1720);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:845:1: entryRuleArrayLiteral : ruleArrayLiteral EOF ;
    public final void entryRuleArrayLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:846:1: ( ruleArrayLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:847:1: ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1747);
            ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteral1754); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:854:1: ruleArrayLiteral : ( ( rule__ArrayLiteral__Group__0 ) ) ;
    public final void ruleArrayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:858:2: ( ( ( rule__ArrayLiteral__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:859:1: ( ( rule__ArrayLiteral__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:859:1: ( ( rule__ArrayLiteral__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:860:1: ( rule__ArrayLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:861:1: ( rule__ArrayLiteral__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:861:2: rule__ArrayLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1780);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:873:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:874:1: ( ruleStringLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:875:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1807);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1814); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:882:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:886:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:887:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:887:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:888:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:889:1: ( rule__StringLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:889:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1840);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:901:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:902:1: ( ruleIntLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:903:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1867);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntLiteral1874); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:910:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:914:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:915:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:915:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:916:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:917:1: ( rule__IntLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:917:2: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1900);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:929:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:930:1: ( ruleFloatLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:931:1: ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1927);
            ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatLiteral1934); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:938:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:942:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:943:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:943:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:944:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:945:1: ( rule__FloatLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:945:2: rule__FloatLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1960);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:957:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:958:1: ( ruleBooleanLiteral EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:959:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1987);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral1994); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:966:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:970:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:971:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:971:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:972:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:973:1: ( rule__BooleanLiteral__ValueAssignment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:973:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral2020);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:985:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:986:1: ( ruleQualifiedName EOF )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:987:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2047);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2054); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:994:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:998:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:999:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:999:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1000:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1001:1: ( rule__QualifiedName__Group__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1001:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2080);
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


    // $ANTLR start "ruleModelModifier"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1016:1: ruleModelModifier : ( ( rule__ModelModifier__Alternatives ) ) ;
    public final void ruleModelModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1020:1: ( ( ( rule__ModelModifier__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1021:1: ( ( rule__ModelModifier__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1021:1: ( ( rule__ModelModifier__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1022:1: ( rule__ModelModifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelModifierAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1023:1: ( rule__ModelModifier__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1023:2: rule__ModelModifier__Alternatives
            {
            pushFollow(FOLLOW_rule__ModelModifier__Alternatives_in_ruleModelModifier2119);
            rule__ModelModifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelModifierAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelModifier"


    // $ANTLR start "ruleLogicOperator"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1035:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1039:1: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1040:1: ( ( rule__LogicOperator__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1040:1: ( ( rule__LogicOperator__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1041:1: ( rule__LogicOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1042:1: ( rule__LogicOperator__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1042:2: rule__LogicOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator2155);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1054:1: ruleComparator : ( ( rule__Comparator__Alternatives ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1058:1: ( ( ( rule__Comparator__Alternatives ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1059:1: ( ( rule__Comparator__Alternatives ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1059:1: ( ( rule__Comparator__Alternatives ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1060:1: ( rule__Comparator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1061:1: ( rule__Comparator__Alternatives )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1061:2: rule__Comparator__Alternatives
            {
            pushFollow(FOLLOW_rule__Comparator__Alternatives_in_ruleComparator2191);
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


    // $ANTLR start "rule__RegisteredRootClass__Alternatives_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1072:1: rule__RegisteredRootClass__Alternatives_2 : ( ( ( rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0 ) ) | ( ( rule__RegisteredRootClass__Group_2_1__0 ) ) );
    public final void rule__RegisteredRootClass__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1076:1: ( ( ( rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0 ) ) | ( ( rule__RegisteredRootClass__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==53) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1077:1: ( ( rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1077:1: ( ( rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1078:1: ( rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRegisteredRootClassAccess().getImportedNamespaceAssignment_2_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1079:1: ( rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1079:2: rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0_in_rule__RegisteredRootClass__Alternatives_22226);
                    rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRegisteredRootClassAccess().getImportedNamespaceAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1083:6: ( ( rule__RegisteredRootClass__Group_2_1__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1083:6: ( ( rule__RegisteredRootClass__Group_2_1__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1084:1: ( rule__RegisteredRootClass__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRegisteredRootClassAccess().getGroup_2_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1085:1: ( rule__RegisteredRootClass__Group_2_1__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1085:2: rule__RegisteredRootClass__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__RegisteredRootClass__Group_2_1__0_in_rule__RegisteredRootClass__Alternatives_22244);
                    rule__RegisteredRootClass__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRegisteredRootClassAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__RegisteredRootClass__Alternatives_2"


    // $ANTLR start "rule__Fragment__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1094:1: rule__Fragment__Alternatives : ( ( ruleGenerator ) | ( ruleWeaver ) );
    public final void rule__Fragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1098:1: ( ( ruleGenerator ) | ( ruleWeaver ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==36) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1099:1: ( ruleGenerator )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1099:1: ( ruleGenerator )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1100:1: ruleGenerator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getGeneratorParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleGenerator_in_rule__Fragment__Alternatives2277);
                    ruleGenerator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFragmentAccess().getGeneratorParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1105:6: ( ruleWeaver )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1105:6: ( ruleWeaver )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1106:1: ruleWeaver
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getWeaverParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleWeaver_in_rule__Fragment__Alternatives2294);
                    ruleWeaver();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFragmentAccess().getWeaverParserRuleCall_1()); 
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
    // $ANTLR end "rule__Fragment__Alternatives"


    // $ANTLR start "rule__Weaver__Alternatives_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1116:1: rule__Weaver__Alternatives_2 : ( ( ( rule__Weaver__SourceModelAssignment_2_0 ) ) | ( 'link' ) );
    public final void rule__Weaver__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1120:1: ( ( ( rule__Weaver__SourceModelAssignment_2_0 ) ) | ( 'link' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==45) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1121:1: ( ( rule__Weaver__SourceModelAssignment_2_0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1121:1: ( ( rule__Weaver__SourceModelAssignment_2_0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1122:1: ( rule__Weaver__SourceModelAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWeaverAccess().getSourceModelAssignment_2_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1123:1: ( rule__Weaver__SourceModelAssignment_2_0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1123:2: rule__Weaver__SourceModelAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Weaver__SourceModelAssignment_2_0_in_rule__Weaver__Alternatives_22326);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1127:6: ( 'link' )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1127:6: ( 'link' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1128:1: 'link'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getWeaverAccess().getLinkKeyword_2_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Weaver__Alternatives_22345); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1140:1: rule__AspectModel__Alternatives : ( ( ruleCombinedModel ) | ( ruleSeparateModels ) );
    public final void rule__AspectModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1144:1: ( ( ruleCombinedModel ) | ( ruleSeparateModels ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==34) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1145:1: ( ruleCombinedModel )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1145:1: ( ruleCombinedModel )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1146:1: ruleCombinedModel
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getCombinedModelParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCombinedModel_in_rule__AspectModel__Alternatives2379);
                    ruleCombinedModel();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAspectModelAccess().getCombinedModelParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1151:6: ( ruleSeparateModels )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1151:6: ( ruleSeparateModels )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1152:1: ruleSeparateModels
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getSeparateModelsParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSeparateModels_in_rule__AspectModel__Alternatives2396);
                    ruleSeparateModels();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAspectModelAccess().getSeparateModelsParserRuleCall_1()); 
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


    // $ANTLR start "rule__CombinedModel__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1162:1: rule__CombinedModel__Alternatives : ( ( ruleTargetModel ) | ( ruleGenerator ) );
    public final void rule__CombinedModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1166:1: ( ( ruleTargetModel ) | ( ruleGenerator ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==36) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1167:1: ( ruleTargetModel )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1167:1: ( ruleTargetModel )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1168:1: ruleTargetModel
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombinedModelAccess().getTargetModelParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleTargetModel_in_rule__CombinedModel__Alternatives2428);
                    ruleTargetModel();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombinedModelAccess().getTargetModelParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1173:6: ( ruleGenerator )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1173:6: ( ruleGenerator )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1174:1: ruleGenerator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCombinedModelAccess().getGeneratorParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleGenerator_in_rule__CombinedModel__Alternatives2445);
                    ruleGenerator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCombinedModelAccess().getGeneratorParserRuleCall_1()); 
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
    // $ANTLR end "rule__CombinedModel__Alternatives"


    // $ANTLR start "rule__SourceModelSelector__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1184:1: rule__SourceModelSelector__Alternatives : ( ( ( rule__SourceModelSelector__Group_0__0 ) ) | ( ( rule__SourceModelSelector__Group_1__0 ) ) );
    public final void rule__SourceModelSelector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1188:1: ( ( ( rule__SourceModelSelector__Group_0__0 ) ) | ( ( rule__SourceModelSelector__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==45) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1189:1: ( ( rule__SourceModelSelector__Group_0__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1189:1: ( ( rule__SourceModelSelector__Group_0__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1190:1: ( rule__SourceModelSelector__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceModelSelectorAccess().getGroup_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1191:1: ( rule__SourceModelSelector__Group_0__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1191:2: rule__SourceModelSelector__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelSelector__Group_0__0_in_rule__SourceModelSelector__Alternatives2477);
                    rule__SourceModelSelector__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSourceModelSelectorAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1195:6: ( ( rule__SourceModelSelector__Group_1__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1195:6: ( ( rule__SourceModelSelector__Group_1__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1196:1: ( rule__SourceModelSelector__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSourceModelSelectorAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1197:1: ( rule__SourceModelSelector__Group_1__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1197:2: rule__SourceModelSelector__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelSelector__Group_1__0_in_rule__SourceModelSelector__Alternatives2495);
                    rule__SourceModelSelector__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSourceModelSelectorAccess().getGroup_1()); 
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
    // $ANTLR end "rule__SourceModelSelector__Alternatives"


    // $ANTLR start "rule__BasicConstraint__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1206:1: rule__BasicConstraint__Alternatives : ( ( ruleParenthesisConstraint ) | ( ruleOperand ) | ( ruleNegation ) );
    public final void rule__BasicConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1210:1: ( ( ruleParenthesisConstraint ) | ( ruleOperand ) | ( ruleNegation ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 47:
            case 50:
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1211:1: ( ruleParenthesisConstraint )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1211:1: ( ruleParenthesisConstraint )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1212:1: ruleParenthesisConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getParenthesisConstraintParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleParenthesisConstraint_in_rule__BasicConstraint__Alternatives2528);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1217:6: ( ruleOperand )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1217:6: ( ruleOperand )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1218:1: ruleOperand
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getOperandParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleOperand_in_rule__BasicConstraint__Alternatives2545);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1223:6: ( ruleNegation )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1223:6: ( ruleNegation )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1224:1: ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBasicConstraintAccess().getNegationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleNegation_in_rule__BasicConstraint__Alternatives2562);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1234:1: rule__Operand__Alternatives : ( ( ruleLiteral ) | ( ruleNodeProperty ) | ( ruleInstanceOf ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1238:1: ( ( ruleLiteral ) | ( ruleNodeProperty ) | ( ruleInstanceOf ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 50:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 47:
                {
                alt8=3;
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1239:1: ( ruleLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1239:1: ( ruleLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1240:1: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Operand__Alternatives2594);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1245:6: ( ruleNodeProperty )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1245:6: ( ruleNodeProperty )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1246:1: ruleNodeProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getNodePropertyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNodeProperty_in_rule__Operand__Alternatives2611);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1251:6: ( ruleInstanceOf )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1251:6: ( ruleInstanceOf )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1252:1: ruleInstanceOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperandAccess().getInstanceOfParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleInstanceOf_in_rule__Operand__Alternatives2628);
                    ruleInstanceOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperandAccess().getInstanceOfParserRuleCall_2()); 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1262:1: rule__TargetTraceModel__Alternatives : ( ( ruleTraceModel ) | ( ( rule__TargetTraceModel__Group_1__0 ) ) );
    public final void rule__TargetTraceModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1266:1: ( ( ruleTraceModel ) | ( ( rule__TargetTraceModel__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==48) ) {
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1267:1: ( ruleTraceModel )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1267:1: ( ruleTraceModel )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1268:1: ruleTraceModel
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTargetTraceModelAccess().getTraceModelParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleTraceModel_in_rule__TargetTraceModel__Alternatives2660);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1273:6: ( ( rule__TargetTraceModel__Group_1__0 ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1273:6: ( ( rule__TargetTraceModel__Group_1__0 ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1274:1: ( rule__TargetTraceModel__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTargetTraceModelAccess().getGroup_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1275:1: ( rule__TargetTraceModel__Group_1__0 )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1275:2: rule__TargetTraceModel__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TargetTraceModel__Group_1__0_in_rule__TargetTraceModel__Alternatives2677);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1284:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleArrayLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1288:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleArrayLiteral ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                alt10=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt10=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt10=4;
                }
                break;
            case 50:
                {
                alt10=5;
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1289:1: ( ruleStringLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1289:1: ( ruleStringLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1290:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2710);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1295:6: ( ruleIntLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1295:6: ( ruleIntLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1296:1: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives2727);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1301:6: ( ruleFloatLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1301:6: ( ruleFloatLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1302:1: ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2744);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1307:6: ( ruleBooleanLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1307:6: ( ruleBooleanLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1308:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2761);
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1313:6: ( ruleArrayLiteral )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1313:6: ( ruleArrayLiteral )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1314:1: ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives2778);
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


    // $ANTLR start "rule__ModelModifier__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1324:1: rule__ModelModifier__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'io' ) ) );
    public final void rule__ModelModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1328:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) | ( ( 'io' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt11=1;
                }
                break;
            case 16:
                {
                alt11=2;
                }
                break;
            case 17:
                {
                alt11=3;
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
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1329:1: ( ( 'in' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1329:1: ( ( 'in' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1330:1: ( 'in' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelModifierAccess().getINPUTEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1331:1: ( 'in' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1331:3: 'in'
                    {
                    match(input,15,FOLLOW_15_in_rule__ModelModifier__Alternatives2811); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelModifierAccess().getINPUTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1336:6: ( ( 'out' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1336:6: ( ( 'out' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1337:1: ( 'out' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelModifierAccess().getOUTPUTEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1338:1: ( 'out' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1338:3: 'out'
                    {
                    match(input,16,FOLLOW_16_in_rule__ModelModifier__Alternatives2832); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelModifierAccess().getOUTPUTEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1343:6: ( ( 'io' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1343:6: ( ( 'io' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1344:1: ( 'io' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelModifierAccess().getINTERMEDIATEEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1345:1: ( 'io' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1345:3: 'io'
                    {
                    match(input,17,FOLLOW_17_in_rule__ModelModifier__Alternatives2853); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelModifierAccess().getINTERMEDIATEEnumLiteralDeclaration_2()); 
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
    // $ANTLR end "rule__ModelModifier__Alternatives"


    // $ANTLR start "rule__LogicOperator__Alternatives"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1355:1: rule__LogicOperator__Alternatives : ( ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1359:1: ( ( ( '&' ) ) | ( ( '|' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1360:1: ( ( '&' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1360:1: ( ( '&' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1361:1: ( '&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1362:1: ( '&' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1362:3: '&'
                    {
                    match(input,18,FOLLOW_18_in_rule__LogicOperator__Alternatives2889); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1367:6: ( ( '|' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1367:6: ( ( '|' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1368:1: ( '|' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1369:1: ( '|' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1369:3: '|'
                    {
                    match(input,19,FOLLOW_19_in_rule__LogicOperator__Alternatives2910); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1379:1: rule__Comparator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '~' ) ) );
    public final void rule__Comparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1383:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) | ( ( '~' ) ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 21:
                {
                alt13=2;
                }
                break;
            case 22:
                {
                alt13=3;
                }
                break;
            case 23:
                {
                alt13=4;
                }
                break;
            case 24:
                {
                alt13=5;
                }
                break;
            case 25:
                {
                alt13=6;
                }
                break;
            case 26:
                {
                alt13=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1384:1: ( ( '==' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1384:1: ( ( '==' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1385:1: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1386:1: ( '==' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1386:3: '=='
                    {
                    match(input,20,FOLLOW_20_in_rule__Comparator__Alternatives2946); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1391:6: ( ( '!=' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1391:6: ( ( '!=' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1392:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getNEEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1393:1: ( '!=' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1393:3: '!='
                    {
                    match(input,21,FOLLOW_21_in_rule__Comparator__Alternatives2967); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getNEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1398:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1398:6: ( ( '>' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1399:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getGREnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1400:1: ( '>' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1400:3: '>'
                    {
                    match(input,22,FOLLOW_22_in_rule__Comparator__Alternatives2988); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getGREnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1405:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1405:6: ( ( '<' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1406:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLWEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1407:1: ( '<' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1407:3: '<'
                    {
                    match(input,23,FOLLOW_23_in_rule__Comparator__Alternatives3009); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getLWEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1412:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1412:6: ( ( '>=' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1413:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1414:1: ( '>=' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1414:3: '>='
                    {
                    match(input,24,FOLLOW_24_in_rule__Comparator__Alternatives3030); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getGEEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1419:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1419:6: ( ( '<=' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1420:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1421:1: ( '<=' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1421:3: '<='
                    {
                    match(input,25,FOLLOW_25_in_rule__Comparator__Alternatives3051); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparatorAccess().getLEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1426:6: ( ( '~' ) )
                    {
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1426:6: ( ( '~' ) )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1427:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparatorAccess().getLIKEEnumLiteralDeclaration_6()); 
                    }
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1428:1: ( '~' )
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1428:3: '~'
                    {
                    match(input,26,FOLLOW_26_in_rule__Comparator__Alternatives3072); if (state.failed) return ;

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


    // $ANTLR start "rule__GecoModel__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1440:1: rule__GecoModel__Group__0 : rule__GecoModel__Group__0__Impl rule__GecoModel__Group__1 ;
    public final void rule__GecoModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1444:1: ( rule__GecoModel__Group__0__Impl rule__GecoModel__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1445:2: rule__GecoModel__Group__0__Impl rule__GecoModel__Group__1
            {
            pushFollow(FOLLOW_rule__GecoModel__Group__0__Impl_in_rule__GecoModel__Group__03105);
            rule__GecoModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GecoModel__Group__1_in_rule__GecoModel__Group__03108);
            rule__GecoModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__Group__0"


    // $ANTLR start "rule__GecoModel__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1452:1: rule__GecoModel__Group__0__Impl : ( 'package' ) ;
    public final void rule__GecoModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1456:1: ( ( 'package' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1457:1: ( 'package' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1457:1: ( 'package' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1458:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGecoModelAccess().getPackageKeyword_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__GecoModel__Group__0__Impl3136); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGecoModelAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__Group__0__Impl"


    // $ANTLR start "rule__GecoModel__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1471:1: rule__GecoModel__Group__1 : rule__GecoModel__Group__1__Impl rule__GecoModel__Group__2 ;
    public final void rule__GecoModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1475:1: ( rule__GecoModel__Group__1__Impl rule__GecoModel__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1476:2: rule__GecoModel__Group__1__Impl rule__GecoModel__Group__2
            {
            pushFollow(FOLLOW_rule__GecoModel__Group__1__Impl_in_rule__GecoModel__Group__13167);
            rule__GecoModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GecoModel__Group__2_in_rule__GecoModel__Group__13170);
            rule__GecoModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__Group__1"


    // $ANTLR start "rule__GecoModel__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1483:1: rule__GecoModel__Group__1__Impl : ( ( rule__GecoModel__NameAssignment_1 ) ) ;
    public final void rule__GecoModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1487:1: ( ( ( rule__GecoModel__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1488:1: ( ( rule__GecoModel__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1488:1: ( ( rule__GecoModel__NameAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1489:1: ( rule__GecoModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGecoModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1490:1: ( rule__GecoModel__NameAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1490:2: rule__GecoModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GecoModel__NameAssignment_1_in_rule__GecoModel__Group__1__Impl3197);
            rule__GecoModel__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGecoModelAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__Group__1__Impl"


    // $ANTLR start "rule__GecoModel__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1500:1: rule__GecoModel__Group__2 : rule__GecoModel__Group__2__Impl rule__GecoModel__Group__3 ;
    public final void rule__GecoModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1504:1: ( rule__GecoModel__Group__2__Impl rule__GecoModel__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1505:2: rule__GecoModel__Group__2__Impl rule__GecoModel__Group__3
            {
            pushFollow(FOLLOW_rule__GecoModel__Group__2__Impl_in_rule__GecoModel__Group__23227);
            rule__GecoModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GecoModel__Group__3_in_rule__GecoModel__Group__23230);
            rule__GecoModel__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__Group__2"


    // $ANTLR start "rule__GecoModel__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1512:1: rule__GecoModel__Group__2__Impl : ( ( rule__GecoModel__ImportsAssignment_2 )* ) ;
    public final void rule__GecoModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1516:1: ( ( ( rule__GecoModel__ImportsAssignment_2 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1517:1: ( ( rule__GecoModel__ImportsAssignment_2 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1517:1: ( ( rule__GecoModel__ImportsAssignment_2 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1518:1: ( rule__GecoModel__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGecoModelAccess().getImportsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1519:1: ( rule__GecoModel__ImportsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1519:2: rule__GecoModel__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__GecoModel__ImportsAssignment_2_in_rule__GecoModel__Group__2__Impl3257);
            	    rule__GecoModel__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGecoModelAccess().getImportsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__Group__2__Impl"


    // $ANTLR start "rule__GecoModel__Group__3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1529:1: rule__GecoModel__Group__3 : rule__GecoModel__Group__3__Impl rule__GecoModel__Group__4 ;
    public final void rule__GecoModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1533:1: ( rule__GecoModel__Group__3__Impl rule__GecoModel__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1534:2: rule__GecoModel__Group__3__Impl rule__GecoModel__Group__4
            {
            pushFollow(FOLLOW_rule__GecoModel__Group__3__Impl_in_rule__GecoModel__Group__33288);
            rule__GecoModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GecoModel__Group__4_in_rule__GecoModel__Group__33291);
            rule__GecoModel__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__Group__3"


    // $ANTLR start "rule__GecoModel__Group__3__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1541:1: rule__GecoModel__Group__3__Impl : ( ( rule__GecoModel__RegisteredRootClassAssignment_3 )* ) ;
    public final void rule__GecoModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1545:1: ( ( ( rule__GecoModel__RegisteredRootClassAssignment_3 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1546:1: ( ( rule__GecoModel__RegisteredRootClassAssignment_3 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1546:1: ( ( rule__GecoModel__RegisteredRootClassAssignment_3 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1547:1: ( rule__GecoModel__RegisteredRootClassAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGecoModelAccess().getRegisteredRootClassAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1548:1: ( rule__GecoModel__RegisteredRootClassAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1548:2: rule__GecoModel__RegisteredRootClassAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__GecoModel__RegisteredRootClassAssignment_3_in_rule__GecoModel__Group__3__Impl3318);
            	    rule__GecoModel__RegisteredRootClassAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGecoModelAccess().getRegisteredRootClassAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__Group__3__Impl"


    // $ANTLR start "rule__GecoModel__Group__4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1558:1: rule__GecoModel__Group__4 : rule__GecoModel__Group__4__Impl rule__GecoModel__Group__5 ;
    public final void rule__GecoModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1562:1: ( rule__GecoModel__Group__4__Impl rule__GecoModel__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1563:2: rule__GecoModel__Group__4__Impl rule__GecoModel__Group__5
            {
            pushFollow(FOLLOW_rule__GecoModel__Group__4__Impl_in_rule__GecoModel__Group__43349);
            rule__GecoModel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__GecoModel__Group__5_in_rule__GecoModel__Group__43352);
            rule__GecoModel__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__Group__4"


    // $ANTLR start "rule__GecoModel__Group__4__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1570:1: rule__GecoModel__Group__4__Impl : ( ( rule__GecoModel__ModelsAssignment_4 )* ) ;
    public final void rule__GecoModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1574:1: ( ( ( rule__GecoModel__ModelsAssignment_4 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1575:1: ( ( rule__GecoModel__ModelsAssignment_4 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1575:1: ( ( rule__GecoModel__ModelsAssignment_4 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1576:1: ( rule__GecoModel__ModelsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGecoModelAccess().getModelsAssignment_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1577:1: ( rule__GecoModel__ModelsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1577:2: rule__GecoModel__ModelsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__GecoModel__ModelsAssignment_4_in_rule__GecoModel__Group__4__Impl3379);
            	    rule__GecoModel__ModelsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGecoModelAccess().getModelsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__Group__4__Impl"


    // $ANTLR start "rule__GecoModel__Group__5"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1587:1: rule__GecoModel__Group__5 : rule__GecoModel__Group__5__Impl ;
    public final void rule__GecoModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1591:1: ( rule__GecoModel__Group__5__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1592:2: rule__GecoModel__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__GecoModel__Group__5__Impl_in_rule__GecoModel__Group__53410);
            rule__GecoModel__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__Group__5"


    // $ANTLR start "rule__GecoModel__Group__5__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1598:1: rule__GecoModel__Group__5__Impl : ( ( rule__GecoModel__FragmentsAssignment_5 )* ) ;
    public final void rule__GecoModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1602:1: ( ( ( rule__GecoModel__FragmentsAssignment_5 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1603:1: ( ( rule__GecoModel__FragmentsAssignment_5 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1603:1: ( ( rule__GecoModel__FragmentsAssignment_5 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1604:1: ( rule__GecoModel__FragmentsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGecoModelAccess().getFragmentsAssignment_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1605:1: ( rule__GecoModel__FragmentsAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32||LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1605:2: rule__GecoModel__FragmentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__GecoModel__FragmentsAssignment_5_in_rule__GecoModel__Group__5__Impl3437);
            	    rule__GecoModel__FragmentsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGecoModelAccess().getFragmentsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__Group__5__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1627:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1631:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1632:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03480);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03483);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1639:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1643:1: ( ( 'import' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1644:1: ( 'import' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1644:1: ( 'import' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1645:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Import__Group__0__Impl3511); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1658:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1662:1: ( rule__Import__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1663:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13542);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1669:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1673:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1674:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1674:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1675:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1676:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1676:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3569);
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


    // $ANTLR start "rule__RegisteredRootClass__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1690:1: rule__RegisteredRootClass__Group__0 : rule__RegisteredRootClass__Group__0__Impl rule__RegisteredRootClass__Group__1 ;
    public final void rule__RegisteredRootClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1694:1: ( rule__RegisteredRootClass__Group__0__Impl rule__RegisteredRootClass__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1695:2: rule__RegisteredRootClass__Group__0__Impl rule__RegisteredRootClass__Group__1
            {
            pushFollow(FOLLOW_rule__RegisteredRootClass__Group__0__Impl_in_rule__RegisteredRootClass__Group__03603);
            rule__RegisteredRootClass__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredRootClass__Group__1_in_rule__RegisteredRootClass__Group__03606);
            rule__RegisteredRootClass__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__Group__0"


    // $ANTLR start "rule__RegisteredRootClass__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1702:1: rule__RegisteredRootClass__Group__0__Impl : ( 'register' ) ;
    public final void rule__RegisteredRootClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1706:1: ( ( 'register' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1707:1: ( 'register' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1707:1: ( 'register' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1708:1: 'register'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredRootClassAccess().getRegisterKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__RegisteredRootClass__Group__0__Impl3634); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredRootClassAccess().getRegisterKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__Group__0__Impl"


    // $ANTLR start "rule__RegisteredRootClass__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1721:1: rule__RegisteredRootClass__Group__1 : rule__RegisteredRootClass__Group__1__Impl rule__RegisteredRootClass__Group__2 ;
    public final void rule__RegisteredRootClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1725:1: ( rule__RegisteredRootClass__Group__1__Impl rule__RegisteredRootClass__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1726:2: rule__RegisteredRootClass__Group__1__Impl rule__RegisteredRootClass__Group__2
            {
            pushFollow(FOLLOW_rule__RegisteredRootClass__Group__1__Impl_in_rule__RegisteredRootClass__Group__13665);
            rule__RegisteredRootClass__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredRootClass__Group__2_in_rule__RegisteredRootClass__Group__13668);
            rule__RegisteredRootClass__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__Group__1"


    // $ANTLR start "rule__RegisteredRootClass__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1733:1: rule__RegisteredRootClass__Group__1__Impl : ( ( rule__RegisteredRootClass__NameAssignment_1 ) ) ;
    public final void rule__RegisteredRootClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1737:1: ( ( ( rule__RegisteredRootClass__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1738:1: ( ( rule__RegisteredRootClass__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1738:1: ( ( rule__RegisteredRootClass__NameAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1739:1: ( rule__RegisteredRootClass__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredRootClassAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1740:1: ( rule__RegisteredRootClass__NameAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1740:2: rule__RegisteredRootClass__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RegisteredRootClass__NameAssignment_1_in_rule__RegisteredRootClass__Group__1__Impl3695);
            rule__RegisteredRootClass__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredRootClassAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__Group__1__Impl"


    // $ANTLR start "rule__RegisteredRootClass__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1750:1: rule__RegisteredRootClass__Group__2 : rule__RegisteredRootClass__Group__2__Impl ;
    public final void rule__RegisteredRootClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1754:1: ( rule__RegisteredRootClass__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1755:2: rule__RegisteredRootClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RegisteredRootClass__Group__2__Impl_in_rule__RegisteredRootClass__Group__23725);
            rule__RegisteredRootClass__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__Group__2"


    // $ANTLR start "rule__RegisteredRootClass__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1761:1: rule__RegisteredRootClass__Group__2__Impl : ( ( rule__RegisteredRootClass__Alternatives_2 ) ) ;
    public final void rule__RegisteredRootClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1765:1: ( ( ( rule__RegisteredRootClass__Alternatives_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1766:1: ( ( rule__RegisteredRootClass__Alternatives_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1766:1: ( ( rule__RegisteredRootClass__Alternatives_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1767:1: ( rule__RegisteredRootClass__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredRootClassAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1768:1: ( rule__RegisteredRootClass__Alternatives_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1768:2: rule__RegisteredRootClass__Alternatives_2
            {
            pushFollow(FOLLOW_rule__RegisteredRootClass__Alternatives_2_in_rule__RegisteredRootClass__Group__2__Impl3752);
            rule__RegisteredRootClass__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredRootClassAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__Group__2__Impl"


    // $ANTLR start "rule__RegisteredRootClass__Group_2_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1784:1: rule__RegisteredRootClass__Group_2_1__0 : rule__RegisteredRootClass__Group_2_1__0__Impl rule__RegisteredRootClass__Group_2_1__1 ;
    public final void rule__RegisteredRootClass__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1788:1: ( rule__RegisteredRootClass__Group_2_1__0__Impl rule__RegisteredRootClass__Group_2_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1789:2: rule__RegisteredRootClass__Group_2_1__0__Impl rule__RegisteredRootClass__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__RegisteredRootClass__Group_2_1__0__Impl_in_rule__RegisteredRootClass__Group_2_1__03788);
            rule__RegisteredRootClass__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RegisteredRootClass__Group_2_1__1_in_rule__RegisteredRootClass__Group_2_1__03791);
            rule__RegisteredRootClass__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__Group_2_1__0"


    // $ANTLR start "rule__RegisteredRootClass__Group_2_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1796:1: rule__RegisteredRootClass__Group_2_1__0__Impl : ( ( rule__RegisteredRootClass__IsTextAssignment_2_1_0 ) ) ;
    public final void rule__RegisteredRootClass__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1800:1: ( ( ( rule__RegisteredRootClass__IsTextAssignment_2_1_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1801:1: ( ( rule__RegisteredRootClass__IsTextAssignment_2_1_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1801:1: ( ( rule__RegisteredRootClass__IsTextAssignment_2_1_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1802:1: ( rule__RegisteredRootClass__IsTextAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredRootClassAccess().getIsTextAssignment_2_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1803:1: ( rule__RegisteredRootClass__IsTextAssignment_2_1_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1803:2: rule__RegisteredRootClass__IsTextAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__RegisteredRootClass__IsTextAssignment_2_1_0_in_rule__RegisteredRootClass__Group_2_1__0__Impl3818);
            rule__RegisteredRootClass__IsTextAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredRootClassAccess().getIsTextAssignment_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__Group_2_1__0__Impl"


    // $ANTLR start "rule__RegisteredRootClass__Group_2_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1813:1: rule__RegisteredRootClass__Group_2_1__1 : rule__RegisteredRootClass__Group_2_1__1__Impl ;
    public final void rule__RegisteredRootClass__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1817:1: ( rule__RegisteredRootClass__Group_2_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1818:2: rule__RegisteredRootClass__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RegisteredRootClass__Group_2_1__1__Impl_in_rule__RegisteredRootClass__Group_2_1__13848);
            rule__RegisteredRootClass__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__Group_2_1__1"


    // $ANTLR start "rule__RegisteredRootClass__Group_2_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1824:1: rule__RegisteredRootClass__Group_2_1__1__Impl : ( ( rule__RegisteredRootClass__ExtensionAssignment_2_1_1 ) ) ;
    public final void rule__RegisteredRootClass__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1828:1: ( ( ( rule__RegisteredRootClass__ExtensionAssignment_2_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1829:1: ( ( rule__RegisteredRootClass__ExtensionAssignment_2_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1829:1: ( ( rule__RegisteredRootClass__ExtensionAssignment_2_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1830:1: ( rule__RegisteredRootClass__ExtensionAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredRootClassAccess().getExtensionAssignment_2_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1831:1: ( rule__RegisteredRootClass__ExtensionAssignment_2_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1831:2: rule__RegisteredRootClass__ExtensionAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__RegisteredRootClass__ExtensionAssignment_2_1_1_in_rule__RegisteredRootClass__Group_2_1__1__Impl3875);
            rule__RegisteredRootClass__ExtensionAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredRootClassAccess().getExtensionAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__Group_2_1__1__Impl"


    // $ANTLR start "rule__ModelSequence__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1845:1: rule__ModelSequence__Group__0 : rule__ModelSequence__Group__0__Impl rule__ModelSequence__Group__1 ;
    public final void rule__ModelSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1849:1: ( rule__ModelSequence__Group__0__Impl rule__ModelSequence__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1850:2: rule__ModelSequence__Group__0__Impl rule__ModelSequence__Group__1
            {
            pushFollow(FOLLOW_rule__ModelSequence__Group__0__Impl_in_rule__ModelSequence__Group__03909);
            rule__ModelSequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelSequence__Group__1_in_rule__ModelSequence__Group__03912);
            rule__ModelSequence__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group__0"


    // $ANTLR start "rule__ModelSequence__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1857:1: rule__ModelSequence__Group__0__Impl : ( 'model' ) ;
    public final void rule__ModelSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1861:1: ( ( 'model' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1862:1: ( 'model' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1862:1: ( 'model' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1863:1: 'model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelSequenceAccess().getModelKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__ModelSequence__Group__0__Impl3940); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelSequenceAccess().getModelKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group__0__Impl"


    // $ANTLR start "rule__ModelSequence__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1876:1: rule__ModelSequence__Group__1 : rule__ModelSequence__Group__1__Impl rule__ModelSequence__Group__2 ;
    public final void rule__ModelSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1880:1: ( rule__ModelSequence__Group__1__Impl rule__ModelSequence__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1881:2: rule__ModelSequence__Group__1__Impl rule__ModelSequence__Group__2
            {
            pushFollow(FOLLOW_rule__ModelSequence__Group__1__Impl_in_rule__ModelSequence__Group__13971);
            rule__ModelSequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelSequence__Group__2_in_rule__ModelSequence__Group__13974);
            rule__ModelSequence__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group__1"


    // $ANTLR start "rule__ModelSequence__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1888:1: rule__ModelSequence__Group__1__Impl : ( ( rule__ModelSequence__ModifierAssignment_1 ) ) ;
    public final void rule__ModelSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1892:1: ( ( ( rule__ModelSequence__ModifierAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1893:1: ( ( rule__ModelSequence__ModifierAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1893:1: ( ( rule__ModelSequence__ModifierAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1894:1: ( rule__ModelSequence__ModifierAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelSequenceAccess().getModifierAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1895:1: ( rule__ModelSequence__ModifierAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1895:2: rule__ModelSequence__ModifierAssignment_1
            {
            pushFollow(FOLLOW_rule__ModelSequence__ModifierAssignment_1_in_rule__ModelSequence__Group__1__Impl4001);
            rule__ModelSequence__ModifierAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelSequenceAccess().getModifierAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group__1__Impl"


    // $ANTLR start "rule__ModelSequence__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1905:1: rule__ModelSequence__Group__2 : rule__ModelSequence__Group__2__Impl rule__ModelSequence__Group__3 ;
    public final void rule__ModelSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1909:1: ( rule__ModelSequence__Group__2__Impl rule__ModelSequence__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1910:2: rule__ModelSequence__Group__2__Impl rule__ModelSequence__Group__3
            {
            pushFollow(FOLLOW_rule__ModelSequence__Group__2__Impl_in_rule__ModelSequence__Group__24031);
            rule__ModelSequence__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelSequence__Group__3_in_rule__ModelSequence__Group__24034);
            rule__ModelSequence__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group__2"


    // $ANTLR start "rule__ModelSequence__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1917:1: rule__ModelSequence__Group__2__Impl : ( ( rule__ModelSequence__TypeAssignment_2 ) ) ;
    public final void rule__ModelSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1921:1: ( ( ( rule__ModelSequence__TypeAssignment_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1922:1: ( ( rule__ModelSequence__TypeAssignment_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1922:1: ( ( rule__ModelSequence__TypeAssignment_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1923:1: ( rule__ModelSequence__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelSequenceAccess().getTypeAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1924:1: ( rule__ModelSequence__TypeAssignment_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1924:2: rule__ModelSequence__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ModelSequence__TypeAssignment_2_in_rule__ModelSequence__Group__2__Impl4061);
            rule__ModelSequence__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelSequenceAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group__2__Impl"


    // $ANTLR start "rule__ModelSequence__Group__3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1934:1: rule__ModelSequence__Group__3 : rule__ModelSequence__Group__3__Impl rule__ModelSequence__Group__4 ;
    public final void rule__ModelSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1938:1: ( rule__ModelSequence__Group__3__Impl rule__ModelSequence__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1939:2: rule__ModelSequence__Group__3__Impl rule__ModelSequence__Group__4
            {
            pushFollow(FOLLOW_rule__ModelSequence__Group__3__Impl_in_rule__ModelSequence__Group__34091);
            rule__ModelSequence__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelSequence__Group__4_in_rule__ModelSequence__Group__34094);
            rule__ModelSequence__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group__3"


    // $ANTLR start "rule__ModelSequence__Group__3__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1946:1: rule__ModelSequence__Group__3__Impl : ( ( rule__ModelSequence__ModelsAssignment_3 ) ) ;
    public final void rule__ModelSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1950:1: ( ( ( rule__ModelSequence__ModelsAssignment_3 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1951:1: ( ( rule__ModelSequence__ModelsAssignment_3 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1951:1: ( ( rule__ModelSequence__ModelsAssignment_3 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1952:1: ( rule__ModelSequence__ModelsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelSequenceAccess().getModelsAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1953:1: ( rule__ModelSequence__ModelsAssignment_3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1953:2: rule__ModelSequence__ModelsAssignment_3
            {
            pushFollow(FOLLOW_rule__ModelSequence__ModelsAssignment_3_in_rule__ModelSequence__Group__3__Impl4121);
            rule__ModelSequence__ModelsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelSequenceAccess().getModelsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group__3__Impl"


    // $ANTLR start "rule__ModelSequence__Group__4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1963:1: rule__ModelSequence__Group__4 : rule__ModelSequence__Group__4__Impl ;
    public final void rule__ModelSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1967:1: ( rule__ModelSequence__Group__4__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1968:2: rule__ModelSequence__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ModelSequence__Group__4__Impl_in_rule__ModelSequence__Group__44151);
            rule__ModelSequence__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group__4"


    // $ANTLR start "rule__ModelSequence__Group__4__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1974:1: rule__ModelSequence__Group__4__Impl : ( ( rule__ModelSequence__Group_4__0 )* ) ;
    public final void rule__ModelSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1978:1: ( ( ( rule__ModelSequence__Group_4__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1979:1: ( ( rule__ModelSequence__Group_4__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1979:1: ( ( rule__ModelSequence__Group_4__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1980:1: ( rule__ModelSequence__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelSequenceAccess().getGroup_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1981:1: ( rule__ModelSequence__Group_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:1981:2: rule__ModelSequence__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__ModelSequence__Group_4__0_in_rule__ModelSequence__Group__4__Impl4178);
            	    rule__ModelSequence__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelSequenceAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group__4__Impl"


    // $ANTLR start "rule__ModelSequence__Group_4__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2001:1: rule__ModelSequence__Group_4__0 : rule__ModelSequence__Group_4__0__Impl rule__ModelSequence__Group_4__1 ;
    public final void rule__ModelSequence__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2005:1: ( rule__ModelSequence__Group_4__0__Impl rule__ModelSequence__Group_4__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2006:2: rule__ModelSequence__Group_4__0__Impl rule__ModelSequence__Group_4__1
            {
            pushFollow(FOLLOW_rule__ModelSequence__Group_4__0__Impl_in_rule__ModelSequence__Group_4__04219);
            rule__ModelSequence__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelSequence__Group_4__1_in_rule__ModelSequence__Group_4__04222);
            rule__ModelSequence__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group_4__0"


    // $ANTLR start "rule__ModelSequence__Group_4__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2013:1: rule__ModelSequence__Group_4__0__Impl : ( ',' ) ;
    public final void rule__ModelSequence__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2017:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2018:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2018:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2019:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelSequenceAccess().getCommaKeyword_4_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ModelSequence__Group_4__0__Impl4250); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelSequenceAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group_4__0__Impl"


    // $ANTLR start "rule__ModelSequence__Group_4__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2032:1: rule__ModelSequence__Group_4__1 : rule__ModelSequence__Group_4__1__Impl ;
    public final void rule__ModelSequence__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2036:1: ( rule__ModelSequence__Group_4__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2037:2: rule__ModelSequence__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ModelSequence__Group_4__1__Impl_in_rule__ModelSequence__Group_4__14281);
            rule__ModelSequence__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group_4__1"


    // $ANTLR start "rule__ModelSequence__Group_4__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2043:1: rule__ModelSequence__Group_4__1__Impl : ( ( rule__ModelSequence__ModelsAssignment_4_1 ) ) ;
    public final void rule__ModelSequence__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2047:1: ( ( ( rule__ModelSequence__ModelsAssignment_4_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2048:1: ( ( rule__ModelSequence__ModelsAssignment_4_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2048:1: ( ( rule__ModelSequence__ModelsAssignment_4_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2049:1: ( rule__ModelSequence__ModelsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelSequenceAccess().getModelsAssignment_4_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2050:1: ( rule__ModelSequence__ModelsAssignment_4_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2050:2: rule__ModelSequence__ModelsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ModelSequence__ModelsAssignment_4_1_in_rule__ModelSequence__Group_4__1__Impl4308);
            rule__ModelSequence__ModelsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelSequenceAccess().getModelsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__Group_4__1__Impl"


    // $ANTLR start "rule__Weaver__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2064:1: rule__Weaver__Group__0 : rule__Weaver__Group__0__Impl rule__Weaver__Group__1 ;
    public final void rule__Weaver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2068:1: ( rule__Weaver__Group__0__Impl rule__Weaver__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2069:2: rule__Weaver__Group__0__Impl rule__Weaver__Group__1
            {
            pushFollow(FOLLOW_rule__Weaver__Group__0__Impl_in_rule__Weaver__Group__04342);
            rule__Weaver__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__1_in_rule__Weaver__Group__04345);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2076:1: rule__Weaver__Group__0__Impl : ( 'weave' ) ;
    public final void rule__Weaver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2080:1: ( ( 'weave' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2081:1: ( 'weave' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2081:1: ( 'weave' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2082:1: 'weave'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getWeaveKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Weaver__Group__0__Impl4373); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2095:1: rule__Weaver__Group__1 : rule__Weaver__Group__1__Impl rule__Weaver__Group__2 ;
    public final void rule__Weaver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2099:1: ( rule__Weaver__Group__1__Impl rule__Weaver__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2100:2: rule__Weaver__Group__1__Impl rule__Weaver__Group__2
            {
            pushFollow(FOLLOW_rule__Weaver__Group__1__Impl_in_rule__Weaver__Group__14404);
            rule__Weaver__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__2_in_rule__Weaver__Group__14407);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2107:1: rule__Weaver__Group__1__Impl : ( ( rule__Weaver__ReferenceAssignment_1 ) ) ;
    public final void rule__Weaver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2111:1: ( ( ( rule__Weaver__ReferenceAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2112:1: ( ( rule__Weaver__ReferenceAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2112:1: ( ( rule__Weaver__ReferenceAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2113:1: ( rule__Weaver__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2114:1: ( rule__Weaver__ReferenceAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2114:2: rule__Weaver__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Weaver__ReferenceAssignment_1_in_rule__Weaver__Group__1__Impl4434);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2124:1: rule__Weaver__Group__2 : rule__Weaver__Group__2__Impl rule__Weaver__Group__3 ;
    public final void rule__Weaver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2128:1: ( rule__Weaver__Group__2__Impl rule__Weaver__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2129:2: rule__Weaver__Group__2__Impl rule__Weaver__Group__3
            {
            pushFollow(FOLLOW_rule__Weaver__Group__2__Impl_in_rule__Weaver__Group__24464);
            rule__Weaver__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__3_in_rule__Weaver__Group__24467);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2136:1: rule__Weaver__Group__2__Impl : ( ( rule__Weaver__Alternatives_2 ) ) ;
    public final void rule__Weaver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2140:1: ( ( ( rule__Weaver__Alternatives_2 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2141:1: ( ( rule__Weaver__Alternatives_2 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2141:1: ( ( rule__Weaver__Alternatives_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2142:1: ( rule__Weaver__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getAlternatives_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2143:1: ( rule__Weaver__Alternatives_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2143:2: rule__Weaver__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Weaver__Alternatives_2_in_rule__Weaver__Group__2__Impl4494);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2153:1: rule__Weaver__Group__3 : rule__Weaver__Group__3__Impl rule__Weaver__Group__4 ;
    public final void rule__Weaver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2157:1: ( rule__Weaver__Group__3__Impl rule__Weaver__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2158:2: rule__Weaver__Group__3__Impl rule__Weaver__Group__4
            {
            pushFollow(FOLLOW_rule__Weaver__Group__3__Impl_in_rule__Weaver__Group__34524);
            rule__Weaver__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group__4_in_rule__Weaver__Group__34527);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2165:1: rule__Weaver__Group__3__Impl : ( ( rule__Weaver__AspectModelAssignment_3 ) ) ;
    public final void rule__Weaver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2169:1: ( ( ( rule__Weaver__AspectModelAssignment_3 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2170:1: ( ( rule__Weaver__AspectModelAssignment_3 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2170:1: ( ( rule__Weaver__AspectModelAssignment_3 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2171:1: ( rule__Weaver__AspectModelAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getAspectModelAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2172:1: ( rule__Weaver__AspectModelAssignment_3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2172:2: rule__Weaver__AspectModelAssignment_3
            {
            pushFollow(FOLLOW_rule__Weaver__AspectModelAssignment_3_in_rule__Weaver__Group__3__Impl4554);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2182:1: rule__Weaver__Group__4 : rule__Weaver__Group__4__Impl ;
    public final void rule__Weaver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2186:1: ( rule__Weaver__Group__4__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2187:2: rule__Weaver__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Weaver__Group__4__Impl_in_rule__Weaver__Group__44584);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2193:1: rule__Weaver__Group__4__Impl : ( ( rule__Weaver__Group_4__0 )? ) ;
    public final void rule__Weaver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2197:1: ( ( ( rule__Weaver__Group_4__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2198:1: ( ( rule__Weaver__Group_4__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2198:1: ( ( rule__Weaver__Group_4__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2199:1: ( rule__Weaver__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getGroup_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2200:1: ( rule__Weaver__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2200:2: rule__Weaver__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Weaver__Group_4__0_in_rule__Weaver__Group__4__Impl4611);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2220:1: rule__Weaver__Group_4__0 : rule__Weaver__Group_4__0__Impl rule__Weaver__Group_4__1 ;
    public final void rule__Weaver__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2224:1: ( rule__Weaver__Group_4__0__Impl rule__Weaver__Group_4__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2225:2: rule__Weaver__Group_4__0__Impl rule__Weaver__Group_4__1
            {
            pushFollow(FOLLOW_rule__Weaver__Group_4__0__Impl_in_rule__Weaver__Group_4__04652);
            rule__Weaver__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Weaver__Group_4__1_in_rule__Weaver__Group_4__04655);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2232:1: rule__Weaver__Group_4__0__Impl : ( '=>' ) ;
    public final void rule__Weaver__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2236:1: ( ( '=>' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2237:1: ( '=>' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2237:1: ( '=>' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2238:1: '=>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getEqualsSignGreaterThanSignKeyword_4_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Weaver__Group_4__0__Impl4683); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2251:1: rule__Weaver__Group_4__1 : rule__Weaver__Group_4__1__Impl ;
    public final void rule__Weaver__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2255:1: ( rule__Weaver__Group_4__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2256:2: rule__Weaver__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Weaver__Group_4__1__Impl_in_rule__Weaver__Group_4__14714);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2262:1: rule__Weaver__Group_4__1__Impl : ( ( rule__Weaver__TargetModelAssignment_4_1 ) ) ;
    public final void rule__Weaver__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2266:1: ( ( ( rule__Weaver__TargetModelAssignment_4_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2267:1: ( ( rule__Weaver__TargetModelAssignment_4_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2267:1: ( ( rule__Weaver__TargetModelAssignment_4_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2268:1: ( rule__Weaver__TargetModelAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getTargetModelAssignment_4_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2269:1: ( rule__Weaver__TargetModelAssignment_4_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2269:2: rule__Weaver__TargetModelAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Weaver__TargetModelAssignment_4_1_in_rule__Weaver__Group_4__1__Impl4741);
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


    // $ANTLR start "rule__SeparateModels__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2283:1: rule__SeparateModels__Group__0 : rule__SeparateModels__Group__0__Impl rule__SeparateModels__Group__1 ;
    public final void rule__SeparateModels__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2287:1: ( rule__SeparateModels__Group__0__Impl rule__SeparateModels__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2288:2: rule__SeparateModels__Group__0__Impl rule__SeparateModels__Group__1
            {
            pushFollow(FOLLOW_rule__SeparateModels__Group__0__Impl_in_rule__SeparateModels__Group__04775);
            rule__SeparateModels__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SeparateModels__Group__1_in_rule__SeparateModels__Group__04778);
            rule__SeparateModels__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeparateModels__Group__0"


    // $ANTLR start "rule__SeparateModels__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2295:1: rule__SeparateModels__Group__0__Impl : ( 'pointcut' ) ;
    public final void rule__SeparateModels__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2299:1: ( ( 'pointcut' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2300:1: ( 'pointcut' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2300:1: ( 'pointcut' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2301:1: 'pointcut'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeparateModelsAccess().getPointcutKeyword_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__SeparateModels__Group__0__Impl4806); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeparateModelsAccess().getPointcutKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeparateModels__Group__0__Impl"


    // $ANTLR start "rule__SeparateModels__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2314:1: rule__SeparateModels__Group__1 : rule__SeparateModels__Group__1__Impl rule__SeparateModels__Group__2 ;
    public final void rule__SeparateModels__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2318:1: ( rule__SeparateModels__Group__1__Impl rule__SeparateModels__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2319:2: rule__SeparateModels__Group__1__Impl rule__SeparateModels__Group__2
            {
            pushFollow(FOLLOW_rule__SeparateModels__Group__1__Impl_in_rule__SeparateModels__Group__14837);
            rule__SeparateModels__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SeparateModels__Group__2_in_rule__SeparateModels__Group__14840);
            rule__SeparateModels__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeparateModels__Group__1"


    // $ANTLR start "rule__SeparateModels__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2326:1: rule__SeparateModels__Group__1__Impl : ( ( rule__SeparateModels__PointcutAssignment_1 ) ) ;
    public final void rule__SeparateModels__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2330:1: ( ( ( rule__SeparateModels__PointcutAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2331:1: ( ( rule__SeparateModels__PointcutAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2331:1: ( ( rule__SeparateModels__PointcutAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2332:1: ( rule__SeparateModels__PointcutAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeparateModelsAccess().getPointcutAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2333:1: ( rule__SeparateModels__PointcutAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2333:2: rule__SeparateModels__PointcutAssignment_1
            {
            pushFollow(FOLLOW_rule__SeparateModels__PointcutAssignment_1_in_rule__SeparateModels__Group__1__Impl4867);
            rule__SeparateModels__PointcutAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeparateModelsAccess().getPointcutAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeparateModels__Group__1__Impl"


    // $ANTLR start "rule__SeparateModels__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2343:1: rule__SeparateModels__Group__2 : rule__SeparateModels__Group__2__Impl rule__SeparateModels__Group__3 ;
    public final void rule__SeparateModels__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2347:1: ( rule__SeparateModels__Group__2__Impl rule__SeparateModels__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2348:2: rule__SeparateModels__Group__2__Impl rule__SeparateModels__Group__3
            {
            pushFollow(FOLLOW_rule__SeparateModels__Group__2__Impl_in_rule__SeparateModels__Group__24897);
            rule__SeparateModels__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SeparateModels__Group__3_in_rule__SeparateModels__Group__24900);
            rule__SeparateModels__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeparateModels__Group__2"


    // $ANTLR start "rule__SeparateModels__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2355:1: rule__SeparateModels__Group__2__Impl : ( 'advice' ) ;
    public final void rule__SeparateModels__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2359:1: ( ( 'advice' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2360:1: ( 'advice' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2360:1: ( 'advice' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2361:1: 'advice'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeparateModelsAccess().getAdviceKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__SeparateModels__Group__2__Impl4928); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeparateModelsAccess().getAdviceKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeparateModels__Group__2__Impl"


    // $ANTLR start "rule__SeparateModels__Group__3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2374:1: rule__SeparateModels__Group__3 : rule__SeparateModels__Group__3__Impl ;
    public final void rule__SeparateModels__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2378:1: ( rule__SeparateModels__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2379:2: rule__SeparateModels__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SeparateModels__Group__3__Impl_in_rule__SeparateModels__Group__34959);
            rule__SeparateModels__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeparateModels__Group__3"


    // $ANTLR start "rule__SeparateModels__Group__3__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2385:1: rule__SeparateModels__Group__3__Impl : ( ( rule__SeparateModels__AdviceAssignment_3 ) ) ;
    public final void rule__SeparateModels__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2389:1: ( ( ( rule__SeparateModels__AdviceAssignment_3 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2390:1: ( ( rule__SeparateModels__AdviceAssignment_3 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2390:1: ( ( rule__SeparateModels__AdviceAssignment_3 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2391:1: ( rule__SeparateModels__AdviceAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeparateModelsAccess().getAdviceAssignment_3()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2392:1: ( rule__SeparateModels__AdviceAssignment_3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2392:2: rule__SeparateModels__AdviceAssignment_3
            {
            pushFollow(FOLLOW_rule__SeparateModels__AdviceAssignment_3_in_rule__SeparateModels__Group__3__Impl4986);
            rule__SeparateModels__AdviceAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeparateModelsAccess().getAdviceAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeparateModels__Group__3__Impl"


    // $ANTLR start "rule__Generator__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2410:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
    public final void rule__Generator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2414:1: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2415:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
            {
            pushFollow(FOLLOW_rule__Generator__Group__0__Impl_in_rule__Generator__Group__05024);
            rule__Generator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__1_in_rule__Generator__Group__05027);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2422:1: rule__Generator__Group__0__Impl : ( 'generate' ) ;
    public final void rule__Generator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2426:1: ( ( 'generate' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2427:1: ( 'generate' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2427:1: ( 'generate' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2428:1: 'generate'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGenerateKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Generator__Group__0__Impl5055); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2441:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
    public final void rule__Generator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2445:1: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2446:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
            {
            pushFollow(FOLLOW_rule__Generator__Group__1__Impl_in_rule__Generator__Group__15086);
            rule__Generator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__2_in_rule__Generator__Group__15089);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2453:1: rule__Generator__Group__1__Impl : ( ( rule__Generator__ReferenceAssignment_1 ) ) ;
    public final void rule__Generator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2457:1: ( ( ( rule__Generator__ReferenceAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2458:1: ( ( rule__Generator__ReferenceAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2458:1: ( ( rule__Generator__ReferenceAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2459:1: ( rule__Generator__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2460:1: ( rule__Generator__ReferenceAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2460:2: rule__Generator__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Generator__ReferenceAssignment_1_in_rule__Generator__Group__1__Impl5116);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2470:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
    public final void rule__Generator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2474:1: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2475:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
            {
            pushFollow(FOLLOW_rule__Generator__Group__2__Impl_in_rule__Generator__Group__25146);
            rule__Generator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__3_in_rule__Generator__Group__25149);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2482:1: rule__Generator__Group__2__Impl : ( ( rule__Generator__Group_2__0 )? ) ;
    public final void rule__Generator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2486:1: ( ( ( rule__Generator__Group_2__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2487:1: ( ( rule__Generator__Group_2__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2487:1: ( ( rule__Generator__Group_2__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2488:1: ( rule__Generator__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2489:1: ( rule__Generator__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2489:2: rule__Generator__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_2__0_in_rule__Generator__Group__2__Impl5176);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2499:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
    public final void rule__Generator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2503:1: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2504:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
            {
            pushFollow(FOLLOW_rule__Generator__Group__3__Impl_in_rule__Generator__Group__35207);
            rule__Generator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__4_in_rule__Generator__Group__35210);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2511:1: rule__Generator__Group__3__Impl : ( 'source' ) ;
    public final void rule__Generator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2515:1: ( ( 'source' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2516:1: ( 'source' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2516:1: ( 'source' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2517:1: 'source'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceKeyword_3()); 
            }
            match(input,37,FOLLOW_37_in_rule__Generator__Group__3__Impl5238); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2530:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl rule__Generator__Group__5 ;
    public final void rule__Generator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2534:1: ( rule__Generator__Group__4__Impl rule__Generator__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2535:2: rule__Generator__Group__4__Impl rule__Generator__Group__5
            {
            pushFollow(FOLLOW_rule__Generator__Group__4__Impl_in_rule__Generator__Group__45269);
            rule__Generator__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__5_in_rule__Generator__Group__45272);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2542:1: rule__Generator__Group__4__Impl : ( ( rule__Generator__SourceModelAssignment_4 ) ) ;
    public final void rule__Generator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2546:1: ( ( ( rule__Generator__SourceModelAssignment_4 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2547:1: ( ( rule__Generator__SourceModelAssignment_4 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2547:1: ( ( rule__Generator__SourceModelAssignment_4 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2548:1: ( rule__Generator__SourceModelAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceModelAssignment_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2549:1: ( rule__Generator__SourceModelAssignment_4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2549:2: rule__Generator__SourceModelAssignment_4
            {
            pushFollow(FOLLOW_rule__Generator__SourceModelAssignment_4_in_rule__Generator__Group__4__Impl5299);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2559:1: rule__Generator__Group__5 : rule__Generator__Group__5__Impl rule__Generator__Group__6 ;
    public final void rule__Generator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2563:1: ( rule__Generator__Group__5__Impl rule__Generator__Group__6 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2564:2: rule__Generator__Group__5__Impl rule__Generator__Group__6
            {
            pushFollow(FOLLOW_rule__Generator__Group__5__Impl_in_rule__Generator__Group__55329);
            rule__Generator__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group__6_in_rule__Generator__Group__55332);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2571:1: rule__Generator__Group__5__Impl : ( ( rule__Generator__Group_5__0 )? ) ;
    public final void rule__Generator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2575:1: ( ( ( rule__Generator__Group_5__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2576:1: ( ( rule__Generator__Group_5__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2576:1: ( ( rule__Generator__Group_5__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2577:1: ( rule__Generator__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2578:1: ( rule__Generator__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2578:2: rule__Generator__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_5__0_in_rule__Generator__Group__5__Impl5359);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2588:1: rule__Generator__Group__6 : rule__Generator__Group__6__Impl ;
    public final void rule__Generator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2592:1: ( rule__Generator__Group__6__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2593:2: rule__Generator__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group__6__Impl_in_rule__Generator__Group__65390);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2599:1: rule__Generator__Group__6__Impl : ( ( rule__Generator__Group_6__0 )? ) ;
    public final void rule__Generator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2603:1: ( ( ( rule__Generator__Group_6__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2604:1: ( ( rule__Generator__Group_6__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2604:1: ( ( rule__Generator__Group_6__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2605:1: ( rule__Generator__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_6()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2606:1: ( rule__Generator__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2606:2: rule__Generator__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_6__0_in_rule__Generator__Group__6__Impl5417);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2630:1: rule__Generator__Group_2__0 : rule__Generator__Group_2__0__Impl rule__Generator__Group_2__1 ;
    public final void rule__Generator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2634:1: ( rule__Generator__Group_2__0__Impl rule__Generator__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2635:2: rule__Generator__Group_2__0__Impl rule__Generator__Group_2__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_2__0__Impl_in_rule__Generator__Group_2__05462);
            rule__Generator__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_2__1_in_rule__Generator__Group_2__05465);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2642:1: rule__Generator__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Generator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2646:1: ( ( '(' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2647:1: ( '(' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2647:1: ( '(' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2648:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Generator__Group_2__0__Impl5493); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2661:1: rule__Generator__Group_2__1 : rule__Generator__Group_2__1__Impl rule__Generator__Group_2__2 ;
    public final void rule__Generator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2665:1: ( rule__Generator__Group_2__1__Impl rule__Generator__Group_2__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2666:2: rule__Generator__Group_2__1__Impl rule__Generator__Group_2__2
            {
            pushFollow(FOLLOW_rule__Generator__Group_2__1__Impl_in_rule__Generator__Group_2__15524);
            rule__Generator__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_2__2_in_rule__Generator__Group_2__15527);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2673:1: rule__Generator__Group_2__1__Impl : ( ( rule__Generator__SourceAuxModelsAssignment_2_1 ) ) ;
    public final void rule__Generator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2677:1: ( ( ( rule__Generator__SourceAuxModelsAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2678:1: ( ( rule__Generator__SourceAuxModelsAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2678:1: ( ( rule__Generator__SourceAuxModelsAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2679:1: ( rule__Generator__SourceAuxModelsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceAuxModelsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2680:1: ( rule__Generator__SourceAuxModelsAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2680:2: rule__Generator__SourceAuxModelsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Generator__SourceAuxModelsAssignment_2_1_in_rule__Generator__Group_2__1__Impl5554);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2690:1: rule__Generator__Group_2__2 : rule__Generator__Group_2__2__Impl rule__Generator__Group_2__3 ;
    public final void rule__Generator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2694:1: ( rule__Generator__Group_2__2__Impl rule__Generator__Group_2__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2695:2: rule__Generator__Group_2__2__Impl rule__Generator__Group_2__3
            {
            pushFollow(FOLLOW_rule__Generator__Group_2__2__Impl_in_rule__Generator__Group_2__25584);
            rule__Generator__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_2__3_in_rule__Generator__Group_2__25587);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2702:1: rule__Generator__Group_2__2__Impl : ( ( rule__Generator__Group_2_2__0 )* ) ;
    public final void rule__Generator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2706:1: ( ( ( rule__Generator__Group_2_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2707:1: ( ( rule__Generator__Group_2_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2707:1: ( ( rule__Generator__Group_2_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2708:1: ( rule__Generator__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_2_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2709:1: ( rule__Generator__Group_2_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2709:2: rule__Generator__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Generator__Group_2_2__0_in_rule__Generator__Group_2__2__Impl5614);
            	    rule__Generator__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2719:1: rule__Generator__Group_2__3 : rule__Generator__Group_2__3__Impl ;
    public final void rule__Generator__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2723:1: ( rule__Generator__Group_2__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2724:2: rule__Generator__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_2__3__Impl_in_rule__Generator__Group_2__35645);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2730:1: rule__Generator__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Generator__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2734:1: ( ( ')' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2735:1: ( ')' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2735:1: ( ')' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2736:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,39,FOLLOW_39_in_rule__Generator__Group_2__3__Impl5673); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2757:1: rule__Generator__Group_2_2__0 : rule__Generator__Group_2_2__0__Impl rule__Generator__Group_2_2__1 ;
    public final void rule__Generator__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2761:1: ( rule__Generator__Group_2_2__0__Impl rule__Generator__Group_2_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2762:2: rule__Generator__Group_2_2__0__Impl rule__Generator__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_2_2__0__Impl_in_rule__Generator__Group_2_2__05712);
            rule__Generator__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_2_2__1_in_rule__Generator__Group_2_2__05715);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2769:1: rule__Generator__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Generator__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2773:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2774:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2774:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2775:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Generator__Group_2_2__0__Impl5743); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2788:1: rule__Generator__Group_2_2__1 : rule__Generator__Group_2_2__1__Impl ;
    public final void rule__Generator__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2792:1: ( rule__Generator__Group_2_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2793:2: rule__Generator__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_2_2__1__Impl_in_rule__Generator__Group_2_2__15774);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2799:1: rule__Generator__Group_2_2__1__Impl : ( ( rule__Generator__SourceAuxModelsAssignment_2_2_1 ) ) ;
    public final void rule__Generator__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2803:1: ( ( ( rule__Generator__SourceAuxModelsAssignment_2_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2804:1: ( ( rule__Generator__SourceAuxModelsAssignment_2_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2804:1: ( ( rule__Generator__SourceAuxModelsAssignment_2_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2805:1: ( rule__Generator__SourceAuxModelsAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceAuxModelsAssignment_2_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2806:1: ( rule__Generator__SourceAuxModelsAssignment_2_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2806:2: rule__Generator__SourceAuxModelsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Generator__SourceAuxModelsAssignment_2_2_1_in_rule__Generator__Group_2_2__1__Impl5801);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2820:1: rule__Generator__Group_5__0 : rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1 ;
    public final void rule__Generator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2824:1: ( rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2825:2: rule__Generator__Group_5__0__Impl rule__Generator__Group_5__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_5__0__Impl_in_rule__Generator__Group_5__05835);
            rule__Generator__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_5__1_in_rule__Generator__Group_5__05838);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2832:1: rule__Generator__Group_5__0__Impl : ( 'target' ) ;
    public final void rule__Generator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2836:1: ( ( 'target' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2837:1: ( 'target' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2837:1: ( 'target' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2838:1: 'target'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetKeyword_5_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Generator__Group_5__0__Impl5866); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2851:1: rule__Generator__Group_5__1 : rule__Generator__Group_5__1__Impl ;
    public final void rule__Generator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2855:1: ( rule__Generator__Group_5__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2856:2: rule__Generator__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_5__1__Impl_in_rule__Generator__Group_5__15897);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2862:1: rule__Generator__Group_5__1__Impl : ( ( rule__Generator__TargetModelAssignment_5_1 ) ) ;
    public final void rule__Generator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2866:1: ( ( ( rule__Generator__TargetModelAssignment_5_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2867:1: ( ( rule__Generator__TargetModelAssignment_5_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2867:1: ( ( rule__Generator__TargetModelAssignment_5_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2868:1: ( rule__Generator__TargetModelAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetModelAssignment_5_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2869:1: ( rule__Generator__TargetModelAssignment_5_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2869:2: rule__Generator__TargetModelAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Generator__TargetModelAssignment_5_1_in_rule__Generator__Group_5__1__Impl5924);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2883:1: rule__Generator__Group_6__0 : rule__Generator__Group_6__0__Impl rule__Generator__Group_6__1 ;
    public final void rule__Generator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2887:1: ( rule__Generator__Group_6__0__Impl rule__Generator__Group_6__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2888:2: rule__Generator__Group_6__0__Impl rule__Generator__Group_6__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_6__0__Impl_in_rule__Generator__Group_6__05958);
            rule__Generator__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6__1_in_rule__Generator__Group_6__05961);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2895:1: rule__Generator__Group_6__0__Impl : ( 'trace' ) ;
    public final void rule__Generator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2899:1: ( ( 'trace' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2900:1: ( 'trace' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2900:1: ( 'trace' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2901:1: 'trace'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTraceKeyword_6_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Generator__Group_6__0__Impl5989); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2914:1: rule__Generator__Group_6__1 : rule__Generator__Group_6__1__Impl rule__Generator__Group_6__2 ;
    public final void rule__Generator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2918:1: ( rule__Generator__Group_6__1__Impl rule__Generator__Group_6__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2919:2: rule__Generator__Group_6__1__Impl rule__Generator__Group_6__2
            {
            pushFollow(FOLLOW_rule__Generator__Group_6__1__Impl_in_rule__Generator__Group_6__16020);
            rule__Generator__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6__2_in_rule__Generator__Group_6__16023);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2926:1: rule__Generator__Group_6__1__Impl : ( ( rule__Generator__Group_6_1__0 )? ) ;
    public final void rule__Generator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2930:1: ( ( ( rule__Generator__Group_6_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2931:1: ( ( rule__Generator__Group_6_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2931:1: ( ( rule__Generator__Group_6_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2932:1: ( rule__Generator__Group_6_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_6_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2933:1: ( rule__Generator__Group_6_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2933:2: rule__Generator__Group_6_1__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_6_1__0_in_rule__Generator__Group_6__1__Impl6050);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2943:1: rule__Generator__Group_6__2 : rule__Generator__Group_6__2__Impl ;
    public final void rule__Generator__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2947:1: ( rule__Generator__Group_6__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2948:2: rule__Generator__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_6__2__Impl_in_rule__Generator__Group_6__26081);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2954:1: rule__Generator__Group_6__2__Impl : ( ( rule__Generator__Group_6_2__0 )? ) ;
    public final void rule__Generator__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2958:1: ( ( ( rule__Generator__Group_6_2__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2959:1: ( ( rule__Generator__Group_6_2__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2959:1: ( ( rule__Generator__Group_6_2__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2960:1: ( rule__Generator__Group_6_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_6_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2961:1: ( rule__Generator__Group_6_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==15) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2961:2: rule__Generator__Group_6_2__0
                    {
                    pushFollow(FOLLOW_rule__Generator__Group_6_2__0_in_rule__Generator__Group_6__2__Impl6108);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2977:1: rule__Generator__Group_6_1__0 : rule__Generator__Group_6_1__0__Impl rule__Generator__Group_6_1__1 ;
    public final void rule__Generator__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2981:1: ( rule__Generator__Group_6_1__0__Impl rule__Generator__Group_6_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2982:2: rule__Generator__Group_6_1__0__Impl rule__Generator__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_1__0__Impl_in_rule__Generator__Group_6_1__06145);
            rule__Generator__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6_1__1_in_rule__Generator__Group_6_1__06148);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2989:1: rule__Generator__Group_6_1__0__Impl : ( 'out' ) ;
    public final void rule__Generator__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2993:1: ( ( 'out' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2994:1: ( 'out' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2994:1: ( 'out' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:2995:1: 'out'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getOutKeyword_6_1_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Generator__Group_6_1__0__Impl6176); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3008:1: rule__Generator__Group_6_1__1 : rule__Generator__Group_6_1__1__Impl ;
    public final void rule__Generator__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3012:1: ( rule__Generator__Group_6_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3013:2: rule__Generator__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_1__1__Impl_in_rule__Generator__Group_6_1__16207);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3019:1: rule__Generator__Group_6_1__1__Impl : ( ( rule__Generator__TargetTraceModelAssignment_6_1_1 ) ) ;
    public final void rule__Generator__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3023:1: ( ( ( rule__Generator__TargetTraceModelAssignment_6_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3024:1: ( ( rule__Generator__TargetTraceModelAssignment_6_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3024:1: ( ( rule__Generator__TargetTraceModelAssignment_6_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3025:1: ( rule__Generator__TargetTraceModelAssignment_6_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetTraceModelAssignment_6_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3026:1: ( rule__Generator__TargetTraceModelAssignment_6_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3026:2: rule__Generator__TargetTraceModelAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__Generator__TargetTraceModelAssignment_6_1_1_in_rule__Generator__Group_6_1__1__Impl6234);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3040:1: rule__Generator__Group_6_2__0 : rule__Generator__Group_6_2__0__Impl rule__Generator__Group_6_2__1 ;
    public final void rule__Generator__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3044:1: ( rule__Generator__Group_6_2__0__Impl rule__Generator__Group_6_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3045:2: rule__Generator__Group_6_2__0__Impl rule__Generator__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_2__0__Impl_in_rule__Generator__Group_6_2__06268);
            rule__Generator__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6_2__1_in_rule__Generator__Group_6_2__06271);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3052:1: rule__Generator__Group_6_2__0__Impl : ( 'in' ) ;
    public final void rule__Generator__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3056:1: ( ( 'in' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3057:1: ( 'in' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3057:1: ( 'in' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3058:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getInKeyword_6_2_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Generator__Group_6_2__0__Impl6299); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3071:1: rule__Generator__Group_6_2__1 : rule__Generator__Group_6_2__1__Impl rule__Generator__Group_6_2__2 ;
    public final void rule__Generator__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3075:1: ( rule__Generator__Group_6_2__1__Impl rule__Generator__Group_6_2__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3076:2: rule__Generator__Group_6_2__1__Impl rule__Generator__Group_6_2__2
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_2__1__Impl_in_rule__Generator__Group_6_2__16330);
            rule__Generator__Group_6_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6_2__2_in_rule__Generator__Group_6_2__16333);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3083:1: rule__Generator__Group_6_2__1__Impl : ( ( rule__Generator__SourceTraceModelsAssignment_6_2_1 ) ) ;
    public final void rule__Generator__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3087:1: ( ( ( rule__Generator__SourceTraceModelsAssignment_6_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3088:1: ( ( rule__Generator__SourceTraceModelsAssignment_6_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3088:1: ( ( rule__Generator__SourceTraceModelsAssignment_6_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3089:1: ( rule__Generator__SourceTraceModelsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceTraceModelsAssignment_6_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3090:1: ( rule__Generator__SourceTraceModelsAssignment_6_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3090:2: rule__Generator__SourceTraceModelsAssignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Generator__SourceTraceModelsAssignment_6_2_1_in_rule__Generator__Group_6_2__1__Impl6360);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3100:1: rule__Generator__Group_6_2__2 : rule__Generator__Group_6_2__2__Impl ;
    public final void rule__Generator__Group_6_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3104:1: ( rule__Generator__Group_6_2__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3105:2: rule__Generator__Group_6_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_2__2__Impl_in_rule__Generator__Group_6_2__26390);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3111:1: rule__Generator__Group_6_2__2__Impl : ( ( rule__Generator__Group_6_2_2__0 )* ) ;
    public final void rule__Generator__Group_6_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3115:1: ( ( ( rule__Generator__Group_6_2_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3116:1: ( ( rule__Generator__Group_6_2_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3116:1: ( ( rule__Generator__Group_6_2_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3117:1: ( rule__Generator__Group_6_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getGroup_6_2_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3118:1: ( rule__Generator__Group_6_2_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3118:2: rule__Generator__Group_6_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Generator__Group_6_2_2__0_in_rule__Generator__Group_6_2__2__Impl6417);
            	    rule__Generator__Group_6_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3134:1: rule__Generator__Group_6_2_2__0 : rule__Generator__Group_6_2_2__0__Impl rule__Generator__Group_6_2_2__1 ;
    public final void rule__Generator__Group_6_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3138:1: ( rule__Generator__Group_6_2_2__0__Impl rule__Generator__Group_6_2_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3139:2: rule__Generator__Group_6_2_2__0__Impl rule__Generator__Group_6_2_2__1
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_2_2__0__Impl_in_rule__Generator__Group_6_2_2__06454);
            rule__Generator__Group_6_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Generator__Group_6_2_2__1_in_rule__Generator__Group_6_2_2__06457);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3146:1: rule__Generator__Group_6_2_2__0__Impl : ( ',' ) ;
    public final void rule__Generator__Group_6_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3150:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3151:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3151:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3152:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getCommaKeyword_6_2_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Generator__Group_6_2_2__0__Impl6485); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3165:1: rule__Generator__Group_6_2_2__1 : rule__Generator__Group_6_2_2__1__Impl ;
    public final void rule__Generator__Group_6_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3169:1: ( rule__Generator__Group_6_2_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3170:2: rule__Generator__Group_6_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Generator__Group_6_2_2__1__Impl_in_rule__Generator__Group_6_2_2__16516);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3176:1: rule__Generator__Group_6_2_2__1__Impl : ( ( rule__Generator__SourceTraceModelsAssignment_6_2_2_1 ) ) ;
    public final void rule__Generator__Group_6_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3180:1: ( ( ( rule__Generator__SourceTraceModelsAssignment_6_2_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3181:1: ( ( rule__Generator__SourceTraceModelsAssignment_6_2_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3181:1: ( ( rule__Generator__SourceTraceModelsAssignment_6_2_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3182:1: ( rule__Generator__SourceTraceModelsAssignment_6_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceTraceModelsAssignment_6_2_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3183:1: ( rule__Generator__SourceTraceModelsAssignment_6_2_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3183:2: rule__Generator__SourceTraceModelsAssignment_6_2_2_1
            {
            pushFollow(FOLLOW_rule__Generator__SourceTraceModelsAssignment_6_2_2_1_in_rule__Generator__Group_6_2_2__1__Impl6543);
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


    // $ANTLR start "rule__SourceModelSelector__Group_0__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3197:1: rule__SourceModelSelector__Group_0__0 : rule__SourceModelSelector__Group_0__0__Impl rule__SourceModelSelector__Group_0__1 ;
    public final void rule__SourceModelSelector__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3201:1: ( rule__SourceModelSelector__Group_0__0__Impl rule__SourceModelSelector__Group_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3202:2: rule__SourceModelSelector__Group_0__0__Impl rule__SourceModelSelector__Group_0__1
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_0__0__Impl_in_rule__SourceModelSelector__Group_0__06577);
            rule__SourceModelSelector__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_0__1_in_rule__SourceModelSelector__Group_0__06580);
            rule__SourceModelSelector__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0__0"


    // $ANTLR start "rule__SourceModelSelector__Group_0__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3209:1: rule__SourceModelSelector__Group_0__0__Impl : ( ( rule__SourceModelSelector__ReferenceAssignment_0_0 ) ) ;
    public final void rule__SourceModelSelector__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3213:1: ( ( ( rule__SourceModelSelector__ReferenceAssignment_0_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3214:1: ( ( rule__SourceModelSelector__ReferenceAssignment_0_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3214:1: ( ( rule__SourceModelSelector__ReferenceAssignment_0_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3215:1: ( rule__SourceModelSelector__ReferenceAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getReferenceAssignment_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3216:1: ( rule__SourceModelSelector__ReferenceAssignment_0_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3216:2: rule__SourceModelSelector__ReferenceAssignment_0_0
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__ReferenceAssignment_0_0_in_rule__SourceModelSelector__Group_0__0__Impl6607);
            rule__SourceModelSelector__ReferenceAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getReferenceAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0__0__Impl"


    // $ANTLR start "rule__SourceModelSelector__Group_0__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3226:1: rule__SourceModelSelector__Group_0__1 : rule__SourceModelSelector__Group_0__1__Impl rule__SourceModelSelector__Group_0__2 ;
    public final void rule__SourceModelSelector__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3230:1: ( rule__SourceModelSelector__Group_0__1__Impl rule__SourceModelSelector__Group_0__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3231:2: rule__SourceModelSelector__Group_0__1__Impl rule__SourceModelSelector__Group_0__2
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_0__1__Impl_in_rule__SourceModelSelector__Group_0__16637);
            rule__SourceModelSelector__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_0__2_in_rule__SourceModelSelector__Group_0__16640);
            rule__SourceModelSelector__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0__1"


    // $ANTLR start "rule__SourceModelSelector__Group_0__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3238:1: rule__SourceModelSelector__Group_0__1__Impl : ( ( rule__SourceModelSelector__Group_0_1__0 )? ) ;
    public final void rule__SourceModelSelector__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3242:1: ( ( ( rule__SourceModelSelector__Group_0_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3243:1: ( ( rule__SourceModelSelector__Group_0_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3243:1: ( ( rule__SourceModelSelector__Group_0_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3244:1: ( rule__SourceModelSelector__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getGroup_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3245:1: ( rule__SourceModelSelector__Group_0_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3245:2: rule__SourceModelSelector__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelSelector__Group_0_1__0_in_rule__SourceModelSelector__Group_0__1__Impl6667);
                    rule__SourceModelSelector__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0__1__Impl"


    // $ANTLR start "rule__SourceModelSelector__Group_0__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3255:1: rule__SourceModelSelector__Group_0__2 : rule__SourceModelSelector__Group_0__2__Impl ;
    public final void rule__SourceModelSelector__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3259:1: ( rule__SourceModelSelector__Group_0__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3260:2: rule__SourceModelSelector__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_0__2__Impl_in_rule__SourceModelSelector__Group_0__26698);
            rule__SourceModelSelector__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0__2"


    // $ANTLR start "rule__SourceModelSelector__Group_0__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3266:1: rule__SourceModelSelector__Group_0__2__Impl : ( ( rule__SourceModelSelector__Group_0_2__0 )? ) ;
    public final void rule__SourceModelSelector__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3270:1: ( ( ( rule__SourceModelSelector__Group_0_2__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3271:1: ( ( rule__SourceModelSelector__Group_0_2__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3271:1: ( ( rule__SourceModelSelector__Group_0_2__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3272:1: ( rule__SourceModelSelector__Group_0_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getGroup_0_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3273:1: ( rule__SourceModelSelector__Group_0_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3273:2: rule__SourceModelSelector__Group_0_2__0
                    {
                    pushFollow(FOLLOW_rule__SourceModelSelector__Group_0_2__0_in_rule__SourceModelSelector__Group_0__2__Impl6725);
                    rule__SourceModelSelector__Group_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getGroup_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0__2__Impl"


    // $ANTLR start "rule__SourceModelSelector__Group_0_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3289:1: rule__SourceModelSelector__Group_0_1__0 : rule__SourceModelSelector__Group_0_1__0__Impl rule__SourceModelSelector__Group_0_1__1 ;
    public final void rule__SourceModelSelector__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3293:1: ( rule__SourceModelSelector__Group_0_1__0__Impl rule__SourceModelSelector__Group_0_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3294:2: rule__SourceModelSelector__Group_0_1__0__Impl rule__SourceModelSelector__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_0_1__0__Impl_in_rule__SourceModelSelector__Group_0_1__06762);
            rule__SourceModelSelector__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_0_1__1_in_rule__SourceModelSelector__Group_0_1__06765);
            rule__SourceModelSelector__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0_1__0"


    // $ANTLR start "rule__SourceModelSelector__Group_0_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3301:1: rule__SourceModelSelector__Group_0_1__0__Impl : ( '[' ) ;
    public final void rule__SourceModelSelector__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3305:1: ( ( '[' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3306:1: ( '[' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3306:1: ( '[' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3307:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getLeftSquareBracketKeyword_0_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__SourceModelSelector__Group_0_1__0__Impl6793); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getLeftSquareBracketKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0_1__0__Impl"


    // $ANTLR start "rule__SourceModelSelector__Group_0_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3320:1: rule__SourceModelSelector__Group_0_1__1 : rule__SourceModelSelector__Group_0_1__1__Impl rule__SourceModelSelector__Group_0_1__2 ;
    public final void rule__SourceModelSelector__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3324:1: ( rule__SourceModelSelector__Group_0_1__1__Impl rule__SourceModelSelector__Group_0_1__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3325:2: rule__SourceModelSelector__Group_0_1__1__Impl rule__SourceModelSelector__Group_0_1__2
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_0_1__1__Impl_in_rule__SourceModelSelector__Group_0_1__16824);
            rule__SourceModelSelector__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_0_1__2_in_rule__SourceModelSelector__Group_0_1__16827);
            rule__SourceModelSelector__Group_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0_1__1"


    // $ANTLR start "rule__SourceModelSelector__Group_0_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3332:1: rule__SourceModelSelector__Group_0_1__1__Impl : ( ( rule__SourceModelSelector__ConstraintAssignment_0_1_1 ) ) ;
    public final void rule__SourceModelSelector__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3336:1: ( ( ( rule__SourceModelSelector__ConstraintAssignment_0_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3337:1: ( ( rule__SourceModelSelector__ConstraintAssignment_0_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3337:1: ( ( rule__SourceModelSelector__ConstraintAssignment_0_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3338:1: ( rule__SourceModelSelector__ConstraintAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getConstraintAssignment_0_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3339:1: ( rule__SourceModelSelector__ConstraintAssignment_0_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3339:2: rule__SourceModelSelector__ConstraintAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__ConstraintAssignment_0_1_1_in_rule__SourceModelSelector__Group_0_1__1__Impl6854);
            rule__SourceModelSelector__ConstraintAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getConstraintAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0_1__1__Impl"


    // $ANTLR start "rule__SourceModelSelector__Group_0_1__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3349:1: rule__SourceModelSelector__Group_0_1__2 : rule__SourceModelSelector__Group_0_1__2__Impl ;
    public final void rule__SourceModelSelector__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3353:1: ( rule__SourceModelSelector__Group_0_1__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3354:2: rule__SourceModelSelector__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_0_1__2__Impl_in_rule__SourceModelSelector__Group_0_1__26884);
            rule__SourceModelSelector__Group_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0_1__2"


    // $ANTLR start "rule__SourceModelSelector__Group_0_1__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3360:1: rule__SourceModelSelector__Group_0_1__2__Impl : ( ']' ) ;
    public final void rule__SourceModelSelector__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3364:1: ( ( ']' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3365:1: ( ']' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3365:1: ( ']' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3366:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getRightSquareBracketKeyword_0_1_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__SourceModelSelector__Group_0_1__2__Impl6912); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getRightSquareBracketKeyword_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0_1__2__Impl"


    // $ANTLR start "rule__SourceModelSelector__Group_0_2__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3385:1: rule__SourceModelSelector__Group_0_2__0 : rule__SourceModelSelector__Group_0_2__0__Impl rule__SourceModelSelector__Group_0_2__1 ;
    public final void rule__SourceModelSelector__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3389:1: ( rule__SourceModelSelector__Group_0_2__0__Impl rule__SourceModelSelector__Group_0_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3390:2: rule__SourceModelSelector__Group_0_2__0__Impl rule__SourceModelSelector__Group_0_2__1
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_0_2__0__Impl_in_rule__SourceModelSelector__Group_0_2__06949);
            rule__SourceModelSelector__Group_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_0_2__1_in_rule__SourceModelSelector__Group_0_2__06952);
            rule__SourceModelSelector__Group_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0_2__0"


    // $ANTLR start "rule__SourceModelSelector__Group_0_2__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3397:1: rule__SourceModelSelector__Group_0_2__0__Impl : ( '/' ) ;
    public final void rule__SourceModelSelector__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3401:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3402:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3402:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3403:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getSolidusKeyword_0_2_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__SourceModelSelector__Group_0_2__0__Impl6980); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getSolidusKeyword_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0_2__0__Impl"


    // $ANTLR start "rule__SourceModelSelector__Group_0_2__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3416:1: rule__SourceModelSelector__Group_0_2__1 : rule__SourceModelSelector__Group_0_2__1__Impl ;
    public final void rule__SourceModelSelector__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3420:1: ( rule__SourceModelSelector__Group_0_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3421:2: rule__SourceModelSelector__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_0_2__1__Impl_in_rule__SourceModelSelector__Group_0_2__17011);
            rule__SourceModelSelector__Group_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0_2__1"


    // $ANTLR start "rule__SourceModelSelector__Group_0_2__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3427:1: rule__SourceModelSelector__Group_0_2__1__Impl : ( ( rule__SourceModelSelector__PropertyAssignment_0_2_1 ) ) ;
    public final void rule__SourceModelSelector__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3431:1: ( ( ( rule__SourceModelSelector__PropertyAssignment_0_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3432:1: ( ( rule__SourceModelSelector__PropertyAssignment_0_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3432:1: ( ( rule__SourceModelSelector__PropertyAssignment_0_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3433:1: ( rule__SourceModelSelector__PropertyAssignment_0_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getPropertyAssignment_0_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3434:1: ( rule__SourceModelSelector__PropertyAssignment_0_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3434:2: rule__SourceModelSelector__PropertyAssignment_0_2_1
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__PropertyAssignment_0_2_1_in_rule__SourceModelSelector__Group_0_2__1__Impl7038);
            rule__SourceModelSelector__PropertyAssignment_0_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getPropertyAssignment_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_0_2__1__Impl"


    // $ANTLR start "rule__SourceModelSelector__Group_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3448:1: rule__SourceModelSelector__Group_1__0 : rule__SourceModelSelector__Group_1__0__Impl rule__SourceModelSelector__Group_1__1 ;
    public final void rule__SourceModelSelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3452:1: ( rule__SourceModelSelector__Group_1__0__Impl rule__SourceModelSelector__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3453:2: rule__SourceModelSelector__Group_1__0__Impl rule__SourceModelSelector__Group_1__1
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_1__0__Impl_in_rule__SourceModelSelector__Group_1__07072);
            rule__SourceModelSelector__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_1__1_in_rule__SourceModelSelector__Group_1__07075);
            rule__SourceModelSelector__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_1__0"


    // $ANTLR start "rule__SourceModelSelector__Group_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3460:1: rule__SourceModelSelector__Group_1__0__Impl : ( () ) ;
    public final void rule__SourceModelSelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3464:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3465:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3465:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3466:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getSourceModelSelectorAction_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3467:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3469:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getSourceModelSelectorAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_1__0__Impl"


    // $ANTLR start "rule__SourceModelSelector__Group_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3479:1: rule__SourceModelSelector__Group_1__1 : rule__SourceModelSelector__Group_1__1__Impl ;
    public final void rule__SourceModelSelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3483:1: ( rule__SourceModelSelector__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3484:2: rule__SourceModelSelector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SourceModelSelector__Group_1__1__Impl_in_rule__SourceModelSelector__Group_1__17133);
            rule__SourceModelSelector__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_1__1"


    // $ANTLR start "rule__SourceModelSelector__Group_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3490:1: rule__SourceModelSelector__Group_1__1__Impl : ( 'null' ) ;
    public final void rule__SourceModelSelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3494:1: ( ( 'null' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3495:1: ( 'null' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3495:1: ( 'null' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3496:1: 'null'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getNullKeyword_1_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__SourceModelSelector__Group_1__1__Impl7161); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getNullKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__Group_1__1__Impl"


    // $ANTLR start "rule__TargetModel__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3513:1: rule__TargetModel__Group__0 : rule__TargetModel__Group__0__Impl rule__TargetModel__Group__1 ;
    public final void rule__TargetModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3517:1: ( rule__TargetModel__Group__0__Impl rule__TargetModel__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3518:2: rule__TargetModel__Group__0__Impl rule__TargetModel__Group__1
            {
            pushFollow(FOLLOW_rule__TargetModel__Group__0__Impl_in_rule__TargetModel__Group__07196);
            rule__TargetModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetModel__Group__1_in_rule__TargetModel__Group__07199);
            rule__TargetModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModel__Group__0"


    // $ANTLR start "rule__TargetModel__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3525:1: rule__TargetModel__Group__0__Impl : ( () ) ;
    public final void rule__TargetModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3529:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3530:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3530:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3531:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelAccess().getTargetModelAction_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3532:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3534:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelAccess().getTargetModelAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModel__Group__0__Impl"


    // $ANTLR start "rule__TargetModel__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3544:1: rule__TargetModel__Group__1 : rule__TargetModel__Group__1__Impl ;
    public final void rule__TargetModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3548:1: ( rule__TargetModel__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3549:2: rule__TargetModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TargetModel__Group__1__Impl_in_rule__TargetModel__Group__17257);
            rule__TargetModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModel__Group__1"


    // $ANTLR start "rule__TargetModel__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3555:1: rule__TargetModel__Group__1__Impl : ( ( rule__TargetModel__ReferenceAssignment_1 ) ) ;
    public final void rule__TargetModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3559:1: ( ( ( rule__TargetModel__ReferenceAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3560:1: ( ( rule__TargetModel__ReferenceAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3560:1: ( ( rule__TargetModel__ReferenceAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3561:1: ( rule__TargetModel__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3562:1: ( rule__TargetModel__ReferenceAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3562:2: rule__TargetModel__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__TargetModel__ReferenceAssignment_1_in_rule__TargetModel__Group__1__Impl7284);
            rule__TargetModel__ReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelAccess().getReferenceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModel__Group__1__Impl"


    // $ANTLR start "rule__ModelType__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3576:1: rule__ModelType__Group__0 : rule__ModelType__Group__0__Impl rule__ModelType__Group__1 ;
    public final void rule__ModelType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3580:1: ( rule__ModelType__Group__0__Impl rule__ModelType__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3581:2: rule__ModelType__Group__0__Impl rule__ModelType__Group__1
            {
            pushFollow(FOLLOW_rule__ModelType__Group__0__Impl_in_rule__ModelType__Group__07318);
            rule__ModelType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelType__Group__1_in_rule__ModelType__Group__07321);
            rule__ModelType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__Group__0"


    // $ANTLR start "rule__ModelType__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3588:1: rule__ModelType__Group__0__Impl : ( ( rule__ModelType__TargetAssignment_0 ) ) ;
    public final void rule__ModelType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3592:1: ( ( ( rule__ModelType__TargetAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3593:1: ( ( rule__ModelType__TargetAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3593:1: ( ( rule__ModelType__TargetAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3594:1: ( rule__ModelType__TargetAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelTypeAccess().getTargetAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3595:1: ( rule__ModelType__TargetAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3595:2: rule__ModelType__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__ModelType__TargetAssignment_0_in_rule__ModelType__Group__0__Impl7348);
            rule__ModelType__TargetAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelTypeAccess().getTargetAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__Group__0__Impl"


    // $ANTLR start "rule__ModelType__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3605:1: rule__ModelType__Group__1 : rule__ModelType__Group__1__Impl rule__ModelType__Group__2 ;
    public final void rule__ModelType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3609:1: ( rule__ModelType__Group__1__Impl rule__ModelType__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3610:2: rule__ModelType__Group__1__Impl rule__ModelType__Group__2
            {
            pushFollow(FOLLOW_rule__ModelType__Group__1__Impl_in_rule__ModelType__Group__17378);
            rule__ModelType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelType__Group__2_in_rule__ModelType__Group__17381);
            rule__ModelType__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__Group__1"


    // $ANTLR start "rule__ModelType__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3617:1: rule__ModelType__Group__1__Impl : ( ( rule__ModelType__Group_1__0 )? ) ;
    public final void rule__ModelType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3621:1: ( ( ( rule__ModelType__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3622:1: ( ( rule__ModelType__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3622:1: ( ( rule__ModelType__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3623:1: ( rule__ModelType__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelTypeAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3624:1: ( rule__ModelType__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3624:2: rule__ModelType__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ModelType__Group_1__0_in_rule__ModelType__Group__1__Impl7408);
                    rule__ModelType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelTypeAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__Group__1__Impl"


    // $ANTLR start "rule__ModelType__Group__2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3634:1: rule__ModelType__Group__2 : rule__ModelType__Group__2__Impl ;
    public final void rule__ModelType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3638:1: ( rule__ModelType__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3639:2: rule__ModelType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ModelType__Group__2__Impl_in_rule__ModelType__Group__27439);
            rule__ModelType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__Group__2"


    // $ANTLR start "rule__ModelType__Group__2__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3645:1: rule__ModelType__Group__2__Impl : ( ( rule__ModelType__CollectionAssignment_2 )? ) ;
    public final void rule__ModelType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3649:1: ( ( ( rule__ModelType__CollectionAssignment_2 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3650:1: ( ( rule__ModelType__CollectionAssignment_2 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3650:1: ( ( rule__ModelType__CollectionAssignment_2 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3651:1: ( rule__ModelType__CollectionAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelTypeAccess().getCollectionAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3652:1: ( rule__ModelType__CollectionAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==54) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3652:2: rule__ModelType__CollectionAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ModelType__CollectionAssignment_2_in_rule__ModelType__Group__2__Impl7466);
                    rule__ModelType__CollectionAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelTypeAccess().getCollectionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__Group__2__Impl"


    // $ANTLR start "rule__ModelType__Group_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3668:1: rule__ModelType__Group_1__0 : rule__ModelType__Group_1__0__Impl rule__ModelType__Group_1__1 ;
    public final void rule__ModelType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3672:1: ( rule__ModelType__Group_1__0__Impl rule__ModelType__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3673:2: rule__ModelType__Group_1__0__Impl rule__ModelType__Group_1__1
            {
            pushFollow(FOLLOW_rule__ModelType__Group_1__0__Impl_in_rule__ModelType__Group_1__07503);
            rule__ModelType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ModelType__Group_1__1_in_rule__ModelType__Group_1__07506);
            rule__ModelType__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__Group_1__0"


    // $ANTLR start "rule__ModelType__Group_1__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3680:1: rule__ModelType__Group_1__0__Impl : ( '/' ) ;
    public final void rule__ModelType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3684:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3685:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3685:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3686:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelTypeAccess().getSolidusKeyword_1_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__ModelType__Group_1__0__Impl7534); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelTypeAccess().getSolidusKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__Group_1__0__Impl"


    // $ANTLR start "rule__ModelType__Group_1__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3699:1: rule__ModelType__Group_1__1 : rule__ModelType__Group_1__1__Impl ;
    public final void rule__ModelType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3703:1: ( rule__ModelType__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3704:2: rule__ModelType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ModelType__Group_1__1__Impl_in_rule__ModelType__Group_1__17565);
            rule__ModelType__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__Group_1__1"


    // $ANTLR start "rule__ModelType__Group_1__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3710:1: rule__ModelType__Group_1__1__Impl : ( ( rule__ModelType__PropertyAssignment_1_1 ) ) ;
    public final void rule__ModelType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3714:1: ( ( ( rule__ModelType__PropertyAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3715:1: ( ( rule__ModelType__PropertyAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3715:1: ( ( rule__ModelType__PropertyAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3716:1: ( rule__ModelType__PropertyAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelTypeAccess().getPropertyAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3717:1: ( rule__ModelType__PropertyAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3717:2: rule__ModelType__PropertyAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ModelType__PropertyAssignment_1_1_in_rule__ModelType__Group_1__1__Impl7592);
            rule__ModelType__PropertyAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelTypeAccess().getPropertyAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__Group_1__1__Impl"


    // $ANTLR start "rule__NodeProperty__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3731:1: rule__NodeProperty__Group__0 : rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1 ;
    public final void rule__NodeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3735:1: ( rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3736:2: rule__NodeProperty__Group__0__Impl rule__NodeProperty__Group__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__0__Impl_in_rule__NodeProperty__Group__07626);
            rule__NodeProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group__1_in_rule__NodeProperty__Group__07629);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3743:1: rule__NodeProperty__Group__0__Impl : ( ( rule__NodeProperty__PropertyAssignment_0 ) ) ;
    public final void rule__NodeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3747:1: ( ( ( rule__NodeProperty__PropertyAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3748:1: ( ( rule__NodeProperty__PropertyAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3748:1: ( ( rule__NodeProperty__PropertyAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3749:1: ( rule__NodeProperty__PropertyAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3750:1: ( rule__NodeProperty__PropertyAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3750:2: rule__NodeProperty__PropertyAssignment_0
            {
            pushFollow(FOLLOW_rule__NodeProperty__PropertyAssignment_0_in_rule__NodeProperty__Group__0__Impl7656);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3760:1: rule__NodeProperty__Group__1 : rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2 ;
    public final void rule__NodeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3764:1: ( rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3765:2: rule__NodeProperty__Group__1__Impl rule__NodeProperty__Group__2
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__1__Impl_in_rule__NodeProperty__Group__17686);
            rule__NodeProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group__2_in_rule__NodeProperty__Group__17689);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3772:1: rule__NodeProperty__Group__1__Impl : ( ( rule__NodeProperty__Group_1__0 )? ) ;
    public final void rule__NodeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3776:1: ( ( ( rule__NodeProperty__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3777:1: ( ( rule__NodeProperty__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3777:1: ( ( rule__NodeProperty__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3778:1: ( rule__NodeProperty__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3779:1: ( rule__NodeProperty__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3779:2: rule__NodeProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NodeProperty__Group_1__0_in_rule__NodeProperty__Group__1__Impl7716);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3789:1: rule__NodeProperty__Group__2 : rule__NodeProperty__Group__2__Impl ;
    public final void rule__NodeProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3793:1: ( rule__NodeProperty__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3794:2: rule__NodeProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group__2__Impl_in_rule__NodeProperty__Group__27747);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3800:1: rule__NodeProperty__Group__2__Impl : ( ( rule__NodeProperty__Group_2__0 )? ) ;
    public final void rule__NodeProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3804:1: ( ( ( rule__NodeProperty__Group_2__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3805:1: ( ( rule__NodeProperty__Group_2__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3805:1: ( ( rule__NodeProperty__Group_2__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3806:1: ( rule__NodeProperty__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3807:1: ( rule__NodeProperty__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3807:2: rule__NodeProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NodeProperty__Group_2__0_in_rule__NodeProperty__Group__2__Impl7774);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3823:1: rule__NodeProperty__Group_1__0 : rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1 ;
    public final void rule__NodeProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3827:1: ( rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3828:2: rule__NodeProperty__Group_1__0__Impl rule__NodeProperty__Group_1__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__0__Impl_in_rule__NodeProperty__Group_1__07811);
            rule__NodeProperty__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__1_in_rule__NodeProperty__Group_1__07814);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3835:1: rule__NodeProperty__Group_1__0__Impl : ( '[' ) ;
    public final void rule__NodeProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3839:1: ( ( '[' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3840:1: ( '[' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3840:1: ( '[' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3841:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__NodeProperty__Group_1__0__Impl7842); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3854:1: rule__NodeProperty__Group_1__1 : rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2 ;
    public final void rule__NodeProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3858:1: ( rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3859:2: rule__NodeProperty__Group_1__1__Impl rule__NodeProperty__Group_1__2
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__1__Impl_in_rule__NodeProperty__Group_1__17873);
            rule__NodeProperty__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__2_in_rule__NodeProperty__Group_1__17876);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3866:1: rule__NodeProperty__Group_1__1__Impl : ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) ) ;
    public final void rule__NodeProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3870:1: ( ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3871:1: ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3871:1: ( ( rule__NodeProperty__ConstraintAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3872:1: ( rule__NodeProperty__ConstraintAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getConstraintAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3873:1: ( rule__NodeProperty__ConstraintAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3873:2: rule__NodeProperty__ConstraintAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NodeProperty__ConstraintAssignment_1_1_in_rule__NodeProperty__Group_1__1__Impl7903);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3883:1: rule__NodeProperty__Group_1__2 : rule__NodeProperty__Group_1__2__Impl ;
    public final void rule__NodeProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3887:1: ( rule__NodeProperty__Group_1__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3888:2: rule__NodeProperty__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_1__2__Impl_in_rule__NodeProperty__Group_1__27933);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3894:1: rule__NodeProperty__Group_1__2__Impl : ( ']' ) ;
    public final void rule__NodeProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3898:1: ( ( ']' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3899:1: ( ']' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3899:1: ( ']' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3900:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__NodeProperty__Group_1__2__Impl7961); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3919:1: rule__NodeProperty__Group_2__0 : rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1 ;
    public final void rule__NodeProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3923:1: ( rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3924:2: rule__NodeProperty__Group_2__0__Impl rule__NodeProperty__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__0__Impl_in_rule__NodeProperty__Group_2__07998);
            rule__NodeProperty__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__1_in_rule__NodeProperty__Group_2__08001);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3931:1: rule__NodeProperty__Group_2__0__Impl : ( '/' ) ;
    public final void rule__NodeProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3935:1: ( ( '/' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3936:1: ( '/' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3936:1: ( '/' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3937:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSolidusKeyword_2_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__NodeProperty__Group_2__0__Impl8029); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3950:1: rule__NodeProperty__Group_2__1 : rule__NodeProperty__Group_2__1__Impl ;
    public final void rule__NodeProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3954:1: ( rule__NodeProperty__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3955:2: rule__NodeProperty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeProperty__Group_2__1__Impl_in_rule__NodeProperty__Group_2__18060);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3961:1: rule__NodeProperty__Group_2__1__Impl : ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) ) ;
    public final void rule__NodeProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3965:1: ( ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3966:1: ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3966:1: ( ( rule__NodeProperty__SubPropertyAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3967:1: ( rule__NodeProperty__SubPropertyAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSubPropertyAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3968:1: ( rule__NodeProperty__SubPropertyAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3968:2: rule__NodeProperty__SubPropertyAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NodeProperty__SubPropertyAssignment_2_1_in_rule__NodeProperty__Group_2__1__Impl8087);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3982:1: rule__ConstraintExpression__Group__0 : rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 ;
    public final void rule__ConstraintExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3986:1: ( rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3987:2: rule__ConstraintExpression__Group__0__Impl rule__ConstraintExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__08121);
            rule__ConstraintExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__08124);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3994:1: rule__ConstraintExpression__Group__0__Impl : ( ruleCompareExpression ) ;
    public final void rule__ConstraintExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3998:1: ( ( ruleCompareExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3999:1: ( ruleCompareExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:3999:1: ( ruleCompareExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4000:1: ruleCompareExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getCompareExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompareExpression_in_rule__ConstraintExpression__Group__0__Impl8151);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4011:1: rule__ConstraintExpression__Group__1 : rule__ConstraintExpression__Group__1__Impl ;
    public final void rule__ConstraintExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4015:1: ( rule__ConstraintExpression__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4016:2: rule__ConstraintExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__18180);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4022:1: rule__ConstraintExpression__Group__1__Impl : ( ( rule__ConstraintExpression__Group_1__0 )? ) ;
    public final void rule__ConstraintExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4026:1: ( ( ( rule__ConstraintExpression__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4027:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4027:1: ( ( rule__ConstraintExpression__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4028:1: ( rule__ConstraintExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4029:1: ( rule__ConstraintExpression__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred44_InternalArchitecture()) ) {
                    alt33=1;
                }
            }
            else if ( (LA33_0==19) ) {
                int LA33_2 = input.LA(2);

                if ( (synpred44_InternalArchitecture()) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4029:2: rule__ConstraintExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl8207);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4043:1: rule__ConstraintExpression__Group_1__0 : rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 ;
    public final void rule__ConstraintExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4047:1: ( rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4048:2: rule__ConstraintExpression__Group_1__0__Impl rule__ConstraintExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__08242);
            rule__ConstraintExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__08245);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4055:1: rule__ConstraintExpression__Group_1__0__Impl : ( ( rule__ConstraintExpression__Group_1_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4059:1: ( ( ( rule__ConstraintExpression__Group_1_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4060:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4060:1: ( ( rule__ConstraintExpression__Group_1_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4061:1: ( rule__ConstraintExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4062:1: ( rule__ConstraintExpression__Group_1_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4062:2: rule__ConstraintExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl8272);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4072:1: rule__ConstraintExpression__Group_1__1 : rule__ConstraintExpression__Group_1__1__Impl ;
    public final void rule__ConstraintExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4076:1: ( rule__ConstraintExpression__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4077:2: rule__ConstraintExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__18302);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4083:1: rule__ConstraintExpression__Group_1__1__Impl : ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4087:1: ( ( ( rule__ConstraintExpression__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4088:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4088:1: ( ( rule__ConstraintExpression__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4089:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4090:1: ( rule__ConstraintExpression__RightAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4090:2: rule__ConstraintExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl8329);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4104:1: rule__ConstraintExpression__Group_1_0__0 : rule__ConstraintExpression__Group_1_0__0__Impl ;
    public final void rule__ConstraintExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4108:1: ( rule__ConstraintExpression__Group_1_0__0__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4109:2: rule__ConstraintExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__08363);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4115:1: rule__ConstraintExpression__Group_1_0__0__Impl : ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4119:1: ( ( ( rule__ConstraintExpression__Group_1_0_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4120:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4120:1: ( ( rule__ConstraintExpression__Group_1_0_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4121:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getGroup_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4122:1: ( rule__ConstraintExpression__Group_1_0_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4122:2: rule__ConstraintExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl8390);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4134:1: rule__ConstraintExpression__Group_1_0_0__0 : rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 ;
    public final void rule__ConstraintExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4138:1: ( rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4139:2: rule__ConstraintExpression__Group_1_0_0__0__Impl rule__ConstraintExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__08422);
            rule__ConstraintExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__08425);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4146:1: rule__ConstraintExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4150:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4151:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4151:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4152:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4153:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4155:1: 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4165:1: rule__ConstraintExpression__Group_1_0_0__1 : rule__ConstraintExpression__Group_1_0_0__1__Impl ;
    public final void rule__ConstraintExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4169:1: ( rule__ConstraintExpression__Group_1_0_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4170:2: rule__ConstraintExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__18483);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4176:1: rule__ConstraintExpression__Group_1_0_0__1__Impl : ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) ;
    public final void rule__ConstraintExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4180:1: ( ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4181:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4181:1: ( ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4182:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorAssignment_1_0_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4183:1: ( rule__ConstraintExpression__OperatorAssignment_1_0_0_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4183:2: rule__ConstraintExpression__OperatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl8510);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4197:1: rule__CompareExpression__Group__0 : rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 ;
    public final void rule__CompareExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4201:1: ( rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4202:2: rule__CompareExpression__Group__0__Impl rule__CompareExpression__Group__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__08544);
            rule__CompareExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__08547);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4209:1: rule__CompareExpression__Group__0__Impl : ( ruleBasicConstraint ) ;
    public final void rule__CompareExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4213:1: ( ( ruleBasicConstraint ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4214:1: ( ruleBasicConstraint )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4214:1: ( ruleBasicConstraint )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4215:1: ruleBasicConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getBasicConstraintParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__Group__0__Impl8574);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4226:1: rule__CompareExpression__Group__1 : rule__CompareExpression__Group__1__Impl ;
    public final void rule__CompareExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4230:1: ( rule__CompareExpression__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4231:2: rule__CompareExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__18603);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4237:1: rule__CompareExpression__Group__1__Impl : ( ( rule__CompareExpression__Group_1__0 )? ) ;
    public final void rule__CompareExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4241:1: ( ( ( rule__CompareExpression__Group_1__0 )? ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4242:1: ( ( rule__CompareExpression__Group_1__0 )? )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4242:1: ( ( rule__CompareExpression__Group_1__0 )? )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4243:1: ( rule__CompareExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4244:1: ( rule__CompareExpression__Group_1__0 )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4244:2: rule__CompareExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl8630);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4258:1: rule__CompareExpression__Group_1__0 : rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 ;
    public final void rule__CompareExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4262:1: ( rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4263:2: rule__CompareExpression__Group_1__0__Impl rule__CompareExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__08665);
            rule__CompareExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__08668);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4270:1: rule__CompareExpression__Group_1__0__Impl : ( ( rule__CompareExpression__Group_1_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4274:1: ( ( ( rule__CompareExpression__Group_1_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4275:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4275:1: ( ( rule__CompareExpression__Group_1_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4276:1: ( rule__CompareExpression__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4277:1: ( rule__CompareExpression__Group_1_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4277:2: rule__CompareExpression__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl8695);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4287:1: rule__CompareExpression__Group_1__1 : rule__CompareExpression__Group_1__1__Impl ;
    public final void rule__CompareExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4291:1: ( rule__CompareExpression__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4292:2: rule__CompareExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__18725);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4298:1: rule__CompareExpression__Group_1__1__Impl : ( ( rule__CompareExpression__RightAssignment_1_1 ) ) ;
    public final void rule__CompareExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4302:1: ( ( ( rule__CompareExpression__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4303:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4303:1: ( ( rule__CompareExpression__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4304:1: ( rule__CompareExpression__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4305:1: ( rule__CompareExpression__RightAssignment_1_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4305:2: rule__CompareExpression__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl8752);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4319:1: rule__CompareExpression__Group_1_0__0 : rule__CompareExpression__Group_1_0__0__Impl ;
    public final void rule__CompareExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4323:1: ( rule__CompareExpression__Group_1_0__0__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4324:2: rule__CompareExpression__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__08786);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4330:1: rule__CompareExpression__Group_1_0__0__Impl : ( ( rule__CompareExpression__Group_1_0_0__0 ) ) ;
    public final void rule__CompareExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4334:1: ( ( ( rule__CompareExpression__Group_1_0_0__0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4335:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4335:1: ( ( rule__CompareExpression__Group_1_0_0__0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4336:1: ( rule__CompareExpression__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getGroup_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4337:1: ( rule__CompareExpression__Group_1_0_0__0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4337:2: rule__CompareExpression__Group_1_0_0__0
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl8813);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4349:1: rule__CompareExpression__Group_1_0_0__0 : rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 ;
    public final void rule__CompareExpression__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4353:1: ( rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4354:2: rule__CompareExpression__Group_1_0_0__0__Impl rule__CompareExpression__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__08845);
            rule__CompareExpression__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__08848);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4361:1: rule__CompareExpression__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__CompareExpression__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4365:1: ( ( () ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4366:1: ( () )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4366:1: ( () )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4367:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4368:1: ()
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4370:1: 
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4380:1: rule__CompareExpression__Group_1_0_0__1 : rule__CompareExpression__Group_1_0_0__1__Impl ;
    public final void rule__CompareExpression__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4384:1: ( rule__CompareExpression__Group_1_0_0__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4385:2: rule__CompareExpression__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__18906);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4391:1: rule__CompareExpression__Group_1_0_0__1__Impl : ( ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 ) ) ;
    public final void rule__CompareExpression__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4395:1: ( ( ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4396:1: ( ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4396:1: ( ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4397:1: ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getComparatorAssignment_1_0_0_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4398:1: ( rule__CompareExpression__ComparatorAssignment_1_0_0_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4398:2: rule__CompareExpression__ComparatorAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_rule__CompareExpression__ComparatorAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl8933);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4412:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4416:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4417:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__08967);
            rule__Negation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__08970);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4424:1: rule__Negation__Group__0__Impl : ( '!' ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4428:1: ( ( '!' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4429:1: ( '!' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4429:1: ( '!' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4430:1: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__Negation__Group__0__Impl8998); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4443:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4447:1: ( rule__Negation__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4448:2: rule__Negation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__19029);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4454:1: rule__Negation__Group__1__Impl : ( ( rule__Negation__ConstraintAssignment_1 ) ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4458:1: ( ( ( rule__Negation__ConstraintAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4459:1: ( ( rule__Negation__ConstraintAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4459:1: ( ( rule__Negation__ConstraintAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4460:1: ( rule__Negation__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getConstraintAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4461:1: ( rule__Negation__ConstraintAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4461:2: rule__Negation__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__Negation__ConstraintAssignment_1_in_rule__Negation__Group__1__Impl9056);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4475:1: rule__ParenthesisConstraint__Group__0 : rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 ;
    public final void rule__ParenthesisConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4479:1: ( rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4480:2: rule__ParenthesisConstraint__Group__0__Impl rule__ParenthesisConstraint__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__09090);
            rule__ParenthesisConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__09093);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4487:1: rule__ParenthesisConstraint__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4491:1: ( ( '(' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4492:1: ( '(' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4492:1: ( '(' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4493:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__ParenthesisConstraint__Group__0__Impl9121); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4506:1: rule__ParenthesisConstraint__Group__1 : rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 ;
    public final void rule__ParenthesisConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4510:1: ( rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4511:2: rule__ParenthesisConstraint__Group__1__Impl rule__ParenthesisConstraint__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__19152);
            rule__ParenthesisConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__19155);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4518:1: rule__ParenthesisConstraint__Group__1__Impl : ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) ;
    public final void rule__ParenthesisConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4522:1: ( ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4523:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4523:1: ( ( rule__ParenthesisConstraint__ConstraintAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4524:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4525:1: ( rule__ParenthesisConstraint__ConstraintAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4525:2: rule__ParenthesisConstraint__ConstraintAssignment_1
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl9182);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4535:1: rule__ParenthesisConstraint__Group__2 : rule__ParenthesisConstraint__Group__2__Impl ;
    public final void rule__ParenthesisConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4539:1: ( rule__ParenthesisConstraint__Group__2__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4540:2: rule__ParenthesisConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__29212);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4546:1: rule__ParenthesisConstraint__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4550:1: ( ( ')' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4551:1: ( ')' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4551:1: ( ')' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4552:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,39,FOLLOW_39_in_rule__ParenthesisConstraint__Group__2__Impl9240); if (state.failed) return ;
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


    // $ANTLR start "rule__InstanceOf__Group__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4571:1: rule__InstanceOf__Group__0 : rule__InstanceOf__Group__0__Impl rule__InstanceOf__Group__1 ;
    public final void rule__InstanceOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4575:1: ( rule__InstanceOf__Group__0__Impl rule__InstanceOf__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4576:2: rule__InstanceOf__Group__0__Impl rule__InstanceOf__Group__1
            {
            pushFollow(FOLLOW_rule__InstanceOf__Group__0__Impl_in_rule__InstanceOf__Group__09277);
            rule__InstanceOf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InstanceOf__Group__1_in_rule__InstanceOf__Group__09280);
            rule__InstanceOf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOf__Group__0"


    // $ANTLR start "rule__InstanceOf__Group__0__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4583:1: rule__InstanceOf__Group__0__Impl : ( 'is' ) ;
    public final void rule__InstanceOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4587:1: ( ( 'is' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4588:1: ( 'is' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4588:1: ( 'is' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4589:1: 'is'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceOfAccess().getIsKeyword_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__InstanceOf__Group__0__Impl9308); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceOfAccess().getIsKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOf__Group__0__Impl"


    // $ANTLR start "rule__InstanceOf__Group__1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4602:1: rule__InstanceOf__Group__1 : rule__InstanceOf__Group__1__Impl ;
    public final void rule__InstanceOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4606:1: ( rule__InstanceOf__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4607:2: rule__InstanceOf__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InstanceOf__Group__1__Impl_in_rule__InstanceOf__Group__19339);
            rule__InstanceOf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOf__Group__1"


    // $ANTLR start "rule__InstanceOf__Group__1__Impl"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4613:1: rule__InstanceOf__Group__1__Impl : ( ( rule__InstanceOf__TypeAssignment_1 ) ) ;
    public final void rule__InstanceOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4617:1: ( ( ( rule__InstanceOf__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4618:1: ( ( rule__InstanceOf__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4618:1: ( ( rule__InstanceOf__TypeAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4619:1: ( rule__InstanceOf__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceOfAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4620:1: ( rule__InstanceOf__TypeAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4620:2: rule__InstanceOf__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__InstanceOf__TypeAssignment_1_in_rule__InstanceOf__Group__1__Impl9366);
            rule__InstanceOf__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceOfAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOf__Group__1__Impl"


    // $ANTLR start "rule__TargetTraceModel__Group_1__0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4634:1: rule__TargetTraceModel__Group_1__0 : rule__TargetTraceModel__Group_1__0__Impl rule__TargetTraceModel__Group_1__1 ;
    public final void rule__TargetTraceModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4638:1: ( rule__TargetTraceModel__Group_1__0__Impl rule__TargetTraceModel__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4639:2: rule__TargetTraceModel__Group_1__0__Impl rule__TargetTraceModel__Group_1__1
            {
            pushFollow(FOLLOW_rule__TargetTraceModel__Group_1__0__Impl_in_rule__TargetTraceModel__Group_1__09400);
            rule__TargetTraceModel__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TargetTraceModel__Group_1__1_in_rule__TargetTraceModel__Group_1__09403);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4646:1: rule__TargetTraceModel__Group_1__0__Impl : ( 'use' ) ;
    public final void rule__TargetTraceModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4650:1: ( ( 'use' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4651:1: ( 'use' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4651:1: ( 'use' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4652:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetTraceModelAccess().getUseKeyword_1_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__TargetTraceModel__Group_1__0__Impl9431); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4665:1: rule__TargetTraceModel__Group_1__1 : rule__TargetTraceModel__Group_1__1__Impl ;
    public final void rule__TargetTraceModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4669:1: ( rule__TargetTraceModel__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4670:2: rule__TargetTraceModel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TargetTraceModel__Group_1__1__Impl_in_rule__TargetTraceModel__Group_1__19462);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4676:1: rule__TargetTraceModel__Group_1__1__Impl : ( ruleTraceModelReference ) ;
    public final void rule__TargetTraceModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4680:1: ( ( ruleTraceModelReference ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4681:1: ( ruleTraceModelReference )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4681:1: ( ruleTraceModelReference )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4682:1: ruleTraceModelReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetTraceModelAccess().getTraceModelReferenceParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleTraceModelReference_in_rule__TargetTraceModel__Group_1__1__Impl9489);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4697:1: rule__TraceModel__Group__0 : rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1 ;
    public final void rule__TraceModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4701:1: ( rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4702:2: rule__TraceModel__Group__0__Impl rule__TraceModel__Group__1
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__0__Impl_in_rule__TraceModel__Group__09522);
            rule__TraceModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__1_in_rule__TraceModel__Group__09525);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4709:1: rule__TraceModel__Group__0__Impl : ( ( rule__TraceModel__NameAssignment_0 ) ) ;
    public final void rule__TraceModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4713:1: ( ( ( rule__TraceModel__NameAssignment_0 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4714:1: ( ( rule__TraceModel__NameAssignment_0 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4714:1: ( ( rule__TraceModel__NameAssignment_0 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4715:1: ( rule__TraceModel__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNameAssignment_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4716:1: ( rule__TraceModel__NameAssignment_0 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4716:2: rule__TraceModel__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TraceModel__NameAssignment_0_in_rule__TraceModel__Group__0__Impl9552);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4726:1: rule__TraceModel__Group__1 : rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2 ;
    public final void rule__TraceModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4730:1: ( rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4731:2: rule__TraceModel__Group__1__Impl rule__TraceModel__Group__2
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__1__Impl_in_rule__TraceModel__Group__19582);
            rule__TraceModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__2_in_rule__TraceModel__Group__19585);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4738:1: rule__TraceModel__Group__1__Impl : ( '<' ) ;
    public final void rule__TraceModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4742:1: ( ( '<' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4743:1: ( '<' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4743:1: ( '<' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4744:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getLessThanSignKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__TraceModel__Group__1__Impl9613); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4757:1: rule__TraceModel__Group__2 : rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3 ;
    public final void rule__TraceModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4761:1: ( rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4762:2: rule__TraceModel__Group__2__Impl rule__TraceModel__Group__3
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__2__Impl_in_rule__TraceModel__Group__29644);
            rule__TraceModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TraceModel__Group__3_in_rule__TraceModel__Group__29647);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4769:1: rule__TraceModel__Group__2__Impl : ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) ) ;
    public final void rule__TraceModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4773:1: ( ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4774:1: ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4774:1: ( ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4775:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) ) ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4775:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4776:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4777:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4777:2: rule__TraceModel__NodeSetRelationsAssignment_2
            {
            pushFollow(FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl9676);
            rule__TraceModel__NodeSetRelationsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }

            }

            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4780:1: ( ( rule__TraceModel__NodeSetRelationsAssignment_2 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4781:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsAssignment_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4782:1: ( rule__TraceModel__NodeSetRelationsAssignment_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==38) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4782:2: rule__TraceModel__NodeSetRelationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl9688);
            	    rule__TraceModel__NodeSetRelationsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4793:1: rule__TraceModel__Group__3 : rule__TraceModel__Group__3__Impl ;
    public final void rule__TraceModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4797:1: ( rule__TraceModel__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4798:2: rule__TraceModel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TraceModel__Group__3__Impl_in_rule__TraceModel__Group__39721);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4804:1: rule__TraceModel__Group__3__Impl : ( '>' ) ;
    public final void rule__TraceModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4808:1: ( ( '>' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4809:1: ( '>' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4809:1: ( '>' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4810:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getGreaterThanSignKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__TraceModel__Group__3__Impl9749); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4831:1: rule__NodeSetRelation__Group__0 : rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1 ;
    public final void rule__NodeSetRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4835:1: ( rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4836:2: rule__NodeSetRelation__Group__0__Impl rule__NodeSetRelation__Group__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__0__Impl_in_rule__NodeSetRelation__Group__09788);
            rule__NodeSetRelation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__1_in_rule__NodeSetRelation__Group__09791);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4843:1: rule__NodeSetRelation__Group__0__Impl : ( '(' ) ;
    public final void rule__NodeSetRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4847:1: ( ( '(' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4848:1: ( '(' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4848:1: ( '(' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4849:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__NodeSetRelation__Group__0__Impl9819); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4862:1: rule__NodeSetRelation__Group__1 : rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2 ;
    public final void rule__NodeSetRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4866:1: ( rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4867:2: rule__NodeSetRelation__Group__1__Impl rule__NodeSetRelation__Group__2
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__1__Impl_in_rule__NodeSetRelation__Group__19850);
            rule__NodeSetRelation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__2_in_rule__NodeSetRelation__Group__19853);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4874:1: rule__NodeSetRelation__Group__1__Impl : ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) ) ;
    public final void rule__NodeSetRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4878:1: ( ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4879:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4879:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4880:1: ( rule__NodeSetRelation__SourceNodesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4881:1: ( rule__NodeSetRelation__SourceNodesAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4881:2: rule__NodeSetRelation__SourceNodesAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_1_in_rule__NodeSetRelation__Group__1__Impl9880);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4891:1: rule__NodeSetRelation__Group__2 : rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3 ;
    public final void rule__NodeSetRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4895:1: ( rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4896:2: rule__NodeSetRelation__Group__2__Impl rule__NodeSetRelation__Group__3
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__2__Impl_in_rule__NodeSetRelation__Group__29910);
            rule__NodeSetRelation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__3_in_rule__NodeSetRelation__Group__29913);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4903:1: rule__NodeSetRelation__Group__2__Impl : ( ( rule__NodeSetRelation__Group_2__0 )* ) ;
    public final void rule__NodeSetRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4907:1: ( ( ( rule__NodeSetRelation__Group_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4908:1: ( ( rule__NodeSetRelation__Group_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4908:1: ( ( rule__NodeSetRelation__Group_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4909:1: ( rule__NodeSetRelation__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4910:1: ( rule__NodeSetRelation__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==31) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4910:2: rule__NodeSetRelation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__0_in_rule__NodeSetRelation__Group__2__Impl9940);
            	    rule__NodeSetRelation__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4920:1: rule__NodeSetRelation__Group__3 : rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4 ;
    public final void rule__NodeSetRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4924:1: ( rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4925:2: rule__NodeSetRelation__Group__3__Impl rule__NodeSetRelation__Group__4
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__3__Impl_in_rule__NodeSetRelation__Group__39971);
            rule__NodeSetRelation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__4_in_rule__NodeSetRelation__Group__39974);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4932:1: rule__NodeSetRelation__Group__3__Impl : ( ':' ) ;
    public final void rule__NodeSetRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4936:1: ( ( ':' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4937:1: ( ':' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4937:1: ( ':' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4938:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getColonKeyword_3()); 
            }
            match(input,49,FOLLOW_49_in_rule__NodeSetRelation__Group__3__Impl10002); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4951:1: rule__NodeSetRelation__Group__4 : rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5 ;
    public final void rule__NodeSetRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4955:1: ( rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4956:2: rule__NodeSetRelation__Group__4__Impl rule__NodeSetRelation__Group__5
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__4__Impl_in_rule__NodeSetRelation__Group__410033);
            rule__NodeSetRelation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__5_in_rule__NodeSetRelation__Group__410036);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4963:1: rule__NodeSetRelation__Group__4__Impl : ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) ) ;
    public final void rule__NodeSetRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4967:1: ( ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4968:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4968:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_4 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4969:1: ( rule__NodeSetRelation__TargetNodesAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_4()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4970:1: ( rule__NodeSetRelation__TargetNodesAssignment_4 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4970:2: rule__NodeSetRelation__TargetNodesAssignment_4
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_4_in_rule__NodeSetRelation__Group__4__Impl10063);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4980:1: rule__NodeSetRelation__Group__5 : rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6 ;
    public final void rule__NodeSetRelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4984:1: ( rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4985:2: rule__NodeSetRelation__Group__5__Impl rule__NodeSetRelation__Group__6
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__5__Impl_in_rule__NodeSetRelation__Group__510093);
            rule__NodeSetRelation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__6_in_rule__NodeSetRelation__Group__510096);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4992:1: rule__NodeSetRelation__Group__5__Impl : ( ( rule__NodeSetRelation__Group_5__0 )* ) ;
    public final void rule__NodeSetRelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4996:1: ( ( ( rule__NodeSetRelation__Group_5__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4997:1: ( ( rule__NodeSetRelation__Group_5__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4997:1: ( ( rule__NodeSetRelation__Group_5__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4998:1: ( rule__NodeSetRelation__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getGroup_5()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4999:1: ( rule__NodeSetRelation__Group_5__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==31) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4999:2: rule__NodeSetRelation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__0_in_rule__NodeSetRelation__Group__5__Impl10123);
            	    rule__NodeSetRelation__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5009:1: rule__NodeSetRelation__Group__6 : rule__NodeSetRelation__Group__6__Impl ;
    public final void rule__NodeSetRelation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5013:1: ( rule__NodeSetRelation__Group__6__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5014:2: rule__NodeSetRelation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group__6__Impl_in_rule__NodeSetRelation__Group__610154);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5020:1: rule__NodeSetRelation__Group__6__Impl : ( ')' ) ;
    public final void rule__NodeSetRelation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5024:1: ( ( ')' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5025:1: ( ')' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5025:1: ( ')' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5026:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,39,FOLLOW_39_in_rule__NodeSetRelation__Group__6__Impl10182); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5053:1: rule__NodeSetRelation__Group_2__0 : rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1 ;
    public final void rule__NodeSetRelation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5057:1: ( rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5058:2: rule__NodeSetRelation__Group_2__0__Impl rule__NodeSetRelation__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__0__Impl_in_rule__NodeSetRelation__Group_2__010227);
            rule__NodeSetRelation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__1_in_rule__NodeSetRelation__Group_2__010230);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5065:1: rule__NodeSetRelation__Group_2__0__Impl : ( ',' ) ;
    public final void rule__NodeSetRelation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5069:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5070:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5070:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5071:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getCommaKeyword_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__NodeSetRelation__Group_2__0__Impl10258); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5084:1: rule__NodeSetRelation__Group_2__1 : rule__NodeSetRelation__Group_2__1__Impl ;
    public final void rule__NodeSetRelation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5088:1: ( rule__NodeSetRelation__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5089:2: rule__NodeSetRelation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_2__1__Impl_in_rule__NodeSetRelation__Group_2__110289);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5095:1: rule__NodeSetRelation__Group_2__1__Impl : ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) ) ;
    public final void rule__NodeSetRelation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5099:1: ( ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5100:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5100:1: ( ( rule__NodeSetRelation__SourceNodesAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5101:1: ( rule__NodeSetRelation__SourceNodesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5102:1: ( rule__NodeSetRelation__SourceNodesAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5102:2: rule__NodeSetRelation__SourceNodesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_2_1_in_rule__NodeSetRelation__Group_2__1__Impl10316);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5116:1: rule__NodeSetRelation__Group_5__0 : rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1 ;
    public final void rule__NodeSetRelation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5120:1: ( rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5121:2: rule__NodeSetRelation__Group_5__0__Impl rule__NodeSetRelation__Group_5__1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__0__Impl_in_rule__NodeSetRelation__Group_5__010350);
            rule__NodeSetRelation__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__1_in_rule__NodeSetRelation__Group_5__010353);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5128:1: rule__NodeSetRelation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__NodeSetRelation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5132:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5133:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5133:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5134:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getCommaKeyword_5_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__NodeSetRelation__Group_5__0__Impl10381); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5147:1: rule__NodeSetRelation__Group_5__1 : rule__NodeSetRelation__Group_5__1__Impl ;
    public final void rule__NodeSetRelation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5151:1: ( rule__NodeSetRelation__Group_5__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5152:2: rule__NodeSetRelation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__Group_5__1__Impl_in_rule__NodeSetRelation__Group_5__110412);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5158:1: rule__NodeSetRelation__Group_5__1__Impl : ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) ) ;
    public final void rule__NodeSetRelation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5162:1: ( ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5163:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5163:1: ( ( rule__NodeSetRelation__TargetNodesAssignment_5_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5164:1: ( rule__NodeSetRelation__TargetNodesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesAssignment_5_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5165:1: ( rule__NodeSetRelation__TargetNodesAssignment_5_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5165:2: rule__NodeSetRelation__TargetNodesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_5_1_in_rule__NodeSetRelation__Group_5__1__Impl10439);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5179:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5183:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5184:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__010473);
            rule__ArrayLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__010476);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5191:1: rule__ArrayLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5195:1: ( ( '{' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5196:1: ( '{' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5196:1: ( '{' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5197:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__ArrayLiteral__Group__0__Impl10504); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5210:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5214:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5215:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__110535);
            rule__ArrayLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__110538);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5222:1: rule__ArrayLiteral__Group__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5226:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5227:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5227:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5228:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5229:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5229:2: rule__ArrayLiteral__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl10565);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5239:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5243:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5244:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__210595);
            rule__ArrayLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__210598);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5251:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__Group_2__0 )* ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5255:1: ( ( ( rule__ArrayLiteral__Group_2__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5256:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5256:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5257:1: ( rule__ArrayLiteral__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5258:1: ( rule__ArrayLiteral__Group_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==31) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5258:2: rule__ArrayLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl10625);
            	    rule__ArrayLiteral__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5268:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5272:1: ( rule__ArrayLiteral__Group__3__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5273:2: rule__ArrayLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__310656);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5279:1: rule__ArrayLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5283:1: ( ( '}' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5284:1: ( '}' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5284:1: ( '}' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5285:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,51,FOLLOW_51_in_rule__ArrayLiteral__Group__3__Impl10684); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5306:1: rule__ArrayLiteral__Group_2__0 : rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 ;
    public final void rule__ArrayLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5310:1: ( rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5311:2: rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__010723);
            rule__ArrayLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__010726);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5318:1: rule__ArrayLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5322:1: ( ( ',' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5323:1: ( ',' )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5323:1: ( ',' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5324:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ArrayLiteral__Group_2__0__Impl10754); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5337:1: rule__ArrayLiteral__Group_2__1 : rule__ArrayLiteral__Group_2__1__Impl ;
    public final void rule__ArrayLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5341:1: ( rule__ArrayLiteral__Group_2__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5342:2: rule__ArrayLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__110785);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5348:1: rule__ArrayLiteral__Group_2__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) ;
    public final void rule__ArrayLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5352:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5353:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5353:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5354:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5355:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5355:2: rule__ArrayLiteral__LiteralsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl10812);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5369:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5373:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5374:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010846);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010849);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5381:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5385:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5386:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5386:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5387:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10876); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5398:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5402:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5403:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110905);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5409:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5413:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5414:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5414:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5415:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5416:1: ( rule__QualifiedName__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==52) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5416:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10932);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5430:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5434:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5435:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010967);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010970);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5442:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5446:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5447:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5447:1: ( ( '.' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5448:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5449:1: ( '.' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5450:2: '.'
            {
            match(input,52,FOLLOW_52_in_rule__QualifiedName__Group_1__0__Impl10999); if (state.failed) return ;

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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5461:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5465:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5466:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__111031);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5472:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5476:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5477:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5477:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5478:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl11058); if (state.failed) return ;
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


    // $ANTLR start "rule__GecoModel__NameAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5496:1: rule__GecoModel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__GecoModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5500:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5501:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5501:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5502:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGecoModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__GecoModel__NameAssignment_111098);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGecoModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__NameAssignment_1"


    // $ANTLR start "rule__GecoModel__ImportsAssignment_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5511:1: rule__GecoModel__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__GecoModel__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5515:1: ( ( ruleImport ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5516:1: ( ruleImport )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5516:1: ( ruleImport )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5517:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGecoModelAccess().getImportsImportParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__GecoModel__ImportsAssignment_211129);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGecoModelAccess().getImportsImportParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__ImportsAssignment_2"


    // $ANTLR start "rule__GecoModel__RegisteredRootClassAssignment_3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5526:1: rule__GecoModel__RegisteredRootClassAssignment_3 : ( ruleRegisteredRootClass ) ;
    public final void rule__GecoModel__RegisteredRootClassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5530:1: ( ( ruleRegisteredRootClass ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5531:1: ( ruleRegisteredRootClass )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5531:1: ( ruleRegisteredRootClass )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5532:1: ruleRegisteredRootClass
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGecoModelAccess().getRegisteredRootClassRegisteredRootClassParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleRegisteredRootClass_in_rule__GecoModel__RegisteredRootClassAssignment_311160);
            ruleRegisteredRootClass();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGecoModelAccess().getRegisteredRootClassRegisteredRootClassParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__RegisteredRootClassAssignment_3"


    // $ANTLR start "rule__GecoModel__ModelsAssignment_4"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5541:1: rule__GecoModel__ModelsAssignment_4 : ( ruleModelSequence ) ;
    public final void rule__GecoModel__ModelsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5545:1: ( ( ruleModelSequence ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5546:1: ( ruleModelSequence )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5546:1: ( ruleModelSequence )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5547:1: ruleModelSequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGecoModelAccess().getModelsModelSequenceParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleModelSequence_in_rule__GecoModel__ModelsAssignment_411191);
            ruleModelSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGecoModelAccess().getModelsModelSequenceParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__ModelsAssignment_4"


    // $ANTLR start "rule__GecoModel__FragmentsAssignment_5"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5556:1: rule__GecoModel__FragmentsAssignment_5 : ( ruleFragment ) ;
    public final void rule__GecoModel__FragmentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5560:1: ( ( ruleFragment ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5561:1: ( ruleFragment )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5561:1: ( ruleFragment )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5562:1: ruleFragment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGecoModelAccess().getFragmentsFragmentParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleFragment_in_rule__GecoModel__FragmentsAssignment_511222);
            ruleFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGecoModelAccess().getFragmentsFragmentParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GecoModel__FragmentsAssignment_5"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5571:1: rule__Import__ImportedNamespaceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5575:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5576:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5576:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5577:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5578:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5579:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceJvmTypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_111257);
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


    // $ANTLR start "rule__RegisteredRootClass__NameAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5590:1: rule__RegisteredRootClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RegisteredRootClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5594:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5595:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5595:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5596:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredRootClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RegisteredRootClass__NameAssignment_111292); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredRootClassAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__NameAssignment_1"


    // $ANTLR start "rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5605:1: rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5609:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5610:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5610:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5611:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredRootClassAccess().getImportedNamespaceJvmTypeCrossReference_2_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5612:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5613:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredRootClassAccess().getImportedNamespaceJvmTypeQualifiedNameParserRuleCall_2_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RegisteredRootClass__ImportedNamespaceAssignment_2_011327);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredRootClassAccess().getImportedNamespaceJvmTypeQualifiedNameParserRuleCall_2_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredRootClassAccess().getImportedNamespaceJvmTypeCrossReference_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0"


    // $ANTLR start "rule__RegisteredRootClass__IsTextAssignment_2_1_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5624:1: rule__RegisteredRootClass__IsTextAssignment_2_1_0 : ( ( 'text' ) ) ;
    public final void rule__RegisteredRootClass__IsTextAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5628:1: ( ( ( 'text' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5629:1: ( ( 'text' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5629:1: ( ( 'text' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5630:1: ( 'text' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredRootClassAccess().getIsTextTextKeyword_2_1_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5631:1: ( 'text' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5632:1: 'text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredRootClassAccess().getIsTextTextKeyword_2_1_0_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__RegisteredRootClass__IsTextAssignment_2_1_011367); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredRootClassAccess().getIsTextTextKeyword_2_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredRootClassAccess().getIsTextTextKeyword_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__IsTextAssignment_2_1_0"


    // $ANTLR start "rule__RegisteredRootClass__ExtensionAssignment_2_1_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5647:1: rule__RegisteredRootClass__ExtensionAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__RegisteredRootClass__ExtensionAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5651:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5652:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5652:1: ( RULE_STRING )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5653:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRegisteredRootClassAccess().getExtensionSTRINGTerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RegisteredRootClass__ExtensionAssignment_2_1_111406); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRegisteredRootClassAccess().getExtensionSTRINGTerminalRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisteredRootClass__ExtensionAssignment_2_1_1"


    // $ANTLR start "rule__ModelSequence__ModifierAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5662:1: rule__ModelSequence__ModifierAssignment_1 : ( ruleModelModifier ) ;
    public final void rule__ModelSequence__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5666:1: ( ( ruleModelModifier ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5667:1: ( ruleModelModifier )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5667:1: ( ruleModelModifier )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5668:1: ruleModelModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelSequenceAccess().getModifierModelModifierEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleModelModifier_in_rule__ModelSequence__ModifierAssignment_111437);
            ruleModelModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelSequenceAccess().getModifierModelModifierEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__ModifierAssignment_1"


    // $ANTLR start "rule__ModelSequence__TypeAssignment_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5677:1: rule__ModelSequence__TypeAssignment_2 : ( ruleModelType ) ;
    public final void rule__ModelSequence__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5681:1: ( ( ruleModelType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5682:1: ( ruleModelType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5682:1: ( ruleModelType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5683:1: ruleModelType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelSequenceAccess().getTypeModelTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleModelType_in_rule__ModelSequence__TypeAssignment_211468);
            ruleModelType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelSequenceAccess().getTypeModelTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__TypeAssignment_2"


    // $ANTLR start "rule__ModelSequence__ModelsAssignment_3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5692:1: rule__ModelSequence__ModelsAssignment_3 : ( ruleModel ) ;
    public final void rule__ModelSequence__ModelsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5696:1: ( ( ruleModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5697:1: ( ruleModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5697:1: ( ruleModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5698:1: ruleModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelSequenceAccess().getModelsModelParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleModel_in_rule__ModelSequence__ModelsAssignment_311499);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelSequenceAccess().getModelsModelParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__ModelsAssignment_3"


    // $ANTLR start "rule__ModelSequence__ModelsAssignment_4_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5707:1: rule__ModelSequence__ModelsAssignment_4_1 : ( ruleModel ) ;
    public final void rule__ModelSequence__ModelsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5711:1: ( ( ruleModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5712:1: ( ruleModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5712:1: ( ruleModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5713:1: ruleModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelSequenceAccess().getModelsModelParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleModel_in_rule__ModelSequence__ModelsAssignment_4_111530);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelSequenceAccess().getModelsModelParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelSequence__ModelsAssignment_4_1"


    // $ANTLR start "rule__Model__NameAssignment"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5722:1: rule__Model__NameAssignment : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5726:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5727:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5727:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5728:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment11561); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment"


    // $ANTLR start "rule__Weaver__ReferenceAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5737:1: rule__Weaver__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Weaver__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5741:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5742:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5742:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5743:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getReferenceJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5744:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5745:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getReferenceJvmTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Weaver__ReferenceAssignment_111596); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5756:1: rule__Weaver__SourceModelAssignment_2_0 : ( ruleSourceModelSelector ) ;
    public final void rule__Weaver__SourceModelAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5760:1: ( ( ruleSourceModelSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5761:1: ( ruleSourceModelSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5761:1: ( ruleSourceModelSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5762:1: ruleSourceModelSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getSourceModelSourceModelSelectorParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelSelector_in_rule__Weaver__SourceModelAssignment_2_011631);
            ruleSourceModelSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getSourceModelSourceModelSelectorParserRuleCall_2_0_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5771:1: rule__Weaver__AspectModelAssignment_3 : ( ruleAspectModel ) ;
    public final void rule__Weaver__AspectModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5775:1: ( ( ruleAspectModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5776:1: ( ruleAspectModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5776:1: ( ruleAspectModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5777:1: ruleAspectModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getAspectModelAspectModelParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleAspectModel_in_rule__Weaver__AspectModelAssignment_311662);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5786:1: rule__Weaver__TargetModelAssignment_4_1 : ( ruleTargetModel ) ;
    public final void rule__Weaver__TargetModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5790:1: ( ( ruleTargetModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5791:1: ( ruleTargetModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5791:1: ( ruleTargetModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5792:1: ruleTargetModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWeaverAccess().getTargetModelTargetModelParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleTargetModel_in_rule__Weaver__TargetModelAssignment_4_111693);
            ruleTargetModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWeaverAccess().getTargetModelTargetModelParserRuleCall_4_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__SeparateModels__PointcutAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5801:1: rule__SeparateModels__PointcutAssignment_1 : ( ruleTargetModel ) ;
    public final void rule__SeparateModels__PointcutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5805:1: ( ( ruleTargetModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5806:1: ( ruleTargetModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5806:1: ( ruleTargetModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5807:1: ruleTargetModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeparateModelsAccess().getPointcutTargetModelParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTargetModel_in_rule__SeparateModels__PointcutAssignment_111724);
            ruleTargetModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeparateModelsAccess().getPointcutTargetModelParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeparateModels__PointcutAssignment_1"


    // $ANTLR start "rule__SeparateModels__AdviceAssignment_3"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5816:1: rule__SeparateModels__AdviceAssignment_3 : ( ruleCombinedModel ) ;
    public final void rule__SeparateModels__AdviceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5820:1: ( ( ruleCombinedModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5821:1: ( ruleCombinedModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5821:1: ( ruleCombinedModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5822:1: ruleCombinedModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeparateModelsAccess().getAdviceCombinedModelParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCombinedModel_in_rule__SeparateModels__AdviceAssignment_311755);
            ruleCombinedModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeparateModelsAccess().getAdviceCombinedModelParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeparateModels__AdviceAssignment_3"


    // $ANTLR start "rule__Generator__ReferenceAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5831:1: rule__Generator__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Generator__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5835:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5836:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5836:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5837:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReferenceJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5838:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5839:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getReferenceJvmTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Generator__ReferenceAssignment_111790); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5850:1: rule__Generator__SourceAuxModelsAssignment_2_1 : ( ruleSourceModelSelector ) ;
    public final void rule__Generator__SourceAuxModelsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5854:1: ( ( ruleSourceModelSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5855:1: ( ruleSourceModelSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5855:1: ( ruleSourceModelSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5856:1: ruleSourceModelSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceAuxModelsSourceModelSelectorParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelSelector_in_rule__Generator__SourceAuxModelsAssignment_2_111825);
            ruleSourceModelSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceAuxModelsSourceModelSelectorParserRuleCall_2_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5865:1: rule__Generator__SourceAuxModelsAssignment_2_2_1 : ( ruleSourceModelSelector ) ;
    public final void rule__Generator__SourceAuxModelsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5869:1: ( ( ruleSourceModelSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5870:1: ( ruleSourceModelSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5870:1: ( ruleSourceModelSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5871:1: ruleSourceModelSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceAuxModelsSourceModelSelectorParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelSelector_in_rule__Generator__SourceAuxModelsAssignment_2_2_111856);
            ruleSourceModelSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceAuxModelsSourceModelSelectorParserRuleCall_2_2_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5880:1: rule__Generator__SourceModelAssignment_4 : ( ruleSourceModelSelector ) ;
    public final void rule__Generator__SourceModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5884:1: ( ( ruleSourceModelSelector ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5885:1: ( ruleSourceModelSelector )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5885:1: ( ruleSourceModelSelector )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5886:1: ruleSourceModelSelector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceModelSourceModelSelectorParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleSourceModelSelector_in_rule__Generator__SourceModelAssignment_411887);
            ruleSourceModelSelector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getSourceModelSourceModelSelectorParserRuleCall_4_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5895:1: rule__Generator__TargetModelAssignment_5_1 : ( ruleTargetModel ) ;
    public final void rule__Generator__TargetModelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5899:1: ( ( ruleTargetModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5900:1: ( ruleTargetModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5900:1: ( ruleTargetModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5901:1: ruleTargetModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetModelTargetModelParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleTargetModel_in_rule__Generator__TargetModelAssignment_5_111918);
            ruleTargetModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGeneratorAccess().getTargetModelTargetModelParserRuleCall_5_1_0()); 
            }

            }


            }

        }
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5910:1: rule__Generator__TargetTraceModelAssignment_6_1_1 : ( ruleTargetTraceModel ) ;
    public final void rule__Generator__TargetTraceModelAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5914:1: ( ( ruleTargetTraceModel ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5915:1: ( ruleTargetTraceModel )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5915:1: ( ruleTargetTraceModel )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5916:1: ruleTargetTraceModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getTargetTraceModelTargetTraceModelParserRuleCall_6_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleTargetTraceModel_in_rule__Generator__TargetTraceModelAssignment_6_1_111949);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5925:1: rule__Generator__SourceTraceModelsAssignment_6_2_1 : ( ruleTraceModelReference ) ;
    public final void rule__Generator__SourceTraceModelsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5929:1: ( ( ruleTraceModelReference ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5930:1: ( ruleTraceModelReference )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5930:1: ( ruleTraceModelReference )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5931:1: ruleTraceModelReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceTraceModelsTraceModelReferenceParserRuleCall_6_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleTraceModelReference_in_rule__Generator__SourceTraceModelsAssignment_6_2_111980);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5940:1: rule__Generator__SourceTraceModelsAssignment_6_2_2_1 : ( ruleTraceModelReference ) ;
    public final void rule__Generator__SourceTraceModelsAssignment_6_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5944:1: ( ( ruleTraceModelReference ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5945:1: ( ruleTraceModelReference )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5945:1: ( ruleTraceModelReference )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5946:1: ruleTraceModelReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGeneratorAccess().getSourceTraceModelsTraceModelReferenceParserRuleCall_6_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleTraceModelReference_in_rule__Generator__SourceTraceModelsAssignment_6_2_2_112011);
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


    // $ANTLR start "rule__SourceModelSelector__ReferenceAssignment_0_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5955:1: rule__SourceModelSelector__ReferenceAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__SourceModelSelector__ReferenceAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5959:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5960:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5960:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5961:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getReferenceModelCrossReference_0_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5962:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5963:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getReferenceModelIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SourceModelSelector__ReferenceAssignment_0_012046); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getReferenceModelIDTerminalRuleCall_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getReferenceModelCrossReference_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__ReferenceAssignment_0_0"


    // $ANTLR start "rule__SourceModelSelector__ConstraintAssignment_0_1_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5974:1: rule__SourceModelSelector__ConstraintAssignment_0_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__SourceModelSelector__ConstraintAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5978:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5979:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5979:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5980:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getConstraintConstraintExpressionParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__SourceModelSelector__ConstraintAssignment_0_1_112081);
            ruleConstraintExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getConstraintConstraintExpressionParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__ConstraintAssignment_0_1_1"


    // $ANTLR start "rule__SourceModelSelector__PropertyAssignment_0_2_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5989:1: rule__SourceModelSelector__PropertyAssignment_0_2_1 : ( ruleNodeProperty ) ;
    public final void rule__SourceModelSelector__PropertyAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5993:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5994:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5994:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:5995:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSourceModelSelectorAccess().getPropertyNodePropertyParserRuleCall_0_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__SourceModelSelector__PropertyAssignment_0_2_112112);
            ruleNodeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSourceModelSelectorAccess().getPropertyNodePropertyParserRuleCall_0_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceModelSelector__PropertyAssignment_0_2_1"


    // $ANTLR start "rule__TargetModel__ReferenceAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6004:1: rule__TargetModel__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TargetModel__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6008:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6009:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6009:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6010:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelAccess().getReferenceModelCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6011:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6012:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTargetModelAccess().getReferenceModelIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TargetModel__ReferenceAssignment_112147); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelAccess().getReferenceModelIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTargetModelAccess().getReferenceModelCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetModel__ReferenceAssignment_1"


    // $ANTLR start "rule__ModelType__TargetAssignment_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6023:1: rule__ModelType__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ModelType__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6027:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6028:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6028:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6029:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelTypeAccess().getTargetRegisteredRootClassCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6030:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6031:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelTypeAccess().getTargetRegisteredRootClassIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModelType__TargetAssignment_012186); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelTypeAccess().getTargetRegisteredRootClassIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelTypeAccess().getTargetRegisteredRootClassCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__TargetAssignment_0"


    // $ANTLR start "rule__ModelType__PropertyAssignment_1_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6042:1: rule__ModelType__PropertyAssignment_1_1 : ( ruleNodeProperty ) ;
    public final void rule__ModelType__PropertyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6046:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6047:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6047:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6048:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelTypeAccess().getPropertyNodePropertyParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__ModelType__PropertyAssignment_1_112221);
            ruleNodeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelTypeAccess().getPropertyNodePropertyParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__PropertyAssignment_1_1"


    // $ANTLR start "rule__ModelType__CollectionAssignment_2"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6057:1: rule__ModelType__CollectionAssignment_2 : ( ( '[]' ) ) ;
    public final void rule__ModelType__CollectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6061:1: ( ( ( '[]' ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6062:1: ( ( '[]' ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6062:1: ( ( '[]' ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6063:1: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelTypeAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6064:1: ( '[]' )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6065:1: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelTypeAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }
            match(input,54,FOLLOW_54_in_rule__ModelType__CollectionAssignment_212257); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelTypeAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelTypeAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelType__CollectionAssignment_2"


    // $ANTLR start "rule__NodeProperty__PropertyAssignment_0"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6080:1: rule__NodeProperty__PropertyAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NodeProperty__PropertyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6084:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6085:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6085:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6086:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyJvmMemberCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6087:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6088:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getPropertyJvmMemberIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeProperty__PropertyAssignment_012300); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6099:1: rule__NodeProperty__ConstraintAssignment_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__NodeProperty__ConstraintAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6103:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6104:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6104:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6105:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getConstraintConstraintExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__NodeProperty__ConstraintAssignment_1_112335);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6114:1: rule__NodeProperty__SubPropertyAssignment_2_1 : ( ruleNodeProperty ) ;
    public final void rule__NodeProperty__SubPropertyAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6118:1: ( ( ruleNodeProperty ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6119:1: ( ruleNodeProperty )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6119:1: ( ruleNodeProperty )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6120:1: ruleNodeProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodePropertyAccess().getSubPropertyNodePropertyParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeProperty_in_rule__NodeProperty__SubPropertyAssignment_2_112366);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6129:1: rule__ConstraintExpression__OperatorAssignment_1_0_0_1 : ( ruleLogicOperator ) ;
    public final void rule__ConstraintExpression__OperatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6133:1: ( ( ruleLogicOperator ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6134:1: ( ruleLogicOperator )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6134:1: ( ruleLogicOperator )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6135:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_112397);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6144:1: rule__ConstraintExpression__RightAssignment_1_1 : ( ruleConstraintExpression ) ;
    public final void rule__ConstraintExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6148:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6149:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6149:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6150:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintExpressionAccess().getRightConstraintExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__ConstraintExpression__RightAssignment_1_112428);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6159:1: rule__CompareExpression__ComparatorAssignment_1_0_0_1 : ( ruleComparator ) ;
    public final void rule__CompareExpression__ComparatorAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6163:1: ( ( ruleComparator ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6164:1: ( ruleComparator )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6164:1: ( ruleComparator )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6165:1: ruleComparator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getComparatorComparatorEnumRuleCall_1_0_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleComparator_in_rule__CompareExpression__ComparatorAssignment_1_0_0_112459);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6174:1: rule__CompareExpression__RightAssignment_1_1 : ( ruleBasicConstraint ) ;
    public final void rule__CompareExpression__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6178:1: ( ( ruleBasicConstraint ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6179:1: ( ruleBasicConstraint )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6179:1: ( ruleBasicConstraint )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6180:1: ruleBasicConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareExpressionAccess().getRightBasicConstraintParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__RightAssignment_1_112490);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6189:1: rule__Negation__ConstraintAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__Negation__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6193:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6194:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6194:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6195:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__Negation__ConstraintAssignment_112521);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6204:1: rule__ParenthesisConstraint__ConstraintAssignment_1 : ( ruleConstraintExpression ) ;
    public final void rule__ParenthesisConstraint__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6208:1: ( ( ruleConstraintExpression ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6209:1: ( ruleConstraintExpression )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6209:1: ( ruleConstraintExpression )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6210:1: ruleConstraintExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisConstraintAccess().getConstraintConstraintExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_112552);
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


    // $ANTLR start "rule__InstanceOf__TypeAssignment_1"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6219:1: rule__InstanceOf__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceOf__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6223:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6224:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6224:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6225:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceOfAccess().getTypeJvmTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6226:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6227:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceOfAccess().getTypeJvmTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__InstanceOf__TypeAssignment_112587); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceOfAccess().getTypeJvmTypeIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceOfAccess().getTypeJvmTypeCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOf__TypeAssignment_1"


    // $ANTLR start "rule__TraceModelReference__TraceModelAssignment"
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6238:1: rule__TraceModelReference__TraceModelAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TraceModelReference__TraceModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6242:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6243:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6243:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6244:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelReferenceAccess().getTraceModelTraceModelCrossReference_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6245:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6246:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelReferenceAccess().getTraceModelTraceModelIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TraceModelReference__TraceModelAssignment12626); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6257:1: rule__TraceModel__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TraceModel__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6261:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6262:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6262:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6263:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TraceModel__NameAssignment_012661); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6272:1: rule__TraceModel__NodeSetRelationsAssignment_2 : ( ruleNodeSetRelation ) ;
    public final void rule__TraceModel__NodeSetRelationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6276:1: ( ( ruleNodeSetRelation ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6277:1: ( ruleNodeSetRelation )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6277:1: ( ruleNodeSetRelation )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6278:1: ruleNodeSetRelation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTraceModelAccess().getNodeSetRelationsNodeSetRelationParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNodeSetRelation_in_rule__TraceModel__NodeSetRelationsAssignment_212692);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6287:1: rule__NodeSetRelation__SourceNodesAssignment_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__SourceNodesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6291:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6292:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6292:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6293:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_112723);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6302:1: rule__NodeSetRelation__SourceNodesAssignment_2_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__SourceNodesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6306:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6307:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6307:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6308:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getSourceNodesNodeTypeParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_2_112754);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6317:1: rule__NodeSetRelation__TargetNodesAssignment_4 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__TargetNodesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6321:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6322:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6322:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6323:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_412785);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6332:1: rule__NodeSetRelation__TargetNodesAssignment_5_1 : ( ruleNodeType ) ;
    public final void rule__NodeSetRelation__TargetNodesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6336:1: ( ( ruleNodeType ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6337:1: ( ruleNodeType )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6337:1: ( ruleNodeType )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6338:1: ruleNodeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeSetRelationAccess().getTargetNodesNodeTypeParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_5_112816);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6347:1: rule__NodeType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NodeType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6351:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6352:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6352:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6353:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getTypeJvmTypeCrossReference_0()); 
            }
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6354:1: ( RULE_ID )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6355:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeTypeAccess().getTypeJvmTypeIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeType__TypeAssignment12851); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6366:1: rule__ArrayLiteral__LiteralsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6370:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6371:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6371:1: ( ruleLiteral )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6372:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_112886);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6381:1: rule__ArrayLiteral__LiteralsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6385:1: ( ( ruleLiteral ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6386:1: ( ruleLiteral )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6386:1: ( ruleLiteral )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6387:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_112917);
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6396:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6400:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6401:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6401:1: ( RULE_STRING )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6402:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12948); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6411:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6415:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6416:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6416:1: ( RULE_INT )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6417:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment12979); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6426:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6430:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6431:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6431:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6432:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment13010); if (state.failed) return ;
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
    // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6441:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6445:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6446:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6446:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:6447:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment13041); if (state.failed) return ;
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

    // $ANTLR start synpred44_InternalArchitecture
    public final void synpred44_InternalArchitecture_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4029:2: ( rule__ConstraintExpression__Group_1__0 )
        // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4029:2: rule__ConstraintExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__ConstraintExpression__Group_1__0_in_synpred44_InternalArchitecture8207);
        rule__ConstraintExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_InternalArchitecture

    // $ANTLR start synpred45_InternalArchitecture
    public final void synpred45_InternalArchitecture_fragment() throws RecognitionException {   
        // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4244:2: ( rule__CompareExpression__Group_1__0 )
        // ../de.cau.cs.se.geco.architecture.ui/src-gen/de/cau/cs/se/geco/architecture/ui/contentassist/antlr/internal/InternalArchitecture.g:4244:2: rule__CompareExpression__Group_1__0
        {
        pushFollow(FOLLOW_rule__CompareExpression__Group_1__0_in_synpred45_InternalArchitecture8630);
        rule__CompareExpression__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalArchitecture

    // Delegated rules

    public final boolean synpred45_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalArchitecture_fragment(); // can never throw exception
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


    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA34_eotS =
        "\12\uffff";
    static final String DFA34_eofS =
        "\1\10\11\uffff";
    static final String DFA34_minS =
        "\1\22\7\0\2\uffff";
    static final String DFA34_maxS =
        "\1\53\7\0\2\uffff";
    static final String DFA34_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\4\1\0\1\5\1\1\1\6\1\2\1\3\2\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\10\1\1\1\2\1\3\1\4\1\5\1\6\1\7\14\uffff\1\10\3\uffff\1\10",
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "4244:1: ( rule__CompareExpression__Group_1__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_7 = input.LA(1);

                         
                        int index34_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index34_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred45_InternalArchitecture()) ) {s = 9;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleGecoModel_in_entryRuleGecoModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGecoModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GecoModel__Group__0_in_ruleGecoModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredRootClass_in_entryRuleRegisteredRootClass187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisteredRootClass194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__Group__0_in_ruleRegisteredRootClass220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelSequence_in_entryRuleModelSequence247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelSequence254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group__0_in_ruleModelSequence280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_in_ruleModel340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_entryRuleFragment367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFragment374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fragment__Alternatives_in_ruleFragment400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaver_in_entryRuleWeaver427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeaver434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__0_in_ruleWeaver460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectModel_in_entryRuleAspectModel487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspectModel494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AspectModel__Alternatives_in_ruleAspectModel520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeparateModels_in_entryRuleSeparateModels547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSeparateModels554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SeparateModels__Group__0_in_ruleSeparateModels580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCombinedModel_in_entryRuleCombinedModel607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCombinedModel614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CombinedModel__Alternatives_in_ruleCombinedModel640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_entryRuleGenerator667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerator674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__0_in_ruleGenerator700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelSelector_in_entryRuleSourceModelSelector727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceModelSelector734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Alternatives_in_ruleSourceModelSelector760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModel_in_entryRuleTargetModel787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetModel794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModel__Group__0_in_ruleTargetModel820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelType_in_entryRuleModelType847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelType854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelType__Group__0_in_ruleModelType880 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0_in_ruleNegation1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_entryRuleParenthesisConstraint1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisConstraint1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__0_in_ruleParenthesisConstraint1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_entryRuleOperand1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperand1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operand__Alternatives_in_ruleOperand1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOf_in_entryRuleInstanceOf1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceOf1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOf__Group__0_in_ruleInstanceOf1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetTraceModel_in_entryRuleTargetTraceModel1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTargetTraceModel1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetTraceModel__Alternatives_in_ruleTargetTraceModel1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModelReference_in_entryRuleTraceModelReference1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraceModelReference1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModelReference__TraceModelAssignment_in_ruleTraceModelReference1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModel_in_entryRuleTraceModel1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraceModel1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__0_in_ruleTraceModel1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSetRelation_in_entryRuleNodeSetRelation1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeSetRelation1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__0_in_ruleNodeSetRelation1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_entryRuleNodeType1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeType1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__TypeAssignment_in_ruleNodeType1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_entryRuleArrayLiteral1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteral1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0_in_ruleArrayLiteral1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__ValueAssignment_in_ruleStringLiteral1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_entryRuleIntLiteral1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntLiteral1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntLiteral__ValueAssignment_in_ruleIntLiteral1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_entryRuleFloatLiteral1927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatLiteral1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatLiteral__ValueAssignment_in_ruleFloatLiteral1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanLiteral__ValueAssignment_in_ruleBooleanLiteral2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelModifier__Alternatives_in_ruleModelModifier2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOperator__Alternatives_in_ruleLogicOperator2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparator__Alternatives_in_ruleComparator2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__ImportedNamespaceAssignment_2_0_in_rule__RegisteredRootClass__Alternatives_22226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__Group_2_1__0_in_rule__RegisteredRootClass__Alternatives_22244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_rule__Fragment__Alternatives2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeaver_in_rule__Fragment__Alternatives2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__SourceModelAssignment_2_0_in_rule__Weaver__Alternatives_22326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Weaver__Alternatives_22345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCombinedModel_in_rule__AspectModel__Alternatives2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeparateModels_in_rule__AspectModel__Alternatives2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModel_in_rule__CombinedModel__Alternatives2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerator_in_rule__CombinedModel__Alternatives2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0__0_in_rule__SourceModelSelector__Alternatives2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_1__0_in_rule__SourceModelSelector__Alternatives2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisConstraint_in_rule__BasicConstraint__Alternatives2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperand_in_rule__BasicConstraint__Alternatives2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__BasicConstraint__Alternatives2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Operand__Alternatives2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__Operand__Alternatives2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOf_in_rule__Operand__Alternatives2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModel_in_rule__TargetTraceModel__Alternatives2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetTraceModel__Group_1__0_in_rule__TargetTraceModel__Alternatives2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__Literal__Alternatives2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntLiteral_in_rule__Literal__Alternatives2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatLiteral_in_rule__Literal__Alternatives2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_rule__Literal__Alternatives2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteral_in_rule__Literal__Alternatives2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ModelModifier__Alternatives2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ModelModifier__Alternatives2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ModelModifier__Alternatives2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LogicOperator__Alternatives2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LogicOperator__Alternatives2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Comparator__Alternatives2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Comparator__Alternatives2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Comparator__Alternatives2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Comparator__Alternatives3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Comparator__Alternatives3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Comparator__Alternatives3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Comparator__Alternatives3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GecoModel__Group__0__Impl_in_rule__GecoModel__Group__03105 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GecoModel__Group__1_in_rule__GecoModel__Group__03108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__GecoModel__Group__0__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GecoModel__Group__1__Impl_in_rule__GecoModel__Group__13167 = new BitSet(new long[]{0x0000001170000000L});
    public static final BitSet FOLLOW_rule__GecoModel__Group__2_in_rule__GecoModel__Group__13170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GecoModel__NameAssignment_1_in_rule__GecoModel__Group__1__Impl3197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GecoModel__Group__2__Impl_in_rule__GecoModel__Group__23227 = new BitSet(new long[]{0x0000001170000000L});
    public static final BitSet FOLLOW_rule__GecoModel__Group__3_in_rule__GecoModel__Group__23230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GecoModel__ImportsAssignment_2_in_rule__GecoModel__Group__2__Impl3257 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__GecoModel__Group__3__Impl_in_rule__GecoModel__Group__33288 = new BitSet(new long[]{0x0000001170000000L});
    public static final BitSet FOLLOW_rule__GecoModel__Group__4_in_rule__GecoModel__Group__33291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GecoModel__RegisteredRootClassAssignment_3_in_rule__GecoModel__Group__3__Impl3318 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__GecoModel__Group__4__Impl_in_rule__GecoModel__Group__43349 = new BitSet(new long[]{0x0000001170000000L});
    public static final BitSet FOLLOW_rule__GecoModel__Group__5_in_rule__GecoModel__Group__43352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GecoModel__ModelsAssignment_4_in_rule__GecoModel__Group__4__Impl3379 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__GecoModel__Group__5__Impl_in_rule__GecoModel__Group__53410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GecoModel__FragmentsAssignment_5_in_rule__GecoModel__Group__5__Impl3437 = new BitSet(new long[]{0x0000001100000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Import__Group__0__Impl3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__Group__0__Impl_in_rule__RegisteredRootClass__Group__03603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__Group__1_in_rule__RegisteredRootClass__Group__03606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RegisteredRootClass__Group__0__Impl3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__Group__1__Impl_in_rule__RegisteredRootClass__Group__13665 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__Group__2_in_rule__RegisteredRootClass__Group__13668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__NameAssignment_1_in_rule__RegisteredRootClass__Group__1__Impl3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__Group__2__Impl_in_rule__RegisteredRootClass__Group__23725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__Alternatives_2_in_rule__RegisteredRootClass__Group__2__Impl3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__Group_2_1__0__Impl_in_rule__RegisteredRootClass__Group_2_1__03788 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__Group_2_1__1_in_rule__RegisteredRootClass__Group_2_1__03791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__IsTextAssignment_2_1_0_in_rule__RegisteredRootClass__Group_2_1__0__Impl3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__Group_2_1__1__Impl_in_rule__RegisteredRootClass__Group_2_1__13848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RegisteredRootClass__ExtensionAssignment_2_1_1_in_rule__RegisteredRootClass__Group_2_1__1__Impl3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group__0__Impl_in_rule__ModelSequence__Group__03909 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group__1_in_rule__ModelSequence__Group__03912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ModelSequence__Group__0__Impl3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group__1__Impl_in_rule__ModelSequence__Group__13971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group__2_in_rule__ModelSequence__Group__13974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSequence__ModifierAssignment_1_in_rule__ModelSequence__Group__1__Impl4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group__2__Impl_in_rule__ModelSequence__Group__24031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group__3_in_rule__ModelSequence__Group__24034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSequence__TypeAssignment_2_in_rule__ModelSequence__Group__2__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group__3__Impl_in_rule__ModelSequence__Group__34091 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group__4_in_rule__ModelSequence__Group__34094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSequence__ModelsAssignment_3_in_rule__ModelSequence__Group__3__Impl4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group__4__Impl_in_rule__ModelSequence__Group__44151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group_4__0_in_rule__ModelSequence__Group__4__Impl4178 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group_4__0__Impl_in_rule__ModelSequence__Group_4__04219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group_4__1_in_rule__ModelSequence__Group_4__04222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ModelSequence__Group_4__0__Impl4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSequence__Group_4__1__Impl_in_rule__ModelSequence__Group_4__14281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelSequence__ModelsAssignment_4_1_in_rule__ModelSequence__Group_4__1__Impl4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__0__Impl_in_rule__Weaver__Group__04342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Weaver__Group__1_in_rule__Weaver__Group__04345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Weaver__Group__0__Impl4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__1__Impl_in_rule__Weaver__Group__14404 = new BitSet(new long[]{0x0000200000004010L});
    public static final BitSet FOLLOW_rule__Weaver__Group__2_in_rule__Weaver__Group__14407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__ReferenceAssignment_1_in_rule__Weaver__Group__1__Impl4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__2__Impl_in_rule__Weaver__Group__24464 = new BitSet(new long[]{0x0000001400000010L});
    public static final BitSet FOLLOW_rule__Weaver__Group__3_in_rule__Weaver__Group__24467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Alternatives_2_in_rule__Weaver__Group__2__Impl4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__3__Impl_in_rule__Weaver__Group__34524 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Weaver__Group__4_in_rule__Weaver__Group__34527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__AspectModelAssignment_3_in_rule__Weaver__Group__3__Impl4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group__4__Impl_in_rule__Weaver__Group__44584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__0_in_rule__Weaver__Group__4__Impl4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__0__Impl_in_rule__Weaver__Group_4__04652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__1_in_rule__Weaver__Group_4__04655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Weaver__Group_4__0__Impl4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__Group_4__1__Impl_in_rule__Weaver__Group_4__14714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Weaver__TargetModelAssignment_4_1_in_rule__Weaver__Group_4__1__Impl4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SeparateModels__Group__0__Impl_in_rule__SeparateModels__Group__04775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SeparateModels__Group__1_in_rule__SeparateModels__Group__04778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SeparateModels__Group__0__Impl4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SeparateModels__Group__1__Impl_in_rule__SeparateModels__Group__14837 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SeparateModels__Group__2_in_rule__SeparateModels__Group__14840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SeparateModels__PointcutAssignment_1_in_rule__SeparateModels__Group__1__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SeparateModels__Group__2__Impl_in_rule__SeparateModels__Group__24897 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__SeparateModels__Group__3_in_rule__SeparateModels__Group__24900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SeparateModels__Group__2__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SeparateModels__Group__3__Impl_in_rule__SeparateModels__Group__34959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SeparateModels__AdviceAssignment_3_in_rule__SeparateModels__Group__3__Impl4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__0__Impl_in_rule__Generator__Group__05024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__1_in_rule__Generator__Group__05027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Generator__Group__0__Impl5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__1__Impl_in_rule__Generator__Group__15086 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__2_in_rule__Generator__Group__15089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__ReferenceAssignment_1_in_rule__Generator__Group__1__Impl5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__2__Impl_in_rule__Generator__Group__25146 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__3_in_rule__Generator__Group__25149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__0_in_rule__Generator__Group__2__Impl5176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__3__Impl_in_rule__Generator__Group__35207 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group__4_in_rule__Generator__Group__35210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Generator__Group__3__Impl5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__4__Impl_in_rule__Generator__Group__45269 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__5_in_rule__Generator__Group__45272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceModelAssignment_4_in_rule__Generator__Group__4__Impl5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__5__Impl_in_rule__Generator__Group__55329 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_rule__Generator__Group__6_in_rule__Generator__Group__55332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__0_in_rule__Generator__Group__5__Impl5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group__6__Impl_in_rule__Generator__Group__65390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__0_in_rule__Generator__Group__6__Impl5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__0__Impl_in_rule__Generator__Group_2__05462 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__1_in_rule__Generator__Group_2__05465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Generator__Group_2__0__Impl5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__1__Impl_in_rule__Generator__Group_2__15524 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__2_in_rule__Generator__Group_2__15527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceAuxModelsAssignment_2_1_in_rule__Generator__Group_2__1__Impl5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__2__Impl_in_rule__Generator__Group_2__25584 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__3_in_rule__Generator__Group_2__25587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2_2__0_in_rule__Generator__Group_2__2__Impl5614 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2__3__Impl_in_rule__Generator__Group_2__35645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Generator__Group_2__3__Impl5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2_2__0__Impl_in_rule__Generator__Group_2_2__05712 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_2_2__1_in_rule__Generator__Group_2_2__05715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Generator__Group_2_2__0__Impl5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_2_2__1__Impl_in_rule__Generator__Group_2_2__15774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceAuxModelsAssignment_2_2_1_in_rule__Generator__Group_2_2__1__Impl5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__0__Impl_in_rule__Generator__Group_5__05835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__1_in_rule__Generator__Group_5__05838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Generator__Group_5__0__Impl5866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_5__1__Impl_in_rule__Generator__Group_5__15897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__TargetModelAssignment_5_1_in_rule__Generator__Group_5__1__Impl5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__0__Impl_in_rule__Generator__Group_6__05958 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__1_in_rule__Generator__Group_6__05961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Generator__Group_6__0__Impl5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__1__Impl_in_rule__Generator__Group_6__16020 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__2_in_rule__Generator__Group_6__16023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_1__0_in_rule__Generator__Group_6__1__Impl6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6__2__Impl_in_rule__Generator__Group_6__26081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__0_in_rule__Generator__Group_6__2__Impl6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_1__0__Impl_in_rule__Generator__Group_6_1__06145 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_1__1_in_rule__Generator__Group_6_1__06148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Generator__Group_6_1__0__Impl6176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_1__1__Impl_in_rule__Generator__Group_6_1__16207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__TargetTraceModelAssignment_6_1_1_in_rule__Generator__Group_6_1__1__Impl6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__0__Impl_in_rule__Generator__Group_6_2__06268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__1_in_rule__Generator__Group_6_2__06271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Generator__Group_6_2__0__Impl6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__1__Impl_in_rule__Generator__Group_6_2__16330 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__2_in_rule__Generator__Group_6_2__16333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceTraceModelsAssignment_6_2_1_in_rule__Generator__Group_6_2__1__Impl6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2__2__Impl_in_rule__Generator__Group_6_2__26390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2_2__0_in_rule__Generator__Group_6_2__2__Impl6417 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2_2__0__Impl_in_rule__Generator__Group_6_2_2__06454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2_2__1_in_rule__Generator__Group_6_2_2__06457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Generator__Group_6_2_2__0__Impl6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__Group_6_2_2__1__Impl_in_rule__Generator__Group_6_2_2__16516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Generator__SourceTraceModelsAssignment_6_2_2_1_in_rule__Generator__Group_6_2_2__1__Impl6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0__0__Impl_in_rule__SourceModelSelector__Group_0__06577 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0__1_in_rule__SourceModelSelector__Group_0__06580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__ReferenceAssignment_0_0_in_rule__SourceModelSelector__Group_0__0__Impl6607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0__1__Impl_in_rule__SourceModelSelector__Group_0__16637 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0__2_in_rule__SourceModelSelector__Group_0__16640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0_1__0_in_rule__SourceModelSelector__Group_0__1__Impl6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0__2__Impl_in_rule__SourceModelSelector__Group_0__26698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0_2__0_in_rule__SourceModelSelector__Group_0__2__Impl6725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0_1__0__Impl_in_rule__SourceModelSelector__Group_0_1__06762 = new BitSet(new long[]{0x0004C040000001F0L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0_1__1_in_rule__SourceModelSelector__Group_0_1__06765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SourceModelSelector__Group_0_1__0__Impl6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0_1__1__Impl_in_rule__SourceModelSelector__Group_0_1__16824 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0_1__2_in_rule__SourceModelSelector__Group_0_1__16827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__ConstraintAssignment_0_1_1_in_rule__SourceModelSelector__Group_0_1__1__Impl6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0_1__2__Impl_in_rule__SourceModelSelector__Group_0_1__26884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SourceModelSelector__Group_0_1__2__Impl6912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0_2__0__Impl_in_rule__SourceModelSelector__Group_0_2__06949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0_2__1_in_rule__SourceModelSelector__Group_0_2__06952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SourceModelSelector__Group_0_2__0__Impl6980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_0_2__1__Impl_in_rule__SourceModelSelector__Group_0_2__17011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__PropertyAssignment_0_2_1_in_rule__SourceModelSelector__Group_0_2__1__Impl7038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_1__0__Impl_in_rule__SourceModelSelector__Group_1__07072 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_1__1_in_rule__SourceModelSelector__Group_1__07075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SourceModelSelector__Group_1__1__Impl_in_rule__SourceModelSelector__Group_1__17133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__SourceModelSelector__Group_1__1__Impl7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModel__Group__0__Impl_in_rule__TargetModel__Group__07196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TargetModel__Group__1_in_rule__TargetModel__Group__07199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModel__Group__1__Impl_in_rule__TargetModel__Group__17257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetModel__ReferenceAssignment_1_in_rule__TargetModel__Group__1__Impl7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelType__Group__0__Impl_in_rule__ModelType__Group__07318 = new BitSet(new long[]{0x0040100000000000L});
    public static final BitSet FOLLOW_rule__ModelType__Group__1_in_rule__ModelType__Group__07321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelType__TargetAssignment_0_in_rule__ModelType__Group__0__Impl7348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelType__Group__1__Impl_in_rule__ModelType__Group__17378 = new BitSet(new long[]{0x0040100000000000L});
    public static final BitSet FOLLOW_rule__ModelType__Group__2_in_rule__ModelType__Group__17381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelType__Group_1__0_in_rule__ModelType__Group__1__Impl7408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelType__Group__2__Impl_in_rule__ModelType__Group__27439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelType__CollectionAssignment_2_in_rule__ModelType__Group__2__Impl7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelType__Group_1__0__Impl_in_rule__ModelType__Group_1__07503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModelType__Group_1__1_in_rule__ModelType__Group_1__07506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ModelType__Group_1__0__Impl7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelType__Group_1__1__Impl_in_rule__ModelType__Group_1__17565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelType__PropertyAssignment_1_1_in_rule__ModelType__Group_1__1__Impl7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__0__Impl_in_rule__NodeProperty__Group__07626 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__1_in_rule__NodeProperty__Group__07629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__PropertyAssignment_0_in_rule__NodeProperty__Group__0__Impl7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__1__Impl_in_rule__NodeProperty__Group__17686 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__2_in_rule__NodeProperty__Group__17689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__0_in_rule__NodeProperty__Group__1__Impl7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group__2__Impl_in_rule__NodeProperty__Group__27747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__0_in_rule__NodeProperty__Group__2__Impl7774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__0__Impl_in_rule__NodeProperty__Group_1__07811 = new BitSet(new long[]{0x0004C040000001F0L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__1_in_rule__NodeProperty__Group_1__07814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__NodeProperty__Group_1__0__Impl7842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__1__Impl_in_rule__NodeProperty__Group_1__17873 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__2_in_rule__NodeProperty__Group_1__17876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__ConstraintAssignment_1_1_in_rule__NodeProperty__Group_1__1__Impl7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_1__2__Impl_in_rule__NodeProperty__Group_1__27933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__NodeProperty__Group_1__2__Impl7961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__0__Impl_in_rule__NodeProperty__Group_2__07998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__1_in_rule__NodeProperty__Group_2__08001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__NodeProperty__Group_2__0__Impl8029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__Group_2__1__Impl_in_rule__NodeProperty__Group_2__18060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeProperty__SubPropertyAssignment_2_1_in_rule__NodeProperty__Group_2__1__Impl8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__0__Impl_in_rule__ConstraintExpression__Group__08121 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1_in_rule__ConstraintExpression__Group__08124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareExpression_in_rule__ConstraintExpression__Group__0__Impl8151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group__1__Impl_in_rule__ConstraintExpression__Group__18180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0_in_rule__ConstraintExpression__Group__1__Impl8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0__Impl_in_rule__ConstraintExpression__Group_1__08242 = new BitSet(new long[]{0x0004C040000001F0L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1_in_rule__ConstraintExpression__Group_1__08245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0_in_rule__ConstraintExpression__Group_1__0__Impl8272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__1__Impl_in_rule__ConstraintExpression__Group_1__18302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__RightAssignment_1_1_in_rule__ConstraintExpression__Group_1__1__Impl8329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0__0__Impl_in_rule__ConstraintExpression__Group_1_0__08363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0_in_rule__ConstraintExpression__Group_1_0__0__Impl8390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__0__Impl_in_rule__ConstraintExpression__Group_1_0_0__08422 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1_in_rule__ConstraintExpression__Group_1_0_0__08425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1_0_0__1__Impl_in_rule__ConstraintExpression__Group_1_0_0__18483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__OperatorAssignment_1_0_0_1_in_rule__ConstraintExpression__Group_1_0_0__1__Impl8510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__0__Impl_in_rule__CompareExpression__Group__08544 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1_in_rule__CompareExpression__Group__08547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__Group__0__Impl8574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group__1__Impl_in_rule__CompareExpression__Group__18603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_rule__CompareExpression__Group__1__Impl8630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0__Impl_in_rule__CompareExpression__Group_1__08665 = new BitSet(new long[]{0x0004C040000001F0L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1_in_rule__CompareExpression__Group_1__08668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0_in_rule__CompareExpression__Group_1__0__Impl8695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__1__Impl_in_rule__CompareExpression__Group_1__18725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__RightAssignment_1_1_in_rule__CompareExpression__Group_1__1__Impl8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0__0__Impl_in_rule__CompareExpression__Group_1_0__08786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0_in_rule__CompareExpression__Group_1_0__0__Impl8813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__0__Impl_in_rule__CompareExpression__Group_1_0_0__08845 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1_in_rule__CompareExpression__Group_1_0_0__08848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1_0_0__1__Impl_in_rule__CompareExpression__Group_1_0_0__18906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__ComparatorAssignment_1_0_0_1_in_rule__CompareExpression__Group_1_0_0__1__Impl8933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__08967 = new BitSet(new long[]{0x0004C040000001F0L});
    public static final BitSet FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__08970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Negation__Group__0__Impl8998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__19029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__ConstraintAssignment_1_in_rule__Negation__Group__1__Impl9056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__0__Impl_in_rule__ParenthesisConstraint__Group__09090 = new BitSet(new long[]{0x0004C040000001F0L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1_in_rule__ParenthesisConstraint__Group__09093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ParenthesisConstraint__Group__0__Impl9121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__1__Impl_in_rule__ParenthesisConstraint__Group__19152 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2_in_rule__ParenthesisConstraint__Group__19155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__ConstraintAssignment_1_in_rule__ParenthesisConstraint__Group__1__Impl9182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisConstraint__Group__2__Impl_in_rule__ParenthesisConstraint__Group__29212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ParenthesisConstraint__Group__2__Impl9240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOf__Group__0__Impl_in_rule__InstanceOf__Group__09277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__InstanceOf__Group__1_in_rule__InstanceOf__Group__09280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__InstanceOf__Group__0__Impl9308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOf__Group__1__Impl_in_rule__InstanceOf__Group__19339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOf__TypeAssignment_1_in_rule__InstanceOf__Group__1__Impl9366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetTraceModel__Group_1__0__Impl_in_rule__TargetTraceModel__Group_1__09400 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TargetTraceModel__Group_1__1_in_rule__TargetTraceModel__Group_1__09403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TargetTraceModel__Group_1__0__Impl9431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TargetTraceModel__Group_1__1__Impl_in_rule__TargetTraceModel__Group_1__19462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModelReference_in_rule__TargetTraceModel__Group_1__1__Impl9489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__0__Impl_in_rule__TraceModel__Group__09522 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__1_in_rule__TraceModel__Group__09525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NameAssignment_0_in_rule__TraceModel__Group__0__Impl9552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__1__Impl_in_rule__TraceModel__Group__19582 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__2_in_rule__TraceModel__Group__19585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TraceModel__Group__1__Impl9613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__2__Impl_in_rule__TraceModel__Group__29644 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__3_in_rule__TraceModel__Group__29647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl9676 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__NodeSetRelationsAssignment_2_in_rule__TraceModel__Group__2__Impl9688 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__TraceModel__Group__3__Impl_in_rule__TraceModel__Group__39721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TraceModel__Group__3__Impl9749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__0__Impl_in_rule__NodeSetRelation__Group__09788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__1_in_rule__NodeSetRelation__Group__09791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__NodeSetRelation__Group__0__Impl9819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__1__Impl_in_rule__NodeSetRelation__Group__19850 = new BitSet(new long[]{0x0002000080000000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__2_in_rule__NodeSetRelation__Group__19853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_1_in_rule__NodeSetRelation__Group__1__Impl9880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__2__Impl_in_rule__NodeSetRelation__Group__29910 = new BitSet(new long[]{0x0002000080000000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__3_in_rule__NodeSetRelation__Group__29913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__0_in_rule__NodeSetRelation__Group__2__Impl9940 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__3__Impl_in_rule__NodeSetRelation__Group__39971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__4_in_rule__NodeSetRelation__Group__39974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__NodeSetRelation__Group__3__Impl10002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__4__Impl_in_rule__NodeSetRelation__Group__410033 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__5_in_rule__NodeSetRelation__Group__410036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_4_in_rule__NodeSetRelation__Group__4__Impl10063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__5__Impl_in_rule__NodeSetRelation__Group__510093 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__6_in_rule__NodeSetRelation__Group__510096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__0_in_rule__NodeSetRelation__Group__5__Impl10123 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group__6__Impl_in_rule__NodeSetRelation__Group__610154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__NodeSetRelation__Group__6__Impl10182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__0__Impl_in_rule__NodeSetRelation__Group_2__010227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__1_in_rule__NodeSetRelation__Group_2__010230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__NodeSetRelation__Group_2__0__Impl10258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_2__1__Impl_in_rule__NodeSetRelation__Group_2__110289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__SourceNodesAssignment_2_1_in_rule__NodeSetRelation__Group_2__1__Impl10316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__0__Impl_in_rule__NodeSetRelation__Group_5__010350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__1_in_rule__NodeSetRelation__Group_5__010353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__NodeSetRelation__Group_5__0__Impl10381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__Group_5__1__Impl_in_rule__NodeSetRelation__Group_5__110412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeSetRelation__TargetNodesAssignment_5_1_in_rule__NodeSetRelation__Group_5__1__Impl10439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__0__Impl_in_rule__ArrayLiteral__Group__010473 = new BitSet(new long[]{0x00040000000001E0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1_in_rule__ArrayLiteral__Group__010476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ArrayLiteral__Group__0__Impl10504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__1__Impl_in_rule__ArrayLiteral__Group__110535 = new BitSet(new long[]{0x0008000080000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2_in_rule__ArrayLiteral__Group__110538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_1_in_rule__ArrayLiteral__Group__1__Impl10565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__2__Impl_in_rule__ArrayLiteral__Group__210595 = new BitSet(new long[]{0x0008000080000000L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3_in_rule__ArrayLiteral__Group__210598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0_in_rule__ArrayLiteral__Group__2__Impl10625 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group__3__Impl_in_rule__ArrayLiteral__Group__310656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ArrayLiteral__Group__3__Impl10684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__0__Impl_in_rule__ArrayLiteral__Group_2__010723 = new BitSet(new long[]{0x00040000000001E0L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1_in_rule__ArrayLiteral__Group_2__010726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ArrayLiteral__Group_2__0__Impl10754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__Group_2__1__Impl_in_rule__ArrayLiteral__Group_2__110785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayLiteral__LiteralsAssignment_2_1_in_rule__ArrayLiteral__Group_2__1__Impl10812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__010846 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__010849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl10876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__110905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl10932 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__010967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__010970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__QualifiedName__Group_1__0__Impl10999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__111031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl11058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__GecoModel__NameAssignment_111098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__GecoModel__ImportsAssignment_211129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisteredRootClass_in_rule__GecoModel__RegisteredRootClassAssignment_311160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelSequence_in_rule__GecoModel__ModelsAssignment_411191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_rule__GecoModel__FragmentsAssignment_511222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Import__ImportedNamespaceAssignment_111257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RegisteredRootClass__NameAssignment_111292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RegisteredRootClass__ImportedNamespaceAssignment_2_011327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__RegisteredRootClass__IsTextAssignment_2_1_011367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RegisteredRootClass__ExtensionAssignment_2_1_111406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelModifier_in_rule__ModelSequence__ModifierAssignment_111437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelType_in_rule__ModelSequence__TypeAssignment_211468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_rule__ModelSequence__ModelsAssignment_311499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModel_in_rule__ModelSequence__ModelsAssignment_4_111530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment11561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Weaver__ReferenceAssignment_111596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelSelector_in_rule__Weaver__SourceModelAssignment_2_011631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspectModel_in_rule__Weaver__AspectModelAssignment_311662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModel_in_rule__Weaver__TargetModelAssignment_4_111693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModel_in_rule__SeparateModels__PointcutAssignment_111724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCombinedModel_in_rule__SeparateModels__AdviceAssignment_311755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Generator__ReferenceAssignment_111790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelSelector_in_rule__Generator__SourceAuxModelsAssignment_2_111825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelSelector_in_rule__Generator__SourceAuxModelsAssignment_2_2_111856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSourceModelSelector_in_rule__Generator__SourceModelAssignment_411887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetModel_in_rule__Generator__TargetModelAssignment_5_111918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTargetTraceModel_in_rule__Generator__TargetTraceModelAssignment_6_1_111949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModelReference_in_rule__Generator__SourceTraceModelsAssignment_6_2_111980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceModelReference_in_rule__Generator__SourceTraceModelsAssignment_6_2_2_112011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SourceModelSelector__ReferenceAssignment_0_012046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__SourceModelSelector__ConstraintAssignment_0_1_112081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__SourceModelSelector__PropertyAssignment_0_2_112112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TargetModel__ReferenceAssignment_112147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModelType__TargetAssignment_012186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__ModelType__PropertyAssignment_1_112221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ModelType__CollectionAssignment_212257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeProperty__PropertyAssignment_012300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__NodeProperty__ConstraintAssignment_1_112335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeProperty_in_rule__NodeProperty__SubPropertyAssignment_2_112366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperator_in_rule__ConstraintExpression__OperatorAssignment_1_0_0_112397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__ConstraintExpression__RightAssignment_1_112428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparator_in_rule__CompareExpression__ComparatorAssignment_1_0_0_112459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraint_in_rule__CompareExpression__RightAssignment_1_112490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__Negation__ConstraintAssignment_112521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstraintExpression_in_rule__ParenthesisConstraint__ConstraintAssignment_112552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__InstanceOf__TypeAssignment_112587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TraceModelReference__TraceModelAssignment12626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TraceModel__NameAssignment_012661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeSetRelation_in_rule__TraceModel__NodeSetRelationsAssignment_212692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_112723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__SourceNodesAssignment_2_112754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_412785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__NodeSetRelation__TargetNodesAssignment_5_112816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeType__TypeAssignment12851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_112886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__ArrayLiteral__LiteralsAssignment_2_112917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__ValueAssignment12948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntLiteral__ValueAssignment12979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatLiteral__ValueAssignment13010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanLiteral__ValueAssignment13041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstraintExpression__Group_1__0_in_synpred44_InternalArchitecture8207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareExpression__Group_1__0_in_synpred45_InternalArchitecture8630 = new BitSet(new long[]{0x0000000000000002L});

}