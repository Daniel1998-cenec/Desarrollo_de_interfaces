package examen;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EstudianteModel {
	
	private Connection conn;

	public EstudianteModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}
	public void addEstudiante(Estudiante nuevoEstudiante) throws SQLException {
	    String query = "INSERT INTO estudiante (nombre, correoElectronico, telefono, curso, fechaInscripcion) VALUES (?, ?, ?, ?, ?)";


	    try (PreparedStatement stmt = conn.prepareStatement(query)) {
	        stmt.setString(1, nuevoEstudiante.getNombre());
	        stmt.setString(2, nuevoEstudiante.getCorreoElectronico());
	        stmt.setString(3, nuevoEstudiante.getTelefono());
	        stmt.setString(4, nuevoEstudiante.getCurso());
	        stmt.setString(5, nuevoEstudiante.getFechaInscripcion());
	        
	        stmt.executeUpdate();
	    }
	}
	
	public void close() throws SQLException {
		conn.close();
	}
	
	public void borrarRegistro(String nombre) throws SQLException {
        // Sentencia SQL para eliminar el registro con el nombre especificado
        String sql = "DELETE FROM estudiante WHERE nombre=?";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            // Establece el valor del parámetro en la sentencia preparada
            preparedStatement.setString(1, nombre);

            // Ejecuta la sentencia SQL para eliminar el registro
            int filasAfectadas = preparedStatement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Registro eliminado correctamente");
            } else {
                System.out.println("No se encontró el registro con el nombre especificado");
            }
        }
    }
	
	public List<Estudiante> getAllEstudiante() throws SQLException {
		List<Estudiante> estudiante = new ArrayList<>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM estudiante");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			String correoElectronico = rs.getString("correoElectronico");
			String telefono = rs.getString("telefono");
			String curso = rs.getString("curso");
			String fechaInscripcion = rs.getString("fechaInscripcion");
			
			estudiante.add(new Estudiante(id, nombre, correoElectronico, telefono, curso, fechaInscripcion));
		}
		
		stmt.close();
		rs.close();
		return estudiante;
	}
	
}