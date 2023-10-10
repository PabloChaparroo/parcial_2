package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "autor")
public class Autor extends BaseEntidad{

    @Column(name = "name")
    private String nombre;
    @Column(name = "first_name")
    private String apellido;
    @Column(name = "biography", length = 1500)
    private String biografia;
}