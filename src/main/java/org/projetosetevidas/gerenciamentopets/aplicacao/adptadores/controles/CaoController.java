package org.projetosetevidas.gerenciamentopets.aplicacao.adptadores.controles;

import jakarta.servlet.http.HttpServletRequest;
import org.projetosetevidas.gerenciamentopets.dominio.dtos.CaoDTO;
import org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces.CaoServicePort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/gerenciamento/caes")
public class CaoController {
    private final CaoServicePort caoServicePort;
    private final HttpServletRequest httpServletRequest;

    public CaoController(CaoServicePort caoServicePort, HttpServletRequest httpServletRequest) {
        this.caoServicePort = caoServicePort;
        this.httpServletRequest = httpServletRequest;
    }

    @GetMapping
    public ResponseEntity<List<CaoDTO>> buscarTodos() {
        return ResponseEntity.ok(caoServicePort.buscarTodos());
    }

    @GetMapping(path = "", params = "nome")
    public ResponseEntity<List<CaoDTO>> buscarPorNome(@RequestParam(name = "nome") String nome) {
        return ResponseEntity.ok(caoServicePort.buscarPorNome(nome));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CaoDTO> buscarPorId(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(caoServicePort.buscarPorId(id));
    }

    @GetMapping("/ultimo-registro")
    public ResponseEntity<CaoDTO> buscarUltimoRegistro() {
        return ResponseEntity.ok(caoServicePort.buscarUltimoRegistroSalvo());
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody CaoDTO pet) throws URISyntaxException {
        caoServicePort.salvar(pet);
        CaoDTO petSalvo = caoServicePort.buscarUltimoRegistroSalvo();
        return ResponseEntity.created(new URI(String.format("%s/%s", httpServletRequest.getRequestURL(), petSalvo.getId()))).build();
    }

    @PatchMapping("{id}")
    public ResponseEntity<?> editar(@PathVariable("id") UUID id, @RequestBody CaoDTO pet) throws URISyntaxException {
        caoServicePort.salvar(pet);
        return ResponseEntity.created(new URI(String.format("%s/%s", httpServletRequest.getRequestURL(), id))).build();
    }

    @GetMapping("/{id}/notificar-falecimento")
    public ResponseEntity<?> notificarFalecimento(@PathVariable(name = "id") UUID id) {
        CaoDTO pet = caoServicePort.buscarPorId(id);

        if (pet != null) {
            caoServicePort.excluir(pet);
        }

        return ResponseEntity.ok(null);
    }
}
