package fr.uha.ensisa.project.pan_chabalier.gui;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import fr.uha.ensisa.project.pan_chabalier.common.utils.FileManager;
import fr.uha.ensisa.project.pan_chabalier.common.utils.Screenshot;
import fr.uha.ensisa.project.pan_chabalier.controller.GeneratorController;
import fr.uha.ensisa.project.pan_chabalier.core.ElementFactoryImp;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class GUI extends JFrame {

	private static final long serialVersionUID = 2581775020552454169L;
	public static ElementFactoryImp factory = new ElementFactoryImp();
	private JPanel contentPane;
	private GridBagConstraints c_1;
	private GridBagConstraints c_3;
	private GridBagConstraints c_4;
	private JTextArea textArea;

	// private Text textToTreat;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setSize(1280, 900);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("State system and transitions editor");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Fichier");
		
		menuBar.add(mnMenu);
		
		JMenuItem mntmOpenFile = new JMenuItem("Open File");
		mntmOpenFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == mntmOpenFile) {
					try {
						String newText = FileManager.importFile();
						textArea.setText(newText);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "IOError: " + e1.getCause(), "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		mnMenu.add(mntmOpenFile);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save as"); 
		mntmSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mntmSaveAs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == mntmSaveAs) {
					try {
						FileManager.exportFile(textArea.getText());
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "IOError: " + e1.getCause(), "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		mnMenu.add(mntmSaveAs);
		
		JMenuItem mntmImport = new JMenuItem("Import");
		mntmImport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == mntmImport) {
					try {
						String newText = FileManager.importAutFile();
						textArea.setText(newText);
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "IOError: " + e1.getCause(), "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		mnMenu.add(mntmImport);
		
		JMenuItem mntmLeave = new JMenuItem("Leave");
		mntmLeave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mntmLeave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == mntmLeave) {
					System.exit(0);
				}
			}
		});
		mnMenu.add(mntmLeave);
		
		JMenu mnEdition = new JMenu("Edition");
		menuBar.add(mnEdition);
		
		JMenuItem mntmScreenshot = new JMenuItem("Take a Screenshot");
		mntmScreenshot.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PRINTSCREEN, 0));
		mntmScreenshot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == mntmScreenshot) {
					Screenshot.main((JFrame) JFrame.getFrames()[0]);
				}
			}
		});
		mnEdition.add(mntmScreenshot);

		JMenu mnHelp = new JMenu("Help"); 
		menuBar.add(mnHelp);
		
		JMenuItem aboutMenu = new JMenuItem("About us"); 

		/*JMenu mnMenu = new JMenu(StringSources.getString("GUI.mnMenu.text")); 
>>>>>>> d6e5049fbc87f2cbbd88dcef193a5b88dfc2dcf3
		menuBar.add(mnMenu);

		JMenuItem mntmOpenFile = new JMenuItem("Open");
		mnMenu.add(mntmOpenFile);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Export as PDF");
		mnMenu.add(mntmNewMenuItem);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
<<<<<<< HEAD
		JMenuItem aboutMenu = new JMenuItem("About");
=======
		JMenuItem aboutMenu = new JMenuItem(StringSources.getString("GUI.aboutMenu.text")); */
		
		aboutMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO Do the about window
//				JOptionPane.showMessageDialog(null,
//						"<html><center><img src=\""
//								+ Sprites.class.getResource(
//										"/com/chabalier/andy/uha/ensisa/starcraft/ressources/sprite/logo.png")
//								+ "\" alt=\"EnsicraftLogo\"><br>ENSICRAFT, <br>"
//								+ "Main_UI.aboutDialog.text") + "</center></html>",
//						"About", JOptionPane.PLAIN_MESSAGE);
			}
		});
		mnHelp.add(aboutMenu);

		JMenuItem mntmContactUs = new JMenuItem("Report bug or enhancement");
		mntmContactUs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == mntmContactUs) {
					if (Desktop.isDesktopSupported()) {
						try {
							Desktop.getDesktop().browse(new URI("https://git.chabalier.com/snowert/TSE/issues"));
						} catch (IOException | URISyntaxException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
		mnHelp.add(mntmContactUs);
		
		JMenuItem wikiMenu = new JMenuItem("Wiki");
		wikiMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == wikiMenu) {
					if (Desktop.isDesktopSupported()) {
						try {
							Desktop.getDesktop().browse(new URI("https://git.chabalier.com/snowert/TSE/wiki"));
						} catch (IOException | URISyntaxException e1) {
							e1.printStackTrace();
						}
					}
				}
			}
		});
		mnHelp.add(wikiMenu);

		GridBagLayout layout = new GridBagLayout();
		layout.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0, 1.0, 1.0 };
		layout.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 0.0 };
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(layout);
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(0, 0, 5, 0);
		c.gridheight = 4;
		c.fill = GridBagConstraints.BOTH;

		
		EditeurPanel panel = new EditeurPanel();
		panel.setBackground(Color.WHITE);
		// panel.setLayout(null);
		c.gridx = 3;
		c.gridy = 0;
		c.gridwidth = 4;
		contentPane.add(panel, c);

		c_4 = new GridBagConstraints();
		c_4.insets = new Insets(0, 0, 0, 5);
		JButton validate = new JButton("Execute");
		//JButton validate = new JButton(StringSources.getString("GUI.validate.text")); 
		c_4.gridx = 0;
		c_4.gridy = 4;
		c_4.gridwidth = 1;
		contentPane.add(validate, c_4);

		c_3 = new GridBagConstraints();
		c_3.insets = new Insets(0, 0, 0, 5);
		JButton export = new JButton("Export as PDF");
		//JButton export = new JButton(StringSources.getString("GUI.export.text")); 
		c_3.gridx = 3;
		c_3.gridy = 4;
		c_3.gridwidth = 1;
		contentPane.add(export, c_3);

		this.textArea = new JTextArea();
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 3;
		gbc_textArea.gridheight = 4;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 0;
		contentPane.add(textArea, gbc_textArea);
		validate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = textArea.getText();
				factory.erase();
				try {
					File f = new File("writedFile.tse");
					FileOutputStream fout = new FileOutputStream("writedFile.tse");
					fout.write(text.getBytes());
					fout.close();
					GeneratorController gen = new GeneratorController(f.getAbsolutePath(),"generator.jar",factory);
					System.out.println("generation started");
					gen.compile();
					System.out.println("generation ended");
					
				} catch (IOException | URISyntaxException | ClassNotFoundException | InstantiationException | IllegalAccessException | InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Cleaning factory");
				panel.cleanLists();
				System.out.println("done");
				
				System.out.println("Adding data");
				panel.addStates(factory.getStates().values());
				panel.addTransitions(factory.getTransitions());
				panel.addLabels(factory.getTransitions());
				System.out.println("done");
				
				System.out.println("Repainting");
				panel.getParent().repaint();
				panel.repaint();
				System.out.println("done");
				//old code TODO refactor it
				
//				State s1 = new State("1", Color.RED, (float) 5, 200, 200);
//				State s2 = new State("2", Color.RED, (float) 5, 400, 400);
//				Transition t = new Transition(s1, s2, Color.BLUE, "coucou", (float) 2.5, (float) 50.5);
//				panel.addState(s1);
//				panel.addState(s2);
//				/*
//				 * if(text.contains("label")) { System.out.println("label"); EditeurLabel label
//				 * = new EditeurLabel("Bello",Color.RED, 200,20); panel.addLabel(label); }else
//				 * if(text.contains("state")) { System.out.println("state"); State state = new
//				 * State(); panel.addState(state); }else if(text.contains("trans")) {
//				 * System.out.println("transition"); Transition trans = new Transition();
//				 * panel.addTransition(trans); }
//				 */

			}

		});
	}
}