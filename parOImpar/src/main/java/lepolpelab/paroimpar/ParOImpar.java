/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.paroimpar;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class ParOImpar {

     public static void main(String[] args) {
        System.out.println("Ingrese un númro entero");
        Scanner leer = new Scanner(System.in);
        int numero1 = leer.nextInt();
        if( numero1 % 2 == 0 ){
             System.out.println("el numero ingresado es par"); 
        }else{
            System.out.println("el numero ingresado es impar");
        }
    }
}