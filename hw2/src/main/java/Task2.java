import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scannerIN = new Scanner(System.in);
        double sumEnteredNumbers = 0;
        double enteredNumber = -1;
        int count = 0;

        while (enteredNumber != 0) {
            System.out.print("Type  number or type '0' to find avg: ");
            enteredNumber = scannerIN.nextDouble();
            if (enteredNumber == 0 && count < 2) {
                System.out.println("\nYou must enter at least 2 numbers!\n");
                enteredNumber = -1;
                continue;
            }
            sumEnteredNumbers += enteredNumber;
            count++;
        }
        // count -1 because zero also counts, however we don't need it
        System.out.println(String.format("Average of entered numbers is %.5f", sumEnteredNumbers / (double)(count-1)));
    }
}
