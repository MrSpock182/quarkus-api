package io.github.mrspock182.quarkus.repository.orm;

import io.quarkus.mongodb.panache.MongoEntity;

@MongoEntity(collection="pokemon")
public class PokemonOrm {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
