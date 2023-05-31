package Svc;

import Ents.Curso;
import java.util.Scanner;

public class SvcCurso {

    String[] al = new String[5];

    public void cargarAlumnos() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los nombres de los alumnos");
        for (int i = 0; i < 5; i++) {
            al[i] = leer.nextLine();
        }
    }

    public Curso crearCurso() {
        Curso c = new Curso();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del Curso");
        c.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese el turno, mañana o tarde");
        c.setTurno(leer.nextLine());
        cargarAlumnos();
        c.setAlumnos(al);
        System.out.println("Ingrese horas al dia del Curso");
        c.setCantidadHsDia(leer.nextInt());
        System.out.println("Ingrese dias a la semana del Curso");
        c.setCantidadDiasSemana(leer.nextInt());
        System.out.println("Ingrese el precio por hr del Curso");
        c.setPrecioHora(leer.nextInt());
        System.out.println(c);
        return c;
    }
    public void calcularGanancia(Curso c){
        System.out.println("la ganancia semanal es $"+(c.getCantidadDiasSemana()*c.getCantidadHsDia()*c.getPrecioHora()*5));
    }
}
