package com.example.springrabbitmqconsumer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Clientewmsc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String cedula;
   @OneToMany(mappedBy="clientewmsc", cascade=CascadeType.ALL)
    private List<Direccionwmsc> direccionwmscList;
}