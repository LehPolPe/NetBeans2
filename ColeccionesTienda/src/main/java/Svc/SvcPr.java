/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Svc;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author usr
 */
public class SvcPr {

    HashMap<String, Double> tienda =new HashMap();
   
   public void ingProd(){
       
       Scanner leer=new Scanner(System.in).useDelimiter("\n");
       Scanner leerD=new Scanner(System.in);
       System.out.println("Ingrese nombre");
       String nombre=leer.nextLine();
       System.out.println("Ingrese precio");
       double precio=leerD.nextDouble();
       tienda.put(nombre, precio);
   } 
   public void modPrec(){
       System.out.println("Ingrese que producto desea modificar el precio");
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
       Scanner leerD=new Scanner(System.in);
       String nombre=leer.nextLine();
       if (tienda.containsKey(nombre)) {
           System.out.println("ingrese el nuevo precio");
           double precio=leerD.nextDouble();
            tienda.replace(nombre, precio);
       }else{
           System.out.println("EL producto no está disponible");
       }
   }
   public void mostrarTienda(){
       for (Map.Entry<String, Double> entry : tienda.entrySet()) {
           System.out.println(entry.getKey()+" precio: "+entry.getValue());
       }
   }
   public void eliminarProducto(){
       System.out.println("Ingrese que producto desea eliminar");
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
     
       String nombre=leer.nextLine();
       if (tienda.containsKey(nombre)) {
           System.out.println("el producto fue eliminado");
           
            tienda.remove(nombre);
       }else{
           System.out.println("EL producto no está disponible");
       }
   }
}
