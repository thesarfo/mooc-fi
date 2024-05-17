
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        int addResult = firstNumber + secondNumber;
        int subResult = firstNumber - secondNumber;
        int mulResult = firstNumber * secondNumber;
        double divResult = (double) firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + addResult);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subResult);
        System.out.println(firstNumber + " * " + secondNumber + " = " + mulResult);
        System.out.println(firstNumber + " / " + secondNumber + " = " + divResult);

    }
}
