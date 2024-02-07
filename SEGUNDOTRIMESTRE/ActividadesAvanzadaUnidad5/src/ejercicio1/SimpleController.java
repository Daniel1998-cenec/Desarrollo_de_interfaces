package ejercicio1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SimpleController {
  
	@FXML
    private TextField displayField;
    
    private StringBuilder currentNumber = new StringBuilder();
    private double num = 0;
    private double num2 = 0;
    private String operador = "";
    
    @FXML
    private void handleButtonClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        String buttonText = button.getText();
        
        switch (buttonText) {
            case "C":
                clearDisplay();
                break;
            case ".":
                if (!currentNumber.toString().contains(".")) {
                    currentNumber.append(".");
                    displayField.setText(currentNumber.toString());
                }
                break;
            case "=":
                calculateResult();
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                if (!currentNumber.toString().isEmpty()) {
                	num = Double.parseDouble(currentNumber.toString());
                	operador = buttonText;
                    currentNumber.setLength(0);
                }
                break;
            default:
                currentNumber.append(buttonText);
                displayField.setText(currentNumber.toString());
                break;
        }
    }
    
    private void clearDisplay() {
        displayField.clear();
        currentNumber.setLength(0);
        num = 0;
        num2 = 0;
        operador = "";
    }
    
    private void calculateResult() {
        if (!currentNumber.toString().isEmpty()) {
        	num2 = Double.parseDouble(currentNumber.toString());
            double result = 0;
            switch (operador) {
                case "+":
                    result = num + num2;
                    break;
                case "-":
                    result = num - num2;
                    break;
                case "*":
                    result = num * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num / num2;
                    } else {
                        displayField.setText("Error: Division by zero");
                        return;
                    }
                    break;
            }
            displayField.setText(String.valueOf(result));
            currentNumber.setLength(0);
            currentNumber.append(result);
        }
    }
}
  
