package com.example.demo.service;

import com.example.demo.domain.Endereco;
import com.example.demo.infrastructure.correios.CorreiosClient;
import com.example.demo.util.LogExecutionTime;
import org.springframework.stereotype.Service;


@Service
public class CepService {

    private final CorreiosClient correiosClient;

    public CepService(CorreiosClient correiosClient) {
        this.correiosClient = correiosClient;
    }

    @LogExecutionTime
    public Endereco obterEnderecoPorCep(String cep) throws ErrorGenerico {
        try {
            return correiosClient.getEndereco(cep);

        } catch (Exception ex) {
            throw new ErrorGenerico("Sem serviço{}", ex);
        }
    }
}

