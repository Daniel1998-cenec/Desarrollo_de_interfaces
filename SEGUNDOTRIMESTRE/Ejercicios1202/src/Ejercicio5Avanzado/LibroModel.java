package Ejercicio5Avanzado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibroModel {
	
	private Connection conn;

	public LibroModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}
	public void addLibro(Libro nuevoLibro) throws SQLException {
	    String query = "INSERT INTO libros (titulo, editorial, autor, paginas) VALUES (?, ?, ?, ?)";


	    try (PreparedStatement stmt = conn.prepareStatement(query)) {
	        stmt.setString(1, nuevoLibro.getTitulo());
	        stmt.setString(2, nuevoLibro.getEditorial());
	        stmt.setString(3, nuevoLibro.getAutor());
	        stmt.setInt(4, nuevoLibro.getPaginas());
	        
	        stmt.executeUpdate();
	    }
	}
	
	public void close() throws SQLException {
		conn.close();
	}
	
	public void borrarRegistro(String titulo) throws SQLException {
        // Sentencia SQL para eliminar el registro con el nombre especificado
        String sql = "DELETE FROM libros WHERE titulo=?";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            // Establece el valor del parámetro en la sentencia preparada
            preparedStatement.setString(1, titulo);

            // Ejecuta la sentencia SQL para eliminar el registro
            int filasAfectadas = preparedStatement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Registro eliminado correctamente");
            } else {
                System.out.println("No se encontró el registro con el nombre especificado");
            }
        }
    }
}
	

