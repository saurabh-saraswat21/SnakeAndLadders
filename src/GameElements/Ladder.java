package GameElements;

public class Ladder {
    private Number top;
    private Number down;

    public Ladder(Number top, Number down) {
        this.top = top;
        this.down = down;
    }

    public Number getTop() {
        return top;
    }

    public void setTop(Number top) {
        this.top = top;
    }

    public Number getDown() {
        return down;
    }

    public void setDown(Number down) {
        this.down = down;
    }

    public Player riseLadder(Player p1) {
        p1.setCurrentPosition(this.getTop());
        return p1;
    }

}
