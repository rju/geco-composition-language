package de.cau.cs.se.geco.architecture.framework

/**
 * Minimal trace model provider
 * 
 * @param <S> source model node type
 * @param <T> target model node type
 * @param <V> node type which is either <T> or a subtype of <T>
 */
interface ITraceModelProvider<S,T> {
	def void add(S source, T target)

	def Iterable<T> lookup(S source)

	def <V extends T> Iterable<V> lookup(S source, Class<V> clazz)
}