/*
* generated by Xtext
*/
package de.cau.cs.se.geco.architecture.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ArchitectureAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/cau/cs/se/geco/architecture/parser/antlr/internal/InternalArchitecture.tokens");
	}
}