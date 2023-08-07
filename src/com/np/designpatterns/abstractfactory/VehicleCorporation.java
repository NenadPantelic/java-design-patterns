package com.np.designpatterns.abstractfactory;

public interface VehicleCorporation {

    MotorVehicle createMotorVehicle();
    ElectricVehicle createElectricVehicle();
}
