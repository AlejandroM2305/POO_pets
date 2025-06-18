package org.example;

public class ClienteRegular extends Cliente{

    public ClienteRegular(String iDCliente, String nombre, String correo, String numeroTelefono) {
        super(iDCliente, nombre, correo, numeroTelefono);
    }

    @Override
    public double getDescuento() {
        return 0.05;
    }
}
