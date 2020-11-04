package io.github.mrspock182.quarkus.integration;

import io.github.mrspock182.quarkus.dto.Endereco;

public interface CepIntegration {
    Endereco getCep(String cep);
}
