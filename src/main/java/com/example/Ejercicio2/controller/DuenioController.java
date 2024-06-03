    
package com.example.Ejercicio2.controller;

import com.example.Ejercicio2.model.Duenio;
import com.example.Ejercicio2.service.IDuenioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenioController {
    
    @Autowired
    private IDuenioService duenioServ; 
    
    //CREATE:
    @PostMapping("/duenio/crear")
    public String saveDuenio(@RequestBody Duenio unDuenio){
        duenioServ.saveDuenio(unDuenio);
        return "El dueño se creó correctamente"; 
    }
    
    
    //READ
    @GetMapping("/duenio/vertodos")
    public List<Duenio>getDuenios(){
        List<Duenio>listaDuenios = duenioServ.getDuenios(); 
        return listaDuenios; 
    }
    
    
    //UPDATE
    @PutMapping("/duenio/modificar")
    public Duenio editDuenio(@RequestBody Duenio unDuenio){
        duenioServ.editDuenio(unDuenio);
        return duenioServ.findDuenio(unDuenio.getId()); 
    }
    
    
    //DELETE
    @DeleteMapping("/duenio/eliminar/{id}")
    public String deleteDuenio(@PathVariable Long id){
        duenioServ.deleteDuenio(id);
        return "Dueño eliminado"; 
        
    }
    
}
