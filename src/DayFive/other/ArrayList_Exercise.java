package DayFive.other;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Exercise {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        } // Viga oli <= ei saa võtta 3 numbrit, läheb lõhki
    }
}
