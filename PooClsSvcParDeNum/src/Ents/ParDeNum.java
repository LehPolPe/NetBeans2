/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ents;

/**
 *
 * @author usr
 */
public class ParDeNum {
    private int num1;
    private int num2;
    

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public ParDeNum() {
    }

    public ParDeNum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "ParDeNum{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
}
