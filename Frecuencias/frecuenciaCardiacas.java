/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frecuencias;

/**
 *
 * @author LI141
 */
public class frecuenciaCardiacas { //inicio de clase 
    //Declaracion de variables
     String nombre, apellido, mes, dia;
     int anio, edad, FreMax, FreEsp;
     
     //constructor con parametros
     public frecuenciaCardiacas(String n, String a, String m, String d, int y, int e, int FM, int FE){
         nombre = n;
         apellido = a;
         dia = d;
         mes = m;
         anio = y;
         edad = e;
         FreMax = FM;
         FreEsp = FE;
         
     }
     
     // Metodos de obtener y establecer 
     public void setNombre(String n){
         nombre = n;
     }
     
     public String getNombre(){
         return nombre;
     }
      public void setApellido(String a){
         apellido = a;
     }
     
     public String getApellido(){
         return apellido;
     }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
       this.anio = anio;
    }

    public int getEdad() {
        return edad;
    }

    
    public void setEdad(int e) { // metodo para calcular edad
        edad = 2023-anio;
    }
     
     public void setFrecuenciaMax(int FM){ //metodo para calcular frecuencia maxima
         FreMax = 220-edad;    
     
     }
     public int getFrecuenciaMax(){ 
         return FreMax;
     }
     public void setFrecuenciaEsp(int FE){ //metodo para calcular la frecuencia esperada
         FreEsp = FreMax*100/85;
     }
     public int getFrecuenciaEsp(){
         return FreEsp;
     }
   
}
                              