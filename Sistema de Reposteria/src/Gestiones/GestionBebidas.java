package Gestiones;

import java.util.LinkedList;

import Clases.Bebidas;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

public class GestionBebidas implements Serializable{

	private LinkedList<Bebidas> lstBebidas=new LinkedList();

	   public GestionBebidas() {
        super();

    }

    /**
     * Metodo usado para agregar las diferentes bebidas que ofrecen
     *
     * @param codigo
     * @return true si todo funciona correctamente
     */
    public boolean Agregar(Bebidas codigo) {
        if (BuscarPorCodigo(codigo.get_codigo()) == -1) { //El codigo no esta registrado
            lstBebidas.add(codigo);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Metodo usado para obtener bebidas por codigo
     *
     * @param codigo
     * @return true si todo funciona correctamente.
     */
    public Bebidas obtenerBebidas(int codigo) {
        Bebidas bebidasEncontradas = null;
        for (int i = 0; i < lstBebidas.size(); i++) {
            if (lstBebidas.get(i).get_codigo() == codigo) {
                bebidasEncontradas = lstBebidas.get(i);
                break;
            }
        }
        return bebidasEncontradas;
    }
    public Bebidas obtenerBebidas(String _nombre) {
		Bebidas postreEncontrado=null;
		for(int i=0;i<lstBebidas.size(); i++) {
			if(lstBebidas.get(i).get_nombre().toLowerCase().contains(_nombre.toLowerCase())){
				postreEncontrado=lstBebidas.get(i);
				break;
			}
			
		}
		return postreEncontrado;
	}

    /**
     * Metodo para buscar bebida por codigo
     *
     * @param codigo
     * @return -1 si no lo encuentra, caso contrario retorna la posicion en la
     * coleccion
     */
    public int BuscarPorCodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstBebidas.size(); i++) {
            if (lstBebidas.get(i).get_codigo() == codigo) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     * Metodo para buscar
     *
     * @param codigo
     * @return
     */
    public Bebidas Buscar(int codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstBebidas.get(posicion);
        }
    }

    /**
     * Metodo para modificar bebida por posicion
     *
     * @param Bebidas
     * @param posicion
     * @return true si todo funciona correctamente
     */
    public boolean Modificar(Bebidas nuevaBebida, int posicion) {
        if (posicion < 0 || posicion > lstBebidas.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevaBebida.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstBebidas.set(posicion, nuevaBebida);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     *
     */
    public boolean eliminarporIndice(int indice) {
        lstBebidas.remove(indice);
        return true;
    }

    /**
     * Metodo para obtener bebidas por indice
     *
     * @param indice
     * @return
     */
    public Bebidas getBebidasByIndex(int indice) {
        return lstBebidas.get(indice);
    }

    public Bebidas getElementoPorPosicion(int posicion) {
        return lstBebidas.get(posicion);
    }

    /**
     * Imprimir todos los elementos de la coleccion
     */
    public void imprimirTodos() {
        for (int i = 0; i < lstBebidas.size(); i++) {
            System.out.println(lstBebidas.get(i));
        }
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstBebidas.size()][5];
        for (int i = 0; i < lstBebidas.size(); i++) {
            System.out.println(lstBebidas.get(i));
            array[i][0] = lstBebidas.get(i).get_codigo();
            array[i][1] = lstBebidas.get(i).get_nombre();
            array[i][2] = lstBebidas.get(i).get_tamanio();
            array[i][3] = lstBebidas.get(i).get_descripcion();
            array[i][4] = lstBebidas.get(i).get_precio();

        }
        return array;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 14/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Código \t |   Nombre \t |  Tamaño \t| Descripcion \t | Precio \t| \n";
        for (int i = 0; i < lstBebidas.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstBebidas.get(i).get_codigo() + "\t |" + lstBebidas.get(i).get_nombre() + "\t |" + lstBebidas.get(i).get_tamanio() + lstBebidas.get(i).get_descripcion() + "\t |" + lstBebidas.get(i).get_precio() + "\n";
        }
        return _resultado;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 14/08/2020
 * @return 
 */
    public String getInfoReporteCSV() {
        String _resultado = "Código ; Nombre ; Tamaño; Descripcion; Precio ;\n";
        for (int i = 0; i < lstBebidas.size(); i++) {
            _resultado += lstBebidas.get(i).get_codigo() + ";" + lstBebidas.get(i).get_nombre() + ";" + lstBebidas.get(i).get_tamanio() + ";" + lstBebidas.get(i).get_descripcion() + ";" + lstBebidas.get(i).get_precio() + ";\n";
        }
        return _resultado;
    }
    /**
 * @author: Cleymer Elena Mendoza
 * @since 14/08/2020
 * @return 
 */
    public DefaultComboBoxModel getCboModel(){
            DefaultComboBoxModel model=new DefaultComboBoxModel();
            for(int i=0; i<lstBebidas.size(); i++) {
                model.addElement(lstBebidas.get(i).get_nombre());
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
        tamanioLista = this.lstBebidas.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Codigo : " + this.lstBebidas.get(i).get_codigo() + "\n"
                    + "Nombre " + this.lstBebidas.get(i).get_nombre() + "\n"
                    + "Descripcion " + this.lstBebidas.get(i).get_descripcion() + "\n"
                    + "Tamaño " + this.lstBebidas.get(i).get_tamanio() + "\n"
                    + "Precio:  " + this.lstBebidas.get(i).get_precio() + "\n";
                   

        }
        return retorno;
    }

}
