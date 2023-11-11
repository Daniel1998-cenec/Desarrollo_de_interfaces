package primera.actividad;

import javax.swing.JOptionPane;

public class Actividad5 {

	public static void main(String[] args) {
		String nombre = "";
		int respuesta;
		String respuestaNumero="";
		int respuestaCuestionario;

		do {
			respuesta = JOptionPane.showConfirmDialog(null, "¿Te quieres registrar?", "Nota informativa",
					JOptionPane.INFORMATION_MESSAGE);

			if (respuesta == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Perfecto", "Nota informativa", JOptionPane.INFORMATION_MESSAGE);

				nombre = JOptionPane.showInputDialog(null, "Dime un nombre", "Cuestionario",
						JOptionPane.INFORMATION_MESSAGE);

				if (nombre == null) {
					JOptionPane.showMessageDialog(null, "Le has dado a cancelar", "Nota informativa",
							JOptionPane.INFORMATION_MESSAGE);
					return;
				} else if (nombre.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No puede ir el nombre vacío :(", "Nota informativa",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Bienvenido jugador, " + nombre, "Mensaje informativo",
							JOptionPane.INFORMATION_MESSAGE);
					respuestaNumero=JOptionPane.showInputDialog(null, "Dime tu edad","Cuestionario",JOptionPane.INFORMATION_MESSAGE);
					
					if(respuestaNumero==null) {
						JOptionPane.showMessageDialog(null, "Le has dado a cancelar", "Nota informativa",
								JOptionPane.INFORMATION_MESSAGE);
						return;
					}else if(respuestaNumero.isEmpty()) {
						JOptionPane.showMessageDialog(null, "No puede ir el tu edad vacío :(", "Nota informativa",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						respuestaCuestionario=JOptionPane.showConfirmDialog(null,"¿Tu nombre es "+nombre+" y tu edad son "+respuestaNumero+" años?","Nota informativa", JOptionPane.ERROR_MESSAGE);
						
						if(respuestaCuestionario==JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Felicidades has completado el registro", "logeado con exito", JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "Vaya has introducido mal tus datos personales", "No has podido logearte", JOptionPane.INFORMATION_MESSAGE);
						}
					}
				}

			} else if (respuesta == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "vaya :C", "Nota informativa", JOptionPane.INFORMATION_MESSAGE);
				return;
			} else {
				JOptionPane.showMessageDialog(null, "Has salido del registro", "Nota informativa",
						JOptionPane.INFORMATION_MESSAGE);
				return;
			}

		} while (nombre.isEmpty() || respuestaNumero.isEmpty());

	}

}
