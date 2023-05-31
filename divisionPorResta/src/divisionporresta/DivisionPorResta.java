/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisionporresta;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class DivisionPorResta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese dividendo y divisor");
        int ddo, dsor, re;
        ddo=leer.nextInt(); dsor=leer.nextInt();
        re=0;
        while(ddo>=dsor){
            ddo -= dsor; re+=1;
        }
        System.out.println("El resultado de la division es "+re);
    }
    
}
