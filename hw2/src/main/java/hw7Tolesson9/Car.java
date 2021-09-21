package hw7Tolesson9;

public class Car {
    private static final int MIN_TANK_CAPACITY = 30;
    private static final int MAX_TANK_CAPACITY = 60;
    private static final double MIN_FUEL_IN_TANK_COEFFICIENT = 0.1;
    private static final double MAX_FUEL_IN_TANK_COEFFICIENT = 0.5;
    private static final double MIN_FUEL_CONSUMPTION = 5;
    private static final double MAX_FUEL_CONSUMPTION = 15;
    private static final int MONEY_COEFFICIENT = 10000;

    private final int tankCapacity;
    private final double fuelConsumption;
    private int tripDistance;
    private long tripMoneySpent;
    private double fuelInTank;
    private String location;


    public Car(String location) {
        this.tripDistance = (int) (Math.random() * 990 + 10);
        this.tankCapacity = (int) (Math.random() * (MAX_TANK_CAPACITY - MIN_TANK_CAPACITY) + MIN_TANK_CAPACITY);
        this.fuelInTank = generateFuelIntTank(tankCapacity);

        this.fuelConsumption = Math.random() * (MAX_FUEL_CONSUMPTION - MIN_FUEL_CONSUMPTION) + MIN_FUEL_CONSUMPTION;
        this.location = location;
    }

    public void setTripDistanceToZero() {
        this.tripDistance = 0;
    }


    public void fillFullTank(double fuelPrice) {
        fillTank(getMaxFuelToFill(), fuelPrice);
    }

    public void drive(int distance, String destination) {
        System.out.printf("Едем в %s. %d км...%n", destination, distance);
        fuelInTank -= fuelConsumptionPerNKilometers(distance);
        tripDistance += distance;
        if (fuelInTank < 0) throw new RuntimeException("Упс... Мы заглохли. Закончилось топливо!");
        this.location = destination;
    }

    public void fillTank(double liters, double fuelPrice) {
        if (liters >= getMaxFuelToFill()) {
            tripMoneySpent += (long) (getMaxFuelToFill() * fuelPrice * MONEY_COEFFICIENT);
            this.fuelInTank = getMaxFuelToFill();
        } else {
            tripMoneySpent += (long) (liters * fuelPrice * MONEY_COEFFICIENT);
            this.fuelInTank += liters;
        }
    }

    public void printTripReport() {
        System.out.println("----------Отчет о поездке----------");
        System.out.printf("Остаток топлива в баке: %.2f л. Всего проехали: %d км. Всего потрачено: %.2f грн. Местоположение авто: %s", getFuelInTank(), tripDistance, getTripMoneySpent(), location);
    }


    public double getFuelInTank() {
        return fuelInTank;
    }

    private double generateFuelIntTank(int tankCapacity) {
        return Math.random() * tankCapacity * (MAX_FUEL_IN_TANK_COEFFICIENT - MIN_FUEL_IN_TANK_COEFFICIENT) + tankCapacity * MIN_FUEL_IN_TANK_COEFFICIENT;
    }

    private double fuelConsumptionPerNKilometers(int numberOfKilometers) {
        return numberOfKilometers * this.fuelConsumption / 100;
    }

    private double getMaxFuelToFill() {
        return tankCapacity - fuelInTank;
    }

    private double getTripMoneySpent() {
        return (double) tripMoneySpent / MONEY_COEFFICIENT;
    }


    @Override
    public String toString() {
        return "Car{" +
                "tripDistance=" + tripDistance +
                ", tripMoneySpent=" + getTripMoneySpent() +
                ", fuelInTank=" + fuelInTank +
                ", tankCapacity=" + tankCapacity +
                ", fuelConsumption=" + fuelConsumption +
                ", location='" + location + '\'' +
                '}';
    }


}
