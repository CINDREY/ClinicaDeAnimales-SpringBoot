
package com.example.Ejercicio2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Duenio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id; 
    private String nombreDuenio; 
    private String apellidoDuenio; 
    private String celular; 

    public Duenio() {
    }

    public Duenio(Long id, String nombreDuenio, String apellidoDuenio, String celular) {
        this.id = id;
        this.nombreDuenio = nombreDuenio;
        this.apellidoDuenio = apellidoDuenio;
        this.celular = celular;
    }

    

    
    
    
    
}
