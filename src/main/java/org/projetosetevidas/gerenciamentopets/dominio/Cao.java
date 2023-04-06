package org.projetosetevidas.gerenciamentopets.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.projetosetevidas.gerenciamentopets.dominio.enums.RacaCaoEnum;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cao extends Pet {
    private RacaCaoEnum raca;
}
