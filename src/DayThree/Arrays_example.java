package DayThree;

import java.util.Arrays;

public class Arrays_example {
    public static void main(String[] args) {
        String[] carBrand ={"Tesla","Honda","Audi"};
        String[] carModel ={"Model S","Civic","A3"};

        carModel[0] ="Model 3";

        Arrays.sort(carBrand); // vaja importida array.
        System.out.println(Arrays.toString(carBrand)); // tähestikulises järjekorras

        carBrand[0] = "BMW";
        System.out.println(carBrand[0] + " " +carModel[0]);
    }
}
