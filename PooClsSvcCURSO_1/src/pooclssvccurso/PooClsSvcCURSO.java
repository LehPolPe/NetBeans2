package pooclssvccurso;

import Ents.Curso;
import Svc.SvcCurso;

public class PooClsSvcCURSO {

    public static void main(String[] args) {
        SvcCurso svc = new SvcCurso();
        Curso nc = svc.crearCurso();

        svc.calcularGanancia(nc);
    }

}
