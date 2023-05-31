/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class ServicioCuentaBancaria {

    public CuentaBancaria altaCuentaBancaria() {
        Scanner leer = new Scanner(System.in);
        CuentaBancaria cb = new CuentaBancaria();

        System.out.println("Ingrese el número de cuenta bancaria");

        cb.setNumeroCuenta(leer.nextInt());

        System.out.println("Ingrese el número de DNI del cliente");

        cb.setDniCliente(leer.nextLong());

        System.out.println("Ingrese el saldo actual de la cuenta bancaria");

        cb.setSaldoActual(leer.nextDouble());

        return cb;
    }

    public double ingresar(CuentaBancaria cb) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de dinero");

        double ingreso = leer.nextDouble();

        cb.setSaldoActual(cb.getSaldoActual() + ingreso);

        return cb.getSaldoActual();
    }

    public double retirar(CuentaBancaria cb) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de dinero a retirar");

        double ingreso = leer.nextDouble();

        if (ingreso < cb.getSaldoActual()) {
            cb.setSaldoActual(cb.getSaldoActual() - ingreso);
        } else {
            System.out.println("Solo podrá retirar" + cb.getSaldoActual());
            cb.setSaldoActual(0);
        }
        return cb.getSaldoActual();
    }
    public double extraccionRapida(CuentaBancaria cb) {
        cb.setSaldoActual(cb.getSaldoActual()*0.8);
        return cb.getSaldoActual();
    }

    public void mostrarSaldo(CuentaBancaria cb) {
        System.out.println("El saldo actual es " + cb.getSaldoActual());
    }
    public void mostrarDatos(CuentaBancaria cb) {
        System.out.println(cb.toString());
    }
}
