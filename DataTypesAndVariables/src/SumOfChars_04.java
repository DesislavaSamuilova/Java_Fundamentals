import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfLines = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= numbersOfLines ; i++) {
            String letters = scanner.nextLine();
            int ascii = letters.charAt(0);
            sum+=ascii;
        }

        System.out.printf("The sum equals: %d", sum);

    }
}
