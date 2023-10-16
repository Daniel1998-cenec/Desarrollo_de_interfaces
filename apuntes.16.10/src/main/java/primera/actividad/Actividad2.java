package primera.actividad;

import javax.swing.JOptionPane;

public class Actividad2 {

	public static void main(String[] args) {
		/*String respuesta=JOptionPane.showInputDialog(null, 
				"Dime tu nombre", "Datos personales",JOptionPane.QUESTION_MESSAGE);
		
		if (respuesta !=null) {
			System.out.println("Has pulsado ok, tu nombre es "+respuesta);
		}else {
			System.out.println("Le has dado a cancelar");
		}*/
		
		String nombre=JOptionPane.showInputDialog(null, "Dime tu nombre","Datos personales",JOptionPane.QUESTION_MESSAGE);
		
		if(nombre != null) {
			System.out.println("Felicidades has dicho tu nombre, "+nombre);
		}else {
			System.out.println("Le has dado a cancelar");
		}

	}

}
