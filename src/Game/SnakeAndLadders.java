package Game;

import GameElements.Board;
import GameElements.Dice;
import GameElements.Player;

import java.util.ArrayList;

public class SnakeAndLadders {
    private static final Dice dice = new Dice();

    public static void startGame() {
        int response = displayMenu();
        responseAtMenu(response);
    }


    private static void start() {
        Board.loadGameBoard();
        ArrayList<Player> players = getPlayers();
        while (true) {
            boolean response = oneRound(players);
            if (!response) {
                Player winner = getWinner(players);
                assert winner != null;
                System.out.println(winner.getName() + "" + "WINS");
                return;

            }
        }
    }


    private static boolean oneRound(ArrayList<Player> players) {

        int response;

        for (Player p1 : players) {
            boolean ensureTurn = true;
            while (ensureTurn) {
                System.out.println(p1.getName() + "'s Turn");
                System.out.println("Press 1 to roll dice");
                response = Input.takeOneDigitIntInput();
                if (response == 1) {
                    int diceResult = dice.rollDice();
                    System.out.println("Number comes :- " + diceResult);
                    int number = diceResult + p1.getCurrentPosition().getValue();
                    Player.move(p1, number);
                    System.out.println(p1.getName() + "'s current position is " + p1.getCurrentPosition());
                    System.out.println("\n\n\n");
                    ensureTurn = false;
                    if (Player.checkWin(p1)) return false;
                }
            }
        }
        return true;

    }

    private static Player getWinner(ArrayList<Player> players) {
        for (Player p1 : players) {
            if (Player.checkWin(p1))
                return p1;
        }
        return null;
    }

    private static int displayMenu() {
        System.out.println("Welcome to Snake And Ladders");
        System.out.println("Press 1 to start game ");
        System.out.println("Press 2 for info");
        System.out.println("Press 0 to exit");
        return Input.takeOneDigitIntInput();
    }

    private static void responseAtMenu(int number) {
        if (number == 1) {
            start();
        } else if (number == 2) {
            System.out.println("Not done yet");
        } else if (number == 0) {
        } else {
            System.out.println("Invalid input");
        }
    }

    private static ArrayList<Player> getPlayers() {
        System.out.println("Enter The Number Of Players:-");
        int noOfPlayers = Input.inputNoOfPlayers();
        String name;
        Player player;
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < noOfPlayers; i++) {
            System.out.println("Enter" + (i + 1) + "Player Name");
            name = Input.inputName();
            player = new Player(Board.getBoard().get(0), true, name);
            players.add(player);
        }
        return players;
    }

}
