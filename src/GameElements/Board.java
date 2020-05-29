package GameElements;

import java.util.ArrayList;

public class Board {
    private static final ArrayList<Number> board = new ArrayList<>();

    private static void loadBoard() {

        for (int i = 1; i <= 100; i++) {
            board.add(new Number(i));

        }
    }

}
