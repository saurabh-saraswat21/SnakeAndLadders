package GameElements;

import java.util.ArrayList;

public class Board {
    private static final ArrayList<Number> board = new ArrayList<>();

    public static ArrayList<Number> getBoard() {
        return board;
    }

    private static void loadBoard() {

        for (int i = 1; i <= 100; i++) {
            board.add(new Number(i, false, false));

        }
    }

    private static void loadSnakes() {
        int[][] snakeArr = {{10, 8}, {35, 13}, {56, 18}, {42, 21}, {65, 46}, {93, 47}, {89, 48}, {95, 64}, {98, 77}, {80, 62}};
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                if (board.get(i).compare(snakeArr[j][0], board.get(i)) == 0) {

                    board.get(i).setSnake(true);
                    board.get(i).setLadder(false);
                    Number head = board.get(snakeArr[j][0]);
                    Number tail = board.get(snakeArr[j][1]);
                    board.get(i).setSnake(new Snake(head, tail));

                }
            }
        }

    }

    private static void loadLadders() {
        int[][] LadderArr = {{3, 25}, {7, 50}, {27, 45}, {38, 59}, {43, 79}, {51, 67}, {63, 86}, {68, 92}, {70, 91}, {83, 97}};
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                if (board.get(i).compare(LadderArr[j][0], board.get(i)) == 0) {
                    board.get(i).setSnake(false);
                    board.get(i).setLadder(true);
                    Number head = board.get(LadderArr[j][0]);
                    Number tail = board.get(LadderArr[j][1]);
                    board.get(i).setLadder(new Ladder(head, tail));
                }
            }
        }
    }


}


