package de.cau.cs.se.geco.architecture.framework;

/**
 * Minimal trace model provider
 * 
 * @param <S> source model node type
 * @param <T> target model node type
 * @param <SV> node type which is either <S> or a subtype of <S>
 * @param <TV> node type which is either <T> or a subtype of <T>
 */
@SuppressWarnings("all")
public interface ITraceModelProvider<S extends Object, T extends Object> {
  /**
   * Register a target node to a source node. If no such source node exists,
   * add the source node.
   * 
   * @param source node of the source model
   * @param target node of the target model
   */
  public abstract void add(final S source, final T target);
  
  /**
   * Get all target nodes for a given source node.
   * 
   * @param source node of the source model
   * 
   * @return list of target nodes
   */
  public abstract Iterable<T> lookup(final S source);
  
  /**
   * Get all target nodes connected to the given source node
   * which conform to a type V.
   * 
   * @param source node of the source model
   * @param targetClass class type restriction
   * 
   * @return list of target nodes
   */
  public abstract <TV extends T> Iterable<TV> lookup(final S source, final Class<TV> targetClass);
  
  /**
   * Get all target nodes connected to source nodes of a specific type
   * which conform to a type V.
   * 
   * @param sourceClass class type restriction of the source class
   * @param targetClass class type restriction of the target class
   * 
   * @return list of target nodes
   */
  public abstract <SV extends S, TV extends T> Iterable<TV> lookup(final Class<SV> sourceClass, final Class<TV> targetClass);
  
  /**
   * Get all source nodes of a specific type.
   * 
   * @param sourceClass class type restriction of the source class
   * 
   * @return list of source nodes of the given type.
   */
  public abstract <SV extends S> Iterable<SV> allSources(final Class<SV> sourceClass);
  
  /**
   * Get source node for a specific target node.
   * 
   * @param target target node
   * 
   * @return source node
   */
  public abstract Iterable<S> reverseLookup(final T target);
  
  /**
   * Calculate a subset trace model based on source and target classes.
   * 
   * @param sourceClass class type restriction of the source class
   * @param targetClass class type restriction of the target class
   */
  public abstract <SV extends S, TV extends T> ITraceModelProvider<SV, TV> subset(final Class<SV> sourceClass, final Class<TV> targetClass);
}
