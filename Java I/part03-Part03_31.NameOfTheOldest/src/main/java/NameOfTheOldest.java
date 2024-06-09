
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";

        String input = scanner.nextLine();

        while (!input.equals("")) {
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            if (age > oldest) {
                oldest = age;
                name = parts[0];
            }
            input = scanner.nextLine();
        }
        System.out.println("Name of the oldest: " + name);

    }
}
