package org.projetosetevidas.gerenciamentopets.dominio.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CorEnum {
    AMARELO("Amarelo", "Yellow"),
    PRETO("Preto", "Black"),
    BRANCO("Branco", "White"),
    MARROM("Marrom", "Brown"),
    CINZA("Cinza", "Gray"),
    LARANJA("Laranja", "Orange"),
    TRICOLOR("Tricolor", "Tricolor"),
    CHUMBO("Chumbo", "Lead"),
    TIGRADO("Tigrado", "Tabby");

    private final String corPt;
    private final String corEn;

    public static CorEnum getByNome(String nome) {
        for (CorEnum cor : CorEnum.values()) {
            if (cor.corPt.equalsIgnoreCase(nome) || cor.corEn.equalsIgnoreCase(nome)) {
                return cor;
            }
        }
        return null;
    }
}
