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
public class Autor extends Bibliotecario {

    private ArrayList<Libro> librosEscritos;

    public Autor() {
        super();
    }

    public Autor(ArrayList<Libro> librosEscritos, String nombreUnico, String contraseña, String nombreCompleto, String tipoIdentificacion, String identificacion) {
        super(nombreUnico, contraseña, nombreCompleto, tipoIdentificacion, identificacion);
        this.librosEscritos = librosEscritos;
  
    }

    @Override
    public String toString() {
        return "Autor{" + "librosEscritos=" + librosEscritos + '}';
    }

}
