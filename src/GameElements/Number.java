package GameElements;
public class Number {
    private int value;
    private boolean isLadder;
    private boolean isSnake;
    private Ladder ladder;
    private Snake snake;

    public Ladder getLadder() {
        return ladder;
    }

    public void setLadder(Ladder ladder) {
        this.ladder = ladder;
    }

    public void setLadder(boolean ladder) {

        isLadder = ladder;
    }

    public Snake getSnake() {
        return snake;
    }

    public int getValue() {
        return value;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setSnake(boolean snake) {
        isSnake = snake;
    }

    public boolean isLadder() {
        return isLadder;
    }

    public boolean isSnake() {
        return isSnake;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
