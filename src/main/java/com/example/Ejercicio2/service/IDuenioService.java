
package com.example.Ejercicio2.service;

import com.example.Ejercicio2.model.Duenio;
import java.util.List;


public interface IDuenioService {
    
    //LECTURA
    public List<Duenio>getDuenios(); 
    
    //ALTA
    public void saveDuenio(Duenio unDuenio); 
    
    //BAJA
    public void deleteDuenio(Long id); 
    
    //BUSCAR DUEÑO POR ID: 
    public Duenio findDuenio(Long id); 
    
    //EDITAR DUENIO; 
    public void editDuenio(Duenio unDuenio);
    
    
    
    
}
