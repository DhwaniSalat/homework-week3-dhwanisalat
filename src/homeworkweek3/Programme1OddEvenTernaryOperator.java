package homeworkweek3;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme1OddEvenTernaryOperator {

    //calculate even and odd number
    public void calEvenOdd(int num){
        String evenOdd =(num % 2 == 0)? " even number" : "odd number";
        System.out.println(num+ " is " +evenOdd);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();
        scn.close();

        Programme1OddEvenTernaryOperator obj = new Programme1OddEvenTernaryOperator();
        obj.calEvenOdd(num);
    }

}
