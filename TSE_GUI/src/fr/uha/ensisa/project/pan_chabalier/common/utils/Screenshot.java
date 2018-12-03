package fr.uha.ensisa.project.pan_chabalier.common.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Instant;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Screenshot {
	
	/**
	 * Take a screenshot of a JFrame and save it at root application
	 * @param frame the frame to capture
	 */
	public static void main(JFrame frame) {
		{
			BufferedImage bufImage = new BufferedImage(frame.getSize().width, frame.getSize().height,
					BufferedImage.TYPE_INT_ARGB);
			frame.paint(bufImage.createGraphics());
			File imageFile = new File(
					"screenshot" + Instant.now().toString().replaceAll("\\.", "_").replaceAll(":", "_") + ".jpg");
			try {
				imageFile.createNewFile();
				ImageIO.write(bufImage, "jpg", imageFile);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
