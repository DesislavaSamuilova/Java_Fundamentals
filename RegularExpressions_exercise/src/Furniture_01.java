import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexName = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)";
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regexName);
        List<String> furnitures = new ArrayList<>();
        double totalMoney = 0;

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furnitures.add(furniture);
                totalMoney += price * quantity;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitures.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalMoney);
    }
}
