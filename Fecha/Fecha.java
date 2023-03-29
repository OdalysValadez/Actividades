package Fecha;



/**
 *
 * @author Odalys Valadez Apolinar
 */
public class Fecha { //incio de clase

    //variables
    int mes;
    int dia;
    int año;

    
    public Fecha() {

        
    }
//Constructor, con parametros
    
    public Fecha(int Año, int Mes, int Dia) { 
        dia = Dia;
        año = Año;
        mes = Mes;
    }

    //Metodos de estaclecer y obtener
    public void establecerDia(int dia) {
        this.dia = dia;
    }

    public int obtenerDia() {
        return dia;
    }

    public void establecerMes(int mes) {
        this.mes = mes;
    }

    public int obtenerMes() {
        return mes;
    }

    public void establecerAño(int año) {
        this.año = año;
    }

    public int obtenerAño() {
        return año;
    }
    
    
    //metodo para imprimir la fecha
    public void mostrarFecha() {

        System.out.printf("%s %d/%d/%d", "La fecha: ",
                dia, mes, año);
    }
}
