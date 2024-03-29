package Ejercicio7SegundoReto;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ejercicio10Hilo2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("¡Hola desde JavaFX en verdad!");
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Hilo 1
        Thread thread1 = new Thread(() -> {
            try {
                // Dormir el hilo por 2 segundos
                Thread.sleep(2000);

                // Después de 2 segundos, actualizar la interfaz gráfica
                Platform.runLater(() -> {
                    btn.setText("¡Hilo 1 ejecutado to wapo!");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Hilo 2
        Thread thread2 = new Thread(() -> {
            try {
                // Dormir el hilo por 4 segundos
                Thread.sleep(4000);

                // Después de 4 segundos, actualizar la interfaz gráfica
                Platform.runLater(() -> {
                    btn.setText("¡Hilo 2 ejecutado no vea ave!");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Hilo 3
        Thread thread3 = new Thread(() -> {
            try {
                // Dormir el hilo por 6 segundos
                Thread.sleep(6000);

                // Después de 6 segundos, actualizar la interfaz gráfica
                Platform.runLater(() -> {
                    btn.setText("¡Hilo 3 ejecutado canio!");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
     // Hilo 4
        Thread thread4 = new Thread(() -> {
            try {
                // Dormir el hilo por 10 segundos
                Thread.sleep(10000);

                // Después de 6 segundos, actualizar la interfaz gráfica
                Platform.runLater(() -> {
                    btn.setText("¡Hilo 4 ejecutado pendejo!");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
     // Hilo 5
        Thread thread5 = new Thread(() -> {
            try {
                // Dormir el hilo por 15 segundos
                Thread.sleep(15000);

                // Después de 6 segundos, actualizar la interfaz gráfica
                Platform.runLater(() -> {
                    btn.setText("¡Hilo 5 ejecutado anormal!");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
     // Hilo 6
        Thread thread6 = new Thread(() -> {
            try {
                // Dormir el hilo por 20 segundos
                Thread.sleep(20000);

                // Después de 6 segundos, actualizar la interfaz gráfica
                Platform.runLater(() -> {
                    btn.setText("¡Hilo 6 ejecutado, irene!");
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Iniciar los hilos
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("JavaFX Thread ejemplo con muchoas hilos");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
