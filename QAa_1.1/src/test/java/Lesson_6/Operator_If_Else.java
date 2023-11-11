package Lesson_6;

import java.util.Scanner;

public class Operator_If_Else {
    public static void main(String[] args) {
        Scanner addition = new Scanner(System.in);
        System.out.println("Введіть свій вік: ");
        int num = addition.nextInt();
        if (num > 18){
            System.out.println("Ви можете голосувати");
        }
        else {
            System.out.println("Ви НЕ можете голосувати");
        }
    }
}
