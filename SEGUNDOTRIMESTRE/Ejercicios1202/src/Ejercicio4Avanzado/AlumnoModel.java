package Ejercicio4Avanzado;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Ejercicio2.Tienda;

public class AlumnoModel {
	private Connection conn;

	public AlumnoModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public List<Alumno> getAllAlumno() throws SQLException {
		List<Alumno> alumno = new ArrayList<>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM alumno");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String nombre = rs.getString("nombre");
			String apellido1 = rs.getString("apellido1");
			String apellido2 = rs.getString("apellido2");
			Date fecha_nacimiento = rs.getDate("fecha_nacimiento");
			String es_repetidor = rs.getString("es_repetidor");
			int teléfono = rs.getInt("teléfono");
			
			alumno.add(new Alumno(id, nombre, apellido1, apellido2, fecha_nacimiento, es_repetidor, teléfono));
		}
		stmt.close();
		rs.close();
		return alumno;
	}

	public void close() throws SQLException {
		conn.close();
	}
}
