package de.cau.cs.se.geco.architecture.framework;

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
@SuppressWarnings("all")
public interface IGenerator<S extends Object, T extends Object> {
  public abstract T generate(final S input);
}
