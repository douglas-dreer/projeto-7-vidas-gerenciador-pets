package org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces;

import org.projetosetevidas.gerenciamentopets.dominio.dtos.GatoDTO;

import java.util.List;

public interface GatoServicePort {
    List<GatoDTO> buscarTodos();

    List<GatoDTO> buscarPorNome(String nome);

    void salvar(GatoDTO pet);
}
