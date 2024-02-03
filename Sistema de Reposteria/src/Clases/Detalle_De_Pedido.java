package Clases;

import Util.PorPagar;
import java.io.Serializable;

public class Detalle_De_Pedido implements PorPagar, Serializable{
	private int _codigo;
	private double _cantidad;
	private double _precio;
	private Ingredientes _ingredientes;
	public Detalle_De_Pedido() {
		super();
		
	}
	
	public Detalle_De_Pedido(int _codigo, double _cantidad, double _precio, Ingredientes _ingredientes) {
		super();
		this._codigo = _codigo;
		this._cantidad = _cantidad;
		this._precio = _precio;
		this._ingredientes = _ingredientes;
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

	public Ingredientes get_ingredientes() {
		return _ingredientes;
	}

	public void set_ingredientes(Ingredientes _ingredientes) {
		this._ingredientes = _ingredientes;
	}

	@Override
	/**
	 * @author Cleymer
	 */
	public String toString() {
		return String.format("Codigo: %d, \nCantidad: %f,\nIngredientes: %s, \nPrecio",this._codigo, this._cantidad, this._ingredientes, this._precio);
	}
	
	@Override
	public double Subtotal() {
		double subtotal;
		subtotal=this.get_cantidad()*this.get_precio();
		return subtotal;
	}

	@Override
	/**
	 * @author Cleymer
	 */
	public double Total() {
		double total;
		total=this.Subtotal()*1.15;
		return total;
	}
	
	
	

}
