/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.coleccionestienda;

import Svc.SvcPr;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class ColeccionesTienda {

    public static void main(String[] args) {
        SvcPr svc= new SvcPr();
        boolean continuar=true;
        while (continuar) {
            System.out.println("Que desea hacer:1- ingresar productos. 2- mostrar productos, 3-modificar precio de producto. 4.Eliminar producto");
            Scanner leer=new Scanner(System.in);
            switch (leer.nextInt()) {
                case 1 -> svc.ingProd();
                case 2 -> svc.mostrarTienda();
                case 3 -> svc.modPrec();
                case 4 -> svc.eliminarProducto();
                default -> continuar=false;
            }
            
        }
    }
}
