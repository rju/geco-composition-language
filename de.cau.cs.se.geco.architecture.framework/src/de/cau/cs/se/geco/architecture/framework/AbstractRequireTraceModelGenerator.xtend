package de.cau.cs.se.geco.architecture.framework


/**
 * Abstract class to ensure correct realization of aspect generators.
 * 
 * @param <S> input source node type.
 * @param <T> output type for output model roots.
 * @param <BS> source base model node type (e.g, EObject)
 * @param <BT> target base model node type (e.g, EObject)
 * 
 * @author Reiner Jung
 *
 */
public abstract class AbstractRequireTraceModelGenerator<S, T, BS, BT> implements
		IGenerator<S, T> {

	val TraceModelProvider<BS,BT> provider

	public new (TraceModelProvider<BS,BT> provider) {
		this.provider = provider
	}
	
	protected def TraceModelProvider<BS,BT> getTraceModelProvider() {
		return this.provider
	}
	
}
