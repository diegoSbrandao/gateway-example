package com.gateway.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("client", r -> r
//                        .path("/cep/**")
//                        .uri("http://localhost:9000/"))
////                .route("staff", r -> r
////                        .path("/staff")
////                        .uri("http://localhost:8083/"))
////                .route("cep - Brasilapi", r -> r
////                        .path("/cep/v1/**")
////                        .filters(f -> f.rewritePath("/cep/v1/(?<cep>.*)", "/api/cep/v1/${cep}"))
////                        .uri("https://brasilapi.com.br"))
////                .route("cep - viacep", r -> r
////                        .path("/cep/**")
////                        .filters(f -> f.rewritePath("/cep/(?<cep>.*)", "/ws/${cep}/json/"))
////                        .uri("https://viacep.com.br"))
//                .build();
//
//    }
}