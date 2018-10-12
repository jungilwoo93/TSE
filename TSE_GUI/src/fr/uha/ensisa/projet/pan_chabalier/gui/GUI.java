package fr.uha.ensisa.projet.pan_chabalier.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

import fr.uha.ensisa.projet.pan_chabalier.common.stringSources.StringSources;

public class GUI extends JFrame {

	private JPanel contentPane;
	private GridBagConstraints c_1;
	private GridBagConstraints c_2;
	private GridBagConstraints c_3;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu(StringSources.getString("GUI.mnMenu.text")); //$NON-NLS-1$
		menuBar.add(mnMenu);
		
		JMenu mnHelp = new JMenu(StringSources.getString("GUI.mnHelp.text")); //$NON-NLS-1$
		menuBar.add(mnHelp);
		
	    GridBagLayout layout = new GridBagLayout();
	    layout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 1.0};
	    layout.rowWeights = new double[]{1.0, 0.0, 0.0};
	    contentPane = new JPanel();
	    setContentPane(contentPane);
	    contentPane.setLayout(layout);
	    GridBagConstraints c = new GridBagConstraints();
	    c.gridheight = 2;
	    c.fill = GridBagConstraints.BOTH;

	    JPanel panel = new JPanel();
	    panel.setBackground(Color.WHITE);
	    c.gridx = 3;
	    c.gridy = 0;
	    c.gridwidth = 4;
	    contentPane.add(panel, c);

	    c = new GridBagConstraints();
	    JButton validate = new JButton(StringSources.getString("GUI.validate.text")); //$NON-NLS-1$
	    c.gridx = 0;
	    c.gridy = 2;
	    c.gridwidth = 1;
	    contentPane.add(validate, c);

	    c_3 = new GridBagConstraints();
	    JButton export = new JButton(StringSources.getString("GUI.export.text")); //$NON-NLS-1$
	    c_3.gridx = 3;
	    c_3.gridy = 2;
	    c_3.gridwidth = 1;
	    contentPane.add(export, c_3);
 
	    c_2 = new GridBagConstraints();
	    c_2.gridwidth = 3;
	    c_2.fill = GridBagConstraints.BOTH;
	    c_2.gridheight = 2;
	    TextArea textArea = new TextArea(0,0);
	    c_2.gridx = 0;
	    c_2.gridy = 0;
	    contentPane.add(textArea, c_2);
	}

}
