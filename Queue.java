
public class Queue<Item>{ 
    private Node frist;
    private Node last;
    private int N;

    public class Node {
        Item item;
        Node next; 
        
    }
    
    public void enqueue(Item item) {
        Node oldlast = last;
        Node temp = new Node();
        temp.item = item;
        temp.next = null;
        last = temp;
        if (isEmpty()) {
            frist = last;
        } else {
            oldlast.next = last;
        }
        N++;
    }

    public boolean isEmpty() {
        return frist == null;
    }

    public Item dequeue() {
        Item value = frist.item;
        frist = frist.next;
        N--;
        return value;
    }

    public static void main(String[] args) {
        String arr[] = {"张三","李四"};
        Queue<String> queue = new Queue<String>();
        for (String item: arr) {
            queue.enqueue(item);
            System.err.println(item);
        }
    }
}