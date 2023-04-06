package org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.repositorios;

import org.projetosetevidas.gerenciamentopets.dominio.Gato;
import org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios.GatoRepositoryPort;
import org.projetosetevidas.gerenciamentopets.dominio.utils.MapperUtil;
import org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.entidades.GatoEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GatoRepository implements GatoRepositoryPort {
    private final SpringGatoRepository springRepository;

    public GatoRepository(SpringGatoRepository springRepository) {
        this.springRepository = springRepository;
    }

    @Override
    public List<Gato> buscarTodos() {
        List<GatoEntity> petEntityList = (List<GatoEntity>) this.springRepository.findAll();
        return MapperUtil.mapList(petEntityList, Gato.class);
    }

    @Override
    public List<Gato> buscarPorNome(String nome) {
        List<GatoEntity> petEntityList = this.springRepository.findGatoEntityByNomeContainingIgnoreCase(nome);
        return MapperUtil.mapList(petEntityList, Gato.class);
    }

    @Override
    public void salvar(Gato pet) {
        GatoEntity petEntity = MapperUtil.convertTo(pet, GatoEntity.class);
        this.springRepository.save(petEntity);
    }

    @Override
    public Gato buscarUltimoRegistroCadastrado() {
        GatoEntity gatoEntity = this.springRepository.findTopByOrderByIdDesc();
        return MapperUtil.convertTo(gatoEntity, Gato.class);
    }
}
