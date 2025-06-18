package org.example;

public abstract class Cliente {
    private String iDCliente;
    private String nombre;
    private String correo;
    private String numeroTelefono;

    public Cliente(String iDCliente, String nombre, String correo, String numeroTelefono) {
        this.iDCliente = iDCliente;
        this.nombre = nombre;
        this.correo = correo;
        this.numeroTelefono = numeroTelefono;
    }

    public String getiDCliente() {
        return iDCliente;
    }

    public void setiDCliente(String iDCliente) {
        this.iDCliente = iDCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public abstract double getDescuento();

}
