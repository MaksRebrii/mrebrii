package hw3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sizeArray = -1;
        int minValue, counterMinValue = 0;

        Scanner scanner = new Scanner(System.in);
        while (sizeArray < 1) {
            System.out.print("Enter array's size: ");
            sizeArray = scanner.nextInt();
        }
        //array's initialization
        for (int i = 0; i < sizeArray; i++) {
            arrayList.add((int) (Math.random() * 100));
        }

        minValue = arrayList.get(0);

        //finding minimal value and it's amount
        for (int value :
                arrayList) {
            if (value < minValue)
                minValue = value;
            else if (value == minValue)
                counterMinValue++;
        }

        System.out.println("Original array : " + arrayList);
        for (int i = 0; i < counterMinValue; i++) {
            System.out.print(minValue);
            if (i == counterMinValue - 1) System.out.print(".");
            else System.out.print(", ");
        }
    }
}
