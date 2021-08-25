package hw3;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enteredX;
        System.out.print("Enter x: ");
        enteredX = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(String.format("%d * %d = %d", enteredX, i, enteredX * i));
        }
    }
}
