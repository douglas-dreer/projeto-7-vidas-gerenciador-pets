package org.projetosetevidas.gerenciamentopets.dominio.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public enum RacaGatoEnum {
    ABYSSINIAN("Abyssinian", "Abyssinian"),
    AMERICAN_SHORTHAIR("American Shorthair", "Gato-de-pelo-curto-americano"),
    BALINESE("Balinese", "Balines"),
    BENGAL("Bengal", "Bengal"),
    BIRMAN("Birman", "Birmanês"),
    BRITISH_SHORTHAIR("British Shorthair", "British Shorthair"),
    BURMESE("Burmese", "Burmês"),
    CHARTREUX("Chartreux", "Chartreux"),
    CORNISH_REX("Cornish Rex", "Cornish Rex"),
    DEVON_REX("Devon Rex", "Devon Rex"),
    EGYPTIAN_MAU("Egyptian Mau", "Mau Egípcio"),
    EXOTIC_SHORTHAIR("Exotic Shorthair", "Exótico de pelo curto"),
    HIMALAYAN("Himalayan", "Himalaio"),
    JAPANESE_BOBTAIL("Japanese Bobtail", "Bobtail Japonês"),
    KORAT("Korat", "Korat"),
    MAINE_COON("Maine Coon", "Maine Coon"),
    MANX("Manx", "Manx"),
    MUNCHKIN("Munchkin", "Munchkin"),
    NORWEGIAN_FOREST_CAT("Norwegian Forest Cat", "Gato da Floresta Norueguês"),
    OCICAT("Ocicat", "Ocicat"),
    ORIENTAL("Oriental", "Oriental"),
    PERSIAN("Persian", "Persa"),
    RAGDOLL("Ragdoll", "Ragdoll"),
    SCOTTISH_FOLD("Scottish Fold", "Scottish Fold"),
    SIAMESE("Siamese", "Siamês"),
    SIBERIAN("Siberian", "Siberiano"),
    SPHYNX("Sphynx", "Esfinge"),
    MUTT("Mutt", "Sem Raça Definida");

    private String en;
    private String ptBR;

    public static RacaGatoEnum procurarPorNome(String str) {
        for (RacaGatoEnum raca : RacaGatoEnum.values()) {
            if (raca.en.equalsIgnoreCase(str) || raca.ptBR.equalsIgnoreCase(str)) {
                return raca;
            }
        }
        return RacaGatoEnum.MUTT;
    }
}
