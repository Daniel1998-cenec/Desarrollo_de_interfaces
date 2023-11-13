package examen.desarrollo.interfaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {

	JPanel panelNorte = new JPanel();
	JPanel panelSur = new JPanel();
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menu = new JMenu("Botones");
	private JMenuItem boton1;
	JLabel mensaje=new JLabel("Se ha pulsado el boton ");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VentanaPrincipal frame = new VentanaPrincipal();

		frame.iniciarVentana();

		int y = 0;

		for (byte i = 1; i < 4; i++) {
			// frame.agregarBotonesNorte("Boton " + i, 50, y);
			frame.agregarBotonesNorte("Boton " + i, 50, y);

			// frame.agregarBotonesSur("Boton " + i, 50, y);
			y = y + 50;
		}
		
		for (byte i = 1; i < 7; i++) {
			frame.creacionMenu("Boton " + i, 50, y);
			y = y + 50;
		}
	}

	// Configuración del JFrame Principal

	private void iniciarVentana() {
		setTitle("Examen Prático");
		setSize(400, 300);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 300, 300));

		setLayout(new BorderLayout());
		add(panelNorte);
		add(panelSur);

		setVisible(true);
	}

	// Diseño de los botones del norte

	private void agregarBotonesNorte(final String nombre, int x, int y) {
		JButton botonNorte = new JButton(nombre);
		botonNorte.setBounds(x, y, 100, 100);
		// panelSur.setBorder(new EmptyBorder(0, 100, 50, 50));
		panelSur.add(botonNorte);
		setContentPane(panelSur);
		
		botonNorte.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame ventanaBoton=new JFrame("Ventana "+nombre);
				ventanaBoton.setSize(400, 300);
				mensaje.setText(nombre);
				ventanaBoton.add(new JLabel("Se ha pulsado el "+nombre));
				ventanaBoton.setVisible(true);
			}
			
		});

		// Creacion menu
		/*setJMenuBar(menuBar);
		menuBar.add(menu);
		boton1 = new JMenuItem(nombre);
		menu.add(boton1);
		setVisible(true);*/
	}

	// Creacion menu
	private void creacionMenu(String nombre, int x, int y) {
		
		setJMenuBar(menuBar);
		menuBar.add(menu);
		boton1 = new JMenuItem(nombre);
		menu.add(boton1);
		setVisible(true);
	}
	
	

	// La idea era usar esta funcion que poner los botones en el sur del panel :(
	// No lo consigo

	/*
	 * private void agregarBotonesSur(String nombre, int x, int y) {
	 * 
	 * JButton botonSur = new JButton(nombre); botonSur.setBounds(x, y, 100, 100);
	 * //panelSur.setBorder(new EmptyBorder(0, 100, 50, 50));
	 * panelSur.add(botonSur); setContentPane(panelSur);
	 * 
	 * }
	 */

}
