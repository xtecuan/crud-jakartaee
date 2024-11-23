/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xtesoft.samples.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author xtecuan
 */
@Entity
@Table(name = "asignatura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asignatura.findAll", query = "SELECT a FROM Asignatura a"),
    @NamedQuery(name = "Asignatura.findById", query = "SELECT a FROM Asignatura a WHERE a.id = :id"),
    @NamedQuery(name = "Asignatura.findByNombreAsignatura", query = "SELECT a FROM Asignatura a WHERE a.nombreAsignatura = :nombreAsignatura"),
    @NamedQuery(name = "Asignatura.findByDescripcionAsignatura", query = "SELECT a FROM Asignatura a WHERE a.descripcionAsignatura = :descripcionAsignatura"),
    @NamedQuery(name = "Asignatura.findByUnidadesValorativas", query = "SELECT a FROM Asignatura a WHERE a.unidadesValorativas = :unidadesValorativas")})
public class Asignatura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre_asignatura")
    private String nombreAsignatura;
    @Size(max = 200)
    @Column(name = "descripcion_asignatura")
    private String descripcionAsignatura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unidades_valorativas")
    private long unidadesValorativas;

    public Asignatura() {
    }

    public Asignatura(Long id) {
        this.id = id;
    }

    public Asignatura(Long id, String nombreAsignatura, long unidadesValorativas) {
        this.id = id;
        this.nombreAsignatura = nombreAsignatura;
        this.unidadesValorativas = unidadesValorativas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getDescripcionAsignatura() {
        return descripcionAsignatura;
    }

    public void setDescripcionAsignatura(String descripcionAsignatura) {
        this.descripcionAsignatura = descripcionAsignatura;
    }

    public long getUnidadesValorativas() {
        return unidadesValorativas;
    }

    public void setUnidadesValorativas(long unidadesValorativas) {
        this.unidadesValorativas = unidadesValorativas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignatura)) {
            return false;
        }
        Asignatura other = (Asignatura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.xtesoft.samples.model.Asignatura[ id=" + id + " ]";
    }
    
}
