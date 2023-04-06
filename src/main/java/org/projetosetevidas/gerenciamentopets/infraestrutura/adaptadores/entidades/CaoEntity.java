package org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.projetosetevidas.gerenciamentopets.dominio.Cao;
import org.projetosetevidas.gerenciamentopets.dominio.enums.RacaCaoEnum;

@Entity
@Table(name = "cachorros")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CaoEntity extends PetEntity {
    private RacaCaoEnum raca;

    public CaoEntity(Cao cao) {
        this.setId(cao.getId());
        this.setNome(cao.getNome());
        this.setIdade(cao.getIdade());
        this.setRaca(cao.getRaca());
        this.setDataNascimento(cao.getDataNascimento());
        this.setVacinado(cao.isVacinado());
        this.setCastrado(cao.isCastrado());
        this.setAdotado(cao.isAdotado());
        this.setObservacao(cao.getObservacao());
        this.setDataInclusao(cao.getDataInclusao());
        this.setDataModificacao(cao.getDataModificacao());
    }

}
