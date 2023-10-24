package paquetePrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana=new JFrame("Mi segunda ventana");
		ventana.setSize(700,350);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton boton=new JButton("Dale un clikekaso aquí");
		ventana.add(boton);
		
		boton.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				//JOptionPane panel=new JOptionPane();
				String nombre= JOptionPane.showInputDialog(ventana, "Dime tu pokemon favorito", "Datos personales", JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(ventana, "interesante");
				}
		});
		ventana.setVisible(true);
	}

}
