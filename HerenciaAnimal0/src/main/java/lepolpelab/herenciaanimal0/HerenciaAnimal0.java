/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lepolpelab.herenciaanimal0;

import Ents.Animal;
import Ents.Caballo;
import Ents.Gato;
import Ents.Perro;
import java.util.ArrayList;

/**
 *
 * @author usr
 */
public class HerenciaAnimal0 {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        Animal dioge= new Perro("Dioge", "Carnivoro", 15, "Cocker");
        dioge.alimentarse();
        Animal ote= new Perro("Otelo", "Porongavoro", 17, "Cocker puto");
        ote.alimentarse();
        Animal donsa=new Gato("Donsa", "Catchow", 8, "Gato negro");
        donsa.alimentarse();
        Animal poni=new Caballo("Poni", "Alfalfa", 7, "Arabe");
        poni.alimentarse();
        animales.add(dioge);
        animales.add(ote);
        animales.add(donsa);
        animales.add(poni);
        for (Animal animale : animales) {
            System.out.println(animale);
        }
    }
}
