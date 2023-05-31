/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
RaicesServicio las operaciones que se podrán realizar son las siguientes:
a) Método getDiscriminante(): devuelve el valor del discriminante
(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o
igual que 0.
c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.
d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
imprime las 2 posibles soluciones.
e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.
f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
el signo delante de -b
 */
package Svc;

import Ents.Raices;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class SvcRaices {

    public Raices crearEcuacuion2grado() {
        Scanner leer = new Scanner(System.in);
        Raices ec2dogrd = new Raices();
        System.out.println("Ingrese los valores a, b y c de la ecuación de 2do grado.");
        ec2dogrd.setA(leer.nextDouble());
        ec2dogrd.setB(leer.nextDouble());
        ec2dogrd.setC(leer.nextDouble());
        return ec2dogrd;
    }

    public double getDiscriminante(Raices ec2dogrd) {
        double discriminante = Math.pow(ec2dogrd.getB(), 2) - 4 * ec2dogrd.getA() * ec2dogrd.getC();
        return discriminante;
    }

    public boolean tieneRaices(Raices ec2dogrd, double discriminante) {

        return (discriminante > 0);
    }

    public boolean tieneRaiz(Raices ec2dogrd, double discriminante) {

        return (discriminante == 0);
    }

    public void obtenerRaices(Raices ec2dogrd, boolean tieneRaices, double discriminante) {
        if (tieneRaices) {
            double raiz1 = (-ec2dogrd.getB() + Math.sqrt(discriminante)) / 2 * ec2dogrd.getA();
            double raiz2 = (-ec2dogrd.getB() - Math.sqrt(discriminante)) / 2 * ec2dogrd.getA();
            System.out.println("Las raices son " + raiz1 + " y " + raiz2);
        }
    }

    public void obtenerRaiz(Raices ec2dogrd, boolean tieneRaiz) {
        if (tieneRaiz) {
            System.out.println("La raiz es " + ((-ec2dogrd.getB()) / 2 * ec2dogrd.getA()));
        }
    }
    public void calcular(Raices ec2dogrd, boolean tieneRaiz, boolean tieneRaices, double discriminante){
        if (tieneRaices) {
           obtenerRaices(ec2dogrd, tieneRaices, discriminante);
        }else if(tieneRaiz) {
            obtenerRaiz(ec2dogrd, tieneRaiz);
        }else{
            System.out.println("No existe solución en el conjunto de los numeros reales");
        }
    }
}
