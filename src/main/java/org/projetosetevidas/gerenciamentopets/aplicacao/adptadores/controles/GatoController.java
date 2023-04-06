package org.projetosetevidas.gerenciamentopets.aplicacao.adptadores.controles;

import jakarta.servlet.http.HttpServletRequest;
import org.projetosetevidas.gerenciamentopets.dominio.dtos.GatoDTO;
import org.projetosetevidas.gerenciamentopets.dominio.portas.interfaces.GatoServicePort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("gerenciamento/gatos")
public class GatoController {
    private final GatoServicePort gatoServicePort;
    private final HttpServletRequest httpServletRequest;

    public GatoController(GatoServicePort gatoServicePort, HttpServletRequest httpServletRequest) {
        this.gatoServicePort = gatoServicePort;
        this.httpServletRequest = httpServletRequest;
    }

    @GetMapping
    public List<GatoDTO> buscarTodos() {
        return gatoServicePort.buscarTodos();
    }

    @GetMapping("/{nome}")
    public ResponseEntity<List<GatoDTO>> buscarPorNome(@PathVariable("nome") String nome) {
        return ResponseEntity.ok(gatoServicePort.buscarPorNome(nome));
    }

    @GetMapping("/ultimo-registro")
    public ResponseEntity<GatoDTO> buscarUltimoRegistro() {
        return ResponseEntity.ok(gatoServicePort.buscarUltimoRegistroSalvo());
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody GatoDTO pet) throws URISyntaxException {
        gatoServicePort.salvar(pet);
        GatoDTO petSalvo = this.buscarUltimoRegistro().getBody();
        return ResponseEntity.created(new URI(String.format("%s/%s", httpServletRequest.getRequestURL(), petSalvo.getId()))).build();
    }
}
