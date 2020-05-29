package GameElements;

public class Number {
    private int value;
    private boolean isLadder;
    private boolean isSnake;
    private Ladder ladder;
    private Snake snake;

    public Number(int value, boolean isLadder, boolean isSnake) {
        this.value = value;
        this.isLadder = isLadder;
        this.isSnake = isSnake;
    }

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

    public int compare(int integer, Number number) {
        return Integer.compare(number.getValue(), integer);
    }

    @Override
    public String toString() {
        return String.valueOf(this.getValue()) + " ";
    }

}
