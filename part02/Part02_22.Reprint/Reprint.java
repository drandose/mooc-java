import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int times = Integer.parseInt(scanner.nextLine());

        int i = 0;
        while (i < times) {
            printText();
            i++;
        }
    }

    public static void printText() {

        System.out.println("In a hole in the ground there lived a method");
    }
}
