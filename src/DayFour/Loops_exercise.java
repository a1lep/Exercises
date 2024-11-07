package DayFour;

public class Loops_exercise {
    public static void main(String[] args) {

        // Task - pane ülesanded eraldi meetodi gruppidesse ning kutsu välja main meetodist
        numberSequence();
        carBrand();
        sumOfNumbers();
        evenNumbers();
        multiplicationTable();


    }

    private static void numberSequence(){
        // Exercise 1 - print numbers 1 to 10 - for loop
         for (int count = 1; count <= 10; count++) {
             System.out.println("Number " + count);
         }
    }

    private static void carBrand(){
        // Exercise 2 - print out each car brand - foreach loop
        String [] cars = {"Ford", "Honda", "Audi" };
         for (String car : cars) {
             System.out.println("Car brand is: " + car);
         }
    }

    private static void sumOfNumbers(){
        // Exercise 3 - sum of numbers - while loop
        int number = 1;
        int sum = 0;
                while (number <= 100)  {
                    sum = sum + number;
                    number++;
                }
        System.out.println("Sum is:" + sum);
    }

    private static void evenNumbers(){
        // Exercise 4 - even numbers between 1 and 20 - for loop
        for (int i = 0; i <= 20; i+=2) {
            System.out.println("Even number: " + i);
        }
    }

    private static void multiplicationTable(){
        // Exercise 5 - multiplication table (7) - for loop
        int a = 7;
        for (int s = 1; s <= 10; s++) {
            System.out.println( a + " x " + s + " = " + (a*s));
        }
    }

}
