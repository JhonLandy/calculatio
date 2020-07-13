import java.util.Arrays;

public class Shell {
    //希尔排序
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); 
        int lsit[] = {122, 12, 41, 6, 5, 7, 8, 9, 45, 345};
        int N  = lsit.length;
        int h = 1;
        while(h < N/3) h = 3*h + 1;
        System.err.println(h);
        while(h >= 1) {
            for (int i = h;i < N;i++) {
                for (int j = i;j >= h && lsit[j] < lsit[j-h];j -= h) {
                    int temp = lsit[j];
                    lsit[j] = lsit[j-h];
                    lsit[j-h] = temp;
                }
            }
            h = h/3;
        }
        long endTime = System.currentTimeMillis();
        System.err.println(Arrays.toString(lsit));
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
    }
}