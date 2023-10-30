package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanasConMetodo2 extends JFrame {

    private JPanel panel;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VentanasConMetodo2 frame = new VentanasConMetodo2();
        frame.iniciarVentana();

        String boton[] = { "boton 1", "boton 2", "boton 3"};
        int y = 50;
        for (String botones : boton) {
            frame.agregarBoton(botones, 50, y);
            y = y + 50;
        }
    }

    private void iniciarVentana() {
        setSize(300, 300);
        setVisible(true);
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
    }

    private void agregarBoton(final String nombreBoton, int x, int y) {
        JButton botonBienvenido = new JButton(nombreBoton);
        botonBienvenido.setBounds(x, y, 100, 50);
        panel.add(botonBienvenido);

        botonBienvenido.addActionListener(null);
    }
}