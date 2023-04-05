package org.projetosetevidas.gerenciamentopets.aplicacao.adptadores.controles;

import org.projetosetevidas.gerenciamentopets.dominio.dtos.PetDTO;
import org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces.PetServicePort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pets")
public class PetController {
    private final PetServicePort petServicePort;

    public PetController(PetServicePort petServicePort) {
        this.petServicePort = petServicePort;
    }

    @GetMapping
    public List<PetDTO> buscarTodos() {
        return petServicePort.buscarTodos();
    }

    @GetMapping("/{nome}")
    public List<PetDTO> buscarPorNome(@PathVariable("nome") String nome) {
        return petServicePort.buscarPorNome(nome);
    }

    @PostMapping
    public void salvarPet(@RequestBody PetDTO pet) {
        petServicePort.salvar(pet);
    }

}
