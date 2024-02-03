package Clases;

import java.io.Serializable;

public class Proveedor implements Serializable{
    
        private String _codigo;
	private String _nombres;
	private String _apellidos;
	private String _nombreEmpresa;
	private Ingredientes _ingredientes;
	public Proveedor() {
		super();
		
	}
	public Proveedor(String _codigo, String _nombres, String _apellidos, String _nombreEmpresa, Ingredientes _ingredientes) {
		super();
                this._codigo=_codigo;
		this._nombres = _nombres;
		this._apellidos = _apellidos;
		this._nombreEmpresa = _nombreEmpresa;
		this._ingredientes = _ingredientes;
	}
        public String get_codigo() {
		return _codigo;
	}
	public void set_codigo(String _codigo) {
		this._codigo = _codigo;
	}
	public String get_nombres() {
		return _nombres;
	}
	public void set_nombres(String _nombres) {
		this._nombres = _nombres;
	}
	public String get_apellidos() {
		return _apellidos;
	}
	public void set_apellidos(String _apellidos) {
		this._apellidos = _apellidos;
	}
	public String get_nombreEmpresa() {
		return _nombreEmpresa;
	}
	public void set_nombreEmpresa(String _nombreEmpresa) {
		this._nombreEmpresa = _nombreEmpresa;
	}
	public Ingredientes get_ingredientes() {
		return _ingredientes;
	}
	public void set_ingredientes(Ingredientes _ingredientes) {
		this._ingredientes = _ingredientes;
	}
	@Override
	public String toString() {
		return String.format("Indice: %s, \nNombres: %s, Apellidos: %s, \nNombreEmpresa: %s, \nIngredientes: %s",this._codigo, this._nombres, this._apellidos, this._nombreEmpresa, this._ingredientes);
				
	}
	
}
