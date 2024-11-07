package DayFour;

import java.util.Arrays;

public class Array_ex {
    public static void main(String[] args) {

        //Exercise 1 - Declare and initialize an Array
        int [] myArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(myArray));

        //Exercise 2 - Access Specific Elements
        int [] myArray2 = {10,20,30,40,50};
        System.out.println("Third element: " + myArray2[2]);

        //Exercise 3 - Modify an Element
        int [] myArray3 = {5,10,15,20};
        myArray3 [1] = myArray3[1] + 2;
        // see keerulisem, võib ka: myArray3 [1] = 12

        System.out.println("Modified array: " + Arrays.toString(myArray3));

        //Exercise 4 - Array Length Property
        int[] myArray4 = new int[]{8,6,7,5,0,9};
        int length = myArray4.length;

        System.out.println("Array length:" + length);

        //Exercise 5 - Sum of Elements (wo Loop)
        int[] myArray5 = {4,2,8,1,6};
        int sum = myArray5[0] + myArray5[1] + myArray5[2] + myArray5[3] + myArray5[4];
        System.out.println("Sum of elements:" + sum);





    }
}
