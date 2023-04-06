package org.projetosetevidas.gerenciamentopets.dominio;

import lombok.*;
import org.projetosetevidas.gerenciamentopets.dominio.dtos.GatoDTO;
import org.projetosetevidas.gerenciamentopets.dominio.enums.RacaGatoEnum;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Gato extends Pet{
    private RacaGatoEnum raca;

    public Gato(GatoDTO dto) {
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
