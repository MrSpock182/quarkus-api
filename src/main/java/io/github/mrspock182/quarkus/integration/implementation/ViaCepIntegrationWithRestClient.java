package io.github.mrspock182.quarkus.integration.implementation;

import io.github.mrspock182.quarkus.dto.Endereco;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ws")
@RegisterRestClient
public interface ViaCepIntegrationWithRestClient {
    @GET
    @Path("/{cep}/json")
    @Produces(MediaType.APPLICATION_JSON)
    Endereco getEndereco(@PathParam(value = "cep") String cep);
}
