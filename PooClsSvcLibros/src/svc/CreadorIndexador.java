/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svc;

import ents.Libro;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class CreadorIndexador {

    Scanner leer = new Scanner(System.in);

    public Libro crearLibro() {
        Libro libro = new Libro();
        System.out.println("Ingrese el ISBN del libro");
        libro.setISBN(leer.next());
        System.out.println("Ingrese el título del libro");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        libro.setAutor(leer.next());
        System.out.println("Ingrese cuantas páginas tiene el libro");
        libro.setPaginas(leer.nextInt());

        return libro;
    }
    
}
    