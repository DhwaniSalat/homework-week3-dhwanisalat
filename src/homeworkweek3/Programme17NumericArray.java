package homeworkweek3;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Programme17NumericArray {
    public static void main(String[] args) {

        //declare numeric array
        int num[] = { 99, 21, 45, 75, 56};
        System.out.println("Numeric Array before sorting: " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Numeric Arrays after sorting: " + Arrays.toString(num));

        //declare String arrays
        String fruitsName[] = {"Grapes","Apple","Kiwi","Orange","Blueberry"};
        System.out.println("Numeric Array before sorting: " + Arrays.toString(fruitsName));
        Arrays.sort(fruitsName);
        System.out.println("Numeric Array after sorting: " + Arrays.toString(fruitsName));
    }
}
