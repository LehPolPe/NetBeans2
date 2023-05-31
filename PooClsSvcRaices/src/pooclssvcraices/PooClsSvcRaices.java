/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclssvcraices;

import Ents.Raices;
import Svc.SvcRaices;

/**
 *
 * @author usr
 */
public class PooClsSvcRaices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SvcRaices svc=new SvcRaices();
        Raices e2g = svc.crearEcuacuion2grado();
        svc.calcular(e2g, svc.tieneRaiz(e2g, svc.getDiscriminante(e2g)), svc.tieneRaices(e2g, svc.getDiscriminante(e2g)), svc.getDiscriminante(e2g));
    }
    
}
