package com.np.designpatterns.abstractfactory;

public class FutureVehicleMotorcycle implements MotorVehicle {

    @Override
    public void drive() {
        System.out.println("FutureVehicleMotorcycle driving...");
    }

    @Override
    public void stop() {
        System.out.println("FutureVehicleMotorcycle stopping...");
    }
}
