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

    private void procesarVenta(){
        if (producto instanceof Alimento) {
            Alimento alimento = (Alimento) producto;
            if (alimento.estaVencido()) {
                System.out.println("No se puede vender: el producto está vencido.");
                return;
            }
        }
        if (producto.verificarDisponibilidad() && cantidadVendida<= producto.getCantidad()){

            producto.reducirStock(cantidadVendida);

            double total = calcularPrecioFinal();

            enviarNotificacion(total);

        }
        else {
            System.out.println("No hay stock suficiente para procesar la venta.");
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
