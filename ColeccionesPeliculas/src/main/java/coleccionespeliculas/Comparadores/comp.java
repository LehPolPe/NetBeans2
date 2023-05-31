/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coleccionespeliculas.Comparadores;

import Ents.Pelicula;
import java.util.Comparator;

/**
 *
 * @author usr
 */
public class comp {
    public static Comparator<Pelicula> cmpDur= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getDuracion().compareTo(t1.getDuracion());
                   }
        
    };
    
}
