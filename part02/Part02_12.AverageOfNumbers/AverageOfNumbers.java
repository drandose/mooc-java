import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                break;
            }

            count += 1;
            sum += number;
        }

        double average = (double) sum / count;

        System.out.println("Average of the numbers: " + average);
    }
}
