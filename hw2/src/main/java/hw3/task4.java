package hw3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int i = 0, n = -1, factorial = 1;
        Scanner scanner = new Scanner(System.in);

        //1st rewritten task ;
        do{
            if (i % 2 == 1)
                System.out.println(i);
        }
        while (i++ < 100);

        //2nd rewritten task
        while (n < 0) {
            System.out.print("Enter n: ");
            n = scanner.nextInt();
        }
        if(n != 0) {
            int count = n; // for beautiful output)
            do {
                factorial *= count;
                count--;
            }
            while (count != 1);
        }
        System.out.println(String.format("%d! = %d", n, factorial));
    }
}
