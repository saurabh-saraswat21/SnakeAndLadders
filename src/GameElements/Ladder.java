package GameElements;

public class Ladder {
    private Number head;
    private Number tail;
    public void setHead(Number head) {
        this.head = head;
    }

    public void setTail(Number tail) {
        this.tail = tail;
    }

    public Number getHead() {
        return head;
    }

    public Number getTail() {
        return tail;
    }
    public Player riseLadder(Player p1)
    {
        p1.setCurrentPosition(this.getHead());
        return p1;
    }

}
