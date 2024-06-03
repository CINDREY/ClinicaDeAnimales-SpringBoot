
package com.example.Ejercicio2.repository;

import com.example.Ejercicio2.model.Mascota;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long>{

    public List<Mascota> findByEspecieAndRaza(String especie, String raza);
    
}
