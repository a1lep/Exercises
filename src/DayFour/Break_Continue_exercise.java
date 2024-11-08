package DayFour;

public class Break_Continue_exercise {
    public static void main(String[] args) {

        firstEvenNumber();

        oddAndSkipFive();

        multiplesOfThreeSkipSix();

        theSumUntilNegative();

        firstNumberGreaterThanFifty();
    }

    private static void multiplesOfThreeSkipSix() {
        //Exercise 3 - Print Multiples of 3 up to 30, skip Multiples of 6
        for (int a = 1; a <= 30; a++) {
            if (a % 3 == 0) {
                if (a % 6 == 0) {
                    continue;
                }

                System.out.println(a);

            }
        }
    }

    private static void oddAndSkipFive() {
        //Exercise 2 - Print Odd Numbers from 1 to 20, Skip Multiples of 5
        for (int num = 1; num <= 20; num = num + 2) {
            if (num % 5 == 0) {
                continue;
            }
            System.out.println(num);
        }
    }

    private static void firstEvenNumber() {
        // Exercise 1 - Find the First Even Number in a List
        int[] numbers = {1, 3, 7, 4, 9, 10};

        for (int number : numbers) {
            if (number % 2 == 0) {

                System.out.println("First even number is " + number);
                break;

            }
        }
    }

    private static void theSumUntilNegative() {
        //Exercise 4 - Print the Sum of Non-Negative Numbers Until a Negative Number is Found
        int[] numbers = {5, 12, 3, 7, -4, 8, 2};
        int sum = 0;
        for (int number : numbers) {
            if (number < 0) {
                break;
            }

            sum += number;

        }
        System.out.println("The sum of non-negative numbers: " + sum);

    }

    private static void firstNumberGreaterThanFifty() {
        //Find the First Number that is Greater Than 50
        int[] numbers = {23, 45, 39, 51, 48, 60};
        for (int number : numbers) {
            if (number > 50) {
                System.out.println("First number greater than 50: " + number);
                break;
            }
        }
    }


}
