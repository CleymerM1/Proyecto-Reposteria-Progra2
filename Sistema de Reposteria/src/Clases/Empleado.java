package Clases;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable{
	
	private String _telefono;
	private double _sueldo;
	private Cargo _cargo;
	public Empleado() {
		super();
		
	}
	public Empleado(String _telefono, double _sueldo, Cargo _cargo) {
		super();
		this._telefono = _telefono;
		this._sueldo = _sueldo;
		this._cargo = _cargo;
	}
	//Constructor con todos los parametros
	public Empleado(int _codigo, String _nombres, String _apellidos, String _identidad, String _direccion,String _telefono, double _sueldo, Cargo _cargo) {
		super(_codigo, _nombres, _apellidos, _identidad, _direccion);
		this._telefono = _telefono;
		this._sueldo = _sueldo;
		this._cargo = _cargo;
		
	}
	public String get_telefono() {
		return _telefono;
	}
	public void set_telefono(String _telefono) {
		this._telefono = _telefono;
	}
	public double get_sueldo() {
		return _sueldo;
	}
	public void set_sueldo(double _sueldo) {
		this._sueldo = _sueldo;
	}
	public Cargo get_cargo() {
		return _cargo;
	}
	public void set_cargo(Cargo _cargo) {
		this._cargo = _cargo;
	}
	@Override
	public String toString() {
		String _infoClase=String.format("Telefono: %s, \nSueldo: %f, \nCargo: %s", this._telefono, this._sueldo, this._cargo);
		return super.toString()+_infoClase;
	}
	
	
	
}
