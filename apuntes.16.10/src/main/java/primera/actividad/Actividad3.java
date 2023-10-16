package primera.actividad;

import javax.swing.JOptionPane;

public class Actividad3 {

	public static void main(String[] args) {
		/*int codigo = JOptionPane.showConfirmDialog(null, "¿Quieres un euro para una buena causa?", "Donacion",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

		if (codigo == JOptionPane.YES_OPTION) {
			System.out.println("Has pulsado SI");
		} else if (codigo == JOptionPane.NO_OPTION) {
			System.out.println("Has pulsado en NO");
		} else {
			System.out.println("Has pulsado el boton cancelar");
		}*/
		
		int codigo=JOptionPane.showConfirmDialog(null, "¿Quieres un eurillo, amigo?","Donacion",
				JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
		if(codigo==JOptionPane.YES_OPTION) {
			System.out.println("Le has dado a SI");
		} else if(codigo==JOptionPane.NO_OPTION) {
			System.out.println("Le has dado a NO");
		}else {
			System.out.println("Le has dado al boton cancelar");
		}

	}

}
