/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclssvcdate;

import Svc.SvcDate;
import java.util.Date;

/**
 *
 * @author usr
 */
public class PooClsSvcDATE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SvcDate svc= new SvcDate();
        Date fN= svc.crearFN();
        Date fA= svc.crearFA();
        System.out.println(svc.difAnios());
    }
    
}
