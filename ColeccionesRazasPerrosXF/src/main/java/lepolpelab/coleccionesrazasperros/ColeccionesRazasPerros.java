/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package lepolpelab.coleccionesrazasperros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author usr Diseñar un programa que lea y guarde razas de perros en un
 * ArrayList de tipo String. El programa pedirá una raza de perro en un bucle,
 * el mismo se guardará en la lista y después se le preguntará al usuario si
 * quiere guardar otro perro o si quiere salir. Si decide salir, se mostrará
 * todos los perros guardados en el ArrayList. 2. Continuando el ejercicio
 * anterior, después de mostrar los perros, al usuario se le pedirá un perro y
 * se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el
 * perro está en la lista, se eliminará el perro que ingresó el usuario y se
 * mostrará la lista ordenada. Si el perro no se encuentra en la lista, se le
 * informará al usuario y se mostrará la lista ordenada.
 */
public class ColeccionesRazasPerros {

    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        razas.add("doberman");
        razas.add("beagle");
        razas.add("collie");
        razas.add("pequines");
        razas.add("salchicha");
        System.out.println("Las razas en la colección son: ");
        for (String raza : razas) {
            System.out.println(raza);
        }
        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Ingrese raza de perro");
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            razas.add(leer.nextLine());
            System.out.println("Desea ingresar otra raza de perro? s para si, otra para no.");
            continuar = leer.nextLine();
        }
        Iterator buchon = razas.iterator();
        System.out.println("Las razas en la colección son: ");
        while (buchon.hasNext()) {
            System.out.println(buchon.next());
        }
        System.out.println("Ingrese la raza de perro que desea remover de la colección");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String auxBuchon = leer.nextLine();
        boolean nse = true;

        Iterator buchon4 = razas.iterator();

        while (buchon4.hasNext()) {
            if (buchon4.next().equals(auxBuchon)) {
                buchon4.remove();
                System.out.println("la raza " + auxBuchon + " fue removida de la colección.");
                nse = false;
            }

        }
        if (nse) {
            System.out.println("la raza " + auxBuchon + " no forma parte de la colección.");
        }

        System.out.println("Las razas en la colección son: ");
        Iterator buchon3 = razas.iterator();
        while (buchon3.hasNext()) {
            System.out.println(buchon3.next());
        }
    }
}
