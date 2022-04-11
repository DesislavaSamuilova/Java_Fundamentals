import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double currentPrice = 0;
        double priceDiscount = 0;
        double taxes = 0;
        double totalPrice = 0;

        while (!command.equals("special") && !command.equals("regular")) {
            double price = Double.parseDouble(command);
            if (price < 0) {
                System.out.printf("Invalid price!%n");
            } else {
                currentPrice += price;
            }
            command = scanner.nextLine();
        }
        if (command.equals("special")) {
            taxes = currentPrice * 0.2;
            priceDiscount = taxes + currentPrice;
            totalPrice = priceDiscount - (priceDiscount * 0.1);
            if (totalPrice == 0) {
                System.out.printf("Invalid order!");
            } else {
                System.out.printf("Congratulations you've just bought a new computer!%n");
                System.out.printf("Price without taxes: %.2f$%n", currentPrice);
                System.out.printf("Taxes: %.2f$%n", taxes);
                System.out.printf("-----------%n");
                System.out.printf("Total price: %.2f$", totalPrice);
            }
        } else if (command.equals("regular")) {
            taxes = currentPrice * 0.2;
            totalPrice = taxes + currentPrice;
            if (totalPrice == 0) {
                System.out.printf("Invalid order!");
            } else {
                System.out.printf("Congratulations you've just bought a new computer!%n");
                System.out.printf("Price without taxes: %.2f$%n", currentPrice);
                System.out.printf("Taxes: %.2f$%n", taxes);
                System.out.printf("-----------%n");
                System.out.printf("Total price: %.2f$", totalPrice);
            }
        }

    }
}
