/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Bibliotecario;
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
public class TestBibliotecario {
    
   public static Bibliotecario bibliotecario;
    
    public TestBibliotecario() {
    }
    
   @Before
    public static void setUpBeforeClass() {
        bibliotecario = new Bibliotecario();
    }

  @Test
     public void testSetGetNombreUnico() {
        String nombreCompletoNuevo = "Roberto";
        bibliotecario.setNombreUnico(nombreCompletoNuevo);
        String retorno = bibliotecario.getNombreUnico();
        assertEquals(nombreCompletoNuevo, retorno);
}
     
     @Test
     public void testSetGetContraseña() {
        String contraseñaNueva = "Ronaldo123";
        bibliotecario.setContraseña(contraseñaNueva);
        String retorno = bibliotecario.getContraseña();
        assertEquals(contraseñaNueva, retorno);
}
     
     @Test
     public void testSetGetTipoIdentificacion() {
        String tipoIdentificacionNueva = "pasaporte";
        bibliotecario.setTipoIdentificacion(tipoIdentificacionNueva);
        String retorno = bibliotecario.getTipoIdentificacion();
        assertEquals(tipoIdentificacionNueva,retorno);
}
}
