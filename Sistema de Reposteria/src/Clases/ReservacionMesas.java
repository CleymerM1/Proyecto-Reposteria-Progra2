package Clases;

import java.io.Serializable;
import java.util.Date;

public class ReservacionMesas implements Serializable{
	
	private String _tamanio;
	private Date _fecha;
	private String _descripcion;
	private String hora;
        private Cliente _cliente;
	public ReservacionMesas() {
		super();
		
	}
	public ReservacionMesas(String _tamanio, Date _fecha, String _descripcion, String hora, Cliente _cliente) {
		super();
		this._tamanio = _tamanio;
		this._fecha = _fecha;
		this._descripcion = _descripcion;
		this.hora = hora;
                this._cliente=_cliente;
	}
	public String get_tamanio() {
		return _tamanio;
	}
	public void set_tamanio(String _tamanio) {
		this._tamanio = _tamanio;
	}
	public Date get_fecha() {
		return _fecha;
	}
	public void set_fecha(Date _fecha) {
		this._fecha = _fecha;
	}
	public String get_descripcion() {
		return _descripcion;
	}
	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
            if(hora.contains(":")){
            throw new IllegalArgumentException("La Hora es incorrecta, favor no ingrese los dos puntos ");
            }else{
                this.hora = hora;
            }
	}
        public Cliente get_cliente() {
		return _cliente;
	}
	public void set_cliente(Cliente _cliente) {
		this._cliente = _cliente;
	}
	@Override
	public String toString() {
		return String.format("Tamanio: %s, \nFecha: %s, \nDescripcion: %s, \nHora: %s, \nCliente: %s", this._tamanio, this._fecha, this._descripcion, this.hora, this._cliente);
				
	}
	
	
	}
	
	
	
