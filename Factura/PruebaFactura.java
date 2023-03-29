package Factura;

import java.util.Scanner; 
public class PruebaFactura { // inicio de clase
    public static void main (String [ ] args){ // ejecicucion de la clase
        Scanner entrada = new Scanner(System.in); 

        Factura miFactura = new Factura("siete", "Hilo de albañil", 5, 10, 50.00); // Creacion de objetos
            
            // Imprime los parametros
            System.out.printf("Numero de la piezas es: " + miFactura.getNumpieza()+ " "+ "\nDescripcion "+ miFactura.getDescripcion()+ " "+
            "\nCantidad: "+ miFactura.getCompra()+ " "+ "\nPrecio: "+ miFactura.getPrecio()+ " "+ "\nTotal: "+ miFactura.getMonto());
        
            
            System.out.println(" Ingrese el numero de la pieza: ");
            String nump = entrada.nextLine();
            miFactura.setNumpieza(nump);

            System.out.println("Ingresa la descripcion del articulo: ");
            String descripcion = entrada.nextLine();
            miFactura.setDescripcion(descripcion);

            System.out.println("Cantidad a comprar: ");
            int cantidad = entrada.nextInt();
            miFactura.setCompra(cantidad);

            System.out.println("Ingresa el precio: ");
            double precio = entrada.nextDouble();
            miFactura.setPrecio(precio); 

            miFactura.getMonto();


            System.out.printf("Numero de la piezas es: " + miFactura.getNumpieza()+ " "+ "\nDescripcion "+ miFactura.getDescripcion()+ " "+
            "\nCantidad: "+ miFactura.getCompra()+ " "+ "\nPrecio: "+ miFactura.getPrecio()+ " "+ "\nTotal: "+ miFactura.getMonto());


    }
}
