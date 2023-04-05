package org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.entidades;

import jakarta.persistence.*;
import lombok.*;
import org.projetosetevidas.gerenciamentopets.dominio.Pet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "pets")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public PetEntity(Pet pet) {
        this.id = pet.getId();
        this.nome = pet.getNome();
        this.idade = pet.getIdade();
        this.raca = pet.getRaca();
        this.cor = pet.getCor();
        this.dataNascimento = pet.getDataNascimento();
        this.isVacinado = pet.isVacinado();
        this.isCastrado = pet.isCastrado();
        this.isAdotado = pet.isAdotado();
        this.observacao = pet.getObservacao();
        this.dataInclusao = pet.getDataInclusao();
        this.dataModificacao = pet.getDataModificacao();
    }

    public Pet toPet() {
        return Pet.builder()
                .id(this.id).nome(this.nome).idade(this.idade)
                .raca(this.raca).cor(this.raca).dataNascimento(this.dataNascimento)
                .isVacinado(this.isVacinado).isCastrado(this.isCastrado)
                .isAdotado(this.isAdotado).observacao(this.observacao)
                .dataInclusao(this.dataInclusao).dataModificacao(this.dataModificacao)
                .build();
    }
}
