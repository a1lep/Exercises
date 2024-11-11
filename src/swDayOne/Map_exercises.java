package swDayOne;

import java.util.HashMap;
import java.util.Map;

public class Map_exercises {
    public static void main(String[] args) {
        example();

        positions();

        grades();

        salaries();


    }

    private static void salaries() {
        // Exercise 3 - Remove a Key-Value Pair
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("Jan", 2000);
        salaries.put("Ester", 2500);
        salaries.put("Mary", 3000);
        salaries.put("Jack", 2500);

        System.out.println("Original salaries:" + salaries);

        String employeeToRemove = "Mary";
        salaries.remove(employeeToRemove);

        for (String name : salaries.keySet()) {
            System.out.println(name + "' s salary is " + salaries.get(name));
        }

    }

    private static void grades() {
        // Exercise 2 - Store and Retrieve Student Grades
        Map<String, Integer> grades = new HashMap<>();
        grades.put("John", 5);
        grades.put("Jane", 4);
        grades.put("Jack", 3);
        grades.put("Jackson", 5);

        System.out.println("John's grade is " + grades.get("John"));
        System.out.println("Jane's grade is " + grades.get("Jane"));
        System.out.println("Jack's grade is " + grades.get("Jack"));
        System.out.println("Jackson's grade is " + grades.get("Jackson"));
    }

    private static void positions() {
        // Exercise 1 - Add User to Map - name + position, 2 Users
        Map<String, String> positions = new HashMap<>();
        positions.put("John", "teacher");
        positions.put("Jane", "accountant");

        for (String name : positions.keySet()) {
            System.out.println(name + " is " + positions.get(name) + ".");
        }
    }

    private static void example() {
        // EXAMPLE
        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 20);
        ages.put("Jane", 25);
        ages.put("Mary", 30);

        for (String name : ages.keySet()) {
            System.out.println(name + " is " + ages.get(name) + " years old.");
        }
    }
}
