package org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.repositorios;

import org.projetosetevidas.gerenciamentopets.dominio.Cao;
import org.projetosetevidas.gerenciamentopets.dominio.dtos.CaoDTO;
import org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios.CaoRepositoryPort;
import org.projetosetevidas.gerenciamentopets.dominio.utils.MapperUtil;
import org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.entidades.CaoEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class CaoRepository implements CaoRepositoryPort {
    private final SpringCaoRepository springCaoRepository;

    public CaoRepository(SpringCaoRepository springCaoRepository) {
        this.springCaoRepository = springCaoRepository;
    }

    @Override
    public List<Cao> buscarTodos() {
        List<CaoEntity> entityList = (List<CaoEntity>) this.springCaoRepository.findAll();
        return MapperUtil.mapList(entityList, Cao.class);
    }

    @Override
    public List<Cao> buscarPorNome(String nome) {
        List<CaoEntity> entityList = this.springCaoRepository.findCaoEntityByNomeContainingIgnoreCase(nome);
        return MapperUtil.mapList(entityList, Cao.class);
    }

    @Override
    public void salvar(Cao pet) {
        CaoEntity entity = MapperUtil.convertTo(pet, CaoEntity.class);
        this.springCaoRepository.save(entity);
    }

    @Override
    public Cao buscarUltimoRegistroCadastrado() {
        CaoEntity entity = this.springCaoRepository.findTopByOrderByIdDesc();
        return MapperUtil.convertTo(entity, Cao.class);
    }

    @Override
    public Cao buscarPorId(UUID id) {
        CaoEntity pet = this.springCaoRepository.findById(id).orElse(null);
        return MapperUtil.convertTo(pet, Cao.class);
    }

    @Override
    public void excluir(CaoDTO pet) {
        CaoEntity entity = MapperUtil.convertTo(pet, CaoEntity.class);
        this.springCaoRepository.delete(entity);
    }
}
