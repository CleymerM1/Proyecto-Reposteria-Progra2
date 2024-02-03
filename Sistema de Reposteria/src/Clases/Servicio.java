package Clases;

import java.io.Serializable;

public class Servicio implements Serializable{
	
	private int _codigo;
	private String _descripcion;
	public Servicio() {
		super();
	}
	public Servicio(int _codigo, String _descripcion) {
		super();
		this._codigo = _codigo;
		this._descripcion = _descripcion;
	}
	public int get_codigo() {
		return _codigo;
	}
	public void set_codigo(int _codigo) {
		this._codigo = _codigo;
	}
	public String get_descripcion() {
		return _descripcion;
	}
	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}
	@Override
	public String toString() {
		return String.format("Codigo: %d , \nDescripcion: %s ", this._codigo, this._descripcion);
				
	}
	


		
	}
	