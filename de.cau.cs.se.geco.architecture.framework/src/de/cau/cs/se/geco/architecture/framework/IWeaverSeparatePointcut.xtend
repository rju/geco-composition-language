package de.cau.cs.se.geco.architecture.framework

/**
 * @param <B> base metamodel root class
 * @param <P> pointcut metamodel root class
 * @param <A> aspect metamodel root class
 */
interface IWeaverSeparatePointcut<B,P,A> {
	
	/**
	 * Weave an aspect model into the base model. The pointcut
	 * is provided by the weave method itself.
	 *  
	 * Note: It is assumed that the returned model is the same
	 * model as the baseModel and not a copy of the model.
	 * 
	 * @param baseModel the base model
	 * @param pointcutModel the pointcut or join point model
	 * @param adviceModel the advice to be woven into
	 * 
	 * @returns the woven model 
	 */
	def B weave(B baseModel, P pointcutModel, A adviceModel)
}