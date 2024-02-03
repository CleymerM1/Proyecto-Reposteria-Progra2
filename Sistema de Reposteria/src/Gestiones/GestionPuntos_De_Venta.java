package Gestiones;

import java.util.LinkedList;

import Clases.Puntos_De_Venta;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

public class GestionPuntos_De_Venta implements Serializable {
	
	private LinkedList<Puntos_De_Venta> lstPuntosventa=new LinkedList<>();

	   public GestionPuntos_De_Venta() {
        super();

    }

    /**
     * Metodo para agregar los puntos de venta disponibles
     *
     * @param puntos_de_venta
     * @return true si todo funciona correctamente
     */
    public boolean Agregar(Puntos_De_Venta puntos_de_venta) {
        lstPuntosventa.add(puntos_de_venta);
        return true;
    }

    /**
     * Metodo usado para buscar los puntos de venta por direccion
     *
     * @param codigo
     * @return -1 si no lo encuentra, caso contrario retorna la posicion en la
     * coleccion
     */
    public int BuscarPorCodigo(String codigo) {
        int posicion = -1;
        for (int i = 0; i < lstPuntosventa.size(); i++) {
            if (lstPuntosventa.get(i).get_codigo() == codigo) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     *Metodo para modificar el punto de venta por posicion
     * @author Cleymer Mendoza
     * @param nuevopunto
     * @param posicion
     * @return
     */
    public boolean Modificar(Puntos_De_Venta nuevopunto, int posicion) {
        if (posicion < 0 || posicion > lstPuntosventa.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevopunto.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstPuntosventa.set(posicion, nuevopunto);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     *Metodo para buscar punto de venta por codigo
     * @param codigo
     * @return
     */
    public Puntos_De_Venta Buscar(String codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstPuntosventa.get(posicion);
        }
    }

    /**
     * Metodo usado para eliminar puntos de venta por posicion
     *
     * @param posicion
     * @return
     */
    public boolean Eliminar(int posicion) {
        if (posicion < 0 || posicion > lstPuntosventa.size()) {
            return false;
        } else {
            lstPuntosventa.remove(posicion);
            return true;
        }
    }
/**
 * Metodo para obtener punto de venta por indice
 * @param indice
 * @return 
 */
    public Puntos_De_Venta getPuntosByIndex(int indice) {
        return lstPuntosventa.get(indice);
    }

    /**
     * Retorna el elemento de una coleccion segun su posicion
     *
     * @param posicion
     * @return un objeto de puntos de venta que esta en la posicion de la
     * coleccion lstPuntosventa
     */
    public Puntos_De_Venta getElementoPorPosicion(int posicion) {
        return lstPuntosventa.get(posicion);
    }

    /**
     *Metodo para eliminar por indice
     * @param indice
     * @return
     */
    public boolean eliminarporIndice(int indice) {
        lstPuntosventa.remove(indice);
        return true;
    }

    /**
     * Imprimir todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstPuntosventa.size(); i++) {
            System.out.println(lstPuntosventa.get(i));
        }
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstPuntosventa.size()][4];
        for (int i = 0; i < lstPuntosventa.size(); i++) {
            System.out.println(lstPuntosventa.get(i));
            array[i][0] = lstPuntosventa.get(i).get_codigo();
            array[i][1] = lstPuntosventa.get(i).get_direccion();
            array[i][2] = lstPuntosventa.get(i).get_telefono();
            array[i][3] = lstPuntosventa.get(i).get_empleado().get_nombres()+" "+lstPuntosventa.get(i).get_empleado().get_apellidos();

        }
        return array;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Codigo \t |Telefono \t |   Direccion \t | Empleado \t | \n";
        for (int i = 0; i < lstPuntosventa.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstPuntosventa.get(i).get_codigo() + "\t |" +lstPuntosventa.get(i).get_telefono() + "\t |" + lstPuntosventa.get(i).get_direccion() + "\t |" + lstPuntosventa.get(i).get_empleado() + "\n";
        }
        return _resultado;
    }
    /**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */

    public String getInfoReporteCSV() {
        String _resultado = "Codigo ; Telefono ; Direccion ; Empleado ;\n";
        for (int i = 0; i < lstPuntosventa.size(); i++) {
            _resultado += lstPuntosventa.get(i).get_codigo() + ";" +lstPuntosventa.get(i).get_telefono() + ";" + lstPuntosventa.get(i).get_direccion() + ";" + lstPuntosventa.get(i).get_empleado() + ";\n";
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
        tamanioLista = this.lstPuntosventa.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Codigo : " + this.lstPuntosventa.get(i).get_codigo() + "\n"
                    + "Direccion:  " + this.lstPuntosventa.get(i).get_direccion() + "\n"
                    + "Empleado: " + this.lstPuntosventa.get(i).get_empleado() + "\n";
        }
        return retorno;
    }

}
