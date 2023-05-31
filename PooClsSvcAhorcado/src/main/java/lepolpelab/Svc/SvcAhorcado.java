/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lepolpelab.Svc;

import java.util.Arrays;
import java.util.Scanner;
import lepolpelab.Ents.Ahorcado;

/**
 *
 * @author usr
 */
public class SvcAhorcado {
    
    public Ahorcado crearJuego() {
        Ahorcado juego = new Ahorcado();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la palabra a buscar");
        String palabra = leer.nextLine();
        String[] aux = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            aux[i] = palabra.substring(i, i + 1);
        }
        juego.setPab(aux);
        return juego;
    }
    
}
