package org.example;
import java.time.LocalDate;
public class Alimento extends Productos {

    private LocalDate fechaCaducidad;

    public Alimento(String identificadorUnico, String nombre, int precioUnitario, int cantidad, String categoria, LocalDate fechaCaducidad) {
        super(identificadorUnico, nombre, precioUnitario, cantidad, categoria);
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public boolean estaVencido(){
        return fechaCaducidad.isBefore(LocalDate.now());
    }

}
