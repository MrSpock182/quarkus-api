package io.github.mrspock182.quarkus.integration.implementation;

import io.github.mrspock182.quarkus.dto.Endereco;
import io.github.mrspock182.quarkus.integration.CepIntegration;
import io.quarkus.cache.CacheResult;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CepIntegrationImpl implements CepIntegration {

    @RestClient
    @Inject
    private ViaCepIntegrationWithRestClient integration;

    @Override
    @CacheResult(cacheName = "endereco-cache")
    public Endereco getCep(String cep) {
        return integration.getEndereco(cep);
    }
}
