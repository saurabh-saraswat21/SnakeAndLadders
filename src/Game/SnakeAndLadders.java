package Game;

import GameElements.Board;
import GameElements.Dice;
import GameElements.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class SnakeAndLadders {
    private static Dice dice;

    private static void oneRound(ArrayList<Player> players) {

        for (Player p1 : players) {
            int number = dice.rollDice() + p1.getCurrentPosition().getValue();
            Player.move(p1, number);
        }

    }

    private static ArrayList<Player> getPlayers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Players:-");
        int noOfPlayers = sc.nextInt();
        String name;
        Player player;
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < noOfPlayers; i++) {
            System.out.println("Enter" + (i + 1) + "Player Name");
            name = sc.next();
            player = new Player(Board.getBoard().get(0), true, name);
            players.add(player);
        }
        sc.close();
        return players;
    }

}
