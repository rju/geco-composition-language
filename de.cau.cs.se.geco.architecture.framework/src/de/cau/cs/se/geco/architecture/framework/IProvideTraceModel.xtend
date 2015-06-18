package de.cau.cs.se.geco.architecture.framework

/**
 * Generator interface for generator which provide a trace model.
 * 
 * @param <S> node type of the source meta model
 * @param <T> node type of the target meta model
 * 
 * Note: in many cases, where the meta-model does not provide a marker
 * interface for traceable nodes, S and T might be EObject.
 * 
 * @author Reiner Jung 
 */
interface IProvideTraceModel<S,T> {
	def TraceModelProvider<S,T> getTraceModelProvider()
}