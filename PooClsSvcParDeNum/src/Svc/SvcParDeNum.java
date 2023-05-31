/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Svc;

import Ents.ParDeNum;

/**
 *
 * @author usr
 */
public class SvcParDeNum {

    public ParDeNum crearParDeNum() {
        ParDeNum par = new ParDeNum();
      //  par.setNum1((int) (Math.random() * 201) - 100);
       // par.setNum2((int) (Math.random() * 201) - 100);
        par.setNum1(3);
        par.setNum2(-8);
      
        return par;
    }

    public void mostrarValores(ParDeNum par) {
        System.out.println(par);
    }

    public int devolverMayor(ParDeNum par) {
        return (int) Math.max(par.getNum1(), par.getNum2());
    }

    public int calcularPotencia(ParDeNum par) {
        return (int) Math.pow(Math.abs(Math.max(par.getNum1(), par.getNum2())), Math.abs(Math.min(par.getNum1(), par.getNum2())));
    }

    public int calcularRaiz(ParDeNum par) {
        return (int) Math.pow(Math.abs(Math.max(par.getNum1(), par.getNum2())), 1 / Math.abs(Math.min(par.getNum1(), par.getNum2())));
    }
    public void calcularRaiz2(ParDeNum par) {
        System.out.println( (int) Math.pow(Math.abs(Math.max(par.getNum1(), par.getNum2())), 1 / Math.abs(Math.min(par.getNum1(), par.getNum2()))));
    }
}
