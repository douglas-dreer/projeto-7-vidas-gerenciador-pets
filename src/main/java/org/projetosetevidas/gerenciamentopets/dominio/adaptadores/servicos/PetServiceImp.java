package org.projetosetevidas.gerenciamentopets.dominio.adaptadores.servicos;

import org.projetosetevidas.gerenciamentopets.dominio.Pet;
import org.projetosetevidas.gerenciamentopets.dominio.dtos.PetDTO;
import org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces.PetServicePort;
import org.projetosetevidas.gerenciamentopets.dominio.portas.repositorios.PetRepositoryPort;
import org.projetosetevidas.gerenciamentopets.dominio.utils.MapperUtil;

import java.util.List;

public class PetServiceImp implements PetServicePort {
    private final PetRepositoryPort petRepository;

    public PetServiceImp(PetRepositoryPort petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public List<PetDTO> buscarTodos() {
        List<Pet> petList = this.petRepository.buscarTodos();
        return MapperUtil.mapList(petList, PetDTO.class);
    }

    @Override
    public List<PetDTO> buscarPorNome(String nome) {
        List<Pet> petList = this.petRepository.buscarPorNome(nome);
        return MapperUtil.mapList(petList, PetDTO.class);
    }

    @Override
    public void salvar(PetDTO petDTO) {
        Pet pet = new Pet(petDTO);
        this.petRepository.salvar(pet);
    }
}
