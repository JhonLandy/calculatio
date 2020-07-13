import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomQueue<T> {
    private List<T> arr = new ArrayList<T>();
    private Random random = new Random();
    
    public Boolean isEempty() {
        return arr.size() == 0;
    }

    public void enqueue(T item) {
        arr.add(item);
    }

    public T dequeue() {
        if (arr.size() == 1) return arr.remove(0);
        int randomIndex = random.nextInt(arr.size() - 1);
        int lastIndex = arr.size()-1;
        T randomItem = arr.get(randomIndex); 
        T lastItem = arr.get(lastIndex);
        arr.set(randomIndex, lastItem);
        arr.set(lastIndex, randomItem);
        return arr.remove(0);
    }

    public T sample() {
        int index = random.nextInt(arr.size() - 1);
        return arr.get(index);
    }

    public List<T> value() {
        return  arr;
    }

    
    public static void main(String[] args) {//发牌
        RandomQueue<String> queue = new RandomQueue<String>();
        String[] spades = {"spades1", "spades2", "spades3", "spades4", "spades5", "spades6", "spades7", "spades8", "spades9", "spades10", "spadesJ", "spadesQ", "spadesK"};
        String[] heart =  {"spades1", "spades2", "spades3", "spades4", "spades5", "spades6", "spades7", "spades8", "spades9", "spades10", "spadesJ", "spadesQ", "spadesK"};
        String[] clubs =  {"clubs1", "clubs2", "clubs3", "clubs4", "clubs5", "clubs6", "clubs7", "clubs8", "clubs9", "clubs10", "clubsJ", "clubsQ", "clubsK"};
        String[] diamonds = {"diamonds1", "diamonds2", "diamonds3", "diamonds4", "diamonds5", "diamonds6", "diamonds7", "diamonds8", "diamonds9", "diamonds10", "diamondsJ", "diamondsQ", "diamondsK"};
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(spades));
        list.addAll(Arrays.asList(heart));
        list.addAll(Arrays.asList(clubs));
        list.addAll(Arrays.asList(diamonds));
        for (String card: list) {
            queue.enqueue(card);
        }
        int size = queue.value().size();
        List<String> temp = new ArrayList<String>();
        int num = 0;
        while(size > 0) {
            temp.add(queue.dequeue());
            num++;
            if ((num) % 13 == 0) {//发牌
                System.err.println(num);
                System.err.println(temp);
                temp.clear();
            }
            size = queue.value().size();
        }
        
    }

}