package org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.projetosetevidas.gerenciamentopets.dominio.enums.RacaCaoEnum;

@Entity
@Table(name = "cachorros")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CaoEntity extends PetEntity {
    private RacaCaoEnum raca;
}
