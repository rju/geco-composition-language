package de.cau.cs.se.geco.architecture.framework;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.cau.cs.se.geco.architecture.framework.ITraceModelProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generic trace model provider.
 * In many cases S and T are only EObject, as the meta-models do not provide
 * marker interfaces identifying trace model aware node types.
 * 
 * @param <S> node type of the source meta-model
 * @param <T> node type of the target meta-model
 */
@SuppressWarnings("all")
public class TraceModelProvider<S extends Object, T extends Object> implements ITraceModelProvider<S, T> {
  private final Map<S, List<T>> map;
  
  public TraceModelProvider() {
    HashMap<S, List<T>> _hashMap = new HashMap<S, List<T>>();
    this.map = _hashMap;
  }
  
  /**
   * Register a target node to a source node. If no such source node exists,
   * add the source node.
   * 
   * @param source node of the source model
   * @param target node of the target model
   */
  @Override
  public void add(final S source, final T target) {
    final List<T> list = this.map.get(source);
    boolean _equals = Objects.equal(list, null);
    if (_equals) {
      ArrayList<T> _arrayList = new ArrayList<T>();
      this.map.put(source, _arrayList);
      this.add(source, target);
    } else {
      list.add(target);
    }
  }
  
  /**
   * Get all target nodes for a given source node.
   * 
   * @param source node of the source model
   * 
   * @return list of target nodes
   */
  @Override
  public Collection<T> lookup(final S source) {
    return this.map.get(source);
  }
  
  /**
   * Get all target nodes connected to the given source node
   * which conform to a type V.
   * 
   * @param source node of the source model
   * @param clazz clazz type restriction
   * 
   * @return list of target nodes
   */
  @Override
  public <V extends T> Iterable<V> lookup(final S source, final Class<V> clazz) {
    List<T> _get = this.map.get(source);
    return Iterables.<V>filter(_get, clazz);
  }
  
  /**
   * Get all target nodes connected to source nodes of a specific type
   * which conform to a type V.
   * 
   * @param sourceClass class type restriction of the source class
   * @param targetClass class type restriction of the target class
   * 
   * @return list of target nodes
   */
  @Override
  public <SV extends S, TV extends T> Iterable<TV> lookup(final Class<SV> sourceClass, final Class<TV> targetClass) {
    final ArrayList<TV> result = new ArrayList<TV>();
    Set<S> _keySet = this.map.keySet();
    Iterable<SV> _filter = Iterables.<SV>filter(_keySet, sourceClass);
    final Consumer<SV> _function = (SV source) -> {
      List<T> _get = this.map.get(source);
      Iterable<TV> _filter_1 = Iterables.<TV>filter(_get, targetClass);
      Iterables.<TV>addAll(result, _filter_1);
    };
    _filter.forEach(_function);
    return result;
  }
  
  /**
   * Get all source nodes of a specific type.
   * 
   * @param sourceClass class type restriction of the source class
   * 
   * @return list of source nodes of the given type.
   */
  @Override
  public <SV extends S> Iterable<SV> allSources(final Class<SV> sourceClass) {
    Set<S> _keySet = this.map.keySet();
    return Iterables.<SV>filter(_keySet, sourceClass);
  }
  
  /**
   * Get source node for a specific target node.
   * 
   * @param target target node
   * 
   * @return source nodes
   */
  @Override
  public Iterable<S> reverseLookup(final T target) {
    final ArrayList<S> result = new ArrayList<S>();
    final BiConsumer<S, List<T>> _function = (S key, List<T> value) -> {
      boolean _contains = value.contains(target);
      if (_contains) {
        result.add(key);
      }
    };
    this.map.forEach(_function);
    return result;
  }
  
  /**
   * Calculate a subset trace model based on source and target classes.
   * 
   * @param sourceClass class type restriction of the source class
   * @param targetClass class type restriction of the target class
   */
  @Override
  public <SV extends S, TV extends T> ITraceModelProvider<SV, TV> subset(final Class<SV> sourceClass, final Class<TV> targetClass) {
    final TraceModelProvider<SV, TV> resultMap = new TraceModelProvider<SV, TV>();
    final BiConsumer<S, List<T>> _function = (S key, List<T> value) -> {
      Class<?> _class = key.getClass();
      boolean _equals = _class.equals(sourceClass);
      if (_equals) {
        final Iterable<TV> matchingValues = Iterables.<TV>filter(value, targetClass);
        boolean _isEmpty = IterableExtensions.isEmpty(matchingValues);
        boolean _not = (!_isEmpty);
        if (_not) {
          final Consumer<TV> _function_1 = (TV it) -> {
            resultMap.add(((SV) key), it);
          };
          matchingValues.forEach(_function_1);
        }
      }
    };
    this.map.forEach(_function);
    return resultMap;
  }
}
