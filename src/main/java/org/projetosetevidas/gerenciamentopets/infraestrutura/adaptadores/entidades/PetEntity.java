package org.projetosetevidas.gerenciamentopets.infraestrutura.adaptadores.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.projetosetevidas.gerenciamentopets.dominio.Pet;
import org.projetosetevidas.gerenciamentopets.dominio.enums.CorEnum;

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

    @Column(nullable = false)
    private String nome;
    private int idade;

    @Enumerated(EnumType.STRING)
    private CorEnum cor;


    private LocalDate dataNascimento;
    private boolean isVacinado = false;
    private boolean isCastrado = false;
    private boolean isAdotado = false;
    private String observacao;
    private LocalDateTime dataInclusao = LocalDateTime.now();
    private LocalDateTime dataModificacao = LocalDateTime.now();

    @PrePersist
    public void prePersist() {
        this.dataInclusao = LocalDateTime.now();
        this.isVacinado = false;
        this.isAdotado = false;
        this.isCastrado = false;
    }

    @PreUpdate
    public void preUpdate() {
        this.dataModificacao = LocalDateTime.now();
    }

}
