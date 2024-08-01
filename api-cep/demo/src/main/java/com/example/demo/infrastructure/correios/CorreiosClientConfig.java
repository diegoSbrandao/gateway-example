package com.example.demo.infrastructure.correios;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.demo.infrastructure.correios")
public class CorreiosClientConfig {
}