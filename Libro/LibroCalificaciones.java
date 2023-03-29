package Libro;

/**
 *
 * @author Odalys Valadez
 */

// Declarar la clase para el libro de calificaciones.
public class LibroCalificaciones {  
    
    private String nombreDelCurso; 
    private String Instructor; //se declara variables para el curso y el maestro :,(
    
    public LibroCalificaciones(){ // crear el objeto MiLibroCalificaciones
        
    }
    
    public LibroCalificaciones( String nombre, String maestro ){ // constructor del nombre y maestro
        nombreDelCurso = nombre;
        Instructor = maestro;
    }
    
    public void establecerNombreDelInstructor ( String maestro){ // metodo para ingresar nombre del maestro >:c
    Instructor = maestro; 
    }
    
    public String obtenerNombreDelInstructor(){ // metodo para obtener el nombre del maestro
        return Instructor;
        
    }

    public void establecerNombreDelCurso( String nombre) { // metodo para ingresar el nombre del curso
        nombreDelCurso = nombre;
    }//fin del metodo 
          
        
        public String obtenerNombreDelCurso(){ // metodo para obtener el nombre del curso
                return nombreDelCurso;
        }

        
       
        public void mostrarMensaje(){ // Metodo para imprimir el mensaje
        
       System.out.printf( "Bienvenido al libro de calificaciones para \n%s!\n",
               obtenerNombreDelCurso() );
       System.out.printf("Este curso es presentado por: \n%s!\n",
               obtenerNombreDelInstructor()); 
    }
      
}

