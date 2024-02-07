package Ejercicio7SegundoReto;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class EjercicioHilo extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("¡Hola soy Alberto desde JavaFX!");
        
        StackPane root = new StackPane(); //creamos un contenedor de diseño apilado es decir
        //crea un tipo de  nodo que permite agregar elementos como botones 
        root.getChildren().add(btn);

        // Crear y empezar un hilo simple
        Thread thread = new Thread(() -> {
            try {
                // Dormir el hilo por 3 segundos
                Thread.sleep(3000);

                // Después de 3 segundos, actualizar la interfaz gráfica
                Platform.runLater(() -> { //ejecuta un runnable en el hilo creado, es decir una tarea
                	//platform es una clase que permite la ejecució de codigo en el hilo de javafx
                    btn.setText("¡Hilo ejecutado en verdad!");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
     // Crear y empezar un hilo simple
        Thread thread2 = new Thread(() -> {
            try {
                // Dormir el hilo por 7 segundos
                Thread.sleep(7000);

                // Después de 3 segundos, actualizar la interfaz gráfica
                Platform.runLater(() -> { //ejecuta un runnable en el hilo creado, es decir una tarea
                	//platform es una clase que permite la ejecució de codigo en el hilo de javafx
                    btn.setText("¡Hilo ejecutado crack!");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
     // Crear y empezar un hilo simple
        Thread thread3 = new Thread(() -> {
            try {
                // Dormir el hilo por 10 segundos
                Thread.sleep(10000);

                // Después de 3 segundos, actualizar la interfaz gráfica
                Platform.runLater(() -> { //ejecuta un runnable en el hilo creado, es decir una tarea
                	//platform es una clase que permite la ejecució de codigo en el hilo de javafx
                    btn.setText("¡Hilo ejecutado mastodonte!");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
     // Crear y empezar un hilo simple
        Thread thread4 = new Thread(() -> {
            try {
                // Dormir el hilo por 20 segundos
                Thread.sleep(20000);

                // Después de 3 segundos, actualizar la interfaz gráfica
                Platform.runLater(() -> { //ejecuta un runnable en el hilo creado, es decir una tarea
                	//platform es una clase que permite la ejecució de codigo en el hilo de javafx
                    btn.setText("¡Hilo ejecutado se retira, hastaluigii!");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("JavaFX Ejemplo de hilos");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
