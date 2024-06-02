
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(56);
        System.out.println(sum(numbers));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }

}
