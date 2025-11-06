package com.carros.atividade.grupo.carrosesi.configs;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "AFG Cars",
        version = "1.0",
        description = "Giovanna Felisardo, Fabrício Alves, Andressa Leal, Guilherme Sanches e Letícia Teixeira"
    )
)
public class Swagger {

}