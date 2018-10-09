package com.br.unifil.gerador.de.prova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource(value = "src/main/resources/application.properties")
public class GeradorDeProvaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeradorDeProvaApplication.class, args);
	}
}
