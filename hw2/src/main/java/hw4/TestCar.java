package hw4;

public class TestCar {
    private static final int DISTANCE_ODESSA_KRIVOE_OZERO = 190;
    private static final int DISTANCE_KRIVOE_OZERO_ZACHKOW = 148;
    private static final int DISTANCE_ZACHKOW_KIEV = 146;
    private static long fuelPricePerLiter;

    public static void main(String[] args) {

    }

    public static void setFuelPricePerLiter(double fuelPricePerLiter) {
        TestCar.fuelPricePerLiter = (long) (fuelPricePerLiter * 100);
    }
}
