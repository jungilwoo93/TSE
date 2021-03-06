package fr.uha.ensisa.projet.pan_chabalier.gui;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import fr.uha.ensisa.projet.pan_chabalier.common.stringSources.StringSources;
import fr.uha.ensisa.projet.pan_chabalier.core.ElementFactoryImp;
import fr.uha.ensisa.projet.pan_chabalier.core.State;
import fr.uha.ensisa.projet.pan_chabalier.core.Transition;

public class GUI extends JFrame {

	private static final long serialVersionUID = 2581775020552454169L;
	public static ElementFactoryImp factory = new ElementFactoryImp();
	private JPanel contentPane;
	private GridBagConstraints c_1;
	private GridBagConstraints c_3;
	private GridBagConstraints c_4;

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
		setTitle(StringSources.getString("GUI.this.title")); //$NON-NLS-1$

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnMenu = new JMenu(StringSources.getString("GUI.mnMenu.text")); //$NON-NLS-1$
		menuBar.add(mnMenu);

		JMenuItem mntmOpenFile = new JMenuItem(StringSources.getString("GUI.mntmOpenFile.text")); //$NON-NLS-1$
		mnMenu.add(mntmOpenFile);
		
		JMenuItem mntmNewMenuItem = new JMenuItem(StringSources.getString("GUI.export.text")); //$NON-NLS-1$
		mnMenu.add(mntmNewMenuItem);

		JMenu mnHelp = new JMenu(StringSources.getString("GUI.mnHelp.text")); //$NON-NLS-1$
		menuBar.add(mnHelp);
		
		JMenuItem aboutMenu = new JMenuItem(StringSources.getString("GUI.aboutMenu.text")); //$NON-NLS-1$
		aboutMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO Do the about window
//				JOptionPane.showMessageDialog(null,
//						"<html><center><img src=\""
//								+ Sprites.class.getResource(
//										"/com/chabalier/andy/uha/ensisa/starcraft/ressources/sprite/logo.png")
//								+ "\" alt=\"EnsicraftLogo\"><br>ENSICRAFT, <br>"
//								+ StringSources.getString("Main_UI.aboutDialog.text") + "</center></html>",
//						"About", JOptionPane.PLAIN_MESSAGE);
			}
		});
		mnHelp.add(aboutMenu);

		JMenuItem mntmContactUs = new JMenuItem(StringSources.getString("GUI.mntmContactUs.text")); //$NON-NLS-1$
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
		
		JMenuItem wikiMenu = new JMenuItem(StringSources.getString("GUI.wikiMenu.text")); //$NON-NLS-1$
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
		JButton validate = new JButton(StringSources.getString("GUI.validate.text")); //$NON-NLS-1$
		c_4.gridx = 0;
		c_4.gridy = 4;
		c_4.gridwidth = 1;
		contentPane.add(validate, c_4);

		c_3 = new GridBagConstraints();
		c_3.insets = new Insets(0, 0, 0, 5);
		JButton export = new JButton(StringSources.getString("GUI.export.text")); //$NON-NLS-1$
		c_3.gridx = 3;
		c_3.gridy = 4;
		c_3.gridwidth = 1;
		contentPane.add(export, c_3);

		JTextArea textArea = new JTextArea();
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
				State s1 = new State("1", Color.RED, (float) 5, 200, 200);
				State s2 = new State("2", Color.RED, (float) 5, 400, 400);
				Transition t = new Transition(s1, s2, Color.BLUE, "coucou", (float) 2.5, (float) 50.5);
				panel.addState(s1);
				panel.addState(s2);
				/*
				 * if(text.contains("label")) { System.out.println("label"); EditeurLabel label
				 * = new EditeurLabel("Bello",Color.RED, 200,20); panel.addLabel(label); }else
				 * if(text.contains("state")) { System.out.println("state"); State state = new
				 * State(); panel.addState(state); }else if(text.contains("trans")) {
				 * System.out.println("transition"); Transition trans = new Transition();
				 * panel.addTransition(trans); }
				 */

			}

		});
	}

}