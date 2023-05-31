/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclssvcpersona3;

import Ents.Persona;
import Svc.SvcPersona;

/**
 *
 * @author usr
 */
public class PooClsSvcPersona3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SvcPersona svc= new SvcPersona();
        Persona p= svc.crearPersona();
        svc.mostrarPersona(p);
    }
    
}
