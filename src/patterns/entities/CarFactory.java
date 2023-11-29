package patterns.entities;

import patterns.repos.carCreate;

public abstract class CarFactory {
    carCreate carCreate = carCreate();

    public abstract carCreate carCreate();

    @Override
    public String toString() {
        return "CarFactory{" +
                "carCreate=" + carCreate +
                '}';
    }
}
