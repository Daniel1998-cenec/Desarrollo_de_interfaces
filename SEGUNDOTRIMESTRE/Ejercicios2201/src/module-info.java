module EjerciciosUnidad5Controles {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ejercicio1 to javafx.graphics, javafx.fxml;
	opens ejercicio2 to javafx.graphics, javafx.fxml;
}
