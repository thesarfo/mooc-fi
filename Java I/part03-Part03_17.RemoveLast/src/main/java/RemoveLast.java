
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> tests = new ArrayList<>();
        tests.add("hello");
        tests.add("world");

        removeLast(tests);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        String lastValue = strings.get(strings.size() - 1);

        strings.remove(lastValue);
    }

}
