/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xtesoft.samples.services;

import com.xtesoft.samples.model.Asignatura;
import jakarta.inject.Named;
import jakarta.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author xtecuan
 */
@Named
public class AsignaturaService extends BaseService<AsignaturaService> implements Serializable{

    public AsignaturaService() {
        super(AsignaturaService.class);
    }

    @Transactional
    public List<Asignatura> findAll() {
        return this.entityManager.createNamedQuery("Asignatura.findAll").getResultList();
    }

}
