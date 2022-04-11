import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        countVowels(text);
    }

    private static void countVowels(String text) {
        int count = 0;
        for (int index = 0; index < text.length(); index++) {
            char currentSymbol = text.charAt(index);
            switch (currentSymbol) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
}