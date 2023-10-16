package primera.actividad;

import javax.swing.JOptionPane;

public class Actividad5 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Bienvenido jugador");
		boolean juegoTerminado=false;
		
		do {
			String nombre=JOptionPane.showInputDialog(null,"Dime como te llamas");
			if(nombre==null) {
				JOptionPane.showMessageDialog(null, "Le has dado al boton cancelar");
				break;
			}
			String edad=JOptionPane.showInputDialog(null,"Dime cuantos años tienes");
		}while(!juegoTerminado);
	}
}
