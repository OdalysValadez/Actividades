
package Cuenta;

/**
 *
 * @author Odalys Valadez Apolinar
 */
import java.util.Scanner;

public class PruebaCuenta { //inicio de clase
    
    public static void main (String[] args){ // manda a ejecutar la clase 
        
        // creacion de objetos con parametros
        Cuenta cuenta1 = new Cuenta(50.00); 
        Cuenta cuenta2 = new Cuenta (-7.53);
        
        // imprime saldo de las dos cuentas
        System.out.printf("Saldo de cuenta1: $%.2f\n\n", 
                cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n\n",
                cuenta2.obtenerSaldo());
        
        Scanner entrada = new Scanner( System.in);
        double montoDeposito;
        
        // introducir los datos para cuenta 1
        System.out.print("Escriba el monto a depositar para cuenta1: ");
        montoDeposito=entrada.nextDouble();
        
        System.out.printf("\nsumando$%.2f al saldo de la cuenta1\n\n",
                montoDeposito);
        cuenta1.abonar(montoDeposito);
        
        System.out.print ("Ingrese el monto: ");
        montoDeposito = entrada.nextDouble();
        cuenta1.cargar(montoDeposito);
        System.out.printf ("\n%s %.2f %s\n "," Actualización de saldo: ",
                cuenta1.obtenerSaldo(),"bs");
        
        // imprime el saldo final de la cuenta 1
        System.out.printf("Saldo de cuenta1: $%.2f\n",
                cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n",
                cuenta2.obtenerSaldo());
        
        // introducir datos de cuenta 2
        System.out.printf("Escriba el monto a depositar para cuenta2:");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\nsumado$%.2f\n",
                montoDeposito);
        cuenta2.abonar(montoDeposito);
        
        //imprimir saldo final de la cuenta 2
        System.out.printf("Saldo de cuenta1: $%.2f\n",
                cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n",
                cuenta2.obtenerSaldo());
               
    }
    
}
