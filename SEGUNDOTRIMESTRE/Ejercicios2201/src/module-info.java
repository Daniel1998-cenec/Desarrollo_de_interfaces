module EjerciciosUnidad5Controles {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ejercicio1 to javafx.graphics, javafx.fxml;
	opens ejercicio2 to javafx.graphics, javafx.fxml;
	opens ejercicio34y5 to javafx.graphics, javafx.fxml;
	opens ejercicio6 to javafx.graphics, javafx.fxml;
}
