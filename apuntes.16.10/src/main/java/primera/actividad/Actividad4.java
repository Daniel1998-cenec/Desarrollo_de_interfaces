package primera.actividad;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Actividad4 {

	public static void main(String[] args) {
		// Configurar los textos de los botones en español

		UIManager.put("OptionPane.yesButtonText", "siiiiii");
		UIManager.put("OptionPane.noButtonText","noooooo");
		UIManager.put("OptionPane.cancelButtonText", "que no quiero hostias");
		UIManager.put("OptionPane.okButtonText", "okeeey:)");
		
		int opcion=JOptionPane.showConfirmDialog(null, "¿Quieres churritos de chocolate nena?","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
		
		if(opcion==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null,"Has elegido siiiiii","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
		}else if(opcion==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Has elegido noooooo","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Has elegido que no quiero hostias","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
