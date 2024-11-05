package DayTwo;

public class StringExercises {
    public static void main(String[] args) {

        String original = "hello world";
        //Exercise 1
        System.out.println(original.toUpperCase());
        // Exercise 2
        System.out.println(original.toLowerCase());
        // Exercise 3
        System.out.println(original.contains("world"));
        // Exercise 4
        System.out.println(original.charAt(0));
        // Exercise 5
        System.out.println(original.replace('o', 'a'));
        //Exercise 6
        String hello = "Hello, world!";
        System.out.println(hello.startsWith("Hello"));
        System.out.println(hello.endsWith("world!"));
        //Exercise 7
        System.out.println(hello.substring(7,12));
        //Exercise 8
        String name = "abracadabra";
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.indexOf('a'));
        //Exercise 9
        String java = "Java is fun";
        System.out.println(java.replace("fun", "awesome"));
    }
}
