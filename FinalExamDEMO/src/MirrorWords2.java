import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(@|#)(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> words = new ArrayList<>();
        int count = 0;

        while (matcher.find()) {
            count++;
            StringBuilder first = new StringBuilder(String.valueOf(matcher.group("first"))).reverse();
            if (String.valueOf(first).equals(matcher.group("second"))) {
                words.add(String.format("%s <=> %s", matcher.group("first"), matcher.group("second")));
            }
        }

        if(count == 0){
            System.out.println("No word pairs found!");
        }else {
            System.out.printf("%d word pairs found!%n", count);
        }
        if(words.isEmpty()){
            System.out.println("No mirror words!");
        }else{
            System.out.printf("The mirror words are:%n%s", String.join(", ", words));
        }
    }
}
