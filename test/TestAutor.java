/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Autor;
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
public class TestAutor {
    
    public static Autor autor;
    
    public TestAutor() {
    }
    
    @Before
    public static void setUpBeforeClass() {
        autor = new Autor();
    }

   
     @Test
     public void testSetGetNombreUnico() {
        String nombreCompletoNuevo = "Roberto";
        autor.setNombreUnico(nombreCompletoNuevo);
        String retorno = autor.getNombreUnico();
        assertEquals(nombreCompletoNuevo, retorno);
}
     
     @Test
     public void testSetGetContraseña() {
        String contraseñaNueva = "Ronaldo123";
        autor.setContraseña(contraseñaNueva);
        String retorno = autor.getContraseña();
        assertEquals(contraseñaNueva, retorno);
}
     
     @Test
     public void testSetGetTipoIdentificacion() {
        String tipoIdentificacionNueva = "pasaporte";
        autor.setTipoIdentificacion(tipoIdentificacionNueva);
        String retorno = autor.getTipoIdentificacion();
        assertEquals(tipoIdentificacionNueva,retorno);
}
}
