package com.np.designpatterns.factory;

public class MotorcycleFactory implements MotorVehicleFactory {

    @Override
    public MotorVehicle produce() {
        return new Motorcycle();
    }
}
