package org.projetosetevidas.gerenciamentopets.dominio.adaptadores.servicos;

import org.projetosetevidas.gerenciamentopets.dominio.Gato;
import org.projetosetevidas.gerenciamentopets.dominio.dtos.GatoDTO;
import org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces.GatoServicePort;
import org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios.GatoRepositoryPort;
import org.projetosetevidas.gerenciamentopets.dominio.utils.MapperUtil;

import java.util.List;

public class GatoServiceImp implements GatoServicePort {

    private final GatoRepositoryPort gatoRepository;

    public GatoServiceImp(GatoRepositoryPort gatoRepository) {
        this.gatoRepository = gatoRepository;
    }

    @Override
    public List<GatoDTO> buscarTodos() {
        List<Gato> petList = this.gatoRepository.buscarTodos();
        return MapperUtil.mapList(petList, GatoDTO.class);
    }

    @Override
    public List<GatoDTO> buscarPorNome(String nome) {
        List<Gato> petList = this.gatoRepository.buscarPorNome(nome);
        return MapperUtil.mapList(petList, GatoDTO.class);
    }

    @Override
    public void salvar(GatoDTO dto) {
        dto.calcularIdade();
        Gato pet = MapperUtil.convertTo(dto, Gato.class);
        this.gatoRepository.salvar(pet);
    }

    @Override
    public GatoDTO buscarUltimoRegistroSalvo() {
        Gato pet = this.gatoRepository.buscarUltimoRegistroCadastrado();
        return MapperUtil.convertTo(pet, GatoDTO.class);
    }
}
