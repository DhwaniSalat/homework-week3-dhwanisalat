package homeworkweek3;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Programme13WeekContains {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Input Number: ");
        int day = obj.nextInt();
        obj.close();

        System.out.println(getDayName(day));
    }
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday";
                                break;
            case 2: dayName = "Tuesday";
                                break;
            case 3: dayName = "Wednesday";
                                break;
            case 4: dayName = "Thursday";
                                break;
            case 5: dayName = "Friday";
                                break;
            case 6: dayName = "Saturday";
                                break;
            case 7: dayName = "Sunday";
                                break;
            default:dayName = "Invalid day in range";
        }

        return dayName;
    }


}
