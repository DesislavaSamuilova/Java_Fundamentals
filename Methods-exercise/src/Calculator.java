import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        orders(type, number1,number2);
    }

    private static void orders(String type, int number1, int number2) {
        switch (type)
        {
            case "add":
                add(number1,number2);
                break;
            case "multiply":
                multiply(number1,number2);
                break;
            case "subtract":
                subtract(number1,number2);
            case "divide":
                divide(number1, number2);
                break;
            default:
                break;

        }

}

    private static void divide(int number1, int number2) {
        System.out.println(number1/ number2);
    }

    private static void subtract(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    private static void multiply(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    private static void add(int number1, int number2) {
        System.out.println(number1+number2);
    }
}
