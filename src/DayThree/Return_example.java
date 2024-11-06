package DayThree;

public class Return_example {
    public static void main(String[] args) {
        int id = 1;
        getUser(id);
    }
    private static void getUser(int id) {
        getUserName(id);
        getUserAge(id);
    }
    private static String getUserName(int id) {
        System.out.println("Name");
        String userName = "John Doe";
        return userName;
    }
    private static int getUserAge(int id) {
        System.out.println("Age");
        int age = 30;
        return age;
    }
}
