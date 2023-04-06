package org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.projetosetevidas.gerenciamentopets.dominio.enums.RacaGatoEnum;

@Entity
@Table(name = "gatos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GatoEntity extends PetEntity {
    private RacaGatoEnum raca;
}
