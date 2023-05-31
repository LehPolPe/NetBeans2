/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Svc;

import Ents.Cadena;
import java.util.Scanner;

/**
 *
 * @author usr Crear una clase CadenaServicio en el paquete servicios que
 * implemente los siguientes métodos: a) Método mostrarVocales(), deberá
 * contabilizar la cantidad de vocales que tiene la frase ingresada. b) Método
 * invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
 * Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac". c) Método
 * vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
 * contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: d)
 * Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. e)
 * Método compararLongitud(String frase), deberá comparar la longitud de la
 * frase que compone la clase con otra nueva frase ingresada por el usuario. f)
 * Método unirFrases(String frase), deberá unir la frase contenida en la clase
 * Cadena con una nueva frase ingresada por el usuario y mostrar la frase
 * resultante. g) Método reemplazar(String letra), deberá reemplazar todas las
 * letras “a” que se encuentren en la frase, por algún otro carácter
 * seleccionado por el usuario y mostrar la frase resultante. h) Método
 * contiene(String letra), deberá comprobar si la frase contiene una letra que
 * ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
public class SvcCadena {

    public Cadena ingFrase() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase");
        Cadena cad = new Cadena();
        cad.setFrase(leer.nextLine());
        cad.setLongitud(cad.getLongitud());
        return cad;
    }

    public void mostrarVocales(Cadena cad) {
        int cv = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            switch (cad.getFrase().substring(i, i + 1)) {
                case "a":
                    cv += 1;
                    break;
                case "e":
                    cv += 1;
                    break;
                case "i":
                    cv += 1;
                    break;
                case "o":
                    cv += 1;
                    break;
                case "u":
                    cv += 1;
                    break;
                default:;
            }

        }
        System.out.println("La cantidad de vocales es " + cv);
    }

    public void invertirFrase(Cadena cad) {
        String aux = "";
        for (int i = 0; i < cad.getLongitud(); i++) {
            aux = aux.concat(cad.getFrase().substring(cad.getLongitud() - i - 1, cad.getLongitud() - i));
        }

        System.out.println(aux);
    }

    public void vecesRepetido(Cadena cad) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese caracter");
        String c = leer.next();
        int cv = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i, i + 1).equals(c)) {
                cv += 1;
            }
        }
        System.out.println("El caracter se repite " + cv + " veces");
    }

    public void compararLongitud(Cadena cad) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nueva frase");
        String nf = leer.nextLine();
        if (cad.getLongitud() > nf.length()) {
            System.out.println("La longitud de la primera frase es mayor");
        } else if (cad.getLongitud() < nf.length()) {
            System.out.println("La longitud de la segunda frase es mayor");
        } else {
            System.out.println("La longitd de ambas frases es igual");
        }
    }

    public void unirFrases(Cadena cad) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nueva frase");
        String nf = leer.nextLine();
        cad.setFrase(cad.getFrase().concat(" ").concat(nf));
        System.out.println(cad.getFrase());
    }
    public void reemplazarLetraA(Cadena cad){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese con que caracter desea reemplzar la letra a");
        String c=leer.next();
        String aux=cad.getFrase().replace("a", c);
        System.out.println(aux);
    }
    public boolean contiene(Cadena cad){
        Scanner leer = new Scanner(System.in);
        boolean b=false;
        System.out.println("Ingrese caracter que desea saber si está en la frase");
        String c = leer.next();
        if (cad.getFrase().contains(c)) {
            b=true;
        }
        return b;
    }
}
