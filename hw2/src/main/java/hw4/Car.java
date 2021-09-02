package hw4;

public class Car {
    private final int tankVolume;
    private double fuelInTank;
    private double fuelConsumption;

    public Car(int tankVolume, double fuelInTank, double fuelConsumption) {
        this.tankVolume = tankVolume;
        this.fuelInTank = fuelInTank;
        setFuelConsumption(fuelConsumption);
    }

    public double fillUpTheTank() {
        double filledFuel = tankVolume - fuelInTank;
        this.fuelInTank = tankVolume;
        return filledFuel;
    }

    public double FuelInTankAfterNKilometers(int numberOfKilometers) {
        fuelInTank -= fuelConsumptionPerNKilometers(numberOfKilometers);
        return fuelInTank;
    }

    public double fuelNeededToFillUpAfterNKilometers(int numberOfKilometers) {
        if (FuelInTankAfterNKilometers(numberOfKilometers) < 0)
            return Math.abs(FuelInTankAfterNKilometers(numberOfKilometers));
        else
            return 0;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption * 0.01;
    }

    public double getFuelInTank() {
        return fuelInTank;
    }

    private double fuelConsumptionPerNKilometers(int numberOfKilometers) {
        return this.fuelConsumption * numberOfKilometers;
    }
}
