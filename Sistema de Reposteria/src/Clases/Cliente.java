  package Clases;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable{
	
	private String _correoelectronico;
	public Cliente() {
		super();
		
	}
	public Cliente(String _correoelectronico) {
		super();
		this._correoelectronico = _correoelectronico;
	}


	//Constructor con todos los parametros
	
	public Cliente(int _codigo, String _nombres, String _apellidos, String _identidad, String _direccion, String _correoelectronico) {
		super(_codigo, _nombres, _apellidos, _identidad, _direccion);
		this._correoelectronico = _correoelectronico;
	}

        public String get_correoelectronico(){
        return _correoelectronico;
        }

        public void set_correoelectronico(String _correoelectronico){
            if(!_correoelectronico.contains("@")|| !_correoelectronico.contains(".")){
            throw new IllegalArgumentException("Correo electronico es incorrecto");
            }else{
                this._correoelectronico=_correoelectronico;
            }
      
        }
	@Override
	public String toString() {
		String _infoClase=String.format(" \nCorreoElectronico: %s", this._correoelectronico);
		return super.toString()+_infoClase;
	}
	

	
}
