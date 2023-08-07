package com.np.designpatterns.abstractfactory;

public class NextGenElectricCar implements ElectricVehicle {

    @Override
    public void drive() {
        System.out.println("NextGenElectricCar driving...");
    }

    @Override
    public void stop() {
        System.out.println("NextGenElectricCar stopping...");
    }
}
