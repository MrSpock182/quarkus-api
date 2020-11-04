package io.github.mrspock182.quarkus.resource;

import io.github.mrspock182.quarkus.adapter.Adapter;
import io.github.mrspock182.quarkus.dto.Pokemon;
import io.github.mrspock182.quarkus.repository.PokemonRepository;
import io.github.mrspock182.quarkus.repository.orm.PokemonOrm;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/quarkus/pokemon")
public class PokemonResource {

    private final PokemonRepository repository;
    private final Adapter<PokemonOrm, Pokemon> adapter;

    @Inject
    public PokemonResource(PokemonRepository repository, Adapter<PokemonOrm, Pokemon> adapter) {
        this.repository = repository;
        this.adapter = adapter;
    }

    @POST
    @Path("/save")
    @Produces(MediaType.TEXT_PLAIN)
    public String savePokemon(Pokemon pokemon) {
        repository.save(adapter.cast(pokemon));
        return "SUCCESS";
    }

    @GET
    @Path("/find-all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<PokemonOrm> getAllPokemon() {
        return repository.findAll();
    }

}
