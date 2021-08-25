package hw3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sizeArray = -1;
        int maxValue, minValue, indexOfMax = 0, indexOfMin = 0;

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
        maxValue = arrayList.get(0);

        //finding minimal value and it's amount
        for (int value :
                arrayList) {
            if (value > maxValue) {
                maxValue = value;
                indexOfMax = arrayList.indexOf(maxValue);
            }
            if(value < minValue){
                minValue = value;
                indexOfMin = arrayList.indexOf(minValue);
            }
        }

        System.out.println("Original array : " + arrayList);
        arrayList.set(indexOfMax, minValue);
        arrayList.set(indexOfMin, maxValue);
        System.out.println("Changed array: " + arrayList);
    }
}
