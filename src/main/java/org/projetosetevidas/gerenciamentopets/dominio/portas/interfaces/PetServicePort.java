package org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces;

import org.projetosetevidas.gerenciamentopets.dominio.dtos.PetDTO;

import java.util.List;

public interface PetServicePort {
    List<PetDTO> buscarTodos();

    List<PetDTO> buscarPorNome(String nome);

    void salvar(PetDTO pet);
}
