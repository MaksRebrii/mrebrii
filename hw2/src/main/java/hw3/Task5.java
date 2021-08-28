package hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double value, powValue;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value: ");
        value = scanner.nextDouble();
        System.out.print("Enter powValue: ");
        powValue = scanner.nextDouble();
        System.out.println(String.format("%.3f^%.3f = %.3f", value, powValue, Math.pow(value, powValue)));
        System.out.println(String.format("My pow: %.3f^%f = %.3f", value, powValue, myPow(value, powValue)));
    }

    public static double myPow(double value, double powValue) {
        double result = value;
        if (powValue > 0) {
            while (powValue-- != 1) {
                result *= value;
            }
        } else if (powValue < 0) {
            while (powValue++ != 1) {
                result /= value;
            }
        } else result = 1d;
        return result;
        /*if (powValue == 1)
            return value;
        else {
            return value * myPow(value, powValue - 1);
        }*/

    }

}
