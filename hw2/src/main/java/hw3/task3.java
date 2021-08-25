package hw3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int i = 0, n = -1, factorial = 1;
        Scanner scanner = new Scanner(System.in);

        //1st rewritten task ;
        while (i++ < 100) {
            if (i % 2 == 1)
                System.out.println(i);
        }

        //2nd rewritten task
        while (n < 0){
            System.out.print("Enter n: ");
            n = scanner.nextInt();
        }
        int count = n; // for beautiful output)
        if(n != 0) {
            do {
                factorial *= count--;
            }
            while (count != 0);
        }
        System.out.println(String.format("%d! = %d", n, factorial));
    }
}
