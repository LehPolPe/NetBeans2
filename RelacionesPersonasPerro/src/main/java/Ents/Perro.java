/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ents;

/**
 *
 * @author usr
 */
public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamanio;
    private Boolean enAdopcion;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamanio, Boolean enAdopcion) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Boolean getEnAdopcion() {
        return enAdopcion;
    }

    public void setEnAdopcion(Boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + " en adopcion="+enAdopcion+'}';
    }
    
    
}
