package fr.uha.ensisa.project.pan_chabalier.common.utils;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * This example requires iText. I retrieved it from Maven repository
 * 
 * <dependency> <groupId>com.itextpdf</groupId>
 * <artifactId>itextpdf</artifactId> <version>5.5.2</version> </dependency>
 *
 * The program can be run without iText if you comment out the entire method
 * printToPDF (and iText imports), along with it's method call in the class
 * constructor. The result will be the the image above.
 */

public class LargePanelToImageMCVE {

	public LargePanelToImageMCVE(JPanel panel) {

		final java.awt.Image image = getImageFromPanel(panel);

		// Print Image to PDF
		printToPDF(image);

		// Aperçu
		JPanel newPanel = new JPanel() {
			private static final long serialVersionUID = 2019903135915480102L;

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
			}

			@Override
			public Dimension getPreferredSize() {
				return new Dimension(300, 300);
			}
		};

		JOptionPane.showMessageDialog(null, newPanel);
	}

	public void printToPDF(java.awt.Image awtImage) {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("pdf files", "pdf");
		chooser.setFileFilter(filter);
		if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			File f = chooser.getSelectedFile();
			if (FileManager.getFileExtension(f) != "pdf") {
				f = new File(f.getPath() + ".pdf");
			}
			try {
				Document d = new Document();
				PdfWriter writer = PdfWriter.getInstance(d, new FileOutputStream(f));
				d.open();
				Image iTextImage = Image.getInstance(writer, awtImage, 1);
				iTextImage.setAbsolutePosition(0,0);
				iTextImage.scalePercent(100);
				d.add(iTextImage);
				d.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static java.awt.Image getImageFromPanel(Component component) {
		BufferedImage image = new BufferedImage(component.getWidth(), component.getHeight(),
				BufferedImage.TYPE_INT_RGB);
		Graphics2D g = (Graphics2D) image.getGraphics();
	    RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
	            RenderingHints.VALUE_ANTIALIAS_ON);
	        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	        g.setRenderingHints(rh);
		component.paint(g);
		return image;
	}
}
