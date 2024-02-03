package Clases;

import java.io.Serializable;

public class Forma_De_Pago implements Serializable{
	
	private int _codigo;
	private String _metodo;
	public Forma_De_Pago() {
		super();
		
	}
	public Forma_De_Pago(int _codigo, String _metodo) {
		super();
		this._codigo = _codigo;
		this._metodo = _metodo;
	}
	public int get_codigo() {
		return _codigo;
	}
	public void set_codigo(int _codigo) {
		this._codigo = _codigo;
	}
	public String get_metodo() {
		return _metodo;
	}
	public void set_descripcion(String _metodo) {
		this._metodo = _metodo;
	}
	@Override
	public String toString() {
		return String.format("Codigo: %d, \nDescripcion:%s", this._codigo, this._metodo);
	}
	
	

}
