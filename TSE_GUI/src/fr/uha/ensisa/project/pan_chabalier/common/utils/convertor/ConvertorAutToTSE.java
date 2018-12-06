package fr.uha.ensisa.project.pan_chabalier.common.utils.convertor;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertorAutToTSE {

	public static String convert(String text) {
		HashSet<String> states = new HashSet<String>();
		HashSet<String> transitions = new HashSet<String>();
		Scanner sc = new Scanner(formatText(text));
		while (sc.hasNext()) {
			Pattern pattern = Pattern.compile("(.*),(.*),(.*)");
			Matcher matcher = pattern.matcher(sc.nextLine());
			if (matcher.find()) {
				states.add(matcher.group(1));
				states.add(matcher.group(3));
				transitions.add(matcher.group(1) + " -> " + matcher.group(3) + " label " + matcher.group(2) + " 0,0");
			}
		}
		sc.close();
		StringBuilder newText = new StringBuilder("//Auto-Import from .aut file" + System.lineSeparator());
		for (String s : states) {
			newText.append("state " + s + " position 0,0 ");
			newText.append(System.lineSeparator());
		}
		newText.append(System.lineSeparator());
		newText.append(System.lineSeparator());
		for (String t : transitions) {
			newText.append(t);
			newText.append(System.lineSeparator());
		}
		return newText.toString();
	}

	private static String formatText(String text) {
		text = text.substring(text.indexOf(System.lineSeparator()));
		text = text.replaceAll("[\\(|\\)]", ""); // remove parenthesis
		return text;
	}
}
