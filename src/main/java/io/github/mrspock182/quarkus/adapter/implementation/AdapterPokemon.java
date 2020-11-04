package io.github.mrspock182.quarkus.adapter.implementation;

import io.github.mrspock182.quarkus.adapter.Adapter;
import io.github.mrspock182.quarkus.dto.Pokemon;
import io.github.mrspock182.quarkus.repository.orm.PokemonOrm;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AdapterPokemon implements Adapter<PokemonOrm, Pokemon> {

    @Override
    public PokemonOrm cast(Pokemon pokemon) {
        PokemonOrm orm = new PokemonOrm();
        orm.setName(pokemon.getName());
        orm.setType(pokemon.getType());
        return orm;
    }
}
