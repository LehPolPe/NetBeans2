/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclssvcpardenum;

import Ents.ParDeNum;
import Svc.SvcParDeNum;

/**
 *
 * @author usr
 */
public class PooClsSvcParDeNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SvcParDeNum svc = new SvcParDeNum();
        ParDeNum np =  svc.crearParDeNum();
        svc.mostrarValores(np);
        System.out.println("El mayor de los valores es "+svc.devolverMayor(np));
        System.out.println("La potencia del mayor valor absoluto elevado por el menor valor absoluto es "+svc.calcularPotencia(np));
        System.out.println("La raiz del mayor valor valor absoluto al menor valor absoluto es "+svc.calcularRaiz(np));
        svc.calcularRaiz2(np);
        
   }
    
}
