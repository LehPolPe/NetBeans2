/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ents;

import DNI.Dni;

/**
 *
 * @author usr
 */
public class Persona {
    private String nombreApellido;
    private Dni dni;

    public Persona() {
    }

    public Persona(String nombreApellido) {
        this.nombreApellido = nombreApellido;
        
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombreApellido=" + nombreApellido + ", dni=" + dni + '}';
    }
    
}
