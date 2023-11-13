package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanasConMetodo1 extends JFrame {

    private JPanel panel;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VentanasConMetodo1 frame = new VentanasConMetodo1();
        frame.iniciarVentana();

        int y = 50; 
        
        for (byte i = 1; i < 4; i++) { 
        	frame.agregarBoton("Boton " + i,50, y); 
        	y = y + 50;
       	 }
    }

    private void iniciarVentana() {
        setSize(300, 300);
        setVisible(true);
        panel = new JPanel();
        panel.setLayout(null);
        //getContentPane().add(panel);
    }

    private void agregarBoton(final String nombreBoton, int x, int y) {
        JButton botonBienvenido = new JButton(nombreBoton);
        botonBienvenido.setBounds(x, y, 100, 50);
        panel.add(botonBienvenido);

        botonBienvenido.addActionListener(null);
    }
}