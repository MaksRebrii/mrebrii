package hw7Tolesson9;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        testCar();
    }

    private static void testCar() {
        Scanner sc = new Scanner(System.in);
        double liters;
        double fuelPrice;

        Car car = new Car("Одесса");
        System.out.println(car);
        car.setTripDistanceToZero();

        System.out.printf("Одесса. В баке сейчас %.0f л%n", car.getFuelInTank());
        fuelPrice = setFuelPrice(sc);
        car.fillFullTank(fuelPrice);
        car.drive(179, "Кривое Озеро");

        System.out.printf("Остановка Кривое Озеро. В баке сейчас %.0f л.%n", car.getFuelInTank());
        liters = setFuelAmount(sc);
        if(liters != 0)
            fuelPrice = setFuelPrice(sc);
        car.fillTank(liters, fuelPrice);
        car.drive(153, "Жашков");

        System.out.printf("Остановка Жашков. В баке сейчас %.0f л.%n", car.getFuelInTank());
        liters = setFuelAmount(sc);
        if(liters != 0)
            fuelPrice = setFuelPrice(sc);
        car.fillTank(liters, fuelPrice);
        car.drive(150, "Киев");

        car.printTripReport();
    }

    private static double setFuelPrice(Scanner scanner) {
        double fuelPrice;
        do {
            System.out.printf("Какая цена топлива?%n");
            fuelPrice = scanner.nextDouble();
        }
        while (fuelPrice <= 0);
        return fuelPrice;
    }

    private static double setFuelAmount(Scanner scanner) {
        double liters;
        do {
            System.out.printf("Сколько литров заправляем?%n");
            liters = scanner.nextInt();
        } while (liters < 0);
        return liters;
    }
}
