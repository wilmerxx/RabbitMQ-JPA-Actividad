package com.example.springrabbitmqconsumer.Servicio;

import com.example.springrabbitmqconsumer.Repositorio.RepositorioCliente;
import com.example.springrabbitmqconsumer.model.Clientewmsc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioCliente {

    @Autowired
    private RepositorioCliente repositorioCliente;

    public void guardarCliente(Clientewmsc clientewmsc){
        repositorioCliente.save(clientewmsc);
    }
}
