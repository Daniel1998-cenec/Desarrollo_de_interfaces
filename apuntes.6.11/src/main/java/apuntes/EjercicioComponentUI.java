package apuntes;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjercicioComponentUI extends JFrame{
	public static void main (String[] args) {
		JFrame frame=new JFrame("Botón personalizado");
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setLocation(200,200);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel= new JPanel();
		panel.setLayout(null);
		frame.getContentPane().add(panel);
		
		JButton button= new JButton("Botón Personalizado");
		button.setBackground(Color.cyan);
		button.setForeground(Color.ORANGE);
		
		//Establecer el tamaño y la ubi del botón
		
		button.setBounds(50,50,200,30);
		
		frame.setLocation(300,300);
		frame.setSize(300,200);
		
		panel.add(button);
		frame.setVisible(true);
	}
}
