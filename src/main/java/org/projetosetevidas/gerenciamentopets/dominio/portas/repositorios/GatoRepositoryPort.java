package org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios;

import org.projetosetevidas.gerenciamentopets.dominio.Gato;

import java.util.List;

public interface GatoRepositoryPort {
    List<Gato> buscarTodos();
    List<Gato> buscarPorNome(String nome);
    void salvar(Gato pet);
}
