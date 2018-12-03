package fr.uha.ensisa.project.pan_chabalier.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

	/**
	 * import the file in a string
	 * @param fileName the file path to read
	 * @return the string corresponding to the file
	 * @throws IOException If an I/O error occurs
	 */
	public static String importFile(String fileName) throws IOException{
		StringBuilder text = new StringBuilder();
		FileReader fr = new FileReader(new File(fileName));
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
        while (line != null)
        {	
        	text.append(line);
        	text.append(System.lineSeparator());
        	line = br.readLine();
        }
        br.close();
        fr.close();
		return text.toString();
	}
	
	/**
	 * Export the text in a file
	 * @param text the text to export
	 * @param fileName the file path to export
	 * @throws IOException If an I/O error occurs
	 */
	public static void exportFile(String text,String fileName) throws IOException {
		FileWriter fw = new FileWriter(fileName);
		fw.write(text);
		fw.close();
	}
	
	public static void main(String[] args) {
		try {
			FileManager.exportFile(FileManager.importFile("test.tse"), "export.tse");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
