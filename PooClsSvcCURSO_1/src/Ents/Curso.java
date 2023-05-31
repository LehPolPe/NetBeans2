package Ents;

import java.util.Arrays;

public class Curso {

    private String nombreCurso;
    private String turno;
    private String[] alumnos;
    private int cantidadHsDia;
    private int cantidadDiasSemana;
    private int precioHora;

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, String[] alumnos, int cantidadHsDia, int cantidadDiasSemana, int precioHora) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.alumnos = alumnos;
        this.cantidadHsDia = cantidadHsDia;
        this.cantidadDiasSemana = cantidadDiasSemana;
        this.precioHora = precioHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public int getCantidadHsDia() {
        return cantidadHsDia;
    }

    public void setCantidadHsDia(int cantidadHsDia) {
        this.cantidadHsDia = cantidadHsDia;
    }

    public int getCantidadDiasSemana() {
        return cantidadDiasSemana;
    }

    public void setCantidadDiasSemana(int cantidadDiasSemana) {
        this.cantidadDiasSemana = cantidadDiasSemana;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", turno=" + turno + ", alumnos=" + Arrays.toString(alumnos) + ", cantidadHsDia=" + cantidadHsDia + ", cantidadDiasSemana=" + cantidadDiasSemana + ", precioHora=" + precioHora + '}';
    }

}
