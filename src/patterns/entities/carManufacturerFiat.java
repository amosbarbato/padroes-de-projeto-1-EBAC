package patterns.entities;

import patterns.repos.carCreate;

public class carManufacturerFiat extends CarFactory{

    @Override
    public carCreate carCreate() {
        return new Fiat();
    }
}
