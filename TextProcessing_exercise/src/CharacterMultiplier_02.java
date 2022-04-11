import java.io.Console;
import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] char1 = scanner.next().toCharArray();
        char[] char2 = scanner.next().toCharArray();
        long totalSum = 0;
        for (int i = 0; i < Math.min(char1.length, char2.length); i++) {
            int sum = char1[i] * char2[i];
            totalSum += sum;
        }
        if (char1.length > char2.length) {
            for (int i = char2.length; i < char1.length; i++) {
                totalSum += char1[i];
            }
        } else if (char1.length < char2.length) {
            for (int i = char1.length; i < char2.length; i++) {
                totalSum += char2[i];
            }
        }
        System.out.println(totalSum);
    }
}