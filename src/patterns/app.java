package patterns;


import patterns.entities.CarFactory;
import patterns.entities.carManufacturerChevrolet;
import patterns.entities.carManufacturerFiat;

import java.util.Scanner;

public class app {

    private static CarFactory carFactory;
    public static void main(String[] args) {
        var scan =  new Scanner(System.in);

        System.out.println("Digite qual montadora voce deseja montar o carro Fiat ou Chevrolet");
        var manufacturer = scan.next();

        if (manufacturer.equalsIgnoreCase("Fiat")) {
            carFactory = new carManufacturerFiat();
        } else if (manufacturer.equalsIgnoreCase("Chevrolet")) {
            carFactory = new carManufacturerChevrolet();
        }

        System.out.println(carFactory.carCreate().carManufacturer());
        System.out.println(carFactory.carCreate().carModel());
        System.out.println(carFactory.carCreate().carColor());
        System.out.println(carFactory.carCreate().horsePower());
    }
}
