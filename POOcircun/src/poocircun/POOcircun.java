/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocircun;


import Objetos.Circulo;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class POOcircun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Circulo c1=new Circulo();
        System.out.println("Ingrese el radio del circulo");
        c1.crearCirculo(leer.nextDouble());
        System.out.println("Que desea calcular, area o perimetro:");
        String var=leer.next();
        switch (var) {
            case "area":
                System.out.println("El area del circulo es "+c1.area());
                break;
            case "perimetro":
                System.out.println("El perimetro del circulo es "+c1.perimetro());
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
    
}
