/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xtesoft.samples.resources;

import com.xtesoft.samples.model.Asignatura;
import com.xtesoft.samples.services.AsignaturaService;
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
@Path("asignaturas")
@Consumes("application/json")
@Produces("application/json")
public class AsignaturaResource {

    @Inject
    private AsignaturaService asignaturaService;

    @GET
    public Response findAllAsignaturas() {

        List<Asignatura> asignaturas = asignaturaService.findAll();

        if (asignaturas != null && !asignaturas.isEmpty()) {
            return Response.ok(asignaturas).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
