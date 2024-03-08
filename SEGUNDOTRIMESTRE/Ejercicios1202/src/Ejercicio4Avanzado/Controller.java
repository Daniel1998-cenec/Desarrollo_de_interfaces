package Ejercicio4Avanzado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


import java.sql.SQLException;
import java.util.Date;
import java.util.List;

;


public class Controller {


    @FXML
    private TableView<Alumno> tableViewAlumno;


    @FXML
    private TableColumn<Alumno, Integer> idColumn;


    @FXML
    private TableColumn<Alumno, String> nombreColumn;


    @FXML
    private TableColumn<Alumno, String> apellido1Column;


    @FXML
    private TableColumn<Alumno, String> apellido2Column;


    @FXML
    private TableColumn<Alumno, Date> fecha_nacimientoColumn;


    @FXML
    private TableColumn<Alumno, Integer> teléfonoColumn;


    private AlumnoModel model;


    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        // Inicializa el modelo de la base de datos
        model = new AlumnoModel(dbURL, dbUser, dbPassword);


        // Configura las columnas de la TableView utiliza instrucciones tipo lambda, cada columna de la tabla le //corresponde un campo de la base de datos
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        apellido1Column.setCellValueFactory(cellData -> cellData.getValue().apellido1Property());
        apellido2Column.setCellValueFactory(cellData -> cellData.getValue().apellido2Property());
        fecha_nacimientoColumn.setCellValueFactory(cellData -> cellData.getValue().fecha_nacimientoProperty());
        teléfonoColumn.setCellValueFactory(cellData -> cellData.getValue().teléfonoProperty().asObject());

        // Al inicializar el controlador, carga los juegos desde la base de datos
        try {
            cargarAlumno();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void cargarAlumno() throws SQLException {
        // Limpiar la TableView antes de cargar nuevos datos
    	tableViewAlumno.getItems().clear();


        List<Alumno> alumno = model.getAllAlumno();
    
        // Agrega los datos a la TableView
        tableViewAlumno.getItems().addAll(alumno);
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
}