/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2. 
* and open the template in the editor.
 */
package CLSS;

/**
 *
 * @author usr
 */
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public void crearRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int superficie() {
        return base * altura;
    }

    public int perimetro() {
        return base * 2 + altura * 2;
    }

    public void dibujarRec() {
        for (int i = 1; i <= base; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        for (int i = 1; i < altura - 1; i++) {
            for (int j = 1; j <= base; j++) {
                if (j == 1 || j == base) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        for (int i = 1; i <= base; i++) {
            System.out.print("* ");
        }
    }
}
