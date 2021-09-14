package hw6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DepositCalculatorToRefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада в банк в гривнах: ");
        BigDecimal sum = BigDecimal.valueOf(sc.nextDouble());
        System.out.print("Какой процент годовых? ");
        BigDecimal percent = BigDecimal.valueOf(sc.nextDouble());
        System.out.print("Длительность вклада (лет): ");
        int term = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= term; i++) {
            BigDecimal y = sum.divide(BigDecimal.valueOf(100)).multiply(percent).setScale(2, RoundingMode.HALF_UP) ;
            sum = sum.add(y);

            System.out.printf("Накопленная сумма за %d %s составила: %s грн%n", i, getYear(i), sum);
            System.out.printf("Начисленные проценты в грн: %s%n", y);
            if (i < term)
                System.out.println();
        }
    }

    private static String getYear(int i){
        int lastNumber = i % 10;
        String year;
        boolean isExclusion = (i % 100 >= 11) && (i % 100 <= 14);
        if (lastNumber == 0 || lastNumber >= 5)
            year = "лет";
        else if (isExclusion)
            year = "лет";
        else if (lastNumber == 1)
            year = "год";
        else
            year = "года";
        return year;
    }
}