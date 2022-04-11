import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());
        result(num1, operator, num2);
    }

    private static void result(int num1, String operator, int num2) {
        double result = 0.0;
        if (operator.equals("/")) {
            result = num1 / num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        }
        System.out.printf("%.0f", result);
    }
}
