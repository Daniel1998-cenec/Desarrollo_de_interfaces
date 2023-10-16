package primera.actividad;

import javax.swing.JOptionPane;

public class Actividad5 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Bienvenido jugador");
		boolean juegoTerminado=false;
		
		do {
			int opcion =JOptionPane.showConfirmDialog(null, "¿Te quieres registar?","Continuar", JOptionPane.YES_NO_OPTION);
			if (opcion == JOptionPane.YES_OPTION) {
				String nombre=JOptionPane.showInputDialog(null,"Dime como te llamas");
				if(nombre!=null) {
					JOptionPane.showMessageDialog(null, "Felicidades tu nombre es, "+nombre);
				}else {
					JOptionPane.showMessageDialog(null, "Le has dado al boton cancelar");
					break;
				}
				
				if(nombre==" ") {
					JOptionPane.showMessageDialog(null, "Tu "+nombre+" no puede estar vacio");
					juegoTerminado=false;
				}else {
					String edad=JOptionPane.showInputDialog(null,"Dime cuantos años tienes");
					if(edad!=null) {
						JOptionPane.showMessageDialog(null, "Felicidades tu edad es, "+edad);
					}else {
						JOptionPane.showMessageDialog(null, "Le has dado al boton cancelar");
						break;
					}
					JOptionPane.showMessageDialog(null, "El nombre del usuario es, "+nombre+
							" y su edad es, "+edad);
				}	
			} else if (opcion == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Has elegido No.");
			}	
			
		}while(juegoTerminado);
	}
}

//Sin terminar.
