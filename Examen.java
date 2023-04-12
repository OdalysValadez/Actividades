package PrimerParcial;

/**
 *
 * @author Odalys :3 
 */
import java.util.Scanner;

public class Examen { //inicio de la clase
    
    public static void main (String[] args){ //Se ejecuta la clase
        Scanner entrada = new Scanner(System.in);
        
        //Se declaran variables con inicio en 0
        int Aprobados = 0;
        int Reprobados = 0;
        
        //Se inicia el bucle en for para que el programa cuente 10 alumnos uno por uno
        for (int i = 1; i<= 10; i++){
        
        //Indicacion para que el usuario ingrese a sus alumnos reprobados como aprobados
        System.out.print("Escribe el resultado (1=Alumno Aprobado, "
                + "2=Alumno Reprobado) para cada estudiante: ");
        int resultado = entrada.nextInt();
        
        //condicional en caso de ser 1, se agregara a la lista de aprobados
        if (resultado ==1){
            Aprobados++;}
        
        //condicional en caso de ser 2, se agregara a la lista de reprobados
        if (resultado ==2){
            Reprobados++;}
    }
    
        //Se imprimen los resultados de cuantos alumnos aprobados y reprobados estan en el curso
        System.out.println("Estos son los resultados: ");
        System.out.println("Aprobados son: "+ Aprobados);
        System.out.println("Reprobados son: "+ Reprobados);
    
        
    //condicional en caso de haber 8 alumnos aprobados muestre el mensaje
    if (Aprobados >8){System.out.println("¡Bono para el instructor! ");}
    
    // de no haber 8 alumnos aprobados, se mostrara el siguiente mensaje
    else {System.out.println("¡No hay bono para el instructor! ");}
}
    
}
