package Frecuencias;

/**
 *
 * @author LI141
 */

import javax.swing.JOptionPane; // importar dialogo

public class PruebaFrecienciaCardiaca { //Inicio de la clase 
    
    
    public static  void main (String [] args){ // Ejecuacion del programa
        //Scanner entrada = new Scanner(System.in); 
        
        // creacion de objeto
        frecuenciaCardiacas miCardio = new frecuenciaCardiacas("Gustavo","Castillejos","07","07",2003,50,150,200);
        
        // imprime los parametros del constructor 
        System.out.printf("Tu nombre es: "+miCardio.getNombre()+" "+miCardio.getApellido()+"Tu edad es: "+ miCardio.getEdad()+"Tu Frecuencia maxima es: "+ miCardio.getFrecuenciaMax()+ 
                "Tu Frecuencia esperada es: "+ miCardio.getFrecuenciaEsp());
        
        // Pedir datos de la persona en ventanas
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        miCardio.setNombre(nombre);
        
        String apellido = JOptionPane.showInputDialog("Escribe tu apellido: ");
        miCardio.setApellido (apellido);
        
        System.out.println("Escribe tu dia de nacimiento: ");
        String dia = JOptionPane.showInputDialog("Escribe tu dia de nacimiento");
        miCardio.setDia(dia);
        
           String mes = JOptionPane.showInputDialog("Escribe tu mes de nacimiento: ");
        miCardio.setMes(mes);
        
           String anio = JOptionPane.showInputDialog("Escribe tu año de nacimiento: ");
           int ani = Integer.parseInt(anio);
        miCardio.setAnio(ani);
        
        // se ejecuta la operacion para sacar la edad, frecuencia maxima y la frecuencia esperada
        miCardio.setEdad(ani);
        miCardio.setFrecuenciaMax(miCardio.getEdad());
        miCardio.setFrecuenciaEsp(miCardio.getFrecuenciaMax());
        
        //Imprime los datos que el usario registro previamente
 JOptionPane.showMessageDialog(null,"Tu nombre es: "+ miCardio.getNombre()+ " " + miCardio.getApellido()
        + "\nTu edad es: " + miCardio.getEdad() + "\nTu Frecuencia Maxima es: " +miCardio.getFrecuenciaMax() +
                "\nTu frecuencia esperada es: " + miCardio.getFrecuenciaEsp());
        
        
                
    }
}


