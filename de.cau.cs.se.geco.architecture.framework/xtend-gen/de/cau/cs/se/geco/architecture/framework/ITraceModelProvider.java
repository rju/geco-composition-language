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
  public abstract void add(final S source, final T target);
  
  public abstract Iterable<T> lookup(final S source);
  
  public abstract <V extends T> Iterable<V> lookup(final S source, final Class<V> clazz);
}
