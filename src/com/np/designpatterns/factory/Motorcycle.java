package com.np.designpatterns.factory;

public class Motorcycle implements MotorVehicle {

    @Override
    public void drive() {
        System.out.println("Motorcycle driving...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopping...");
    }
}
