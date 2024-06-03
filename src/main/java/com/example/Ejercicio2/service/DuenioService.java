
package com.example.Ejercicio2.service;

import com.example.Ejercicio2.model.Duenio;
import com.example.Ejercicio2.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService{
    
    @Autowired
    private IDuenioRepository duenioRepo;

    @Override
    public List<Duenio> getDuenios() {
        List<Duenio> listaDuenios = duenioRepo.findAll(); 
        return listaDuenios; 
    }

    @Override
    public void saveDuenio(Duenio unDuenio) {
        duenioRepo.save(unDuenio); 
    }

    @Override
    public void deleteDuenio(Long id) {
        duenioRepo.deleteById(id);
    }

    @Override
    public Duenio findDuenio(Long id) {
        Duenio duenio = duenioRepo.findById(id).orElse(null); 
        return duenio; 
    }

    @Override
    public void editDuenio(Duenio unDuenio) {
        this.saveDuenio(unDuenio);
    }
    
    
    
}
