package de.cau.cs.se.geco.architecture.framework

/**
 * Trace model provider setter interface. This is only a generic
 * interface to all to add various trace models. In context of
 * the GECO language it is better to define specific provider setter
 * and annotate them with @TraceModel
 * 
 * @param <S> source model node type
 * @param <T> target model node type
 * 
 * @since 1.1
 */
interface ITraceModelInput<S,T> {

	/**
	 * Allows to add a variable list of trace model providers to the generator.
	 * 
	 * @param traceModelProviders various trace model providers to be registered with the generator
	 */	
	def void setTraceModelProviders(ITraceModelProvider<S,T>... traceModelProviders)
}