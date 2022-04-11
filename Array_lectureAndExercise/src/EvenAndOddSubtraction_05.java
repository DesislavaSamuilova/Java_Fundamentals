import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                oddSum += numbers[i];
            } else {
                evenSum += numbers[i];
            }
        }
        int difference = evenSum - oddSum;
        System.out.println(difference);
    }
}
