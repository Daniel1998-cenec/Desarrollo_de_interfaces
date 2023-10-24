package paquetePrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class Ventana3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame("Mi segunda ventana");
		JButton boton = new JButton("Dale un clikekaso aquí");
		ventana.setSize(300, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		ventana.getContentPane().add(boton);

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// JOptionPane panel=new JOptionPane();
				String nombre = JOptionPane.showInputDialog(ventana, "Dime tu pokemon favorito", "Datos personales",
						JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(ventana, "interesante");
			}
		});
		ventana.setVisible(true);
	}

}
