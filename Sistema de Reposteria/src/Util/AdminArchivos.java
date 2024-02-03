/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Arkoses_as
 */
public class AdminArchivos {
    private String nombreArchivo;
    private String contenido;
    public  void escribir() {
        File f;
        f = new File("Reportes\\"+nombreArchivo);
        //Escritura
        try {
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
             //Escribimos en el fichero
            bw.write(getContenido());
            //Guardamos los cambios del fichero
            bw.flush();
            bw.close();
        } catch (IOException e) {
        };
    }

    public void lectura() {
        try {
            FileReader input = new FileReader("Reportes\\"+this.nombreArchivo);
            int c =0;
            while (c != -1) {
                c = input.read();
                System.out.print((char)c);
            }
            input.close();
        } catch (IOException ex) {
            System.out.println("Error "+ex.getMessage());
        }
    }

    /**
     * @return the nombreArchivo
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * @param nombreArchivo the nombreArchivo to set
     */
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
