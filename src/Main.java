import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // COMPOUND INTEREST CALCULATOR
        double principal;
        double rate;
        int timesCompunded;
        int years;
        double amount;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount you invest: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times the amount must be compounded in a year: ");
        timesCompunded = scanner.nextInt();

        System.out.print("Enter the # of years you invest for: ");
        years = scanner.nextInt();

        scanner.close();

        amount = principal * Math.pow(1 + rate / timesCompunded, timesCompunded * years);

        System.out.printf("\nThe amount after %d years is $%.2f", years, amount);


    }
}
