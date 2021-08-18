import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scannerIN = new Scanner(System.in);
        double firstNum, secondNum;
        System.out.print("Enter first number: ");
        firstNum = scannerIN.nextDouble();
        System.out.print("Enter second number: ");
        secondNum = scannerIN.nextDouble();
        System.out.println(String.format("Average of numbers %.5f and %.5f is %.5f", firstNum, secondNum, (firstNum + secondNum) / 2));
    }
}
