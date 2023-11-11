package HomeWork;

import java.util.Scanner;

public class NewScanner {
    public static void main(String[] args) {
        summary();
        squareRoot();
        average();
    }

    public static void summary() {
        Scanner addition = new Scanner(System.in);
        System.out.println( "Enter the first number:");
        int num1 = addition.nextInt();
//        System.out.println("The first  number is: " + num1);
        System.out.println("Enter the second number:");
        int num2 = addition.nextInt();
//        System.out.println("The second number is: " + num2);
        System.out.println("The sum of this two numbers is: " + (num1 + num2));
    }

    public static void squareRoot() {
        Scanner addition = new Scanner(System.in);
        System.out.println( "Enter the number:");
        int num3 = addition.nextInt();
        System.out.println("The square root of number " + num3 + " = " + Math.sqrt(num3));
    }

    public static void average() {
        Scanner addition = new Scanner(System.in);
        System.out.println( "Enter the fourth number:");
        int num4 = addition.nextInt();
        System.out.println( "Enter the last number:");
        int num5 = addition.nextInt();
        double resultOfAverage = ((double) (num4 + num5) /2);
        System.out.println("The average of " + num4 + " and " + num5 + " is " + resultOfAverage);

    }


}
