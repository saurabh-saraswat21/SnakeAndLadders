package GameElements;

public class Player {
    private Number currentPosition;
    private boolean isLock;
    private String name;

    public Player(Number currentPosition, boolean isLock, String name) {
        this.currentPosition = currentPosition;
        this.isLock = isLock;
        this.name = name;
    }

    public boolean isLock() {
        return isLock;
    }

    public void setLock(boolean lock) {
        isLock = lock;
    }

    public Number getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Number currentPosition) {
        this.currentPosition = currentPosition;
    }

}
