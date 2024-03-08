package pruebacasa;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Jugador {
	private IntegerProperty id = new SimpleIntegerProperty();
	private StringProperty nombre = new SimpleStringProperty();
	private IntegerProperty nivel = new SimpleIntegerProperty();
	private IntegerProperty puntos = new SimpleIntegerProperty();
	private StringProperty amigo = new SimpleStringProperty();

	/*
	 public Videojuegos(int id, String nombre, int nivel, int puntos, String amigo) {
		
		thia.id.set(id);
		this.nombre.set(nombre);
		this.nivel.set(nivel);
		this.puntos.set(puntos);
		this.amigo.set(amigo);

	}
	 */

	public Jugador(String nombre, int nivel, int puntos, String amigo) {

		this.nombre.set(nombre);
		this.nivel.set(nivel);
		this.puntos.set(puntos);
		this.amigo.set(amigo);

	}
	
	public int getID() {
		return id.get();
	}

	public IntegerProperty IDProperty() {
		return id;
	}

	public void setID(int id) {
		this.id.set(id);
	}
	
	public String getNombre() {
		return nombre.get();
	}

	public StringProperty nombreProperty() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre.set(nombre);
	}
	
	public int getNivel() {
		return nivel.get();
	}

	public IntegerProperty nivelProperty() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel.set(nivel);
	}
	
	public int getPuntos() {
		return puntos.get();
	}

	public IntegerProperty puntosProperty() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos.set(puntos);
	}
	
	public String getAmigo() {
		return amigo.get();
	}

	public StringProperty amigoProperty() {
		return amigo;
	}

	public void setAmigo(String amigo) {
		this.amigo.set(amigo);
	}


}