package com.example.springrabbitmqproducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Direccionwmsc {
    private String direccion;
    private String ciudad;
    private String pais;
    private String provincia;
}
