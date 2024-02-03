package Gestiones;

import java.util.LinkedList;

import Clases.Proveedor;
import java.io.Serializable;

public class GestionProveedor implements Serializable{

	private LinkedList<Proveedor> lstProveedor=new LinkedList<>();

	   public GestionProveedor() {
        super();

    }

    /**
     * Metodo para agregar proveedores
     *
     * @param proveedor
     * @return true si todo funciona correctamente
     */
    public boolean agregar(Proveedor proveedor) {
        lstProveedor.add(proveedor);
        return true;

    }

    /**
     * Metodo usado para obtener proveedor por nombre de empresa
     *@author Cleymer Elena Mendoza
     * @param nombreEmpresaa
     * @return true si todo funciona correctamente.
     */
    public Proveedor obtenerProveedor(String _nombre) {
		Proveedor proveedorEncontrado=null;
		for(int i=0;i<lstProveedor.size(); i++) {
			if(lstProveedor.get(i).get_nombres().toLowerCase().contains(_nombre.toLowerCase())){
				proveedorEncontrado=lstProveedor.get(i);
				break;
			}
			
		}
		return proveedorEncontrado;
	}

    /**
     * Metodo para buscar proveedor por nombre
     *@author Cleymer Elena Mendoza
     * @param codigo
     * @return
     */
    public int BuscarPorCodigo(String codigo) {
        int posicion = -1;
        for (int i = 0; i < lstProveedor.size(); i++) {
            if (lstProveedor.get(i).get_codigo().equals(codigo)) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    /**
     *
     * @param codigo
     * @return
     */
    public Proveedor Buscar(String codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstProveedor.get(posicion);
        }
    }
    

    /**
     * Metodo para modificar proveedor por posicion
     *@author Cleymer Elena Mendoza
     * @param nuevoproveedor
     * @param posicion
     * @return
     */
    public boolean Modificar(Proveedor nuevoproveedor, int posicion) {
        if (posicion < 0 || posicion > lstProveedor.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevoproveedor.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstProveedor.set(posicion, nuevoproveedor);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Metodo usado para eliminar al proveedor por posicion
     *
     * @param posicion
     * @return true si todo funciona correctamente.
     */
    public boolean Eliminar(int posicion) {
        if (posicion < 0 || posicion > lstProveedor.size()) {
            return false;
        } else {
            lstProveedor.remove(posicion);
            return true;
        }
    }

    /**
     * Metodo para obtener el proveedor por el indice
     * @param indice
     * @return
     */
    public Proveedor getProveedorByIndex(int indice) {
        return lstProveedor.get(indice);
    }

    /**
     * Metodo para eliminar por indice
     * @param indice
     * @return
     */
    public boolean eliminarporIndice(int indice) {
        lstProveedor.remove(indice);
        return true;
    }

    /**
     * Imprimir todos los elementos de la coleccion
     */
    public void imprimirTodos() {
        for (int i = 0; i < lstProveedor.size(); i++) {
            System.out.println(lstProveedor.get(i));
        }
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstProveedor.size()][5];
        for (int i = 0; i < lstProveedor.size(); i++) {
            System.out.println(lstProveedor.get(i));
            array[i][0] = lstProveedor.get(i).get_codigo();
            array[i][1] = lstProveedor.get(i).get_nombres();
            array[i][2] = lstProveedor.get(i).get_apellidos();
            array[i][3] = lstProveedor.get(i).get_nombreEmpresa();
            array[i][4] = lstProveedor.get(i).get_ingredientes().get_nombre();

        }
        return array;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Codigo \t |   Nombres \t |   Apellidos \t |  Nombre de Empresa \t| Ingredientes \t | \n";
        for (int i = 0; i < lstProveedor.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstProveedor.get(i).get_codigo() + "\t |" +lstProveedor.get(i).get_nombres() + "\t |" + lstProveedor.get(i).get_apellidos() + "\t |" + lstProveedor.get(i).get_nombreEmpresa() + lstProveedor.get(i).get_ingredientes() + "\n";
        }
        return _resultado;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 11/08/2020
 * @return 
 */
    public String getInfoReporteCSV() {
        String _resultado = "Codigo; Nombres ; Apellidos ; Nombre de Empresa; Ingredientes ;\n";
        for (int i = 0; i < lstProveedor.size(); i++) {
            _resultado += lstProveedor.get(i).get_codigo() + ";" +lstProveedor.get(i).get_nombres() + ";" + lstProveedor.get(i).get_apellidos() + ";" + lstProveedor.get(i).get_nombreEmpresa() + ";" + lstProveedor.get(i).get_ingredientes() + ";\n";
        }
        return _resultado;
    }
    
    /**
     * Retorna el elemento de una coleccion segun su posicion
     *
     * @param posicion
     * @return un objeto de Proveedor que esta en la posicion de la coleccion
     * lstProveedor
     */
    public Proveedor getElementoPorPosicion(int posicion) {
        return lstProveedor.get(posicion);
    }
   /**Metodo usado para generar el reporte en PDF
     * @author Cleymer Mendoza
     * @since 13/08/2020
     * @return 
     */
     public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstProveedor.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Codigo : " + this.lstProveedor.get(i).get_codigo() + "\n"
                    + "Nombres " + this.lstProveedor.get(i).get_nombres() + "\n"
                    + "Apellidos " + this.lstProveedor.get(i).get_apellidos() + "\n"
                    + "Nombre de la Empresa " + this.lstProveedor.get(i).get_nombreEmpresa() + "\n"
                    + "Ingredientes:  " + this.lstProveedor.get(i).get_ingredientes().get_nombre() + "\n";
            
        }
        return retorno;
    }

}
