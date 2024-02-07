module ActividadesAvanzada {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ejercicio1 to javafx.graphics, javafx.fxml;
	opens ejercicio2 to javafx.graphics, javafx.fxml;
	opens ejercicio3 to javafx.graphics, javafx.fxml;
}
