package org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios;

import org.projetosetevidas.gerenciamentopets.dominio.Cao;

import java.util.List;

public interface CaoRepositoryPort {
    List<Cao> buscarTodos();
    List<Cao> buscarPorNome(String nome);
    void salvar(Cao pet);
}
