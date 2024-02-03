package Gestiones;

import java.util.LinkedList;

import Clases.Pedido;
import java.io.Serializable;

public class GestionPedido implements Serializable{
	private LinkedList<Pedido> lstPedido=new LinkedList<>();

	   public GestionPedido() {
        super();

    }

    /**
     * Metodo para agregar el pedido
     *
     * @param pedido
     * @return true si todo funciona correctamente
     */
    public boolean Agregar(Pedido pedido) {
        if (BuscarPorCodigo(pedido.get_codigo()) == -1) {
            lstPedido.add(pedido);
            return true;
        } else {
            return false;
        }
    }
    public int GenerarCodigoPedido() {
        return lstPedido.size() + 1;
    }
/**
 * MEtodo para buscar el pedido por codigo
 * @author Cleymer Elena Mendoza
 * @param codigo
 * @return 
 */
    public Pedido Buscar(int codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstPedido.get(posicion);
        }
    }

    /**
     * Metodo para eliminar pedido por posicion
     *
     * @param posicion
     * @return true si todo funciona correctamente
     */
    public boolean Eliminar(int posicion) {
        if (posicion < 0 || posicion > lstPedido.size()) {
            return false;
        } else {
            lstPedido.remove(posicion);
            return true;
        }
    }

    /**
     *MEtodo para eliminar por indice
     * @param indice
     * @author Cleymer Mendoza
     * @return
     */
    public boolean eliminarporIndice(int indice) {
        lstPedido.remove(indice);
        return true;
    }

    /**
     * Metodo para buscar por codigo de pedido
     *
     * @param codigo
     * @return -1 si no lo encuentra, caso contrario retorna la posicion en la
     * coleccion
     */
    public int BuscarPorCodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstPedido.size(); i++) {
            if (lstPedido.get(i).get_codigo() == codigo) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     *
     * @param nuevopedido
     * @param posicion
     * @return
     */
    public boolean Modificar(Pedido nuevopedido, int posicion) {
        if (posicion < 0 || posicion > lstPedido.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevopedido.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstPedido.set(posicion, nuevopedido);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Metodo para obtener pedido por indice
     *
     * @param indice
     * @return
     */
    public Pedido getPedidoByIndex(int indice) {
        return lstPedido.get(indice);
    }

    /**
     * Retorna el elemento de una coleccion segun su posicion
     *
     * @param posicion del elemento a retornar
     * @return un objeto de cargo que esta en la posicion de la coleccion
     */
    public Pedido getElementoPorPosicion(int posicion) {
        return lstPedido.get(posicion);
    }

    /**
     * Imprimir todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstPedido.size(); i++) {
            System.out.println(lstPedido.get(i));
        }
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstPedido.size()][3];
        for (int i = 0; i < lstPedido.size(); i++) {
            System.out.println(lstPedido.get(i));
            array[i][0] = lstPedido.get(i).get_codigo();
            array[i][1] = lstPedido.get(i).get_proveedor().get_nombres()+" "+lstPedido.get(i).get_proveedor().get_apellidos();
            array[i][2]=  Double.toString(lstPedido.get(i).getTotalPedido());
        }
        return array;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 12/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Código \t | Proveedor \t|  Detalle de Pedido \t| \n";
        for (int i = 0; i < lstPedido.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstPedido.get(i).get_codigo() + "\t |" + lstPedido.get(i).get_proveedor() + "\t |" + lstPedido.get(i).get_detalle_De_Pedido() + "\n";
        }
        return _resultado;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 12/08/2020
 * @return 
 */
    public String getInfoReporteCSV() {
        String _resultado = "Código ; Proveedor ; Detalle de Pedido; \n";
        for (int i = 0; i < lstPedido.size(); i++) {
            _resultado += lstPedido.get(i).get_codigo() + ";" + lstPedido.get(i).get_proveedor() +";" + lstPedido.get(i).get_detalle_De_Pedido() + ";\n";
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
        tamanioLista = this.lstPedido.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "\nCodigo : " + this.lstPedido.get(i).get_codigo() + "\n"
                    + "Proveedor: " + this.lstPedido.get(i).get_proveedor() + "\n"
                    + "Detalle De Pedido:  " + this.lstPedido.get(i).get_detalle_De_Pedido() + "\n\n";
            
        }
        return retorno;
    }

   

}
