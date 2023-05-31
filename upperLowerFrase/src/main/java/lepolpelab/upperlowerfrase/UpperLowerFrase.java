/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.upperlowerfrase;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author usr
 */
public class UpperLowerFrase {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = leer.nextLine();
        System.out.println(toUpperCase(frase)+" EN MAYUSCULA...");
        System.out.println(toLowerCase(frase)+" en minuscula...");  
    }
}
