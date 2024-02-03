package Gestiones;

import java.util.LinkedList;

import Clases.Cargo;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

public class GestionCargo implements Serializable{
	private LinkedList<Cargo> lstCargo=new LinkedList<>();

	   public GestionCargo() {
        super();

    }

    /**
     * Metodo utilizado para agregar cargo
     *
     * @param cargo objeto de tipo cargo
     * @return true - si todo se realizo correctamente
     */
    public boolean Agregar(Cargo cargo) {
        if (BuscarPorCodigo(cargo.get_codigo()) == -1) { //El cargo no esta registrado
            lstCargo.add(cargo);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para eliminar cargo por el indice
     *
     * @param indice o posicion del cargo
     * @return true - si todo se realiz� correctamente , caso contrario retorna
     * false
     */
    public boolean Eliminar(int posicion) {
        if (posicion < 0 || posicion > lstCargo.size()) {
            return false;
        } else {
            lstCargo.remove(posicion);
            return true;
        }
    }

    /**
     * Metodo para modificar/reemplazar un elemento en la coleccion
     *
     * @param posicion o indice del elemento en la coleccion
     * @param nuevoCargo es el nuevo objeto que voy a reemplazar
     * @return true - si todo se realiz� correctamente , caso contrario retorna
     * false
     */
    public boolean Modificar(int posicion, Cargo nuevoCargo) {
        if (posicion < 0 || posicion > lstCargo.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevoCargo.get_codigo());

            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstCargo.set(posicion, nuevoCargo);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Metodo para buscar (otra forma que usaremos en el frm)
     *
     * @param codigo
     * @return
     */
    public Cargo Buscar(int codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstCargo.get(posicion);
        }
    }

    /**
     *
     * @param indice
     * @return
     */
    public Cargo getCargoByIndex(int indice) {
        return lstCargo.get(indice);
    }

    /**
     *
     * @param indice
     * @return
     */
    public boolean eliminarporIndice(int indice) {
        lstCargo.remove(indice);
        return true;
    }

    /**
     * Metodo para buscar por codigo de cargo
     *
     * @param codigo a buscar
     * @return -1 si no lo encuentra, caso contrario retorna la posici�n en la
     * coleccion
     */

    public int BuscarPorCodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstCargo.size(); i++) {
            if (lstCargo.get(i).get_codigo() == codigo) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     * Retorna el elemtno de una coleccion segun su posicion
     *
     * @param posicion del elemento a retornar
     * @return un objeto de cargo que esta en la posicion de la coleccion
     * lstCargo
     */
    public Cargo getElementoPorPosicion(int posicion) {
        return lstCargo.get(posicion);
    }

    /**
     * Imprimir todos los elementos en la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstCargo.size(); i++) {
            System.out.println(lstCargo.get(i));
        }
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstCargo.size()][2];
        for (int i = 0; i < lstCargo.size(); i++) {
            System.out.println(lstCargo.get(i));
            array[i][0] = lstCargo.get(i).get_codigo();
            array[i][1] = lstCargo.get(i).get_nombreCargo();

        }
        return array;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 14/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Código \t |   Nombre del Cargo \t | \n";
        for (int i = 0; i < lstCargo.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstCargo.get(i).get_codigo() + "\t |" + lstCargo.get(i).get_nombreCargo() + "\n";
        }
        return _resultado;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 14/08/2020
 * @return 
 */
    public String getInfoReporteCSV() {
        String _resultado = "Código ; Nombre de Cargo ;\n";
        for (int i = 0; i < lstCargo.size(); i++) {
            _resultado += lstCargo.get(i).get_codigo() + ";" + lstCargo.get(i).get_nombreCargo() + ";\n";
        }
        return _resultado;
    }
    /**
 * @author: Cleymer Elena Mendoza
 * @since 15/08/2020
 * @return 
 */
    public DefaultComboBoxModel getCboModel(){
            DefaultComboBoxModel model=new DefaultComboBoxModel();
            for(int i=0; i<lstCargo.size(); i++) {
                model.addElement(lstCargo.get(i).get_nombreCargo());
            }
            return model;
        }
/**
     * @author Cleymer Mendoza
     * @since 15/08/2020
     * @return 
     */
     public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstCargo.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Codigo : " + this.lstCargo.get(i).get_codigo() + "\n"
                    + "Nombre del Cargo " + this.lstCargo.get(i).get_nombreCargo() + "\n";     
        }
        return retorno;
    }

}
