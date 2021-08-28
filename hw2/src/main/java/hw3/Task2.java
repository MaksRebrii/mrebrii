package hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = -1, factorial = 1;
        while (enteredNumber < 0) {
            System.out.print("Enter n: ");
            enteredNumber = scanner.nextInt();
        }
        for (int i = enteredNumber; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(String.format("%d! = %d", enteredNumber, factorial));
    }
}
