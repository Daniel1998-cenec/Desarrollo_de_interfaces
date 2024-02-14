package Ejercicio5Avanzado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


import java.sql.SQLException;
import java.util.List;



public class Controller {


    @FXML
    private TableView<Libro> tableViewLibro;
    
    @FXML
    private TableColumn<Libro, String> tituloColumn;


    @FXML
    private TableColumn<Libro, String> editorialColumn;


    @FXML
    private TableColumn<Libro, String> autorColumn;


    @FXML
    private TableColumn<Libro, Integer> paginasColumn;

    @FXML
    private TextField tituloTextField;
    
    @FXML
    private ChoiceBox<String> cmbEditorial;

    @FXML
    private TextField autorTextField;

    @FXML
    private TextField paginasTextField;

    @FXML
    private Button btnAgregarLibro;
    
    @FXML
    private Button btnLimpiarCampos;


    private LibroModel model;


    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        // Inicializa el modelo de la base de datos
        model = new LibroModel(dbURL, dbUser, dbPassword);

        // Configura el botón de agregar juego
        btnAgregarLibro.setOnAction(event -> agregarLibro());


        // Configura los desplegables
        cargarEditoriales();


        // Al inicializar el controlador, carga los juegos desde la base de datos
        
    }


  
    private void cargarEditoriales() {
        // Puedes obtener la lista de compañías desde la base de datos o definirla estáticamente
        // Por ahora, la definiremos estáticamente
        List<String> editoriales = List.of("Editorial Planeta", "Mondadori", "Siruela", "Anaya", "Anagrama", "Tusquets");


        // Configura el ComboBox con las compañías
        cmbEditorial.setItems(FXCollections.observableArrayList(editoriales));
    }



    @FXML
    private void agregarLibro() {
        // Obtener los valores de los campos de texto y desplegables
        String titulo = tituloTextField.getText();
        String editorial = cmbEditorial.getValue();
        String autor = autorTextField.getText();
        int paginas = Integer.parseInt(paginasTextField.getText());


        // Crear un nuevo TVideoJuego
        Libro nuevoLibro = new Libro(titulo, editorial, autor, paginas);


        // Agregar el juego a la base de datos y actualizar la TableView
        try {
            model.addLibro(nuevoLibro);
          
        } catch (SQLException e) {
            e.printStackTrace();
       } 


        // Mostrar un mensaje indicando que el juego ha sido añadido
        String mensaje = "libros añadido:\n" +
                "Titulo: " + titulo + "\n" +
                "Editorial: " + editorial + "\n" +
                "Autor: " + autor + "\n" +
                "Páginas: " + paginas + "\n";


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Libro Añadido");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();


        // Limpiar los campos después de agregar el juego
        limpiarCampos();
    }

    @FXML
    private void limpiarCampos() {
        tituloTextField.clear();
        cmbEditorial.setValue(null);
        autorTextField.clear();
        paginasTextField.clear();
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
        String nombreLibro = tituloTextField.getText();
        try {
            model.borrarRegistro(nombreLibro);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Juego borrado");
            alert.setHeaderText(null);
            alert.setContentText("ha borrado el libro " + nombreLibro);
            alert.showAndWait();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        limpiarCampos();
    }
}
