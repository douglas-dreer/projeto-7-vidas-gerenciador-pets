package org.projetosetevidas.gerenciamentopets.dominio.adaptadores.servicos;

import org.projetosetevidas.gerenciamentopets.dominio.Cao;
import org.projetosetevidas.gerenciamentopets.dominio.dtos.CaoDTO;
import org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces.CaoServicePort;
import org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios.CaoRepositoryPort;
import org.projetosetevidas.gerenciamentopets.dominio.utils.MapperUtil;

import java.util.List;

public class CaoServiceImp implements CaoServicePort {

     private final CaoRepositoryPort caoRepository;

    public CaoServiceImp(CaoRepositoryPort caoRepository) {
        this.caoRepository = caoRepository;
    }

    @Override
    public List<CaoDTO> buscarTodos() {
        List<Cao> petList = this.caoRepository.buscarTodos();
        return MapperUtil.mapList(petList, CaoDTO.class);
    }

    @Override
    public List<CaoDTO> buscarPorNome(String nome) {
        List<Cao> petList = this.caoRepository.buscarPorNome(nome);
        return MapperUtil.mapList(petList, CaoDTO.class);
    }

    @Override
    public void salvar(CaoDTO dto) {
        Cao cao = new Cao(dto);
        this.caoRepository.salvar(cao);
    }
}
