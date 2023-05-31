/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mes;

/**
 *
 * @author usr
 */
public class MesSecreto {
    String[] mes={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    public String mesSecreto(){
        String mesSecreto=(mes[(int)(Math.floor(Math.random() * 12))]);
        return mesSecreto;
    }
    
}
