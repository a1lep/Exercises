package DayFive.other;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExerciseTwo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }


       for (int i = numbers.size() -1; i >= 0; i--) { // -1 was missing, bc the row needs to start from the last nr. 0 is the first
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }

        System.out.println("List after removing even numbers: " + numbers);
    }
}
