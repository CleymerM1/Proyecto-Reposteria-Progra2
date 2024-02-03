package Gestiones;

import java.util.LinkedList;


import Clases.Postres;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

public class GestionPostres implements Serializable{

	private LinkedList<Postres> lstPostres=new LinkedList<>();

	   public GestionPostres() {
        super();

    }

    /**
     * Metodo usado para agregar postres por codigo
     *
     * @param postres
     * @return true si todo funciona correctamente
     */
    public boolean Agregar(Postres codigo) {
        if (BuscarPorCodigo(codigo.get_codigo()) == -1) { //El codigo no esta registrado
            lstPostres.add(codigo);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Metodo usado para buscar al postre por el codigo
     *
     * @param codigo
     * @return -1 si no lo encuentra, caso contrario retorna la posicion en la
     * coleccion
     */
    public int BuscarPorCodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstPostres.size(); i++) {
            if (lstPostres.get(i).get_codigo() == codigo) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     *Metodo para buscar los postres por el codigo
     * @author Cleymer Mendoza
     * @param codigo
     * @return
     */
    public Postres Buscar(int codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstPostres.get(posicion);
        }
    }

    /**
     *Metodo para eliminar por indice
     * @author Cleymer Mendoza
     * @param indice
     * @return
     */
    public boolean eliminarporIndice(int indice) {
        lstPostres.remove(indice);
        return true;
    }

    /**
     * Metodo para modificar un elemento en la coleccion
     *
     * @param posicion
     * @param nuevoPostre es el nuevo objeto que se va a reemplazar
     * @return true si todo funciona correctamente
     */
    public boolean Modificar(int posicion, Postres nuevoPostre) {
        if (posicion < 0 || posicion > lstPostres.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevoPostre.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstPostres.set(posicion, nuevoPostre);
                return true;
            } else {
                return false;
            }
        }
    }


    /**
     * Metodo usado para eliminar postres por el indice
     *
     * @param posicion
     * @return true si todo se realizo correctamente
     */
    public boolean Eliminar(int posicion) {
        if (posicion < 0 || posicion > lstPostres.size()) {
            return false;
        } else {
            lstPostres.remove(posicion);
            return true;
        }
    }

    /**
     * Imprimir todos los elementos de la coleccion
     */
    public void ImprimirTodos() {
        for (int i = 0; i < lstPostres.size(); i++) {
            System.out.println(lstPostres.get(i));
        }
    }

    /**
     * Retorna el elemento de una coleccion segun su posicion
     *
     * @param posicion
     * @return un objeto de Postres que esta en la posicion de la coleccion
     * lstPostres
     */
    public Postres getElementoPorPosicion(int posicion) {
        return lstPostres.get(posicion);
    }

    /**
     * Metodo para obtener postres por codigo
     * @author Cleymer Mendoza
     * @param codigo
     * @return
     */
    public Postres obtenerPostres(int codigo) {
        Postres postreEncontrado = null;
        for (int i = 0; i < lstPostres.size(); i++) {
            if (lstPostres.get(i).get_codigo() == codigo) {
                postreEncontrado = lstPostres.get(i);
                break;
            }
        }
        return postreEncontrado;
    }
    /**
     * Metodo para obtener postres por nombre
     * @author Cleymer Mendoza
     * @param _nombre
     * @return 
     */
    public Postres obtenerPostre(String _nombre) {
		Postres postreEncontrado=null;
		for(int i=0;i<lstPostres.size(); i++) {
			if(lstPostres.get(i).get_nombre().toLowerCase().contains(_nombre.toLowerCase())){
				postreEncontrado=lstPostres.get(i);
				break;
			}
			
		}
		return postreEncontrado;
	}
	

    /**
     *
     * @param indice
     * @return
     */
    public Postres getPostresByIndex(int indice) {
        return lstPostres.get(indice);
    }

    /**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstPostres.size()][5];
        for (int i = 0; i < lstPostres.size(); i++) {
            System.out.println(lstPostres.get(i));
            array[i][0] = lstPostres.get(i).get_codigo();
            array[i][1] = lstPostres.get(i).get_nombre();
            array[i][2] = lstPostres.get(i).get_tamanio();
            array[i][3] = lstPostres.get(i).get_sabor();
            array[i][4] = lstPostres.get(i).get_precio();

        }
        return array;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 12/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Código \t |   Nombre \t |  Tamaño \t| Sabor \t | Precio \t| \n";
        for (int i = 0; i < lstPostres.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstPostres.get(i).get_codigo() + "\t |" + lstPostres.get(i).get_nombre() + "\t |" + lstPostres.get(i).get_tamanio() + lstPostres.get(i).get_sabor() + "\t |" + lstPostres.get(i).get_precio() + "\n";
        }
        return _resultado;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 12/08/2020
 * @return 
 */
    public String getInfoReporteCSV() {
        String _resultado = "Código ; Nombre ; Tamaño; Sabor; Precio ;\n";
        for (int i = 0; i < lstPostres.size(); i++) {
            _resultado += lstPostres.get(i).get_codigo() + ";" + lstPostres.get(i).get_nombre() + ";" + lstPostres.get(i).get_tamanio() + ";" + lstPostres.get(i).get_sabor() + ";" + lstPostres.get(i).get_precio() + ";\n";
        }
        return _resultado;
    }
    /**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */
    public DefaultComboBoxModel getCboModel(){
            DefaultComboBoxModel model=new DefaultComboBoxModel();
            for(int i=0; i<lstPostres.size(); i++) {
                model.addElement(lstPostres.get(i).get_nombre());
            }
            return model;
        }
    /**
     * @author Cleymer Mendoza
     * @since 13/08/2020
     * @return 
     */
         public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstPostres.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Codigo : " + this.lstPostres.get(i).get_codigo() + "\n"
                    + "Nombre " + this.lstPostres.get(i).get_nombre() + "\n"
                    + "Sabor " + this.lstPostres.get(i).get_sabor() + "\n"
                    + "Tamaño " + this.lstPostres.get(i).get_tamanio() + "\n"
                    + "Precio:  " + this.lstPostres.get(i).get_precio() + "\n";
            
        }
        return retorno;
    }

         
}