package Gestiones;

import java.util.LinkedList;

import Clases.Detalle_De_Pedido;
import java.io.Serializable;

public class GestionDetalle_De_Pedido implements Serializable{
	
	private LinkedList<Detalle_De_Pedido> lstDetalleped=new LinkedList<>();

	   public GestionDetalle_De_Pedido() {
        super();

    }

    /**
     * Metodo para agregar detalles al pedido
     *
     * @param detalleped
     * @return true si funciona correctamente
     */
    public boolean Agregar(Detalle_De_Pedido detalleped) {
        if (BuscarPorCodigo(detalleped.get_codigo()) == -1) { //El detalle no esta registrado
            lstDetalleped.add(detalleped);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para buscar detalle de pedido por codigo
     *
     * @param codigo
     * @return -1 si no lo encuentra, caso contrario retorna la posicion en la
     * coleccion
     */
    public int BuscarPorCodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstDetalleped.size(); i++) {
            if (lstDetalleped.get(i).get_codigo() == codigo) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     *
     * @param codigo
     * @return
     */
    public Detalle_De_Pedido Buscar(int codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstDetalleped.get(posicion);
        }
    }

    /**
     *
     * @param indice
     * @return
     */
    public boolean eliminarporIndice(int indice) {
        lstDetalleped.remove(indice);
        return true;
    }

    /**
     * Metodo para obtener detalles en el pedido
     *
     * @param Cantidad
     * @return true si funciona correctamente.
     */
    public Detalle_De_Pedido obtenerdetalle(double Cantidad) {
        Detalle_De_Pedido detalle_de_facturaEncontrado = null;
        for (int i = 0; i < lstDetalleped.size(); i++) {
            if (lstDetalleped.get(i).get_cantidad() == Cantidad) {
                detalle_de_facturaEncontrado = lstDetalleped.get(i);
                break;
            }
        }
        return detalle_de_facturaEncontrado;
    }

    /**
     * Metodo para modificar detalle de pedido por posicion
     *
     * @param nuevoDetalleped
     * @param posicion
     * @return
     */
    public boolean Modificar(Detalle_De_Pedido nuevoDetalleped, int posicion) {
        if (posicion < 0 || posicion > lstDetalleped.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevoDetalleped.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstDetalleped.set(posicion, nuevoDetalleped);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     *
     * @param posicion
     * @return
     */
    public Detalle_De_Pedido getElementoPorposicion(int posicion) {
        return lstDetalleped.get(posicion);
    }

    /**
     * Metodo para obtener elemento por indice
     *
     * @param indice
     * @return
     */
    public Detalle_De_Pedido getDetallepedByIndex(int indice) {
        return lstDetalleped.get(indice);
    }

    /**
     * Imprimir todos los elementos de la coleccion
     */
    public void imprimirTodos() {
        for (int i = 0; i < lstDetalleped.size(); i++) {
            System.out.println(lstDetalleped.get(i));
        }
    }
    /**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */

    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstDetalleped.size()][6];
        for (int i = 0; i < lstDetalleped.size(); i++) {
            System.out.println(lstDetalleped.get(i));
            array[i][0] = lstDetalleped.get(i).get_codigo();
            array[i][1] = lstDetalleped.get(i).get_ingredientes().get_nombre();
            array[i][2] = lstDetalleped.get(i).get_cantidad();
            array[i][3] = lstDetalleped.get(i).get_precio();
            array[i][4] = lstDetalleped.get(i).Subtotal();
            array[i][5] = lstDetalleped.get(i).Total();

        }
        return array;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 13/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Código \t |   Ingredientes \t |  Cantidad \t| Precio \t | Subtotal \t|  Total \t| \n";
        for (int i = 0; i < lstDetalleped.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstDetalleped.get(i).get_codigo() + "\t |" + lstDetalleped.get(i).get_ingredientes() + "\t |" + lstDetalleped.get(i).get_cantidad() + "\t |" + lstDetalleped.get(i).get_precio() + "\t |" + lstDetalleped.get(i).Subtotal() + "\t |" + lstDetalleped.get(i).Total() + "\n";
        }
        return _resultado;
    }
    /**
 * @author: Cleymer Elena Mendoza
 * @since 13/08/2020
 * Metodo para imprimir reporte en excel
 * @return 
 */

    public String getInfoReporteCSV() {
        String _resultado = "Código ; Ingredientes ; Cantidad; Precio; Subtotal; Total ;\n";
        for (int i = 0; i < lstDetalleped.size(); i++) {
            _resultado += lstDetalleped.get(i).get_codigo() + ";" + lstDetalleped.get(i).get_ingredientes() + ";" + lstDetalleped.get(i).get_cantidad() + ";" + lstDetalleped.get(i).get_precio() + ";" + lstDetalleped.get(i).Subtotal() + ";" + lstDetalleped.get(i).Total() + ";\n";
        }
        return _resultado;
    }
    /**Metodo usado para generar el reporte en PDF
     * @author Cleymer Mendoza
     * @since 13/08/2020
     * @return 
     */
     public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstDetalleped.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Codigo : " + this.lstDetalleped.get(i).get_codigo() + "\n"
                    + "Cantidad " + this.lstDetalleped.get(i).get_cantidad() + "\n"
                    + "Ingredientes " + this.lstDetalleped.get(i).get_ingredientes() + "\n"
                    + "Precio " + this.lstDetalleped.get(i).get_precio() + "\n"
                    + "Subtotal:  " + this.lstDetalleped.get(i).Subtotal() + "\n";
            
        }
        return retorno;
    }


}
