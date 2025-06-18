package org.example;

public class NotificacionEmail implements Notificacion {


        @Override
        public void enviar(String mensaje, Cliente cliente) {

            System.out.println("Enviando mensaje al email: " + cliente.getCorreo());
            System.out.println("Su factura es: " + mensaje);
        }
    }

