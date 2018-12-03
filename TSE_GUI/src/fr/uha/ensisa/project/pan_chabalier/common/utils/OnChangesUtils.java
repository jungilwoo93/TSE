package fr.uha.ensisa.project.pan_chabalier.common.utils;

import java.awt.Point;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OnChangesUtils {

	/**
	 * Change the id of a state by a new one. And adapt all occurrence of this state (in transition for example)
	 * @param text the text to change
	 * @param id the state id or transition id to change (if transition, the id is x -> y)
	 * @param newId the new Id
	 * @return the changed text
	 */
	public static String idChanged(String text, String id, String newId) {
		Pattern pattern = Pattern.compile("(.*)" + id + "(.*)");
		Matcher matcher = pattern.matcher(text);
		while(matcher.find()){
			text = matcher.replaceFirst(matcher.group(1) + newId + matcher.group(2));
			pattern = Pattern.compile("(.*)" + id + "(.*)");
			matcher = pattern.matcher(text);
		}
			return text; 
	}
	
	/**
	 * Change the position of the specified state
	 * @param text the text to change
	 * @param id the state id or transition id to change (if transition, the id is x -> y)
	 * @param newPosition the new position
	 * @return the changed text
	 */
	public String statePositionChanged(String text, String id, Point newPosition) {
		Pattern pattern = Pattern.compile("(.*" + id + ".*position )"+ "[A-Z|0-9|,]*" + "( .*)");
		Matcher matcher = pattern.matcher(text);
		if(matcher.find()){
			text = matcher.replaceFirst(matcher.group(1) + (int)newPosition.getX()+","+(int)newPosition.getY() + matcher.group(2));
		}
		return text; 
	}
	
	/**
	 * Change the thickness of a state or a transition.
	 * @param text the text to change
	 * @param id the state id or transition id to change (if transition, the id is x -> y)
	 * @param newThickness the new thickness
	 * @return the changed text
	 */
	public String thicknessChanged(String text, String id, float newThickness) {
		Pattern pattern = Pattern.compile("(.*" + id + ".*thickness )"+ "[A-Z|0-9|.]*" + "( .*)");
		Matcher matcher = pattern.matcher(text);
		if(matcher.find()){
			text = matcher.replaceFirst(matcher.group(1) + newThickness + matcher.group(2));
		}
		return text; 
	}
	
	/**
	 * Change the curvature of a state or a transition
	 * @param text the text to change
	 * @param id the state id or transition id to change (if transition, the id is x -> y)
	 * @param newCurvature the new curvature
	 * @return the changed text
	 */
	public String curvatureChanged(String text, String id, Float newCurvature) {
		Pattern pattern = Pattern.compile("(.*" + id + ".*curvature )"+ "[A-Z|0-9|\\.]*" + "(.*)");
		Matcher matcher = pattern.matcher(text);
		if(matcher.find()){
			text = matcher.replaceFirst(matcher.group(1) + newCurvature + matcher.group(2));
		}
		return text; 
	}
	
	/**
	 * Change the color of a state or a transition
	 * @param text the text to change
	 * @param id the state id or transition id to change (if transition, the id is x -> y)
	 * @param color the new color
	 * @return the changed text
	 */
	public String colorChanged(String text, String id, String color) {
		Pattern pattern = Pattern.compile("(.*" + id + ".*color )"+ "[A-Z|0-9|.]*" + "(.*)");
		Matcher matcher = pattern.matcher(text);
		if(matcher.find()){
			text = matcher.replaceFirst(matcher.group(1) + color + matcher.group(2));
		}
		return text; 
	}
	
	/**
	 * Change the text of a transition label
	 * @param text the text to change
	 * @param id the id or transition id to change
	 * @param newLabelText the new label text
	 * @return the changed text
	 */
	public String labelTextChanged(String text, String id, String newLabelText) {
		Pattern pattern = Pattern.compile("(.*" + id + ".*label \")"+ ".*" + "(\".*)");
		Matcher matcher = pattern.matcher(text);
		if(matcher.find()){
			text = matcher.replaceFirst(matcher.group(1) + newLabelText + matcher.group(2));
		}
		return text; 
	}
	
	/**
	 * Change the position of a transition label
	 * @param text the text to change
	 * @param id the transition id to change
	 * @param newLabelPosition the new label position
	 * @return the changed text
	 */
	public String labelPositionChanged(String text, String id, Point newLabelPosition) {
		Pattern pattern = Pattern.compile("(.*" + id + ".*label \".*\" )"+ "[A-Z|0-9|,]*" + "(.*)");
		Matcher matcher = pattern.matcher(text);
		if(matcher.find()){
			text = matcher.replaceFirst(matcher.group(1) + (int)newLabelPosition.getX()+","+(int)newLabelPosition.getY() + matcher.group(2));
		}
		return text; 
	}
}