package Clases;

import java.io.Serializable;

public class Postres extends Menu implements Serializable {

	private String _sabor;
	public Postres() {
		super();
		
	}
	public Postres(String _sabor) {
		super();
		this._sabor = _sabor;
	}
	public Postres(int _codigo, String _tamanio, String _nombre, double _precio,String _sabor) {
		super(_codigo, _tamanio, _nombre, _precio);
		this._sabor = _sabor;
	}
	public String get_sabor() {
		return _sabor;
	}
	public void set_sabor(String _sabor) {
		this._sabor = _sabor;
	}
	@Override
	public String toString() {
		String _infoClase=String.format("\nSabor: %s", this._sabor);
		return super.toString()+_infoClase;
	}

    
	
	
}
