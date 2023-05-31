/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Svc;

import Ents.Persona;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author usr
 */
public class SvcPersona {
    Date fN = new Date();
   
    public Persona crearPersona(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Persona persona = new Persona();
        System.out.println("Ingrese nombre y apellido de la persona");
        persona.setNombre(leer.nextLine());
        crearFN();
        persona.setFechaNac(fN);
        return persona;
    }
     public Date crearFN() {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese año de nacimiento: ");
        fN.setYear(leer.nextInt()-1900);
        System.out.print("Ingrese mes de nacimiento: ");
        fN.setMonth(leer.nextInt()-1);
        System.out.print("Ingrese dia de nacimiento: ");
        fN.setDate(leer.nextInt());
        return fN;
    }
    
     public int calcularEdad(Persona persona){
         Date fA=new Date();
         int edad=fA.getYear()- fN.getYear();
         if (fN.getMonth()>fA.getMonth()) {
             edad--;
         }
         if (fN.getMonth()==fA.getMonth()&&fN.getDay()>fA.getDay()) {
             edad--;
         }
         return edad;
     }
     public boolean mayoriaEdad(Persona persona){
         boolean mayoriaEdad=false;
         
         if (calcularEdad(persona)>17) {
             mayoriaEdad=true;
         }
         return mayoriaEdad;
     }
     
     public void mostrarPersona(Persona persona){
         System.out.println(persona.getNombre());
         System.out.println("Nació en fecha :"+persona.getFechaNac());
         System.out.println("Tiene la edad de "+calcularEdad(persona)+" años.");
         if (mayoriaEdad(persona)) {
             System.out.println("Y es mayor de edad");
         }else{
             System.out.println("Y es menor de edad");
         }
     }
}