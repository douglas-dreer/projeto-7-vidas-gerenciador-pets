package org.projetosetevidas.gerenciamentopets.dominio.adaptadores.servicos;

import org.projetosetevidas.gerenciamentopets.dominio.Cao;
import org.projetosetevidas.gerenciamentopets.dominio.dtos.CaoDTO;
import org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces.CaoServicePort;
import org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios.CaoRepositoryPort;
import org.projetosetevidas.gerenciamentopets.dominio.utils.MapperUtil;

import java.util.List;
import java.util.UUID;

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
        dto.calcularIdade();
        Cao cao = MapperUtil.convertTo(dto, Cao.class);
        this.caoRepository.salvar(cao);
    }

    @Override
    public CaoDTO buscarUltimoRegistroSalvo() {
        Cao pet = this.caoRepository.buscarUltimoRegistroCadastrado();
        return MapperUtil.convertTo(pet, CaoDTO.class);
    }

    @Override
    public CaoDTO buscarPorId(UUID id) {
        Cao pet = this.caoRepository.buscarPorId(id);
        return MapperUtil.convertTo(pet, CaoDTO.class);
    }

    @Override
    public void excluir(CaoDTO pet) {
        this.caoRepository.excluir(pet);
    }
}
