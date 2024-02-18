package com.example.springrabbitmqproducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clientewmsc {
    private String nombre;
    private String apellido;
    private String email;
    private String cedula;
    private List<Direccionwmsc> direccionwmscList;
}
