package de.cau.cs.se.geco.architecture.generator.code;

import de.cau.cs.se.geco.architecture.framework.IGenerator;
import de.cau.cs.se.geco.architecture.generator.code.NameResolver;
import de.cau.cs.se.geco.architecture.generator.code.SelectorQuery;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel;
import de.cau.cs.se.geco.architecture.model.boxing.Group;
import de.cau.cs.se.geco.architecture.model.boxing.ModelDeclaration;
import de.cau.cs.se.geco.architecture.model.boxing.Unit;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class GenerateGecoCode implements IGenerator<BoxingModel, CharSequence> {
  @Inject
  @Extension
  private SelectorQuery _selectorQuery;
  
  @Inject
  @Extension
  private NameResolver _nameResolver;
  
  private String className;
  
  public GenerateGecoCode(final String className) {
    this.className = className;
  }
  
  @Override
  public CharSequence generate(final BoxingModel input) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field derivedFrom is undefined for the type BoxingModel"
      + "\nThe method or field derivedFrom is undefined for the type BoxingModel"
      + "\nThe method or field modifier is undefined for the type ModelDeclaration"
      + "\nThe method or field ModelModifier is undefined"
      + "\nThe method createImport(Import) from the type GenerateGecoCode refers to the missing type Import"
      + "\nname cannot be resolved"
      + "\nimports cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\n== cannot be resolved"
      + "\nINPUT cannot be resolved");
  }
  
  /**
   * Create an import rule.
   */
  private CharSequence createImport(final /* Import */Object node) {
    throw new Error("Unresolved compilation problems:"
      + "\nimportedNamespace cannot be resolved"
      + "\nqualifiedName cannot be resolved");
  }
  
  /**
   * Create a field for an generator and instantiate it.
   */
  private CharSequence createField(final JvmType type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("val ");
    String _instanceName = this._nameResolver.getInstanceName(type);
    _builder.append(_instanceName, "");
    _builder.append(" = new ");
    String _simpleName = type.getSimpleName();
    _builder.append(_simpleName, "");
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * Create collections for models declared with the metamodel expression in GECO.
   * These are used in the class property declaration area.
   */
  private CharSequence createCollectionForMetamodel(final ModelDeclaration declaration) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field model is undefined for the type ModelDeclaration"
      + "\nThe method or field selector is undefined for the type ModelDeclaration"
      + "\nThe method or field selector is undefined for the type ModelDeclaration"
      + "\nThe method or field model is undefined for the type ModelDeclaration"
      + "\nname cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\ndetermineElementType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\ndetermineElementType cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Create initialization for collections used to traverse the input models and fill the proper collections.
   */
  private CharSequence createCollectionInitalization(final ModelDeclaration declaration) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field model is undefined for the type ModelDeclaration"
      + "\nThe method or field selector is undefined for the type ModelDeclaration"
      + "\nThe method or field model is undefined for the type ModelDeclaration"
      + "\nThe method or field selector is undefined for the type ModelDeclaration"
      + "\nThe method or field model is undefined for the type ModelDeclaration"
      + "\ncollectionName cannot be resolved"
      + "\ntarget cannot be resolved"
      + "\nimportedNamespace cannot be resolved"
      + "\nqualifiedName cannot be resolved"
      + "\ncollectionName cannot be resolved"
      + "\ncreateSelectorQuery cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Create call to a group execution method.
   */
  private CharSequence createMainGroupCall(final int i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("executeGroup");
    _builder.append(i, "");
    _builder.append("()");
    return _builder;
  }
  
  /**
   * Create a group execution method.
   */
  private CharSequence createMainGroup(final Group group, final int i) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field sourceModels is undefined for the type Group"
      + "\nThe method or field name is undefined for the type Object"
      + "\nThe method createUnitExecution(Unit) from the type GenerateGecoCode refers to the missing type Object"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  /**
   * Create code for a single execution unit.
   */
  private Object createUnitExecution(final Unit unit) {
    throw new Error("Unresolved compilation problems:"
      + "\nGenerator cannot be resolved to a type."
      + "\nWeaver cannot be resolved to a type."
      + "\nGenerator cannot be resolved to a type."
      + "\nWeaver cannot be resolved to a type."
      + "\nTargetModel cannot be resolved to a type."
      + "\nThe method or field fragment is undefined for the type Unit"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\ncreateGeneratorExecution cannot be resolved"
      + "\naspectModel cannot be resolved"
      + "\ncreateWeaverGeneratorExecution cannot be resolved"
      + "\naspectModel cannot be resolved"
      + "\ncreateWeaverExecution cannot be resolved");
  }
  
  /**
   * Create code for the execution of a generator which is not
   * directly connected to a weaver.
   */
  private CharSequence createGeneratorExecution(final /* Generator */Object generator, final Unit unit) {
    throw new Error("Unresolved compilation problems:"
      + "\nsourceAuxModels cannot be resolved"
      + "\ncreateSourceAuxModels cannot be resolved"
      + "\nsourceModel cannot be resolved"
      + "\ncreateSourceModelNesting cannot be resolved");
  }
  
  private CharSequence createWeaverGeneratorExecution(final /* Weaver */Object weaver, final Unit unit) {
    throw new Error("Unresolved compilation problems:"
      + "\nGenerator cannot be resolved to a type."
      + "\nGenerator cannot be resolved to a type."
      + "\naspectModel cannot be resolved"
      + "\nsourceAuxModels cannot be resolved"
      + "\ncreateSourceAuxModels cannot be resolved"
      + "\naspectModel cannot be resolved"
      + "\nsourceModel cannot be resolved"
      + "\ncreateSourceModelNesting cannot be resolved");
  }
  
  /**
   * Create nested loops for a generator call.
   */
  private Object createSourceModelNesting(final /* SourceModelSelector */Object sourceModel, final /* Weaver */Object weaver, final Unit unit) {
    throw new Error("Unresolved compilation problems:"
      + "\nreference cannot be resolved"
      + "\n== cannot be resolved"
      + "\ncreateWeaverCall cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nisSubTypeOf cannot be resolved"
      + "\ncreateWeaverCall cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nname cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nname cannot be resolved"
      + "\nconstraint cannot be resolved"
      + "\ncreateConstraintFilter cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\ncreateSourceModelNesting cannot be resolved");
  }
  
  /**
   * Create nested loops for a generator call.
   */
  private CharSequence createSourceModelNesting(final /* NodeProperty */Object node, final /* Weaver */Object weaver, final Unit unit, final String modelVarName) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved"
      + "\ncreateWeaverCall cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nisSubTypeOf cannot be resolved"
      + "\ncreateWeaverCall cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nconstraint cannot be resolved"
      + "\ncreateConstraintFilter cannot be resolved"
      + "\nsubProperty cannot be resolved"
      + "\ncreateSourceModelNesting cannot be resolved");
  }
  
  private CharSequence createWeaverCall(final /* Weaver */Object weaver, final Unit unit, final String varModelName) {
    throw new Error("Unresolved compilation problems:"
      + "\nGenerator cannot be resolved to a type."
      + "\naspectModel cannot be resolved"
      + "\ncreateGeneratorCall cannot be resolved"
      + "\ncreateWeaverInvocation cannot be resolved");
  }
  
  private CharSequence createWeaverInvocation(final /* Weaver */Object weaver, final Unit unit) {
    throw new Error("Unresolved compilation problems:"
      + "\nreference cannot be resolved"
      + "\ninstanceName cannot be resolved"
      + "\nresolveWeaverSourceModel cannot be resolved"
      + "\nvalueReference cannot be resolved"
      + "\nreference cannot be resolved"
      + "\ninstanceName cannot be resolved"
      + "\nresolveWeaverSourceModel cannot be resolved"
      + "\nvalueReference cannot be resolved");
  }
  
  private CharSequence valueReference(final /* SourceModelSelector */Object selector) {
    throw new Error("Unresolved compilation problems:"
      + "\nreference cannot be resolved"
      + "\nname cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\nvalueReference cannot be resolved");
  }
  
  private CharSequence valueReference(final /* NodeProperty */Object property) {
    throw new Error("Unresolved compilation problems:"
      + "\nproperty cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nsubProperty cannot be resolved"
      + "\nvalueReference cannot be resolved");
  }
  
  private CharSequence createWeaverExecution(final /* Weaver */Object weaver, final Unit unit) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  /**
   * Prepare collections for auxiliary input.
   */
  private CharSequence createSourceAuxModels(final /* EList<SourceModelSelector> */Object sourceAuxModels) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateSourceAuxModel cannot be resolved");
  }
  
  /**
   * Create a generator invocation.
   */
  private CharSequence createGeneratorCall(final /* Generator */Object generator, final String modelVarName) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateTargetModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\ninstanceName cannot be resolved");
  }
  
  /**
   * Create reference to target model. += is for pre-existing collections and = for aspect models
   * which are automatically woven into a model.
   */
  private CharSequence createTargetModel(final /* Generator */Object generator) {
    throw new Error("Unresolved compilation problems:"
      + "\ntargetModel cannot be resolved"
      + "\n!= cannot be resolved"
      + "\ntargetModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nisCollectionType cannot be resolved"
      + "\ntargetModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntargetModel cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  /**
   * Create nested loops for a generator call.
   */
  private Object createSourceModelNesting(final /* SourceModelSelector */Object sourceModel, final /* Generator */Object generator, final Unit unit) {
    throw new Error("Unresolved compilation problems:"
      + "\nreference cannot be resolved"
      + "\n== cannot be resolved"
      + "\ncreateGeneratorCall cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nisSubTypeOf cannot be resolved"
      + "\ncreateGeneratorCall cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nname cannot be resolved"
      + "\nreference cannot be resolved"
      + "\nname cannot be resolved"
      + "\nconstraint cannot be resolved"
      + "\ncreateConstraintFilter cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\ncreateSourceModelNesting cannot be resolved");
  }
  
  /**
   * Create nested loops for a generator call.
   */
  private CharSequence createSourceModelNesting(final /* NodeProperty */Object node, final /* Generator */Object generator, final Unit unit, final String modelVarName) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved"
      + "\ncreateGeneratorCall cannot be resolved"
      + "\nresolveType cannot be resolved"
      + "\nisSubTypeOf cannot be resolved"
      + "\ncreateGeneratorCall cannot be resolved"
      + "\nproperty cannot be resolved"
      + "\nsimpleName cannot be resolved"
      + "\nconstraint cannot be resolved"
      + "\ncreateConstraintFilter cannot be resolved"
      + "\nsubProperty cannot be resolved"
      + "\ncreateSourceModelNesting cannot be resolved");
  }
}
