package examen;

import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	   

    @Override
    public void start(Stage primaryStage) throws Exception {
       
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Estudiante.fxml"));
        Parent root = loader.load();
        
        Scene scene= new Scene(root,900,500);
        String estilocss=getClass().getResource("Estilo.css").toExternalForm();
        scene.getStylesheets().add(estilocss);

        primaryStage.setTitle("Mi Aplicación JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Mueve la lógica de la base de datos al controlador
        String dbURL = "jdbc:mysql://localhost/Universidad";
        String dbUser = "root";
        String dbPassword = "";
        

        try {
            Controller controller = loader.getController();
            controller.inicializar(dbURL, dbUser, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}

