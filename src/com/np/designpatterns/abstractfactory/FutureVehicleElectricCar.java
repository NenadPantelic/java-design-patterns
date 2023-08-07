package com.np.designpatterns.abstractfactory;

public class FutureVehicleElectricCar implements ElectricVehicle {

    @Override
    public void drive() {
        System.out.println("FutureVehicleElectricCar driving...");
    }

    @Override
    public void stop() {
        System.out.println("FutureVehicleElectricCar stopping...");
    }
}
