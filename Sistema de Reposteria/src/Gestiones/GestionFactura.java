package Gestiones;

import java.util.LinkedList;
import java.util.Date; 
import Clases.Factura;
import Util.AdminFechas;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

public class GestionFactura implements Serializable{
	
	private LinkedList<Factura> lstFactura=new LinkedList<>();

	   public GestionFactura() {
        super();
    }

    /**
     * Metodo usado para agregar la factura por codigo
     *
     * @param factura
     * @return
     */
    public boolean Agregar(Factura factura) {
        int nuevoCodigo = GenerarCodigoFactura();

        factura.set_codigo(nuevoCodigo);
        factura.set_fecha(AdminFechas.getFechaActual());

        lstFactura.add(factura);
        return true;
    }

    /**
     * Metodo usado para generar el codigo de la factura
     *
     * @return
     */
    public int GenerarCodigoFactura() {
        return lstFactura.size() + 1;
    }

    /**
     *
     * @param indice
     * @return
     */
    public Factura getFacturaByIndex(int indice) {
        return lstFactura.get(indice);
    }

    /**
     *
     * @param nuevaFactura
     * @param posicion
     * @return
     */
    public boolean Modificar(Factura nuevaFactura, int posicion) {
        if (posicion < 0 || posicion > lstFactura.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevaFactura.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstFactura.set(posicion, nuevaFactura);
                return true;
            } else {
                return false;
            }
        }
    }
    /**
     * Metodo para buscar la factura por codigo
     * @author Cleymer Mendoza
     * @param codigo
     * @return 
     */

    public Factura Buscar(int codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstFactura.get(posicion);
        }
    }

    /**
     *
     * @param indice
     * @return
     */
    public boolean eliminarporIndice(int indice) {
        lstFactura.remove(indice);
        return true;
    }

    /**
     *
     * @param codigo
     * @return
     */
    public int BuscarPorCodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstFactura.size(); i++) {
            if (lstFactura.get(i).get_codigo() == codigo) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     * Imprimir todos los elementos de la coleccion
     */
    public void imprimirTodos() {
        for (int i = 0; i < lstFactura.size(); i++) {
            System.out.println(lstFactura.get(i));

        }
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstFactura.size()][4];
        for (int i = 0; i < lstFactura.size(); i++) {
            System.out.println(lstFactura.get(i));
            array[i][0] = lstFactura.get(i).get_codigo();
            array[i][1] = lstFactura.get(i).get_cliente().get_nombres()+" "+lstFactura.get(i).get_cliente().get_apellidos();
            array[i][2] = lstFactura.get(i).get_fecha();
            array[i][3]=   Double.toString(lstFactura.get(i).getTotalFactura());

        }
        return array;
    }
    /**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */

    public String getInfoReporte() {
        String _resultado = "Código \t |   Fecha \t |  Cliente \t| Detalle de Factura \t | \n";
        for (int i = 0; i < lstFactura.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstFactura.get(i).get_codigo() + "\t |" + lstFactura.get(i).get_fecha() + "\t |" + lstFactura.get(i).get_cliente() + "\t |" + lstFactura.get(i).get_detalle_De_Factura() + "\n";
        }
        return _resultado;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */
    public String getInfoReporteCSV() {
        String _resultado = "Código ; Fecha ; Cliente; Detalle de Factura; \n";
        for (int i = 0; i < lstFactura.size(); i++) {
            _resultado += lstFactura.get(i).get_codigo() + ";" + lstFactura.get(i).get_fecha() + ";" + lstFactura.get(i).get_cliente() + ";" + lstFactura.get(i).get_detalle_De_Factura() + ";\n";
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
        tamanioLista = this.lstFactura.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "\nCodigo : " + this.lstFactura.get(i).get_codigo() + "\n"
                    + "Fecha : " + this.lstFactura.get(i).get_fecha() + "\n"
                    + "Cliente : " + this.lstFactura.get(i).get_cliente() + "\n"
                    + "Detalle de Factura :" + this.lstFactura.get(i).get_detalle_De_Factura() + "\n\n";
                  
        }
        return retorno;
    }

    
}
