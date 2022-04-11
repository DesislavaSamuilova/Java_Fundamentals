import java.util.Scanner;

public class DemoExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfOrders = Integer.parseInt(scanner.nextLine());
        double orderPrice = 0;
        double totalSum = 0;
        for (int i = 0; i < countOfOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            if (countOfOrders == 1) {
                orderPrice = ((days * capsulesCount) * pricePerCapsule);
                totalSum = orderPrice;
                System.out.printf("The price for the coffee is: $%.2f.%n", orderPrice);
                System.out.printf("Total: $%.2f", totalSum);
            } else {
                orderPrice = ((days * capsulesCount) * pricePerCapsule);
                System.out.printf("The price for the coffee is: $%.2f.%n", orderPrice);
                totalSum += orderPrice;
            }
        }
        System.out.printf("Total: $%.2f", totalSum);
    }
}


