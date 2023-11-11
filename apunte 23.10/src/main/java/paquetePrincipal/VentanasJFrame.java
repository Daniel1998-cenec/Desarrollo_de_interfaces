package paquetePrincipal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanasJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanasJFrame frame = new VentanasJFrame();
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
	public VentanasJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{79, 89, 89, 89, 0};
		gbl_contentPane.rowHeights = new int[]{23, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton boton3 = new JButton("boton 3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_boton3 = new GridBagConstraints();
		gbc_boton3.anchor = GridBagConstraints.NORTHWEST;
		gbc_boton3.insets = new Insets(0, 0, 5, 5);
		gbc_boton3.gridx = 1;
		gbc_boton3.gridy = 3;
		contentPane.add(boton3, gbc_boton3);
		
		JButton boton2 = new JButton("boton 2");
		GridBagConstraints gbc_boton2 = new GridBagConstraints();
		gbc_boton2.anchor = GridBagConstraints.NORTHWEST;
		gbc_boton2.insets = new Insets(0, 0, 5, 5);
		gbc_boton2.gridx = 2;
		gbc_boton2.gridy = 3;
		contentPane.add(boton2, gbc_boton2);
		
		JButton boton1 = new JButton("boton");
		GridBagConstraints gbc_boton1 = new GridBagConstraints();
		gbc_boton1.insets = new Insets(0, 0, 5, 0);
		gbc_boton1.anchor = GridBagConstraints.NORTHWEST;
		gbc_boton1.gridx = 3;
		gbc_boton1.gridy = 3;
		contentPane.add(boton1, gbc_boton1);
	}

}
