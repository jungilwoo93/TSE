package fr.uha.ensisa.projet.pan_chabalier.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import fr.uha.ensisa.projet.pan_chabalier.core.ElementFactory;

public class GeneratorController {

	private ProcessBuilder pb;
	private OutputStream out;
	private ElementFactory factory;

	public GeneratorController(String fileName,String generatorName,ElementFactory factory) {
		this.pb = new ProcessBuilder("java", "-jar", generatorName, fileName); //TODO make config file
		this.factory = factory;
	}
	 
	public void compile() throws IOException, InterruptedException {
		Process process = this.pb.start();
		setOut(((Process) process).getOutputStream());
		process.waitFor();
	}
	
	public void executeGeneratedCode() throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		File sourceFile = new File("src-gen/fr/uha/ensisa/project/pan_chabalier/tmp/GeneratedData.java");
		File root = new File("");
		// Compile source file.
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		compiler.run(null, null, null, sourceFile.getPath());

		// Load and instantiate compiled class.
		URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { root.toURI().toURL() });
		Class<?> cls = Class.forName("fr/uha/ensisa/project/pan_chabalier/tmp/GeneratedData", true, classLoader);
		GeneratedDataInterface instance = (GeneratedDataInterface) cls.newInstance();
		instance.setFactory(this.factory);
		instance.instanciateElements();
	}
	
	public OutputStream getOut() {
		return out;
	}

	private void setOut(OutputStream out) {
		this.out = out;
	}
}
