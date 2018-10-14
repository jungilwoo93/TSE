package fr.uha.ensisa.projet.pan_chabalier.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.LayoutManager2;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import java.awt.event.TextListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	private GridBagConstraints c_1;
	private GridBagConstraints c_3;
	private GridBagConstraints c_4;
	//private Text textToTreat;
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
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmOpenFile = new JMenuItem("Open File");
		mnMenu.add(mntmOpenFile);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmReadMe = new JMenuItem("Read Me");
		mnHelp.add(mntmReadMe);
		
		JMenuItem mntmContactUs = new JMenuItem("Contact us");
		mnHelp.add(mntmContactUs);
		
	    GridBagLayout layout = new GridBagLayout();
	    layout.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, 1.0};
	    layout.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 0.0};
	    contentPane = new JPanel();
	    setContentPane(contentPane);
	    contentPane.setLayout(layout);
	    GridBagConstraints c = new GridBagConstraints();
	    c.insets = new Insets(0, 0, 5, 0);
	    c.gridheight = 4;
	    c.fill = GridBagConstraints.BOTH;

	    EditeurPanel panel = new EditeurPanel();
	    panel.setBackground(Color.WHITE);
	    //panel.setLayout(null);
	    c.gridx = 3;
	    c.gridy = 0;
	    c.gridwidth = 4;
	    contentPane.add(panel, c);

	    c_4 = new GridBagConstraints();
	    c_4.insets = new Insets(0, 0, 0, 5);
	    JButton validate = new JButton("Validate");
	    c_4.gridx = 0;
	    c_4.gridy = 4;
	    c_4.gridwidth = 1;
	    contentPane.add(validate, c_4);

	    c_3 = new GridBagConstraints();
	    c_3.insets = new Insets(0, 0, 0, 5);
	    JButton export = new JButton("Export as PDF");
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
				if(text.contains("label")) {
					System.out.println("label");
					EditeurLabel label = new EditeurLabel("Bello",Color.RED, 200,20);
					panel.addLabel(label);
				}else if(text.contains("state")) {
					System.out.println("state");
					State state = new State();
					panel.addState(state);
				}else if(text.contains("trans")) {
					System.out.println("transition");
					Transition trans = new Transition();
					panel.addTransition(trans);
				}

			    }
				
	    	
	    });
	}

}
