/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.herenciaanimal;

import Ents.Animal;
import Ents.Caballo;
import Ents.Gato;
import Ents.Perro;

/**
 *
 * @author usr
 */
public class HerenciaAnimal {

    public static void main(String[] args) {
        Animal dioge= new Perro("Dioge", "Carnivoro", 15, "Cocker");
        dioge.alimentarse();
        Animal ote= new Perro("Otelo", "Porongavoro", 17, "Cocker puto");
        ote.alimentarse();
        Animal donsa=new Gato("Donsa", "Catchow", 8, "Gato negro");
        donsa.alimentarse();
        Animal poni=new Caballo("Poni", "Alfalfa", 7, "Arabe");
        poni.alimentarse();
    }
}
