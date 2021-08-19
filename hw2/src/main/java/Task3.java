import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int deposit = -1; // money is kept accurate to   thousandths of a UAH
        float percentagePerYear = -1;
        int amountOfYears = -1;
        int accruedInterest;

        while (deposit <= 0) {
            System.out.print("Enter the amount of money you are going to deposit: ");
            deposit = (int)(in.nextDouble() * 1000);
        }

        while (percentagePerYear <=0){
            System.out.print("Enter percentage per year: ");
            percentagePerYear = in.nextFloat() /100;
        }

        while (amountOfYears <=0){
            System.out.print("Enter amount of years: ");
            amountOfYears = in.nextInt();
        }
        System.out.println(String.format("Year: 0\tdeposit: %.2f\taccrued interest: %.2f percents per year", (float)(deposit) /1000, percentagePerYear));
        for (int i = 1; i <= amountOfYears; i++) {
            accruedInterest = (int) (deposit * percentagePerYear);
            deposit += accruedInterest;
            System.out.println(String.format("Year: %d\tdeposit: %.2f\taccrued interest: %.2f",i, (float)(deposit) /1000, (float)(accruedInterest)/1000));
        }
    }

}
