package patterns.entities;

import patterns.repos.carCreate;
public class carManufacturerChevrolet extends CarFactory{

    @Override
    public carCreate carCreate() {
        return new Chevrolet();
    }
}
