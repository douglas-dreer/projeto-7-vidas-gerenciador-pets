package org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.repositorios;

import org.projetosetevidas.gerenciamentopets.dominio.Cao;
import org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios.CaoRepositoryPort;
import org.projetosetevidas.gerenciamentopets.dominio.utils.MapperUtil;
import org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.entidades.CaoEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CaoRepository implements CaoRepositoryPort {
    private final SpringCaoRepository springCaoRepository;

    public CaoRepository(SpringCaoRepository springCaoRepository) {
        this.springCaoRepository = springCaoRepository;
    }

    @Override
    public List<Cao> buscarTodos() {
        List<CaoEntity> caoEntityList = (List<CaoEntity>) this.springCaoRepository.findAll();
        return MapperUtil.mapList(caoEntityList, Cao.class);
    }

    @Override
    public List<Cao> buscarPorNome(String nome) {
        List<CaoEntity> caoEntityList = this.springCaoRepository.findPetEntityByNomeContainingIgnoreCase(nome);
        return MapperUtil.mapList(caoEntityList, Cao.class);
    }

    @Override
    public void salvar(Cao pet) {
        CaoEntity entity = MapperUtil.convertTo(pet, CaoEntity.class);
        this.springCaoRepository.save(entity);
    }
}
