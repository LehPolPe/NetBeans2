/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lepolpelab.Ents;

/**
 *
 * @author usr
 */
public class Alumnos {
    private String nombre;
    private int nota;

    public Alumnos() {
    }

    public Alumnos(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
