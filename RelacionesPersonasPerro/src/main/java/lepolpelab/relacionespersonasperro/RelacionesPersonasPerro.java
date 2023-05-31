/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lepolpelab.relacionespersonasperro;

import Ents.Perro;
import Ents.Persona;
import Svcs.SvcPP;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class RelacionesPersonasPerro {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Que desea hacer: 1: listar personas. 2: listar mascotas. 3: cargar personas. 4: cargar mascotas. 5: dar en adopcion. 6: salir.");
            Scanner leerNum = new Scanner(System.in);

            switch (leerNum.nextInt()) {
                case 1 ->
                    System.out.println(personas);
                case 2 ->
                    System.out.println(perros);
                case 3 ->
                    cargarPersonas(personas);
                case 4 ->
                    cargarPerros(perros);
                case 5 ->
                    darEnAdopcion(personas, perros);
                case 6 ->
                    continuar = false;
                default -> {
                    System.out.println("Opcion incorrecta");
                    continuar = false;
                }
            }
        }
    }

    public static void cargarPersonas(ArrayList<Persona> personas) {
        SvcPP svc = new SvcPP();
        personas.add(svc.crearPersona());
    }

    public static void cargarPerros(ArrayList<Perro> perros) {
        SvcPP svc = new SvcPP();
        perros.add(svc.crearPerro());
    }

    public static void darEnAdopcion(ArrayList<Persona> personas, ArrayList<Perro> perros) {
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
            for (Perro perro : perros) {
                if (perro.getNombre().equals(nomMascota) && perro.getEnAdopcion()) {
                    for (Persona persona : personas) {
                        if (dniAdoptante == persona.getDni()) {
                            persona.setPerro(perro);
                            perro.setEnAdopcion(false);
                            adopcion = true;
                            System.out.println("Felicitaciones!!! " + persona.getNombre() + " sumó AMOR a su hogar!!!");
                        } else {
                            if (!adopcion) {
                                System.out.println("Lo sentimos, esa mascota no está disponible");
                            }

                        }

                    }
                }

            }

        } else {
            System.out.println("Esa persona no está cargada en el sistema.");
        }

    }

}
