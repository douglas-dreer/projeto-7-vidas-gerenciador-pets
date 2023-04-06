package org.projetosetevidas.gerenciamentopets.aplicacao.adptadores.controles;

import org.projetosetevidas.gerenciamentopets.dominio.dtos.CaoDTO;
import org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces.CaoServicePort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro/cao")
public class CaoController {
    private final CaoServicePort caoServicePort;

    public CaoController(CaoServicePort caoServicePort) {
        this.caoServicePort = caoServicePort;
    }

    @GetMapping
    public List<CaoDTO> buscarTodos() {
        return caoServicePort.buscarTodos();
    }

    @GetMapping("/{nome}")
    public List<CaoDTO> buscarPorNome(@PathVariable("nome") String nome) {
        return caoServicePort.buscarPorNome(nome);
    }

    @PostMapping
    public void salvar(@RequestBody CaoDTO pet) {
        caoServicePort.salvar(pet);
    }

}
