import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        int firstNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");

        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");

        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sumOfThreeNumbers = firstNumber + secondNumber + thirdNumber;

        System.out.println("The sum of the numbers is " + sumOfThreeNumbers);
    }
}
