package com.example.demo.controller;

import com.example.demo.domain.Endereco;
import com.example.demo.service.CepService;
import com.example.demo.service.ErrorGenerico;
import com.example.demo.util.LogExecutionTime;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CepController {
    private final CepService cepService;

    public CepController(CepService cepService) {
        this.cepService = cepService;
    }

    @LogExecutionTime
    @GetMapping("/cep/{cep}")
    public Endereco getEndereco(@PathVariable String cep) throws ErrorGenerico {
        return cepService.obterEnderecoPorCep(cep);

    }


}