package hw3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sizeArray = -1;
        int maxValue;

        Scanner scanner = new Scanner(System.in);
        while (sizeArray < 1) {
            System.out.print("Enter array's size: ");
            sizeArray = scanner.nextInt();
        }
        //array's initialization
        for (int i = 0; i < sizeArray; i++) {
            arrayList.add((int) (Math.random() * 100));
        }

        maxValue = arrayList.get(0);

        //finding minimal value and it's amount
        for (int value :
                arrayList) {
            if (value > maxValue)
                maxValue = value;
        }

        System.out.println("Original array : " + arrayList);
        System.out.println("Max value: " + maxValue);
    }
}
