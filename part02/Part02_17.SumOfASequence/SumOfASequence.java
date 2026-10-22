import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.print("Last number? ");
        int lastNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
