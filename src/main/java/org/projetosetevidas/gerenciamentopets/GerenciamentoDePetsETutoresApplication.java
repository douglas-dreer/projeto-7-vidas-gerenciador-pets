package org.projetosetevidas.gerenciamentopets;

import org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.repositorios.SpringPetRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = SpringPetRepository.class)
public class GerenciamentoDePetsETutoresApplication {
	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoDePetsETutoresApplication.class, args);
	}

}
