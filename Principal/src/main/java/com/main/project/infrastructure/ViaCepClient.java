package com.main.project.infrastructure;

import com.main.project.domain.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "correiosClient", url = "${viacep.url}")
public interface ViaCepClient {

    @GetMapping("/{cep}")
    Endereco getEndereco(@PathVariable("cep") String cep);
}
