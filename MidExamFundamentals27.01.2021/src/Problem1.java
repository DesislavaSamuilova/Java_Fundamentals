import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biscuitPerDay = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        int biscuitsForMonth = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= 30; i++) {
            int biscuit = biscuitPerDay * countOfWorkers;
            if (i % 3 == 0) {
                sum += Math.floor(0.75 * biscuit);
                continue;
            }
            sum += biscuit;
        }
        System.out.printf("You have produced %d biscuits for the past month.%n", sum);
        if (sum > biscuitsForMonth) {
            double diffMore = sum - biscuitsForMonth;
            double moreBiscuits = diffMore / biscuitsForMonth * 100;
            System.out.printf("You produce %.2f percent more biscuits.", moreBiscuits);
        } else {
            double diffLess = biscuitsForMonth - sum;
            double lessBiscuits = diffLess / biscuitsForMonth * 100;
            System.out.printf("You produce %.2f percent less biscuits.", lessBiscuits);
        }
    }
}