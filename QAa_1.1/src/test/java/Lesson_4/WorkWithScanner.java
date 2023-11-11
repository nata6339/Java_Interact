package Lesson_4;

import java.util.Scanner;

public class WorkWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть ціле число: ");
//        int num = scanner.nextInt();
//        System.out.println("Ви ввели число: " + num);

//        System.out.println("Введіть текст: ");
//        String text = scanner.nextLine();
//        System.out.println("Ви ввели: " + text);

//        System.out.println("Введіть ім'я та прізвище: ");
//        StringBuilder input = new StringBuilder();
//        String line;
//        while(!(line = scanner.nextLine()).isEmpty()){
//            input.append(line).append("\n");
//        }
//        System.out.println("Ви ввели: " + input);

        System.out.println("Введіть слово: ");
        String word = scanner.next();
        System.out.println("Ви ввели: " + word);

        System.out.println("Введіть число з плаваючою точкою: ");
        double val = scanner.nextDouble();
        System.out.println("Ви ввели: " + val);
    }
}
