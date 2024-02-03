package Clases;

import java.io.Serializable;

public class Puntos_De_Venta implements Serializable{
        private String _codigo;
	private String _direccion;
	private String _telefono;
	private Empleado _empleado;
	public Puntos_De_Venta() {
		super();
		
	}
	public Puntos_De_Venta(String _codigo, String _direccion, String _telefono, Empleado _empleado) {
		super();
                this._codigo=_codigo;
		this._direccion = _direccion;
		this._telefono = _telefono;
		this._empleado = _empleado;
	}
	public String get_direccion() {
		return _direccion;
	}
	public void set_direccion(String _direccion) {
		this._direccion = _direccion;
	}
	public String get_telefono() {
		return _telefono;
	}
	public void set_telefono(String _telefono) {
		this._telefono = _telefono;
	}
	public Empleado get_empleado() {
		return _empleado;
	}
	public void set_empleado(Empleado _empleado) {
		this._empleado = _empleado;
	}
        public String get_codigo() {
		return _codigo;
	}
	public void set_codigo(String _codigo) {
		this._codigo = _codigo;
	}
	@Override
	public String toString() {
		return String.format("Codigo: %d, \nDireccion: %s, \nTelefono %s, \nEmpleado: %s",this._codigo, this._direccion, this._telefono, this._empleado);
				
	}
	
	
}
