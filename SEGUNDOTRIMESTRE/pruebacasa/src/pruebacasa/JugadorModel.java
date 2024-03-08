package pruebacasa;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class JugadorModel {
	
	private Connection conn;

	public JugadorModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}
	public void addJugador(Jugador nuevoJugador) throws SQLException {
	    String query = "INSERT INTO jugador (nombre, nivel, puntos, amigo) VALUES (?, ?, ?, ?)";


	    try (PreparedStatement stmt = conn.prepareStatement(query)) {
	        stmt.setString(1, nuevoJugador.getNombre());
	        stmt.setInt(2, nuevoJugador.getNivel());
	        stmt.setInt(3, nuevoJugador.getPuntos());
	        stmt.setString(4, nuevoJugador.getAmigo());
	        
	        stmt.executeUpdate();
	    }
	}
	
	public void close() throws SQLException {
		conn.close();
	}
	
	public void borrarRegistro(String nombre) throws SQLException {
        // Sentencia SQL para eliminar el registro con el nombre especificado
        String sql = "DELETE FROM jugador WHERE nombre=?";

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
	
	public List<Jugador> getAllJugador() throws SQLException {
		List<Jugador> jugador = new ArrayList<>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM jugador");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			int nivel = rs.getInt("nivel");
			int puntos = rs.getInt("puntos");
			String amigo = rs.getString("amigo");
			
			jugador.add(new Jugador(nombre, nivel, puntos, amigo));
		}
		
		stmt.close();
		rs.close();
		return jugador;
	}
	
}