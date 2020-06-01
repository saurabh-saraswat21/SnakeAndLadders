package GameElements;

public class PlayerMoves {
    public boolean checkWin(Player p1) {
        return p1.getCurrentPosition().getValue() == 100;
    }

    public int move(Player p1, int number) {
        int response = 0;
        this.justMove(p1, number);
        boolean ladder = this.checkLadder(p1);
        if (!ladder) {
            if (this.checkSnake(p1))
                response = -1;
        } else
            response = 1;
        return response;
    }

    private void riseLadder(Player p1) {
        Ladder ladder = p1.getCurrentPosition().getLadder();
        p1.setCurrentPosition(ladder.getHead());
    }

    private void byteSnake(Player p1) {
        Snake snake = p1.getCurrentPosition().getSnake();
        p1.setCurrentPosition(snake.getTail());
    }

    private void justMove(Player player, int number) {
        Number n1 = Board.getBoard().get(number - 1);
        player.setCurrentPosition(n1);
    }

    private boolean checkSnake(Player p1) {
        return p1.getCurrentPosition().isSnake();
    }

    private boolean checkLadder(Player p1) {
        return p1.getCurrentPosition().isLadder();
    }


}
