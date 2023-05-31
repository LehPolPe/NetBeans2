/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 */
package Objetos;

/**
 *
 * @author usr
 */
public class Circulo {

    private double radio;

    
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public void crearCirculo(double radio){
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public double area() {
        return Math.pow(Math.PI * radio, 2);
         
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
         
    }
}
