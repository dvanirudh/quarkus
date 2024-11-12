package org.quarkus.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.quarkus.entity.Employee;
import org.quarkus.service.EmpService;
import java.util.List;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmpController {

    @Inject
    EmpService service;

    @GET
    @Path("/all")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GET
    @Path("/{id}")
    public Response getEmployeeById(@PathParam("id") Long id) {
        Employee employee = service.getEmployeeById(id);
        if (employee != null) {
            return Response.ok(employee).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).entity("Employee not found with ID: " + id).build();
        }
    }
}
