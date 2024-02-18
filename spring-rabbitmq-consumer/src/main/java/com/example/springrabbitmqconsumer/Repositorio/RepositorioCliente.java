package com.example.springrabbitmqconsumer.Repositorio;

import com.example.springrabbitmqconsumer.model.Clientewmsc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCliente extends JpaRepository<Clientewmsc, Integer> {
}
