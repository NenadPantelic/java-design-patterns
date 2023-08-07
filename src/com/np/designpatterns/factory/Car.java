package com.np.designpatterns.factory;

public class Car implements MotorVehicle {

    @Override
    public void drive() {
        System.out.println("Car driving...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopping...");
    }
}
