/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.pooclssvcahorcado;

import lepolpelab.Ents.Ahorcado;
import lepolpelab.Svc.SvcAhorcado;

/**
 *
 * @author usr
 */
public class PooClsSvcAhorcado {

    public static void main(String[] args) {
        SvcAhorcado svc=new SvcAhorcado();
        Ahorcado juego = svc.crearJuego();
        System.out.println(juego);
    }
}
