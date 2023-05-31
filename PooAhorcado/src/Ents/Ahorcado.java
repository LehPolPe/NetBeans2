/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ents;

import java.util.Arrays;

/**
 *
 * @author usr
 */
public class Ahorcado {

    private String[] palabra;
    private int letras;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letras, int intentos) {
        this.palabra = palabra;
        this.letras = letras;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + Arrays.toString(palabra) + ", letras=" + letras + ", intentos=" + intentos + '}';
    }

}
