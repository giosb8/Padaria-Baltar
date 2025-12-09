package br.com.senai.infob.padariabaltar.Configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Padaria Baltar's",
        version = "1.0",
        description = "A Padaria da família brasileira"
    )
)
public class swagger {
}
