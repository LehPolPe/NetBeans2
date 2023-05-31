/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lepolpelab.relacionespersonasperros;

import Ents.Perro;
import Ents.Persona;
import Svcs.SvcPrr;
import Svcs.SvcPrsn;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class RelacionesPersonasPerros {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros0 = new ArrayList<>();
        boolean cont = true;
        while (cont) {
            System.out.println("1. listar personas");
            System.out.println("2. listar perros");
            System.out.println("3. ingresar personas");
            System.out.println("4. ingresar perros");
            System.out.println("5. dar en adopcion");
            System.out.println("Otro. salir");
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            switch (leer.nextLine()) {
                case "1" ->
                    listarPersonas(personas);
                case "2" ->
                    listarPerros(perros0);
                case "3" ->
                    cargarPersona(personas);
                case "4" ->
                    cargarPerros(perros0);
                case "5" ->
                    darEnAdopcion(personas, perros0);
                default ->
                    cont = false;
            }
        }
    }

    public static void cargarPersona(ArrayList<Persona> personas) {
        SvcPrsn svc = new SvcPrsn();
        personas.add(svc.crearPersona());
    }

    public static void cargarPerros(ArrayList<Perro> perros0) {
        SvcPrr svc = new SvcPrr();
        perros0.add(svc.crearPerro());
    }

    public static void darEnAdopcion(ArrayList<Persona> personas, ArrayList<Perro> perros0) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Scanner leerDni = new Scanner(System.in);
        System.out.println("Ingrese el dni del adoptante");
        int dniAdoptante = leerDni.nextInt();
        boolean auxDni = false;
        boolean adopcion = false;
        for (Persona persona : personas) {
            if (dniAdoptante == persona.getDni()) {
                auxDni = true;
            }
        }
        if (auxDni) {
            System.out.println("Ingrese el nombre de la mascota que desea adoptar");
            String nomMascota = leer.nextLine();
            for (Perro perro : perros0) {
                if (perro.getNombre().equals(nomMascota) && perro.getAdptabilidad()) {
                    for (Persona persona : personas) {
                        if (dniAdoptante == persona.getDni()) {
                            ArrayList<Perro> deaAuxAL = persona.getPerros();
                            deaAuxAL.add(perro);
                            persona.setPerros(deaAuxAL);
                            perro.setAdptabilidad(false);
                            adopcion = true;
                            System.out.println("Felicitaciones!!! " + persona.getNombre() + " sumó AMOR a su hogar!!!");
                        
                        }

                    }
                    
                }
                if (!adopcion) {
                    System.out.println("mascota no disponible.");
                }
            }

        } else {
            System.out.println("Esa persona no está cargada en el sistema.");
        }
    }

    public static void listarPersonas(ArrayList<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public static void listarPerros(ArrayList<Perro> perros0) {
        for (Perro perro : perros0) {
            System.out.println(perro);
        }
    }
}
