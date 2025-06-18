package org.example;

public class ClientePremium extends Cliente{

    public ClientePremium(String iDCliente, String nombre, String correo, String numeroTelefono) {
        super(iDCliente, nombre, correo, numeroTelefono);
    }

    @Override
    public double getDescuento() {
        return 0.15;
    }
}
