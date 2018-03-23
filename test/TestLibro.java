/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Libro;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniela
 */
public class TestLibro {
    
    public static Libro libro;
    
    public TestLibro() {
    }
    
 @Before
    public static void setUpBeforeClass() {
        libro = new Libro();
    }

    @Test
     public void testSetGetNombreUnico() {
        String nombreCompletoNuevo = "Roberto";
        libro.setNombreUnico(nombreCompletoNuevo);
        String retorno = libro.getNombreUnico();
        assertEquals(nombreCompletoNuevo, retorno);
}
     
     @Test
     public void testSetGetContraseña() {
        String contraseñaNueva = "Ronaldo123";
        libro.setContraseña(contraseñaNueva);
        String retorno = libro.getContraseña();
        assertEquals(contraseñaNueva, retorno);
}
     
     @Test
     public void testSetGetTipoIdentificacion() {
        String tipoIdentificacionNueva = "pasaporte";
        libro.setTipoIdentificacion(tipoIdentificacionNueva);
        String retorno = libro.getTipoIdentificacion();
        assertEquals(tipoIdentificacionNueva,retorno);
}
}
