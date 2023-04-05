
package Empleados;

import java.util.Scanner;

public class PruebaEmpleados { // inico de clase 
    public static void main (String [] args){ // Ejecutor
        
        Empleados Documentos = new Empleados( "Odalys", "Valadez", 1200.00); //inicaiar objeto
        
        //Imprimir datos del objeto
        System.out.printf("Tu nombre es: "+ Documentos.getNombre());
        System.out.printf("\n Tu apellido es: "+ Documentos.getApellido());
        System.out.printf("\n Tu salario anual es: "+ Documentos.getPago());
        
        
        //Pedir al usuario sus datos
        Empleados Nuevo = new Empleados ();
        Scanner entrada = new Scanner(System.in);
        System.out.printf("\n\nIngresa tu nombre: ");
        String Nombre = entrada.nextLine();
        Nuevo.setNombre(Nombre);
        
        System.out.printf("\n Ingresa tu apellido: ");
        String Apellido = entrada.nextLine();
        Nuevo.setApellido(Apellido);
        
       System.out.printf("\nIngresa tu Salario mensual: ");
       double Salario = entrada.nextDouble();
       Nuevo.setSalario(Salario);
       
       //Imprimir datos
        System.out.printf("Tu nombre es: "+ Nuevo.getNombre());
        System.out.printf("\n Tu apellido es: "+ Nuevo.getApellido());
        System.out.printf("\n Tu salario anual es: "+ Nuevo.getPago());
        
        //Abono del 10%, primer empleado
        System.out.printf("\nSalario del primer empleado con abono es: "+ Documentos.Abono());
     
        //Abono del 10%, segundo empleado
        System.out.printf("\nSalario del segundo empleado con abono es: "+   Nuevo.Abono());
             //Abono del 10%, primer empleado y segundo empleado

    }
} 

