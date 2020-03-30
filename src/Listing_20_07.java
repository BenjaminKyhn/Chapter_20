import java.util.Arrays;
import java.util.Comparator;

public class Listing_20_07 {
    public static void main(String[] args) {
        String[] cities = {"Atlanta", "Savannah", "New York", "Dallas"};
        Arrays.sort(cities, new MyComparator());

        for (String s : cities) {
            System.out.print(s + " ");
        }
    }

    public static class MyComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
    }
}
