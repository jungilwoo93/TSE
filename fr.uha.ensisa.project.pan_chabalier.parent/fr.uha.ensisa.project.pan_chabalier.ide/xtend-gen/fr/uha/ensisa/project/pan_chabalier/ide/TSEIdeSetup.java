/**
 * generated by Xtext 2.12.0
 */
package fr.uha.ensisa.project.pan_chabalier.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.uha.ensisa.project.pan_chabalier.TSERuntimeModule;
import fr.uha.ensisa.project.pan_chabalier.TSEStandaloneSetup;
import fr.uha.ensisa.project.pan_chabalier.ide.TSEIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class TSEIdeSetup extends TSEStandaloneSetup {
  @Override
  public Injector createInjector() {
    TSERuntimeModule _tSERuntimeModule = new TSERuntimeModule();
    TSEIdeModule _tSEIdeModule = new TSEIdeModule();
    return Guice.createInjector(Modules2.mixin(_tSERuntimeModule, _tSEIdeModule));
  }
}
