module Ejercicios {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics,  javafx.fxml;
	opens ejercicio1 to javafx.graphics, javafx.fxml;
	opens ejercicio2 to javafx.graphics, javafx.fxml;
	opens ejercicio3 to javafx.graphics, javafx.fxml;
	opens ejercicio4 to javafx.graphics, javafx.fxml;
	opens ejercicio5 to javafx.graphics, javafx.fxml;
	opens ejercicio6 to javafx.graphics, javafx.controls, javafx.fxml;
	opens ejercicio7 to javafx.graphics, javafx.controls, javafx.fxml;
}
