package org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios;

import org.projetosetevidas.gerenciamentopets.dominio.Pet;

import java.util.List;

public interface PetRepositoryPort {
    List<Pet> buscarTodos();
    List<Pet> buscarPorNome(String nome);
    void salvar(Pet pet);
}
