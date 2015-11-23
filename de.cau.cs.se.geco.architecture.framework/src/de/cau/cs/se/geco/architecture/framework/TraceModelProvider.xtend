package de.cau.cs.se.geco.architecture.framework

import java.util.Map
import java.util.List
import java.util.HashMap
import java.util.ArrayList
import java.util.Collection

/**
 * Generic trace model provider.
 * In many cases S and T are only EObject, as the meta-models do not provide
 * marker interfaces identifying trace model aware node types.
 * 
 * @param <S> node type of the source meta-model
 * @param <T> node type of the target meta-model
 */
class TraceModelProvider<S,T> implements ITraceModelProvider<S,T> {
	
	val Map<S,List<T>> map 
	
	new() {
		this.map = new HashMap<S,List<T>>()
	}
	
	/**
	 * Register a target node to a source node. If no such source node exists,
	 * add the source node.
	 * 
	 * @param source node of the source model
	 * @param target node of the target model
	 */
	override void add(S source, T target) {
		val list = map.get(source)
		if (list == null) { /** new entry */
			map.put(source, new ArrayList<T>())
			this.add(source, target)
		} else {
			list.add(target)
		}
	}
	
	/**
	 * Get all target nodes for a given source node.
	 * 
	 * @param source node of the source model
	 * 
	 * @return list of target nodes
	 */
	override Collection<T> lookup(S source) {
		map.get(source)
	}
	
	/**
	 * Get all target nodes connected to the given source node
	 * which conform to a type V.
	 * 
	 * @param source node of the source model
	 * @param clazz clazz type restriction
	 * 
	 * @return list of target nodes
	 */
	override <V extends T> Iterable<V> lookup(S source, Class<V> clazz) {
		map.get(source).filter(clazz)
	}
	
}