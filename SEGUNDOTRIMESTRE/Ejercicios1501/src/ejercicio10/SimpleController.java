package ejercicio10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SimpleController {
	@FXML
	private Button BotonSalir, Boton1, Boton2, Boton3, Boton4, Boton5, Boton6, OpcionA, OpcionB, OpcionC, BotonAceptar, BotonCancelar;

	@FXML
	private void handleButtonClick(ActionEvent event) {
		String idBotonPulsado = ((Button) event.getSource()).getId();
		System.out.println("Botón pulsado: " + idBotonPulsado);

		switch (idBotonPulsado) {
		case "Boton Salir":
			System.out.println("¡Has pulsado un botón!");
			break;
		case "Boton 1":
			System.out.println("¡Has pulsado el botón 1!");
			break;
		case "Boton2":
			System.out.println("¡Has pulsado el botón 2!");
			break;
		case "Boton3":
			System.out.println("¡Has pulsado el botón 3!");
			break;
		case "Boton4":
			System.out.println("¡Has pulsado el botón 4!");
			break;
		case "Boton5":
			System.out.println("¡Has pulsado el botón 5!");
			break;
		case "Boton6":
			System.out.println("¡Has pulsado el botón 6!");
			break;
		case "Opcion1":
			System.out.println("¡Has pulsado la opcion 1!");
			break;
		case "Opcion2":
			System.out.println("¡Has pulsado la opcion 2!");
			break;
		case "Opcion3":
			System.out.println("¡Has pulsado la opcion 3!");
			break;
		case "OpcionA":
			System.out.println("¡Has pulsado la opcion A!");
			break;
		case "OpcionB":
			System.out.println("¡Has pulsado la opcion B!");
			break;
		case "OpcionC":
			System.out.println("¡Has pulsado la opcion C!");
			break;
		case "BotonAceptar":
			System.out.println("¡Has pulsado el botón Aceptar!");
			break;
		case "BotonCancelar":
			System.out.println("¡Has pulsado el botón cancelar!");
			break;
		case "BotonSalir":
			System.out.println("¡Has pulsado el botón salir!");
			break;
		default:
			System.out.println("Botón no reconocido");
			break;
		}
	}
}
