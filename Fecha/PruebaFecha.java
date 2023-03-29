package Fecha;

/**
 *
 * @author Odalys Valadez
 */

import java.util.Scanner;
public class PruebaFecha {  //inicia la clase 
    public static void main(String [] args){ // metodo para ejecutar programa 
        Scanner entrada= new Scanner (System.in);
        
        Fecha Cumple=new Fecha (); // creacion de objetos
        
        // ingresar los datos 
        System.out.print("Dia: ");
        int Dia= entrada.nextInt();
        System.out.print("Mes: ");
        int Mes= entrada.nextInt();
        System.out.print("Año: ");
        int Año = entrada.nextInt();
        
        Cumple.establecerDia(Dia);
        Cumple.establecerMes(Mes);
        
        Cumple.establecerAño(Año);
        
        // muestra la fecha 
        Cumple.mostrarFecha();
        
    } //:c
}
