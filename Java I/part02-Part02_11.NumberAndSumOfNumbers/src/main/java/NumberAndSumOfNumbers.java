
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNums = 0;
        int sum = 0;

        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if ( number == 0){
                System.out.println("Number of numbers: " + numOfNums);
                System.out.println("Sum of the numbers: " + sum);
                break;
                
            }

            if ( number != 0){
                numOfNums += 1;
                sum += number;
                continue;
            }
            
        }

    }
}
