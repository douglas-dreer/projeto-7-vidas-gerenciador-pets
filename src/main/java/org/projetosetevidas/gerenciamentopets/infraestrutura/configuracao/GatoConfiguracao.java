package org.projetosetevidas.gerenciamentopets.infraestrutura.configuracao;

import org.projetosetevidas.gerenciamentopets.dominio.adaptadores.servicos.GatoServiceImp;
import org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces.GatoServicePort;
import org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios.GatoRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatoConfiguracao {
    @Bean
    GatoServicePort gatoService(GatoRepositoryPort gatoRepositoryPort) {
        return new GatoServiceImp(gatoRepositoryPort);
    }
}
