package homeworkweek3;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class Programme11PrintTheNumbers {
    public static void divisibleByThreeAndFive() {
        System.out.println("Divisible by 3\t Divisible by 5");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("\t" + i);
            }
            if (i % 5 == 0) {
                System.out.println("\t\t\t\t\t\t" + i);
            }
        }
    }

    public static void main(String[] args) {
        divisibleByThreeAndFive();
    }
}



