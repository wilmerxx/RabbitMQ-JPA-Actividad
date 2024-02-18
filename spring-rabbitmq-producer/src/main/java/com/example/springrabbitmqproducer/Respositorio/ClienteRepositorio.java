package com.example.springrabbitmqproducer.Respositorio;

import com.example.springrabbitmqproducer.model.Clientewmsc;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepositorio {

    public List<Clientewmsc> obtenerClientes = new ArrayList<>();

    void guardarCliente(Clientewmsc cliente){
        obtenerClientes.add(cliente);
    }

}
