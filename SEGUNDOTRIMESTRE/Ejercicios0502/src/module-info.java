module EjerciciosUnidad5Controles {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ejercicio1 to javafx.graphics, javafx.fxml;
	opens ejercicio2 to javafx.graphics, javafx.fxml;
	opens ejercicio3 to javafx.graphics, javafx.fxml;
	opens ejercicio4 to javafx.graphics, javafx.fxml;
	opens ejercicio5 to javafx.graphics, javafx.fxml;
	opens ejercicio6 to javafx.graphics, javafx.fxml;
	opens ejercicio7Reto to javafx.graphics, javafx.fxml;
	opens Ejercicio7SegundoReto to javafx.graphics, javafx.fxml;
}
