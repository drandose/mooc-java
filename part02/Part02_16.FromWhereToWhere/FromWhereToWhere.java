import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int limit = Integer.parseInt(scanner.nextLine());

        System.out.print("Where from? ");
        int start = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= limit; i++) {
            System.out.println(i);
        }
    }
}
