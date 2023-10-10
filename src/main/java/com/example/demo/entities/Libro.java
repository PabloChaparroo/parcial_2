package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="libro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro extends BaseEntidad{

    @Column(name="title")
    private String titulo;
    @Column(name = "date")
    private int fecha;
    @Column(name="gender")
    private String genero;
    @Column(name="pages")
    private int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autor = new ArrayList<Autor>();
}