package menus;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class EjercicioTextField extends JFrame{
	private JTextField textFieldEdad;
	private JTextField textFieldDireccion;
	private JTextField textFieldCiudad;
	private JTextField textFieldProvincia;
	private JTextField textFieldNombre;

	public EjercicioTextField() {
		
		setTitle("Ejemplo JTextField");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(377,245);
		
		JLabel labelNombre=new JLabel("Indica tu nombre");
		labelNombre.setBounds(10,10,150,20);
		getContentPane().add(labelNombre);
		
		textFieldNombre = new JTextField();
        textFieldNombre.setBounds(160, 10, 120, 20);
        getContentPane().add(textFieldNombre);
		
		JLabel labelEdad = new JLabel("Indica tu edad");
		labelEdad.setBounds(10, 41, 150, 20);
		getContentPane().add(labelEdad);
		
		textFieldEdad = new JTextField();
		textFieldEdad.setBounds(240, 41, 40, 20);
		getContentPane().add(textFieldEdad);
		
		JLabel labelDireccion = new JLabel("Direccion: ");
		labelDireccion.setBounds(10, 72, 150, 20);
		getContentPane().add(labelDireccion);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setBounds(160, 72, 120, 20);
		getContentPane().add(textFieldDireccion);
		
		JLabel labelCiudad = new JLabel("Ciudad: ");
		labelCiudad.setBounds(10, 103, 150, 20);
		getContentPane().add(labelCiudad);
		
		textFieldCiudad = new JTextField();
		textFieldCiudad.setBounds(160, 103, 120, 20);
		getContentPane().add(textFieldCiudad);
		
		JLabel labelProvincia = new JLabel("Provincia: ");
		labelProvincia.setBounds(10, 134, 150, 20);
		getContentPane().add(labelProvincia);
		
		textFieldProvincia = new JTextField();
		textFieldProvincia.setBounds(160, 134, 120, 20);
		getContentPane().add(textFieldProvincia);
		
		JButton mostrarDatosButton = new JButton("Mostrar Datos");
        mostrarDatosButton.setBounds(10, 165, 150, 30);
        getContentPane().add(mostrarDatosButton);
        
        

        mostrarDatosButton.addActionListener(e -> mostrarDatos());
		
		setLocationRelativeTo(null);
	}
	
	private void mostrarDatos() {
        String nombre= textFieldNombre.getText();
        String edad = textFieldEdad.getText();
        String direccion = textFieldDireccion.getText();
        String ciudad = textFieldCiudad.getText();
        String provincia = textFieldProvincia.getText();

        String mensaje = "Nombre: " + nombre + "\nEdad: " + edad + "\nDirección: " + direccion +
                "\nCiudad: " + ciudad + "\nProvincia: " + provincia;

        JOptionPane.showMessageDialog(this, mensaje, "Datos Introducidos", JOptionPane.INFORMATION_MESSAGE);
    }
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
			new EjercicioTextField().setVisible(true);
		});
	}
}
