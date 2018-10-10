/*
 * generated by Xtext 2.12.0
 */
package fr.uha.ensisa.project.pan_chabalier.tse.generator

import fr.uha.ensisa.project.pan_chabalier.tse.tSE.Element
import fr.uha.ensisa.project.pan_chabalier.tse.tSE.Model
import fr.uha.ensisa.project.pan_chabalier.tse.tSE.StatesProperties
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TSEGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (m : resource.allContents.toIterable.filter(Model)) {
			fsa.generateFile("fr/uha/ensisa/project/pan_chabalier/tmp/tmpJavaCode.java", m.compile());
		}

	}

	def compile(Model model) '''
package fr.uha.ensisa.project.pan_chabalier.tmp;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

public class tmpJavaCode {

	private HashMap<String,  ArrayList<Object>> states = new HashMap<String,  ArrayList<Object>>();

	public tmpJavaCode() {
		�FOR e : model.elements�
			�e.compile�
		�ENDFOR�
	}
	
		
	public HashMap<String,  ArrayList<Object>> getStates(){
		return this.states;
	}
	
	public static void main(String[] args) {
		tmpJavaCode tmp = new tmpJavaCode();
		for(ArrayList<Object> s : tmp.getStates().values()) {
			System.out.println(s.toString());
		}
	}
}
	'''

	def compile(Element e) '''
		�FOR s : e.states�
			states.put("�s.name�", new ArrayList<Object>(){{�FOR p:s.statesPropriety� add(�p.compile�);�ENDFOR�}});
		�ENDFOR�
	'''

	def compile(StatesProperties p) '''�IF p.position!==null�new Point(�p.position�)�ENDIF��IF p.color !== null�Color.�p.color��ENDIF��IF p.thickness!==null�new Float(�p.thickness�)�ENDIF�'''
}