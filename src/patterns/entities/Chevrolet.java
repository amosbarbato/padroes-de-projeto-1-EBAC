package patterns.entities;

import patterns.repos.carCreate;
public class Chevrolet implements carCreate {
    @Override
    public String carManufacturer() {
        return "Montadora: Chevrolet";
    }

    @Override
    public String carModel() {
        return "Carro: Onix ano de 2021";
    }

    @Override
    public String carColor() {
        return "Cor: Preto fosco";
    }

    @Override
    public String horsePower() {
        return "Cavalos: 150HP";
    }
}
