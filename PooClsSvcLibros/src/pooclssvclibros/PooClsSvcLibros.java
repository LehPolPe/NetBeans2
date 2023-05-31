/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclssvclibros;

import ents.Libro;
import svc.CreadorIndexador;

/**
 *
 * @author usr
 */
public class PooClsSvcLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         CreadorIndexador creaLibro= new  CreadorIndexador();
         Libro nuevoLibro= creaLibro.crearLibro();
         System.out.println("El isbn del libro es "+nuevoLibro.getISBN());
         System.out.println("Título: "+nuevoLibro.getTitulo());
         System.out.println("Autor: "+nuevoLibro.getAutor());
         System.out.println("Y tiene "+nuevoLibro.getPaginas()+ " páginas.");
    }
    
}
