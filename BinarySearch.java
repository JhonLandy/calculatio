import java.util.Arrays;

class BinarySearch {
    //二分查找，数组必须有序
    public static Integer rank(int key, int[] a) {
        Arrays.sort(a);
        System.out.println(a);
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (key > a[mid]) start = mid + 1;
            else if (key < a[mid]) end = mid - 1;
            else return mid;
        }
        return null;
    }
    public static void main(String[] args) {
        int lsit[] = {1, 2, 4, 6, 5, 7, 8, 9};
        Integer index = rank(5, lsit);
        if (index == null) {
            System.out.println("抱歉找不到");
        } else  {
            System.out.println(index);
        }
    }
}