package de.cau.cs.se.geco.architecture.framework

/**
 * Trace model provider getter interface to ensure that the
 * trace model provider is exposed via a getTraceModelProvider
 * method. 
 * 
 * @param <S> source model node type
 * @param <T> target model node type
 */
interface ITraceModelOutput<S,T> {
	def ITraceModelProvider<S,T> getTraceModelProvider()
}