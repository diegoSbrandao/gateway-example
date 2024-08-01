package com.main.project.controller;

import com.main.project.domain.Endereco;
import com.main.project.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class MainController {

    private final ClientService cepService;

    public MainController(ClientService cepService) {
        this.cepService = cepService;
    }

    @GetMapping("/cep/{cep}")
    public Endereco getEndereco(@PathVariable String cep) {
        return cepService.obterEnderecoPorCep(cep);

    }

}
