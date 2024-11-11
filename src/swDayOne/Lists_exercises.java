package swDayOne;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lists_exercises {
    public static void main(String[] args) {

        // Exercise 1 - Find Unique Words from a Sentence

    /* Scanner userSentence = new Scanner(System.in);
    System.out.println("Write a sentence: "); // asking for a sentence w Scanner
    String input = userSentence.nextLine();

    Set<String> sentence = new HashSet<>(); // rakendan HashSeti
    String [] words = input.split("\\s+"); // spliting the input

        for (String word : words) { // for tsüklist üksikute sõnade välja toomine
            sentence.add(word);
        }
    System.out.println(sentence); // print out

        // Exercise 2 - Remove All Vowels from a Set of Characters (alphabet)
        Set<Character> alphabet = new HashSet<>();
        for (char b = 'a'; b <= 'z'; b++) {
            alphabet.add(b);
            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
            alphabet.removeAll(vowels);
        }
        System.out.println(alphabet); */

        // Exercise 3 - Guess the Number between 1 and 50
        Scanner guess = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 50: ");

        int rightNumber = 49; // õige number
        int maxAttemps = 5; // maksimum korrad

        for (int attempt = 1; attempt <= maxAttemps; attempt++) {

            int number = guess.nextInt(); // number is the user's answer - needs to be inside loop

            if (number != rightNumber) {
                System.out.println("Try again!");
            }
            else {
                System.out.println("Correct guess!");
                break;
            }
        }

    }
}
