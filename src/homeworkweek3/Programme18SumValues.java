package homeworkweek3;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme18SumValues {
    static int num[] = { 10, 20, 30, 40};

    public static int sumOfArrayElements() {
        int sum = 0;
        int i;
        for (i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("sum of given array is " + sumOfArrayElements());
    }
}
