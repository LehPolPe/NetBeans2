/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Svcs;

import Ents.Perro;
import Ents.Persona;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class SvcPP {
    
    public Persona crearPersona() {
        Persona persona = new Persona();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Scanner leerNum = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese apellido");
        persona.setApellido(leer.nextLine());
        System.out.println("Ingrese edad");
        persona.setEdad(leerNum.nextInt());
        System.out.println("Ingrese DNI");
        persona.setDni(leerNum.nextInt());
        persona.setPerro(null);
        System.out.println(persona);
        return persona;
    }
    
    public Perro crearPerro() {
        Perro perro = new Perro();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Scanner leerNum = new Scanner(System.in);
        System.out.println("Ingrese el nombre del perro");
        perro.setNombre(leer.nextLine());
        System.out.println("Ingrese la raza del perro");
        perro.setRaza(leer.nextLine());
        System.out.println("Ingrese la edad del perro");
        perro.setEdad(leerNum.nextInt());
        System.out.println("Ingrese el tamaño del perro");
        perro.setTamanio(leer.nextLine());
        perro.setEnAdopcion(true);
        System.out.println(perro);
        return perro;
    }
}
