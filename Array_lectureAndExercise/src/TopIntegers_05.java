import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            boolean isTopInteger = true;
            int currentInteger = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentInteger <= numbers[j]) {
                    isTopInteger = false;
                }
            }
            if (isTopInteger) {
                System.out.print(currentInteger + " ");
            }
        }

    }
}
