package TryAndCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        int tries = 1;
        while (!validInput && tries <= 3) {
            System.out.println("Enter a number: ");
            try {
                int insertedNumber = sc.nextInt();
                double result = 100 / insertedNumber;
                System.out.println("Result is: " + result);
                validInput = true;

            } catch (Exception e) {
                System.out.println("Invalid input.");
                sc.nextLine();

            }
            tries++;
        }
        if (!validInput) {
            System.out.println("Maximum attemps reached.");
        }
    }
}

