import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double totalPrice = 0;
        switch (typeOfGroup) {
            case "Students":
                switch (dayOfWeek) {
                    case "Friday":
                        totalPrice = groupOfPeople * 8.45;
                        break;
                    case "Saturday":
                        totalPrice = groupOfPeople * 9.80;
                        break;
                    case "Sunday":
                        totalPrice = groupOfPeople * 10.46;
                        break;
                }
                if (groupOfPeople >= 30) {
                    totalPrice *= 0.85;
                }
                break;
            case "Business":
                double currentPrice = 0;
                switch (dayOfWeek) {
                    case "Friday":
                        currentPrice = 10.90;
                        totalPrice = groupOfPeople * 10.90;
                        break;
                    case "Saturday":
                        currentPrice = 15.60;
                        totalPrice = groupOfPeople * 15.60;
                        break;
                    case "Sunday":
                        currentPrice = 16;
                        totalPrice = groupOfPeople * 16;
                        break;
                }
                if (groupOfPeople >= 100) {
                    totalPrice -= (currentPrice * 10);
                }
                break;
            case "Regular":
                switch (dayOfWeek) {
                    case "Friday":
                        totalPrice = groupOfPeople * 15;
                        break;
                    case "Saturday":
                        totalPrice = groupOfPeople * 20;
                        break;
                    case "Sunday":
                        totalPrice = groupOfPeople * 22.50;
                        break;
                }
                if (groupOfPeople >= 10 && groupOfPeople <= 20) {
                    totalPrice *= 0.95;
                }
                break;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
