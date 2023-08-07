package com.np.designpatterns.factory;

public class Main {

    public static void main(String[] args) {
        MotorVehicleFactory motorcycleFactory = new MotorcycleFactory();
        MotorVehicle motorcycle = motorcycleFactory.produce();
        motorcycle.drive();
        motorcycle.stop();

        MotorVehicleFactory carFactory = new CarFactory();
        MotorVehicle car = carFactory.produce();
        car.drive();
        car.stop();
    }
}
