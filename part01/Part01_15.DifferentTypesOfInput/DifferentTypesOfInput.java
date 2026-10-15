import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");

        String string = scanner.nextLine();

        System.out.println("Give an integer:");

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Give a double:");

        double numberDecimal = Double.parseDouble(scanner.nextLine());

        System.out.println("Give a boolean:");

        boolean value = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + numberDecimal);
        System.out.println("You gave the boolean " + value);
    }
}
