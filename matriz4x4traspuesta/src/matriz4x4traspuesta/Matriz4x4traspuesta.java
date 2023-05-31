/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz4x4traspuesta;

/**
 *
 * @author usr
 */
public class Matriz4x4traspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j;
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * (-10)) + (int) (Math.random() * 10);
            }
        }
        System.out.println("La matrizA es:");
        for (int[] mat : matrizA) {
            for (int mat2 : mat) {
                System.out.print(mat2 + ",   ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matrizB[i][j] = matrizA[j][i];
            }
        }
        System.out.println("La matrizB (o sea, MatrizA traspuesta)es:");
        for (int[] mat : matrizB) {
            for (int mat2 : mat) {
                System.out.print(mat2 + ",   ");
            }
            System.out.println();
        }
    }

}
