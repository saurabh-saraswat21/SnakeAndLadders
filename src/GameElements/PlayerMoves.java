package GameElements;

public class PlayerMoves {
    public static boolean checkWin(Player p1) {
        return p1.getCurrentPosition().getValue() == 100;
    }

    private static int moveAndCheck(Player p1, int number) {
        int response = 0;
        justMove(p1, number);
        boolean ladder = checkLadder(p1);
        if (!ladder) {
            if (checkSnake(p1))
                response = -1;
        } else
            response = 1;
        return response;
    }

    private static void riseLadder(Player p1) {
        Ladder ladder = p1.getCurrentPosition().getLadder();
        p1.setCurrentPosition(ladder.getHead());
    }

    private static void byteSnake(Player p1) {
        Snake snake = p1.getCurrentPosition().getSnake();
        p1.setCurrentPosition(snake.getTail());
    }

    private static void justMove(Player player, int number) {
        Number n1 = Board.getBoard().get(number - 1);
        player.setCurrentPosition(n1);
    }

    private static boolean checkSnake(Player p1) {
        return p1.getCurrentPosition().isSnake();
    }

    private static boolean checkLadder(Player p1) {
        return p1.getCurrentPosition().isLadder();
    }


}
