package ejercicio2;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class SimpleController {


    @FXML
    private TextField operador1TextField;


    @FXML
    private Label resultadoLabel;

    //SUMAR IVA
    
    /*@FXML
    private void Iva4() {
        // Lógica para calcular el IVA del 4%
        double operando1 = Double.parseDouble(operador1TextField.getText());
        double iva = operando1 * 0.04;
        double resultadoTotal = operando1 + iva;
        resultadoLabel.setText("Resultado: " + resultadoTotal);
    }

    @FXML
    private void Iva10() {
        // Lógica para calcular el IVA del 10%
        double operando1 = Double.parseDouble(operador1TextField.getText());
        double iva = operando1 * 0.10;
        double resultadoTotal = operando1 + iva;
        resultadoLabel.setText("Resultado: " + resultadoTotal);
    }

    @FXML
    private void Iva21() {
        // Lógica para calcular el IVA del 21%
        double operando1 = Double.parseDouble(operador1TextField.getText());
        double iva = operando1 * 0.21;
        double resultadoTotal = operando1 + iva;
        resultadoLabel.setText("Resultado: " + resultadoTotal);
    }*/
    
    //DEDUCIR EL IVA
    
    @FXML
    private void Iva4() {
        // Lógica para deducir el IVA del 4%
        double valorTotal = Double.parseDouble(operador1TextField.getText());
        double porcentajeIva = 4.0;
        
        // Calcula el valor original deduciendo el IVA
        double valorOriginal = valorTotal / (1 + (porcentajeIva / 100.0));
        
        resultadoLabel.setText("Resultado: " + valorOriginal);
    }

    @FXML
    private void Iva10() {
        // Lógica para deducir el IVA del 10%
        double valorTotal = Double.parseDouble(operador1TextField.getText());
        double porcentajeIva = 10.0;
        
        // Calcula el valor original deduciendo el IVA
        double valorOriginal = valorTotal / (1 + (porcentajeIva / 100.0));
        
        resultadoLabel.setText("Resultado: " + valorOriginal);
    }

    @FXML
    private void Iva21() {
        // Lógica para deducir el IVA del 21%
        double valorTotal = Double.parseDouble(operador1TextField.getText());
        double porcentajeIva = 21.0;
        
        // Calcula el valor original deduciendo el IVA
        double valorOriginal = valorTotal / (1 + (porcentajeIva / 100.0));
        
        resultadoLabel.setText("Resultado: " + valorOriginal);
    }


    @FXML
    private void limpiar() {
        // Lógica para limpiar los campos
        operador1TextField.clear();
        resultadoLabel.setText("Resultado: ");
    }


    @FXML
    private void salir() {
        // Lógica para cerrar la aplicación
        System.exit(0);
    }
}

