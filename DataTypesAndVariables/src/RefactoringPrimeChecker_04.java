import java.util.Scanner;

public class RefactoringPrimeChecker_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int work = Integer.parseInt(scanner.nextLine());
        for (int j = 2; j <= work; j++) {
            boolean isIt = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    isIt = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", j, isIt);
        }


    }
}
