
package com.example.Ejercicio2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id; 
    private String nombreMasco; 
    private String especie; 
    private String raza; 
    private String color;
    @OneToOne
    private Duenio unDuenio; 

    public Mascota() {
    }

    public Mascota(Long id, String nombreMasco, String especie, String raza, String color, Duenio unDuenio) {
        this.id = id;
        this.nombreMasco = nombreMasco;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.unDuenio = unDuenio;
    }


    

    
    
    
    
    
}
