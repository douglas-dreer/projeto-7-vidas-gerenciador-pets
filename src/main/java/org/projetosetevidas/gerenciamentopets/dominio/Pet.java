package org.projetosetevidas.gerenciamentopets.dominio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.projetosetevidas.gerenciamentopets.dominio.dtos.PetDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Pet {
    private UUID id;
    private String nome;
    private int idade;
    private String raca;
    private String cor;
    private LocalDate dataNascimento;
    private boolean isVacinado;
    private boolean isCastrado;
    private boolean isAdotado;
    private String observacao;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataModificacao;

    public Pet(PetDTO dto) {
        this.id = dto.getId();
        this.nome = dto.getNome();
        this.idade = dto.getIdade();
        this.raca = dto.getRaca();
        this.cor = dto.getCor();
        this.dataNascimento = dto.getDataNascimento();
        this.isVacinado = dto.isVacinado();
        this.isCastrado = dto.isCastrado();
        this.isAdotado = dto.isAdotado();
        this.observacao = dto.getObservacao();
        this.dataInclusao = dto.getDataInclusao();
        this.dataModificacao = dto.getDataModificacao();
    }

    public PetDTO toPetDTO() {
        return PetDTO.builder()
                .id(this.id).nome(this.nome).idade(this.idade)
                .raca(this.raca).cor(this.raca).dataNascimento(this.dataNascimento)
                .isVacinado(this.isVacinado).isCastrado(this.isCastrado)
                .isAdotado(this.isAdotado).observacao(this.observacao)
                .dataInclusao(this.dataInclusao).dataModificacao(this.dataModificacao)
                .build();
    }
}
