package de.cau.cs.se.geco.architecture.framework;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.cau.cs.se.geco.architecture.framework.ITraceModelProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}
