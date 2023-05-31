/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poorectangulo;

import CLSS.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class POOrectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo r = new Rectangulo();
        System.out.println("Ingrese la base y altura del rectágulo");
        r.crearRectangulo(leer.nextInt(), leer.nextInt());
        System.out.println("El perímetro del rectángulo es " + r.perimetro() + " y su superficie es " + r.superficie());
        System.out.println("");
        r.dibujarRec();
        System.out.println("");
    }

}
