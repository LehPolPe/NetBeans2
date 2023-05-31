/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Svc;

import Ents.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class SvcAhorcado {

    public Ahorcado crearJuego() {
        Ahorcado juego = new Ahorcado();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese palabra");
        String palabra = leer.nextLine();
        System.out.println("Ingrese la cantidad de intentos");
        juego.setIntentos(leer.nextInt());
        juego.setLetras(palabra.length());
        String[] aux = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            aux[i] = palabra.substring(i, i + 1);
        }
        juego.setPalabra(aux);
        return juego;
    }

    public int longitud(Ahorcado juego) {
        int longitud = juego.getPalabra().length;
        return longitud;
    }

    public void buscarLetra(Ahorcado juego, int longitud) {
        System.out.println("Ingrese letra a buscar");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String letra = leer.nextLine();
        int c = 0;
        for (String palabra : juego.getPalabra()) {
            if (palabra.equals(letra)) {
                c++;
            }
        }
        int[] p = new int[c];
        int c2 = 0;
        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (juego.getPalabra()[i].equals(letra)) {
                p[c2] = i;
                c2++;
            }
        }
        System.out.println(Arrays.toString(p));
    }

}
