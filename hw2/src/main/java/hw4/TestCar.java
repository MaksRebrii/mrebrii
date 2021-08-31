package hw4;

public class TestCar {
    private static final int DISTANCE_ODESSA_KRIVOE_OZERO = 190;
    private static final int DISTANCE_KRIVOE_OZERO_ZACHKOW = 148;
    private static final int DISTANCE_ZACHKOW_KIEV = 146;
    private static long fuelPricePerLiter;


    public static void main(String[] args) {
        Car myCar = new Car(45, 20, 7d);
        double amountOfFuel = 0d;
        setFuelPricePerLiter(30.24);

        amountOfFuel += myCar.fillUpTheTank();
        myCar.FuelInTankAfterNKilometers(DISTANCE_ODESSA_KRIVOE_OZERO);
        amountOfFuel += myCar.fillUpTheTank();
        myCar.FuelInTankAfterNKilometers(DISTANCE_KRIVOE_OZERO_ZACHKOW);
        amountOfFuel += myCar.fillUpTheTank();
        myCar.FuelInTankAfterNKilometers(DISTANCE_ZACHKOW_KIEV);
        System.out.printf("The cost of travel: %.2f\nFuel remaining: %.2f", amountOfFuel * getFuelPricePerLiter() / 1000, myCar.getFuelInTank());
    }


    public static double getFuelPricePerLiter() {
        return fuelPricePerLiter;
    }

    public static void setFuelPricePerLiter(double fuelPricePerLiter) {
        TestCar.fuelPricePerLiter = (long) (fuelPricePerLiter * 1000);
    }
}
