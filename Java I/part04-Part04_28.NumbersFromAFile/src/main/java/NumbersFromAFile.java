
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> list = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                list.add(Integer.valueOf(reader.nextLine()));
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        int sum = 0;
        for (Integer integer : list) {
            if (integer >= lowerBound && integer <= upperBound) {
                sum++;
            }
        }
        System.out.printf("Numbers: %s", sum);

        scanner.close();

    }

}
