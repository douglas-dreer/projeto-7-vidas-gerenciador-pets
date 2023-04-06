package org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces;

import org.projetosetevidas.gerenciamentopets.dominio.dtos.CaoDTO;

import java.util.List;
import java.util.UUID;

public interface CaoServicePort {
    List<CaoDTO> buscarTodos();

    List<CaoDTO> buscarPorNome(String nome);

    void salvar(CaoDTO pet);

    CaoDTO buscarUltimoRegistroSalvo();

    CaoDTO buscarPorId(UUID id);

    void excluir(CaoDTO pet);
}
