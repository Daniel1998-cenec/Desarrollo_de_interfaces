package primera.actividad;

import javax.swing.JOptionPane;

public class Actividad5 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Bienvenido jugador");
		boolean juegoTerminado = false;

		while (!juegoTerminado) {
			int opcion = JOptionPane.showConfirmDialog(null, "¿Te quieres registrar?", "Continuar",
					JOptionPane.YES_NO_OPTION);

			if (opcion == JOptionPane.YES_OPTION) {

				String nombre = JOptionPane.showInputDialog(null, "Dime como te llamas");

				if (nombre != null) {
					if (!nombre.isEmpty()) {
						String edad;
						boolean soloNumero = false;

						do {
							edad = JOptionPane.showInputDialog(null, "Dime qué edad tienes");

							if (edad != null) {
								if (!edad.isEmpty()) {
									try {
										// Intenta convertir la entrada en un número
										int edadNum = Integer.parseInt(edad);

										// Si se convierte correctamente, marca la entrada como válida
										soloNumero = true;

										JOptionPane.showMessageDialog(null,
												"Felicidades, tu nombre es, " + nombre + ", y tu edad es, " + edad);
										JOptionPane.showMessageDialog(null, "Te has registrado con éxito");
										juegoTerminado = true;

									} catch (NumberFormatException e) {
										// La entrada no es un número válido
										JOptionPane.showMessageDialog(null,
												"Debes ingresar un número válido para la edad.");
									}
								} else {
									JOptionPane.showMessageDialog(null, "La edad no puede estar vacía");
								}
							} else {
								JOptionPane.showMessageDialog(null, "Has cancelado el registro :(");
								juegoTerminado = true;
								break;
							}

						} while (!soloNumero); // Repite el bucle hasta que se proporcione una entrada válida
					} else {
						JOptionPane.showMessageDialog(null, "El nombre no puede estar vacío");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Has cancelado el registro :(");
					juegoTerminado = true;
				}

			} else {
				JOptionPane.showMessageDialog(null, "No te has querido registrar :(");
				juegoTerminado = true;
			}
		}
	}
}

//Sin terminar.
