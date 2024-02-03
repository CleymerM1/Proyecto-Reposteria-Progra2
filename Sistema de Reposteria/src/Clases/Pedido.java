package Clases;

import java.io.Serializable;
import java.util.LinkedList;

public class Pedido implements Serializable{
	
	
	private int _codigo;
	private Proveedor _proveedor;
        LinkedList <Detalle_De_Pedido> _detalle_De_Pedido=new LinkedList<>();
        private double _totalNeto;
	public Pedido() {
		super();
		
	}
	public Pedido( int _codigo, Proveedor _proveedor,LinkedList<Detalle_De_Pedido> _detalle_De_Pedido, double _totalNeto) {
		super();
		
		this._codigo = _codigo;
		this._proveedor = _proveedor;
                this._detalle_De_Pedido = _detalle_De_Pedido;
	      this._totalNeto=_totalNeto;
        }
        public boolean agregarDetalleped(Detalle_De_Pedido detalleped) {
	_detalle_De_Pedido.add(detalleped);
		return true;
	}
	
	public int get_codigo() {
		return _codigo;
	}
	public void set_codigo(int _codigo) {
		this._codigo = _codigo;
	}
	public Proveedor get_proveedor() {
		return _proveedor;
	}
	public void set_proveedor(Proveedor _proveedor) {
		this._proveedor = _proveedor;
	}
        public LinkedList<Detalle_De_Pedido> get_detalle_De_Pedido() {
		return _detalle_De_Pedido;
	}
	public void set_detalle_De_Pedido(LinkedList<Detalle_De_Pedido> _detalle_De_Pedido) {
		this._detalle_De_Pedido = _detalle_De_Pedido;
	}
        public double get_totalNeto(){
        return _totalNeto;
        }
        public void set_totalNeto(Double _totalNeto){
        this._totalNeto=_totalNeto;
        }
	
	
	
	
	@Override
	public String toString() {
		return String.format("Codigo: %d,\nProveedor: %s , \nDetalle de Pedido, \nTotal Neto", 
                       this._codigo, 
                        this._proveedor,
                        this._detalle_De_Pedido,
                        this._totalNeto);
				
	}
	
	public double getTotalPedido() {
        double _total=0;
        for(int i=0;i<_detalle_De_Pedido.size();i++){
            _total+=_detalle_De_Pedido.get(i).get_cantidad()*_detalle_De_Pedido.get(i).get_ingredientes().get_precioventa();
        }
        return _total;
    }

    /**
     * @param _totalPedido the _totalPedido to set
     */
    public void setTotalPedido(double _totalPedido) {
        this._totalNeto = _totalPedido;
    }
	public Object[][] getArrayDetalle_De_Pedido() {
            Object [][] array=new Object[this._detalle_De_Pedido.size()][4];
		for(int i=0; i<_detalle_De_Pedido.size(); i++) {	
                    array[i][0]=  Double.toString(_detalle_De_Pedido.get(i).get_cantidad());
                    array[i][1]=   _detalle_De_Pedido.get(i).get_ingredientes().get_nombre();
                    array[i][2]=  Double.toString(_detalle_De_Pedido.get(i).get_ingredientes().get_precioventa());
                    array[i][3]= Double.toString(_detalle_De_Pedido.get(i).get_ingredientes().get_precioventa()*_detalle_De_Pedido.get(i).get_cantidad());
		}
            return  array;   
	}
	

}
