/**
 * generated by Xtext 2.12.0
 */
package fr.uha.ensisa.project.pan_chabalier.generator;

import com.google.common.collect.Iterables;
import fr.uha.ensisa.project.pan_chabalier.tSE.Element;
import fr.uha.ensisa.project.pan_chabalier.tSE.Model;
import fr.uha.ensisa.project.pan_chabalier.tSE.State;
import fr.uha.ensisa.project.pan_chabalier.tSE.StatesProperties;
import fr.uha.ensisa.project.pan_chabalier.tSE.Transition;
import fr.uha.ensisa.project.pan_chabalier.tSE.TransitionProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class TSEGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Model> _filter = Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class);
    for (final Model m : _filter) {
      fsa.generateFile("fr/uha/ensisa/project/pan_chabalier/tmp/GeneratedData.java", this.compile(m));
    }
  }
  
  public CharSequence compile(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package fr.uha.ensisa.project.pan_chabalier.tmp;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.awt.Color;");
    _builder.newLine();
    _builder.append("import java.awt.Point;");
    _builder.newLine();
    _builder.append("import fr.uha.ensisa.projet.pan_chabalier.core.ElementFactoryImp;");
    _builder.newLine();
    _builder.append("import fr.uha.ensisa.projet.pan_chabalier.controller.GeneratedDataInterface;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class GeneratedData implements GeneratedDataInterface {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ElementFactoryImp factory;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public GeneratedData(ElementFactoryImp factory){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.factory = factory;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void instanciateElements(){");
    _builder.newLine();
    {
      EList<Element> _elements = model.getElements();
      for(final Element e : _elements) {
        _builder.append("\t\t");
        CharSequence _compile = this.compile(e);
        _builder.append(_compile, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void setFactory(ElementFactoryImp f){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.factory = f;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Element e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      State _state = e.getState();
      boolean _tripleNotEquals = (_state != null);
      if (_tripleNotEquals) {
        _builder.append("factory.createState(\"");
        String _name = e.getState().getName();
        _builder.append(_name);
        _builder.append("\"");
        {
          EList<StatesProperties> _statesProperties = e.getState().getStatesProperties();
          for(final StatesProperties p : _statesProperties) {
            CharSequence _compile = this.compile(p);
            _builder.append(_compile);
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      Transition _transition = e.getTransition();
      boolean _tripleNotEquals_1 = (_transition != null);
      if (_tripleNotEquals_1) {
        _builder.append("factory.createTransition(\"");
        {
          String _stateTransition = e.getTransition().getStart().getStateTransition();
          boolean _tripleNotEquals_2 = (_stateTransition != null);
          if (_tripleNotEquals_2) {
            String _stateTransition_1 = e.getTransition().getStart().getStateTransition();
            _builder.append(_stateTransition_1);
          }
        }
        _builder.append("\", \"");
        {
          String _stateTransition_2 = e.getTransition().getEnd().getStateTransition();
          boolean _tripleNotEquals_3 = (_stateTransition_2 != null);
          if (_tripleNotEquals_3) {
            String _stateTransition_3 = e.getTransition().getEnd().getStateTransition();
            _builder.append(_stateTransition_3);
          }
        }
        _builder.append("\"");
        {
          EList<TransitionProperties> _transitionProperties = e.getTransition().getTransitionProperties();
          for(final TransitionProperties p_1 : _transitionProperties) {
            CharSequence _compile_1 = this.compile(p_1);
            _builder.append(_compile_1);
          }
        }
        _builder.append(", \"");
        {
          String _text = e.getTransition().getLabel().getText();
          boolean _tripleNotEquals_4 = (_text != null);
          if (_tripleNotEquals_4) {
            String _text_1 = e.getTransition().getLabel().getText();
            _builder.append(_text_1);
          }
        }
        {
          String _text_2 = e.getTransition().getLabel().getText();
          boolean _tripleEquals = (_text_2 == null);
          if (_tripleEquals) {
            _builder.append("\"\"");
          }
        }
        _builder.append("\", ");
        {
          String _position = e.getTransition().getLabel().getPosition();
          boolean _tripleNotEquals_5 = (_position != null);
          if (_tripleNotEquals_5) {
            _builder.append("new Point(");
            String _position_1 = e.getTransition().getLabel().getPosition();
            _builder.append(_position_1);
            _builder.append(")");
          }
        }
        {
          String _position_2 = e.getTransition().getLabel().getPosition();
          boolean _tripleEquals_1 = (_position_2 == null);
          if (_tripleEquals_1) {
            _builder.append("new Point(null)");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final TransitionProperties p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(", ");
    {
      String _color = p.getColor();
      boolean _tripleNotEquals = (_color != null);
      if (_tripleNotEquals) {
        _builder.append("Color.");
        String _color_1 = p.getColor();
        _builder.append(_color_1);
      }
    }
    {
      String _color_2 = p.getColor();
      boolean _tripleEquals = (_color_2 == null);
      if (_tripleEquals) {
        _builder.append("null");
      }
    }
    _builder.append(", ");
    {
      String _thickness = p.getThickness();
      boolean _tripleNotEquals_1 = (_thickness != null);
      if (_tripleNotEquals_1) {
        _builder.append("new Float(");
        String _thickness_1 = p.getThickness();
        _builder.append(_thickness_1);
        _builder.append(")");
      }
    }
    {
      String _thickness_2 = p.getThickness();
      boolean _tripleEquals_1 = (_thickness_2 == null);
      if (_tripleEquals_1) {
        _builder.append("new Float(null)");
      }
    }
    _builder.append(", ");
    {
      String _curve = p.getCurve();
      boolean _tripleNotEquals_2 = (_curve != null);
      if (_tripleNotEquals_2) {
        _builder.append("new Float(");
        String _curve_1 = p.getCurve();
        _builder.append(_curve_1);
        _builder.append(")");
      }
    }
    {
      String _curve_2 = p.getCurve();
      boolean _tripleEquals_2 = (_curve_2 == null);
      if (_tripleEquals_2) {
        _builder.append("new Float(null)");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final StatesProperties p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(", ");
    {
      String _position = p.getPosition();
      boolean _tripleNotEquals = (_position != null);
      if (_tripleNotEquals) {
        _builder.append("new Point(");
        String _position_1 = p.getPosition();
        _builder.append(_position_1);
        _builder.append(")");
      }
    }
    {
      String _position_2 = p.getPosition();
      boolean _tripleEquals = (_position_2 == null);
      if (_tripleEquals) {
        _builder.append("new Point(null)");
      }
    }
    _builder.append(", ");
    {
      String _color = p.getColor();
      boolean _tripleNotEquals_1 = (_color != null);
      if (_tripleNotEquals_1) {
        _builder.append("Color.");
        String _color_1 = p.getColor();
        _builder.append(_color_1);
      }
    }
    {
      String _color_2 = p.getColor();
      boolean _tripleEquals_1 = (_color_2 == null);
      if (_tripleEquals_1) {
        _builder.append("null");
      }
    }
    _builder.append(", ");
    {
      String _thickness = p.getThickness();
      boolean _tripleNotEquals_2 = (_thickness != null);
      if (_tripleNotEquals_2) {
        _builder.append("new Float(");
        String _thickness_1 = p.getThickness();
        _builder.append(_thickness_1);
        _builder.append(")");
      }
    }
    {
      String _thickness_2 = p.getThickness();
      boolean _tripleEquals_2 = (_thickness_2 == null);
      if (_tripleEquals_2) {
        _builder.append("new Float(null)");
      }
    }
    return _builder;
  }
}
