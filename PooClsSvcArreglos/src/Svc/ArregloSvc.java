/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * grupo discord https://discord.gg/5UcCAM5h 
and open the template in the editor.
 */
package Svc;

import java.util.Arrays;

/**
 *
 * @author usr
 */
public class ArregloSvc {

    public int[] inicializarA(int[] a) {
        for (int i = 0; i < 50; i++) {
            a[i] = (int) (Math.random() * 101 - 50);
        }
        return a;
    }

    public void mostrarEnPantallaA(int[] a) {
        System.out.println(Arrays.toString(a));
    }
    public void mostrarEnPantallaB(double[] b) {
        System.out.println(Arrays.toString(b));
    }

    public int[] ordenarA(int[] a) {
        int aux;
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < (50 - 1 - i); j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;

                }
            }
        }
        return a;
    }
    public double[] inicalizarB(double[] b, int[] a){
        for (int i = 0; i < 10; i++) {
            b[i]=a[i];
        }
        for (int i = 10; i < 20; i++) {
            b[i]=0.5;
        }
    return b;    
    }
    
}

