package hw3;

public class Task6 {
    public static void main(String[] args) {
        // this is arithmetic progression. So, we need a1 and d
        int a0 = 0, d = -5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(a0 + d * (i - 1));
        }
    }
}
