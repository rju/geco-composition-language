/*
* generated by Xtext
*/
package de.cau.cs.se.geco.architecture;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ArchitectureStandaloneSetup extends ArchitectureStandaloneSetupGenerated{

	public static void doSetup() {
		new ArchitectureStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
