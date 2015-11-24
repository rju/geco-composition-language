package de.cau.cs.se.geco.architecture.framework

/**
 * Minimal trace model provider
 * 
 * @param <S> source model node type
 * @param <T> target model node type
 * @param <V> node type which is either <T> or a subtype of <T>
 */
interface ITraceModelProvider<S, T> {
	/**
	 * Add one trace to a trace model.
	 */
	def void add(S source, T target)
	
	/**
	 * lookup all target nodes connected to the given source node. 
	 */
	def Iterable<T> lookup(S source)
	
	/**
	 * lookup all target nodes connected to the given source node
	 * which conform to a type V.
	 */
	def <V extends T> Iterable<V> lookup(S source, Class<V> clazz)
}