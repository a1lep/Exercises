package swDayThree;

import java.util.Scanner;

public class exercisesSwitch {
    public static void main(String[] args) {
        example();
        daysOfWeek();
        operation();
        grades();
        daysOfMonths();
        forSeasons();
    }

    private static void example() {
        // Example - switch
        int number = 5;

        switch (number) {
            case 1:
                System.out.println("First number is 1");
                break;

            case 2:
                System.out.println("Second number is 2");
                break;

            case 3:
                System.out.println("Third number is 3");
                break;

            case 4:
                System.out.println("Fourth number is 4");
                break;
            case 5:
                System.out.println("Fifth number is 5");
                break;

            default:
                System.out.println("Invalid number");
                break;
        }
    }

    private static void daysOfWeek() {
        // Exercise 1 - Switch statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7");
        int insertedNumber = sc.nextInt();

        switch (insertedNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

    private static void operation() {
        // Exercise 2 - Calculator
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = sc1.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = sc1.nextInt();
        System.out.println("Choose the operator (*, /, +, -,)");
        String operator = sc1.next();

        switch (operator) {
            case "*":
                System.out.println(firstNumber + " x " + secondNumber + " = " + firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber + " : " + secondNumber + " = " + firstNumber / secondNumber);
                break;
            case "+":
                System.out.println(firstNumber + " + " + secondNumber + " = " + firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;

        }
    }

    private static void grades() {
        // Exercise 3 - Grade Description
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade(A to F): ");
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good'");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            case 'E':
                System.out.println("Fail");
                break;
        }
    }

    private static void daysOfMonths() {
        // Exercise 4 - Month Days
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of the month (1-12): ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January has 31 days");
                break;
            case 2:
                System.out.println("February has 29 days");
                break;
            case 3:
                System.out.println("March has 31 days");
                break;
            case 4:
                System.out.println("April has 30 days");
                break;
            case 5:
                System.out.println("May has 31 days");
                break;
            case 6:
                System.out.println("June has 30 days");
                break;
            case 7:
                System.out.println("July has 31 days");
                break;
            case 8:
                System.out.println("August has 31 days");
                break;
            case 9:
                System.out.println("September has 30 days");
                break;
            case 10:
                System.out.println("October has 31 days");
                break;
            case 11:
                System.out.println("November has 30 days");
                break;
            case 12:
                System.out.println("December has 31 days");
                break;
        }
    }

    private static void forSeasons() {
        //Exercise 5 - Season Finder
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your month's number(1-12): ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
        }
    }

}
