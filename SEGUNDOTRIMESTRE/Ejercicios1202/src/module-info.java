module Ejercicios1202JavaFXBBDD {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires java.base;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens Ejercicio1 to javafx.graphics, javafx.fxml;
	opens Ejercicio2 to javafx.graphics, javafx.fxml;
	opens Ejercicio3 to javafx.graphics, javafx.fxml;
	opens Ejercicio4Avanzado to javafx.graphics, javafx.fxml;
	opens Ejercicio5Avanzado to javafx.graphics, javafx.fxml;
}
