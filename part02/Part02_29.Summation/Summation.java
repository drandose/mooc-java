public class Summation {

    public static void main(String[] args) {

        int result = sum(4, 3, 6, 1);
        System.out.println("Sum: " + result);
    }

    public static int sum(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {

        int result = firstNumber + secondNumber + thirdNumber + fourthNumber;
        return result;
    }
}
