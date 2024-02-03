package Gestiones;

import java.util.LinkedList;

import Clases.Detalle_De_Factura;
import java.io.Serializable;

public class GestionDetalle_De_Factura implements Serializable{
	private LinkedList<Detalle_De_Factura> lstDetalle=new LinkedList<>();

	   public GestionDetalle_De_Factura() {
        super();

    }

    /**
     * Metodo para agregar detalles de compra a la facura
     *
     * @param detalle
     * @return true si funciona correctamente
     */
    public boolean Agregar(Detalle_De_Factura detalle) {
        if (BuscarPorCodigo(detalle.get_codigo()) == -1) { //El detalle no esta registrado
            lstDetalle.add(detalle);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo usado para buscar detalle de factura por codigo
     *
     * @param codigo
     * @return -1 si no lo encuentra, caso contrario retorna la posicion en la
     * coleccion
     */
    public int BuscarPorCodigo(int codigo) {
        int posicion = -1;
        for (int i = 0; i < lstDetalle.size(); i++) {
            if (lstDetalle.get(i).get_codigo() == codigo) {
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
    public Detalle_De_Factura Buscar(int codigo) {
        int posicion = BuscarPorCodigo(codigo);
        if (posicion == -1) {
            return null;
        } else {
            return lstDetalle.get(posicion);
        }
    }

    /**
     *
     * @param indice
     * @return
     */
    public boolean eliminarporIndice(int indice) {
        lstDetalle.remove(indice);
        return true;
    }

    /**
     * Metodo para modificar detalle en la factura
     *
     * @param nuevdetallef
     * @param posicion
     * @return
     */
    public boolean Modificar(Detalle_De_Factura nuevdetallef, int posicion) {
        if (posicion < 0 || posicion > lstDetalle.size()) {
            return false;
        } else {
            int posicionEncontrada = BuscarPorCodigo(nuevdetallef.get_codigo());
            if (posicionEncontrada == -1 || posicionEncontrada == posicion) {
                lstDetalle.set(posicion, nuevdetallef);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Metodo para obtener detalles en la factura
     *
     * @param Cantidad
     * @return true si funciona correctamente.
     */
    public Detalle_De_Factura obtenerdetalle(double Cantidad) {
        Detalle_De_Factura detalle_de_facturaEncontrado = null;
        for (int i = 0; i < lstDetalle.size(); i++) {
            if (lstDetalle.get(i).get_cantidad() == Cantidad) {
                detalle_de_facturaEncontrado = lstDetalle.get(i);
                break;
            }
        }
        return detalle_de_facturaEncontrado;
    }

    /**
     * Metodo para obtener detalle de factura por indice
     *
     * @param indice
     * @return
     */
    public Detalle_De_Factura getDetallefByIndex(int indice) {
        return lstDetalle.get(indice);
    }

    /**
     * Imprimir todos los elementos de la coleccion
     */
    public void imprimirTodos() {
        for (int i = 0; i < lstDetalle.size(); i++) {
            System.out.println(lstDetalle.get(i));
        }
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 10/08/2020
 * @return 
 */
    public Object[][] getArrayGestion() {
        Object[][] array = new Object[this.lstDetalle.size()][6];
        for (int i = 0; i < lstDetalle.size(); i++) {
            System.out.println(lstDetalle.get(i));
            array[i][0] = lstDetalle.get(i).get_codigo();
            array[i][1] = lstDetalle.get(i).get_postres().get_nombre();
            array[i][2] = lstDetalle.get(i).get_cantidad();
            array[i][3] = lstDetalle.get(i).get_precio();
            array[i][4] = lstDetalle.get(i).Subtotal();
            array[i][5] = lstDetalle.get(i).Total();

        }
        return array;
    }

    /**
     * Retorna el elemento de una coleccion segun su posicion
     *
     * @param posicion
     * @return un objeto de Detalle de Factura en la posicion de la colecion
     * lstDetalle
     */
    public Detalle_De_Factura getElementoPorposicion(int posicion) {
        return lstDetalle.get(posicion);
    }
/**
 * @author: Cleymer Elena Mendoza
 * @since 13/08/2020
 * @return 
 */
    public String getInfoReporte() {
        String _resultado = "Código \t | Postres \t |  Cantidad \t| Precio \t | Subtotal \t| \n";
        for (int i = 0; i < lstDetalle.size(); i++) {
            _resultado += "_________________________________________________________________________\n";
            _resultado += lstDetalle.get(i).get_codigo() + "\t |" + lstDetalle.get(i).get_postres()+"\t |"  + lstDetalle.get(i).get_cantidad() + "\t |" + lstDetalle.get(i).get_precio() + "\t |" + lstDetalle.get(i).Subtotal() + "\n";
        }
        return _resultado;
    }

    /**
     * Metodo para generar el reporte en excel
     * /**
 * @author: Cleymer Elena Mendoza
 * @since 13/08/2020
 * @return 
  
     */
    public String getInfoReporteCSV() {
        String _resultado = "Código ; Cantidad; Postres ; Precio; Subtotal ;\n";
        for (int i = 0; i < lstDetalle.size(); i++) {
            _resultado += lstDetalle.get(i).get_codigo() + ";"  +lstDetalle.get(i).get_cantidad()+";"+ lstDetalle.get(i).get_postres() + ";"+ lstDetalle.get(i).get_precio() + ";" + lstDetalle.get(i).Subtotal() + ";\n";
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
        tamanioLista = this.lstDetalle.size();//tamanio de la lista
        String retorno = "";
        for (i = 0; i < tamanioLista; i++) { //Iniciar un ciclo para recorrer toda la lista

            retorno += "Codigo : " + this.lstDetalle.get(i).get_codigo() + "\n"
                    + "Cantidad : " + this.lstDetalle.get(i).get_cantidad() + "\n"
                    + "Postres : " + this.lstDetalle.get(i).get_postres() + "\n"
                    + "Precio : " + this.lstDetalle.get(i).get_precio() + "\n"
                    + "Subtotal:  " + this.lstDetalle.get(i).Subtotal() + "\n";
            
        }
        return retorno;
    }



}


