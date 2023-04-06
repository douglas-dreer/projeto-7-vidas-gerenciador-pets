package org.projetosetevidas.gerenciamentopets.infraestrutura.configuracao;

import org.projetosetevidas.gerenciamentopets.dominio.adaptadores.servicos.CaoServiceImp;
import org.projetosetevidas.gerenciamentopets.dominio.adaptadores.servicos.PetServiceImp;
import org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces.CaoServicePort;
import org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces.PetServicePort;
import org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios.CaoRepositoryPort;
import org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios.PetRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CaoConfiguracao {
    @Bean
    CaoServicePort caoService(CaoRepositoryPort caoRepositoryPort) {
        return new CaoServiceImp(caoRepositoryPort);
    }


}
