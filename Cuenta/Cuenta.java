
package Cuenta;

/**
 *
 * @author Odalys Valadez Apolinar 
 */
public class Cuenta { //inico de programa
    
    private double saldo; // declara variable solo para la clase
    
public Cuenta(double saldoInicial){ // constructor de cuenta
    
            // condicional si el saldo inicial es mayor a 0
        if (saldoInicial > 0.0)
            saldo = saldoInicial;
        else
            saldo=saldoInicial;
    }

// Inicia la operacion que suma el saldo
public void abonar (double monto){
    saldo = saldo + monto;}
   
    public double obtenerSaldo(){ //get 
    
    return saldo;
}
    // metodo para calcular el saldo con la carga 
    public void cargar (double monto){
        if (monto>saldo){ //condicional si el monto es mayor a saldo 
            System.out.println("El monto a cargar excede el saldo de la cuenta");
        }
        
        else {
            saldo -= monto; //Se hace la operacion 
        }
    }
}

