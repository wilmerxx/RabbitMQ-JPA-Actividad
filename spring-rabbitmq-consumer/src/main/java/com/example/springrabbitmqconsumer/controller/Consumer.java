package com.example.springrabbitmqconsumer.controller;

import com.example.springrabbitmqconsumer.Servicio.ServicioCliente;
import com.example.springrabbitmqconsumer.model.Clientewmsc;
import com.example.springrabbitmqconsumer.model.Direccionwmsc;
import com.example.springrabbitmqconsumer.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class Consumer {
    @Autowired
    private ServicioCliente servicioCliente;

    @RabbitListener(queues = "queue.A")
    private void receive(Clientewmsc clientewmsc){
        log.info("Message received from QUEUE.A ->{}", clientewmsc);
            List<Direccionwmsc> nuevasDirecciones = new ArrayList<>();

            for (Direccionwmsc direccion : clientewmsc.getDireccionwmscList()) {
                Direccionwmsc nuevaDireccion = new Direccionwmsc();
                nuevaDireccion.setDireccion(direccion.getDireccion());
                nuevaDireccion.setCiudad(direccion.getCiudad());
                nuevaDireccion.setPais(direccion.getPais());
                nuevaDireccion.setClientewmsc(clientewmsc);
                nuevaDireccion.setProvincia(direccion.getProvincia());
                nuevasDirecciones.add(nuevaDireccion);
            }

            clientewmsc.setDireccionwmscList(nuevasDirecciones);

        servicioCliente.guardarCliente(clientewmsc);

    }

    @RabbitListener(queues = "queue.B")
    private void receiveFromB(Message message){
        log.info("Message received from QUEUE.B ->{}", message);
    }
    
}
