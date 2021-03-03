package jv.basico.dio;

public class Carro {

    private String passageiros = "No carro há 5 passageiros";

    public String getPassageiros() {
        return passageiros;
    }

    public String desembarcarUmPassageiro() {
        return "Desembarcou um passageiro";
    }

    public String embarcarUmPassageiro() {
        return "Embarcou um passageiro";
    }
}
