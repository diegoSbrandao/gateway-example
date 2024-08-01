package com.main.project.service;

import com.main.project.domain.Endereco;
import com.main.project.infrastructure.ViaCepClient;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ViaCepClient correiosViaCepClient;

    public ClientService(ViaCepClient correiosViaCepClient) {
        this.correiosViaCepClient = correiosViaCepClient;
    }

    public Endereco obterEnderecoPorCep(String cep) {
        return correiosViaCepClient.getEndereco(cep);
    }

}

