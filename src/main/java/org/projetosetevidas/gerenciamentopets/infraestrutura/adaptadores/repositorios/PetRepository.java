package org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.repositorios;

import org.projetosetevidas.gerenciamentopets.dominio.Pet;
import org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios.PetRepositoryPort;
import org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.entidades.PetEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PetRepository  implements PetRepositoryPort {
    private final SpringPetRepository springPetRepository;


    public PetRepository(SpringPetRepository springPetRepository) {
        this.springPetRepository = springPetRepository;
    }

    @Override
    public List<Pet> buscarTodos() {
        List<PetEntity> petEntityList = (List<PetEntity>) this.springPetRepository.findAll();
        return petEntityList.stream().map(PetEntity::toPet).toList();
    }

    @Override
    public List<Pet> buscarPorNome(String nome) {
        List<PetEntity> petEntityList = this.springPetRepository.findPetEntityByNomeContainingIgnoreCase(nome);
        return petEntityList.stream().map(PetEntity::toPet).toList();
    }

    @Override
    public void salvar(Pet pet) {
        PetEntity petEntity = new PetEntity(pet);
        this.springPetRepository.save(petEntity);
    }
}
