package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "persona")
public class Persona extends BaseEntidad {

    @Column(name="first_name")
    private String nombre;
    @Column(name="last_name")
    private String apellido;
    @Column(name="DNI")
    private int dni;

    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name="domicilio_id")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinTable(
            name="persona-libro",
            joinColumns = @JoinColumn(name ="persona_id"),
            inverseJoinColumns = @JoinColumn(name="libro_id")
    )
    private List<Libro> libros = new ArrayList<Libro>();
}