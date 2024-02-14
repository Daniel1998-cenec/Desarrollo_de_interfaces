package Ejercicio2;


import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


import java.sql.SQLException;
import java.util.List;


public class Controller {


    @FXML
    private TableView<Tienda> tableViewTienda;


    @FXML
    private TableColumn<Tienda, Integer> codigoColumn;


    @FXML
    private TableColumn<Tienda, String> nombreColumn;


    @FXML
    private TableColumn<Tienda, Double> precioColumn;


    @FXML
    private TableColumn<Tienda, Integer> codigo_FabricanteColumn;


    private TiendaModel model;


    public void inicializar(String dbURL, String dbUser, String dbPassword) throws SQLException {
        // Inicializa el modelo de la base de datos
        model = new TiendaModel(dbURL, dbUser, dbPassword);


        // Configura las columnas de la TableView utiliza instrucciones tipo lambda, cada columna de la tabla le //corresponde un campo de la base de datos
        codigoColumn.setCellValueFactory(cellData -> cellData.getValue().codigoProperty().asObject());
        nombreColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        precioColumn.setCellValueFactory(cellData -> cellData.getValue().precioProperty().asObject());
        codigo_FabricanteColumn.setCellValueFactory(cellData -> cellData.getValue().codigo_FabricanteProperty().asObject());
        


        // Al inicializar el controlador, carga los juegos desde la base de datos
        try {
            cargarTienda();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void cargarTienda() throws SQLException {
        // Limpiar la TableView antes de cargar nuevos datos
    	tableViewTienda.getItems().clear();


        List<Tienda> tienda = model.getAllTienda();
    
        // Agrega los datos a la TableView
        tableViewTienda.getItems().addAll(tienda);
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


