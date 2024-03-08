package examen;

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
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {


    @FXML
    private TableView<Estudiante> tableViewEstudiante;
    
    @FXML
    private TableColumn<Estudiante, Integer> IDColumn;

    
    @FXML
    private TableColumn<Estudiante, String> nombreColumn;


    @FXML
    private TableColumn<Estudiante, String> correoElectronicoColumn;


    @FXML
    private TableColumn<Estudiante, String> telefonoColumn;
    
    @FXML
    private TableColumn<Estudiante, String> cursoColumn;
    
    @FXML
    private TableColumn<Estudiante, String> fechaInscripcionColumn;

    @FXML
    private TextField nombreTextField;
    
    @FXML
    private TextField correoElectronicoTextField;

    @FXML
    private TextField telefonoTextField;

    @FXML
    private TextField cursoTextField;
    
    @FXML
    private TextField fechaInscripcionTextField;


    @FXML
    private Button btnAgregarEstudiante;
    
    @FXML
    private Button btnMostrar;
    
    @FXML
    private Button btnBorrarJugador;

    private EstudianteModel model;


    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        // Inicializa el modelo de la base de datos
        model = new EstudianteModel(dbURL, dbUser, dbPassword);

        // Configura el botón de agregar juego
        btnAgregarEstudiante.setOnAction(event -> agregarEstudiante());

     // Configura las columnas de la TableView utiliza instrucciones tipo lambda, cada columna de la tabla le //corresponde un campo de la base de datos
        IDColumn.setCellValueFactory(cellData -> cellData.getValue().IDProperty().asObject());
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        correoElectronicoColumn.setCellValueFactory(cellData -> cellData.getValue().correoElectronicoProperty());
        telefonoColumn.setCellValueFactory(cellData -> cellData.getValue().telefonoProperty());
        cursoColumn.setCellValueFactory(cellData -> cellData.getValue().cursoProperty());
        fechaInscripcionColumn.setCellValueFactory(cellData -> cellData.getValue().fechaInscripcionProperty());
        
        // Configura los desplegables
        
        mostrarEstudiante();
        
    }

    @FXML
    private void mostrarEstudiante() throws SQLException {
        // Limpiar la TableView antes de cargar nuevos datos
    	tableViewEstudiante.getItems().clear();


        List<Estudiante> estudiante = model.getAllEstudiante();
    
        // Agrega los datos a la TableView
        tableViewEstudiante.getItems().addAll(estudiante);
    }



    @FXML
    private void agregarEstudiante() {
        // Obtener los valores de los campos de texto y desplegables
        String nombre = nombreTextField.getText();
        String correoElectronico = correoElectronicoTextField.getText();
        String telefono = telefonoTextField.getText();
        String curso = cursoTextField.getText();
        String fechaInscripcion = fechaInscripcionTextField.getText();

        // Crear un nuevo TVideoJuego
        Estudiante nuevoEstudiante = new Estudiante(nombre, correoElectronico, telefono, curso, fechaInscripcion);


        // Agregar el juego a la base de datos y actualizar la TableView
        try {
            model.addEstudiante(nuevoEstudiante);
          
        } catch (SQLException e) {
            e.printStackTrace();
       } 


        // Mostrar un mensaje indicando que el juego ha sido añadido
        String mensaje = "estudiante añadido:\n" +
                "nombre: " + nombre + "\n" +
                "correo electronico: " + correoElectronico + "\n" +
                "telefono: " + telefono + "\n" +
                "curso: " + curso + "\n"+
                "fecha Inscripcion: " + fechaInscripcion;


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Jugador Añadido");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
        
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
    }
}