import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class TwpSum {//线性级别的查找
    
    public static int search(List<Integer> value) {
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (Integer temp : value) {
            map.put(Math.abs(temp), true);
        }
        return value.size() - map.size();
    }

    public static void main(String[] args) {
        Integer lsits[] = { 1, 2, 4, 6, -4, -6, -2, 9 };
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(lsits));
        System.err.println(search(list));
    }
}