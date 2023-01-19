package com.proyecto1.demo.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;

@Entity
public class Usuarios  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)

    private Long id;
    private String nombre;
    private String titulo;
    @Column(length = 1000)
    private String descripcion;
    private String fotoPerfil;

    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skills> skillList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idAb")
    private List<About> aboutList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSoc")
    private List<Social> socialList;
    
    public Usuarios() {
    }

    public Usuarios(Long id, String nombre, String titulo, String descripcion, String fotoPerfil) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fotoPerfil = fotoPerfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
    
}