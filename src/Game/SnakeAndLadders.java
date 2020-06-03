package Game;

import GameElements.Board;
import GameElements.Dice;
import GameElements.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class SnakeAndLadders {
    private static final Dice dice = new Dice();

    public void startGame() {
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
        Scanner sc = new Scanner(System.in);
        int response;
        for (Player p1 : players) {
            System.out.println(p1.getName() + "'s Turn");
            System.out.println("Press 1 to roll dice");
            response = sc.nextInt();
            if (response == 1) {
                int number = dice.rollDice() + p1.getCurrentPosition().getValue();
                Player.move(p1, number);
                if (Player.checkWin(p1)) return false;
            }
        }
        return true;

    }

    private Player getWinner(ArrayList<Player> players) {
        for (Player p1 : players) {
            if (Player.checkWin(p1))
                return p1;
        }
        return null;
    }

    private static ArrayList<Player> getPlayers() {
        Scanner sc = new Scanner(System.in);
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
