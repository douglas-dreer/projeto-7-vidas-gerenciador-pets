package org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.repositorios;

import org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.entidades.CaoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SpringCaoRepository extends CrudRepository<CaoEntity, UUID> {
    List<CaoEntity> findPetEntityByNomeContainingIgnoreCase(String nome);
}
