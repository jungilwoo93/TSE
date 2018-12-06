package fr.uha.ensisa.project.pan_chabalier.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileManager {

	/**
	 * import the file in a string
	 * Open a file chooser dialog
	 * @return the string corresponding to the file
	 * @throws IOException If an I/O error occurs
	 */
	public static String importFile() throws IOException {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("tse files", "tse");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("You chose to import this file: " + chooser.getSelectedFile().getName());
			StringBuilder text = new StringBuilder();
			FileReader fr = new FileReader(chooser.getSelectedFile());
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				text.append(line);
				text.append(System.lineSeparator());
				line = br.readLine();
			}
			br.close();
			fr.close();
			return text.toString();
		} else {
			System.out.println("Aborting import");
			return "";
		}
	}

	/**
	 * Export the text in a file
	 * Open a file chooser dialog
	 * @param text the text to export
	 * @throws IOException If an I/O error occurs
	 */
	public static void exportFile(String text) throws IOException {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("tse files", "tse");
		chooser.setFileFilter(filter);
		if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			File f = chooser.getSelectedFile();
			if(FileManager.getFileExtension(f)!="tse"){
				f = new File(f.getPath()+".tse");
			}
			FileWriter fw = new FileWriter(f);
			System.out.println("You choose to export in: " + f);
			fw.write(text);
			fw.close();
		}

	}
	
	/**
	 * import and convert the aut file in a string
	 * Open a file chooser dialog
	 * @return the string corresponding to the aut file
	 * @throws IOException If an I/O error occurs
	 */
	public static String importAutFile() throws IOException {
		//TODO make the conversion of aut file to tse string
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("aut files", "aut");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("You chose to import this file: " + chooser.getSelectedFile().getName());
			StringBuilder text = new StringBuilder();
			FileReader fr = new FileReader(chooser.getSelectedFile());
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				text.append(line);
				text.append(System.lineSeparator());
				line = br.readLine();
			}
			br.close();
			fr.close();
			return ConvertorAutToTSE.convert(text.toString());
		} else {
			JOptionPane.showMessageDialog(null, "Aborting import.", "Information", JOptionPane.WARNING_MESSAGE);
			return "";
		}
	}

	/**
	 * Utils method to get file extension
	 * @param file the file to get extention
	 * @return the extention in string (or empty string if no extention)
	 */
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
}
