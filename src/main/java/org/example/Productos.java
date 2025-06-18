package org.example;

public abstract class Productos {

    private String identificadorUnico;
    private String nombre;
    private int precioUnitario;
    private int cantidad;
    private String categoria;

    public Productos(String identificadorUnico, String nombre, int precioUnitario, int cantidad, String categoria) {
        this.identificadorUnico = identificadorUnico;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getIdentificadorUnico() {
        return identificadorUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getCategoria() {
        return categoria;
    }
    //Metodos

    public boolean verificarDisponibilidad(){
        return cantidad > 0;
    }

    public void reducirStock(int cantidadVendida) throws StockInsuficienteException {
        if (cantidadVendida <= cantidad) {
            cantidad -= cantidadVendida;
        } else {
            throw new StockInsuficienteException("No hay suficiente stock. Quedan: " + cantidad + " unidades.");
        }
    }


}
