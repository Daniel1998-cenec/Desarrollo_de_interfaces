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
		
		//showConfirmDialog crea un panel de si, no, cancelar.
		
		int codigo=JOptionPane.showConfirmDialog(null, "¿Quieres un eurillo, amigo?","Donacion",
				JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
		if(codigo==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null,"Felicidades le has dado al boton sí","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
		} else if(codigo==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null,"Felicidades le has dado al boton no","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null,"Felicidades le has dado al boton cancelar","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
