package de.cau.cs.se.geco.architecture.framework

/**
 * Transform a given source node S into a structure handled by T.
 * T might be a single node type of the target meta-model or a list
 * of result elements.
 * 
 * @author Reiner Jung
 *
 * @param <S> type of the source meta-model
 * @param <T> type of the target meta-model
 */
public interface IGenerator<S,T> {
	def T generate(S input)
}
