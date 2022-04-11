import java.util.Scanner;

public class JourneyToDisneyLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOfJourney = Double.parseDouble(scanner.nextLine());
        int numberOfMonths = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double bonus = 0;
        double percentage = priceOfJourney * 0.25;
        for (int i = 1; i <= numberOfMonths; i++) {
            bonus = sum * 0.25;
            if (i % 4 == 0) {
                sum += bonus;
            }
            if (i % 2 == 1 && i > 1) {
                sum -= sum * 0.16;
            }

            sum += percentage;
        }
        if (sum >= priceOfJourney) {
            double leftMoney = sum - priceOfJourney;
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", leftMoney);
        } else if (sum <= priceOfJourney) {
            double needMoney = priceOfJourney - sum;
            System.out.printf("Sorry. You need %.2flv. more.", needMoney);
        }
    }

}
