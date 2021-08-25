package hw3;

public class task1 {
    public static void main(String[] args) {
        //1-st version
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }

        //2-nd version
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }
}
