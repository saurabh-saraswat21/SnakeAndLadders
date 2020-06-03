package Game;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            String a = scanner.nextLine();
            try {
                return Integer.parseInt(a);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }
    }
}
