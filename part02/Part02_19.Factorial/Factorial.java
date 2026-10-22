import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = 1;

        System.out.print("Give a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}
