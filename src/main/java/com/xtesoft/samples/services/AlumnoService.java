/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xtesoft.samples.services;

import com.xtesoft.samples.model.Alumno;
import jakarta.inject.Named;
import jakarta.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author xtecuan
 */
@Named
public class AlumnoService extends BaseService<Alumno> implements Serializable {

    public AlumnoService() {
        super(Alumno.class);
    }

    @Transactional
    public List<Alumno> findAll() {
        return this.entityManager.createNamedQuery("Alumno.findAll").getResultList();
    }

}
