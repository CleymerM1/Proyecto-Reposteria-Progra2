package Clases;

import java.io.Serializable;

public class Bebidas extends Menu implements Serializable{

	private String _descripcion;
	public Bebidas() {
		super();
		
	}
	//Constructor con todos los parametros
	public Bebidas(int _codigo, String _tamanio, String _nombre, double _precio,String _descripcion) {
		super(_codigo, _tamanio, _nombre, _precio);
		this._descripcion = _descripcion;
		
	}
	public String get_descripcion() {
		return _descripcion;
	}
	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}
	@Override
	public String toString() {
		String _infoClase=String.format("\nDescripcion: %s", this._descripcion);
		return super.toString()+_infoClase;
	}
	
	
	
	
}
		
	