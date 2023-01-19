package com.proyecto1.demo.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long idExp;
    private String tituloExp;
    private String imgExp;
    private String descExp;

    public Experiencia() {
    }

    public Experiencia(long idExp, String tituloExp, String imgExp, String descExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.imgExp = imgExp;
        this.descExp = descExp;
    }

    public long getIdExp() {
        return idExp;
    }

    public void setIdExp(long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }
    
}