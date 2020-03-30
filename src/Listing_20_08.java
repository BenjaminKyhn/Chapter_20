import java.util.Arrays;
import java.util.List;

public class Listing_20_08 {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Atlanta", "Savannah", "New York", "Dallas");
        cities.sort((s1, s2) -> s1.compareToIgnoreCase(s2)); // The lambda expression creates a new comparator object which is equivalent to creating an anonymous inner class
        // or simply use the method reference: cities.sort(String::compareToIgnoreCase);

        for (String s :
                cities) {
            System.out.print(s + " ");
        }
    }
}
