package de.cau.cs.se.geco.architecture.graph;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KColor;
import de.cau.cs.kieler.core.krendering.KGridPlacement;
import de.cau.cs.kieler.core.krendering.KPolyline;
import de.cau.cs.kieler.core.krendering.KRectangle;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.kiml.options.Direction;
import de.cau.cs.kieler.kiml.options.LayoutOptions;
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;
import de.cau.cs.se.geco.architecture.architecture.AspectModel;
import de.cau.cs.se.geco.architecture.architecture.Connection;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ModelDiagramSynthesis extends AbstractDiagramSynthesis<Model> {
  @Inject
  @Extension
  private KNodeExtensions _kNodeExtensions;
  
  @Inject
  @Extension
  private KEdgeExtensions _kEdgeExtensions;
  
  @Inject
  @Extension
  private KPortExtensions _kPortExtensions;
  
  @Inject
  @Extension
  private KLabelExtensions _kLabelExtensions;
  
  @Inject
  @Extension
  private KRenderingExtensions _kRenderingExtensions;
  
  @Inject
  @Extension
  private KContainerRenderingExtensions _kContainerRenderingExtensions;
  
  @Inject
  @Extension
  private KPolylineExtensions _kPolylineExtensions;
  
  @Inject
  @Extension
  private KColorExtensions _kColorExtensions;
  
  @Extension
  private KRenderingFactory _kRenderingFactory = KRenderingFactory.eINSTANCE;
  
  private final Map<Weaver, KNode> weaverNodes = new HashMap<Weaver, KNode>();
  
  private final Map<Generator, KNode> generatorNodes = new HashMap<Generator, KNode>();
  
  private final Map<Weaver, KNode> targetWeaverModelNodes = new HashMap<Weaver, KNode>();
  
  private final Map<Generator, KNode> targetGeneratorModelNodes = new HashMap<Generator, KNode>();
  
  private final Map<Metamodel, KNode> metamodelNodes = new HashMap<Metamodel, KNode>();
  
  /**
   * val sourceModelNode = this.metamodelNodes.get(generator.sourceModel.reference)
   * createModelEdgeNoArrow(sourceModelNode, generatorNode)
   * createModelEdge(generatorNode, targetModelNode)
   */
  public KNode transform(final Model model) {
    KNode _createNode = this._kNodeExtensions.createNode(model);
    final KNode root = this.<KNode>associateWith(_createNode, model);
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        ModelDiagramSynthesis.this._kNodeExtensions.<String>addLayoutParam(it, LayoutOptions.ALGORITHM, "de.cau.cs.kieler.kiml.ogdf.planarization");
        ModelDiagramSynthesis.this._kNodeExtensions.<Float>addLayoutParam(it, LayoutOptions.SPACING, Float.valueOf(75f));
        ModelDiagramSynthesis.this._kNodeExtensions.<Direction>addLayoutParam(it, LayoutOptions.DIRECTION, Direction.RIGHT);
        EList<MetamodelSequence> _metamodels = model.getMetamodels();
        final Consumer<MetamodelSequence> _function = new Consumer<MetamodelSequence>() {
          public void accept(final MetamodelSequence seq) {
            EList<Metamodel> _metamodels = seq.getMetamodels();
            final Consumer<Metamodel> _function = new Consumer<Metamodel>() {
              public void accept(final Metamodel metamodel) {
                final KNode metaModelNode = ModelDiagramSynthesis.this.createMetamodel(metamodel, seq);
                ModelDiagramSynthesis.this.metamodelNodes.put(metamodel, metaModelNode);
                EList<KNode> _children = it.getChildren();
                _children.add(metaModelNode);
              }
            };
            _metamodels.forEach(_function);
          }
        };
        _metamodels.forEach(_function);
        EList<Connection> _connections = model.getConnections();
        Iterable<Generator> _filter = Iterables.<Generator>filter(_connections, Generator.class);
        final Consumer<Generator> _function_1 = new Consumer<Generator>() {
          public void accept(final Generator generator) {
            final KNode generatorNode = ModelDiagramSynthesis.this.createGenerator(generator);
            ModelDiagramSynthesis.this.generatorNodes.put(generator, generatorNode);
            EList<KNode> _children = it.getChildren();
            _children.add(generatorNode);
          }
        };
        _filter.forEach(_function_1);
        EList<Connection> _connections_1 = model.getConnections();
        Iterable<Weaver> _filter_1 = Iterables.<Weaver>filter(_connections_1, Weaver.class);
        final Consumer<Weaver> _function_2 = new Consumer<Weaver>() {
          public void accept(final Weaver weaver) {
            final KNode weaverNode = ModelDiagramSynthesis.this.createWeaver(weaver);
            ModelDiagramSynthesis.this.weaverNodes.put(weaver, weaverNode);
            EList<KNode> _children = it.getChildren();
            _children.add(weaverNode);
            AspectModel _aspectModel = weaver.getAspectModel();
            if ((_aspectModel instanceof Generator)) {
              AspectModel _aspectModel_1 = weaver.getAspectModel();
              final Generator generator = ((Generator) _aspectModel_1);
              final KNode generatorNode = ModelDiagramSynthesis.this.createGenerator(generator);
              final KNode anonymousMetamodelNode = ModelDiagramSynthesis.this.createAnonymousMetamodel(generator);
              ModelDiagramSynthesis.this.targetGeneratorModelNodes.put(generator, anonymousMetamodelNode);
              ModelDiagramSynthesis.this.generatorNodes.put(generator, generatorNode);
              EList<KNode> _children_1 = it.getChildren();
              _children_1.add(generatorNode);
              EList<KNode> _children_2 = it.getChildren();
              _children_2.add(anonymousMetamodelNode);
            }
          }
        };
        _filter_1.forEach(_function_2);
      }
    };
    ObjectExtensions.<KNode>operator_doubleArrow(root, _function);
    final BiConsumer<Generator, KNode> _function_1 = new BiConsumer<Generator, KNode>() {
      public void accept(final Generator generator, final KNode generatorNode) {
        try {
          SourceModelNodeSelector _sourceModel = generator.getSourceModel();
          Metamodel _reference = _sourceModel.getReference();
          final KNode sourceModelNode = ModelDiagramSynthesis.this.metamodelNodes.get(_reference);
          KNode _xifexpression = null;
          TargetModelNodeType _targetModel = generator.getTargetModel();
          Metamodel _reference_1 = _targetModel.getReference();
          boolean _notEquals = (!Objects.equal(_reference_1, null));
          if (_notEquals) {
            TargetModelNodeType _targetModel_1 = generator.getTargetModel();
            Metamodel _reference_2 = _targetModel_1.getReference();
            _xifexpression = ModelDiagramSynthesis.this.metamodelNodes.get(_reference_2);
          } else {
            KNode _xifexpression_1 = null;
            EObject _eContainer = generator.eContainer();
            if ((_eContainer instanceof Weaver)) {
              _xifexpression_1 = ModelDiagramSynthesis.this.targetGeneratorModelNodes.get(generator);
            } else {
              throw new Exception("Broken model.");
            }
            _xifexpression = _xifexpression_1;
          }
          final KNode targetModelNode = _xifexpression;
          ModelDiagramSynthesis.this.createConnectionNoArrow(sourceModelNode, generatorNode);
          ModelDiagramSynthesis.this.createConnectionWithArrow(generatorNode, targetModelNode);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    };
    this.generatorNodes.forEach(_function_1);
    return root;
  }
  
  /**
   * When a generator is declared as an aspect model source, its
   * target meta-model is not explicitly specified. Therefore,
   * an anonymous metamodel is placed in the graph instead
   */
  private KNode _createAnonymousMetamodel(final Generator generator) {
    KNode _xblockexpression = null;
    {
      final String instanceName = "anonyoums";
      String _xifexpression = null;
      TargetModelNodeType _targetModel = generator.getTargetModel();
      Metamodel _reference = _targetModel.getReference();
      boolean _notEquals = (!Objects.equal(_reference, null));
      if (_notEquals) {
        TargetModelNodeType _targetModel_1 = generator.getTargetModel();
        Metamodel _reference_1 = _targetModel_1.getReference();
        JvmType _resolveType = ArchitectureTyping.resolveType(_reference_1);
        _xifexpression = _resolveType.getSimpleName();
      } else {
        JvmType _generator = generator.getGenerator();
        _xifexpression = _generator.getSimpleName();
      }
      final String className = _xifexpression;
      KNode _createNode = this._kNodeExtensions.createNode();
      _xblockexpression = this.createMetamodel(_createNode, instanceName, className);
    }
    return _xblockexpression;
  }
  
  private KNode _createAnonymousMetamodel(final Weaver weaver) {
    KNode _xblockexpression = null;
    {
      Metamodel _resolveWeaverSourceModel = ArchitectureTyping.resolveWeaverSourceModel(weaver);
      final String instanceName = _resolveWeaverSourceModel.getName();
      String _xifexpression = null;
      TargetModelNodeType _targetModel = weaver.getTargetModel();
      boolean _notEquals = (!Objects.equal(_targetModel, null));
      if (_notEquals) {
        String _xifexpression_1 = null;
        TargetModelNodeType _targetModel_1 = weaver.getTargetModel();
        Metamodel _reference = _targetModel_1.getReference();
        boolean _notEquals_1 = (!Objects.equal(_reference, null));
        if (_notEquals_1) {
          TargetModelNodeType _targetModel_2 = weaver.getTargetModel();
          Metamodel _reference_1 = _targetModel_2.getReference();
          JvmType _resolveType = ArchitectureTyping.resolveType(_reference_1);
          _xifexpression_1 = _resolveType.getSimpleName();
        } else {
          Metamodel _resolveWeaverSourceModel_1 = ArchitectureTyping.resolveWeaverSourceModel(weaver);
          JvmType _resolveType_1 = ArchitectureTyping.resolveType(_resolveWeaverSourceModel_1);
          _xifexpression_1 = _resolveType_1.getSimpleName();
        }
        _xifexpression = _xifexpression_1;
      } else {
        Metamodel _resolveWeaverSourceModel_2 = ArchitectureTyping.resolveWeaverSourceModel(weaver);
        JvmType _resolveType_2 = ArchitectureTyping.resolveType(_resolveWeaverSourceModel_2);
        _xifexpression = _resolveType_2.getSimpleName();
      }
      final String className = _xifexpression;
      KNode _createNode = this._kNodeExtensions.createNode();
      _xblockexpression = this.createMetamodel(_createNode, instanceName, className);
    }
    return _xblockexpression;
  }
  
  private KNode createMetamodel(final Metamodel metamodel, final MetamodelSequence sequence) {
    KNode _createNode = this._kNodeExtensions.createNode(metamodel);
    KNode _associateWith = this.<KNode>associateWith(_createNode, metamodel);
    String _name = metamodel.getName();
    ModelNodeType _type = sequence.getType();
    JvmType _resolveType = ArchitectureTyping.resolveType(_type);
    String _simpleName = _resolveType.getSimpleName();
    return this.createMetamodel(_associateWith, _name, _simpleName);
  }
  
  private KNode createMetamodel(final KNode node, final String instanceName, final String className) {
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        KRectangle _addRectangle = ModelDiagramSynthesis.this._kRenderingExtensions.addRectangle(it);
        final Procedure1<KRectangle> _function = new Procedure1<KRectangle>() {
          public void apply(final KRectangle it) {
            ModelDiagramSynthesis.this._kRenderingExtensions.setLineWidth(it, 2);
            KColor _color = ModelDiagramSynthesis.this._kColorExtensions.getColor("white");
            KColor _color_1 = ModelDiagramSynthesis.this._kColorExtensions.getColor("LemonChiffon");
            ModelDiagramSynthesis.this._kRenderingExtensions.<KRectangle>setBackgroundGradient(it, _color, _color_1, 0);
            KColor _color_2 = ModelDiagramSynthesis.this._kColorExtensions.getColor("black");
            ModelDiagramSynthesis.this._kRenderingExtensions.setShadow(it, _color_2);
            KGridPlacement _setGridPlacement = ModelDiagramSynthesis.this._kContainerRenderingExtensions.setGridPlacement(it, 2);
            KGridPlacement _from = ModelDiagramSynthesis.this._kRenderingExtensions.from(_setGridPlacement, ModelDiagramSynthesis.this._kRenderingExtensions.LEFT, 2, 0, ModelDiagramSynthesis.this._kRenderingExtensions.TOP, 2, 0);
            ModelDiagramSynthesis.this._kRenderingExtensions.to(_from, ModelDiagramSynthesis.this._kRenderingExtensions.RIGHT, 2, 0, ModelDiagramSynthesis.this._kRenderingExtensions.BOTTOM, 2, 0);
            ModelDiagramSynthesis.this._kContainerRenderingExtensions.addText(it, ((instanceName + " : ") + className));
          }
        };
        ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function);
      }
    };
    return ObjectExtensions.<KNode>operator_doubleArrow(node, _function);
  }
  
  /**
   * Create an edge between a model and a generator or weaver.
   */
  private KEdge createConnectionWithArrow(final KNode source, final KNode target) {
    KEdge _createEdge = this._kEdgeExtensions.createEdge();
    final Procedure1<KEdge> _function = new Procedure1<KEdge>() {
      public void apply(final KEdge it) {
        it.setSource(source);
        it.setTarget(target);
        KPolyline _addPolyline = ModelDiagramSynthesis.this._kEdgeExtensions.addPolyline(it);
        ModelDiagramSynthesis.this._kPolylineExtensions.addHeadArrowDecorator(_addPolyline);
      }
    };
    return ObjectExtensions.<KEdge>operator_doubleArrow(_createEdge, _function);
  }
  
  /**
   * Create an edge between a model and the weaver or generator.
   * Input only for main model.
   */
  private KEdge createConnectionNoArrow(final KNode source, final KNode target) {
    KEdge _createEdge = this._kEdgeExtensions.createEdge();
    final Procedure1<KEdge> _function = new Procedure1<KEdge>() {
      public void apply(final KEdge it) {
        it.setSource(source);
        it.setTarget(target);
        ModelDiagramSynthesis.this._kEdgeExtensions.addPolyline(it);
      }
    };
    return ObjectExtensions.<KEdge>operator_doubleArrow(_createEdge, _function);
  }
  
  private KNode createWeaver(final Weaver weaver) {
    KNode _createNode = this._kNodeExtensions.createNode(weaver);
    KNode _associateWith = this.<KNode>associateWith(_createNode, weaver);
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        String _name = ModelDiagramSynthesis.this.getName(weaver);
        ModelDiagramSynthesis.this._kRenderingExtensions.addText(it, _name);
      }
    };
    final KNode weaverNode = ObjectExtensions.<KNode>operator_doubleArrow(_associateWith, _function);
    return weaverNode;
  }
  
  /**
   * Create generator node and its connections.
   */
  private KNode createGenerator(final Generator generator) {
    KNode _createNode = this._kNodeExtensions.createNode(generator);
    KNode _associateWith = this.<KNode>associateWith(_createNode, generator);
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        String _name = ModelDiagramSynthesis.this.getName(generator);
        ModelDiagramSynthesis.this._kRenderingExtensions.addText(it, _name);
      }
    };
    final KNode generatorNode = ObjectExtensions.<KNode>operator_doubleArrow(_associateWith, _function);
    return generatorNode;
  }
  
  private String getName(final Generator generator) {
    JvmType _generator = generator.getGenerator();
    return _generator.getSimpleName();
  }
  
  private String getName(final Weaver weaver) {
    JvmType _weaver = weaver.getWeaver();
    return _weaver.getSimpleName();
  }
  
  private KNode createAnonymousMetamodel(final Connection generator) {
    if (generator instanceof Generator) {
      return _createAnonymousMetamodel((Generator)generator);
    } else if (generator instanceof Weaver) {
      return _createAnonymousMetamodel((Weaver)generator);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(generator).toString());
    }
  }
}
