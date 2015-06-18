package de.cau.cs.se.geco.architecture.framework

/**
 * @param <B> base meta-model
 * @param <A> aspect meta-model
 */
interface IWeaver<B,A> {
	
	/**
	 * Weave an aspect model into the base model. The pointcut
	 * is provided by the weave method itself.
	 * 
	 * Note: It is assumed that the returned model is the same
	 * model as the baseModel and not a copy of the model.
	 * 
	 * @param baseModel the base model
	 * @param aspectModel the aspect to be woven into
	 * 
	 * @returns the woven model 
	 */
	def B weave(B baseModel, A aspectModel)
}