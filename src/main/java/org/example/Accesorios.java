package org.example;

public class Accesorios extends Productos{

    private String material;

    public Accesorios(String identificadorUnico, String nombre, int precioUnitario, int cantidad, String categoria, String material) {
        super(identificadorUnico, nombre, precioUnitario, cantidad, categoria);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

}
