/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Svc;

import Ents.Cafetera;
import java.util.Scanner; 

/**
 *
 * @author usr
 */
public class CafeteraSvc {

    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        Cafetera nsprss = new Cafetera();
        nsprss.setCapacidadMaxima(1000);
        nsprss.setCantidadActual(1000);
        return nsprss;
    }

    public void llenarCafetera(Cafetera nsprss) {
        nsprss.setCantidadActual(nsprss.getCapacidadMaxima());
    }
    public void vaciarCafetera(Cafetera nsprss) {
        nsprss.setCantidadActual(0);
    }

    public int servirTaza(Cafetera nsprss) {
        System.out.println("Indique el volumen en ml de la taza a llenar");
        
        int taza = leer.nextInt();
        if (taza<=nsprss.getCantidadActual()) {
            nsprss.setCantidadActual(nsprss.getCantidadActual()-taza);
            System.out.println("Se llenó la taza");
        }else{
            System.out.println("Solo llegó a llenarse "+nsprss.getCantidadActual()+" ml");
            nsprss.setCantidadActual(0);
        }
        
        return nsprss.getCantidadActual();
    }
    public int agregarCafe(Cafetera nsprss) {
        System.out.println("Indique el volumen en ml de café a agregar");
        
        int cafe = leer.nextInt();
        if (cafe<=(nsprss.getCapacidadMaxima()- nsprss.getCantidadActual())) {
            nsprss.setCantidadActual(nsprss.getCantidadActual()+ cafe);
            
        }else{
            System.out.println("la cantidad indicada excede la capacidad de la cafetera");
            nsprss.setCantidadActual(nsprss.getCapacidadMaxima());
        }
        
        return nsprss.getCantidadActual();
    }

    public void toString(Cafetera cn) {
        System.out.println(cn.toString());
    }
}
