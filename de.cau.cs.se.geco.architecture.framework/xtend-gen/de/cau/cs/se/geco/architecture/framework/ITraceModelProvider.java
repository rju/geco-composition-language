package de.cau.cs.se.geco.architecture.framework;

/**
 * Minimal trace model provider
 * 
 * @param <S> source model node type
 * @param <T> target model node type
 * @param <V> node type which is either <T> or a subtype of <T>
 */
@SuppressWarnings("all")
public interface ITraceModelProvider<S extends Object, T extends Object> {
  /**
   * Add one trace to a trace model.
   */
  public abstract void add(final S source, final T target);
  
  /**
   * lookup all target nodes connected to the given source node.
   */
  public abstract Iterable<T> lookup(final S source);
  
  /**
   * lookup all target nodes connected to the given source node
   * which conform to a type V.
   */
  public abstract <V extends T> Iterable<V> lookup(final S source, final Class<V> clazz);
}
