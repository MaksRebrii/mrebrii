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
        String year;

        for (int i = 1; i <= term; i++) {
            BigDecimal y = sum.divide(BigDecimal.valueOf(100)).multiply(percent) ;
            sum = sum.add(y);
            switch (i){
                case 1:
                    year = "год";
                    break;
                case 2:
                case 3:
                case 4:
                    year = "года";
                    break;
                default:
                    year = "лет";
                    break;

            }
            System.out.printf("Накопленная сумма за %d %s составила: %s грн%n", i, year, sum.setScale(2, RoundingMode.HALF_UP));
            System.out.printf("Начисленные проценты в грн: %s%n%n", y.setScale(2, RoundingMode.HALF_UP));
        }
    }
}