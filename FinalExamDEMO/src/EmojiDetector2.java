import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String digitRegex = "\\d";
        String regex = "([::**])\\1(?<emoji>[A-Z][a-z]{2,})([::**])\\1";
        Pattern patternDigit = Pattern.compile(digitRegex);
        Pattern patternRegex = Pattern.compile(regex);
        String text = scanner.nextLine();

        int sum = 1;
        int coolThreshold = 0;
        List<String> emoji = new ArrayList<>();
        List<String> allEmoji = new ArrayList<>();

        Matcher matcher2 = patternDigit.matcher(text);
        while (matcher2.find()) {
            int diggit = Integer.parseInt(matcher2.group(0));
            sum = sum * diggit;
        }

        Matcher matcher = patternRegex.matcher(text);
        while (matcher.find()) {

            String name1 = matcher.group("emoji");

            int sumChar = 0;
            for (int i = 2; i < name1.length() - 2; i++) {
                char sign = name1.charAt(i);
                sumChar += (int) sign;
            }
            allEmoji.add(name1);

            if (sumChar > sum) {
                emoji.add(name1);
            }
        }


        System.out.printf("Cool threshold: %d%n", sum);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", allEmoji.size());
        for (String s : allEmoji) {
            System.out.println(s );
        }

    }
}
