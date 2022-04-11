import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> givenMessage = new LinkedHashMap<>();

        String regexMessage = "[\\!]([A-Z][a-z]{3,})[\\!]:(\\[)([a-zA-Z]{8,})(\\])";
        // "\!([A-Z][a-z]{2,})\!\:\[([a-zA-z]{8,})\]"

        Pattern pattern = Pattern.compile(regexMessage);

        for (int i = 0; i < number; i++) {
            String token = scanner.nextLine();
            Matcher matcher = pattern.matcher(token);

            if (matcher.find()) {
                String givenCommand = matcher.group(1);
                String message = (matcher.group(3));
                System.out.print(givenCommand + ": ");

                StringBuilder givenSB = new StringBuilder();
                char[] letters = message.toCharArray();
                for (char ch : letters) {
                    givenSB.append((int) ch + " ");
                }

                givenMessage.put(givenCommand, new ArrayList<>());
                if (givenMessage.containsKey(givenCommand)) {
                    givenMessage.get(givenSB.toString());
                    System.out.print(givenSB);
                    System.out.println();
                }
            }else{
                System.out.println("The message is invalid");
            }
        }
    }
}



