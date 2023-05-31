/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclssvcnif;

import Ents.NIF;
import Svc.SvcNIF;

/**
 *
 * @author usr
 */
public class PooClsSvcNIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SvcNIF svc = new SvcNIF();
        NIF nif = svc.crearNIF();
        svc.mostrar(nif);
    }

}
