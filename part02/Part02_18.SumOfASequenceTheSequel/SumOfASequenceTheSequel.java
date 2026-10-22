import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.print("First number? ");
        int firstNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Last number? ");
        int lastNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= lastNumber; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
