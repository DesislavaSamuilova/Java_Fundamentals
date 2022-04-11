import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Matcher matcher = Pattern.compile("([=/])([A-Z][A-Za-z]{2,})\\1").matcher(input);

        List<String> destinations = new ArrayList<>();
        int points = 0;
        while (matcher.find()) {
            destinations.add(matcher.group(2));
            points+= matcher.group(2).length();
        }
        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println("Travel Points: " + points);
    }
}



