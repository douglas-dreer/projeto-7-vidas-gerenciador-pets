package org.projetosetevidas.gerenciamentopets.dominio.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.projetosetevidas.gerenciamentopets.dominio.enums.CorEnum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PetDTO {
    private UUID id;
    private String nome;
    private int idade;
    private CorEnum cor;
    private LocalDate dataNascimento;
    private boolean isVacinado;
    private boolean isCastrado;
    private boolean isAdotado;
    private String observacao;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataModificacao;

}
