package com.example.springrabbitmqconsumer.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Direccionwmsc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String direccion;
    private String ciudad;
    private String pais;
    private String provincia;
    @ManyToOne
    @JoinColumn(name = "clientewmsc_id", referencedColumnName = "id", nullable = false)
    private Clientewmsc clientewmsc;
}
