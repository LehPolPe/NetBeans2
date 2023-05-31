/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coleccionespeliculas;

import Ents.Pelicula;
import Svc.Svc;
import java.util.ArrayList;

/**
 *
 * @author usr
 */
public class ColeccionesPeliculas {

    public static void main(String[] args) {
        Svc svc= new Svc();
         ArrayList<Pelicula> peliculas = new ArrayList();
        svc.agregarPelicula(peliculas);
        svc.agregarPelicula(peliculas);
        svc.agregarPelicula(peliculas);
        svc.mostrarPeliculas(peliculas);
        svc.mostrarPelisOrd(peliculas);
        svc.mostrarPeliculasM1hr(peliculas);
    }
}
