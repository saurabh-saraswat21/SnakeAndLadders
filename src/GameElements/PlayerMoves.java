package GameElements;

public class PlayerMoves {
    private void move(Player player, int number) {
        Number n1 = Board.getBoard().get(number - 1);
        player.setCurrentPosition(n1);
    }

    private boolean checkSnake(Player p1) {
        return p1.getCurrentPosition().isSnake();
    }


}
