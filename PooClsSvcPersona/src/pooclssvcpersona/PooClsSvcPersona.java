/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooclssvcpersona;

import Ents.Persona;
import Svc.SvcPersona;

/**
 *
 * @author usr
 */
public class PooClsSvcPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SvcPersona per = new SvcPersona();
        Persona[] pe = new Persona[4];

        int[] vecImc = new int[4];

        boolean[] vecMayor = new boolean[4];

        int sobrePeso = 0;
        int pesoIdeal = 0;
        int pesoBajo = 0;
        int mayores = 0;
        int menores = 0;

        for (int i = 0; i < 4; i++) {

            pe[i] = per.crearPersona();
            System.out.println(pe[i].toString());

        }
        for (int i = 0; i < 4; i++) {
            vecImc[i] = per.calcularIMC(pe[i]);
          
            switch (vecImc[i]) {
                case -1:
                    pesoBajo += 1;
                    break;
                case 0:
                    pesoIdeal += 1;
                    break;
                default:
                    sobrePeso += 1;
            }
        }
        for (int i = 0; i < 4; i++) {
            vecMayor[i] = per.esMayorDeEdad(pe[i]);
            
            if (vecMayor[i]) {
                mayores += 1;
            } else {
                menores += 1;
            }
        }
        System.out.println("porcentaje Peso Bajo: "+ (pesoBajo/4*100));
        System.out.println("porcentaje Peso Ideal: "+ (pesoIdeal/4*100));
        System.out.println("porcentaje Sobre Peso: "+ (sobrePeso/4*100));
        System.out.println("Mayores: "+ mayores);
        System.out.println("Menores: "+ menores);
    }

}
