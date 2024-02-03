package Clases;

import java.io.Serializable;

public class Persona implements Serializable{
	private int _codigo;
	private String _nombres;
	private String _apellidos;
	private String _identidad;
	private String _direccion;
	public Persona() {
		super();
	}
	public Persona(int _codigo, String _nombres, String _apellidos, String _identidad, String _direccion) {
		super();
		this._codigo = _codigo;
		this._nombres = _nombres;
		this._apellidos = _apellidos;
		this._identidad = _identidad;
		this._direccion= _direccion;
	}
	public int get_codigo() {
		return _codigo;
	}
        
	public void set_codigo(int _codigo) {
          
            this._codigo = _codigo;
           
            
	}
	public String get_nombres() {
		return _nombres;
	}
	public void set_nombres(String _nombres) {
             if(_nombres==null || _nombres.equals("")){
            throw new IllegalArgumentException("Nombres es un dato Obligatorio");
            }else{
            this._nombres = _nombres;
            }
		
	}
	public String get_apellidos() {
		return _apellidos;
	}
	public void set_apellidos(String _apellidos) {
              if(_apellidos==null || _apellidos.equals("")){
            throw new IllegalArgumentException("Apellidos es un dato Obligatorio");
            }else{
            this._apellidos = _apellidos;
            }
		
	}
	public String get_identidad() {
		return _identidad;
	}
	public void set_identidad(String _identidad) {
		this._identidad = _identidad;
	}
	
	public String get_direccion() {
		return _direccion;
	}
	public void set_direccion(String _direccion) {
		this._direccion = _direccion;
	}
	@Override
	public String toString() {
		return "\n"
				+ "codigo:" + _codigo +",\n"
				+ "nombres:" + _nombres + ",\n"
				+ "apellidos:" + _apellidos + ",\n"
				+ "identidad:" + _identidad + "\n"
				+ "direccion:" + _direccion + "\n";
	}

}
