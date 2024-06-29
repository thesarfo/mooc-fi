
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> texts = new ArrayList<>();

        while (true) {
            String text = scanner.nextLine();

            int sum = 0;
            texts.add(text);
            for (String txt : texts) {
                sum += 1;
            }

            if (text.equals("end")) {
                System.out.println(sum - 1);
                break;
            }

        }
        scanner.close();

    }
}
