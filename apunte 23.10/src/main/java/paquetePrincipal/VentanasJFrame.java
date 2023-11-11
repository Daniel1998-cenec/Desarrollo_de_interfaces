package paquetePrincipal;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
        setBounds(500, 500, 500, 500);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        // Utilizamos un FlowLayout en lugar de null
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JButton boton = new JButton("Boton 1");
        boton.setBounds(5, 5, 100, 100);
        contentPane.add(boton);

        JLabel label = new JLabel("");
        label.setBounds(5, 89, 213, 84);
        contentPane.add(label);

        JLabel label_1 = new JLabel("");
        label_1.setBounds(5, 89, 213, 84);
        contentPane.add(label_1);

        // Corregir la configuración de los botones
        JButton boton2 = new JButton("Boton 2");
        boton2.setBounds(5, 5, 100, 100);
        contentPane.add(boton2);

        JButton boton3 = new JButton("Boton 3");
        boton3.setBounds(5, 5, 100, 100);
        contentPane.add(boton3);
	}

}
