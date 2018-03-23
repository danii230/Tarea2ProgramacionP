/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author daniela
 */
public class Usuario extends DatosGenerales{
    
    private ArrayList<Libro> librosPrestados;

    public Usuario() {
    }
    
    
    
    public Usuario(String nombreUnico, String contraseña, String nombreCompleto, String tipoIdentificacion, String identificacion, ArrayList<Libro> librosPrestados) {
        super(nombreUnico, contraseña, nombreCompleto, tipoIdentificacion, identificacion);
        this.librosPrestados= librosPrestados;
    }
    
     @Override
    public String toString() {
        return "Usuario{" + "librosPrestados=" + librosPrestados + '}';
    }

}
