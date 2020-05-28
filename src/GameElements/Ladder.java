package GameElements;

public class Ladder {
    private Number Head ;
    private Number Tail;
    public void setHead(Number head) {
        Head = head;
    }

    public void setTail(Number tail) {
        Tail = tail;
    }

    public Number getHead() {
        return Head;
    }

    public Number getTail() {
        return Tail;
    }
    public Player riseLadder(Player p1)
    {
        p1.setCurrentPosition(this.getHead());
        return p1;
    }

}
