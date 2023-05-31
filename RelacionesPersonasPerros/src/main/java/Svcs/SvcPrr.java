/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Svcs;

import Ents.Perro;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class SvcPrr {
    public Perro crearPerro(){
        Perro mascota=new Perro();
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Scanner leerNum=new Scanner(System.in);
        System.out.println("Ingrese nombre del perro.");
        mascota.setNombre(leer.nextLine());
        System.out.println("Ingrese raza del perro.");
        mascota.setRaza(leer.nextLine());
        System.out.println("Ingrese edad del perro.");
        mascota.setEdad(leerNum.nextInt());
        System.out.println("Ingrese el tamaño del perro");
        mascota.setTamanio(leer.nextLine());
        mascota.setAdptabilidad(true);
        return mascota;
        }
}
