package br.com.marktview.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import java.util.Arrays;

@Configuration
public class CorsConfig {

    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                // 1. Permite que o seu front-end acesse a API
                .allowedOrigins("http://localhost:4200")
                // 2. Permite os métodos que o front vai usar
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                // 3. Permite os cabeçalhos necessários
                .allowedHeaders("Authorization", "Content-Type", "Cache-Control")
                // 4. Permite o envio de cookies/tokens se necessário
                .allowCredentials(true);
    }

}
