package Lesson_6;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String correctPassword = "Pass";
        System.out.println("Enter the password: ");
        String enterPass = scan.next();

        if (enterPass.equals(correctPassword)){
            System.out.println("Correct password");
        }else {
            System.out.println("Wrong password");
        }
    }
}
