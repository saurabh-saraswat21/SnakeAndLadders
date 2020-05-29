package GameElements;

import java.util.ArrayList;

public class Board {
    private static final ArrayList<Number> board = new ArrayList<>();

    private static void loadBoard() {

        for (int i = 1; i <= 100; i++) {
            board.add(new Number(i));

        }
    }

    private static void LoadSnakes() {
        int[][] snakeArr = {{10, 8}, {35, 13}, {56, 18}, {42, 21}, {65, 46}, {93, 47}, {89, 48}, {95, 64}, {98, 77}, {80, 62}};
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                if (board.get(i).compare(snakeArr[j][0], board.get(i)) == 0) {

                    board.get(i).setSnake(true);
                    Number head = board.get(snakeArr[j][0]);
                    Number tail = board.get(snakeArr[j][1]);
                    board.get(i).setSnake(new Snake(head, tail));

                }
            }
        }

    }

}
