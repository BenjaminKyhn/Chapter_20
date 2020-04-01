import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise_20_06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10000000; i++) {
            list.add(i);
        }

        long startTime = System.currentTimeMillis();
        System.out.println(list.get(999999));
        long endTime = System.currentTimeMillis();
        System.out.println("get(index) method took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        for (int i :
                list) {
            if (i == 10000000){
                System.out.println(i);
                endTime = System.currentTimeMillis();
                System.out.println("iterator method took " + (endTime - startTime) + " milliseconds");
            }
        }
    }
}
