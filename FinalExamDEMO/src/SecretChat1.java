import java.util.Scanner;

public class SecretChat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Reveal")) {
            String[] tokens = command.split(":\\|:");
            String commandName = tokens[0];
            switch (commandName) {
                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index <= message.length() - 1) {
                        StringBuilder inserter = new StringBuilder();
                        inserter.append(message);
                        String toInsert = " ";
                        inserter.insert(index, toInsert);
                        message = inserter.toString();
                        System.out.println(message);

                    }
                    break;
                case "Reverse":
                    String substring = tokens[1];
                    if (message.contains(substring)) {
                        message = message.replace(substring, "");
                        String reverse = "";
                        for (int i = substring.length() - 1; i >= 0; i--) {
                            reverse = reverse + substring.charAt(i);
                        }
                        message = message + reverse;
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substringChange = tokens[1];
                    String replacement = tokens[2];
                    if (message.contains(substringChange)) {
                        int indexChange = message.indexOf(substringChange);
                        while (indexChange >= 0) {
                            message = message.replace(substringChange, replacement);
                            indexChange = message.indexOf(substringChange.charAt(0));
                        }
                    }
                    System.out.println(message);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", message);
    }
}
