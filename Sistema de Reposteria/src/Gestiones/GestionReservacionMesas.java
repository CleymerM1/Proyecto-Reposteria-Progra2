package Gestiones;

import java.util.LinkedList;

import Clases.ReservacionMesas;
import java.io.Serializable;

public class GestionReservacionMesas implements Serializable{
	private LinkedList<ReservacionMesas> lstReservacion=new LinkedList<>();

	   public GestionReservacionMesas() {
        super();

    }

    /**
     * Metodo usado para agregar la reservacion de mesas
     *
     * @param reservacion
     * @return true si todo funciona correctamente
     */
    public boolean Agregar(ReservacionMesas reservacion) {
        if (BuscarPortamanio(reservacion.get_tamanio()) == -1) { //La reservacion no esta registrado
            lstReservacion.add(reservacion);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo usado para buscar la reservacion por tamanio
     *
     * @param tamanio
     * @return -1 si no lo encuentra, caso contrario retorna la posicion en la
     * coleccion
     */
    public int BuscarPortamanio(String tamanio) {
        int posicion = -1;
        for (int i = 0; i < lstReservacion.size(); i++) {
            if (lstReservacion.get(i).get_tamanio() == tamanio) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     * Metodo usado para eliminar la reservacion por posicion
     *
     * @param posicion
     * @return true si todo funciona correctamente
     */
    public boolean Eliminar(int posicion) {
        if (posicion < 0 || posicion > lstReservacion.size()) {
            return false;
        } else {
            lstReservacion.remove(posicion);
            return true;
        }
    }

    /**
     *Metodo para buscar la reservacion por codigo
     * @author Cleymer Mendoza
     * @param codigo
     * @return
     */
    public ReservacionMesas Buscar(String codigo) {
        int posicion = BuscarPortamanio(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstReservacion.get(posicion);
        }
    }

    /**
     *
     * @param indice
     * @return
     */
    public ReservacionMesas getReservacionByIndex(int indice) {
        return lstReservacion.get(indice);
    }

    /**
     *Metodo para eliminar por indice
     * @param indice
     * @return
     */
    public boolean eliminarporIndice(int indice) {
        lstReservacion.remove(indice);
        return true;
    }

    /**
     * Metodo para modificar reservacion por posicion
     *@author Cleymer Mendoza
     * @param nuevareservacion
     * @param posicion
     * @return
     */
    public boolean Modificar(ReservacionMesas nuevareservacion, int posicion) {
        if (posicion < 0 || posicion > lstReservacion.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPortamanio(nuevareservacion.get_tamanio());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstReservacion.set(posicion, nuevareservacion);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Retorna el elemento de una coleccion segun su posicion
     *
     * @param posicion
     * @return un objeto de ReservacionMEsas que esta en la posicion de la
     * coleccion lstReservacion
     */
    public ReservacionMesas getElementoPorPosicion(int posicion) {
        return lstReservacion.get(posicion);
    }

    /**
     * Imprimir todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstReservacion.size(); i++) {
            System.out.println(lstReservacion.get(i));
        }
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstReservacion.size()][5];
        for (int i = 0; i < lstReservacion.size(); i++) {
            System.out.println(lstReservacion.get(i));
            array[i][0] = lstReservacion.get(i).get_cliente().get_nombres()+" "+lstReservacion.get(i).get_cliente().get_apellidos();
            array[i][1] = lstReservacion.get(i).get_tamanio();
            array[i][2] = lstReservacion.get(i).get_fecha();
            array[i][3] = lstReservacion.get(i).getHora();
            array[i][4] = lstReservacion.get(i).get_descripcion();

        }
        return array;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Cliente \t |Tamaño \t |  Fecha \t | Hora \t| Descripcion \t | \n";
        for (int i = 0; i < lstReservacion.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstReservacion.get(i).get_cliente() + "\t |" +lstReservacion.get(i).get_tamanio() + "\t |" + lstReservacion.get(i).get_fecha() + "\t |" + lstReservacion.get(i).getHora() + "\t |" + lstReservacion.get(i).get_descripcion() + "\n";
        }
        return _resultado;
    }
    /**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */

    public String getInfoReporteCSV() {
        String _resultado = "Cliente ; Tamaño ; Fecha ; Hora; Descripcion ; \n";
        for (int i = 0; i < lstReservacion.size(); i++) {
            _resultado += lstReservacion.get(i).get_cliente() + ";" +lstReservacion.get(i).get_tamanio() + ";" + lstReservacion.get(i).get_fecha() + ";" + lstReservacion.get(i).getHora() + ";" + lstReservacion.get(i).get_descripcion() + ";\n";
        }
        return _resultado;
    }
    /**
     * Metodo para obtener reservacion por tamanio
     * @param tamanio
     * @return 
     */

    public ReservacionMesas obtenerReservacion(String tamanio) {
        ReservacionMesas ReservacionEncontrada = null;
        for (int i = 0; i < lstReservacion.size(); i++) {
            if (lstReservacion.get(i).get_tamanio() == tamanio) {
                ReservacionEncontrada = lstReservacion.get(i);
                break;
            }

        }
        return ReservacionEncontrada;
    }

    /**Metodo usado para generar el reporte en PDF
     * @author Cleymer Mendoza
     * @since 13/08/2020
     * @return 
     */
     public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstReservacion.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Cliente : " + this.lstReservacion.get(i).get_cliente().get_nombres() + "\n"
                    + "Tamaño : " + this.lstReservacion.get(i).get_tamanio() + "\n"
                    + "Fecha " + this.lstReservacion.get(i).get_fecha() + "\n"
                    + "Hora " + this.lstReservacion.get(i).getHora() + "\n"
                    + "Descripcion:  " + this.lstReservacion.get(i).get_descripcion() + "\n";
            
        }
        return retorno;
    }

}
