package DayThree;

public class Method_exercise {
    public static void main(String[] args) {
        int length = 4;
        int width= 5;

        getArea(length, width);

    }
    public static void getArea(int length, int width){
      // arvutab ristküliku pindala
        int area = length * width;
        System.out.println("The area of the rectangle is " + area);

        checkArea(area);
    }

    private static void checkArea(int area){

        if (area>20){
            System.out.println("Area is bigger than 20");
        }
        else if (area<20){
            System.out.println("Area is smaller than 20");
        }


    }
}
