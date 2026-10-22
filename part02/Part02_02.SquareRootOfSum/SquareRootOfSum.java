import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int sum = firstNumber + secondNumber;
        double squareRootOfSum = Math.sqrt(sum);

        System.out.println(squareRootOfSum);
    }
}
