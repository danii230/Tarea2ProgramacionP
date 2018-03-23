/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author daniela
 */
public class Bibliotecario extends DatosGenerales{

    public Bibliotecario() {
    }

    public Bibliotecario(String nombreUnico, String contraseña, String nombreCompleto, String tipoIdentificacion, String identificacion) {
        super(nombreUnico, contraseña, nombreCompleto, tipoIdentificacion, identificacion);
    }
   
}
