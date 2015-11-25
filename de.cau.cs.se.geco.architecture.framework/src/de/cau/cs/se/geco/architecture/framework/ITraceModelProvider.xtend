package de.cau.cs.se.geco.architecture.framework

/**
 * Minimal trace model provider
 * 
 * @param <S> source model node type
 * @param <T> target model node type
 * @param <SV> node type which is either <S> or a subtype of <S>
 * @param <TV> node type which is either <T> or a subtype of <T>
 */
interface ITraceModelProvider<S, T> {
	/**
	 * Register a target node to a source node. If no such source node exists,
	 * add the source node.
	 * 
	 * @param source node of the source model
	 * @param target node of the target model
	 */
	def void add(S source, T target)
	
	/**
	 * Get all target nodes for a given source node.
	 * 
	 * @param source node of the source model
	 * 
	 * @return list of target nodes
	 */
	def Iterable<T> lookup(S source)
	
	/**
	 * Get all target nodes connected to the given source node
	 * which conform to a type V.
	 * 
	 * @param source node of the source model
	 * @param targetClass class type restriction
	 * 
	 * @return list of target nodes
	 */
	def <TV extends T> Iterable<TV> lookup(S source, Class<TV> targetClass)
	
	/**
	 * Get all target nodes connected to source nodes of a specific type
	 * which conform to a type V.
	 * 
	 * @param sourceClass class type restriction of the source class
	 * @param targetClass class type restriction of the target class
	 * 
	 * @return list of target nodes
	 */
	def <SV extends S, TV extends T> Iterable<TV> lookup(Class<SV> sourceClass, Class<TV> targetClass)
	
	/**
	 * Get all source nodes of a specific type.
	 * 
	 * @param sourceClass class type restriction of the source class
	 * 
	 * @return list of source nodes of the given type.
	 */
	def <SV extends S> Iterable<SV> allSources(Class<SV> sourceClass)
	
	/**
	 * Get source node for a specific target node.
	 * 
	 * @param target target node 
	 * 
	 * @return source node
	 */
	def Iterable<S> reverseLookup(T target)
	
	/**
	 * Calculate a subset trace model based on source and target classes.
	 * 
	 * @param sourceClass class type restriction of the source class
	 * @param targetClass class type restriction of the target class
	 */
	 def <SV extends S,TV extends T> ITraceModelProvider<SV,TV> subset(Class<SV> sourceClass, Class<TV> targetClass)
}