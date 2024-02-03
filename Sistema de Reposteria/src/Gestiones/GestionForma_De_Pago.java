package Gestiones;

import java.util.LinkedList;

import Clases.Forma_De_Pago;
import java.io.Serializable;

public class GestionForma_De_Pago implements Serializable{
	private LinkedList<Forma_De_Pago> lstForma=new LinkedList<>();

	   public GestionForma_De_Pago() {
        super();

    }

    /**
     * Metodo para agregar forma de pago
     *
     * @param forma_de_pago
     * @return true si funciona correctamente
     */
    public boolean Agregar(Forma_De_Pago forma_de_pago) {
        lstForma.add(forma_de_pago);
        return true;
    }

    /**
     * Metodo para obtener forma de pago
     *
     * @param codigo
     * @return true si funciona correctamente.
     */
    public Forma_De_Pago obtenerforma(int codigo) {
        Forma_De_Pago forma_de_pagoEncontrado = null;
        for (int i = 0; i < lstForma.size(); i++) {
            if (lstForma.get(i).get_codigo() == codigo) {
                forma_de_pagoEncontrado = lstForma.get(i);
                break;
            }
        }
        return forma_de_pagoEncontrado;
    }

    public Forma_De_Pago Buscar(int codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstForma.get(posicion);
        }
    }

    /**
     *@author Cleymer Elena Mendoza
     * @param indice
     * @return
     */
    public boolean eliminarporIndice(int indice) {
        lstForma.remove(indice);
        return true;
    }

    /**
     * Metodo para obtener forma de pago por indice
     *
     * @param indice
     * @return
     */
    public Forma_De_Pago getFormaPagoByIndex(int indice) {
        return lstForma.get(indice);
    }

    /**
     * Metodo para modificar forma de pago por indice
     *
     * @param nuevaforma
     * @param posicion
     * @return
     */
    public boolean Modificar(Forma_De_Pago nuevaforma, int posicion) {
        if (posicion < 0 || posicion > lstForma.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevaforma.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstForma.set(posicion, nuevaforma);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     *
     * @param codigo
     * @return
     */
    public int BuscarPorCodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstForma.size(); i++) {
            if (lstForma.get(i).get_codigo() == codigo) {
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
        for (int i = 0; i < lstForma.size(); i++) {
            System.out.println(lstForma.get(i));
        }
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstForma.size()][2];
        for (int i = 0; i < lstForma.size(); i++) {
            System.out.println(lstForma.get(i));
            array[i][0] = lstForma.get(i).get_codigo();
            array[i][1] = lstForma.get(i).get_metodo();
        }
        return array;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Código \t |   Metodo de Pago \t | \n";
        for (int i = 0; i < lstForma.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstForma.get(i).get_codigo() + "\t |" + lstForma.get(i).get_metodo() + "\n";
        }
        return _resultado;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */
    public String getInfoReporteCSV() {
        String _resultado = "Código ; Metodo de Pago ;\n";
        for (int i = 0; i < lstForma.size(); i++) {
            _resultado += lstForma.get(i).get_codigo() + ";" + lstForma.get(i).get_metodo() + ";\n";
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
        tamanioLista = this.lstForma.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Codigo : " + this.lstForma.get(i).get_codigo() + "\n"
                    + "Metodo de Pago:  " + this.lstForma.get(i).get_metodo() + "\n";
                    
            
        }
        return retorno;
    }


}
