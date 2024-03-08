module preubaCasa {
	
	requires javafx.controls;
	requires java.sql;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens pruebacasa to javafx.graphics, javafx.fxml;
}
