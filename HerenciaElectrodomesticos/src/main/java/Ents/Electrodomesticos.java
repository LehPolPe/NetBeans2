/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ents;

import java.util.Scanner;

/**
 *
 * 2. Crear una superclase llamada Electrodoméstico con los siguientes
 * atributos: precio, color, consumo energético (letras entre A y F) y peso. Los
 * constructores que se deben implementar son los siguientes: • Un constructor
 * vacío. • Un constructor con todos los atributos pasados por parámetro. Los
 * métodos a implementar son: • Métodos getters y setters de todos los
 * atributos. • Método comprobarConsumoEnergetico(String letra): comprueba que la
 * letra es correcta, sino es correcta usara la letra F por defecto. Este método
 * se debe invocar al crear el objeto y no será visible. • Método
 * comprobarColor(String color): comprueba que el color es correcto, y si no lo
 * es, usa el color blanco por defecto. Los colores disponibles para los
 * electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el
 * nombre está en mayúsculas o en minúsculas. Este método se invocará al crear
 * el objeto y no será visible. 13 • Metodo crearElectrodomestico(): le pide la
 * información al usuario y llena el electrodoméstico, también llama los métodos
 * para comprobar el color y el consumo. Al precio se le da un valor base de
 * $1000. • Método precioFinal(): según el consumo energético y su tamaño,
 * aumentará el valor del precio. Esta es la lista de precios:
 */
public class Electrodomesticos {

    protected int precio;
    protected int peso;
    protected String color;
    protected String consumo;

    public Electrodomesticos() {
    }

    public Electrodomesticos(int precio, int peso, String color, String consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Electrodomesticos crearElectrodomestico() {
        Electrodomesticos el = new Electrodomesticos();
        Scanner leerNum = new Scanner(System.in);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese precio");
        this.setPeso(leerNum.nextInt());
        System.out.println("Inrese peso");
        this.setPeso(leerNum.nextInt());
        System.out.println("Ingrese color");
        this.setColor(leer.nextLine());
        System.out.println("Ingrese el consumo");
        this.setConsumo(leer.nextLine());
        return el;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo + '}';
    }

}
