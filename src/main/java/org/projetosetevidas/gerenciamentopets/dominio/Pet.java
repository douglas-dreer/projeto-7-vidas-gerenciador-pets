package org.projetosetevidas.gerenciamentopets.dominio;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.projetosetevidas.gerenciamentopets.dominio.dtos.PetDTO;
import org.projetosetevidas.gerenciamentopets.dominio.enums.CorEnum;

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
    private CorEnum cor;
    private LocalDate dataNascimento;
    private boolean isVacinado;
    private boolean isCastrado = false;
    private boolean isAdotado = false;
    private String observacao;
    private LocalDateTime dataInclusao = LocalDateTime.now();
    private LocalDateTime dataModificacao = LocalDateTime.now();


    public Pet(PetDTO dto) {
        this.id = dto.getId();
        this.nome = dto.getNome();
        this.idade = dto.getIdade();
        this.cor = dto.getCor();
        this.dataNascimento = dto.getDataNascimento();
        this.isVacinado = dto.isVacinado();
        this.isCastrado = dto.isCastrado();
        this.isAdotado = dto.isAdotado();
        this.observacao = dto.getObservacao();
        this.dataInclusao = dto.getDataInclusao();
        this.dataModificacao = dto.getDataModificacao();
    }


    public String toJSON() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        return mapper.writeValueAsString(this);
    }
}
