package org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.repositorios;

import org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.entidades.GatoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SpringGatoRepository extends CrudRepository<GatoEntity, UUID> {
    List<GatoEntity> findPetEntityByNomeContainingIgnoreCase(String nome);
}
