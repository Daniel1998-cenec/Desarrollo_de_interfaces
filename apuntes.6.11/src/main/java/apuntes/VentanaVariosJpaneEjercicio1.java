package apuntes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaVariosJpaneEjercicio1 extends JFrame {
	private JLabel etiquetaMensaje;

	public VentanaVariosJpaneEjercicio1() {
		setTitle("Ejemplo con Dos Contenedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelBotones = new JPanel();
		JPanel panelMensaje = new JPanel();

		etiquetaMensaje = new JLabel("Mensaje: ");

		for (int i = 1; i <= 3; i++) {
			final int numeroBoton = i;
			JButton boton = new JButton("Boton " + i);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String textoBoton = ((JButton) e.getSource()).getText();
					String mensaje = "Mensaje: ";

					if (textoBoton.equals("Boton 1")) {
						mensaje += "Bienvenido Has presionado el botón 1, otra vez";
					} else if (textoBoton.equals("Boton 2")) {
						mensaje += "Bienvenido Has presionado el botón 2, otra vez";
					} else if (textoBoton.equals("Boton 3")) {
						mensaje += "Bienvenido Has presionado el botón 3, otra vez";
					}

					etiquetaMensaje.setText(mensaje);
				}
			});
			panelBotones.add(boton);
		}

		setLayout(new BorderLayout());
		add(panelBotones, BorderLayout.SOUTH);
		add(panelMensaje, BorderLayout.CENTER);
		panelMensaje.add(etiquetaMensaje);

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new VentanaVariosJpaneEjercicio1();
			}
		});
	}
}