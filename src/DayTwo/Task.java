package DayTwo;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //TASK 1 - regular print
        /* System.out.println("Hello World!");

        // TASK 2 - arithmetic operations
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        // TASK 3 - odd or even number
        System.out.print("Enter one number: ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Your number is even");
        }
        else {
            System.out.println("Your number is odd");
        } */

        // TASK 4 - greatest number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        if (a>b && a>c) {
            System.out.println("The greatest number is " + a);
        }
        else if (b>a && b>c) {
            System.out.println("The greatest number is " + b);
        }
        else {
            System.out.println("The greatest number is " + c);
        }


    }
}
