package com.np.designpatterns.abstractfactory;

public class NextGenMotorVehicle implements MotorVehicle {

    @Override
    public void drive() {
        System.out.println("NextGenMotorVehicle driving...");
    }

    @Override
    public void stop() {
        System.out.println("NextGenMotorVehicle stopping...");
    }
}
