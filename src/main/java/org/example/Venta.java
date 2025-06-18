package org.example;
import java.time.LocalDate;

public class Venta {
    private Cliente cliente;
    private Productos producto;
    private int cantidadVendida;
    private LocalDate fechaTransaccion;
    private Notificacion notificacion;

    public Venta(Cliente cliente, Productos producto, int cantidadVendida, LocalDate fechaTransaccion,Notificacion notificacion) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.fechaTransaccion = LocalDate.now();
        this.notificacion = notificacion;
        procesarVenta();
    }

    private void procesarVenta() {
        try {
            if (producto.verificarDisponibilidad() && cantidadVendida <= producto.getCantidad()) {

                producto.reducirStock(cantidadVendida);  // Puede lanzar excepción

                double total = calcularPrecioFinal();

                enviarNotificacion(total);

            } else {
                System.out.println("Producto no disponible.");
            }
        } catch (StockInsuficienteException e) {
            System.out.println("ERROR DE STOCK: " + e.getMessage());
        }
    }

    private double calcularPrecioFinal(){

        double precioBase = producto.getPrecioUnitario() * cantidadVendida;
        double precioDescuento = cliente.getDescuento();

        return precioBase - (precioBase * precioDescuento);
    }

    private void enviarNotificacion(double total){

        String mensaje ="Gracias por su compra, " + cliente.getNombre() +
                ". Producto: " + producto.getNombre() +
                ", Cantidad: " + cantidadVendida +
                ", Total con descuento: $" + total +
                ", Fecha: " + fechaTransaccion;

        notificacion.enviar(mensaje, cliente);

    }
}
