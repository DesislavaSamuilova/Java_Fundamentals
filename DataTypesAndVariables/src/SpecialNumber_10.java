import java.util.Scanner;

public class SpecialNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int num = 1; num <= n; num++) {
            int sum = 0;
            int digit = num;
            while (digit > 0) {
                sum += digit % 10;
                digit = (int) digit / 10;

            }
            if(sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True%n", num);
            } else {
                System.out.printf("%d -> False%n", num);
            }
        }
    }
}

