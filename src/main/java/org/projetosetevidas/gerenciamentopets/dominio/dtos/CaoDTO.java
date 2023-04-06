package org.projetosetevidas.gerenciamentopets.dominio.dtos;

import lombok.*;
import org.projetosetevidas.gerenciamentopets.dominio.enums.RacaCaoEnum;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CaoDTO extends PetDTO {
    private RacaCaoEnum raca;
}
