/*
* generated by Xtext
*/
package de.cau.cs.se.geco.architecture;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ArchitectureUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return de.cau.cs.se.geco.architecture.ui.internal.ArchitectureActivator.getInstance().getInjector("de.cau.cs.se.geco.architecture.Architecture");
	}
	
}
