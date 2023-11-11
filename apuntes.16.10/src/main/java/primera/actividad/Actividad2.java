package primera.actividad;

import javax.swing.JOptionPane;

public class Actividad2 {

	public static void main(String[] args) {
		// Actividad 2.1
		String respuesta;
		do {
			respuesta = JOptionPane.showInputDialog(null, "Dime tu nombre", "Datos personales",
					JOptionPane.QUESTION_MESSAGE);

			if (respuesta == null) {
				JOptionPane.showMessageDialog(null, "Le has dado al botón de cancelar", "Mensaje informativo",
						JOptionPane.INFORMATION_MESSAGE);
				return;
				
			} else if (respuesta.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "No puede ir vacío, debes poner tu nombre", "Mensaje informativo",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "¡Felicidades! Tu nombre es, " + respuesta, "Mensaje informativo",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} while (respuesta == null || respuesta.trim().isEmpty());

		// Termina el bucle poniendo si o si un nombre.
		
		//Repetir ejercicio
		
		/*String respuesta;
		do {
			respuesta=JOptionPane.showInputDialog(null,"Dime tu nombre","Datos personales", JOptionPane.INFORMATION_MESSAGE);
			
			if (respuesta ==null) {
				JOptionPane.showMessageDialog(null, "Le has dado al boton cancelar", "Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
			} else if (respuesta.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No puede ir vacío, debes poner tu nombre", "Mensaje informativo",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Felicidades tu nombre es, "+respuesta,"Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
			}
		}while(respuesta ==null || respuesta.isEmpty());*/
	}

}
