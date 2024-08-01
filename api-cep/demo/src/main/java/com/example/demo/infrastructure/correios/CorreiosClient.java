package com.example.demo.infrastructure.correios;

import com.example.demo.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "correiosClient", url = "${correios.url}", fallback = CorreiosClientFallback.class)
public interface CorreiosClient {

    @GetMapping("/{cep}/json/")
    Endereco getEndereco(@PathVariable("cep") String cep);
}