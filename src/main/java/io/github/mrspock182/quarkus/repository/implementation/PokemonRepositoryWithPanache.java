package io.github.mrspock182.quarkus.repository.implementation;

import io.github.mrspock182.quarkus.repository.orm.PokemonOrm;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PokemonRepositoryWithPanache implements PanacheMongoRepository<PokemonOrm> {
}
