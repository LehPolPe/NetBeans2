/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolibro;

import Objetos.Libro;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class POOlibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro[] l2 = new Libro[4];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {

            l2[i] = new Libro();
            System.out.println("Ingrese ISBN");
            l2[i].setISBN(leer.next());
            System.out.println("Ingrese Autor");
            l2[i].setAutor(leer.next());
            System.out.println("Ingrese Titulo");
            l2[i].setTitulo(leer.next());
            System.out.println("Ingrese Paginas");
            l2[i].setPaginas(leer.nextInt());

        }
        for (Libro libro : l2) {
            System.out.println(libro);
        }

    }

}
