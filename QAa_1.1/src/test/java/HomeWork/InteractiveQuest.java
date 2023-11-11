package HomeWork;

import java.util.Objects;
import java.util.Scanner;

public class InteractiveQuest {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to the game! Press enter to START");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String e = "exit";

        while (!Objects.equals(a, e)) {
            System.out.println("Choose the door you want to open (1, 2 or 3) or write \'exit\' to close the game: ");
            a = scan.nextLine();
            switch (a) {
                case "1":
                    System.out.println("You opened the first door. Here was closed a hungry lion.");
                    break;
                case "2":
                    System.out.println("You opened the second door. Here was hidden 1 Million $.");
                    break;
                case "3":
                    System.out.println("You opened the third door. Here you can find another mysterious door.");
                    break;
                case "exit":
                    System.out.println("Game is over!!! See you.");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        scan.close();
    }
}
