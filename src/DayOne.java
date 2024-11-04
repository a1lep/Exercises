public class DayOne {
    public static void main(String[] args) {


        // Task 1 - if,else if, else
         int a = -1;
         int b = -3;

        if ((b > a) && (a > 0)) {
            System.out.println("b is bigger than a, and a is positive");
        }

        else if ((a > b) && (b > 0)) {
            System.out.println("a is bigger than b, and b is positive");
        }

        else if ((a == b) || (b < 0) && (a < 0)) {
            System.out.println("a and b are either equal or both are negative");
        }

        else {
            System.out.println("No specific conditions were met");
        }

         /* if (b > a) {
            System.out.println("b is bigger than a");
        }
        else if (a > b) {
            System.out.println("a is bigger than b");
        }

         else {
             System.out.println("a and b are equal");
         }
             */
    }

}