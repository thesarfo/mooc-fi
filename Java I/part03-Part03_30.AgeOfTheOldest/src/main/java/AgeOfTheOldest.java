
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        String input = scanner.nextLine();

        while (!input.equals("")) {
            String[] parts = input.split(",");
            for (String part : parts) {
                int age = Integer.valueOf(parts[1]);
                if (age > oldest) {
                    oldest = age;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
