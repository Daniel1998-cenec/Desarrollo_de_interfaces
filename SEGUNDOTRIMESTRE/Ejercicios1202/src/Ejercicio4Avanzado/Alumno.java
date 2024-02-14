package Ejercicio4Avanzado;

import java.util.Date;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Alumno {
	 private IntegerProperty id = new SimpleIntegerProperty();
	    private StringProperty nombre = new SimpleStringProperty();
	    private StringProperty apellido1 = new SimpleStringProperty();
	    private StringProperty apellido2 = new SimpleStringProperty();
	    private ObjectProperty<Date> fecha_nacimiento = new SimpleObjectProperty<>();
	    private StringProperty es_repetidor = new SimpleStringProperty();
	    private IntegerProperty teléfono = new SimpleIntegerProperty();
	    
	    public Alumno(int id, String nombre, String apellido1, String apellido2, Date fecha_nacimiento, String es_repetidor, int teléfono) {
			this.id.set(id);
	        this.nombre.set(nombre);
	        this.apellido1.set(apellido1);
	        this.apellido2.set(apellido2);
	        this.fecha_nacimiento.set(fecha_nacimiento);
	        this.es_repetidor.set(es_repetidor);
	        this.teléfono.set(teléfono);
		}

		public int getId() {
			return id.get();
		}

		public void setId(int id) {
			this.id.set(id);
		}
		
		public IntegerProperty idProperty() {
	        return id;
	    }

		public String getNombre() {
			return nombre.get();
		}

		public void setNombre(String nombre) {
			this.nombre.set(nombre);
		}
		
		public StringProperty nombreProperty() {
	        return nombre;
	    }

		public String getApellido1() {
			return apellido1.get();
		}

		public void setApellido1(String apellido1) {
			this.apellido1.set(apellido1);
		}
		
		public StringProperty apellido1Property() {
	        return apellido1;
	    }

		public String getApellido2() {
			return apellido2.get();
		}

		public void setApellido2(String apellido2) {
			this.apellido2.set(apellido2);
		}
		
		public StringProperty apellido2Property() {
	        return apellido2;
	    }

		public Date getFecha_nacimiento() {
			return fecha_nacimiento.get();
		}

		public void setFecha_nacimiento(Date fecha_nacimiento) {
			this.fecha_nacimiento.set(fecha_nacimiento);
		}
		
		public ObjectProperty<Date> fecha_nacimientoProperty() {
	        return fecha_nacimiento;
	    }

		public String getEs_repetidor() {
			return es_repetidor.get();
		}

		public void setEs_repetidor(String es_repetidor) {
			this.es_repetidor.set(es_repetidor);
		}
		
		public StringProperty es_repetidorProperty() {
	        return es_repetidor;
	    }

		public int getTeléfono() {
			return teléfono.get();
		}

		public void setTeléfono(int teléfono) {
			this.teléfono.set(teléfono);
		}
		
		public IntegerProperty teléfonoProperty() {
	        return teléfono;
	    }
	    
	    
	    
}