/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooahorcado;

import Ents.Ahorcado;
import Svc.SvcAhorcado;

/**
 *
 * @author usr
 */
public class PooAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SvcAhorcado svc=new SvcAhorcado();
        Ahorcado juego = svc.crearJuego();
        svc.longitud(juego);
        svc.buscarLetra(juego, svc.longitud(juego));
    }
    
}
