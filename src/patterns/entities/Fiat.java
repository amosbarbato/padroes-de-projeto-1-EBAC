package patterns.entities;

import patterns.repos.carCreate;

public class Fiat implements carCreate {
    @Override
    public String carManufacturer() {
        return "Montadora: Fiat";
    }

    @Override
    public String carModel() {
        return "Carro: Palio ano de 2022";
    }

    @Override
    public String carColor() {
        return "Cor: Branco gelo";
    }

    @Override
    public String horsePower() {
        return "Cavalos: 120HP";
    }
}
