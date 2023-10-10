package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Domicilio extends BaseEntidad{
    @Column(name="street")
    private String calle;
    @Column(name="number")
    private int numero;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="localidad_id")
    private Localidad localidad;
}