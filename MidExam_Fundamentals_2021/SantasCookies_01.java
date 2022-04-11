import java.util.Scanner;

public class SantasCookies_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.nextLine());

        int singleCookie = 25;
        int cup = 140;
        int smallSpoon = 10;
        int bigSpoon = 20;
        int cookiesPerBox = 5;

        int sum = 0;
        int end = 0;

        for (int i = 0; i < amount; i++) {
            int flour = Integer.parseInt(scanner.nextLine());
            int sugar = Integer.parseInt(scanner.nextLine());
            int cocoa = Integer.parseInt(scanner.nextLine());
            int flourCups = flour / cup;
            int sugarCups = sugar / bigSpoon;
            int cocoaSpoons = cocoa / smallSpoon;
            int total = Math.min(flourCups, sugarCups);
            if (flourCups <= 0 || sugarCups <= 0 || cocoaSpoons <= 0) {
                System.out.printf("Ingredients are not enough for a box of cookies.%n");
                continue;
            }
            sum = ((cup + smallSpoon + bigSpoon) * Math.min(total, cocoaSpoons)) / singleCookie;
            int boxesPerBatch = sum / cookiesPerBox;
            end += boxesPerBatch;
            System.out.printf("Boxes of cookies: %d%n", boxesPerBatch);
        }
        System.out.printf("Total boxes: %d", end);
    }
}

