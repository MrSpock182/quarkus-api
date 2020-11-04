package io.github.mrspock182.quarkus.resource;

import io.github.mrspock182.quarkus.dto.Endereco;
import io.github.mrspock182.quarkus.integration.CepIntegration;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/enderecos")
public class CepResource {

    private final CepIntegration integration;

    @Inject
    public CepResource(CepIntegration integration) {
        this.integration = integration;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{cep}")
    public Endereco findCep(@PathParam("cep") String cep) {
        return integration.getCep(cep);
    }
}
