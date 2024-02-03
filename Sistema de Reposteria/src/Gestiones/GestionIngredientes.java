package Gestiones;

import java.util.LinkedList;

import Clases.Ingredientes;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

public class GestionIngredientes implements Serializable{
	private LinkedList<Ingredientes> lstIngredientes=new LinkedList<>();

	   public GestionIngredientes() {
        super();
    }

    /**
     * Metodo para agregar ingredientes
     *
     * @param ingredientes
     * @return
     */
    public boolean agregar(Ingredientes ingredientes) {
        lstIngredientes.add(ingredientes);
        return true;
    }

    /**
     * Metodo para obtener ingredientes por codigo
     *
     * @param codigoIngrediente
     * @return true si funciona correctamente.
     */
    public Ingredientes obtenerIngrediente(int codigoIngrediente) {
        Ingredientes IngredienteEncontrado = null;
        for (int i = 0; i < lstIngredientes.size(); i++) {
            if (lstIngredientes.get(i).get_codigo() == codigoIngrediente) {
                IngredienteEncontrado = lstIngredientes.get(i);
                break;
            }

        }
        return IngredienteEncontrado;
    }

    public Ingredientes Buscar(int codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstIngredientes.get(posicion);
        }
    }

    /**
     * Metodo para buscar ingredientes por codigo
     *
     * @param codigo
     * @return
     */
    public int BuscarPorCodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstIngredientes.size(); i++) {
            if (lstIngredientes.get(i).get_codigo() == codigo) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     *
     * @param indice
     * @return
     */
    public boolean eliminarporIndice(int indice) {
        lstIngredientes.remove(indice);
        return true;
    }

    /**
     * Metodo para obtener ingredientes por indice
     *
     * @param indice
     * @return
     */
    public Ingredientes getIngredientesByIndex(int indice) {
        return lstIngredientes.get(indice);
    }
/**
 * Metodo para modificar ingrediente por posicion
 * @author Cleymer Elena Mendoza
 * @param nuevoingrediente
 * @param posicion
 * @return 
 */
    public boolean Modificar(Ingredientes nuevoingrediente, int posicion) {
        if (posicion < 0 || posicion > lstIngredientes.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevoingrediente.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstIngredientes.set(posicion, nuevoingrediente);
                return true;
            } else {
                return false;
            }
        }
    }
    /**
     * Metodo para obtener ingredientes por nombre
     * @author Cleymer Elena Mendoza
     * @param _nombre
     * @return 
     */
    public Ingredientes obtenerIngrediente(String _nombre) {
		Ingredientes ingredienteEncontrado=null;
		for(int i=0;i<lstIngredientes.size(); i++) {
			if(lstIngredientes.get(i).get_nombre().toLowerCase().contains(_nombre.toLowerCase())){
				ingredienteEncontrado=lstIngredientes.get(i);
				break;
			}
			
		}
		return ingredienteEncontrado;
	}

    /**
     * Imprimir todos los elementos de la coleccion
     */
    public void imprimirTodos() {
        for (int i = 0; i < lstIngredientes.size(); i++) {
            System.out.println(lstIngredientes.get(i));

        }
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstIngredientes.size()][4];
        for (int i = 0; i < lstIngredientes.size(); i++) {
            System.out.println(lstIngredientes.get(i));
            array[i][0] = lstIngredientes.get(i).get_codigo();
            array[i][1] = lstIngredientes.get(i).get_nombre();
            array[i][2] = lstIngredientes.get(i).get_preciocosto();
            array[i][3] = lstIngredientes.get(i).get_precioventa();

        }
        return array;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Código \t |  Nombre \t | Precio de Costo \t| Precio de Venta \t | \n";
        for (int i = 0; i < lstIngredientes.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstIngredientes.get(i).get_codigo() + "\t |" + lstIngredientes.get(i).get_nombre() + "\t |" + lstIngredientes.get(i).get_preciocosto() + "\t |" + lstIngredientes.get(i).get_precioventa() + "\n";
        }
        return _resultado;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */
    public String getInfoReporteCSV() {
        String _resultado = "Código ; Nombre ; Precio de Costo; Precio de Venta; \n";
        for (int i = 0; i < lstIngredientes.size(); i++) {
            _resultado += lstIngredientes.get(i).get_codigo() + ";" + lstIngredientes.get(i).get_nombre() + ";" + lstIngredientes.get(i).get_preciocosto() + ";" + lstIngredientes.get(i).get_precioventa() + ";\n";
        }
        return _resultado;
    }
    /**
 * @author: Cleymer Elena Mendoza
 * @since 12/08/2020
 * @return 
 */
    public DefaultComboBoxModel getCboModel(){
            DefaultComboBoxModel model=new DefaultComboBoxModel();
            for(int i=0; i<lstIngredientes.size(); i++) {
                model.addElement(lstIngredientes.get(i).get_nombre());
            }
            return model;
        }
    /**Metodo usado para generar el reporte en PDF
     * @author Cleymer Mendoza
     * @since 13/08/2020
     * @return 
     */
     public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstIngredientes.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Codigo : " + this.lstIngredientes.get(i).get_codigo() + "\n"
                    + "Nombre : " + this.lstIngredientes.get(i).get_nombre() + "\n"
                    + "Precio Costo:  " + this.lstIngredientes.get(i).get_preciocosto() + "\n"
                    + "Precio Venta: " + this.lstIngredientes.get(i).get_precioventa() + "\n";
        }
        return retorno;
    }


}
