package com.proyecto1.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String NombreSkill;
    private int porcentajeSkill;

    public Skills() {
    }

    public Skills(Long idSkill, String NombreSkill, int porcentajeSkill) {
        this.idSkill = idSkill;
        this.NombreSkill = NombreSkill;
        this.porcentajeSkill = porcentajeSkill;
    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombreSkill() {
        return NombreSkill;
    }

    public void setNombreSkill(String NombreSkill) {
        this.NombreSkill = NombreSkill;
    }

    public int getPorcentajeSkill() {
        return porcentajeSkill;
    }

    public void setPorcentajeSkill(int porcentajeSkill) {
        this.porcentajeSkill = porcentajeSkill;
    }

    
}