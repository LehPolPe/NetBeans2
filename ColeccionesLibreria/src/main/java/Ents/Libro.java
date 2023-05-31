/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ents;

/**
 *
 * @aPara ello, se debe crear una clase llamada Libro que guarde la
informaci�n de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el t�tulo del libro, autor, n�mero de ejemplares y n�mero de ejemplares prestados.
Tambi�n se crear� en el main un HashSet de tipo Libro que guardar� todos los libros
creados.uthor usr
* La clase Librer�a contendr� adem�s los siguientes m�todos:
� Constructor por defecto.
� Constructor con par�metros.
� M�todos Setters/getters
� M�todo prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si est� en el conjunto, se llama con ese objeto Libro al
m�todo. El m�todo se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingres� el usuario. Esto suceder�
cada vez que se realice un pr�stamo del libro. No se podr�n prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operaci�n y false en caso contrario.
� M�todo devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si est� en el conjunto, se llama con ese objeto al m�todo.
El m�todo decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto suceder� cada
vez que se produzca la devoluci�n de un libro. No se podr�n devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operaci�n y false en caso contrario.
� M�todo toString para mostrar los datos de los libros.

 */
public class Libro {
    private String titulo;
    private String autor;
    private Integer ejemplares;
    private Integer ejemplaresPr;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer ejemplares, Integer ejemplaresPr) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPr = ejemplaresPr;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPr() {
        return ejemplaresPr;
    }

    public void setEjemplaresPr(Integer ejemplaresPr) {
        this.ejemplaresPr = ejemplaresPr;
    }
    public void prestamo(Integer ejemplares, Integer ejemplaresPr) {
        if (ejemplares>0) {
            this.ejemplares --; 
            this.ejemplaresPr ++;       
        } else {
            System.out.println("No hay mas ejemplares del título solicitado");
        }
    }
    public void devolucion(Integer ejemplares, Integer ejemplaresPr) {
        if (ejemplaresPr>0) {
            this.ejemplares ++; 
            this.ejemplaresPr --;       
        } else {
            System.out.println("Ese ejemplar no pertenece a esta biblioteca");
        }
    }
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", ejemplaresPr=" + ejemplaresPr + '}';
    }
    
}
