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

import fr.uha.ensisa.project.pan_chabalier.common.utils.Constants;
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
//		Process process = this.pb.start();
//		setOut(((Process) process).getOutputStream());
//		process.waitFor();
		executeGeneratedCode();
	}
	
	public void executeGeneratedCode() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException, URISyntaxException {
//	
		File root = new File("fr/uha/ensisa/project/pan_chabalier/tmp");
        File sourceFile = new File(root, "GeneratedData.java");
		
		// Compile source file.
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		System.out.println(sourceFile.getAbsolutePath());
		compiler.run(null, null, null, sourceFile.getAbsolutePath());

		// Load and instantiate compiled class.
		URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { root.toURI().toURL() });
		Class<?> cls = Class.forName("fr.uha.ensisa.project.pan_chabalier.tmp.GeneratedData", true, classLoader);
		GeneratedDataInterface instance = (GeneratedDataInterface) cls.newInstance();
		instance.setFactory(this.factory);
		instance.instanciateElements();
		
		//factory.createState("q0", Constants.DEFAULT_COLOR, Constants.DEFAULT_THICKNESS,new Point(0,0));
		
		/*factory.createState("q2", new Point(5,3), Constants.DEFAULT_COLOR, Constants.DEFAULT_THICKNESS);
		
		factory.createState("q3", new Point(7,9), Constants.DEFAULT_COLOR, Constants.DEFAULT_THICKNESS);
		
		factory.createState("q4", new Point(3,6), Constants.DEFAULT_COLOR, Constants.DEFAULT_THICKNESS);
		
		
		factory.createTransition("q4", "q1", "label2", new Point(1,1));*/
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
