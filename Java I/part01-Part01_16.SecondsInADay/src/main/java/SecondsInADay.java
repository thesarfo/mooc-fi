
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int mySeconds = Integer.valueOf(scanner.nextLine());

        int calcSeconds = mySeconds * 86400;

        System.out.println(calcSeconds);

    
        scanner.close();

    }
}
