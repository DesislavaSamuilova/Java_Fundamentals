import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        result(type, quantity);
    }

    private static void result(String type, int quantity) {
        double result = 0.0;
        switch (type)
        {
            case "coffee":
                result = quantity * 1.50;
                break;
            case "water":
                result = quantity * 1.00;
                break;
            case "coke":
               result = quantity * 1.40;
               break;
            case "snacks":
               result = quantity * 2.00;
                break;
            default:
                break;
        }
        System.out.printf("%.2f",result);
    }
}
