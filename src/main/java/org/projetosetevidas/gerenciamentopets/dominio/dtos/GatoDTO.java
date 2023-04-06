package org.projetosetevidas.gerenciamentopets.dominio.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.projetosetevidas.gerenciamentopets.dominio.enums.RacaGatoEnum;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GatoDTO extends PetDTO{
    private RacaGatoEnum raca;
}
