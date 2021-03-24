package com.spring.blog.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name="TB_POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)   // id gerador automaticamente
    private Long id;

    @NotBlank //não aceita valores em branco
    private String titulo;

    @NotBlank
    private String autor;

    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd-MM-yyy")
    private LocalDate data;

    @NotBlank
    @Lob
    private  String texto;

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getData() {
        return data;
    }

    public String getTexto() {
        return texto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

