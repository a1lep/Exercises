package DayFive.other;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExerciseTwo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }


       for (int i = numbers.size(); i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }

        System.out.println("List after removing even numbers: " + numbers);
    }
}
