package lepolpelab.coleccioneslibreria;

import Ents.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * Tambi�n se crear� en el main un HashSet de tipo Libro que guardar� todos los
 * libros creados. En el main tendremos un bucle que crea un objeto Libro
 * pidi�ndole al usuario todos sus datos y los seteandolos en el Libro. Despues,
 * ese Libro se guarda en el conjunto y se le pregunta al usuario si quiere
 * crear otro Libro o no. La clase Librer�a contendr� adem�s los siguientes
 * m�todos: � Constructor por defecto. � Constructor con par�metros. � M�todos
 * Setters/getters � M�todo prestamo(): El usuario ingresa el titulo del libro
 * que quiere prestar y se lo busca en el conjunto. Si est� en el conjunto, se
 * llama con ese objeto Libro al m�todo. El m�todo se incrementa de a uno, como
 * un carrito de compras, el atributo ejemplares prestados, del libro que
 * ingres� el usuario. Esto suceder� cada vez que se realice un pr�stamo del
 * libro. No se podr�n prestar libros de los que no queden ejemplares
 * disponibles para prestar. Devuelve true si se ha podido realizar la operaci�n
 * y false en caso contrario. � M�todo devolucion(): El usuario ingresa el
 * titulo del libro que quiere devolver y se lo busca en el conjunto. Si est� en
 * el conjunto, se llama con ese objeto al m�todo. El m�todo decrementa de a
 * uno, como un carrito de compras, el atributo ejemplares prestados, del libro
 * seleccionado por el usuario. Esto suceder� cada vez que se produzca la
 * devoluci�n de un libro. No se podr�n devolver libros donde que no tengan
 * ejemplares prestados. Devuelve true si se ha podido realizar la operaci�n y
 * false en caso contrario. � M�todo toString para mostrar los datos de los
 * libros.
 */
public class ColeccionesLibreria {

    public static void main(String[] args) {
        HashSet<Libro> libreria = new HashSet<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Que desa hacer: 1- cargar libros. 2- prestar libro. 3- devolver libro - 4 salir.");
            Scanner leerOp = new Scanner(System.in);
            switch (leerOp.nextInt()) {
                case 1 -> {
                    cargarLibros(libreria);
                    for (Libro libro : libreria) {
                        System.out.println(libro.toString());
                        System.out.println("");
                    }
                }
                case 2 -> {
                    prestarLibro(libreria); 
                    System.out.println("");
                    for (Libro libro : libreria) {
                        System.out.println(libro.toString());
                        System.out.println("");
                    }
                }
                case 3 -> {
                    devolverLibro(libreria); 
                    System.out.println("");
                    for (Libro libro : libreria) {
                        System.out.println(libro.toString());
                        System.out.println("");
                    }
                }
                case 4 -> continuar=false;
                default -> continuar=false;
            }
        }
        
    }

    public static void cargarLibros(HashSet<Libro> libreria) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Scanner leerInt = new Scanner(System.in);
        Libro libro = new Libro();
        System.out.println("Ingrese el título del libro");
        libro.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor del libro");
        libro.setAutor(leer.nextLine());
        System.out.println("Ingrese la cantidad del titulo");
        libro.setEjemplares(leerInt.nextInt());
        System.out.println("Ingrese la cantidad del titulo en prestamo");
        libro.setEjemplaresPr(leerInt.nextInt());
        System.out.println(libro);
        libreria.add(libro);
    }
    public static void prestarLibro(HashSet<Libro> libreria){
        System.out.println("Que titulo desea retirar");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean aux=false;
        String leerAux=leer.nextLine();
        for (Libro libro : libreria) {
            if (libro.getTitulo().equals(leerAux)) {
                libro.prestamo(libro.getEjemplares(), libro.getEjemplaresPr());
                aux=true;
                break;
            }
        }
        if (!aux) {
            System.out.println("No contamos con el titulo requerido.");
        }
    }
    public static void devolverLibro(HashSet<Libro> libreria){
        System.out.println("Que titulo desea devolver.");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean aux=false;
        String leerAux=leer.nextLine();
        for (Libro libro : libreria) {
            if (libro.getTitulo().equals(leerAux)) {
                libro.devolucion(libro.getEjemplares(), libro.getEjemplaresPr());
                aux=true;
                break;
            }
        }
        if (!aux) {
            System.out.println("No contamos con el titulo requerido.");
        }
    }
}
