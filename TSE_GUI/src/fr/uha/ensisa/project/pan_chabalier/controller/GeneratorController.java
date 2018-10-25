package fr.uha.ensisa.project.pan_chabalier.controller;

import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import fr.uha.ensisa.project.pan_chabalier.core.ElementFactoryImp;

public class GeneratorController {

	private ProcessBuilder pb;
	private OutputStream out;
	private ElementFactoryImp factory;

	public GeneratorController(String fileName,String generatorName,ElementFactoryImp factory) {
		this.pb = new ProcessBuilder("java", "-jar", generatorName, fileName); //TODO make config file
		this.factory = factory;
	}
	 
	public void compile() throws IOException, InterruptedException, ClassNotFoundException, InstantiationException, IllegalAccessException, URISyntaxException {
		Process process = this.pb.start();
		setOut(((Process) process).getOutputStream());
		process.waitFor();
		executeGeneratedCode();
	}
	
	public void executeGeneratedCode() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException, URISyntaxException {
//        File root = new File("src/fr/uha/ensisa/project/pan_chabalier/tmp");	
//		File root = new File(GeneratorController.class.getResource("fr/uha/ensisa/project/pan_chabalier/tmp/").toString());
		File root = new File("src/fr/uha/ensisa/project/pan_chabalier/tmp");
        File sourceFile = new File(root, "GeneratedData.java");
		// Compile source file.
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		compiler.run(null, null, null, sourceFile.getPath());

		// Load and instantiate compiled class.
		URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { root.toURI().toURL() });
		Class<?> cls = Class.forName("fr.uha.ensisa.project.pan_chabalier.tmp.GeneratedData", true, classLoader);
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
	
	public static void main(String[] args) {
		//only for test
		ElementFactoryImp factory = new ElementFactoryImp();
		GeneratorController gen = new GeneratorController("test.tse", "generator.jar", factory);
		System.out.println("factory before generation => " + factory.getStates());
		try {
			gen.compile();
//			gen.executeGeneratedCode();
		} catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException | InterruptedException | URISyntaxException e) {
			e.printStackTrace();
		}
		System.out.println("factory after generation => " + factory.getStates());
	}
}
