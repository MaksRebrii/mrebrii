package hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int value,  powValue;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value: ");
        value = scanner.nextInt();
        System.out.print("Enter powValue: ");
        powValue = scanner.nextInt();
        System.out.println(String.format("%d^%d = %.3f", value, powValue, Math.pow(value, powValue)));
        System.out.println(String.format("My pow: %d^%d = %d", value, powValue, myPow(value, powValue)));
    }

    public static int myPow(int value, int powValue){
        if(powValue == 1)
            return value;
        else
            return value * myPow(value, powValue-1);

    }

}
