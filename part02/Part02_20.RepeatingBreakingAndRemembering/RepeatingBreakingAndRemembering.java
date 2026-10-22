import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }

            sum += number;
            count += 1;
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
