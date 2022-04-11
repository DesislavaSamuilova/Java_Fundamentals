import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int capacityOfTank = 255;
        int sum = 0;
        for (int i = 1; i <= numberOfLines; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());
            if (sum + quantities <= capacityOfTank) {
                sum += quantities;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
            System.out.println(sum);
        }
    }

