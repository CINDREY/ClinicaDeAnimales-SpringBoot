
package com.example.Ejercicio2.service;

import com.example.Ejercicio2.model.Mascota;
import java.util.List;

public interface IMascotaService {
    
    //LECTURA: 
    public List<Mascota>getMascotas(); 
    
    //GUARDAR DATOS NUEVOS:
    public void saveMascota(Mascota masco); 
    
    //ELIMINAR: 
    public void deleteMascota(Long id); 
    
    //BUSCAR MASCOTA POR ID:
    public Mascota findMascota(Long id); 
    
    //EDITAR MASCOTA: 
    public void editMascota(Mascota masco); 

    
    //FIND BY Especie y Raza: 
    public List<Mascota> findByEspecieAndRaza(String especie, String raza);
    
    
    
}
