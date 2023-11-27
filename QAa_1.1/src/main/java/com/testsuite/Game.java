package Nataliia_Buchna_HW.travel_HW_11;

import java.util.Scanner;


public class Game {
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String RESET = "\033[0m";

    public static final String WHITE_BRIGHT = "\033[0;97m";
    public static final String GREEN_BOLD = "\033[1;32m";

    public static final String YELLOW_UNDERLINED = "\033[4;33m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game!!!\n");

        while (true) {
            System.out.println(WHITE_BRIGHT + "Do you want to travel? " + "Enter " + GREEN_BOLD + "\"yes\"" + RESET + " or " + RED_BOLD + "\"no\"" + RESET);
            String agreement = scanner.nextLine();

            if (isNotValidAnswer(agreement)) {
                System.err.println("Incorrect symbol\n");
                System.out.println();

            } else {
                break;
            }
        }

        Location[] locations = new Location[]{new Location("START"), new Location("WOOD"), new Location("CAVE"), new Location("RIVER"), new Location("END")};
        int step = 0;
        boolean playGame = true;
        while (playGame) {

            System.out.println("Now you are at the " + BLUE_BOLD + locations[step] + RESET + "\n");
            System.out.println("What do you want to do further? \n");
            System.out.println("Press 1  to go to other location");
            System.out.println("Press 2  to go back");
            System.out.println("Press 3  to finish the game");
            String toDo = scanner.nextLine();
            if (isNotValidNumber(String.valueOf(toDo))) {
                System.err.println("Incorrect symbol\n");
                continue;
            }
            switch (toDo) {
                case "1":
                    if (step == 4) {

                        System.out.println("You " + RED_BOLD + "can not" + RESET + " go further it is the LAST point of your trip\n");
                    } else {
                        System.out.println("You change your location!\n");
                        step++;
                    }
                    break;
                case "2":
                    if (step == 0) {

                        System.out.println("You " + RED_BOLD + "can not" + RESET + " go further it is the FIRST point of your trip\n");
                    } else {
                        System.out.println("You change your location!\n");
                        step--;
                    }
                    break;
                case "3":
                    System.out.println(YELLOW_UNDERLINED + "Game is over!! See you soon" + RESET);
                    playGame = false;
                    break;
            }
        }
    }

    private static boolean isNotValidNumber(String userInput) {
        String[] validNumbers = {"1", "2", "3"};
        return isContain(userInput, validNumbers);
    }

    private static boolean isContain(String userInput, String[] validNumbers) {
        for (String validNum : validNumbers) {
            if (validNum.equals(userInput)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNotValidAnswer(String userInput) {
        String[] validAnswers = {"yes", "no"};
        return isContain(userInput, validAnswers);
    }

}
