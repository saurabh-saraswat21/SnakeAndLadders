package GameElements;

public class Snake {
    private Number head ;
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
    public Player biteSnake(Player p1)
    {
        p1.setCurrentPosition(this.getTail());
        return p1;
    }
}
