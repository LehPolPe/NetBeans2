/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Svc;

import Ents.NIF;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class SvcNIF {

    public NIF crearNIF() {
        String a = ("TRWAGMYFPDXBNJZSQVHLCKE");
        Scanner leer = new Scanner(System.in);
        NIF nn = new NIF();
        System.out.println("Ingrese DNI");
        nn.setDni(leer.nextInt());
        nn.setLetra(a.substring(nn.getDni() % 23, (nn.getDni() % 23) + 1));
        return nn;
    }
    public void mostrar(NIF nn){
        System.out.println(nn.getDni()+"-"+nn.getLetra());
    }
}
