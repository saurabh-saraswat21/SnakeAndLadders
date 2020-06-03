package Game;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static int takeOneDigitIntInput() {
        while (true) {
            String a = scanner.nextLine();
            try {
                int re = Integer.parseInt(a);
                if (re < 10 && re > 0) {
                    return Integer.parseInt(a);
                } else
                    System.out.println("Invalid input");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }

    public static int inputNoOfPlayers() {
        while (true) {
            String a = scanner.nextLine();
            try {
                int players = Integer.parseInt(a);
                if (players <= 5 && players > 1)
                    return players;
                else if (players <= 1)
                    System.out.println("please enter a value more than 1");
                else
                    System.out.println("No of players cannot be more than 5");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }

    public static String inputName() {
        while (true) {
            String name = scanner.nextLine();
            if (name.trim().equals("")) {
                System.out.println("Name cannot be empty");
            } else {
                return name;
            }

        }
    }

}
