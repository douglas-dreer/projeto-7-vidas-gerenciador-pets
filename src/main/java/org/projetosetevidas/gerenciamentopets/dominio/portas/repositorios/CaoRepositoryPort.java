package org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios;

import org.projetosetevidas.gerenciamentopets.dominio.Cao;
import org.projetosetevidas.gerenciamentopets.dominio.dtos.CaoDTO;

import java.util.List;
import java.util.UUID;

public interface CaoRepositoryPort {
    List<Cao> buscarTodos();

    List<Cao> buscarPorNome(String nome);

    void salvar(Cao pet);

    Cao buscarUltimoRegistroCadastrado();

    Cao buscarPorId(UUID id);

    void excluir(CaoDTO pet);
}
