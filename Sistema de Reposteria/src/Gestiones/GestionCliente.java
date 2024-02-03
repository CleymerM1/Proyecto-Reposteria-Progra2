package Gestiones;

import java.util.LinkedList;

import Clases.Cliente;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

public class GestionCliente implements Serializable{
	private LinkedList<Cliente> lstCliente=new LinkedList<>();

	   public GestionCliente() {
        super();
    }

    /**
     * Metodo para agregar clientes
     *
     * @param cliente
     * @return true si todo funciona correctamente.
     */
    public boolean agregar(Cliente cliente) {
        lstCliente.add(cliente);
        return true;
    }

    /**
     * Metodo para eliminar clientes por codigo
     *
     * @param codigo
     * @return true si todo funciona correctamente.
     */
    public boolean eliminarBycodigo(int codigo) {
        lstCliente.remove(codigo);
        return true;
    }

    /**
     * Metodo para obtener al Objeto Cliente por el codigo
     *
     * @param codigo
     * @return true si todo funciona correctamente.
     */
    public Cliente obtenerCliente(int codigo) {
        Cliente clienteEncontrado = null;
        for (int i = 0; i < lstCliente.size(); i++) {
            if (lstCliente.get(i).get_codigo() == codigo) {
                clienteEncontrado = lstCliente.get(i);
                break;
            }

        }
        return clienteEncontrado;
    }
 public Cliente obtenerCliente(String _nombre) {
		Cliente clienteEncontrado=null;
		for(int i=0;i<lstCliente.size(); i++) {
			if(lstCliente.get(i).get_nombres().toLowerCase().contains(_nombre.toLowerCase())){
				clienteEncontrado=lstCliente.get(i);
				break;
			}
			
		}
		return clienteEncontrado;
	}
    /**
     *
     * @param codigo
     * @return
     */
    public Cliente Buscar(int codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstCliente.get(posicion);
        }
    }

    /**
     * Metodo para obtener cliente por indice
     *
     * @param indice
     * @return
     */
    public Cliente getClienteByIndex(int indice) {
        return lstCliente.get(indice);
    }

    /**
     * Metodo para buscar al cliente por codigo
     *
     * @param codigo
     * @return
     */
    public int BuscarPorCodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstCliente.size(); i++) {
            if (lstCliente.get(i).get_codigo() == codigo) {
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
        lstCliente.remove(indice);
        return true;
    }

    /**
     * Metodo para modificar cliente
     *
     * @param nuevoCliente
     * @param posicion
     * @return
     */
    public boolean Modificar(Cliente nuevoCliente, int posicion) {
        if (posicion < 0 || posicion > lstCliente.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevoCliente.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstCliente.set(posicion, nuevoCliente);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Imprimir todos los elementos de la coleccion
     */
    public void imprimirTodos() {
        for (int i = 0; i < lstCliente.size(); i++) {
            System.out.println(lstCliente.get(i));

        }
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstCliente.size()][6];
        for (int i = 0; i < lstCliente.size(); i++) {
            System.out.println(lstCliente.get(i));
            array[i][0] = lstCliente.get(i).get_codigo();
            array[i][1] = lstCliente.get(i).get_nombres();
            array[i][2] = lstCliente.get(i).get_apellidos();
            array[i][3] = lstCliente.get(i).get_direccion();
            array[i][4] = lstCliente.get(i).get_identidad();
            array[i][5] = lstCliente.get(i).get_correoelectronico();

        }
        return array;
    }

    /**
     * Retorna el elemento de una coleccion segun su posicion
     *
     * @param posicion del elemento a retornar
     * @return un objeto de Client que esta en la posicion de la coleccion
     * lstCliente
     */
    public Cliente getElementoPorPosicion(int posicion) {
        return lstCliente.get(posicion);
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 14/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Código \t |   Nombres \t |  Apellidos \t| Identidad \t | Direccion \t|  Correo Electronico \t| \n";
        for (int i = 0; i < lstCliente.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstCliente.get(i).get_codigo() + "\t |" + lstCliente.get(i).get_nombres() + "\t |" + lstCliente.get(i).get_apellidos() + "\t |" + lstCliente.get(i).get_identidad() + "\t |" + lstCliente.get(i).get_direccion() + "\t |" + lstCliente.get(i).get_correoelectronico() + "\n";
        }
        return _resultado;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 14/08/2020
 * @return 
 */
    public String getInfoReporteCSV() {
        String _resultado = "Código ; Nombre ; Apellido; Identidad; Direccion; Correo Electronico ;\n";
        for (int i = 0; i < lstCliente.size(); i++) {
            _resultado += lstCliente.get(i).get_codigo() + ";" + lstCliente.get(i).get_nombres() + ";" + lstCliente.get(i).get_apellidos() + ";" + lstCliente.get(i).get_identidad() + ";" + lstCliente.get(i).get_direccion() + ";" + lstCliente.get(i).get_correoelectronico() + ";\n";
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
            for(int i=0; i<lstCliente.size(); i++) {
                model.addElement(lstCliente.get(i).get_nombres()+" "+lstCliente.get(i).get_apellidos());
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
        tamanioLista = this.lstCliente.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Codigo : " + this.lstCliente.get(i).get_codigo() + "\n"
                    + "Nombres : " + this.lstCliente.get(i).get_nombres() + "\n"
                    + "Apellidos : " + this.lstCliente.get(i).get_apellidos() + "\n"
                    + "Identidad : " + this.lstCliente.get(i).get_identidad() + "\n"
                    + "Direccion:  " + this.lstCliente.get(i).get_direccion() + "\n"
                    +"Correo Electronico: " + this.lstCliente.get(i).get_correoelectronico() +"\n";
                  
        }
        return retorno;
    }

}
