/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Svc;

import Ents.Pelicula;
import coleccionespeliculas.Comparadores.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class Svc {

   

    public Pelicula crearPelicula() {
        Pelicula pelicula = new Pelicula();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Scanner leerHr = new Scanner(System.in);
        System.out.println("Ingrese el título de la película:");
        pelicula.setTitulo(leer.nextLine());
        System.out.println("Ingrese el director de la película:");
        pelicula.setDirector(leer.nextLine());
        System.out.println("Ingrese la duración de la película:");
        pelicula.setDuracion(leerHr.nextDouble());
        System.out.println("");
        return pelicula;
    }

    public void agregarPelicula(ArrayList<Pelicula> peliculas) {
        peliculas.add(crearPelicula());
        System.out.println("");
        
    }
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas){
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println("");
    }
    public void mostrarPeliculasM1hr(ArrayList<Pelicula> peliculas){
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion()>1) {
                System.out.println(pelicula.toString());
            }
            
        }
        System.out.println("");
    }
    public void mostrarPelisOrd(ArrayList<Pelicula> peliculas){
        Collections.sort(peliculas, comp.cmpDur);
        mostrarPeliculas(peliculas);
        System.out.println("");
    }

}
