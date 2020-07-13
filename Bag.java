import java.util.Iterator;

public class Bag<Item>{
    private Node frist;
    public class Node {
        Item item;
        Node next; 
        
    }
    public void add(Item item) {
        Node oldfrist = frist;
        Node frist = new Node();
        frist.item = item;
        frist.next = oldfrist;
    }

    public Iterable<Item> iterator() {
        return (Iterable<Item>) new Listener();
    }

    public class Listener implements Iterator<Item> {
        private Node current = frist;
        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}