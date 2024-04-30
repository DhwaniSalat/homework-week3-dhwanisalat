package homeworkweek3;
/**
 * Write a Java program to calculate the average value of array elements.
 */

public class Programme19CalculateAverageValue {
    public static void main(String[] args) {
        int num[] = {10, 20, 30};

        int sum = 0; //initialize sum

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        //calculate average value
        int avg = sum / num.length;
        System.out.println("Average value of the arrays elements is: " + avg);
    }
}
