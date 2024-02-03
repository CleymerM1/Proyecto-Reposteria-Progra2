package Gestiones;

import java.util.LinkedList;

import Clases.Empleado;
import java.io.Serializable;
import javax.swing.DefaultComboBoxModel;

public class GestionEmpleado implements Serializable{
	private LinkedList<Empleado> lstEmpleado=new LinkedList<>();
	   public GestionEmpleado() {
        super();
    }

    public LinkedList<Empleado> getLstEmpleado() {
        return lstEmpleado;
    }

    /**
     * Metodo utilizado para agregar empleado
     *
     * @param codigo objeto de tipo empleado
     * @return true - si todo se realizo correctamente , caso contrario retorna
     * false
     */
    public boolean Agregar(Empleado codigo) {
        if (BuscarPorCodigo(codigo.get_codigo()) == -1) { //Si el empleado no esta registrado
            lstEmpleado.add(codigo);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para eliminar empleado por el �ndice
     *
     * @param indice o posicion del empleado
     * @return true - si todo se realizo correctamente , caso contrario retorna
     * false
     */
    public boolean Eliminar(int posicion) {
        if (posicion < 0 || posicion > lstEmpleado.size()) {
            return false;
        } else {
            lstEmpleado.remove(posicion);
            return true;
        }
    }

    /**
     *
     * @param indice
     * @return
     */
    public boolean eliminarporIndice(int indice) {
        lstEmpleado.remove(indice);
        return true;
    }

    public Empleado Buscar(int codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstEmpleado.get(posicion);
        }
    }

    /**
     * Metodo para modificar un elemento en la coleccion
     *
     * @param posicion del elemento en la coleccion
     * @param nuevoEmpleado es el nuevo objeto que se va a reemplazar
     * @return true si todo se realizo correctamente , caso contrario retorna
     * false
     */
    public boolean Modificar(int posicion, Empleado nuevoEmpleado) {
        if (posicion < 0 || posicion > lstEmpleado.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevoEmpleado.get_codigo());

            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstEmpleado.set(posicion, nuevoEmpleado);
                return true;
            } else {
                return false;
            }
        }

    }

    /**
     * Metodo para buscar por nombre de empleado
     *
     * @param codigo a buscar
     * @return -1 si no lo encuentra, caso contrario retorna la posicion en la
     * coleccion
     */
    public int BuscarPorCodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstEmpleado.size(); i++) {
            if (lstEmpleado.get(i).get_codigo() == codigo) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    public Empleado getEmpleadoByIndex(int indice) {
        return lstEmpleado.get(indice);
    }

    /**
     * Imprimir todos los elementos de la coleccion
     */
    public void imprimirTodos() {
        for (int i = 0; i < lstEmpleado.size(); i++) {
            System.out.println(lstEmpleado.get(i));
        }
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstEmpleado.size()][7];
        for (int i = 0; i < lstEmpleado.size(); i++) {
            System.out.println(lstEmpleado.get(i));
            array[i][0] = lstEmpleado.get(i).get_codigo();
            array[i][1] = lstEmpleado.get(i).get_nombres();
            array[i][2] = lstEmpleado.get(i).get_apellidos();
            array[i][3] = lstEmpleado.get(i).get_telefono();
            array[i][4] = lstEmpleado.get(i).get_identidad();
            array[i][5] = lstEmpleado.get(i).get_sueldo();
            array[i][6] = lstEmpleado.get(i).get_cargo().get_nombreCargo();

        }
        return array;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 12/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Código \t |   Nombres \t |  Apellidos \t| Telefono \t | Identidad \t|  Sueldo \t|  Cargo \t| \n";
        for (int i = 0; i < lstEmpleado.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstEmpleado.get(i).get_codigo() + "\t |" + lstEmpleado.get(i).get_nombres() + "\t |" + lstEmpleado.get(i).get_apellidos() + "\t |" + lstEmpleado.get(i).get_telefono() + "\t |" + lstEmpleado.get(i).get_identidad() + "\t |" + lstEmpleado.get(i).get_sueldo() + "\t|" + lstEmpleado.get(i).get_cargo() + "\n";
        }
        return _resultado;
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 12/08/2020
 * @return 
 */
    public String getInfoReporteCSV() {
        String _resultado = "Código ; Nombre ; Apellido; Telefono; Identidad; Sueldo; Cargo ;\n";
        for (int i = 0; i < lstEmpleado.size(); i++) {
            _resultado += lstEmpleado.get(i).get_codigo() + ";" + lstEmpleado.get(i).get_nombres() + ";" + lstEmpleado.get(i).get_apellidos() + ";" + lstEmpleado.get(i).get_telefono() + ";" + lstEmpleado.get(i).get_identidad() + ";" + lstEmpleado.get(i).get_sueldo() + ";" + lstEmpleado.get(i).get_cargo() + ";\n";
        }
        return _resultado;
    }
    /**
 * @author: Cleymer Elena Mendoza
 * @since 12/08/2020
 * @return 
 */
    
    public DefaultComboBoxModel getComboBoxModel(){
            DefaultComboBoxModel model1=new DefaultComboBoxModel();
            for(int i=0; i<lstEmpleado.size(); i++) {
                model1.addElement(lstEmpleado.get(i).get_nombres());
            }
            return model1;
        }

    /**
     * Retorna el elemento de una coleccion segun su posicion
     *
     * @param posicion
     * @return un objeto de Empleado que esta en la posicion de la coleccion
     * lstEmpleado
     */
    public Empleado getElementoPorPosicion(int posicion) {
        return lstEmpleado.get(posicion);
    }
    /**Metodo usado para generar el reporte en PDF
     * @author Cleymer Mendoza
     * @since 13/08/2020
     * @return 
     */
     public String getInformacionGestion() {
        int i, tamanioLista;
        tamanioLista = this.lstEmpleado.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Codigo : " + this.lstEmpleado.get(i).get_codigo() + "\n"
                    + "Nombres :" + this.lstEmpleado.get(i).get_nombres() + "\n"
                    + "Apellidos : " + this.lstEmpleado.get(i).get_apellidos() + "\n"
                    + "Telefono : " + this.lstEmpleado.get(i).get_telefono() + "\n"
                    + "Direccion :  " + this.lstEmpleado.get(i).get_direccion() + "\n"
                    + "Sueldo : " + this.lstEmpleado.get(i).get_sueldo() +"\n"
                    + "Cargo : "+ this.lstEmpleado.get(i).get_cargo().get_nombreCargo() +"\n";
            
        }
        return retorno;
    }


}
