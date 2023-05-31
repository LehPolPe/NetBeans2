/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclssvccadena;

import Ents.Cadena;
import Svc.SvcCadena;

/**
 *
 * @author usr
 */
public class PooClsSvcCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SvcCadena svc = new SvcCadena();
        Cadena c = svc.ingFrase();
        svc.mostrarVocales(c);
        svc.invertirFrase(c);
        svc.vecesRepetido(c);
        svc.compararLongitud(c);
        svc.unirFrases(c);
        svc.reemplazarLetraA(c);
        System.out.println(svc.contiene(c));
    }
    
}
