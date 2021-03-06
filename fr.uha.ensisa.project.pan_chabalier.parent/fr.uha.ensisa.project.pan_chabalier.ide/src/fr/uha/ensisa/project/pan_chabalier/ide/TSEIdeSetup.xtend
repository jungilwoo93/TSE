/*
 * generated by Xtext 2.12.0
 */
package fr.uha.ensisa.project.pan_chabalier.ide

import com.google.inject.Guice
import fr.uha.ensisa.project.pan_chabalier.TSERuntimeModule
import fr.uha.ensisa.project.pan_chabalier.TSEStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class TSEIdeSetup extends TSEStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new TSERuntimeModule, new TSEIdeModule))
	}
	
}
