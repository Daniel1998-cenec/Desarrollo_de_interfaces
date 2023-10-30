package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanasConMetodo4 extends JFrame {

    private JPanel panel;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VentanasConMetodo4 frame = new VentanasConMetodo4();
        frame.iniciarVentana();

        String boton[] = { "Aceptar", "Siguiente", "Cancelar", "PasoDeMovidas" };
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

        botonBienvenido.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame ventanaNueva = new JFrame("Nueva ventana");

                ventanaNueva.setSize(200, 200);
                ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ventanaNueva.add(new JLabel("Has pulsado el boton" + nombreBoton));
                ventanaNueva.setVisible(true);
            }
        }); 
    }
}