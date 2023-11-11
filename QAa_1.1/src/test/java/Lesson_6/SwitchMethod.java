package Lesson_6;

import java.util.Scanner;

public class SwitchMethod {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Today is: ");
//        int day = scan.nextInt();
//
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            default:
//                System.out.println("Another day");
//        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the day (1 - 7): ");
        int day = scan.nextInt();

        if (day > 7){
            System.out.println("Day do not exist");
            System.exit(1);
        }

        System.out.println("Enter the number of your meal of today (1-3)");
        int meal = scan.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                switch (meal) {
                    case 1:
                        System.out.println("Breakfast");
                        break;
                    case 2:
                        System.out.println("Lunch");
                        break;
                    case 3:
                        System.out.println("Dinner");
                        break;
                    default:
                        System.out.println("Do not identified");
                }
//                System.out.println("Day do not exist");
//                break;

            case 2:
                System.out.println("Tuesday");
                switch (meal) {
                    case 1:
                        System.out.println("Breakfast");
                        break;
                    case 2:
                        System.out.println("Lunch");
                        break;
                    case 3:
                        System.out.println("Dinner");
                        break;
                    default:
                        System.out.println("Do not identified");
                }
                break;

            case 3:
                System.out.println("Wednesday");
                switch (meal) {
                    case 1:
                        System.out.println("Breakfast");
                        break;
                    case 2:
                        System.out.println("Lunch");
                        break;
                    case 3:
                        System.out.println("Dinner");
                        break;
                    default:
                        System.out.println("Do not identified");
                }
                break;

            case 4:
                System.out.println("Thursday");
                switch (meal) {
                    case 1:
                        System.out.println("Breakfast");
                        break;
                    case 2:
                        System.out.println("Lunch");
                        break;
                    case 3:
                        System.out.println("Dinner");
                        break;
                    default:
                        System.out.println("Do not identified");
                }
                break;

            case 5:
                System.out.println("Friday");
                switch (meal) {
                    case 1:
                        System.out.println("Breakfast");
                        break;
                    case 2:
                        System.out.println("Lunch");
                        break;
                    case 3:
                        System.out.println("Dinner");
                        break;
                    default:
                        System.out.println("Do not identified");
                }
                break;

            case 6:
                System.out.println("Saturday");
                switch (meal) {
                    case 1:
                        System.out.println("Breakfast");
                        break;
                    case 2:
                        System.out.println("Lunch");
                        break;
                    case 3:
                        System.out.println("Dinner");
                        break;
                    default:
                        System.out.println("Do not identified");
                }
                break;

            case 7:
                System.out.println("Sunday");
                switch (meal) {
                    case 1:
                        System.out.println("Breakfast");
                        break;
                    case 2:
                        System.out.println("Lunch");
                        break;
                    case 3:
                        System.out.println("Dinner");
                        break;
                    default:
                        System.out.println("Do not identified");
                }
                break;
        }


    }
}
