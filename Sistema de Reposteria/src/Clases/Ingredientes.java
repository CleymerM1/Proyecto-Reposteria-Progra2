package Clases;

import java.io.Serializable;

public class Ingredientes implements Serializable{
	
	private int _codigo;
	private String _nombre;
	private double _preciocosto;
	private double _precioventa;
	public Ingredientes() {
		super();
		
	}
	public Ingredientes(int _codigo, String _nombre, double _preciocosto, double _precioventa) {
		super();
		this._codigo = _codigo;
		this._nombre = _nombre;
		this._preciocosto = _preciocosto;
		this._precioventa = _precioventa;
	}
	public int get_codigo() {
		return _codigo;
	}
	public void set_codigo(int _codigo) {
		this._codigo = _codigo;
	}
	public String get_nombre() {
		return _nombre;
	}
	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}
	public double get_preciocosto() {
		return _preciocosto;
	}
	public void set_preciocosto(double _preciocosto) {
		this._preciocosto = _preciocosto;
	}
	public double get_precioventa() {
		return _precioventa;
	}
	public void set_precioventa(double _precioventa) {
		this._precioventa = _precioventa;
	}
	@Override
	public String toString() {
		return String.format("Codigo: %d, \nNombre: %s, \nPrecioCosto: %f, \nPrecioVenta:%f", this._codigo, this._nombre, this._preciocosto, this._precioventa);
	}
	


}
