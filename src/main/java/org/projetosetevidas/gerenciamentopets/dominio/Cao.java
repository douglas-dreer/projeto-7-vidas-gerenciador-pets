package org.projetosetevidas.gerenciamentopets.dominio;

import lombok.*;
import org.projetosetevidas.gerenciamentopets.dominio.dtos.CaoDTO;
import org.projetosetevidas.gerenciamentopets.dominio.enums.RacaCaoEnum;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cao extends Pet{
    private RacaCaoEnum raca;

    public Cao(CaoDTO dto) {
        setId(dto.getId());
        setNome(dto.getNome());
        setIdade(dto.getIdade());
        setRaca(dto.getRaca());
        setDataNascimento(dto.getDataNascimento());
        setVacinado(dto.isVacinado());
        setCastrado(dto.isCastrado());
        setAdotado(dto.isAdotado());
        setObservacao(dto.getObservacao());
        setDataInclusao(dto.getDataInclusao());
        setDataModificacao(dto.getDataModificacao());
    }
}
