package io.github.mrspock182.quarkus.repository;

import io.github.mrspock182.quarkus.repository.orm.PokemonOrm;

import java.util.List;

public interface PokemonRepository {
    void save(PokemonOrm pokemon);

    List<PokemonOrm> findAll();
}
