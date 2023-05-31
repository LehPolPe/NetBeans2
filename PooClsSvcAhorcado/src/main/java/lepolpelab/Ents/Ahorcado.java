/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lepolpelab.Ents;

import java.util.Arrays;

/**
 *
 * @author usr
 */
public class Ahorcado {
    private String [] pab;
    private int cle;
    private int cjm;

    public Ahorcado() {
    }

    public Ahorcado(String[] pab, int cle, int cjm) {
        this.pab = pab;
        this.cle = cle;
        this.cjm = cjm;
    }

    public String[] getPab() {
        return pab;
    }

    public void setPab(String[] pab) {
        this.pab = pab;
    }

    public int getCle() {
        return cle;
    }

    public void setCle(int cle) {
        this.cle = cle;
    }

    public int getCjm() {
        return cjm;
    }

    public void setCjm(int cjm) {
        this.cjm = cjm;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "pab=" + Arrays.toString(pab) + ", cle=" + cle + ", cjm=" + cjm + '}';
    }
    
}
