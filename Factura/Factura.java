package Factura;

public class Factura { // inicio de clase
    
    // declaracion de variables
    private String numpieza;
    private String descripcion;
    private int compra;
    private double precio;
    private double monto;

    // constructor con parametros
    public Factura (String nump, String desc, int com, double p, double mo){
        numpieza = nump;
        descripcion = desc;
        compra = com;
        precio = p;
        monto = mo;
    }
    // metodos de get y set
    public String getNumpieza() {
        return numpieza;
    }

    public void setNumpieza(String numpieza) {
        this.numpieza = numpieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // precio total de la compra
    public double getMonto() {
     monto = compra*precio;
     return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    

    }
