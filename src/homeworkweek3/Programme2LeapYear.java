package homeworkweek3;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Programme2LeapYear {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Input the year: ");
        int year = obj.nextInt();
        obj.close();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + "is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
