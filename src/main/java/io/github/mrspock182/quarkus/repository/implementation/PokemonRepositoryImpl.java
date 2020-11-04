package io.github.mrspock182.quarkus.repository.implementation;

import io.github.mrspock182.quarkus.repository.PokemonRepository;
import io.github.mrspock182.quarkus.repository.orm.PokemonOrm;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PokemonRepositoryImpl implements PokemonRepository {

    private final PokemonRepositoryWithPanache pokemonRepository;

    @Inject
    public PokemonRepositoryImpl(PokemonRepositoryWithPanache pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @Override
    public void save(PokemonOrm pokemon) {
        pokemonRepository.persist(pokemon);
    }

    @Override
    public List<PokemonOrm> findAll() {
        return pokemonRepository.findAll().list();
    }
}
