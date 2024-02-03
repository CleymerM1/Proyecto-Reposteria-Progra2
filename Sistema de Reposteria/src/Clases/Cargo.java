package Clases;

import java.io.Serializable;

public class Cargo implements Serializable{

	private int _codigo;
	private String _nombreCargo;
	public Cargo() {
		super();
		
	}
	public Cargo(int _codigo, String _nombreCargo) {
		super();
		this._codigo = _codigo;
		this._nombreCargo = _nombreCargo;
	}
	public int get_codigo() {
		return _codigo;
	}
	public void set_codigo(int _codigo) {
		this._codigo = _codigo;
	}
	public String get_nombreCargo() {
		return _nombreCargo;
	}
	public void set_nombreCargo(String _nombreCargo) {
            if(_nombreCargo==null || _nombreCargo.equals("")){
            throw new IllegalArgumentException("El nombre del cargo un dato Obligatorio");
            }else{
            this._nombreCargo = _nombreCargo;
            }
		
	}
	@Override
	public String toString() {
		return String.format("Codigo: %d , \nNombre del Cargo:", 
				this._codigo, 
				this._nombreCargo);
		
	}
	
	
	
}
