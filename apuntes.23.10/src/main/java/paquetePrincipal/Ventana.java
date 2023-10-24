package paquetePrincipal;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana=new JFrame("Mi primera ventana");
		ventana.setSize(400,400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel texto=new JLabel("Hola Empe");
		ventana.getContentPane().add(texto);
		
		ventana.setVisible(true);
	}

}
