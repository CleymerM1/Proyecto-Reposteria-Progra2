package Gestiones;

import java.util.LinkedList;

import Clases.Servicio;
import java.io.Serializable;

public class GestionServicio implements Serializable{
	private LinkedList<Servicio> lstServicio=new LinkedList<>();

	   public GestionServicio() {
        super();

    }

    /**
     * Metodo usado para agregar el servicio que ofrecen
     *
     * @param servicio
     * @return true si todo funciona correctamente
     */
    public boolean Agregar(Servicio servicio) {
        lstServicio.add(servicio);
        return true;
    }

    /**
     * Metodo usado para buscar el servicio por codigo
     *
     * @param codigo
     * @return -1 si no lo encuentra, caso contrario retorna la posicion en la
     * coleccion
     */
    public int BuscarPorCodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstServicio.size(); i++) {
            if (lstServicio.get(i).get_codigo() == codigo) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**Metodo para buscar servicio por codigo
     *@author Cleymer Mendoza
     * @param codigo
     * @return
     */
    public Servicio Buscar(int codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstServicio.get(posicion);
        }
    }

    /**
     * Metodo para modificar servicio por posicion
     *@author Cleymer Mendoza
     * @param nuevoServicio
     * @param posicion
     * @return
     */
    public boolean Modificar(Servicio nuevoServicio, int posicion) {
        if (posicion < 0 || posicion > lstServicio.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevoServicio.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstServicio.set(posicion, nuevoServicio);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Metodo usado para eliminar el servicio por posicion
     *
     * @param posicion
     * @return true si todo funciona correctamente
     */
    public boolean Eliminar(int posicion) {
        if (posicion < 0 || posicion > lstServicio.size()) {
            return false;
        } else {
            lstServicio.remove(posicion);
            return true;
        }
    }

    public Servicio getServicioByIndex(int indice) {
        return lstServicio.get(indice);
    }

    /**
     *
     * @param indice
     * @return
     */
    public boolean eliminarporIndice(int indice) {
        lstServicio.remove(indice);
        return true;
    }

    /**
     * Retorna el elemento de una coleccion segun su posicion
     *@author Cleymer Mendoza
     * @param posicion
     * @return un objeto de Servicio que esta en la posicion de la coleccion
     * lstServicio
     */
    public Servicio getElementoPorPosicion(int posicion) {
        return lstServicio.get(posicion);
    }

    /**
     * Imprimir todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstServicio.size(); i++) {
            System.out.println(lstServicio.get(i));
        }
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstServicio.size()][2];
        for (int i = 0; i < lstServicio.size(); i++) {
            System.out.println(lstServicio.get(i));
            array[i][0] = lstServicio.get(i).get_codigo();
            array[i][1] = lstServicio.get(i).get_descripcion();

        }
        return array;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Código \t |  Tipo de Servicio \t | \n";
        for (int i = 0; i < lstServicio.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstServicio.get(i).get_codigo() + "\t |" + lstServicio.get(i).get_descripcion() + "\n";
        }
        return _resultado;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */
    public String getInfoReporteCSV() {
        String _resultado = "Código ; Tipo de Servicio ;\n";
        for (int i = 0; i < lstServicio.size(); i++) {
            _resultado += lstServicio.get(i).get_codigo() + ";" + lstServicio.get(i).get_descripcion() + ";\n";
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
        tamanioLista = this.lstServicio.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Codigo : " + this.lstServicio.get(i).get_codigo() + "\n"
                    + "Tipo de Servicio " + this.lstServicio.get(i).get_descripcion() + "\n";
            
        }
        return retorno;
    }

}
