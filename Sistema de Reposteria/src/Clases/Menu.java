package Clases;

import java.io.Serializable;

public class Menu implements Serializable{
	protected int _codigo;
	protected String _tamanio;
	protected String _nombre;
	private double _precio;
	public Menu() {
		super();
	}
	public Menu(int _codigo, String _tamanio, String _nombre, double _precio) {
		super();
		this._codigo = _codigo;
		this._tamanio = _tamanio;
		this._nombre = _nombre;
		this._precio = _precio;
	}
	public int get_codigo() {
		return _codigo;
	}
	public void set_codigo(int _codigo) {
		this._codigo = _codigo;
	}
	public String get_tamanio() {
		return _tamanio;
	}
	public void set_tamanio(String _tamanio) {
            if(_tamanio==null || _tamanio.equals("")){
            throw new IllegalArgumentException("El tamaño es un dato Obligatorio");
            }else{
            this._tamanio = _tamanio;
            }
		
	}
	public String get_nombre() {
		return _nombre;
	}
	public void set_nombre(String _nombre) {
              if(_nombre==null || _nombre.equals("")){
            throw new IllegalArgumentException("El nombre un dato Obligatorio");
            }else{
            this._nombre = _nombre;
            }
	}
	public double get_precio() {
		return _precio;
	}
	public void set_precio(double _precio) {
		this._precio = _precio;
	}
	
	
	@Override
	public String toString() {
		return String.format("Codigo: %d, \nTamanio: %s,\nNombre: %s, \nPrecio: %f ", 
				this._codigo, 
				this._tamanio, 
				this._nombre, 
				this._precio);
	}
	
	}


