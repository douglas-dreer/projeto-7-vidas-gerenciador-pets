package org.projetosetevidas.gerenciamentopets.dominio.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RacaCaoEnum {
    LABRADOR_RETRIEVER("Labrador Retriever", "Labrador Retriever"),
    GERMAN_SHEPHERD("German Shepherd", "Pastor Alemão"),
    GOLDEN_RETRIEVER("Golden Retriever", "Golden Retriever"),
    FRENCH_BULLDOG("French Bulldog", "Buldogue Francês"),
    BULLDOG("Bulldog", "Buldogue Inglês"),
    POODLE("Poodle", "Poodle"),
    ROTTWEILER("Rottweiler", "Rottweiler"),
    BEAGLE("Beagle", "Beagle"),
    SIBERIAN_HUSKY("Siberian Husky", "Husky Siberiano"),
    DACHSHUND("Dachshund", "Teckel"),
    BOXER("Boxer", "Boxer"),
    GREAT_DANE("Great Dane", "Dogue Alemão"),
    CHIHUAHUA("Chihuahua", "Chihuahua"),
    SHIH_TZU("Shih Tzu", "Shih Tzu"),
    YORKSHIRE_TERRIER("Yorkshire Terrier", "Yorkshire Terrier"),
    MUTT("Mutt", "Vira-Lata");

    private String ptBR;
    private String en;

    public static RacaCaoEnum procurarPorNome(String str) {
        for (RacaCaoEnum raca : RacaCaoEnum.values()) {
            if (raca.en.equalsIgnoreCase(str) || raca.ptBR.equalsIgnoreCase(str)) {
                return raca;
            }
        }
        return RacaCaoEnum.MUTT;
    }
}

