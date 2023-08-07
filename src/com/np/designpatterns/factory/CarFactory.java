package com.np.designpatterns.factory;

public class CarFactory implements MotorVehicleFactory {

    @Override
    public MotorVehicle produce() {
        return new Car();
    }
}
