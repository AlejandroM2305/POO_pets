package org.example;

public class NotificacionWhatsapp implements Notificacion{

    @Override
    public void enviar(String mensaje, Cliente cliente) {

        System.out.println("Enviando mensaje al numero: " + cliente.getNumeroTelefono());
        System.out.println("Su factura es: " + mensaje);
    }
}
