package GameElements;

import java.util.ArrayList;

public class Board {
    private static  ArrayList<Number> board = new ArrayList<>();
    private static  void LoadBoard()
    {
        Number n1 = new Number();
        for (int i =1 ; i <= 100; i++) {
            n1.setValue(i);
            board.add(n1);
        }
    }

}
