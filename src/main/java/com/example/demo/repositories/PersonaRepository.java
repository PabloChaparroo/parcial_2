package com.example.demo.repositories;

import com.example.demo.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'")
    Page<Persona> search2(@Param("filtro") String filtro, Pageable pageable);

    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE '%?1%' OR persona.apellido LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true
    )
    Page<Persona> search3(@Param("filtro") String filtro, Pageable pageable);
}