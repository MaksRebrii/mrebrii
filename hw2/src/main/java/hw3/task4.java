package hw3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int i = 0, enteredNumber = -1, factorial = 1, count = 1;
        Scanner scanner = new Scanner(System.in);

        //1st rewritten task ;
        do {
            if (i % 2 == 1)
                System.out.println(i);
        }
        while (i++ < 100);

        //2nd rewritten task
        while (enteredNumber < 0) {
            System.out.print("Enter n: ");
            enteredNumber = scanner.nextInt();
        }
        do {
            factorial *= count++;
        }
        while (count <= enteredNumber);

        System.out.println(String.format("%d! = %d", enteredNumber, factorial));
    }
}
