package com.np.designpatterns.abstractfactory;

public class Main {

    public static void main(String[] args) {
        VehicleCorporation nextGenCorporation = new NextGenCorporation();

        MotorVehicle nextGenMotorVehicle = nextGenCorporation.createMotorVehicle();
        nextGenMotorVehicle.drive();
        nextGenMotorVehicle.stop();

        ElectricVehicle nextGenElectricVehicle = nextGenCorporation.createElectricVehicle();
        nextGenElectricVehicle.drive();
        nextGenElectricVehicle.stop();

        VehicleCorporation futureCorporation = new FutureCorporation();

        MotorVehicle futureVehicle = futureCorporation.createMotorVehicle();
        futureVehicle.drive();
        futureVehicle.stop();

        ElectricVehicle futureElectricCar = futureCorporation.createElectricVehicle();
        futureElectricCar.drive();
        futureElectricCar.stop();
    }
}
