/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.Autor;
import domain.Libro;
import domain.Usuario;
import java.util.ArrayList;

/**
 *
 * @author daniela
 */
public class BibliotecarioData {
    
    public ArrayList<Autor> listaAutores;
    private ArrayList<Libro> listaLibros;
    public ArrayList<Usuario> listaUsuarios;

    public BibliotecarioData() {
    }

    public ArrayList<Autor> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(ArrayList<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    public void insertarAutor(String autor){
        Autor autorPorNombre = buscarAutorPorNombre(autor);
        listaAutores.add(autorPorNombre);
    }
    
    public void quitarAutor(String autor){
        Autor autorPorNombre = buscarAutorPorNombre(autor);
        listaAutores.remove(autorPorNombre);
    }
    
    public void modificarAutor(Autor autor, String nombre){
        Autor autorPorNombre = buscarAutorPorNombre(nombre);
        listaAutores.set(posicionAutor(autor), autor);
        
    }
    
     public Autor buscarAutorPorNombre(String nombre){
        for (int i = 0; i < listaAutores.size(); i++) {
           Autor autor = listaAutores.get(i);
           if(autor.getNombreUnico().equalsIgnoreCase(nombre))
               return autor;
        }
       return null;
    }
    
     public void insertarLibro(String libro){
        Libro libroPorNombre = buscarLibroPorAutor(libro);
        listaLibros.add(libroPorNombre);
    }
    
    public void quitarLibro(String libro){
        Libro libroPorNombre = buscarLibroPorAutor(libro);
        listaLibros.remove(libroPorNombre);
    }
    
    public void modificarLibro(Libro libro, String nombre){
        Libro libroPorNombre = buscarLibroPorAutor(nombre);
        listaLibros.set(posicionLibro(libro), libroPorNombre);
        
    }
    
     public Libro buscarLibroPorAutor(String nombre){
        for (int i = 0; i < listaLibros.size(); i++) {
           Libro libro = listaLibros.get(i);
           if(libro.getAutor().equalsIgnoreCase(nombre))
               return libro;
        }
       return null;
    }
     
      public void insertarUsuario(String usuario){
        Usuario usuarioPorNombre = buscarUsuarioPorNombre(usuario);
        listaUsuarios.add(usuarioPorNombre);
    }
    
    public void quitarUsuario(String usuario){
        Usuario usuarioPorNombre = buscarUsuarioPorNombre(usuario);
        listaUsuarios.remove(usuarioPorNombre);
    }
    
    public void modificarUsuario(Usuario usuario, String nombre){
        Usuario UsuarioPorNombre = buscarUsuarioPorNombre(nombre);
        listaUsuarios.set(posicionUsuario(usuario), UsuarioPorNombre);
        
    }
    
     public Usuario buscarUsuarioPorNombre(String nombre){
        for (int i = 0; i < listaUsuarios.size(); i++) {
           Usuario usuario = listaUsuarios.get(i);
           if(usuario.getNombreUnico().equalsIgnoreCase(nombre))
               return usuario;
        }
       return null;
    } 
     
      public int posicionAutor(Autor autor) {
        int posicion = -1;
       
            posicion = listaAutores.indexOf(autor);

        return posicion;
    }
      
      public int posicionUsuario(Usuario usuario) {
        int posicion = -1;
       
            posicion = listaUsuarios.indexOf(usuario);

        return posicion;
    }
      
      public int posicionLibro(Libro libro) {
        int posicion = -1;
       
            posicion = listaLibros.indexOf(libro);

        return posicion;
    }
    
}
