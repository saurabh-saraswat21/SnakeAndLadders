package GameElements;

public class Player {
    private Number currentPosition;
    private boolean isLock;

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
