import java.util.Scanner;

public class TriplesofLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (char i = 0; i < n; i++) {
            char firstChar = (char) ('a' + i);
            for (char j = 0; j < n; j++) {
                char secondChar = (char) ('a' + j);
                for (char k = 0; k < n; k++) {
                    char thirdChar = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}
