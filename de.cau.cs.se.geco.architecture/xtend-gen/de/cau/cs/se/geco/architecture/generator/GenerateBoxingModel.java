package de.cau.cs.se.geco.architecture.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.cau.cs.se.geco.architecture.architecture.AspectModel;
import de.cau.cs.se.geco.architecture.architecture.Connection;
import de.cau.cs.se.geco.architecture.architecture.Generator;
import de.cau.cs.se.geco.architecture.architecture.Metamodel;
import de.cau.cs.se.geco.architecture.architecture.MetamodelSequence;
import de.cau.cs.se.geco.architecture.architecture.Model;
import de.cau.cs.se.geco.architecture.architecture.ModelNodeType;
import de.cau.cs.se.geco.architecture.architecture.NodeProperty;
import de.cau.cs.se.geco.architecture.architecture.RegisteredPackage;
import de.cau.cs.se.geco.architecture.architecture.SourceModelNodeSelector;
import de.cau.cs.se.geco.architecture.architecture.Weaver;
import de.cau.cs.se.geco.architecture.framework.AbstractRequireTraceModelGenerator;
import de.cau.cs.se.geco.architecture.framework.IGenerator;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingFactory;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModel;
import de.cau.cs.se.geco.architecture.model.boxing.BoxingModelNode;
import de.cau.cs.se.geco.architecture.model.boxing.GeneratorContainer;
import de.cau.cs.se.geco.architecture.model.boxing.PropertyModelNode;
import de.cau.cs.se.geco.architecture.model.boxing.RootModelNode;
import de.cau.cs.se.geco.architecture.model.boxing.Transformation;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GenerateBoxingModel implements IGenerator<Model, BoxingModel> {
  public BoxingModel generate(final Model input) {
    final BoxingModel result = BoxingFactory.eINSTANCE.createBoxingModel();
    result.setDerivedFrom(input);
    EList<MetamodelSequence> _metamodels = input.getMetamodels();
    final Consumer<MetamodelSequence> _function = new Consumer<MetamodelSequence>() {
      public void accept(final MetamodelSequence it) {
        EList<Connection> _connections = input.getConnections();
        boolean _isSourceModel = GenerateBoxingModel.this.isSourceModel(it, _connections);
        if (_isSourceModel) {
          ModelNodeType _type = it.getType();
          GenerateBoxingModel.this.createRootModel(_type, result);
        }
      }
    };
    _metamodels.forEach(_function);
    EList<Connection> _connections = input.getConnections();
    final Consumer<Connection> _function_1 = new Consumer<Connection>() {
      public void accept(final Connection connection) {
        GenerateBoxingModel.this.processConnection(result, connection);
      }
    };
    _connections.forEach(_function_1);
    return result;
  }
  
  /**
   * Process input models for weavers and adjunct generators.
   */
  private void _processConnection(final BoxingModel model, final Generator generator) {
    EList<Transformation> _transformations = model.getTransformations();
    JvmType _reference = generator.getReference();
    Transformation _createTransformation = this.createTransformation(_reference);
    this.addUniqueTransformation(_transformations, _createTransformation);
    EList<RootModelNode> _sourceModels = model.getSourceModels();
    SourceModelNodeSelector _sourceModel = generator.getSourceModel();
    Metamodel _reference_1 = _sourceModel.getReference();
    final BoxingModelNode outerBoxingModel = this.findGeneratorSourceModel(_sourceModels, _reference_1);
    GeneratorContainer _xifexpression = null;
    boolean _equals = Objects.equal(outerBoxingModel, null);
    if (_equals) {
      _xifexpression = model;
    } else {
      BoxingModelNode _xifexpression_1 = null;
      SourceModelNodeSelector _sourceModel_1 = generator.getSourceModel();
      NodeProperty _property = _sourceModel_1.getProperty();
      boolean _notEquals = (!Objects.equal(_property, null));
      if (_notEquals) {
        SourceModelNodeSelector _sourceModel_2 = generator.getSourceModel();
        _xifexpression_1 = this.createGeneratorModels(outerBoxingModel, _sourceModel_2);
      } else {
        _xifexpression_1 = outerBoxingModel;
      }
      _xifexpression = _xifexpression_1;
    }
    final GeneratorContainer innerBoxingModel = _xifexpression;
    EList<Generator> _invocations = innerBoxingModel.getInvocations();
    _invocations.add(generator);
  }
  
  /**
   * Process input models for weavers and adjunct generators.
   */
  private void _processConnection(final BoxingModel model, final Weaver weaver) {
    EList<Transformation> _transformations = model.getTransformations();
    JvmType _reference = weaver.getReference();
    Transformation _createTransformation = this.createTransformation(_reference);
    this.addUniqueTransformation(_transformations, _createTransformation);
    AspectModel _aspectModel = weaver.getAspectModel();
    if ((_aspectModel instanceof Generator)) {
      AspectModel _aspectModel_1 = weaver.getAspectModel();
      this.processConnection(model, ((Generator) _aspectModel_1));
    }
  }
  
  private BoxingModelNode createGeneratorModels(final BoxingModelNode node, final SourceModelNodeSelector selector) {
    NodeProperty _property = selector.getProperty();
    boolean _equals = Objects.equal(_property, null);
    if (_equals) {
      return node;
    } else {
      NodeProperty _property_1 = selector.getProperty();
      return this.createGeneratorModels(node, _property_1);
    }
  }
  
  private BoxingModelNode createGeneratorModels(final BoxingModelNode node, final NodeProperty property) {
    final PropertyModelNode propertyNode = this.createPropertyModelNode(property);
    EList<PropertyModelNode> _models = node.getModels();
    _models.add(propertyNode);
    NodeProperty _subProperty = property.getSubProperty();
    boolean _notEquals = (!Objects.equal(_subProperty, null));
    if (_notEquals) {
      NodeProperty _subProperty_1 = property.getSubProperty();
      return this.createGeneratorModels(propertyNode, _subProperty_1);
    } else {
      return propertyNode;
    }
  }
  
  /**
   * Find the boxing model node which is referenced by the generators source model selector.
   */
  private BoxingModelNode findGeneratorSourceModel(final EList<RootModelNode> list, final Metamodel metamodel) {
    boolean _notEquals = (!Objects.equal(metamodel, null));
    if (_notEquals) {
      EObject _eContainer = metamodel.eContainer();
      final ModelNodeType modelNodeType = ((MetamodelSequence) _eContainer).getType();
      final Function1<RootModelNode, Boolean> _function = new Function1<RootModelNode, Boolean>() {
        public Boolean apply(final RootModelNode it) {
          RegisteredPackage _declaredModel = it.getDeclaredModel();
          RegisteredPackage _target = modelNodeType.getTarget();
          return Boolean.valueOf(Objects.equal(_declaredModel, _target));
        }
      };
      final RootModelNode result = IterableExtensions.<RootModelNode>findFirst(list, _function);
      NodeProperty _property = modelNodeType.getProperty();
      boolean _notEquals_1 = (!Objects.equal(_property, null));
      if (_notEquals_1) {
        EList<PropertyModelNode> _models = result.getModels();
        NodeProperty _property_1 = modelNodeType.getProperty();
        return this.findGeneratorSourceModel(_models, _property_1);
      } else {
        return result;
      }
    } else {
      return null;
    }
  }
  
  /**
   * Find the boxing model node which is referenced by the generators source model selector.
   * Property recursion part.
   */
  private BoxingModelNode findGeneratorSourceModel(final EList<PropertyModelNode> list, final NodeProperty property) {
    final Function1<PropertyModelNode, Boolean> _function = new Function1<PropertyModelNode, Boolean>() {
      public Boolean apply(final PropertyModelNode node) {
        NodeProperty _declaredNodeProperty = node.getDeclaredNodeProperty();
        return Boolean.valueOf(_declaredNodeProperty.equals(property));
      }
    };
    final PropertyModelNode result = IterableExtensions.<PropertyModelNode>findFirst(list, _function);
    NodeProperty _subProperty = property.getSubProperty();
    boolean _notEquals = (!Objects.equal(_subProperty, null));
    if (_notEquals) {
      EList<PropertyModelNode> _models = result.getModels();
      NodeProperty _subProperty_1 = property.getSubProperty();
      return this.findGeneratorSourceModel(_models, _subProperty_1);
    } else {
      return result;
    }
  }
  
  private Transformation createTransformation(final JvmType type) {
    final Transformation result = BoxingFactory.eINSTANCE.createTransformation();
    result.setDerivedFrom(type);
    return result;
  }
  
  private void createRootModel(final ModelNodeType type, final BoxingModel model) {
    EList<RootModelNode> _sourceModels = model.getSourceModels();
    final Function1<RootModelNode, Boolean> _function = new Function1<RootModelNode, Boolean>() {
      public Boolean apply(final RootModelNode it) {
        RegisteredPackage _declaredModel = it.getDeclaredModel();
        RegisteredPackage _target = type.getTarget();
        return Boolean.valueOf(_declaredModel.equals(_target));
      }
    };
    RootModelNode rootModel = IterableExtensions.<RootModelNode>findFirst(_sourceModels, _function);
    boolean _equals = Objects.equal(rootModel, null);
    if (_equals) {
      RootModelNode _createRootModelNode = BoxingFactory.eINSTANCE.createRootModelNode();
      rootModel = _createRootModelNode;
      RegisteredPackage _target = type.getTarget();
      rootModel.setDeclaredModel(_target);
      EList<RootModelNode> _sourceModels_1 = model.getSourceModels();
      _sourceModels_1.add(rootModel);
    }
    NodeProperty _property = type.getProperty();
    boolean _notEquals = (!Objects.equal(_property, null));
    if (_notEquals) {
      EList<PropertyModelNode> _models = rootModel.getModels();
      NodeProperty _property_1 = type.getProperty();
      PropertyModelNode _createPropertyModelNode = this.createPropertyModelNode(_property_1);
      _models.add(_createPropertyModelNode);
    }
  }
  
  private PropertyModelNode createPropertyModelNode(final NodeProperty property) {
    final PropertyModelNode propertyModel = BoxingFactory.eINSTANCE.createPropertyModelNode();
    propertyModel.setDeclaredNodeProperty(property);
    return propertyModel;
  }
  
  /**
   * -- helper methods --
   */
  private void addUniqueTransformation(final EList<Transformation> list, final Transformation transformation) {
    final Function1<Transformation, Boolean> _function = new Function1<Transformation, Boolean>() {
      public Boolean apply(final Transformation it) {
        JvmType _derivedFrom = it.getDerivedFrom();
        JvmType _derivedFrom_1 = transformation.getDerivedFrom();
        return Boolean.valueOf(_derivedFrom.equals(_derivedFrom_1));
      }
    };
    boolean _exists = IterableExtensions.<Transformation>exists(list, _function);
    boolean _not = (!_exists);
    if (_not) {
      list.add(transformation);
    }
  }
  
  private boolean isSourceModel(final MetamodelSequence sequence, final EList<Connection> connections) {
    boolean _or = false;
    Iterable<Generator> _filter = Iterables.<Generator>filter(connections, Generator.class);
    final Function1<Generator, Boolean> _function = new Function1<Generator, Boolean>() {
      public Boolean apply(final Generator generator) {
        boolean _xifexpression = false;
        SourceModelNodeSelector _sourceModel = generator.getSourceModel();
        Metamodel _reference = _sourceModel.getReference();
        boolean _notEquals = (!Objects.equal(_reference, null));
        if (_notEquals) {
          EList<Metamodel> _metamodels = sequence.getMetamodels();
          final Function1<Metamodel, Boolean> _function = new Function1<Metamodel, Boolean>() {
            public Boolean apply(final Metamodel it) {
              SourceModelNodeSelector _sourceModel = generator.getSourceModel();
              Metamodel _reference = _sourceModel.getReference();
              return Boolean.valueOf(_reference.equals(it));
            }
          };
          _xifexpression = IterableExtensions.<Metamodel>exists(_metamodels, _function);
        } else {
          _xifexpression = false;
        }
        return Boolean.valueOf(_xifexpression);
      }
    };
    boolean _exists = IterableExtensions.<Generator>exists(_filter, _function);
    if (_exists) {
      _or = true;
    } else {
      Iterable<Weaver> _filter_1 = Iterables.<Weaver>filter(connections, Weaver.class);
      final Function1<Weaver, Boolean> _function_1 = new Function1<Weaver, Boolean>() {
        public Boolean apply(final Weaver weaver) {
          boolean _xifexpression = false;
          AspectModel _aspectModel = weaver.getAspectModel();
          if ((_aspectModel instanceof Generator)) {
            EList<Metamodel> _metamodels = sequence.getMetamodels();
            final Function1<Metamodel, Boolean> _function = new Function1<Metamodel, Boolean>() {
              public Boolean apply(final Metamodel it) {
                AspectModel _aspectModel = weaver.getAspectModel();
                SourceModelNodeSelector _sourceModel = ((Generator) _aspectModel).getSourceModel();
                Metamodel _reference = _sourceModel.getReference();
                return Boolean.valueOf(_reference.equals(it));
              }
            };
            _xifexpression = IterableExtensions.<Metamodel>exists(_metamodels, _function);
          } else {
            _xifexpression = false;
          }
          return Boolean.valueOf(_xifexpression);
        }
      };
      boolean _exists_1 = IterableExtensions.<Weaver>exists(_filter_1, _function_1);
      _or = _exists_1;
    }
    return _or;
  }
  
  /**
   * Check if a given generator produces a single or multiple output.
   * 
   * @param type JvmGenericType of the generator
   * 
   * @returns true if the generator produces a single output model else false
   */
  private boolean isSingleOutputGenerator(final JvmGenericType type) {
    EList<JvmTypeReference> _superTypes = type.getSuperTypes();
    final Function1<JvmTypeReference, Boolean> _function = new Function1<JvmTypeReference, Boolean>() {
      public Boolean apply(final JvmTypeReference it) {
        String _simpleName = it.getSimpleName();
        String _simpleName_1 = IGenerator.class.getSimpleName();
        return Boolean.valueOf(_simpleName.startsWith(_simpleName_1));
      }
    };
    final JvmTypeReference generatorInterface = IterableExtensions.<JvmTypeReference>findFirst(_superTypes, _function);
    boolean _equals = Objects.equal(generatorInterface, null);
    if (_equals) {
      EList<JvmTypeReference> _superTypes_1 = type.getSuperTypes();
      final Function1<JvmTypeReference, Boolean> _function_1 = new Function1<JvmTypeReference, Boolean>() {
        public Boolean apply(final JvmTypeReference it) {
          String _simpleName = it.getSimpleName();
          String _simpleName_1 = AbstractRequireTraceModelGenerator.class.getSimpleName();
          return Boolean.valueOf(_simpleName.startsWith(_simpleName_1));
        }
      };
      final JvmTypeReference abstractGenerator = IterableExtensions.<JvmTypeReference>findFirst(_superTypes_1, _function_1);
      EList<JvmTypeReference> _arguments = ((JvmParameterizedTypeReference) abstractGenerator).getArguments();
      JvmTypeReference _get = _arguments.get(1);
      final JvmType targetType = _get.getType();
      boolean _or = false;
      boolean _or_1 = false;
      String _simpleName = targetType.getSimpleName();
      boolean _startsWith = _simpleName.startsWith("List");
      if (_startsWith) {
        _or_1 = true;
      } else {
        String _simpleName_1 = targetType.getSimpleName();
        boolean _startsWith_1 = _simpleName_1.startsWith("EList");
        _or_1 = _startsWith_1;
      }
      if (_or_1) {
        _or = true;
      } else {
        String _simpleName_2 = targetType.getSimpleName();
        boolean _startsWith_2 = _simpleName_2.startsWith("Iterator");
        _or = _startsWith_2;
      }
      return _or;
    } else {
      EList<JvmTypeReference> _arguments_1 = ((JvmParameterizedTypeReference) generatorInterface).getArguments();
      JvmTypeReference _get_1 = _arguments_1.get(1);
      final JvmType targetType_1 = _get_1.getType();
      boolean _or_2 = false;
      boolean _or_3 = false;
      String _simpleName_3 = targetType_1.getSimpleName();
      boolean _startsWith_3 = _simpleName_3.startsWith("List");
      if (_startsWith_3) {
        _or_3 = true;
      } else {
        String _simpleName_4 = targetType_1.getSimpleName();
        boolean _startsWith_4 = _simpleName_4.startsWith("EList");
        _or_3 = _startsWith_4;
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        String _simpleName_5 = targetType_1.getSimpleName();
        boolean _startsWith_5 = _simpleName_5.startsWith("Iterator");
        _or_2 = _startsWith_5;
      }
      return _or_2;
    }
  }
  
  private void processConnection(final BoxingModel model, final Connection generator) {
    if (generator instanceof Generator) {
      _processConnection(model, (Generator)generator);
      return;
    } else if (generator instanceof Weaver) {
      _processConnection(model, (Weaver)generator);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, generator).toString());
    }
  }
}
