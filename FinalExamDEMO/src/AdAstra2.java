import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Matcher matcher = Pattern.compile("([#|])(?<product>[A-Z][A-Z a-z]+)\\1(?<date>\\d{2}/\\d{2}/\\d{2})\\1(?<nutrition>\\d+)\\1")
                .matcher(input);
        List<String> allGoods = new ArrayList<>();

        int total = 0;
        while (matcher.find()) {
            allGoods.add(String.format("Item: %s, Best before: %s, Nutrition: %s",
                    matcher.group("product"), matcher.group("date"), matcher.group("nutrition")));
            total += Integer.parseInt(matcher.group("nutrition"));
        }
        int day = total / 2000;
        System.out.println("You have food to last you for: " + day + " days!");
        for (String s : allGoods) {
            System.out.println(s);
        }
    }
}