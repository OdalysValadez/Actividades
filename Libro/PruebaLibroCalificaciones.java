
package Libro;

/**
 *
 * @author Odalys Valadez Apolinar
 */
import Libro.LibroCalificaciones;
import java.util.Scanner; //clase tipo scanner

// Declarar la clase del libro de calificaciones
public class PruebaLibroCalificaciones {
        
    //metedo main incia la ejecucion del programa
    public static void main(String [] args){
            
        //Crea objeto canner para tener la entrada de ventana de comandos
        Scanner entrada = new Scanner (System. in);
       
        // crear el objeto miLibroCalificaciones desde clase LibroCalificaciones
        LibroCalificaciones miLibroCalificaciones= new LibroCalificaciones(); 
        
        // Pedir al usuario que ingrese el nombre del curso
        System.out.printf("Introduce el nombre del curso: ");
        String nombreDelCurso = entrada.nextLine(); // Leer la variable de entrada
        miLibroCalificaciones.establecerNombreDelCurso (nombreDelCurso);  //  Inroduce el nombre del curso
        System.out.println();   // linea en blanco
        
        //solicita y recibe el nombre del instructor
        System.out.println("Introduce el nombre del Instructor: "); 
        String Instructor = entrada.nextLine(); //leer la variable de entrada
        miLibroCalificaciones.establecerNombreDelInstructor( Instructor);  // Introduce nombre del instructor
        System.out.println(); // linea en blanco
        
        miLibroCalificaciones.mostrarMensaje(); // manda a llamaer el mensaje 
        
    }//Final del metodo main
}//Final de la clase
