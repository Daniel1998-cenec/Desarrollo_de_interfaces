package Ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class TiendaModel {
	private Connection conn;

	public TiendaModel(String dbURL, String dbUser, String dbPassword) throws SQLException {
		conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
	}

	public List<Tienda> getAllTienda() throws SQLException {
		List<Tienda> tienda = new ArrayList<>();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM producto");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int codigo = rs.getInt("codigo");
			String nombre = rs.getString("nombre");
			double precio = rs.getDouble("precio");
			int codigo_fabricante = rs.getInt("codigo_fabricante");
			
			tienda.add(new Tienda(codigo, nombre, precio, codigo_fabricante));
		}
		stmt.close();
		rs.close();
		return tienda;
	}

	public void close() throws SQLException {
		conn.close();
	}
}
