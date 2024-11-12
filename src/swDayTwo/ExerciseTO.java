package swDayTwo;

import java.util.Scanner;

public class ExerciseTO {
    public static void main(String[] args) {
        //Exercise 1 - Find the Maximum of Two Numbers
        int num1 = 10;
        int num2 = 20;

        int max =(num1 > num2) ? num1 : num2;
        System.out.println("The maximum number is " + max);

        //Exercise 2 - Check if a Person is Eligible to Vote
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        String result = (age <= 17) ? "Not eligible to vote" : "Eligible to vote";
        System.out.println(result);




    }
}
