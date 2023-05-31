/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Svcs;

import Ents.Perro;
import Ents.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class SvcPrsn {
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Scanner leerNum = new Scanner(System.in);
        Persona humano=new Persona();
        ArrayList<Perro> perro=new ArrayList<>();
        System.out.println("Ingrese el nombre de la persona.");
        humano.setNombre(leer.nextLine());
        System.out.println("Ingrese el apellido de la persona.");
        humano.setApellido(leer.nextLine());
        System.out.println("Ingrese el dni de la persona.");
        humano.setDni(leerNum.nextInt());
        System.out.println("Ingrese la edad de la persona.");
        humano.setEdad(leerNum.nextInt());
        humano.setPerros(perro);
        return humano;
    }    
    
}
