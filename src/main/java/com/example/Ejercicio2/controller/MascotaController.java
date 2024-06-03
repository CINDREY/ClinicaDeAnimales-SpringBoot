
package com.example.Ejercicio2.controller;

import com.example.Ejercicio2.dto.MascoDuenioDTO;
import com.example.Ejercicio2.model.Duenio;
import com.example.Ejercicio2.model.Mascota;
import com.example.Ejercicio2.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    
    @Autowired
    private IMascotaService mascoServ; 
    
    
    //CREATE
    @PostMapping("/mascota/crear")
    public String saveMasco(@RequestBody Mascota masco){
        mascoServ.saveMascota(masco);
        return "Mascota creada exitosamente"; 
    }
    
    
    //READ:
    @GetMapping("/mascota/traer")
    public List<Mascota>getMascotas(){
        List<Mascota>listaMascotas = mascoServ.getMascotas(); 
        return listaMascotas; 
    }

    //UPDATE:
    @PutMapping("/mascota/modificar")
    public Mascota editMascota(@RequestBody Mascota masco){
        mascoServ.editMascota(masco); 
        return mascoServ.findMascota(masco.getId()); 
        
    }
    
    //DETELE
    @DeleteMapping("/mascota/eliminar/{id}")
    public String deleteMascota(@PathVariable Long id){
        mascoServ.deleteMascota(id);
        return "Mascota eliminada"; 
    }
    
    //FIND BY Especie y Raza: 
    @GetMapping("mascota/traerEspecial")
    public List<Mascota>getEspecieRaza(@RequestParam String especie, 
                                    @RequestParam String raza){
        List<Mascota>listadoEspecial = mascoServ.findByEspecieAndRaza(especie , raza); 
        return listadoEspecial; 
    }
    
    //DTO MASCOTA Y DUEÑO: 
    @GetMapping("/mascotayduenio/{id}")
    @ResponseBody
    public MascoDuenioDTO mascoDuenio(@PathVariable Long id){
        Mascota masco = mascoServ.findMascota(id); 
        
        Duenio duenio = masco.getUnDuenio(); 
        
       MascoDuenioDTO mascoduenio = new MascoDuenioDTO(); 
       mascoduenio.setNombreMasco(masco.getNombreMasco());
       mascoduenio.setEspecie(masco.getEspecie());
       mascoduenio.setRaza(masco.getRaza());
       mascoduenio.setNombreDuenio(duenio.getNombreDuenio());
       mascoduenio.setApellidoDuenio(duenio.getApellidoDuenio());
       
       return mascoduenio; 
        
    }
    
}
