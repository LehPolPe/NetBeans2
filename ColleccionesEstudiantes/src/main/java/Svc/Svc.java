/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Svc;

import Ents.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class Svc {

    public ArrayList<Alumno> curso = new ArrayList();

    public ArrayList<Alumno> crearCurso() {
        Scanner leer = new Scanner(System.in).useDelimiter("/n");
        boolean continuar = true;
        while (continuar) {
            curso.add(crearAlumno());
            System.out.println("Desea ingresar mas alumnos? S para si, otro para no");
            if (!leer.nextLine().equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
        return curso;
    }

    public Alumno crearAlumno() {
        Alumno alumno = new Alumno();
        Scanner leer = new Scanner(System.in).useDelimiter("/n");
        Scanner leerInt = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        alumno.setNombre(leer.nextLine());
        System.out.println("ingrese notas");
        ArrayList<Integer> nts = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            nts.add(leerInt.nextInt());
        }
        alumno.setNotas(nts);
        return alumno;
    }

    public double promedioNotas(ArrayList curso) {
        int anp = 0;
        Scanner leer = new Scanner(System.in).useDelimiter("/n");
        System.out.println("Ingrese que alumno desea calcular su promedio");
        String aux1=leer.nextLine();
        int aux2 = 0;
        for (int i = 0; i < curso.size(); i++) {
        Alumno aux3=(Alumno) curso.get(i);
            if (aux3.getNombre().equals(aux1)) {
                aux2=i;
            }
        }
        System.out.println("el alumno es "+curso.get(aux2).toString());
        Alumno aux=(Alumno) curso.get(aux2);
        anp = aux.getNotas().stream().map(nota -> nota).reduce(anp, Integer::sum);
        return (double) anp / 3;
    }
}