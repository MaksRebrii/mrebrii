package hw3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sizeArray = -1;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while (sizeArray < 1) {
            System.out.print("Enter array's size: ");
            sizeArray = scanner.nextInt();
        }
        //array's initialization
        for (int i = 0; i < sizeArray; i++) {
            arrayList.add((int) (Math.random() * 100));
        }
        for (int val :
                arrayList) {
            sum += val;
        }
        System.out.println(arrayList);
        System.out.println(String.format("Average is  %.5f", (double) sum / arrayList.size()));
    }
}
