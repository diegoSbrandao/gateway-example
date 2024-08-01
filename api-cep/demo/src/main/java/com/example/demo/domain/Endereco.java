package com.example.demo.domain;

public record Endereco(
        String cep,
        String logradouro,
        String complemento,
        String bairro,
        String localidade,
        String uf
) {
}