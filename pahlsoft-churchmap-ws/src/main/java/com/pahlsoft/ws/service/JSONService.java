package com.pahlsoft.ws.service;

import com.pahlsoft.churchmap.dao.ChurchmapParishionersCoordinatesEntity;
import com.pahlsoft.churchmap.dao.ParishionersEntity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/json/parishioner")
public class JSONService {

    EntityManagerFactory emf;
    EntityManager entityManager;
    short parishionerId;

	@GET
	@Path("/get")
	@Produces("text/html")
	public String getParishionerInfo() {
		String output = "No Product Specified.";
		return output;
	}
	
	@GET
	@Path("/get/{param}")
	@Produces("application/json")
	public List<ChurchmapParishionersCoordinatesEntity> getParishionerInfo(@PathParam("param") int parishionerId) {

        emf = Persistence.createEntityManagerFactory("PersistenceUnit");

        entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select p from ChurchmapParishionersCoordinatesEntity p where p.parishionerId  = " + parishionerId);
        List<ChurchmapParishionersCoordinatesEntity> parishioners = query.getResultList();

        return parishioners;
	}
 
	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createParishioner(ParishionersEntity parishioner) {
 
		String result = "Parishioner created : " + parishioner;
        //TODO: Need to write some Persistence Layer here.
		return Response.status(201).entity(result).build();
 
	}
 
}