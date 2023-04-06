package org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.repositorios;

import org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.entidades.GatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SpringGatoRepository extends JpaRepository<GatoEntity, UUID> {
    List<GatoEntity> findGatoEntityByNomeContainingIgnoreCase(String nome);

    GatoEntity findTopByOrderByIdDesc();
}
