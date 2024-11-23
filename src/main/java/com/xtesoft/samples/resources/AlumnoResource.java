/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xtesoft.samples.resources;

import com.xtesoft.samples.model.Alumno;
import com.xtesoft.samples.services.AlumnoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import java.util.List;

/**
 *
 * @author xtecuan
 */
@Path("alumnos")
@Consumes("application/json")
@Produces("application/json")
public class AlumnoResource {

    @Inject
    private AlumnoService alumnoService;

    @GET
    public Response findAllAlumnos() {

        List<Alumno> alumnos = alumnoService.findAll();

        if (alumnos != null && !alumnos.isEmpty()) {
            return Response.ok(alumnos).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
