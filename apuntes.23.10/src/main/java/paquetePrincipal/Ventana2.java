package paquetePrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana=new JFrame("Mi primera ventana");
		ventana.setSize(400,200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton boton=new JButton("Haz click aquí");
		ventana.add(boton);
		
		boton.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				//JOptionPane panel=new JOptionPane();
				String nombre= JOptionPane.showInputDialog(ventana, "Dime tu nombre", "Datos personales", JOptionPane.QUESTION_MESSAGE);
			}
		});
		ventana.setVisible(true);
	}

}
