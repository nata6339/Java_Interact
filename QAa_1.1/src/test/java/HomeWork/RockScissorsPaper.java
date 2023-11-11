package HomeWork;

import java.util.Scanner;

public class RockScissorsPaper {
    public static void main(String[] args) {
        System.out.println("Hey! Let's play the game. Press enter to START");

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        String exit = "exit";
        String rock = "rock";
        String scissors = "scissors";
        String paper = "paper";

        while (true) {
            System.out.println("Rock, scissors or paper? Or write \"exit\" to end the game.");
            userChoice = scanner.nextLine();
            if (isCorrect(userChoice, exit, rock, scissors, paper)) {
                System.out.println("error");
                continue;
            }
            int computerChoiceNumber = (int) (Math.random() * 3);
            if (userChoice.equals(exit)) {
                System.out.println("Game is over!!! See you.");
                break;
            }

            if (computerChoiceNumber == 0) {
                play(rock, userChoice, scissors, paper);
            } else if (computerChoiceNumber == 1) {
                play(scissors, userChoice, paper, rock);
            } else if (computerChoiceNumber == 2) {
                play(paper, userChoice, rock, scissors);
            }
        }
        scanner.close();
    }

    private static void play(String rock, String userChoice, String scissors, String paper) {
        System.out.println("Computer chose: " + rock);
        if (userChoice.equals(rock)) {
            System.out.println("Won a tie!");
        } else if (userChoice.equals(scissors)) {
            System.out.println("You lost!");
        } else if (userChoice.equals(paper)) {
            System.out.println("You win!");
        }
    }

    private static boolean isCorrect(String userChoice, String exit, String rock, String scissors, String paper) {
        return !userChoice.equals(exit) && !userChoice.equals(rock) && !userChoice.equals(scissors) && !userChoice.equals(paper);
    }
}
