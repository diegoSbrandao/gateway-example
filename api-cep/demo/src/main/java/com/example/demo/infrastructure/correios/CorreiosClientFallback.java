package com.example.demo.infrastructure.correios;

import com.example.demo.domain.Endereco;
import org.springframework.stereotype.Component;


@Component
public class CorreiosClientFallback implements CorreiosClient {

    @Override
    public Endereco getEndereco(String cep) {
        return null;
    }
}