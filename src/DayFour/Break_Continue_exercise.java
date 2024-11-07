package DayFour;

public class Break_Continue_exercise {
    public static void main(String[] args) {

        // Exercise 1 - Find the First Even Number in a List
        int [] numbers = {1,3,7,4,9,10};

        for (int number : numbers ) {
            if (number % 2 == 0){

            System.out.println("First even number is " + number);
                break;

            }
        }

        //Exercise 2 - Print Odd Numbers from 1 to 20, Skip Multiples of 5
        for (int num = 1; num <=20; num = num + 2) {
            if (num % 5 == 0){
                continue;
            }
            System.out.println(num);
        }

        //Exercise 3 - Print Multiples of 3 up to 30, skip Multiples of 6
        for (int a = 1; a <=30; a++) {
            if (a % 3 == 0){
                if (a % 6 == 0){
                    continue;
                }

            System.out.println(a);

            }
        }
    }
}
