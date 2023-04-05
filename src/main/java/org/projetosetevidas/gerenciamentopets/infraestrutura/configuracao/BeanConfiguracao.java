package org.projetosetevidas.gerenciamentopets.infraestrutura.configuracao;

import org.projetosetevidas.gerenciamentopets.dominio.adaptadores.servicos.PetServiceImp;
import org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces.PetServicePort;
import org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios.PetRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguracao {
    @Bean
    PetServicePort produtoService(PetRepositoryPort petRepositoryPort) {
        return new PetServiceImp(petRepositoryPort);
    }
}
