/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author Personal
 */
public class Empleados { //inicio de clase
    
    //variables
    String Nombre;
    String Apellido;
    double Salario;
    double Pago;
    
    public Empleados (String n, String a, double s){ //constructor
        Nombre = n;
        Apellido = a;
        Salario = s;
    }
    
    public Empleados (){ //2do constructor
       
    }
    
// metodo de obtener y establecer 
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        if (Salario >0 ) //Establecer si el salario es mayor a 0
        this.Salario = Salario;
    }
    
    //Calcula salario anual
    public double getPago(){
        Pago = Salario * 12; 
        return Pago;
    }
    
     public double Abono(){
         return (Salario + (Salario*0.1))* 12; // Metodo para obtener abono del 10%
     }
}
