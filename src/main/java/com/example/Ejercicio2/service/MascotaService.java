
package com.example.Ejercicio2.service;

import com.example.Ejercicio2.model.Mascota;
import com.example.Ejercicio2.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
    
    @Autowired
    private IMascotaRepository mascoRepo; 

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota>listaMascotas=mascoRepo.findAll(); 
        return listaMascotas;
        
    }

    @Override
    public void saveMascota(Mascota masco) {
        mascoRepo.save(masco); 
    }

    @Override
    public void deleteMascota(Long id) {
        mascoRepo.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        Mascota masco = mascoRepo.findById(id).orElse(null); 
        return masco; 
    }

    @Override
    public void editMascota(Mascota masco) {
        this.saveMascota(masco);
    }

    @Override
    public List<Mascota> findByEspecieAndRaza(String especie, String raza) {
        List<Mascota> listaEspecial = mascoRepo.findByEspecieAndRaza(especie, raza); 
        return listaEspecial; 
    }


    
    
}
