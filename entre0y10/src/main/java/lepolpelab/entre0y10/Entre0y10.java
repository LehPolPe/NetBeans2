/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.entre0y10;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class Entre0y10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una nota entre 0 y 10...");
        float num=leer.nextFloat();
        if  (num>=0 && num<=10) {
             System.out.println("Correcto..."); 
        }else{
            System.out.println("Incorrecto...");
        }
    }
}
