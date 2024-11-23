/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.xtesoft.samples.beans;

import com.xtesoft.samples.model.Alumno;
import com.xtesoft.samples.services.AlumnoService;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author xtecuan
 */
@Named(value = "alumnosBean")
@ViewScoped
public class AlumnosBean implements Serializable {

    @Inject
    private AlumnoService service;

    private List<Alumno> alumnos;

    private Alumno alumno;

    /**
     * Creates a new instance of AlumnosBean
     */
    public AlumnosBean() {
    }

    public List<Alumno> getAlumnos() {

        if (alumnos == null) {
            this.alumnos = service.findAll();
        }
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Alumno getAlumno() {
        if (alumno == null) {
            alumno = new Alumno();
        }
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

}
