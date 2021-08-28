package hw4;

public class Car {
    private final double tankVolume;
    private double fuelInTank;
    private double fuelConsumption;

    public Car(double tankVolume, double fuelInTank, double fuelConsumption) {
        this.tankVolume = tankVolume;
        this.fuelInTank = fuelInTank;
        setFuelConsumption(fuelConsumption);
    }

    public double fillUpTheTank() {
        double filledFuel = tankVolume - fuelInTank;
        this.fuelInTank = tankVolume;
        return filledFuel;
    }

    public double getFuelInTankAfterNKilometers(int numberOfKilometers) {
        return fuelInTank - fuelConsumptionPerNKilometers(numberOfKilometers);
    }

    public double fuelNeededToFillUpToGoNKilometers(int numberOfKilometers) {
        double fuelNeeded = Math.ceil(fuelInTank - fuelConsumptionPerNKilometers(numberOfKilometers));
        if (fuelNeeded > 0)
            return fuelNeeded;
        else
            return 0d;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption * 0.01;
    }

    private double fuelConsumptionPerNKilometers(int numberOfKilometers) {
        return this.fuelConsumption * numberOfKilometers;
    }
}
