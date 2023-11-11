package HomeWork;

import java.util.Scanner;

public class MathOperatorsHome {
    public static void main(String[] args) {
        max();
        pow();
        age();
    }
    public static void max() {
        Scanner addition = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = addition.nextInt();
        System.out.println("Enter the second number:");
        int num2 = addition.nextInt();
        int maxNum = (num1 > num2) ? num1 : num2;
        System.out.println("Greater number is: " + maxNum);
//        System.out.println("The bigger number is: " + Math.max(num1, num2));
    }
    public static void pow() {
        Scanner addition = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = addition.nextInt();
        System.out.println("Enter the degree to which you want to raise this number:");
        int b = addition.nextInt();
        int powValue = (int) ((a > b) ? Math.pow(a, b): Math.pow(a, b));
        System.out.println("The bigger number is: " + powValue);
//        System.out.println("The bigger number is: " + (int) Math.pow(value, valuePow));
    }
    public static void age() {
        Scanner addition = new Scanner(System.in);
        System.out.println("Enter the year of your birth: ");
        int yearOfBirth = addition.nextInt();
        System.out.println("Enter the current year: ");
        int currentYear = addition.nextInt();
        int age = (currentYear > yearOfBirth) ? (currentYear - yearOfBirth) : (currentYear - yearOfBirth);
        System.out.println("Your approximately age is: " + age);
//        System.out.println("Your approximately age is: " + Math.subtractExact(currentYear, yearOfBirth));
    }
}
