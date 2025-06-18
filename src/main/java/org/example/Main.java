package org.example;

import java.time.LocalDate;
        public class Main {
            public static void main(String[] args) {

                // Crear productos
                Alimento croquetas = new Alimento(
                        "A001",
                        "Croquetas Premium",
                        5000,
                        10,
                        "Alimento",
                        LocalDate.of(2025, 03, 31)  // fecha de caducidad
                );

                Accesorios collar = new Accesorios(
                        "AC001",
                        "Collar de cuero",
                        2000,
                        5,
                        "Accesorio",
                        "Cuero"
                );

                // Crear clientes
                Cliente clienteRegular = new ClienteRegular(
                        "C001",
                        "Juan Perez",
                        "juan@mail.com",
                        "555-1234"
                );

                Cliente clientePremium = new ClientePremium(
                        "C002",
                        "Ana Gomez",
                        "ana@mail.com",
                        "555-5678"
                );

                // Crear notificaciones (asumiendo que tienes clases que implementan Notificacion)
                Notificacion emailNotificacion = new NotificacionEmail();
                Notificacion whatsappNotificacion = new NotificacionWhatsapp();

                // Crear una venta: Juan compra 3 croquetas con notificación por email
                Venta venta1 = new Venta(
                        clienteRegular,
                        croquetas,
                        3,
                        LocalDate.now(),
                        emailNotificacion
                );

                // Crear otra venta: Ana compra 1 collar con notificación por WhatsApp
                Venta venta2 = new Venta(
                        clientePremium,
                        collar,
                        1,
                        LocalDate.now(),
                        whatsappNotificacion
                );
            }
        }
