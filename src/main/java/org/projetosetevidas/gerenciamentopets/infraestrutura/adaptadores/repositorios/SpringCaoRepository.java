package org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.repositorios;

import org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.entidades.CaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SpringCaoRepository extends JpaRepository<CaoEntity, UUID> {
    List<CaoEntity> findCaoEntityByNomeContainingIgnoreCase(String nome);

    CaoEntity findTopByOrderByIdDesc();
}
