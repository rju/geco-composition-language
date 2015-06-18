package de.cau.cs.se.geco.architecture.graph;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KGraphData;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KColor;
import de.cau.cs.kieler.core.krendering.KGridPlacement;
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
import de.cau.cs.se.geco.architecture.architecture.GeneratorImport;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.TargetModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.architecture.WeaverImport;
import de.cau.cs.se.geco.architecture.typing.ArchitectureTyping;
import java.util.function.Consumer;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
  
  public KNode transform(final Model model) {
    KNode _createNode = this._kNodeExtensions.createNode(model);
    final KNode root = this.<KNode>associateWith(_createNode, model);
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        ModelDiagramSynthesis.this._kNodeExtensions.<String>addLayoutParam(it, LayoutOptions.ALGORITHM, "de.cau.cs.kieler.kiml.ogdf.planarization");
        ModelDiagramSynthesis.this._kNodeExtensions.<Float>addLayoutParam(it, LayoutOptions.SPACING, Float.valueOf(75f));
        ModelDiagramSynthesis.this._kNodeExtensions.<Direction>addLayoutParam(it, LayoutOptions.DIRECTION, Direction.UP);
        EList<MetamodelSequence> _metamodels = model.getMetamodels();
        final Consumer<MetamodelSequence> _function = new Consumer<MetamodelSequence>() {
          public void accept(final MetamodelSequence seq) {
            EList<Metamodel> _metamodels = seq.getMetamodels();
            final Consumer<Metamodel> _function = new Consumer<Metamodel>() {
              public void accept(final Metamodel metamodel) {
                EList<KNode> _children = it.getChildren();
                KNode _createMetamodel = ModelDiagramSynthesis.this.createMetamodel(metamodel, seq);
                _children.add(_createMetamodel);
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
            EList<KNode> _children = it.getChildren();
            EList<KNode> _children_1 = it.getChildren();
            KNode _createGenerator = ModelDiagramSynthesis.this.createGenerator(generator, _children_1, null);
            _children.add(_createGenerator);
          }
        };
        _filter.forEach(_function_1);
        EList<Connection> _connections_1 = model.getConnections();
        Iterable<Weaver> _filter_1 = Iterables.<Weaver>filter(_connections_1, Weaver.class);
        final Consumer<Weaver> _function_2 = new Consumer<Weaver>() {
          public void accept(final Weaver weaver) {
            final KNode weaveNode = ModelDiagramSynthesis.this.createWeaver(weaver);
            EList<KNode> _children = it.getChildren();
            _children.add(weaveNode);
            AspectModel _aspectModel = weaver.getAspectModel();
            if ((_aspectModel instanceof Generator)) {
              AspectModel _aspectModel_1 = weaver.getAspectModel();
              final KNode modelNode = ModelDiagramSynthesis.this.createAnonymousMetamodel(((Generator) _aspectModel_1));
              EList<KNode> _children_1 = it.getChildren();
              _children_1.add(modelNode);
              EList<KNode> _children_2 = it.getChildren();
              AspectModel _aspectModel_2 = weaver.getAspectModel();
              EList<KNode> _children_3 = it.getChildren();
              KNode _createGenerator = ModelDiagramSynthesis.this.createGenerator(((Generator) _aspectModel_2), _children_3, modelNode);
              _children_2.add(_createGenerator);
            }
          }
        };
        _filter_1.forEach(_function_2);
      }
    };
    ObjectExtensions.<KNode>operator_doubleArrow(root, _function);
    return root;
  }
  
  /**
   * When a generator is declared as an aspect model source, its
   * target meta-model is not explicitly specified. Therefore,
   * an anonymous metamodel is placed in the graph instead
   */
  public KNode createAnonymousMetamodel(final Generator generator) {
    KNode _createNode = this._kNodeExtensions.createNode();
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
            ModelDiagramSynthesis.this._kContainerRenderingExtensions.addText(it, (":" + "Use JDT"));
          }
        };
        ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function);
      }
    };
    return ObjectExtensions.<KNode>operator_doubleArrow(_createNode, _function);
  }
  
  private KNode createMetamodel(final Metamodel metamodel, final MetamodelSequence sequence) {
    KNode _createNode = this._kNodeExtensions.createNode(metamodel);
    KNode _associateWith = this.<KNode>associateWith(_createNode, metamodel);
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
            String _name = metamodel.getName();
            String _plus = (_name + ":");
            ModelNodeType _type = sequence.getType();
            EClass _resolveType = ArchitectureTyping.resolveType(_type);
            String _name_1 = _resolveType.getName();
            String _plus_1 = (_plus + _name_1);
            ModelDiagramSynthesis.this._kContainerRenderingExtensions.addText(it, _plus_1);
          }
        };
        ObjectExtensions.<KRectangle>operator_doubleArrow(_addRectangle, _function);
      }
    };
    return ObjectExtensions.<KNode>operator_doubleArrow(_associateWith, _function);
  }
  
  private KEdge createModelEdge(final KNode source, final KNode target) {
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
    return ObjectExtensions.<KNode>operator_doubleArrow(_associateWith, _function);
  }
  
  private KNode createGenerator(final Generator generator, final EList<KNode> nodes, final KNode anonymousTargetNode) {
    KNode _createNode = this._kNodeExtensions.createNode(generator);
    KNode _associateWith = this.<KNode>associateWith(_createNode, generator);
    final Procedure1<KNode> _function = new Procedure1<KNode>() {
      public void apply(final KNode it) {
        String _name = ModelDiagramSynthesis.this.getName(generator);
        ModelDiagramSynthesis.this._kRenderingExtensions.addText(it, _name);
      }
    };
    final KNode generatorNode = ObjectExtensions.<KNode>operator_doubleArrow(_associateWith, _function);
    final Function1<KNode, Boolean> _function_1 = new Function1<KNode, Boolean>() {
      public Boolean apply(final KNode it) {
        EList<KGraphData> _data = it.getData();
        Iterable<Metamodel> _filter = Iterables.<Metamodel>filter(_data, Metamodel.class);
        final Function1<Metamodel, Boolean> _function = new Function1<Metamodel, Boolean>() {
          public Boolean apply(final Metamodel it) {
            boolean _xblockexpression = false;
            {
              System.out.println(("==> " + it));
              SourceModelNodeSelector _sourceModel = generator.getSourceModel();
              Metamodel _reference = _sourceModel.getReference();
              _xblockexpression = it.equals(_reference);
            }
            return Boolean.valueOf(_xblockexpression);
          }
        };
        Iterable<Metamodel> _filter_1 = IterableExtensions.<Metamodel>filter(_filter, _function);
        int _size = IterableExtensions.size(_filter_1);
        return Boolean.valueOf((_size > 0));
      }
    };
    final KNode sourceModelNode = IterableExtensions.<KNode>findFirst(nodes, _function_1);
    this.createModelEdge(sourceModelNode, generatorNode);
    TargetModelNodeType _targetModel = generator.getTargetModel();
    boolean _notEquals = (!Objects.equal(_targetModel, null));
    if (_notEquals) {
      final Function1<KNode, Boolean> _function_2 = new Function1<KNode, Boolean>() {
        public Boolean apply(final KNode it) {
          EList<KGraphData> _data = it.getData();
          Iterable<Metamodel> _filter = Iterables.<Metamodel>filter(_data, Metamodel.class);
          final Function1<Metamodel, Boolean> _function = new Function1<Metamodel, Boolean>() {
            public Boolean apply(final Metamodel it) {
              TargetModelNodeType _targetModel = generator.getTargetModel();
              Metamodel _reference = _targetModel.getReference();
              return Boolean.valueOf(it.equals(_reference));
            }
          };
          Iterable<Metamodel> _filter_1 = IterableExtensions.<Metamodel>filter(_filter, _function);
          int _size = IterableExtensions.size(_filter_1);
          return Boolean.valueOf((_size > 0));
        }
      };
      final KNode targetModelNode = IterableExtensions.<KNode>findFirst(nodes, _function_2);
      this.createModelEdge(generatorNode, targetModelNode);
    } else {
      this.createModelEdge(generatorNode, anonymousTargetNode);
    }
    return generatorNode;
  }
  
  private String getName(final Generator generator) {
    GeneratorImport _generator = generator.getGenerator();
    String _importedNamespace = _generator.getImportedNamespace();
    String[] _split = _importedNamespace.split("\\.");
    return IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
  }
  
  private String getName(final Weaver weaver) {
    WeaverImport _weaver = weaver.getWeaver();
    String _importedNamespace = _weaver.getImportedNamespace();
    String[] _split = _importedNamespace.split("\\.");
    return IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
  }
}
