package de.cau.cs.se.geco.architecture.framework;

import de.cau.cs.se.geco.architecture.framework.ITraceModelProvider;
import de.cau.cs.se.geco.architecture.framework.TraceModel;

/**
 * Trace model provider setter interface. This is only a convenience
 * interface in case only one trace model is used. In context of
 * the GECO language it is better to define specific provider setter
 * and annotate them with @TraceModel
 * 
 * @param <S> source model node type
 * @param <T> target model node type
 * 
 * @since 1.1
 */
@SuppressWarnings("all")
public interface ITraceModelInput<S extends Object, T extends Object> {
  @TraceModel
  public abstract void setTraceModelProvider(final ITraceModelProvider<S, T> traceModelProvider);
}
