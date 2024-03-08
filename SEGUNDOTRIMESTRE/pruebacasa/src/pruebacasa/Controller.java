package pruebacasa;

import java.sql.SQLException;
import java.util.List;


import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller {


    @FXML
    private TableView<Jugador> tableViewJugador;
    
    @FXML
    private TableColumn<Jugador, String> nombreColumn;

    
    @FXML
    private TableColumn<Jugador, Integer> nivelColumn;


    @FXML
    private TableColumn<Jugador, Integer> puntosColumn;


    @FXML
    private TableColumn<Jugador, String> amigoColumn;

    @FXML
    private TextField nombreTextField;
    
    @FXML
    private ChoiceBox<String> cmbNivel;

    @FXML
    private TextField puntosTextField;

    @FXML
    private TextField amigoTextField;

    @FXML
    private Button btnAgregarJugador;
    
    @FXML
    private Button btnLimpiarCampos;
    
    @FXML
    private Button btnBorrarJugador;

    private JugadorModel model;


    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        // Inicializa el modelo de la base de datos
        model = new JugadorModel(dbURL, dbUser, dbPassword);

        // Configura el botón de agregar juego
        btnAgregarJugador.setOnAction(event -> agregarJugador());

     // Configura las columnas de la TableView utiliza instrucciones tipo lambda, cada columna de la tabla le //corresponde un campo de la base de datos
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        nivelColumn.setCellValueFactory(cellData -> cellData.getValue().nivelProperty().asObject());
        puntosColumn.setCellValueFactory(cellData -> cellData.getValue().puntosProperty().asObject());
        amigoColumn.setCellValueFactory(cellData -> cellData.getValue().amigoProperty());
        
        
        // Configura los desplegables
        cargarNiveles();
        
        mostrarJugador();
        
    }


  
    private void cargarNiveles() {
        // Puedes obtener la lista de compañías desde la base de datos o definirla estáticamente
        // Por ahora, la definiremos estáticamente
        List<String> niveles = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");


        // Configura el ComboBox con las compañías
        cmbNivel.setItems(FXCollections.observableArrayList(niveles));
    }
    
    private void mostrarJugador() throws SQLException {
        // Limpiar la TableView antes de cargar nuevos datos
    	tableViewJugador.getItems().clear();


        List<Jugador> jugador = model.getAllJugador();
    
        // Agrega los datos a la TableView
        tableViewJugador.getItems().addAll(jugador);
    }



    @FXML
    private void agregarJugador() {
        // Obtener los valores de los campos de texto y desplegables
        String nombre = nombreTextField.getText();
        int nivel = Integer.parseInt(cmbNivel.getValue());
        int puntos = Integer.parseInt(puntosTextField.getText());
        String amigo = amigoTextField.getText();


        // Crear un nuevo TVideoJuego
        Jugador nuevoJugador = new Jugador(nombre, nivel, puntos, amigo);


        // Agregar el juego a la base de datos y actualizar la TableView
        try {
            model.addJugador(nuevoJugador);
          
        } catch (SQLException e) {
            e.printStackTrace();
       } 


        // Mostrar un mensaje indicando que el juego ha sido añadido
        String mensaje = "jugador añadido:\n" +
                "Nombre: " + nombre + "\n" +
                "Nivel: " + nivel + "\n" +
                "Puntos: " + puntos + "\n" +
                "Amigo: " + amigo + "\n";


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Jugador Añadido");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();


        // Limpiar los campos después de agregar el juego
        limpiarCampos();
    }

    @FXML
    private void limpiarCampos() {
        nombreTextField.clear();
        cmbNivel.setValue(null);
        puntosTextField.clear();
        amigoTextField.clear();
    }


    @FXML
    private void cerrarConexion() {
        // Cierra la conexión a la base de datos
        try {
            model.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void borrarRegistro() {
        String nombreJugador = nombreTextField.getText();
        try {
            model.borrarRegistro(nombreJugador);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Jugador borrado");
            alert.setHeaderText(null);
            alert.setContentText("ha borrado el jugador " + nombreJugador);
            alert.showAndWait();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        limpiarCampos();
    }
}