/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import domain.Usuario;
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
public class TestUsuario {
    
    public static Usuario usuario;
    
    public TestUsuario() {
    }
    
 @Before
    public static void setUpBeforeClass() {
        usuario = new Usuario();
    }
 
@Test
     public void testSetGetNombreUnico() {
        String nombreCompletoNuevo = "Roberto";
        usuario.setNombreUnico(nombreCompletoNuevo);
        String retorno = usuario.getNombreUnico();
        assertEquals(nombreCompletoNuevo, retorno);
}
     
     @Test
     public void testSetGetContraseña() {
        String contraseñaNueva = "Ronaldo123";
        usuario.setContraseña(contraseñaNueva);
        String retorno = usuario.getContraseña();
        assertEquals(contraseñaNueva, retorno);
}
     
     @Test
     public void testSetGetTipoIdentificacion() {
        String tipoIdentificacionNueva = "pasaporte";
        usuario.setTipoIdentificacion(tipoIdentificacionNueva);
        String retorno = usuario.getTipoIdentificacion();
        assertEquals(tipoIdentificacionNueva,retorno);
}
}
