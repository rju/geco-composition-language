/*
 * generated by Xtext 2.10.0
 */
package de.cau.cs.se.geco.architecture.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractArchitectureValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(de.cau.cs.se.geco.architecture.architecture.ArchitecturePackage.eINSTANCE);
		return result;
	}
	
}
