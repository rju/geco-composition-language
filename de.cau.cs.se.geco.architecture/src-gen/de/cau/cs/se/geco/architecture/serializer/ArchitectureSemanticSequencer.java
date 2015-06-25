package de.cau.cs.se.geco.architecture.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage;
import de.cau.cs.se.geco.architecture.architecture.ArrayLiteral;
import de.cau.cs.se.geco.architecture.architecture.BooleanLiteral;
import de.cau.cs.se.geco.architecture.architecture.CompareExpression;
import de.cau.cs.se.geco.architecture.architecture.ConstraintExpression;
import de.cau.cs.se.geco.architecture.architecture.FloatLiteral;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Import;
import de.cau.cs.se.geco.architecture.architecture.IntLiteral;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.Negation;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.NodeSetRelation;
import de.cau.cs.se.geco.architecture.architecture.NodeType;
import de.cau.cs.se.geco.architecture.architecture.ParenthesisConstraint;
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.StringLiteral;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.TraceModel;
import de.cau.cs.se.geco.architecture.architecture.TraceModelReference;
import de.cau.cs.se.geco.architecture.architecture.Typeof;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.services.ArchitectureGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ArchitectureSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ArchitectureGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ArchitecturePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ArchitecturePackage.ARRAY_LITERAL:
				if(context == grammarAccess.getArrayLiteralRule() ||
				   context == grammarAccess.getBasicConstraintRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getConstraintExpressionRule() ||
				   context == grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getOperandRule()) {
					sequence_ArrayLiteral(context, (ArrayLiteral) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBasicConstraintRule() ||
				   context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getConstraintExpressionRule() ||
				   context == grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getOperandRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.COMPARE_EXPRESSION:
				if(context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getConstraintExpressionRule() ||
				   context == grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0()) {
					sequence_CompareExpression(context, (CompareExpression) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.CONSTRAINT_EXPRESSION:
				if(context == grammarAccess.getConstraintExpressionRule()) {
					sequence_ConstraintExpression(context, (ConstraintExpression) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.FLOAT_LITERAL:
				if(context == grammarAccess.getBasicConstraintRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getConstraintExpressionRule() ||
				   context == grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getFloatLiteralRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getOperandRule()) {
					sequence_FloatLiteral(context, (FloatLiteral) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.GENERATOR:
				if(context == grammarAccess.getAspectModelRule() ||
				   context == grammarAccess.getConnectionRule() ||
				   context == grammarAccess.getGeneratorRule()) {
					sequence_Generator(context, (Generator) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.INT_LITERAL:
				if(context == grammarAccess.getBasicConstraintRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getConstraintExpressionRule() ||
				   context == grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getIntLiteralRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getOperandRule()) {
					sequence_IntLiteral(context, (IntLiteral) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.METAMODEL:
				if(context == grammarAccess.getMetamodelRule()) {
					sequence_Metamodel(context, (Metamodel) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.METAMODEL_SEQUENCE:
				if(context == grammarAccess.getMetamodelSequenceRule()) {
					sequence_MetamodelSequence(context, (MetamodelSequence) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.MODEL_NODE_TYPE:
				if(context == grammarAccess.getModelNodeTypeRule()) {
					sequence_ModelNodeType(context, (ModelNodeType) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.NEGATION:
				if(context == grammarAccess.getBasicConstraintRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getConstraintExpressionRule() ||
				   context == grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Negation(context, (Negation) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.NODE_PROPERTY:
				if(context == grammarAccess.getBasicConstraintRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getConstraintExpressionRule() ||
				   context == grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNodePropertyRule() ||
				   context == grammarAccess.getOperandRule()) {
					sequence_NodeProperty(context, (NodeProperty) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.NODE_SET_RELATION:
				if(context == grammarAccess.getNodeSetRelationRule()) {
					sequence_NodeSetRelation(context, (NodeSetRelation) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.NODE_TYPE:
				if(context == grammarAccess.getNodeTypeRule()) {
					sequence_NodeType(context, (NodeType) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.PARENTHESIS_CONSTRAINT:
				if(context == grammarAccess.getBasicConstraintRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getConstraintExpressionRule() ||
				   context == grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesisConstraintRule()) {
					sequence_ParenthesisConstraint(context, (ParenthesisConstraint) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.REGISTERED_PACKAGE:
				if(context == grammarAccess.getRegisteredPackageRule()) {
					sequence_RegisteredPackage(context, (RegisteredPackage) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.SOURCE_MODEL_NODE_SELECTOR:
				if(context == grammarAccess.getSourceModelNodeSelectorRule()) {
					sequence_SourceModelNodeSelector(context, (SourceModelNodeSelector) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.STRING_LITERAL:
				if(context == grammarAccess.getBasicConstraintRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getConstraintExpressionRule() ||
				   context == grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getOperandRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.TARGET_MODEL_NODE_TYPE:
				if(context == grammarAccess.getAspectModelRule() ||
				   context == grammarAccess.getTargetModelNodeTypeRule()) {
					sequence_TargetModelNodeType(context, (TargetModelNodeType) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.TRACE_MODEL:
				if(context == grammarAccess.getTraceModelRule() ||
				   context == grammarAccess.getWriteTraceModelRule()) {
					sequence_TraceModel(context, (TraceModel) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.TRACE_MODEL_REFERENCE:
				if(context == grammarAccess.getTraceModelReferenceRule() ||
				   context == grammarAccess.getWriteTraceModelRule()) {
					sequence_TraceModelReference(context, (TraceModelReference) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.TYPEOF:
				if(context == grammarAccess.getBasicConstraintRule() ||
				   context == grammarAccess.getCompareExpressionRule() ||
				   context == grammarAccess.getCompareExpressionAccess().getCompareExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getConstraintExpressionRule() ||
				   context == grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOperandRule() ||
				   context == grammarAccess.getTypeofRule()) {
					sequence_Typeof(context, (Typeof) semanticObject); 
					return; 
				}
				else break;
			case ArchitecturePackage.WEAVER:
				if(context == grammarAccess.getConnectionRule() ||
				   context == grammarAccess.getWeaverRule()) {
					sequence_Weaver(context, (Weaver) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (literals+=Literal literals+=Literal*)
	 */
	protected void sequence_ArrayLiteral(EObject context, ArrayLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=CompareExpression_CompareExpression_1_0_0_0 comparator=Comparator right=BasicConstraint)
	 */
	protected void sequence_CompareExpression(EObject context, CompareExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ConstraintExpression_ConstraintExpression_1_0_0_0 operator=LogicOperator right=ConstraintExpression)
	 */
	protected void sequence_ConstraintExpression(EObject context, ConstraintExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArchitecturePackage.Literals.CONSTRAINT_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArchitecturePackage.Literals.CONSTRAINT_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, ArchitecturePackage.Literals.CONSTRAINT_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArchitecturePackage.Literals.CONSTRAINT_EXPRESSION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, ArchitecturePackage.Literals.CONSTRAINT_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArchitecturePackage.Literals.CONSTRAINT_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstraintExpressionAccess().getConstraintExpressionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getConstraintExpressionAccess().getOperatorLogicOperatorEnumRuleCall_1_0_0_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getConstraintExpressionAccess().getRightConstraintExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=FLOAT
	 */
	protected void sequence_FloatLiteral(EObject context, FloatLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         reference=[JvmType|ID] 
	 *         sourceModel=SourceModelNodeSelector 
	 *         targetModel=TargetModelNodeType 
	 *         writeTraceModel=WriteTraceModel? 
	 *         (readTraceModels+=TraceModelReference readTraceModels+=TraceModelReference*)?
	 *     )
	 */
	protected void sequence_Generator(EObject context, Generator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=[JvmType|QualifiedName]
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArchitecturePackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArchitecturePackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceJvmTypeQualifiedNameParserRuleCall_1_0_1(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntLiteral(EObject context, IntLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ModelNodeType metamodels+=Metamodel metamodels+=Metamodel*)
	 */
	protected void sequence_MetamodelSequence(EObject context, MetamodelSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Metamodel(EObject context, Metamodel semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArchitecturePackage.Literals.METAMODEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArchitecturePackage.Literals.METAMODEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMetamodelAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (target=[RegisteredPackage|ID] property=NodeProperty?)
	 */
	protected void sequence_ModelNodeType(EObject context, ModelNodeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName imports+=Import* registeredPackages+=RegisteredPackage* metamodels+=MetamodelSequence* connections+=Connection*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     constraint=ConstraintExpression
	 */
	protected void sequence_Negation(EObject context, Negation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property=[JvmMember|ID] constraint=ConstraintExpression? subProperty=NodeProperty?)
	 */
	protected void sequence_NodeProperty(EObject context, NodeProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sourceNodes+=NodeType sourceNodes+=NodeType* targetNodes+=NodeType targetNodes+=NodeType*)
	 */
	protected void sequence_NodeSetRelation(EObject context, NodeSetRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=[JvmType|ID]
	 */
	protected void sequence_NodeType(EObject context, NodeType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArchitecturePackage.Literals.NODE_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArchitecturePackage.Literals.NODE_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNodeTypeAccess().getTypeJvmTypeIDTerminalRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     constraint=ConstraintExpression
	 */
	protected void sequence_ParenthesisConstraint(EObject context, ParenthesisConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (importedNamespace=[JvmType|QualifiedName] | (isText?='text' extension=STRING)))
	 */
	protected void sequence_RegisteredPackage(EObject context, RegisteredPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {SourceModelNodeSelector}
	 */
	protected void sequence_SourceModelNodeSelector(EObject context, SourceModelNodeSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=[Metamodel|ID]?)
	 */
	protected void sequence_TargetModelNodeType(EObject context, TargetModelNodeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     traceModel=[TraceModel|ID]
	 */
	protected void sequence_TraceModelReference(EObject context, TraceModelReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ArchitecturePackage.Literals.TRACE_MODEL_REFERENCE__TRACE_MODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ArchitecturePackage.Literals.TRACE_MODEL_REFERENCE__TRACE_MODEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTraceModelReferenceAccess().getTraceModelTraceModelIDTerminalRuleCall_0_1(), semanticObject.getTraceModel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID nodeSetRelations+=NodeSetRelation+)
	 */
	protected void sequence_TraceModel(EObject context, TraceModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=[JvmType|ID]
	 */
	protected void sequence_Typeof(EObject context, Typeof semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=[JvmType|ID] sourceModel=SourceModelNodeSelector? aspectModel=AspectModel targetModel=TargetModelNodeType?)
	 */
	protected void sequence_Weaver(EObject context, Weaver semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
