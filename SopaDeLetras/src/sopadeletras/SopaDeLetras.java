/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random() * and open the template in the editor.
EN ESTA VERSION PUEDEN HABER DOS O MAS PALABRAS EN LA MISMA FILA 
*/
package sopadeletras;

import java.util.Scanner;

/**
 *
 * @author usr
 */
public class SopaDeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] palabras5 = new String[5];
        String[][] matriz = new String[20][20];
        int f = 0;
        int l = 3;
        boolean chckfl = false;
        llenar5(palabras5);
        llenarMatriz(matriz, palabras5, f, l, chckfl);
        llenarMatrizNum(matriz);
        impMatriz(matriz);
    }

    public static void llenar5(String[] palabras5) {
        Scanner lee = new Scanner(System.in);
        System.out.println("ingrese cinco palabras de tres a cinco caracteres.");
        for (int i = 0; i < 5; i++) {
            String aux = lee.next();
            while (aux.length() < 3 || aux.length() > 5) {
                System.out.println("El número de caracteres ingresados no es correcto, ingrese nuevamente palabra Nº " + (i + 1));
                aux = lee.next();
            }
            palabras5[i] = aux;
        }
    }

    public static void escribir5(String[] palabras5) {
        for (String ele : palabras5) {
            System.out.println(ele);
        }
    }

    public static void llenarMatriz(String[][] matriz, String[] palabras5, int f, int l, boolean chckfl) {
        for (int i = 0; i < 5; i++) {
            f = (int) (Math.random() * 19);
            l = (int) (Math.random() * (19 - palabras5[i].length()));
            chckfl = false;
            checkFila(matriz, f, l, chckfl);
            while (chckfl) {
                f = (int) (Math.random() * 19);
                l = (int) (Math.random() * (19 - palabras5[i].length()));
                checkFila(matriz, f, l, chckfl);
            }
            for (int j = 0; j < palabras5[i].length(); j++) {
                matriz[f][l + j] = palabras5[i].substring(j, j + 1);
            }
        }

    }

    public static void checkFila(String[][] matriz, int f, int l, boolean chckfl) {
        for (int i = 0; i < l; i++) {
            if (matriz[f][i] != null) {
                chckfl = true;
            }
        }

    }

    public static void impMatriz(String[][] matriz) {
        for (String[] strings : matriz) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    public static void llenarMatrizNum(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int nv = (int) (Math.random() * 9);
                if (matriz[i][j] == null) {
                    matriz[i][j] = String.valueOf(nv);
                }
            }
        }
    }
}
