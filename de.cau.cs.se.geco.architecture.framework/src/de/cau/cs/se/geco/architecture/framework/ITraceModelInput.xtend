package de.cau.cs.se.geco.architecture.framework

import java.util.Iterator

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
interface ITraceModelInput<S,T> {
	
	@TraceModel
	def void setTraceModelProviders(Iterator<ITraceModelProvider<S,T>> traceModelProvider)
}