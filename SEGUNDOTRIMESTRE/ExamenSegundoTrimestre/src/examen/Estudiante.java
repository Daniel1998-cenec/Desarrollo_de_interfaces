package examen;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Estudiante {
	
	private IntegerProperty id = new SimpleIntegerProperty();
	private StringProperty nombre = new SimpleStringProperty();
	private StringProperty correoElectronico = new SimpleStringProperty();
	private StringProperty telefono = new SimpleStringProperty();
	private StringProperty curso = new SimpleStringProperty();
	private StringProperty fechaInscripcion = new SimpleStringProperty();
	
	public Estudiante(int id, String nombre, String correoElectronico, String telefono, String curso, String fechaInscripcion) {

		this.id.set(id);
		this.nombre.set(nombre);
		this.correoElectronico.set(correoElectronico);
		this.telefono.set(telefono);
		this.curso.set(curso);
		this.fechaInscripcion.set(fechaInscripcion);

	}

	public Estudiante(String nombre, String correoElectronico, String telefono, String curso, String fechaInscripcion) {

		this.nombre.set(nombre);
		this.correoElectronico.set(correoElectronico);
		this.telefono.set(telefono);
		this.curso.set(curso);
		this.fechaInscripcion.set(fechaInscripcion);

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
	
	public String getCorreoElectronico() {
		return correoElectronico.get();
	}
	
	public StringProperty correoElectronicoProperty() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico.set(correoElectronico);
	}
	
	public String getTelefono() {
		return telefono.get();
	}

	public StringProperty telefonoProperty() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono.set(telefono);
	}
	
	public String getCurso() {
		return curso.get();
	}
	
	public StringProperty cursoProperty() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso.set(curso);
	}
	
	public String getFechaInscripcion() {
		return fechaInscripcion.get();
	}
	
	public StringProperty fechaInscripcionProperty() {
		return fechaInscripcion;
	}

	public void setFechaInscripcion(String fechaInscripcion) {
		this.fechaInscripcion.set(fechaInscripcion);
	}
}