public class StarSign {

    public static void main(String[] args) {

        System.out.println("---");
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("---");
        printSquare(4);
        System.out.println("---");
        printRectangle(17, 3);
        System.out.println("---");
        printTriangle(4);
    }

    public static void printStars(int number) {

        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }

        System.out.println();
    }

    public static void printSquare(int size) {

        for (int i = 1; i <= size; i++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {

        for (int i = 1; i <= height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {

        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
