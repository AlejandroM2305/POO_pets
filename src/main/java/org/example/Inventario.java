package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Productos> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Productos producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void eliminarProducto(Productos producto) {
        if (productos.remove(producto)) {
            System.out.println("Producto eliminado: " + producto.getNombre());
        } else {
            System.out.println("El producto no estaba en el inventario.");
        }
    }

    public void mostrarInventario() {
        System.out.println("=== Inventario Actual ===");
        for (Productos p : productos) {
            System.out.println("- " + p.getNombre() + " | Cantidad: " + p.getCantidad());
        }
    }

    public List<Productos> getListaProductos() {
        return productos;
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Inventario carrito = new Inventario();
//
//        Productos alimento = new Alimento("001", "Croquetas", 20, 10, "Alimento", "2025-12-31");
//        Productos accesorio = new Accesorios("002", "Collar", 15, 5, "Accesorio", "Cuero");
//
//        carrito.agregarProducto(alimento);
//        carrito.agregarProducto(accesorio);
//
//        carrito.mostrarInventario();
//    }
//}