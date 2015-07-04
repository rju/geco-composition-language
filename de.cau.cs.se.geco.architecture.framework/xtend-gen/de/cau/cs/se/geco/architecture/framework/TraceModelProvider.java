package de.cau.cs.se.geco.architecture.framework;

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
public class TraceModelProvider<S extends Object, T extends Object> {
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
  public void add(final S source, final T target) {
    throw new Error("Unresolved compilation problems:"
      + "\n== cannot be resolved.");
  }
  
  /**
   * Get all target nodes for a given source node.
   * 
   * @param source node of the source model
   * 
   * @return list of target nodes
   */
  public List<T> lookup(final S source) {
    return this.map.get(source);
  }
}
