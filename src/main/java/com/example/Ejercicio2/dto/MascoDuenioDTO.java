
package com.example.Ejercicio2.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MascoDuenioDTO implements Serializable{
    
    private String nombreMasco; 
    private String especie; 
    private String raza; 
    private String nombreDuenio; 
    private String apellidoDuenio; 

    public MascoDuenioDTO() {
    }

    public MascoDuenioDTO(String nombreMasco, String especie, String raza, String nombreDuenio, String apellidoDuenio) {
        this.nombreMasco = nombreMasco;
        this.especie = especie;
        this.raza = raza;
        this.nombreDuenio = nombreDuenio;
        this.apellidoDuenio = apellidoDuenio;
    }
    
    
    
}
