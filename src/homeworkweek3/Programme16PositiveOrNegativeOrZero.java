package homeworkweek3;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or "ZERO"
 */

public class Programme16PositiveOrNegativeOrZero {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = obj.nextInt();
        obj.close();

        if (num >0){
            System.out.println(num + " is a positive number");
        } else if (num < 0) {
            System.out.println(num + " is a negative number");
        } else if (num == 0) {
            System.out.println(num + " is a zero number");
        } else {
            System.out.println("invalid number");
        }
    }
}
