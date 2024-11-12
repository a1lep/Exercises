package DayTwo;

public class StringExercises {
    public static void main(String[] args) {


        String original = "hello world";
        //Exercise 1 - läbivad suured tähed
        System.out.println(original.toUpperCase());
        // Exercise 2 - läbivad väiksed tähed
        System.out.println(original.toLowerCase());
        // Exercise 3 - kas sisaldab
        System.out.println(original.contains("world"));
        // Exercise 4 -esimene täht
        System.out.println(original.charAt(0));
        // Exercise 5 - asendamine
        System.out.println(original.replace('o', 'a'));
        //Exercise 6 - algus ja lõpp sõna
        String hello = "Hello, world!";
        System.out.println(hello.startsWith("Hello"));
        System.out.println(hello.endsWith("world!"));
        //Exercise 7 - vahemik
        System.out.println(hello.substring(7,12));
        //Exercise 8 - tähe esimene ja viimane occurence
        String name = "abracadabra";
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.indexOf('a'));

        //Exercise 9 - asendus (sõna)
       String java = "Java is fun";
       String lastWord = "fun";
       String lastWordNew = "awesome";
       System.out.println(java.replace(lastWord, lastWordNew));
    }
}
