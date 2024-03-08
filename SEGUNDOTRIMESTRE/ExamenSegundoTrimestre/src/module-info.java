module ExamenDeSegundoTrimestr {
	
	requires javafx.controls;
	requires java.sql;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens examen to javafx.graphics, javafx.fxml;
}
