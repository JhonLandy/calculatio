import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBag<Item> {
    private List<Item> arr = new ArrayList<Item>();
    private Random random = new Random();
    
    public Boolean isEmpty() {
        return arr.size() == 0;
    }

    public void add(Item item) {
        arr.add(item);
        if (arr.size() == 1) return;
        
        int size = arr.size();
        int index = random.nextInt(size - 1);
        
        if (index == size - 1) return;//替换的位置是数组最后一个时，直接退出

        for (int i = size - 1;i > index;i--) {
            Item temp = arr.get(i-1);
            arr.set(i, temp);
        }
        arr.set(index, item);
    }

    public int size() {
        return arr.size();
    }

    public List<Item> value() {
        return arr;
    }
    
    public static void main(String[] args) {
        RandomBag<String> str = new RandomBag<String>();
        str.add("1");
        str.add("2");
        str.add("3");
        str.add("4");
        str.add("5");
        str.add("6");
        System.out.println(str.value());
    }
}