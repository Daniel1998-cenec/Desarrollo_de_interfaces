package Ejercicio2;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Tienda {
	
	private IntegerProperty codigo = new SimpleIntegerProperty();
    private StringProperty nombre = new SimpleStringProperty();
    private DoubleProperty precio = new SimpleDoubleProperty();
    private IntegerProperty codigo_fabricante = new SimpleIntegerProperty();

    public Tienda(int codigo, String nombre, double precio, int codigo_fabricante) {
		this.codigo.set(codigo);
        this.nombre.set(nombre);
        this.precio.set(precio);
        this.codigo_fabricante.set(codigo_fabricante);
	}

	public IntegerProperty getCodigo() {
		return codigo;
	}

	public void setCodigo(IntegerProperty codigo) {
		this.codigo = codigo;
	}
	
	public IntegerProperty codigoProperty() {
	        return codigo;
	}
	
	public StringProperty getNombre() {
		return nombre;
	}

	public void setNombre(StringProperty nombre) {
		this.nombre = nombre;
	}
	
	public StringProperty nombreProperty() {
        return nombre;
    }

	public DoubleProperty getPrecio() {
		return precio;
	}

	public void setPrecio(DoubleProperty precio) {
		this.precio = precio;
	}
	
	public DoubleProperty precioProperty() {
        return precio;
    }

	public IntegerProperty getCodigo_fabricante() {
		return codigo_fabricante;
	}

	public void setCodigo_fabricante(IntegerProperty codigo_fabricante) {
		this.codigo_fabricante = codigo_fabricante;
	}
	
	public IntegerProperty codigo_FabricanteProperty() {
        return codigo_fabricante;
    }
    
    
}
