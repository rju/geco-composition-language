package de.cau.cs.se.geco.architecture.framework;

import de.cau.cs.se.geco.architecture.framework.IGenerator;
import de.cau.cs.se.geco.architecture.framework.TraceModelProvider;

/**
 * Abstract class to ensure correct realization of aspect generators.
 * 
 * @param <S> input source node type.
 * @param <T> output type for output model roots.
 * @param <BS> source base model node type (e.g, EObject)
 * @param <BT> target base model node type (e.g, EObject)
 * 
 * @author Reiner Jung
 */
@SuppressWarnings("all")
public abstract class AbstractRequireTraceModelGenerator<S extends Object, T extends Object, BS extends Object, BT extends Object> implements IGenerator<S, T> {
  private final TraceModelProvider<BS, BT> provider;
  
  public AbstractRequireTraceModelGenerator(final TraceModelProvider<BS, BT> provider) {
    this.provider = provider;
  }
  
  protected TraceModelProvider<BS, BT> getTraceModelProvider() {
    return this.provider;
  }
}
