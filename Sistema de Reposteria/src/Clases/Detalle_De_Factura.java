package Clases;

import Util.PorPagar;
import java.io.Serializable;

public class Detalle_De_Factura implements PorPagar, Serializable {
	
	private int _codigo;
	private double _cantidad;
	private double _precio;
	private Postres _postres;
	public Detalle_De_Factura() {
		super();
		
	}
	
	public Detalle_De_Factura(int _codigo, double _cantidad, double _precio, Postres _postres) {
		super();
		this._codigo = _codigo;
		this._cantidad = _cantidad;
		this._precio = _precio;
		this._postres= _postres;
	}

	public int get_codigo() {
		return _codigo;
	}

	public void set_codigo(int _codigo) {
		this._codigo = _codigo;
	}

	public double get_cantidad() {
		return _cantidad;
	}

	public void set_cantidad(double _cantidad) {
		this._cantidad = _cantidad;
	}

	public double get_precio() {
		return _precio;
	}

	public void set_precio(double _precio) {
		this._precio = _precio;
	}

	public Postres get_postres() {
		return _postres;
	}

	public void set_postres(Postres _postres) {
		this._postres = _postres;
	}
        
         

	@Override
	public String toString() {
		 return String.format("Codigo: %d, \nCantidad: %f, \nPrecio: %f, \nPostres: %s",this._codigo, this._cantidad, this._precio, this._postres);
	}
	
	@Override
	/** Fecha 31/07/2020
	 * @author Cleymer 
	 */
	public double Subtotal() {
		double subtotal;
		subtotal=this.get_cantidad()*this.get_precio();
		return subtotal;
	}
	@Override
	/** Fecha 31/07/2020
	 * @author Cleymer
	 */
	public double Total() {
		double total;
		total=this.Subtotal()*1.15;
				return total;
	}
	
	
	
	
	

}
