package pooclssvcarreglos;

import Svc.ArregloSvc;

public class PooClsSvcArreglos {

    public static void main(String[] args) {
        int[] a = new int[50];
        double[] b = new double[20];
        ArregloSvc svc = new ArregloSvc();
        svc.inicializarA(a);
        svc.mostrarEnPantallaA(a);
        svc.ordenarA(a);
        svc.mostrarEnPantallaA(a);
        svc.inicalizarB(b, a);
        svc.mostrarEnPantallaB(b);
    }

}
