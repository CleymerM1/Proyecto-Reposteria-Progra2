package Clases;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;

public class Factura implements Serializable{
	private int _codigo;
	private Date _fecha;
	private Cliente _cliente;
	LinkedList <Detalle_De_Factura> _detalle_De_Factura=new LinkedList<>();
        private double _totalNeto;
	public Factura() {
		super();
		
	}
	public Factura(int _codigo, Date _fecha, Cliente _cliente, LinkedList<Detalle_De_Factura> _detalle_De_Factura, double _totalNeto) {
		super();
		this._codigo = _codigo;
		this._fecha = _fecha;
		this._cliente = _cliente;
		this._detalle_De_Factura = _detalle_De_Factura;
	      this._totalNeto=_totalNeto;
        }
	/**
	 * Metodo para agregar detalle a mi factura
	 * @param detalle
	 * @return
	 */
	
	public boolean agregarDetalle(Detalle_De_Factura detalle) {
	_detalle_De_Factura.add(detalle);
		return true;}
	
	public int get_codigo() {
		return _codigo;
	}
	public void set_codigo(int _codigo) {
		this._codigo = _codigo;
	}
	public Date get_fecha() {
		return _fecha;
	}
	public void set_fecha(Date _fecha) {
		this._fecha = _fecha;
	}
	public Cliente get_cliente() {
		return _cliente;
	}
	public void set_cliente(Cliente _cliente) {
		this._cliente = _cliente;
	}
	public LinkedList<Detalle_De_Factura> get_detalle_De_Factura() {
		return _detalle_De_Factura;
	}
	public void set_detalle_De_Factura(LinkedList<Detalle_De_Factura> _detalle_De_Factura) {
		this._detalle_De_Factura = _detalle_De_Factura;
	}
        public double get_totalNeto(){
        return _totalNeto;
        }
        public void set_totalNeto(Double _totalNeto){
        this._totalNeto=_totalNeto;
        }
       
	@Override
	public String toString() {
		return String.format("Codigo: %d, \nFecha: %s, \nCliente: %s, \nDetalle_de_Factura: %s, \nTotal Neto: %f", this._codigo, this._fecha, this._cliente, this._detalle_De_Factura, this._totalNeto);
		
	}
        public double getTotalFactura() {
        double _total=0;
        for(int i=0;i<_detalle_De_Factura.size();i++){
            _total+=_detalle_De_Factura.get(i).get_cantidad()*_detalle_De_Factura.get(i).get_postres().get_precio();
        }
        return _total;
    }

    /**
     * @param _totalFactura the _totalFactura to set
     */
    public void setTotalFactura(double _totalFactura) {
        this._totalNeto = _totalFactura;
    }
	public Object[][] getArrayDetalle_De_Factura() {
            Object [][] array=new Object[this._detalle_De_Factura.size()][4];
		for(int i=0; i<_detalle_De_Factura.size(); i++) {	
                    array[i][0]=  Double.toString(_detalle_De_Factura.get(i).get_cantidad());
                    array[i][1]=   _detalle_De_Factura.get(i).get_postres().get_nombre();
                    array[i][2]=  Double.toString(_detalle_De_Factura.get(i).get_postres().get_precio());
                    array[i][3]= Double.toString(_detalle_De_Factura.get(i).get_postres().get_precio()*_detalle_De_Factura.get(i).get_cantidad());
		}
            return  array;   
	}
	
	

	
}
