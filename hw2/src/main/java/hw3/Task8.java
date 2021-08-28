package hw3;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        int i = 1;
        while (oddNumbers.size() != 10) {
            if (i % 2 == 1) oddNumbers.add(i);
            i++;
        }
        for (i = 0; i < oddNumbers.size(); i++) {
            System.out.print(oddNumbers.get(i));
            if (i == oddNumbers.size() - 1) System.out.print(".");
            else System.out.print(", ");
        }
    }
}

