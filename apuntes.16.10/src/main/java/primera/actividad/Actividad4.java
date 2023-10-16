package primera.actividad;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Actividad4 {

	public static void main(String[] args) {
		// Configurar los textos de los botones en español

		UIManager.put("OptionPane.yesButtonText", "Sí");
		UIManager.put("OptionPane.noButtonText", "No");

		// Crea un JOptionPane con los botones en español
		int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres continuar?", "Continuar", JOptionPane.YES_NO_OPTION);
		if (opcion == JOptionPane.YES_OPTION) {
			JOptionPane.showConfirmDialog(null, "Has elegido Sí.");
		} else if (opcion == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Has elegido No.");
		}
	}

}
