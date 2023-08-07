package com.np.designpatterns.abstractfactory;

public class NextGenCorporation implements VehicleCorporation {

    @Override
    public MotorVehicle createMotorVehicle() {
        return new NextGenMotorVehicle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new NextGenElectricCar();
    }
}
