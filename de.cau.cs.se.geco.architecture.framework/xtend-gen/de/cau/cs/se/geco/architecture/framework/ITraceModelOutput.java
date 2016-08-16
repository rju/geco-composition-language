package de.cau.cs.se.geco.architecture.framework;

import de.cau.cs.se.geco.architecture.framework.ITraceModelProvider;

/**
 * Trace model provider getter interface to ensure that the
 * trace model provider is exposed via a getTraceModelProvider
 * method.
 * 
 * @param <S> source model node type
 * @param <T> target model node type
 */
@SuppressWarnings("all")
public interface ITraceModelOutput<S extends Object, T extends Object> {
  public abstract ITraceModelProvider<S, T> getTraceModelProvider();
}
