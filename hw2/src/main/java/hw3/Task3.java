package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int i = 0, enteredNumber = -1, factorial = 1;
        Scanner scanner = new Scanner(System.in);

        //1st rewritten task ;
        while (i++ < 100) {
            if (i % 2 == 1)
                System.out.println(i);
        }

        //2nd rewritten task
        while (enteredNumber < 0){
            System.out.print("Enter n: ");
            enteredNumber = scanner.nextInt();
        }
        int count = enteredNumber; // for beautiful output)
        if(enteredNumber != 0) {
            do {
                factorial *= count--;
            }
            while (count != 0);
        }
        System.out.println(String.format("%d! = %d", enteredNumber, factorial));
    }
}
