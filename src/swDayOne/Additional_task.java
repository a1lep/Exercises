package swDayOne;

import java.util.Scanner;

public class Additional_task {
    public static void main(String[] args) {
        // Additional task - Compound Interest Calculator (liitintressi kalkulaator)
        // A = (principal + interest ; P = initial amount of money (amount)
        //  r = annual interest rate (0,05); n = number of times the interest is compounded
        // t = time (in years, months) (years)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount of money: ");
        int amount = sc.nextInt();
        System.out.println("Enter the time (in years): ");
        int years = sc.nextInt();

        double r = 0.05;
        double n = 2;


        System.out.println(amount * (Math.pow((1 + r / n), n * years)));
    }
}
