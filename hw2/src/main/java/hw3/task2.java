package hw3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1, factorial = 1;
        while (n < 0){
            System.out.print("Enter n: ");
            n = scanner.nextInt();
        }
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(String.format("%d! = %d", n, factorial));
    }
}
