

package pooclssvccurso;

import Ents.Curso;
import Svc.SvcCurso;
import java.util.Arrays;


public class PooClsSvcCURSO {

    
    public static void main(String[] args) {
        SvcCurso svc=new SvcCurso();
        Curso nc= svc.crearCurso();
        Curso nc1= svc.crearCurso();
        System.out.println(nc.getNombreCurso());
        System.out.println(Arrays.toString(nc.getAlumnos()));
        svc.calcularGananciaSemanal(nc);
        System.out.println(nc1.getNombreCurso());
        System.out.println(Arrays.toString(nc1.getAlumnos()));
        svc.calcularGananciaSemanal(nc1);
    }
    
}
